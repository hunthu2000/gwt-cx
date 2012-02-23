package com.gwtcx.shared.action;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class RetrieveAccountResult_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.gwtcx.shared.action.RetrieveAccountResult[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwtcx.shared.action.RetrieveAccountResult[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new com.gwtcx.shared.action.RetrieveAccountResult[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtcx.shared.action.RetrieveAccountResult[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtcx.shared.action.RetrieveAccountResult_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtcx.shared.action.RetrieveAccountResult_Array_Rank_1_FieldSerializer.deserialize(reader, (com.gwtcx.shared.action.RetrieveAccountResult[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtcx.shared.action.RetrieveAccountResult_Array_Rank_1_FieldSerializer.serialize(writer, (com.gwtcx.shared.action.RetrieveAccountResult[])object);
  }
  
}