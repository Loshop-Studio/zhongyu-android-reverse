package com.alibaba.fastjson.serializer;

import androidx.collection.SieveCacheKt;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class LongCodec implements ObjectSerializer, ObjectDeserializer {
    public static LongCodec instance = new LongCodec();

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        Object objCastToLong;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        try {
            int i10 = jSONLexer.token();
            if (i10 == 2) {
                long jLongValue = jSONLexer.longValue();
                jSONLexer.nextToken(16);
                objCastToLong = (T) Long.valueOf(jLongValue);
            } else if (i10 == 3) {
                objCastToLong = (T) Long.valueOf(TypeUtils.longValue(jSONLexer.decimalValue()));
                jSONLexer.nextToken(16);
            } else {
                if (i10 == 12) {
                    JSONObject jSONObject = new JSONObject(true);
                    defaultJSONParser.parseObject((Map) jSONObject);
                    objCastToLong = (T) TypeUtils.castToLong(jSONObject);
                } else {
                    objCastToLong = TypeUtils.castToLong(defaultJSONParser.parse());
                }
                if (objCastToLong == null) {
                    return null;
                }
            }
            return type == AtomicLong.class ? (T) new AtomicLong(((Long) objCastToLong).longValue()) : (T) objCastToLong;
        } catch (Exception e10) {
            throw new JSONException("parseLong error, field : " + obj, e10);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 2;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull(SerializerFeature.WriteNullNumberAsZero);
            return;
        }
        long jLongValue = ((Long) obj).longValue();
        serializeWriter.writeLong(jLongValue);
        if (!serializeWriter.isEnabled(SerializerFeature.WriteClassName) || jLongValue > SieveCacheKt.NodeLinkMask || jLongValue < SieveCacheKt.NodeMetaAndPreviousMask || type == Long.class || type == Long.TYPE) {
            return;
        }
        serializeWriter.write(76);
    }
}
