package com.alibaba.fastjson.support.retrofit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import je.AbstractC9744x;
import je.AbstractC9746z;
import je.C9740t;
import p122df.C9033d0;
import p122df.InterfaceC9040h;

/* loaded from: classes3.dex */
public class Retrofit2ConverterFactory extends InterfaceC9040h.a {
    private FastJsonConfig fastJsonConfig;

    @Deprecated
    private int featureValues;

    @Deprecated
    private Feature[] features;

    @Deprecated
    private ParserConfig parserConfig;

    @Deprecated
    private SerializeConfig serializeConfig;

    @Deprecated
    private SerializerFeature[] serializerFeatures;
    private static final C9740t MEDIA_TYPE = C9740t.m19483g("application/json; charset=UTF-8");

    @Deprecated
    private static final Feature[] EMPTY_SERIALIZER_FEATURES = new Feature[0];

    public final class RequestBodyConverter<T> implements InterfaceC9040h {
        public RequestBodyConverter() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p122df.InterfaceC9040h
        public /* bridge */ /* synthetic */ Object convert(Object obj) {
            return convert((RequestBodyConverter<T>) obj);
        }

        @Override // p122df.InterfaceC9040h
        public AbstractC9744x convert(T t10) throws IOException {
            try {
                return AbstractC9744x.create(Retrofit2ConverterFactory.MEDIA_TYPE, JSON.toJSONBytesWithFastJsonConfig(Retrofit2ConverterFactory.this.fastJsonConfig.getCharset(), t10, Retrofit2ConverterFactory.this.fastJsonConfig.getSerializeConfig(), Retrofit2ConverterFactory.this.fastJsonConfig.getSerializeFilters(), Retrofit2ConverterFactory.this.fastJsonConfig.getDateFormat(), JSON.DEFAULT_GENERATE_FEATURE, Retrofit2ConverterFactory.this.fastJsonConfig.getSerializerFeatures()));
            } catch (Exception e10) {
                throw new IOException("Could not write JSON: " + e10.getMessage(), e10);
            }
        }
    }

    public final class ResponseBodyConverter<T> implements InterfaceC9040h {
        private Type type;

        public ResponseBodyConverter(Type type) {
            this.type = type;
        }

        @Override // p122df.InterfaceC9040h
        public T convert(AbstractC9746z abstractC9746z) {
            try {
                try {
                    return (T) JSON.parseObject(abstractC9746z.bytes(), Retrofit2ConverterFactory.this.fastJsonConfig.getCharset(), this.type, Retrofit2ConverterFactory.this.fastJsonConfig.getParserConfig(), Retrofit2ConverterFactory.this.fastJsonConfig.getParseProcess(), JSON.DEFAULT_PARSER_FEATURE, Retrofit2ConverterFactory.this.fastJsonConfig.getFeatures());
                } catch (Exception e10) {
                    throw new IOException("JSON parse error: " + e10.getMessage(), e10);
                }
            } finally {
                abstractC9746z.close();
            }
        }
    }

    public Retrofit2ConverterFactory() {
        this.parserConfig = ParserConfig.getGlobalInstance();
        this.featureValues = JSON.DEFAULT_PARSER_FEATURE;
        this.fastJsonConfig = new FastJsonConfig();
    }

    public static Retrofit2ConverterFactory create() {
        return create(new FastJsonConfig());
    }

    public FastJsonConfig getFastJsonConfig() {
        return this.fastJsonConfig;
    }

    @Deprecated
    public ParserConfig getParserConfig() {
        return this.fastJsonConfig.getParserConfig();
    }

    @Deprecated
    public int getParserFeatureValues() {
        return JSON.DEFAULT_PARSER_FEATURE;
    }

    @Deprecated
    public Feature[] getParserFeatures() {
        return this.fastJsonConfig.getFeatures();
    }

    @Deprecated
    public SerializeConfig getSerializeConfig() {
        return this.fastJsonConfig.getSerializeConfig();
    }

    @Deprecated
    public SerializerFeature[] getSerializerFeatures() {
        return this.fastJsonConfig.getSerializerFeatures();
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9033d0 c9033d0) {
        return new RequestBodyConverter();
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h responseBodyConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        return new ResponseBodyConverter(type);
    }

    public Retrofit2ConverterFactory setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        this.fastJsonConfig = fastJsonConfig;
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setParserConfig(ParserConfig parserConfig) {
        this.fastJsonConfig.setParserConfig(parserConfig);
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setParserFeatureValues(int i10) {
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setParserFeatures(Feature[] featureArr) {
        this.fastJsonConfig.setFeatures(featureArr);
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setSerializeConfig(SerializeConfig serializeConfig) {
        this.fastJsonConfig.setSerializeConfig(serializeConfig);
        return this;
    }

    @Deprecated
    public Retrofit2ConverterFactory setSerializerFeatures(SerializerFeature[] serializerFeatureArr) {
        this.fastJsonConfig.setSerializerFeatures(serializerFeatureArr);
        return this;
    }

    public static Retrofit2ConverterFactory create(FastJsonConfig fastJsonConfig) {
        if (fastJsonConfig != null) {
            return new Retrofit2ConverterFactory(fastJsonConfig);
        }
        throw new NullPointerException("fastJsonConfig == null");
    }

    public Retrofit2ConverterFactory(FastJsonConfig fastJsonConfig) {
        this.parserConfig = ParserConfig.getGlobalInstance();
        this.featureValues = JSON.DEFAULT_PARSER_FEATURE;
        this.fastJsonConfig = fastJsonConfig;
    }
}
