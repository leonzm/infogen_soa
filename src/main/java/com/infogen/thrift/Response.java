/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.infogen.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2015-1-4")
public class Response implements org.apache.thrift.TBase<Response, Response._Fields>, java.io.Serializable, Cloneable, Comparable<Response> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Response");

  private static final org.apache.thrift.protocol.TField CRC_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("crcCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionID", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SEQUENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("sequence", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField METHOD_FIELD_DESC = new org.apache.thrift.protocol.TField("method", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.BOOL, (short)6);
  private static final org.apache.thrift.protocol.TField NOTE_FIELD_DESC = new org.apache.thrift.protocol.TField("note", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ResponseTupleSchemeFactory());
  }

  public int crcCode; // required
  public String sessionID; // required
  public long sequence; // required
  public String method; // required
  public String data; // required
  public boolean success; // required
  public String note; // required
  public int code; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CRC_CODE((short)1, "crcCode"),
    SESSION_ID((short)2, "sessionID"),
    SEQUENCE((short)3, "sequence"),
    METHOD((short)4, "method"),
    DATA((short)5, "data"),
    SUCCESS((short)6, "success"),
    NOTE((short)7, "note"),
    CODE((short)8, "code");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CRC_CODE
          return CRC_CODE;
        case 2: // SESSION_ID
          return SESSION_ID;
        case 3: // SEQUENCE
          return SEQUENCE;
        case 4: // METHOD
          return METHOD;
        case 5: // DATA
          return DATA;
        case 6: // SUCCESS
          return SUCCESS;
        case 7: // NOTE
          return NOTE;
        case 8: // CODE
          return CODE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CRCCODE_ISSET_ID = 0;
  private static final int __SEQUENCE_ISSET_ID = 1;
  private static final int __SUCCESS_ISSET_ID = 2;
  private static final int __CODE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CRC_CODE, new org.apache.thrift.meta_data.FieldMetaData("crcCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SEQUENCE, new org.apache.thrift.meta_data.FieldMetaData("sequence", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.METHOD, new org.apache.thrift.meta_data.FieldMetaData("method", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NOTE, new org.apache.thrift.meta_data.FieldMetaData("note", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Response.class, metaDataMap);
  }

  public Response() {
    this.crcCode = 1;

  }

  public Response(
    int crcCode,
    String sessionID,
    long sequence,
    String method,
    String data,
    boolean success,
    String note,
    int code)
  {
    this();
    this.crcCode = crcCode;
    setCrcCodeIsSet(true);
    this.sessionID = sessionID;
    this.sequence = sequence;
    setSequenceIsSet(true);
    this.method = method;
    this.data = data;
    this.success = success;
    setSuccessIsSet(true);
    this.note = note;
    this.code = code;
    setCodeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Response(Response other) {
    __isset_bitfield = other.__isset_bitfield;
    this.crcCode = other.crcCode;
    if (other.isSetSessionID()) {
      this.sessionID = other.sessionID;
    }
    this.sequence = other.sequence;
    if (other.isSetMethod()) {
      this.method = other.method;
    }
    if (other.isSetData()) {
      this.data = other.data;
    }
    this.success = other.success;
    if (other.isSetNote()) {
      this.note = other.note;
    }
    this.code = other.code;
  }

  public Response deepCopy() {
    return new Response(this);
  }

  @Override
  public void clear() {
    this.crcCode = 1;

    this.sessionID = null;
    setSequenceIsSet(false);
    this.sequence = 0;
    this.method = null;
    this.data = null;
    setSuccessIsSet(false);
    this.success = false;
    this.note = null;
    setCodeIsSet(false);
    this.code = 0;
  }

  public int getCrcCode() {
    return this.crcCode;
  }

  public Response setCrcCode(int crcCode) {
    this.crcCode = crcCode;
    setCrcCodeIsSet(true);
    return this;
  }

  public void unsetCrcCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CRCCODE_ISSET_ID);
  }

  /** Returns true if field crcCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCrcCode() {
    return EncodingUtils.testBit(__isset_bitfield, __CRCCODE_ISSET_ID);
  }

  public void setCrcCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CRCCODE_ISSET_ID, value);
  }

  public String getSessionID() {
    return this.sessionID;
  }

  public Response setSessionID(String sessionID) {
    this.sessionID = sessionID;
    return this;
  }

  public void unsetSessionID() {
    this.sessionID = null;
  }

  /** Returns true if field sessionID is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionID() {
    return this.sessionID != null;
  }

  public void setSessionIDIsSet(boolean value) {
    if (!value) {
      this.sessionID = null;
    }
  }

  public long getSequence() {
    return this.sequence;
  }

  public Response setSequence(long sequence) {
    this.sequence = sequence;
    setSequenceIsSet(true);
    return this;
  }

  public void unsetSequence() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SEQUENCE_ISSET_ID);
  }

  /** Returns true if field sequence is set (has been assigned a value) and false otherwise */
  public boolean isSetSequence() {
    return EncodingUtils.testBit(__isset_bitfield, __SEQUENCE_ISSET_ID);
  }

  public void setSequenceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SEQUENCE_ISSET_ID, value);
  }

  public String getMethod() {
    return this.method;
  }

  public Response setMethod(String method) {
    this.method = method;
    return this;
  }

  public void unsetMethod() {
    this.method = null;
  }

  /** Returns true if field method is set (has been assigned a value) and false otherwise */
  public boolean isSetMethod() {
    return this.method != null;
  }

  public void setMethodIsSet(boolean value) {
    if (!value) {
      this.method = null;
    }
  }

  public String getData() {
    return this.data;
  }

  public Response setData(String data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public boolean isSuccess() {
    return this.success;
  }

  public Response setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  public String getNote() {
    return this.note;
  }

  public Response setNote(String note) {
    this.note = note;
    return this;
  }

  public void unsetNote() {
    this.note = null;
  }

  /** Returns true if field note is set (has been assigned a value) and false otherwise */
  public boolean isSetNote() {
    return this.note != null;
  }

  public void setNoteIsSet(boolean value) {
    if (!value) {
      this.note = null;
    }
  }

  public int getCode() {
    return this.code;
  }

  public Response setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  /** Returns true if field code is set (has been assigned a value) and false otherwise */
  public boolean isSetCode() {
    return EncodingUtils.testBit(__isset_bitfield, __CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CODE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CRC_CODE:
      if (value == null) {
        unsetCrcCode();
      } else {
        setCrcCode((Integer)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSessionID();
      } else {
        setSessionID((String)value);
      }
      break;

    case SEQUENCE:
      if (value == null) {
        unsetSequence();
      } else {
        setSequence((Long)value);
      }
      break;

    case METHOD:
      if (value == null) {
        unsetMethod();
      } else {
        setMethod((String)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((String)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    case NOTE:
      if (value == null) {
        unsetNote();
      } else {
        setNote((String)value);
      }
      break;

    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CRC_CODE:
      return Integer.valueOf(getCrcCode());

    case SESSION_ID:
      return getSessionID();

    case SEQUENCE:
      return Long.valueOf(getSequence());

    case METHOD:
      return getMethod();

    case DATA:
      return getData();

    case SUCCESS:
      return Boolean.valueOf(isSuccess());

    case NOTE:
      return getNote();

    case CODE:
      return Integer.valueOf(getCode());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CRC_CODE:
      return isSetCrcCode();
    case SESSION_ID:
      return isSetSessionID();
    case SEQUENCE:
      return isSetSequence();
    case METHOD:
      return isSetMethod();
    case DATA:
      return isSetData();
    case SUCCESS:
      return isSetSuccess();
    case NOTE:
      return isSetNote();
    case CODE:
      return isSetCode();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Response)
      return this.equals((Response)that);
    return false;
  }

  public boolean equals(Response that) {
    if (that == null)
      return false;

    boolean this_present_crcCode = true;
    boolean that_present_crcCode = true;
    if (this_present_crcCode || that_present_crcCode) {
      if (!(this_present_crcCode && that_present_crcCode))
        return false;
      if (this.crcCode != that.crcCode)
        return false;
    }

    boolean this_present_sessionID = true && this.isSetSessionID();
    boolean that_present_sessionID = true && that.isSetSessionID();
    if (this_present_sessionID || that_present_sessionID) {
      if (!(this_present_sessionID && that_present_sessionID))
        return false;
      if (!this.sessionID.equals(that.sessionID))
        return false;
    }

    boolean this_present_sequence = true;
    boolean that_present_sequence = true;
    if (this_present_sequence || that_present_sequence) {
      if (!(this_present_sequence && that_present_sequence))
        return false;
      if (this.sequence != that.sequence)
        return false;
    }

    boolean this_present_method = true && this.isSetMethod();
    boolean that_present_method = true && that.isSetMethod();
    if (this_present_method || that_present_method) {
      if (!(this_present_method && that_present_method))
        return false;
      if (!this.method.equals(that.method))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_success = true;
    boolean that_present_success = true;
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_note = true && this.isSetNote();
    boolean that_present_note = true && that.isSetNote();
    if (this_present_note || that_present_note) {
      if (!(this_present_note && that_present_note))
        return false;
      if (!this.note.equals(that.note))
        return false;
    }

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (this.code != that.code)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_crcCode = true;
    list.add(present_crcCode);
    if (present_crcCode)
      list.add(crcCode);

    boolean present_sessionID = true && (isSetSessionID());
    list.add(present_sessionID);
    if (present_sessionID)
      list.add(sessionID);

    boolean present_sequence = true;
    list.add(present_sequence);
    if (present_sequence)
      list.add(sequence);

    boolean present_method = true && (isSetMethod());
    list.add(present_method);
    if (present_method)
      list.add(method);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    boolean present_success = true;
    list.add(present_success);
    if (present_success)
      list.add(success);

    boolean present_note = true && (isSetNote());
    list.add(present_note);
    if (present_note)
      list.add(note);

    boolean present_code = true;
    list.add(present_code);
    if (present_code)
      list.add(code);

    return list.hashCode();
  }

  @Override
  public int compareTo(Response other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCrcCode()).compareTo(other.isSetCrcCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCrcCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.crcCode, other.crcCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSessionID()).compareTo(other.isSetSessionID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionID, other.sessionID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSequence()).compareTo(other.isSetSequence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSequence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sequence, other.sequence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMethod()).compareTo(other.isSetMethod());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMethod()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.method, other.method);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNote()).compareTo(other.isSetNote());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNote()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.note, other.note);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Response(");
    boolean first = true;

    sb.append("crcCode:");
    sb.append(this.crcCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionID:");
    if (this.sessionID == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionID);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sequence:");
    sb.append(this.sequence);
    first = false;
    if (!first) sb.append(", ");
    sb.append("method:");
    if (this.method == null) {
      sb.append("null");
    } else {
      sb.append(this.method);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("success:");
    sb.append(this.success);
    first = false;
    if (!first) sb.append(", ");
    sb.append("note:");
    if (this.note == null) {
      sb.append("null");
    } else {
      sb.append(this.note);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("code:");
    sb.append(this.code);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ResponseStandardSchemeFactory implements SchemeFactory {
    public ResponseStandardScheme getScheme() {
      return new ResponseStandardScheme();
    }
  }

  private static class ResponseStandardScheme extends StandardScheme<Response> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Response struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CRC_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.crcCode = iprot.readI32();
              struct.setCrcCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionID = iprot.readString();
              struct.setSessionIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SEQUENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sequence = iprot.readI64();
              struct.setSequenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // METHOD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.method = iprot.readString();
              struct.setMethodIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readString();
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SUCCESS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // NOTE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.note = iprot.readString();
              struct.setNoteIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.code = iprot.readI32();
              struct.setCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Response struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CRC_CODE_FIELD_DESC);
      oprot.writeI32(struct.crcCode);
      oprot.writeFieldEnd();
      if (struct.sessionID != null) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.sessionID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SEQUENCE_FIELD_DESC);
      oprot.writeI64(struct.sequence);
      oprot.writeFieldEnd();
      if (struct.method != null) {
        oprot.writeFieldBegin(METHOD_FIELD_DESC);
        oprot.writeString(struct.method);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeString(struct.data);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
      oprot.writeBool(struct.success);
      oprot.writeFieldEnd();
      if (struct.note != null) {
        oprot.writeFieldBegin(NOTE_FIELD_DESC);
        oprot.writeString(struct.note);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CODE_FIELD_DESC);
      oprot.writeI32(struct.code);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ResponseTupleSchemeFactory implements SchemeFactory {
    public ResponseTupleScheme getScheme() {
      return new ResponseTupleScheme();
    }
  }

  private static class ResponseTupleScheme extends TupleScheme<Response> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Response struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCrcCode()) {
        optionals.set(0);
      }
      if (struct.isSetSessionID()) {
        optionals.set(1);
      }
      if (struct.isSetSequence()) {
        optionals.set(2);
      }
      if (struct.isSetMethod()) {
        optionals.set(3);
      }
      if (struct.isSetData()) {
        optionals.set(4);
      }
      if (struct.isSetSuccess()) {
        optionals.set(5);
      }
      if (struct.isSetNote()) {
        optionals.set(6);
      }
      if (struct.isSetCode()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetCrcCode()) {
        oprot.writeI32(struct.crcCode);
      }
      if (struct.isSetSessionID()) {
        oprot.writeString(struct.sessionID);
      }
      if (struct.isSetSequence()) {
        oprot.writeI64(struct.sequence);
      }
      if (struct.isSetMethod()) {
        oprot.writeString(struct.method);
      }
      if (struct.isSetData()) {
        oprot.writeString(struct.data);
      }
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetNote()) {
        oprot.writeString(struct.note);
      }
      if (struct.isSetCode()) {
        oprot.writeI32(struct.code);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Response struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.crcCode = iprot.readI32();
        struct.setCrcCodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sessionID = iprot.readString();
        struct.setSessionIDIsSet(true);
      }
      if (incoming.get(2)) {
        struct.sequence = iprot.readI64();
        struct.setSequenceIsSet(true);
      }
      if (incoming.get(3)) {
        struct.method = iprot.readString();
        struct.setMethodIsSet(true);
      }
      if (incoming.get(4)) {
        struct.data = iprot.readString();
        struct.setDataIsSet(true);
      }
      if (incoming.get(5)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(6)) {
        struct.note = iprot.readString();
        struct.setNoteIsSet(true);
      }
      if (incoming.get(7)) {
        struct.code = iprot.readI32();
        struct.setCodeIsSet(true);
      }
    }
  }

}
