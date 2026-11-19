package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public class MapDeserializer extends ContextObjectDeserializer implements ObjectDeserializer {
    public static MapDeserializer instance = new MapDeserializer();

    public static Map parseMap(DefaultJSONParser defaultJSONParser, Map<String, Object> map, Type type, Object obj) {
        return parseMap(defaultJSONParser, map, type, obj, 0);
    }

    public Map<Object, Object> createMap(Type type) {
        return createMap(type, JSON.DEFAULT_GENERATE_FEATURE);
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, String str, int i10) throws Throwable {
        DefaultJSONParser defaultJSONParser2;
        if (type == JSONObject.class && defaultJSONParser.getFieldTypeResolver() == null) {
            return (T) defaultJSONParser.parseObject();
        }
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 8) {
            jSONLexer.nextToken(16);
            return null;
        }
        boolean z10 = (type instanceof Class) && "java.util.Collections$UnmodifiableMap".equals(((Class) type).getName());
        Map<Object, Object> mapCreateMap = (jSONLexer.getFeatures() & Feature.OrderedField.mask) != 0 ? createMap(type, jSONLexer.getFeatures()) : createMap(type);
        ParseContext context = defaultJSONParser.getContext();
        try {
            defaultJSONParser.setContext(context, mapCreateMap, obj);
            defaultJSONParser2 = defaultJSONParser;
        } catch (Throwable th) {
            th = th;
            defaultJSONParser2 = defaultJSONParser;
        }
        try {
            Map map = (T) deserialze(defaultJSONParser2, type, obj, mapCreateMap, i10);
            if (z10) {
                map = (T) Collections.unmodifiableMap(map);
            }
            defaultJSONParser2.setContext(context);
            return (T) map;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            defaultJSONParser2.setContext(context);
            throw th3;
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0206, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5 A[Catch: all -> 0x00ad, TRY_ENTER, TryCatch #0 {all -> 0x00ad, blocks: (B:18:0x008f, B:22:0x00a2, B:28:0x00ba, B:53:0x014f, B:55:0x0162, B:57:0x016a, B:59:0x0170, B:63:0x018f, B:65:0x0197, B:67:0x01a0, B:70:0x01a7, B:72:0x01b4, B:74:0x01b8, B:75:0x01bb, B:62:0x0187, B:78:0x01c5, B:80:0x01ca, B:81:0x01cd, B:83:0x01d5, B:85:0x01dd, B:91:0x01f8, B:84:0x01d9, B:31:0x00cd, B:32:0x00e5, B:35:0x00ea, B:40:0x00fd, B:42:0x0105, B:45:0x0117, B:46:0x012f, B:47:0x0130, B:48:0x0135, B:49:0x0136, B:51:0x013e, B:97:0x0207, B:98:0x0227, B:99:0x0228, B:100:0x022d), top: B:103:0x008f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map parseMap(com.alibaba.fastjson.parser.DefaultJSONParser r10, java.util.Map<java.lang.String, java.lang.Object> r11, java.lang.reflect.Type r12, java.lang.Object r13, int r14) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.MapDeserializer.parseMap(com.alibaba.fastjson.parser.DefaultJSONParser, java.util.Map, java.lang.reflect.Type, java.lang.Object, int):java.util.Map");
    }

    public Map<Object, Object> createMap(Type type, int i10) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class) {
            return (Feature.OrderedField.mask & i10) != 0 ? new LinkedHashMap() : new HashMap();
        }
        if (type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : createMap(rawType, i10);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new JSONException("unsupport type " + type);
        }
        if ("java.util.Collections$UnmodifiableMap".equals(cls.getName())) {
            return new HashMap();
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e10) {
            throw new JSONException("unsupport type " + type, e10);
        }
    }

    public Object deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, Map map) {
        return deserialze(defaultJSONParser, type, obj, map, 0);
    }

    public Object deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, Map map, int i10) {
        Type type2;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            if (map.getClass().getName().equals("org.springframework.util.LinkedMultiValueMap")) {
                type2 = List.class;
            } else {
                type2 = parameterizedType.getActualTypeArguments()[1];
            }
            if (String.class == type3) {
                return parseMap(defaultJSONParser, (Map<String, Object>) map, type2, obj, i10);
            }
            return parseMap(defaultJSONParser, (Map<Object, Object>) map, type3, type2, obj);
        }
        return defaultJSONParser.parseObject(map, obj);
    }

    public static Object parseMap(DefaultJSONParser defaultJSONParser, Map<Object, Object> map, Type type, Type type2, Object obj) {
        Object objDeserialze;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() != 12 && jSONLexer.token() != 16) {
            throw new JSONException("syntax error, expect {, actual " + jSONLexer.tokenName());
        }
        ObjectDeserializer deserializer = defaultJSONParser.getConfig().getDeserializer(type);
        ObjectDeserializer deserializer2 = defaultJSONParser.getConfig().getDeserializer(type2);
        jSONLexer.nextToken(deserializer.getFastMatchToken());
        ParseContext context = defaultJSONParser.getContext();
        while (jSONLexer.token() != 13) {
            try {
                Object obj2 = null;
                if (jSONLexer.token() == 4 && jSONLexer.isRef() && !jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                    jSONLexer.nextTokenWithColon(4);
                    if (jSONLexer.token() == 4) {
                        String strStringVal = jSONLexer.stringVal();
                        if ("..".equals(strStringVal)) {
                            obj2 = context.parent.object;
                        } else if ("$".equals(strStringVal)) {
                            ParseContext parseContext = context;
                            while (true) {
                                ParseContext parseContext2 = parseContext.parent;
                                if (parseContext2 == null) {
                                    break;
                                }
                                parseContext = parseContext2;
                            }
                            obj2 = parseContext.object;
                        } else {
                            defaultJSONParser.addResolveTask(new DefaultJSONParser.ResolveTask(context, strStringVal));
                            defaultJSONParser.setResolveStatus(1);
                        }
                        jSONLexer.nextToken(13);
                        if (jSONLexer.token() == 13) {
                            jSONLexer.nextToken(16);
                            return obj2;
                        }
                        throw new JSONException("illegal ref");
                    }
                    throw new JSONException("illegal ref, " + JSONToken.name(jSONLexer.token()));
                }
                if (map.size() == 0 && jSONLexer.token() == 4 && JSON.DEFAULT_TYPE_KEY.equals(jSONLexer.stringVal()) && !jSONLexer.isEnabled(Feature.DisableSpecialKeyDetect)) {
                    jSONLexer.nextTokenWithColon(4);
                    jSONLexer.nextToken(16);
                    if (jSONLexer.token() == 13) {
                        jSONLexer.nextToken();
                        return map;
                    }
                    jSONLexer.nextToken(deserializer.getFastMatchToken());
                }
                if (jSONLexer.token() == 4 && (deserializer instanceof JavaBeanDeserializer)) {
                    String strStringVal2 = jSONLexer.stringVal();
                    jSONLexer.nextToken();
                    DefaultJSONParser defaultJSONParser2 = new DefaultJSONParser(strStringVal2, defaultJSONParser.getConfig(), defaultJSONParser.getLexer().getFeatures());
                    defaultJSONParser2.setDateFormat(defaultJSONParser.getDateFomartPattern());
                    objDeserialze = deserializer.deserialze(defaultJSONParser2, type, null);
                } else {
                    objDeserialze = deserializer.deserialze(defaultJSONParser, type, null);
                }
                if (jSONLexer.token() == 17) {
                    jSONLexer.nextToken(deserializer2.getFastMatchToken());
                    Object objDeserialze2 = deserializer2.deserialze(defaultJSONParser, type2, objDeserialze);
                    defaultJSONParser.checkMapResolve(map, objDeserialze);
                    map.put(objDeserialze, objDeserialze2);
                    if (jSONLexer.token() == 16) {
                        jSONLexer.nextToken(deserializer.getFastMatchToken());
                    }
                } else {
                    throw new JSONException("syntax error, expect :, actual " + jSONLexer.token());
                }
            } finally {
                defaultJSONParser.setContext(context);
            }
        }
        jSONLexer.nextToken(16);
        return map;
    }
}
