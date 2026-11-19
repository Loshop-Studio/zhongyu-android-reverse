package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.taobao.sophix.PatchStatus;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ByteBufferCodec implements ObjectSerializer, ObjectDeserializer {
    public static final ByteBufferCodec instance = new ByteBufferCodec();

    public static class ByteBufferBean {
        public byte[] array;
        public int limit;
        public int position;

        public ByteBuffer byteBuffer() {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.array);
            byteBufferWrap.limit(this.limit);
            byteBufferWrap.position(this.position);
            return byteBufferWrap;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) ((ByteBufferBean) defaultJSONParser.parseObject((Class) ByteBufferBean.class)).byteBuffer();
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 14;
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byte[] bArrArray = byteBuffer.array();
        SerializeWriter serializeWriter = jSONSerializer.out;
        serializeWriter.write(PatchStatus.CODE_LOAD_RES_ADDASSERTPATH);
        serializeWriter.writeFieldName("array");
        serializeWriter.writeByteArray(bArrArray);
        serializeWriter.writeFieldValue(',', "limit", byteBuffer.limit());
        serializeWriter.writeFieldValue(',', RequestParameters.POSITION, byteBuffer.position());
        serializeWriter.write(125);
    }
}
