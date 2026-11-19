package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.charset.Charset;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;

/* loaded from: classes3.dex */
public class FastJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object> implements GenericHttpMessageConverter<Object> {
    public static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Deprecated
    protected String dateFormat;
    private FastJsonConfig fastJsonConfig;

    @Deprecated
    protected SerializerFeature[] features;

    @Deprecated
    protected SerializeFilter[] filters;

    public static class Spring4TypeResolvableHelper {
        private static boolean hasClazzResolvableType;

        static {
            try {
                Class.forName("org.springframework.core.ResolvableType");
                hasClazzResolvableType = true;
            } catch (ClassNotFoundException unused) {
                hasClazzResolvableType = false;
            }
        }

        private Spring4TypeResolvableHelper() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Type getType(Type type, Class<?> cls) {
            if (cls == null) {
                return type;
            }
            ResolvableType resolvableTypeForType = ResolvableType.forType(type);
            if (type instanceof TypeVariable) {
                ResolvableType resolvableTypeResolveVariable = resolveVariable((TypeVariable) type, ResolvableType.forClass(cls));
                return resolvableTypeResolveVariable != ResolvableType.NONE ? resolvableTypeResolveVariable.resolve() : type;
            }
            if (!(type instanceof ParameterizedType) || !resolvableTypeForType.hasUnresolvableGenerics()) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class[] clsArr = new Class[parameterizedType.getActualTypeArguments().length];
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                Type type2 = actualTypeArguments[i10];
                if (type2 instanceof TypeVariable) {
                    ResolvableType resolvableTypeResolveVariable2 = resolveVariable((TypeVariable) type2, ResolvableType.forClass(cls));
                    if (resolvableTypeResolveVariable2 != ResolvableType.NONE) {
                        clsArr[i10] = resolvableTypeResolveVariable2.resolve();
                    } else {
                        clsArr[i10] = ResolvableType.forType(type2).resolve();
                    }
                } else {
                    clsArr[i10] = ResolvableType.forType(type2).resolve();
                }
            }
            return ResolvableType.forClassWithGenerics(resolvableTypeForType.getRawClass(), clsArr).getType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupport() {
            return hasClazzResolvableType;
        }

        private static ResolvableType resolveVariable(TypeVariable<?> typeVariable, ResolvableType resolvableType) {
            if (resolvableType.hasGenerics()) {
                ResolvableType resolvableTypeForType = ResolvableType.forType(typeVariable, resolvableType);
                if (resolvableTypeForType.resolve() != null) {
                    return resolvableTypeForType;
                }
            }
            ResolvableType superType = resolvableType.getSuperType();
            if (superType != ResolvableType.NONE) {
                ResolvableType resolvableTypeResolveVariable = resolveVariable(typeVariable, superType);
                if (resolvableTypeResolveVariable.resolve() != null) {
                    return resolvableTypeResolveVariable;
                }
            }
            for (ResolvableType resolvableType2 : resolvableType.getInterfaces()) {
                ResolvableType resolvableTypeResolveVariable2 = resolveVariable(typeVariable, resolvableType2);
                if (resolvableTypeResolveVariable2.resolve() != null) {
                    return resolvableTypeResolveVariable2;
                }
            }
            return ResolvableType.NONE;
        }
    }

    public FastJsonHttpMessageConverter() {
        super(MediaType.ALL);
        this.features = new SerializerFeature[0];
        this.filters = new SerializeFilter[0];
        this.fastJsonConfig = new FastJsonConfig();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.springframework.http.converter.HttpMessageNotReadableException */
    private Object readType(Type type, HttpInputMessage httpInputMessage) throws HttpMessageNotReadableException {
        try {
            return JSON.parseObject(httpInputMessage.getBody(), this.fastJsonConfig.getCharset(), type, this.fastJsonConfig.getParserConfig(), this.fastJsonConfig.getParseProcess(), JSON.DEFAULT_PARSER_FEATURE, this.fastJsonConfig.getFeatures());
        } catch (JSONException e10) {
            throw new HttpMessageNotReadableException("JSON parse error: " + e10.getMessage(), e10);
        } catch (IOException e11) {
            throw new HttpMessageNotReadableException("I/O error while reading input message", e11);
        }
    }

    private Object strangeCodeForJackson(Object obj) {
        return (obj == null || !"com.fasterxml.jackson.databind.node.ObjectNode".equals(obj.getClass().getName())) ? obj : obj.toString();
    }

    @Deprecated
    public void addSerializeFilter(SerializeFilter serializeFilter) {
        if (serializeFilter == null) {
            return;
        }
        int length = this.fastJsonConfig.getSerializeFilters().length;
        SerializeFilter[] serializeFilterArr = new SerializeFilter[length + 1];
        System.arraycopy(this.fastJsonConfig.getSerializeFilters(), 0, serializeFilterArr, 0, length);
        serializeFilterArr[length] = serializeFilter;
        this.fastJsonConfig.setSerializeFilters(serializeFilterArr);
    }

    public boolean canRead(Type type, Class<?> cls, MediaType mediaType) {
        return super.canRead(cls, mediaType);
    }

    public boolean canWrite(Type type, Class<?> cls, MediaType mediaType) {
        return super.canWrite(cls, mediaType);
    }

    @Deprecated
    public Charset getCharset() {
        return this.fastJsonConfig.getCharset();
    }

    @Deprecated
    public String getDateFormat() {
        return this.fastJsonConfig.getDateFormat();
    }

    public FastJsonConfig getFastJsonConfig() {
        return this.fastJsonConfig;
    }

    @Deprecated
    public SerializerFeature[] getFeatures() {
        return this.fastJsonConfig.getSerializerFeatures();
    }

    @Deprecated
    public SerializeFilter[] getFilters() {
        return this.fastJsonConfig.getSerializeFilters();
    }

    public Type getType(Type type, Class<?> cls) {
        return Spring4TypeResolvableHelper.isSupport() ? Spring4TypeResolvableHelper.getType(type, cls) : type;
    }

    public Object read(Type type, Class<?> cls, HttpInputMessage httpInputMessage) {
        return readType(getType(type, cls), httpInputMessage);
    }

    public Object readInternal(Class<?> cls, HttpInputMessage httpInputMessage) {
        return readType(getType(cls, null), httpInputMessage);
    }

    @Deprecated
    public void setCharset(Charset charset) {
        this.fastJsonConfig.setCharset(charset);
    }

    @Deprecated
    public void setDateFormat(String str) {
        this.fastJsonConfig.setDateFormat(str);
    }

    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        this.fastJsonConfig = fastJsonConfig;
    }

