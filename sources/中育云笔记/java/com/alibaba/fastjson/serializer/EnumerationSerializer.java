package com.alibaba.fastjson.serializer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;

/* loaded from: classes3.dex */
public class EnumerationSerializer implements ObjectSerializer {
    public static EnumerationSerializer instance = new EnumerationSerializer();

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        JSONSerializer jSONSerializer2;
        Throwable th;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullListAsEmpty);
            return;
        }
        int i11 = 0;
        Type type2 = (serializeWriter.isEnabled(SerializerFeature.WriteClassName) && (type instanceof ParameterizedType)) ? ((ParameterizedType) type).getActualTypeArguments()[0] : null;
        Enumeration enumeration = (Enumeration) obj;
        SerialContext serialContext = jSONSerializer.context;
        jSONSerializer.setContext(serialContext, obj, obj2, 0);
        try {
            serializeWriter.append('[');
            while (enumeration.hasMoreElements()) {
                Object objNextElement = enumeration.nextElement();
                int i12 = i11 + 1;
                if (i11 != 0) {
                    try {
                        serializeWriter.append(',');
                    } catch (Throwable th2) {
                        th = th2;
                        jSONSerializer2 = jSONSerializer;
                        jSONSerializer2.context = serialContext;
                        throw th;
                    }
                }
                if (objNextElement == null) {
                    serializeWriter.writeNull();
                    jSONSerializer2 = jSONSerializer;
                } else {
                    jSONSerializer2 = jSONSerializer;
                    try {
                        jSONSerializer.getObjectWriter(objNextElement.getClass()).write(jSONSerializer2, objNextElement, Integer.valueOf(i11), type2, 0);
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        jSONSerializer2.context = serialContext;
                        throw th;
                    }
                }
                i11 = i12;
                jSONSerializer = jSONSerializer2;
            }
            jSONSerializer2 = jSONSerializer;
            serializeWriter.append(']');
            jSONSerializer2.context = serialContext;
        } catch (Throwable th4) {
            th = th4;
            jSONSerializer2 = jSONSerializer;
        }
    }
}
