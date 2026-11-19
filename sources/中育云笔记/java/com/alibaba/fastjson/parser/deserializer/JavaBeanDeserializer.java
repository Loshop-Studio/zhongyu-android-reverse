package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public class JavaBeanDeserializer implements ObjectDeserializer {
    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    private final ParserConfig.AutoTypeCheckHandler autoTypeCheckHandler;
    public final JavaBeanInfo beanInfo;
    protected final Class<?> clazz;
    private ConcurrentMap<String, Object> extraFieldDeserializers;
    private Map<String, FieldDeserializer> fieldDeserializerMap;
    private final FieldDeserializer[] fieldDeserializers;
    private transient long[] hashArray;
    private transient short[] hashArrayMapping;
    private transient long[] smartMatchHashArray;
    private transient short[] smartMatchHashArrayMapping;
    protected final FieldDeserializer[] sortedFieldDeserializers;

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls) {
        this(parserConfig, cls, cls);
    }

    private Object createFactoryInstance(ParserConfig parserConfig, Object obj) {
        return this.beanInfo.factoryMethod.invoke(null, obj);
    }

    public static JavaBeanDeserializer getSeeAlso(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, String str) {
        JSONType jSONType = javaBeanInfo.jsonType;
        if (jSONType == null) {
            return null;
        }
        for (Class<?> cls : jSONType.seeAlso()) {
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            if (deserializer instanceof JavaBeanDeserializer) {
                JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                JavaBeanInfo javaBeanInfo2 = javaBeanDeserializer.beanInfo;
                if (javaBeanInfo2.typeName.equals(str)) {
                    return javaBeanDeserializer;
                }
                JavaBeanDeserializer seeAlso = getSeeAlso(parserConfig, javaBeanInfo2, str);
                if (seeAlso != null) {
                    return seeAlso;
                }
            }
        }
        return null;
    }

    public static boolean isSetFlag(int i10, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        int i11 = i10 / 32;
        int i12 = i10 % 32;
        if (i11 < iArr.length) {
            if (((1 << i12) & iArr[i11]) != 0) {
                return true;
            }
        }
        return false;
    }

    public static void parseArray(Collection collection, ObjectDeserializer objectDeserializer, DefaultJSONParser defaultJSONParser, Type type, Object obj) throws NumberFormatException {
        JSONLexerBase jSONLexerBase = (JSONLexerBase) defaultJSONParser.lexer;
        int i10 = jSONLexerBase.token();
        if (i10 == 8) {
            jSONLexerBase.nextToken(16);
            jSONLexerBase.token();
            return;
        }
        if (i10 != 14) {
            defaultJSONParser.throwException(i10);
        }
        if (jSONLexerBase.getCurrent() == '[') {
            jSONLexerBase.next();
            jSONLexerBase.setToken(14);
        } else {
            jSONLexerBase.nextToken(14);
        }
        if (jSONLexerBase.token() == 15) {
            jSONLexerBase.nextToken();
            return;
        }
        int i11 = 0;
        while (true) {
            collection.add(objectDeserializer.deserialze(defaultJSONParser, type, Integer.valueOf(i11)));
            i11++;
            if (jSONLexerBase.token() != 16) {
                break;
            }
            if (jSONLexerBase.getCurrent() == '[') {
                jSONLexerBase.next();
                jSONLexerBase.setToken(14);
            } else {
                jSONLexerBase.nextToken(14);
            }
        }
        int i12 = jSONLexerBase.token();
        if (i12 != 15) {
            defaultJSONParser.throwException(i12);
        }
        if (jSONLexerBase.getCurrent() != ',') {
            jSONLexerBase.nextToken(16);
        } else {
            jSONLexerBase.next();
            jSONLexerBase.setToken(16);
        }
    }

    public void check(JSONLexer jSONLexer, int i10) {
        if (jSONLexer.token() != i10) {
            throw new JSONException("syntax error");
        }
    }

    public Object createInstance(DefaultJSONParser defaultJSONParser, Type type) {
        Object objNewInstance;
        if ((type instanceof Class) && this.clazz.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new JSONObject());
        }
        JavaBeanInfo javaBeanInfo = this.beanInfo;
        Constructor<?> constructor = javaBeanInfo.defaultConstructor;
        Object obj = null;
        if (constructor == null && javaBeanInfo.factoryMethod == null) {
            return null;
        }
        Method method = javaBeanInfo.factoryMethod;
        if (method != null && javaBeanInfo.defaultConstructorParameterSize > 0) {
            return null;
        }
        try {
            if (javaBeanInfo.defaultConstructorParameterSize == 0) {
                objNewInstance = constructor != null ? constructor.newInstance(null) : method.invoke(null, null);
            } else {
                ParseContext context = defaultJSONParser.getContext();
                if (context == null || context.object == null) {
                    throw new JSONException("can't create non-static inner class instance.");
                }
                if (!(type instanceof Class)) {
                    throw new JSONException("can't create non-static inner class instance.");
                }
                String name = ((Class) type).getName();
                String strSubstring = name.substring(0, name.lastIndexOf(36));
                Object obj2 = context.object;
                String name2 = obj2.getClass().getName();
                if (!name2.equals(strSubstring)) {
                    ParseContext parseContext = context.parent;
                    if (parseContext == null || parseContext.object == null || !("java.util.ArrayList".equals(name2) || "java.util.List".equals(name2) || "java.util.Collection".equals(name2) || "java.util.Map".equals(name2) || "java.util.HashMap".equals(name2))) {
                        obj = obj2;
                    } else if (parseContext.object.getClass().getName().equals(strSubstring)) {
                        obj = parseContext.object;
                    }
                    obj2 = obj;
                }
                if (obj2 == null || ((obj2 instanceof Collection) && ((Collection) obj2).isEmpty())) {
                    throw new JSONException("can't create non-static inner class instance.");
                }
                objNewInstance = constructor.newInstance(obj2);
            }
            if (defaultJSONParser != null && defaultJSONParser.lexer.isEnabled(Feature.InitStringFieldAsEmpty)) {
                for (FieldInfo fieldInfo : this.beanInfo.fields) {
                    if (fieldInfo.fieldClass == String.class) {
                        try {
                            fieldInfo.set(objNewInstance, "");
                        } catch (Exception e10) {
                            throw new JSONException("create instance error, class " + this.clazz.getName(), e10);
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (JSONException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new JSONException("create instance error, class " + this.clazz.getName(), e12);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, 0);
    }

    public <T> T deserialzeArrayMapping(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() != 14) {
            throw new JSONException("error");
        }
        String strScanTypeName = jSONLexer.scanTypeName(defaultJSONParser.symbolTable);
        if (strScanTypeName != null) {
            ObjectDeserializer seeAlso = getSeeAlso(defaultJSONParser.getConfig(), this.beanInfo, strScanTypeName);
            if (seeAlso == null) {
                seeAlso = defaultJSONParser.getConfig().getDeserializer(defaultJSONParser.getConfig().checkAutoType(strScanTypeName, TypeUtils.getClass(type), jSONLexer.getFeatures()));
            }
            if (seeAlso instanceof JavaBeanDeserializer) {
                return (T) ((JavaBeanDeserializer) seeAlso).deserialzeArrayMapping(defaultJSONParser, type, obj, obj2);
            }
        }
        T t10 = (T) createInstance(defaultJSONParser, type);
        int length = this.sortedFieldDeserializers.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char c10 = i10 == length + (-1) ? ']' : ',';
            FieldDeserializer fieldDeserializer = this.sortedFieldDeserializers[i10];
            Class<?> cls = fieldDeserializer.fieldInfo.fieldClass;
            if (cls == Integer.TYPE) {
                fieldDeserializer.setValue((Object) t10, jSONLexer.scanInt(c10));
            } else if (cls == String.class) {
                fieldDeserializer.setValue((Object) t10, jSONLexer.scanString(c10));
            } else if (cls == Long.TYPE) {
                fieldDeserializer.setValue(t10, jSONLexer.scanLong(c10));
            } else if (cls.isEnum()) {
                char current = jSONLexer.getCurrent();
                fieldDeserializer.setValue(t10, (current == '\"' || current == 'n') ? jSONLexer.scanEnum(cls, defaultJSONParser.getSymbolTable(), c10) : (current < '0' || current > '9') ? scanEnum(jSONLexer, c10) : ((EnumDeserializer) ((DefaultFieldDeserializer) fieldDeserializer).getFieldValueDeserilizer(defaultJSONParser.getConfig())).valueOf(jSONLexer.scanInt(c10)));
            } else if (cls == Boolean.TYPE) {
                fieldDeserializer.setValue(t10, jSONLexer.scanBoolean(c10));
            } else if (cls == Float.TYPE) {
                fieldDeserializer.setValue(t10, Float.valueOf(jSONLexer.scanFloat(c10)));
            } else if (cls == Double.TYPE) {
                fieldDeserializer.setValue(t10, Double.valueOf(jSONLexer.scanDouble(c10)));
            } else if (cls == Date.class && jSONLexer.getCurrent() == '1') {
                fieldDeserializer.setValue(t10, new Date(jSONLexer.scanLong(c10)));
            } else if (cls == BigDecimal.class) {
                fieldDeserializer.setValue(t10, jSONLexer.scanDecimal(c10));
            } else {
                jSONLexer.nextToken(14);
                FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                fieldDeserializer.setValue(t10, defaultJSONParser.parseObject(fieldInfo.fieldType, fieldInfo.name));
                if (jSONLexer.token() == 15) {
                    break;
                }
                check(jSONLexer, c10 == ']' ? 15 : 16);
            }
            i10++;
        }
        jSONLexer.nextToken(16);
        return t10;
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public int getFastMatchToken() {
        return 12;
    }

    public FieldDeserializer getFieldDeserializer(String str) {
        return getFieldDeserializer(str, null);
    }

    public Type getFieldType(int i10) {
        return this.sortedFieldDeserializers[i10].fieldInfo.fieldType;
    }

    public boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map) {
        return parseField(defaultJSONParser, str, obj, type, map, null);
    }

    public Object parseRest(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2, int i10) {
        return parseRest(defaultJSONParser, type, obj, obj2, i10, new int[0]);
    }

    public Enum<?> scanEnum(JSONLexer jSONLexer, char c10) {
        throw new JSONException("illegal enum. " + jSONLexer.info());
    }

    public FieldDeserializer smartMatch(String str) {
        return smartMatch(str, null);
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type) {
        this(parserConfig, JavaBeanInfo.build(cls, type, parserConfig.propertyNamingStrategy, parserConfig.fieldBased, parserConfig.compatibleWithJavaBean, parserConfig.isJacksonCompatible()));
    }

    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj, int i10) {
        return (T) deserialze(defaultJSONParser, type, obj, null, i10, null);
    }

    public FieldDeserializer getFieldDeserializer(String str, int[] iArr) {
        FieldDeserializer fieldDeserializer;
        if (str == null) {
            return null;
        }
        Map<String, FieldDeserializer> map = this.fieldDeserializerMap;
        if (map != null && (fieldDeserializer = map.get(str)) != null) {
            return fieldDeserializer;
        }
        int length = this.sortedFieldDeserializers.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            int iCompareTo = this.sortedFieldDeserializers[i11].fieldInfo.name.compareTo(str);
            if (iCompareTo < 0) {
                i10 = i11 + 1;
            } else {
                if (iCompareTo <= 0) {
                    if (isSetFlag(i11, iArr)) {
                        return null;
                    }
                    return this.sortedFieldDeserializers[i11];
                }
                length = i11 - 1;
            }
        }
        Map<String, FieldDeserializer> map2 = this.alterNameFieldDeserializers;
        if (map2 != null) {
            return map2.get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean parseField(com.alibaba.fastjson.parser.DefaultJSONParser r21, java.lang.String r22, java.lang.Object r23, java.lang.reflect.Type r24, java.util.Map<java.lang.String, java.lang.Object> r25, int[] r26) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.parseField(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.String, java.lang.Object, java.lang.reflect.Type, java.util.Map, int[]):boolean");
    }

    public Object parseRest(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2, int i10, int[] iArr) {
        return deserialze(defaultJSONParser, type, obj, obj2, i10, iArr);
    }

    public Enum scanEnum(JSONLexerBase jSONLexerBase, char[] cArr, ObjectDeserializer objectDeserializer) {
        EnumDeserializer enumDeserializer = objectDeserializer instanceof EnumDeserializer ? (EnumDeserializer) objectDeserializer : null;
        if (enumDeserializer == null) {
            jSONLexerBase.matchStat = -1;
            return null;
        }
        long jScanEnumSymbol = jSONLexerBase.scanEnumSymbol(cArr);
        if (jSONLexerBase.matchStat <= 0) {
            return null;
        }
        Enum enumByHashCode = enumDeserializer.getEnumByHashCode(jScanEnumSymbol);
        if (enumByHashCode == null) {
            if (jScanEnumSymbol == -3750763034362895579L) {
                return null;
            }
            if (jSONLexerBase.isEnabled(Feature.ErrorOnEnumNotMatch)) {
                throw new JSONException("not match enum value, " + enumDeserializer.enumClass);
            }
        }
        return enumByHashCode;
    }

    public FieldDeserializer smartMatch(String str, int[] iArr) {
        boolean zStartsWith;
        if (str == null) {
            return null;
        }
        FieldDeserializer fieldDeserializer = getFieldDeserializer(str, iArr);
        if (fieldDeserializer == null) {
            int i10 = 0;
            if (this.smartMatchHashArray == null) {
                long[] jArr = new long[this.sortedFieldDeserializers.length];
                int i11 = 0;
                while (true) {
                    FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                    if (i11 >= fieldDeserializerArr.length) {
                        break;
                    }
                    jArr[i11] = fieldDeserializerArr[i11].fieldInfo.nameHashCode;
                    i11++;
                }
                Arrays.sort(jArr);
                this.smartMatchHashArray = jArr;
            }
            int iBinarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv1a_64_lower(str));
            if (iBinarySearch < 0) {
                iBinarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv1a_64_extract(str));
            }
            if (iBinarySearch < 0) {
                zStartsWith = str.startsWith("is");
                if (zStartsWith) {
                    iBinarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv1a_64_extract(str.substring(2)));
                }
            } else {
                zStartsWith = false;
            }
            if (iBinarySearch >= 0) {
                if (this.smartMatchHashArrayMapping == null) {
                    short[] sArr = new short[this.smartMatchHashArray.length];
                    Arrays.fill(sArr, (short) -1);
                    while (true) {
                        FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                        if (i10 >= fieldDeserializerArr2.length) {
                            break;
                        }
                        int iBinarySearch2 = Arrays.binarySearch(this.smartMatchHashArray, fieldDeserializerArr2[i10].fieldInfo.nameHashCode);
                        if (iBinarySearch2 >= 0) {
                            sArr[iBinarySearch2] = (short) i10;
                        }
                        i10++;
                    }
                    this.smartMatchHashArrayMapping = sArr;
                }
                short s10 = this.smartMatchHashArrayMapping[iBinarySearch];
                if (s10 != -1 && !isSetFlag(s10, iArr)) {
                    fieldDeserializer = this.sortedFieldDeserializers[s10];
                }
            }
            if (fieldDeserializer != null) {
                FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                if ((fieldInfo.parserFeatures & Feature.DisableFieldSmartMatch.mask) != 0) {
                    return null;
                }
                Class<?> cls = fieldInfo.fieldClass;
                if (zStartsWith && cls != Boolean.TYPE && cls != Boolean.class) {
                    return null;
                }
            }
        }
        return fieldDeserializer;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r44, java.lang.reflect.Type r45, java.lang.Object r46, java.lang.Object r47, int r48, int[] r49) {
        /*
            Method dump skipped, instructions count: 2642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object, int, int[]):java.lang.Object");
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo) throws IllegalAccessException, InstantiationException {
        ParserConfig.AutoTypeCheckHandler autoTypeCheckHandlerNewInstance;
        this.clazz = javaBeanInfo.clazz;
        this.beanInfo = javaBeanInfo;
        JSONType jSONType = javaBeanInfo.jsonType;
        HashMap map = null;
        if (jSONType == null || jSONType.autoTypeCheckHandler() == ParserConfig.AutoTypeCheckHandler.class) {
            autoTypeCheckHandlerNewInstance = null;
        } else {
            try {
                autoTypeCheckHandlerNewInstance = javaBeanInfo.jsonType.autoTypeCheckHandler().newInstance();
            } catch (Exception unused) {
            }
        }
        this.autoTypeCheckHandler = autoTypeCheckHandlerNewInstance;
        FieldInfo[] fieldInfoArr = javaBeanInfo.sortedFields;
        this.sortedFieldDeserializers = new FieldDeserializer[fieldInfoArr.length];
        int length = fieldInfoArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            FieldInfo fieldInfo = javaBeanInfo.sortedFields[i10];
            FieldDeserializer fieldDeserializerCreateFieldDeserializer = parserConfig.createFieldDeserializer(parserConfig, javaBeanInfo, fieldInfo);
            this.sortedFieldDeserializers[i10] = fieldDeserializerCreateFieldDeserializer;
            if (length > 128) {
                if (this.fieldDeserializerMap == null) {
                    this.fieldDeserializerMap = new HashMap();
                }
                this.fieldDeserializerMap.put(fieldInfo.name, fieldDeserializerCreateFieldDeserializer);
            }
            for (String str : fieldInfo.alternateNames) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, fieldDeserializerCreateFieldDeserializer);
            }
        }
        this.alterNameFieldDeserializers = map;
        FieldInfo[] fieldInfoArr2 = javaBeanInfo.fields;
        this.fieldDeserializers = new FieldDeserializer[fieldInfoArr2.length];
        int length2 = fieldInfoArr2.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.fieldDeserializers[i11] = getFieldDeserializer(javaBeanInfo.fields[i11].name);
        }
    }

    public FieldDeserializer getFieldDeserializer(long j10) {
        int i10 = 0;
        if (this.hashArray == null) {
            long[] jArr = new long[this.sortedFieldDeserializers.length];
            int i11 = 0;
            while (true) {
                FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                if (i11 >= fieldDeserializerArr.length) {
                    break;
                }
                jArr[i11] = TypeUtils.fnv1a_64(fieldDeserializerArr[i11].fieldInfo.name);
                i11++;
            }
            Arrays.sort(jArr);
            this.hashArray = jArr;
        }
        int iBinarySearch = Arrays.binarySearch(this.hashArray, j10);
        if (iBinarySearch < 0) {
            return null;
        }
        if (this.hashArrayMapping == null) {
            short[] sArr = new short[this.hashArray.length];
            Arrays.fill(sArr, (short) -1);
            while (true) {
                FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                if (i10 >= fieldDeserializerArr2.length) {
                    break;
                }
                int iBinarySearch2 = Arrays.binarySearch(this.hashArray, TypeUtils.fnv1a_64(fieldDeserializerArr2[i10].fieldInfo.name));
                if (iBinarySearch2 >= 0) {
                    sArr[iBinarySearch2] = (short) i10;
                }
                i10++;
            }
            this.hashArrayMapping = sArr;
        }
        short s10 = this.hashArrayMapping[iBinarySearch];
        if (s10 != -1) {
            return this.sortedFieldDeserializers[s10];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createInstance(java.util.Map<java.lang.String, java.lang.Object> r22, com.alibaba.fastjson.parser.ParserConfig r23) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ArrayIndexOutOfBoundsException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.createInstance(java.util.Map, com.alibaba.fastjson.parser.ParserConfig):java.lang.Object");
    }
}