    @Deprecated
    public void setFeatures(SerializerFeature... serializerFeatureArr) {
        this.fastJsonConfig.setSerializerFeatures(serializerFeatureArr);
    }

    @Deprecated
    public void setFilters(SerializeFilter... serializeFilterArr) {
        this.fastJsonConfig.setSerializeFilters(serializeFilterArr);
    }

    public boolean supports(Class<?> cls) {
        return true;
    }

    public void write(Object obj, Type type, MediaType mediaType, HttpOutputMessage httpOutputMessage) {
        super.write(obj, mediaType, httpOutputMessage);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeInternal(java.lang.Object r11, org.springframework.http.HttpOutputMessage r12) throws java.io.IOException {
        /*
            r10 = this;
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            org.springframework.http.HttpHeaders r0 = r12.getHeaders()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r10.fastJsonConfig     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.serializer.SerializeFilter[] r2 = r2.getSerializeFilters()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.lang.Object r11 = r10.strangeCodeForJackson(r11)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            boolean r2 = r11 instanceof com.alibaba.fastjson.support.spring.FastJsonContainer     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            if (r2 == 0) goto L39
            com.alibaba.fastjson.support.spring.FastJsonContainer r11 = (com.alibaba.fastjson.support.spring.FastJsonContainer) r11     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.support.spring.PropertyPreFilters r2 = r11.getFilters()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.util.List r2 = r2.getFilters()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            goto L39
        L32:
            r0 = move-exception
            r11 = r0
            goto Lb9
        L36:
            r0 = move-exception
            r11 = r0
            goto L9e
        L39:
            boolean r2 = r11 instanceof com.alibaba.fastjson.support.spring.MappingFastJsonValue     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r4 = 1
            if (r2 == 0) goto L4d
            r2 = r11
            com.alibaba.fastjson.support.spring.MappingFastJsonValue r2 = (com.alibaba.fastjson.support.spring.MappingFastJsonValue) r2     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.lang.String r2 = r2.getJsonpFunction()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            boolean r2 = org.springframework.util.StringUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            if (r2 != 0) goto L52
        L4b:
            r9 = r4
            goto L54
        L4d:
            boolean r2 = r11 instanceof com.alibaba.fastjson.JSONPObject     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            if (r2 == 0) goto L52
            goto L4b
        L52:
            r4 = 0
            goto L4b
        L54:
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r10.fastJsonConfig     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.nio.charset.Charset r2 = r2.getCharset()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.support.config.FastJsonConfig r4 = r10.fastJsonConfig     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.serializer.SerializeConfig r4 = r4.getSerializeConfig()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.serializer.SerializeFilter[] r5 = new com.alibaba.fastjson.serializer.SerializeFilter[r5]     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r5 = r3
            com.alibaba.fastjson.serializer.SerializeFilter[] r5 = (com.alibaba.fastjson.serializer.SerializeFilter[]) r5     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r10.fastJsonConfig     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            java.lang.String r6 = r3.getDateFormat()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            int r7 = com.alibaba.fastjson.JSON.DEFAULT_GENERATE_FEATURE     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.support.config.FastJsonConfig r3 = r10.fastJsonConfig     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            com.alibaba.fastjson.serializer.SerializerFeature[] r8 = r3.getSerializerFeatures()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r3 = r11
            int r11 = com.alibaba.fastjson.JSON.writeJSONStringWithFastJsonConfig(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            if (r9 == 0) goto L87
            org.springframework.http.MediaType r2 = com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter.APPLICATION_JAVASCRIPT     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r0.setContentType(r2)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
        L87:
            com.alibaba.fastjson.support.config.FastJsonConfig r2 = r10.fastJsonConfig     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            boolean r2 = r2.isWriteContentLength()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            if (r2 == 0) goto L93
            long r2 = (long) r11     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r0.setContentLength(r2)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
        L93:
            java.io.OutputStream r11 = r12.getBody()     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r1.writeTo(r11)     // Catch: java.lang.Throwable -> L32 com.alibaba.fastjson.JSONException -> L36
            r1.close()
            return
        L9e:
            org.springframework.http.converter.HttpMessageNotWritableException r12 = new org.springframework.http.converter.HttpMessageNotWritableException     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Could not write JSON: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r11.getMessage()     // Catch: java.lang.Throwable -> L32
            r0.append(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L32
            r12.<init>(r0, r11)     // Catch: java.lang.Throwable -> L32
            throw r12     // Catch: java.lang.Throwable -> L32
        Lb9:
            r1.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter.writeInternal(java.lang.Object, org.springframework.http.HttpOutputMessage):void");
    }
}
