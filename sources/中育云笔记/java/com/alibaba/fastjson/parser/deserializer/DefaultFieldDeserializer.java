package com.alibaba.fastjson.parser.deserializer;

import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes3.dex */
public class DefaultFieldDeserializer extends FieldDeserializer {
    protected boolean customDeserilizer;
    protected ObjectDeserializer fieldValueDeserilizer;

    public DefaultFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
        super(cls, fieldInfo);
        boolean z10 = false;
        this.customDeserilizer = false;
        JSONField annotation = fieldInfo.getAnnotation();
        if (annotation != null) {
            Class<?> clsDeserializeUsing = annotation.deserializeUsing();
            if (clsDeserializeUsing != null && clsDeserializeUsing != Void.class) {
                z10 = true;
            }
            this.customDeserilizer = z10;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public int getFastMatchToken() {
        ObjectDeserializer objectDeserializer = this.fieldValueDeserilizer;
        if (objectDeserializer != null) {
            return objectDeserializer.getFastMatchToken();
        }
        return 2;
    }

    public ObjectDeserializer getFieldValueDeserilizer(ParserConfig parserConfig) {
        if (this.fieldValueDeserilizer == null) {
            JSONField annotation = this.fieldInfo.getAnnotation();
            if (annotation == null || annotation.deserializeUsing() == Void.class) {
                FieldInfo fieldInfo = this.fieldInfo;
                this.fieldValueDeserilizer = parserConfig.getDeserializer(fieldInfo.fieldClass, fieldInfo.fieldType);
            } else {
                try {
                    this.fieldValueDeserilizer = (ObjectDeserializer) annotation.deserializeUsing().newInstance();
                } catch (Exception e10) {
                    throw new JSONException("create deserializeUsing ObjectDeserializer error", e10);
                }
            }
        }
        return this.fieldValueDeserilizer;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map) throws IOException {
        DefaultJSONParser defaultJSONParser2;
        Object objDeserialze;
        FieldInfo fieldInfo;
        int i10;
        if (this.fieldValueDeserilizer == null) {
            getFieldValueDeserilizer(defaultJSONParser.getConfig());
        }
        ObjectDeserializer deserializer = this.fieldValueDeserilizer;
        Type fieldType = this.fieldInfo.fieldType;
        if (type instanceof ParameterizedType) {
            ParseContext context = defaultJSONParser.getContext();
            if (context != null) {
                context.type = type;
            }
            if (fieldType != type) {
                fieldType = FieldInfo.getFieldType(this.clazz, type, fieldType);
                deserializer = defaultJSONParser.getConfig().getDeserializer(fieldType);
            }
        }
        Type type2 = fieldType;
        if (!(deserializer instanceof JavaBeanDeserializer) || (i10 = (fieldInfo = this.fieldInfo).parserFeatures) == 0) {
            FieldInfo fieldInfo2 = this.fieldInfo;
            String str = fieldInfo2.format;
            if (!(str == null && fieldInfo2.parserFeatures == 0) && (deserializer instanceof ContextObjectDeserializer)) {
                defaultJSONParser2 = defaultJSONParser;
                objDeserialze = ((ContextObjectDeserializer) deserializer).deserialze(defaultJSONParser2, type2, fieldInfo2.name, str, fieldInfo2.parserFeatures);
            } else {
                defaultJSONParser2 = defaultJSONParser;
                objDeserialze = deserializer.deserialze(defaultJSONParser2, type2, fieldInfo2.name);
            }
        } else {
            objDeserialze = ((JavaBeanDeserializer) deserializer).deserialze(defaultJSONParser, type2, fieldInfo.name, i10);
            defaultJSONParser2 = defaultJSONParser;
        }
        if ((objDeserialze instanceof byte[]) && (HttpConstant.GZIP.equals(this.fieldInfo.format) || "gzip,base64".equals(this.fieldInfo.format))) {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) objDeserialze));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    byte[] bArr = new byte[1024];
                    int i11 = gZIPInputStream.read(bArr);
                    if (i11 == -1) {
                        break;
                    } else if (i11 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i11);
                    }
                }
                objDeserialze = byteArrayOutputStream.toByteArray();
            } catch (IOException e10) {
                throw new JSONException("unzip bytes error.", e10);
            }
        }
        if (defaultJSONParser2.getResolveStatus() == 1) {
            DefaultJSONParser.ResolveTask lastResolveTask = defaultJSONParser2.getLastResolveTask();
            lastResolveTask.fieldDeserializer = this;
            lastResolveTask.ownerContext = defaultJSONParser2.getContext();
            defaultJSONParser2.setResolveStatus(0);
            return;
        }
        if (obj == null) {
            map.put(this.fieldInfo.name, objDeserialze);
        } else {
            setValue(obj, objDeserialze);
        }
    }

    public void parseFieldUnwrapped(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map) {
        throw new JSONException("TODO");
    }
}
