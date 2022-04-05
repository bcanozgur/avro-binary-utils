/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.reddlyne.commons.model.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PostReactionChangeAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -530370264334846005L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PostReactionChangeAvro\",\"namespace\":\"com.reddlyne.commons.model.avro\",\"fields\":[{\"name\":\"postID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"likeCount\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"dislikeCount\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"retweetCount\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"commentCount\",\"type\":[\"null\",\"long\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PostReactionChangeAvro> ENCODER =
      new BinaryMessageEncoder<PostReactionChangeAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PostReactionChangeAvro> DECODER =
      new BinaryMessageDecoder<PostReactionChangeAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PostReactionChangeAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PostReactionChangeAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PostReactionChangeAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PostReactionChangeAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PostReactionChangeAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PostReactionChangeAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PostReactionChangeAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PostReactionChangeAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String postID;
  private java.lang.Long likeCount;
  private java.lang.Long dislikeCount;
  private java.lang.Long retweetCount;
  private java.lang.Long commentCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PostReactionChangeAvro() {}

  /**
   * All-args constructor.
   * @param postID The new value for postID
   * @param likeCount The new value for likeCount
   * @param dislikeCount The new value for dislikeCount
   * @param retweetCount The new value for retweetCount
   * @param commentCount The new value for commentCount
   */
  public PostReactionChangeAvro(java.lang.String postID, java.lang.Long likeCount, java.lang.Long dislikeCount, java.lang.Long retweetCount, java.lang.Long commentCount) {
    this.postID = postID;
    this.likeCount = likeCount;
    this.dislikeCount = dislikeCount;
    this.retweetCount = retweetCount;
    this.commentCount = commentCount;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return postID;
    case 1: return likeCount;
    case 2: return dislikeCount;
    case 3: return retweetCount;
    case 4: return commentCount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: postID = value$ != null ? value$.toString() : null; break;
    case 1: likeCount = (java.lang.Long)value$; break;
    case 2: dislikeCount = (java.lang.Long)value$; break;
    case 3: retweetCount = (java.lang.Long)value$; break;
    case 4: commentCount = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'postID' field.
   * @return The value of the 'postID' field.
   */
  public java.lang.String getPostID() {
    return postID;
  }


  /**
   * Sets the value of the 'postID' field.
   * @param value the value to set.
   */
  public void setPostID(java.lang.String value) {
    this.postID = value;
  }

  /**
   * Gets the value of the 'likeCount' field.
   * @return The value of the 'likeCount' field.
   */
  public java.lang.Long getLikeCount() {
    return likeCount;
  }


  /**
   * Sets the value of the 'likeCount' field.
   * @param value the value to set.
   */
  public void setLikeCount(java.lang.Long value) {
    this.likeCount = value;
  }

  /**
   * Gets the value of the 'dislikeCount' field.
   * @return The value of the 'dislikeCount' field.
   */
  public java.lang.Long getDislikeCount() {
    return dislikeCount;
  }


  /**
   * Sets the value of the 'dislikeCount' field.
   * @param value the value to set.
   */
  public void setDislikeCount(java.lang.Long value) {
    this.dislikeCount = value;
  }

  /**
   * Gets the value of the 'retweetCount' field.
   * @return The value of the 'retweetCount' field.
   */
  public java.lang.Long getRetweetCount() {
    return retweetCount;
  }


  /**
   * Sets the value of the 'retweetCount' field.
   * @param value the value to set.
   */
  public void setRetweetCount(java.lang.Long value) {
    this.retweetCount = value;
  }

  /**
   * Gets the value of the 'commentCount' field.
   * @return The value of the 'commentCount' field.
   */
  public java.lang.Long getCommentCount() {
    return commentCount;
  }


  /**
   * Sets the value of the 'commentCount' field.
   * @param value the value to set.
   */
  public void setCommentCount(java.lang.Long value) {
    this.commentCount = value;
  }

  /**
   * Creates a new PostReactionChangeAvro RecordBuilder.
   * @return A new PostReactionChangeAvro RecordBuilder
   */
  public static com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder newBuilder() {
    return new com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder();
  }

  /**
   * Creates a new PostReactionChangeAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PostReactionChangeAvro RecordBuilder
   */
  public static com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder newBuilder(com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder other) {
    if (other == null) {
      return new com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder();
    } else {
      return new com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder(other);
    }
  }

  /**
   * Creates a new PostReactionChangeAvro RecordBuilder by copying an existing PostReactionChangeAvro instance.
   * @param other The existing instance to copy.
   * @return A new PostReactionChangeAvro RecordBuilder
   */
  public static com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder newBuilder(com.reddlyne.commons.model.avro.PostReactionChangeAvro other) {
    if (other == null) {
      return new com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder();
    } else {
      return new com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for PostReactionChangeAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PostReactionChangeAvro>
    implements org.apache.avro.data.RecordBuilder<PostReactionChangeAvro> {

    private java.lang.String postID;
    private java.lang.Long likeCount;
    private java.lang.Long dislikeCount;
    private java.lang.Long retweetCount;
    private java.lang.Long commentCount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.postID)) {
        this.postID = data().deepCopy(fields()[0].schema(), other.postID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.likeCount)) {
        this.likeCount = data().deepCopy(fields()[1].schema(), other.likeCount);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.dislikeCount)) {
        this.dislikeCount = data().deepCopy(fields()[2].schema(), other.dislikeCount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.retweetCount)) {
        this.retweetCount = data().deepCopy(fields()[3].schema(), other.retweetCount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.commentCount)) {
        this.commentCount = data().deepCopy(fields()[4].schema(), other.commentCount);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing PostReactionChangeAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.reddlyne.commons.model.avro.PostReactionChangeAvro other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.postID)) {
        this.postID = data().deepCopy(fields()[0].schema(), other.postID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.likeCount)) {
        this.likeCount = data().deepCopy(fields()[1].schema(), other.likeCount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dislikeCount)) {
        this.dislikeCount = data().deepCopy(fields()[2].schema(), other.dislikeCount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.retweetCount)) {
        this.retweetCount = data().deepCopy(fields()[3].schema(), other.retweetCount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.commentCount)) {
        this.commentCount = data().deepCopy(fields()[4].schema(), other.commentCount);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'postID' field.
      * @return The value.
      */
    public java.lang.String getPostID() {
      return postID;
    }


    /**
      * Sets the value of the 'postID' field.
      * @param value The value of 'postID'.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder setPostID(java.lang.String value) {
      validate(fields()[0], value);
      this.postID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'postID' field has been set.
      * @return True if the 'postID' field has been set, false otherwise.
      */
    public boolean hasPostID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'postID' field.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder clearPostID() {
      postID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'likeCount' field.
      * @return The value.
      */
    public java.lang.Long getLikeCount() {
      return likeCount;
    }


    /**
      * Sets the value of the 'likeCount' field.
      * @param value The value of 'likeCount'.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder setLikeCount(java.lang.Long value) {
      validate(fields()[1], value);
      this.likeCount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'likeCount' field has been set.
      * @return True if the 'likeCount' field has been set, false otherwise.
      */
    public boolean hasLikeCount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'likeCount' field.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder clearLikeCount() {
      likeCount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'dislikeCount' field.
      * @return The value.
      */
    public java.lang.Long getDislikeCount() {
      return dislikeCount;
    }


    /**
      * Sets the value of the 'dislikeCount' field.
      * @param value The value of 'dislikeCount'.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder setDislikeCount(java.lang.Long value) {
      validate(fields()[2], value);
      this.dislikeCount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'dislikeCount' field has been set.
      * @return True if the 'dislikeCount' field has been set, false otherwise.
      */
    public boolean hasDislikeCount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'dislikeCount' field.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder clearDislikeCount() {
      dislikeCount = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'retweetCount' field.
      * @return The value.
      */
    public java.lang.Long getRetweetCount() {
      return retweetCount;
    }


    /**
      * Sets the value of the 'retweetCount' field.
      * @param value The value of 'retweetCount'.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder setRetweetCount(java.lang.Long value) {
      validate(fields()[3], value);
      this.retweetCount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'retweetCount' field has been set.
      * @return True if the 'retweetCount' field has been set, false otherwise.
      */
    public boolean hasRetweetCount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'retweetCount' field.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder clearRetweetCount() {
      retweetCount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'commentCount' field.
      * @return The value.
      */
    public java.lang.Long getCommentCount() {
      return commentCount;
    }


    /**
      * Sets the value of the 'commentCount' field.
      * @param value The value of 'commentCount'.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder setCommentCount(java.lang.Long value) {
      validate(fields()[4], value);
      this.commentCount = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'commentCount' field has been set.
      * @return True if the 'commentCount' field has been set, false otherwise.
      */
    public boolean hasCommentCount() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'commentCount' field.
      * @return This builder.
      */
    public com.reddlyne.commons.model.avro.PostReactionChangeAvro.Builder clearCommentCount() {
      commentCount = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PostReactionChangeAvro build() {
      try {
        PostReactionChangeAvro record = new PostReactionChangeAvro();
        record.postID = fieldSetFlags()[0] ? this.postID : (java.lang.String) defaultValue(fields()[0]);
        record.likeCount = fieldSetFlags()[1] ? this.likeCount : (java.lang.Long) defaultValue(fields()[1]);
        record.dislikeCount = fieldSetFlags()[2] ? this.dislikeCount : (java.lang.Long) defaultValue(fields()[2]);
        record.retweetCount = fieldSetFlags()[3] ? this.retweetCount : (java.lang.Long) defaultValue(fields()[3]);
        record.commentCount = fieldSetFlags()[4] ? this.commentCount : (java.lang.Long) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PostReactionChangeAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<PostReactionChangeAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PostReactionChangeAvro>
    READER$ = (org.apache.avro.io.DatumReader<PostReactionChangeAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.postID == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.postID);
    }

    if (this.likeCount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.likeCount);
    }

    if (this.dislikeCount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.dislikeCount);
    }

    if (this.retweetCount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.retweetCount);
    }

    if (this.commentCount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.commentCount);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.postID = null;
      } else {
        this.postID = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.likeCount = null;
      } else {
        this.likeCount = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.dislikeCount = null;
      } else {
        this.dislikeCount = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.retweetCount = null;
      } else {
        this.retweetCount = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.commentCount = null;
      } else {
        this.commentCount = in.readLong();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.postID = null;
          } else {
            this.postID = in.readString();
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.likeCount = null;
          } else {
            this.likeCount = in.readLong();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.dislikeCount = null;
          } else {
            this.dislikeCount = in.readLong();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.retweetCount = null;
          } else {
            this.retweetCount = in.readLong();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.commentCount = null;
          } else {
            this.commentCount = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










