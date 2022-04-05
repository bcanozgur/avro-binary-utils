/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.reddlyne.commons.serde.request;

import com.reddlyne.commons.serde.serialize.AvroSerializer;
import org.apache.avro.specific.SpecificRecordBase;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Collections;


@Component
public class BinaryRequestClient {

  private static final MediaType APPLICATION_AVRO_BINARY = new MediaType("application", "avro+binary", Charset.forName("UTF-8"));

  private final RestTemplate restTemplate;

  public BinaryRequestClient(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public <T extends SpecificRecordBase> ResponseEntity<byte[]> sendBinaryRequest(T data, HttpMethod method, String url) {

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Collections.singletonList(APPLICATION_AVRO_BINARY));
    headers.setContentType(APPLICATION_AVRO_BINARY);

    //PostChangeAvro postChangeAvro = MapperUtil.postChangePojoToAvro(data);

    byte[] serialize = new AvroSerializer<>(true).serialize(data);
    HttpEntity<byte[]> entity = new HttpEntity<>(serialize, headers);

    ResponseEntity<byte[]> exchange = restTemplate.exchange(url, method, entity, byte[].class);
    byte[] body = exchange.getBody();

    return new ResponseEntity<>(body, headers, HttpStatus.OK);
  }

}
