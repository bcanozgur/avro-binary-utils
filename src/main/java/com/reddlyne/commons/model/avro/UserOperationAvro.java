/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.reddlyne.commons.model.avro;
@org.apache.avro.specific.AvroGenerated
public enum UserOperationAvro implements org.apache.avro.generic.GenericEnumSymbol<UserOperationAvro> {
  CREATE, UPDATE, DELETE, FREEZE, UNFREEZE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"UserOperationAvro\",\"namespace\":\"com.reddlyne.commons.model.avro\",\"symbols\":[\"CREATE\",\"UPDATE\",\"DELETE\",\"FREEZE\",\"UNFREEZE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}