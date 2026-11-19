package com.alibaba.fastjson.util;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import anetwork.channel.util.RequestConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ExceptionCode;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.sql.Clob;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p265nd.AbstractC10399d;
import p265nd.C10398c;
import p265nd.C10400e;
import p265nd.C10405j;
import p265nd.C10408m;
import p280od.InterfaceC10473g;
import p280od.InterfaceC10477k;
import p309qc.InterfaceC10774e;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes3.dex */
public class TypeUtils {
    private static Class class_deque;
    public static boolean compatibleWithFieldName;
    public static boolean compatibleWithJavaBean;
    private static volatile Map<Class, String[]> kotlinIgnores;
    private static volatile boolean kotlinIgnores_error;
    private static volatile boolean kotlin_class_klass_error;
    private static volatile boolean kotlin_error;
    private static volatile Constructor kotlin_kclass_constructor;
    private static volatile Method kotlin_kclass_getConstructors;
    private static volatile Method kotlin_kfunction_getParameters;
    private static volatile Method kotlin_kparameter_getName;
    private static volatile Class kotlin_metadata;
    private static volatile boolean kotlin_metadata_error;
    private static Class<?> optionalClass;
    private static Method oracleDateMethod;
    private static Method oracleTimestampMethod;
    private static Class<?> pathClass;
    private static Class<? extends Annotation> transientClass;
    private static final Pattern NUMBER_WITH_TRAILING_ZEROS_PATTERN = Pattern.compile("\\.0*$");
    private static boolean setAccessibleEnable = true;
    private static boolean oracleTimestampMethodInited = false;
    private static boolean oracleDateMethodInited = false;
    private static boolean optionalClassInited = false;
    private static boolean transientClassInited = false;
    private static Class<? extends Annotation> class_OneToMany = null;
    private static boolean class_OneToMany_error = false;
    private static Class<? extends Annotation> class_ManyToMany = null;
    private static boolean class_ManyToMany_error = false;
    private static Method method_HibernateIsInitialized = null;
    private static boolean method_HibernateIsInitialized_error = false;
    private static ConcurrentMap<String, Class<?>> mappings = new ConcurrentHashMap(256, 0.75f, 1);
    private static boolean pathClass_error = false;
    private static Class<? extends Annotation> class_JacksonCreator = null;
    private static boolean class_JacksonCreator_error = false;
    private static volatile Class class_Clob = null;
    private static volatile boolean class_Clob_error = false;
    private static volatile Class class_XmlAccessType = null;
    private static volatile Class class_XmlAccessorType = null;
    private static volatile boolean classXmlAccessorType_error = false;
    private static volatile Method method_XmlAccessorType_value = null;
    private static volatile Field field_XmlAccessType_FIELD = null;
    private static volatile Object field_XmlAccessType_FIELD_VALUE = null;

    static {
        compatibleWithJavaBean = false;
        compatibleWithFieldName = false;
        class_deque = null;
        try {
            compatibleWithJavaBean = RequestConstant.TRUE.equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHJAVABEAN));
            compatibleWithFieldName = RequestConstant.TRUE.equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME));
        } catch (Throwable unused) {
        }
        try {
            class_deque = Deque.class;
        } catch (Throwable unused2) {
        }
        addBaseClassMappings();
    }

    private static void addBaseClassMappings() {
        mappings.put("byte", Byte.TYPE);
        mappings.put("short", Short.TYPE);
        mappings.put("int", Integer.TYPE);
        mappings.put("long", Long.TYPE);
        mappings.put(TypedValues.Custom.S_FLOAT, Float.TYPE);
        mappings.put("double", Double.TYPE);
        mappings.put(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        mappings.put("char", Character.TYPE);
        mappings.put("[byte", byte[].class);
        mappings.put("[short", short[].class);
        mappings.put("[int", int[].class);
        mappings.put("[long", long[].class);
        mappings.put("[float", float[].class);
        mappings.put("[double", double[].class);
        mappings.put("[boolean", boolean[].class);
        mappings.put("[char", char[].class);
        mappings.put("[B", byte[].class);
        mappings.put("[S", short[].class);
        mappings.put("[I", int[].class);
        mappings.put("[J", long[].class);
        mappings.put("[F", float[].class);
        mappings.put("[D", double[].class);
        mappings.put("[C", char[].class);
        mappings.put("[Z", boolean[].class);
        Class<?>[] clsArr = {Object.class, Cloneable.class, loadClass("java.lang.AutoCloseable"), Exception.class, RuntimeException.class, IllegalAccessError.class, IllegalAccessException.class, IllegalArgumentException.class, IllegalMonitorStateException.class, IllegalStateException.class, IllegalThreadStateException.class, IndexOutOfBoundsException.class, InstantiationError.class, InstantiationException.class, InternalError.class, InterruptedException.class, LinkageError.class, NegativeArraySizeException.class, NoClassDefFoundError.class, NoSuchFieldError.class, NoSuchFieldException.class, NoSuchMethodError.class, NoSuchMethodException.class, NullPointerException.class, NumberFormatException.class, OutOfMemoryError.class, SecurityException.class, StackOverflowError.class, StringIndexOutOfBoundsException.class, TypeNotPresentException.class, VerifyError.class, StackTraceElement.class, HashMap.class, Hashtable.class, TreeMap.class, java.util.IdentityHashMap.class, WeakHashMap.class, LinkedHashMap.class, HashSet.class, LinkedHashSet.class, TreeSet.class, ArrayList.class, TimeUnit.class, ConcurrentHashMap.class, AtomicInteger.class, AtomicLong.class, Collections.EMPTY_MAP.getClass(), Boolean.class, Character.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, Number.class, String.class, BigDecimal.class, BigInteger.class, BitSet.class, Calendar.class, Date.class, Locale.class, UUID.class, Time.class, java.sql.Date.class, Timestamp.class, SimpleDateFormat.class, JSONObject.class, JSONPObject.class, JSONArray.class};
        for (int i10 = 0; i10 < 71; i10++) {
            Class<?> cls = clsArr[i10];
            if (cls != null) {
                mappings.put(cls.getName(), cls);
            }
        }
    }

    public static void addMapping(String str, Class<?> cls) {
        mappings.put(str, cls);
    }

    public static SerializeBeanInfo buildBeanInfo(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy) {
        return buildBeanInfo(cls, map, propertyNamingStrategy, false);
    }

    public static byte byteValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return (byte) 0;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.byteValueExact() : bigDecimal.byteValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Object obj2;
        Class<T> cls2 = Boolean.TYPE;
        Class<T> cls3 = Double.TYPE;
        Class<T> cls4 = Float.TYPE;
        Class<T> cls5 = Byte.TYPE;
        Class<T> cls6 = Short.TYPE;
        Class<T> cls7 = Long.TYPE;
        Class<T> cls8 = Integer.TYPE;
        int i10 = 0;
        if (obj == 0) {
            if (cls == cls8) {
                return (T) 0;
            }
            if (cls == cls7) {
                return (T) 0L;
            }
            if (cls == cls6) {
                return (T) (short) 0;
            }
            if (cls == cls5) {
                return (T) (byte) 0;
            }
            if (cls == cls4) {
                return (T) Float.valueOf(0.0f);
            }
            if (cls == cls3) {
                return (T) Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            if (cls == cls2) {
                return (T) Boolean.FALSE;
            }
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls != obj.getClass()) {
            if (!(obj instanceof Map)) {
                if (cls.isArray()) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        T t10 = (T) Array.newInstance(cls.getComponentType(), collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Array.set(t10, i10, cast(it.next(), (Class) cls.getComponentType(), parserConfig));
                            i10++;
                        }
                        return t10;
                    }
                    if (cls == byte[].class) {
                        return (T) castToBytes(obj);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == cls2 || cls == Boolean.class) {
                        return (T) castToBoolean(obj);
                    }
                    if (cls == cls5 || cls == Byte.class) {
                        return (T) castToByte(obj);
                    }
                    if (cls == Character.TYPE || cls == Character.class) {
                        return (T) castToChar(obj);
                    }
                    if (cls == cls6 || cls == Short.class) {
                        return (T) castToShort(obj);
                    }
                    if (cls == cls8 || cls == Integer.class) {
                        return (T) castToInt(obj);
                    }
                    if (cls == cls7 || cls == Long.class) {
                        return (T) castToLong(obj);
                    }
                    if (cls == cls4 || cls == Float.class) {
                        return (T) castToFloat(obj);
                    }
                    if (cls == cls3 || cls == Double.class) {
                        return (T) castToDouble(obj);
                    }
                    if (cls == String.class) {
                        return (T) castToString(obj);
                    }
                    if (cls == BigDecimal.class) {
                        return (T) castToBigDecimal(obj);
                    }
                    if (cls == BigInteger.class) {
                        return (T) castToBigInteger(obj);
                    }
                    if (cls == Date.class) {
                        return (T) castToDate(obj);
                    }
                    if (cls == java.sql.Date.class) {
                        return (T) castToSqlDate(obj);
                    }
                    if (cls == Time.class) {
                        return (T) castToSqlTime(obj);
                    }
                    if (cls == Timestamp.class) {
                        return (T) castToTimestamp(obj);
                    }
                    if (cls.isEnum()) {
                        return (T) castToEnum(obj, cls, parserConfig);
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date dateCastToDate = castToDate(obj);
                        if (cls == Calendar.class) {
                            obj2 = (T) Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
                        } else {
                            try {
                                obj2 = (T) ((Calendar) cls.newInstance());
                            } catch (Exception e10) {
                                throw new JSONException("can not cast to : " + cls.getName(), e10);
                            }
                        }
                        ((Calendar) obj2).setTime(dateCastToDate);
                        return (T) obj2;
                    }
                    String name = cls.getName();
                    if (name.equals("javax.xml.datatype.XMLGregorianCalendar")) {
                        Date dateCastToDate2 = castToDate(obj);
                        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
                        calendar.setTime(dateCastToDate2);
                        return (T) CalendarCodec.instance.createXMLGregorianCalendar(calendar);
                    }
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                            return null;
                        }
                        if (cls == Currency.class) {
                            return (T) Currency.getInstance(str);
                        }
                        if (cls == Locale.class) {
                            return (T) toLocale(str);
                        }
                        if (name.startsWith("java.time.")) {
                            return (T) JSON.parseObject(JSON.toJSONString(str), cls);
                        }
                    }
                    if (parserConfig.get(cls) != null) {
                        return (T) JSON.parseObject(JSON.toJSONString(obj), cls);
                    }
                    throw new JSONException("can not cast to : " + cls.getName());
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey(JSON.DEFAULT_TYPE_KEY)) {
                    return (T) castToJavaBean(map, cls, parserConfig);
                }
            }
        }
        return obj;
    }

    public static BigDecimal castToBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            Float f10 = (Float) obj;
            if (Float.isNaN(f10.floatValue()) || Float.isInfinite(f10.floatValue())) {
                return null;
            }
        } else if (obj instanceof Double) {
            Double d10 = (Double) obj;
            if (Double.isNaN(d10.doubleValue()) || Double.isInfinite(d10.doubleValue())) {
                return null;
            }
        } else {
            if (obj instanceof BigDecimal) {
                return (BigDecimal) obj;
            }
            if (obj instanceof BigInteger) {
                return new BigDecimal((BigInteger) obj);
            }
            if ((obj instanceof Map) && ((Map) obj).size() == 0) {
                return null;
            }
        }
        String string = obj.toString();
        if (string.length() == 0 || string.equalsIgnoreCase("null")) {
            return null;
        }
        if (string.length() <= 65535) {
            return new BigDecimal(string);
        }
        throw new JSONException("decimal overflow");
    }

    public static BigInteger castToBigInteger(Object obj) {
        BigDecimal bigDecimal;
        int iScale;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Float) {
            Float f10 = (Float) obj;
            if (Float.isNaN(f10.floatValue()) || Float.isInfinite(f10.floatValue())) {
                return null;
            }
            return BigInteger.valueOf(f10.longValue());
        }
        if (obj instanceof Double) {
            Double d10 = (Double) obj;
            if (Double.isNaN(d10.doubleValue()) || Double.isInfinite(d10.doubleValue())) {
                return null;
            }
            return BigInteger.valueOf(d10.longValue());
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof BigDecimal) && (iScale = (bigDecimal = (BigDecimal) obj).scale()) > -1000 && iScale < 1000) {
            return bigDecimal.toBigInteger();
        }
        String string = obj.toString();
        if (string.length() == 0 || string.equalsIgnoreCase("null")) {
            return null;
        }
        if (string.length() <= 65535) {
            return new BigInteger(string);
        }
        throw new JSONException("decimal overflow");
    }

    public static Boolean castToBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof BigDecimal) {
            return Boolean.valueOf(intValue((BigDecimal) obj) == 1);
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (RequestConstant.TRUE.equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if (RequestConstant.FALSE.equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
            if ("Y".equalsIgnoreCase(str) || ExifInterface.GPS_DIRECTION_TRUE.equals(str)) {
                return Boolean.TRUE;
            }
            if ("F".equalsIgnoreCase(str) || "N".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new JSONException("can not cast to boolean, value : " + obj);
    }

    public static Byte castToByte(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Byte.valueOf(byteValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            return Byte.valueOf(Byte.parseByte(str));
        }
        if (obj instanceof Boolean) {
            return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
        }
        throw new JSONException("can not cast to byte, value : " + obj);
    }

    public static byte[] castToBytes(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return IOUtils.decodeBase64((String) obj);
        }
        throw new JSONException("can not cast to byte[], value : " + obj);
    }

    public static Character castToChar(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            throw new JSONException("can not cast to char, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new JSONException("can not cast to char, value : " + obj);
    }

    public static Date castToDate(Object obj) {
        return castToDate(obj, null);
    }

    public static Double castToDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : AudioStats.AUDIO_AMPLITUDE_NONE);
            }
            throw new JSONException("can not cast to double, value : " + obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        if (string.indexOf(44) != -1) {
            string = string.replaceAll(",", "");
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    public static <T> T castToEnum(Object obj, Class<T> cls, ParserConfig parserConfig) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                if (parserConfig == null) {
                    parserConfig = ParserConfig.getGlobalInstance();
                }
                ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
                return deserializer instanceof EnumDeserializer ? (T) ((EnumDeserializer) deserializer).getEnumByHashCode(fnv1a_64(str)) : (T) Enum.valueOf(cls, str);
            }
            if (obj instanceof BigDecimal) {
                int iIntValue = intValue((BigDecimal) obj);
                T[] enumConstants = cls.getEnumConstants();
                if (iIntValue < enumConstants.length) {
                    return enumConstants[iIntValue];
                }
            }
            if (obj instanceof Number) {
                int iIntValue2 = ((Number) obj).intValue();
                T[] enumConstants2 = cls.getEnumConstants();
                if (iIntValue2 < enumConstants2.length) {
                    return enumConstants2[iIntValue2];
                }
            }
            throw new JSONException("can not cast to : " + cls.getName());
        } catch (Exception e10) {
            throw new JSONException("can not cast to : " + cls.getName(), e10);
        }
    }

    public static Float castToFloat(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            if (obj instanceof Boolean) {
                return Float.valueOf(((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
            }
            throw new JSONException("can not cast to float, value : " + obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        if (string.indexOf(44) != -1) {
            string = string.replaceAll(",", "");
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    public static Integer castToInt(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            return Integer.valueOf(intValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String strReplaceAll = (String) obj;
            if (strReplaceAll.length() == 0 || "null".equals(strReplaceAll) || "NULL".equals(strReplaceAll)) {
                return null;
            }
            if (strReplaceAll.indexOf(44) != -1) {
                strReplaceAll = strReplaceAll.replaceAll(",", "");
            }
            Matcher matcher = NUMBER_WITH_TRAILING_ZEROS_PATTERN.matcher(strReplaceAll);
            if (matcher.find()) {
                strReplaceAll = matcher.replaceAll("");
            }
            return Integer.valueOf(Integer.parseInt(strReplaceAll));
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return castToInt(it.next());
            }
        }
        throw new JSONException("can not cast to int, value : " + obj);
    }

    public static <T> T castToJavaBean(Object obj, Class<T> cls) {
        return (T) cast(obj, (Class) cls, ParserConfig.getGlobalInstance());
    }

    public static Long castToLong(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Long.valueOf(longValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String strReplaceAll = (String) obj;
            if (strReplaceAll.length() == 0 || "null".equals(strReplaceAll) || "NULL".equals(strReplaceAll)) {
                return null;
            }
            if (strReplaceAll.indexOf(44) != -1) {
                strReplaceAll = strReplaceAll.replaceAll(",", "");
            }
            try {
                return Long.valueOf(Long.parseLong(strReplaceAll));
            } catch (NumberFormatException unused) {
                JSONScanner jSONScanner = new JSONScanner(strReplaceAll);
                Calendar calendar = jSONScanner.scanISO8601DateIfMatch(false) ? jSONScanner.getCalendar() : null;
                jSONScanner.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.size() == 2 && map.containsKey("andIncrement") && map.containsKey("andDecrement")) {
                Iterator it = map.values().iterator();
                it.next();
                return castToLong(it.next());
            }
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        throw new JSONException("can not cast to long, value : " + obj);
    }

    public static Short castToShort(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return Short.valueOf(shortValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            return Short.valueOf(Short.parseShort(str));
        }
        if (obj instanceof Boolean) {
            return Short.valueOf(((Boolean) obj).booleanValue() ? (short) 1 : (short) 0);
        }
        throw new JSONException("can not cast to short, value : " + obj);
    }

    public static java.sql.Date castToSqlDate(Object obj) throws NumberFormatException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.sql.Date) {
            return (java.sql.Date) obj;
        }
        if (obj instanceof Date) {
            return new java.sql.Date(((Date) obj).getTime());
        }
        if (obj instanceof Calendar) {
            return new java.sql.Date(((Calendar) obj).getTimeInMillis());
        }
        long jLongValue = obj instanceof BigDecimal ? longValue((BigDecimal) obj) : obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
            if (isNumber(str)) {
                jLongValue = Long.parseLong(str);
            } else {
                JSONScanner jSONScanner = new JSONScanner(str);
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    throw new JSONException("can not cast to Timestamp, value : " + str);
                }
                jLongValue = jSONScanner.getCalendar().getTime().getTime();
            }
        }
        if (jLongValue > 0) {
            return new java.sql.Date(jLongValue);
        }
        throw new JSONException("can not cast to Date, value : " + obj);
    }

    public static Time castToSqlTime(Object obj) throws NumberFormatException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Time) {
            return (Time) obj;
        }
        if (obj instanceof Date) {
            return new Time(((Date) obj).getTime());
        }
        if (obj instanceof Calendar) {
            return new Time(((Calendar) obj).getTimeInMillis());
        }
        long jLongValue = obj instanceof BigDecimal ? longValue((BigDecimal) obj) : obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equalsIgnoreCase(str)) {
                return null;
            }
            if (isNumber(str)) {
                jLongValue = Long.parseLong(str);
            } else {
                JSONScanner jSONScanner = new JSONScanner(str);
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    throw new JSONException("can not cast to Timestamp, value : " + str);
                }
                jLongValue = jSONScanner.getCalendar().getTime().getTime();
            }
        }
        if (jLongValue > 0) {
            return new Time(jLongValue);
        }
        throw new JSONException("can not cast to Date, value : " + obj);
    }

    public static String castToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Timestamp castToTimestamp(Object obj) throws NumberFormatException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Calendar) {
            return new Timestamp(((Calendar) obj).getTimeInMillis());
        }
        if (obj instanceof Timestamp) {
            return (Timestamp) obj;
        }
        if (obj instanceof Date) {
            return new Timestamp(((Date) obj).getTime());
        }
        long jLongValue = obj instanceof BigDecimal ? longValue((BigDecimal) obj) : obj instanceof Number ? ((Number) obj).longValue() : 0L;
        if (obj instanceof String) {
            String strSubstring = (String) obj;
            if (strSubstring.length() == 0 || "null".equals(strSubstring) || "NULL".equals(strSubstring)) {
                return null;
            }
            if (strSubstring.endsWith(".000000000")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 10);
            } else if (strSubstring.endsWith(".000000")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 7);
            }
            if (strSubstring.length() == 29 && strSubstring.charAt(4) == '-' && strSubstring.charAt(7) == '-' && strSubstring.charAt(10) == ' ' && strSubstring.charAt(13) == ':' && strSubstring.charAt(16) == ':' && strSubstring.charAt(19) == '.') {
                return new Timestamp(num(strSubstring.charAt(0), strSubstring.charAt(1), strSubstring.charAt(2), strSubstring.charAt(3)) - 1900, num(strSubstring.charAt(5), strSubstring.charAt(6)) - 1, num(strSubstring.charAt(8), strSubstring.charAt(9)), num(strSubstring.charAt(11), strSubstring.charAt(12)), num(strSubstring.charAt(14), strSubstring.charAt(15)), num(strSubstring.charAt(17), strSubstring.charAt(18)), num(strSubstring.charAt(20), strSubstring.charAt(21), strSubstring.charAt(22), strSubstring.charAt(23), strSubstring.charAt(24), strSubstring.charAt(25), strSubstring.charAt(26), strSubstring.charAt(27), strSubstring.charAt(28)));
            }
            if (isNumber(strSubstring)) {
                jLongValue = Long.parseLong(strSubstring);
            } else {
                JSONScanner jSONScanner = new JSONScanner(strSubstring);
                if (!jSONScanner.scanISO8601DateIfMatch(false)) {
                    throw new JSONException("can not cast to Timestamp, value : " + strSubstring);
                }
                jLongValue = jSONScanner.getCalendar().getTime().getTime();
            }
        }
        if (jLongValue >= 0) {
            return new Timestamp(jLongValue);
        }
        throw new JSONException("can not cast to Timestamp, value : " + obj);
    }

    public static Type checkPrimitiveArray(GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        String str = "[";
        while (genericComponentType instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            str = str + str;
        }
        if (!(genericComponentType instanceof Class)) {
            return genericArrayType;
        }
        Class cls = (Class) genericComponentType;
        if (!cls.isPrimitive()) {
            return genericArrayType;
        }
        try {
            if (cls == Boolean.TYPE) {
                return Class.forName(str + "Z");
            }
            if (cls == Character.TYPE) {
                return Class.forName(str + "C");
            }
            if (cls == Byte.TYPE) {
                return Class.forName(str + "B");
            }
            if (cls == Short.TYPE) {
                return Class.forName(str + ExifInterface.LATITUDE_SOUTH);
            }
            if (cls == Integer.TYPE) {
                return Class.forName(str + "I");
            }
            if (cls == Long.TYPE) {
                return Class.forName(str + "J");
            }
            if (cls == Float.TYPE) {
                return Class.forName(str + "F");
            }
            if (cls != Double.TYPE) {
                return genericArrayType;
            }
            return Class.forName(str + "D");
        } catch (ClassNotFoundException unused) {
            return genericArrayType;
        }
    }

    public static void clearClassMapping() {
        mappings.clear();
        addBaseClassMappings();
    }

    private static void computeFields(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy, Map<String, FieldInfo> map2, Field[] fieldArr) {
        int i10;
        int i11;
        int i12;
        String strLabel;
        for (Field field : fieldArr) {
            if (!Modifier.isStatic(field.getModifiers())) {
                JSONField jSONField = (JSONField) getAnnotation(field, JSONField.class);
                String name = field.getName();
                if (jSONField == null) {
                    i10 = 0;
                    i11 = 0;
                    i12 = 0;
                    strLabel = null;
                } else if (jSONField.serialize()) {
                    int iOrdinal = jSONField.ordinal();
                    int iM3381of = SerializerFeature.m3381of(jSONField.serialzeFeatures());
                    int iM3330of = Feature.m3330of(jSONField.parseFeatures());
                    if (jSONField.name().length() != 0) {
                        name = jSONField.name();
                    }
                    strLabel = jSONField.label().length() != 0 ? jSONField.label() : null;
                    i10 = iOrdinal;
                    i11 = iM3381of;
                    i12 = iM3330of;
                }
                if (map == null || (name = map.get(name)) != null) {
                    if (propertyNamingStrategy != null) {
                        name = propertyNamingStrategy.translate(name);
                    }
                    String str = name;
                    if (!map2.containsKey(str)) {
                        map2.put(str, new FieldInfo(str, null, field, cls, null, i10, i11, i12, null, jSONField, strLabel));
                    }
                }
            }
        }
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, Map<String, String> map) {
        return computeGetters(cls, map, true);
    }

    public static List<FieldInfo> computeGettersWithFieldBase(Class<?> cls, Map<String, String> map, boolean z10, PropertyNamingStrategy propertyNamingStrategy) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            computeFields(superclass, map, propertyNamingStrategy, linkedHashMap, superclass.getDeclaredFields());
        }
        return getFieldInfos(cls, z10, linkedHashMap);
    }

    private static Map<TypeVariable, Type> createActualTypeMap(TypeVariable[] typeVariableArr, Type[] typeArr) {
        int length = typeVariableArr.length;
        HashMap map = new HashMap(length);
        for (int i10 = 0; i10 < length; i10++) {
            map.put(typeVariableArr[i10], typeArr[i10]);
        }
        return map;
    }

    public static Collection createCollection(Type type) {
        Class<?> cls;
        Class<?> rawClass = getRawClass(type);
        if (rawClass == AbstractCollection.class || rawClass == Collection.class) {
            return new ArrayList();
        }
        if (rawClass.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (rawClass.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (rawClass.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (rawClass.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (rawClass.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        if (rawClass.isAssignableFrom(Queue.class) || ((cls = class_deque) != null && rawClass.isAssignableFrom(cls))) {
            return new LinkedList();
        }
        try {
            return (Collection) rawClass.newInstance();
        } catch (Exception unused) {
            throw new JSONException("create instance error, class " + rawClass.getName());
        }
    }

    public static String decapitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static long fnv1a_64(String str) {
        long jCharAt = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            jCharAt = (jCharAt ^ str.charAt(i10)) * 1099511628211L;
        }
        return jCharAt;
    }

    public static long fnv1a_64_extract(String str) {
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '_' && cCharAt != '-') {
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                j10 = (j10 ^ cCharAt) * 1099511628211L;
            }
        }
        return j10;
    }

    public static long fnv1a_64_lower(String str) {
        long j10 = -3750763034362895579L;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            j10 = (j10 ^ cCharAt) * 1099511628211L;
        }
        return j10;
    }

    private static Type getActualType(Type type, Map<TypeVariable, Type> map) {
        return type instanceof TypeVariable ? map.get(type) : type instanceof ParameterizedType ? makeParameterizedType(getRawClass(type), ((ParameterizedType) type).getActualTypeArguments(), map) : type instanceof GenericArrayType ? new GenericArrayTypeImpl(getActualType(((GenericArrayType) type).getGenericComponentType(), map)) : type;
    }

    public static <A extends Annotation> A getAnnotation(Class<?> cls, Class<A> cls2) {
        A a10 = (A) cls.getAnnotation(cls2);
        Type mixInAnnotations = JSON.getMixInAnnotations(cls);
        Class cls3 = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (cls3 != null) {
            A a11 = (A) cls3.getAnnotation(cls2);
            Annotation[] annotations = cls3.getAnnotations();
            if (a11 == null && annotations.length > 0) {
                for (Annotation annotation : annotations) {
                    a11 = (A) annotation.annotationType().getAnnotation(cls2);
                    if (a11 != null) {
                        break;
                    }
                }
            }
            if (a11 != null) {
                return a11;
            }
        }
        Annotation[] annotations2 = cls.getAnnotations();
        if (a10 == null && annotations2.length > 0) {
            for (Annotation annotation2 : annotations2) {
                a10 = (A) annotation2.annotationType().getAnnotation(cls2);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return a10;
    }

    public static Class<?> getClass(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getClass(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            Type type2 = ((TypeVariable) type).getBounds()[0];
            return type2 instanceof Class ? (Class) type2 : getClass(type2);
        }
        if (!(type instanceof WildcardType)) {
            return Object.class;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length == 1 ? getClass(upperBounds[0]) : Object.class;
    }

    public static Class<?> getClassFromMapping(String str) {
        return mappings.get(str);
    }

    public static Class<?> getCollectionItemClass(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return Object.class;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
            if (upperBounds.length == 1) {
                type2 = upperBounds[0];
            }
        }
        if (!(type2 instanceof Class)) {
            throw new JSONException("can not create ASMParser");
        }
        Class<?> cls = (Class) type2;
        if (Modifier.isPublic(cls.getModifiers())) {
            return cls;
        }
        throw new JSONException("can not create ASMParser");
    }

    public static Type getCollectionItemType(Type type) {
        return type instanceof ParameterizedType ? getCollectionItemType((ParameterizedType) type) : type instanceof Class ? getCollectionItemType((Class<?>) type) : Object.class;
    }

    private static Type getCollectionSuperType(Class<?> cls) {
        Type type = null;
        for (Type type2 : cls.getGenericInterfaces()) {
            Class<?> rawClass = getRawClass(type2);
            if (rawClass == Collection.class) {
                return type2;
            }
            if (Collection.class.isAssignableFrom(rawClass)) {
                type = type2;
            }
        }
        return type == null ? cls.getGenericSuperclass() : type;
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
        char cCharAt;
        char cCharAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name) || (str.length() > 2 && (cCharAt = str.charAt(0)) >= 'a' && cCharAt <= 'z' && (cCharAt2 = str.charAt(1)) >= 'A' && cCharAt2 <= 'Z' && str.equalsIgnoreCase(name))) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        return getField(superclass, str, superclass.getDeclaredFields());
    }

    private static List<FieldInfo> getFieldInfos(Class<?> cls, boolean z10, Map<String, FieldInfo> map) {
        ArrayList arrayList = new ArrayList();
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        String[] strArrOrders = jSONType != null ? jSONType.orders() : null;
        if (strArrOrders == null || strArrOrders.length <= 0) {
            arrayList.addAll(map.values());
            if (z10) {
                Collections.sort(arrayList);
            }
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
        for (FieldInfo fieldInfo : map.values()) {
            linkedHashMap.put(fieldInfo.name, fieldInfo);
        }
        for (String str : strArrOrders) {
            FieldInfo fieldInfo2 = (FieldInfo) linkedHashMap.get(str);
            if (fieldInfo2 != null) {
                arrayList.add(fieldInfo2);
                linkedHashMap.remove(str);
            }
        }
        arrayList.addAll(linkedHashMap.values());
        return arrayList;
    }

    public static Type getGenericParamType(Type type) {
        return (!(type instanceof ParameterizedType) && (type instanceof Class)) ? getGenericParamType(((Class) type).getGenericSuperclass()) : type;
    }

    public static String[] getKoltinConstructorParameters(Class cls) {
        if (kotlin_kclass_constructor == null && !kotlin_class_klass_error) {
            try {
                kotlin_kclass_constructor = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kclass_constructor == null) {
            return null;
        }
        if (kotlin_kclass_getConstructors == null && !kotlin_class_klass_error) {
            try {
                kotlin_kclass_getConstructors = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", null);
            } catch (Throwable unused2) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kfunction_getParameters == null && !kotlin_class_klass_error) {
            try {
                kotlin_kfunction_getParameters = InterfaceC10473g.class.getMethod("getParameters", null);
            } catch (Throwable unused3) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kparameter_getName == null && !kotlin_class_klass_error) {
            try {
                kotlin_kparameter_getName = InterfaceC10477k.class.getMethod("getName", null);
            } catch (Throwable unused4) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_error) {
            return null;
        }
        try {
            Iterator it = ((Iterable) kotlin_kclass_getConstructors.invoke(kotlin_kclass_constructor.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) kotlin_kfunction_getParameters.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            if (obj == null) {
                return null;
            }
            List list2 = (List) kotlin_kfunction_getParameters.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i10 = 0; i10 < list2.size(); i10++) {
                strArr[i10] = (String) kotlin_kparameter_getName.invoke(list2.get(i10), null);
            }
            return strArr;
        } catch (Throwable th) {
            th.printStackTrace();
            kotlin_error = true;
            return null;
        }
    }

    public static Constructor getKotlinConstructor(Constructor[] constructorArr) {
        return getKotlinConstructor(constructorArr, null);
    }

    public static Annotation[][] getParameterAnnotations(Method method) {
        Annotation[][] parameterAnnotations;
        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
        Type mixInAnnotations = JSON.getMixInAnnotations(method.getDeclaringClass());
        Method declaredMethod = null;
        Class superclass = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (superclass != null) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredMethod = superclass.getDeclaredMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredMethod != null && (parameterAnnotations = declaredMethod.getParameterAnnotations()) != null) {
                return parameterAnnotations;
            }
        }
        return parameterAnnotations2;
    }

    public static int getParserFeatures(Class<?> cls) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType == null) {
            return 0;
        }
        return Feature.m3330of(jSONType.parseFeatures());
    }

    private static String getPropertyNameByCompatibleFieldName(Map<String, Field> map, String str, String str2, int i10) {
        if (compatibleWithFieldName && !map.containsKey(str2)) {
            String strSubstring = str.substring(i10);
            if (map.containsKey(strSubstring)) {
                return strSubstring;
            }
        }
        return str2;
    }

    public static String getPropertyNameByMethodName(String str) {
        return Character.toLowerCase(str.charAt(3)) + str.substring(4);
    }

    public static Class<?> getRawClass(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return getRawClass(((ParameterizedType) type).getRawType());
        }
        if (!(type instanceof WildcardType)) {
            throw new JSONException("TODO");
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        if (upperBounds.length == 1) {
            return getRawClass(upperBounds[0]);
        }
        throw new JSONException("TODO");
    }

    public static int getSerializeFeatures(Class<?> cls) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType == null) {
            return 0;
        }
        return SerializerFeature.m3381of(jSONType.serialzeFeatures());
    }

    public static JSONField getSuperMethodAnnotation(Class<?> cls, Method method) throws SecurityException {
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces.length > 0) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> cls2 : interfaces) {
                for (Method method2 : cls2.getMethods()) {
                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                    if (parameterTypes2.length == parameterTypes.length && method2.getName().equals(method.getName())) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= parameterTypes.length) {
                                JSONField jSONField = (JSONField) getAnnotation(method2, JSONField.class);
                                if (jSONField != null) {
                                    return jSONField;
                                }
                            } else {
                                if (!parameterTypes2[i10].equals(parameterTypes[i10])) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= parameterTypes3.length) {
                            JSONField jSONField2 = (JSONField) getAnnotation(method3, JSONField.class);
                            if (jSONField2 != null) {
                                return jSONField2;
                            }
                        } else {
                            if (!parameterTypes4[i11].equals(parameterTypes3[i11])) {
                                break;
                            }
                            i11++;
                        }
                    }
                }
            }
        }
        return null;
    }

    private static Type getWildcardTypeUpperBounds(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length > 0 ? upperBounds[0] : Object.class;
    }

    public static Annotation getXmlAccessorType(Class cls) {
        if (class_XmlAccessorType == null && !classXmlAccessorType_error) {
            try {
                class_XmlAccessorType = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
            } catch (Throwable unused) {
                classXmlAccessorType_error = true;
            }
        }
        if (class_XmlAccessorType == null) {
            return null;
        }
        return getAnnotation((Class<?>) cls, class_XmlAccessorType);
    }

    public static int intValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.intValueExact() : bigDecimal.intValue();
    }

    public static boolean isAnnotationPresentManyToMany(Method method) {
        if (method == null) {
            return false;
        }
        if (class_ManyToMany == null && !class_ManyToMany_error) {
            try {
                class_ManyToMany = Class.forName("javax.persistence.ManyToMany");
            } catch (Throwable unused) {
                class_ManyToMany_error = true;
            }
        }
        if (class_ManyToMany != null) {
            return method.isAnnotationPresent(class_OneToMany) || method.isAnnotationPresent(class_ManyToMany);
        }
        return false;
    }

    public static boolean isAnnotationPresentOneToMany(Method method) {
        if (method == null) {
            return false;
        }
        if (class_OneToMany == null && !class_OneToMany_error) {
            try {
                class_OneToMany = Class.forName("javax.persistence.OneToMany");
            } catch (Throwable unused) {
                class_OneToMany_error = true;
            }
        }
        Class<? extends Annotation> cls = class_OneToMany;
        return cls != null && method.isAnnotationPresent(cls);
    }

    public static boolean isClob(Class cls) {
        if (class_Clob == null && !class_Clob_error) {
            try {
                class_Clob = Clob.class;
            } catch (Throwable unused) {
                class_Clob_error = true;
            }
        }
        if (class_Clob == null) {
            return false;
        }
        return class_Clob.isAssignableFrom(cls);
    }

    public static boolean isGenericParamType(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && isGenericParamType(genericSuperclass);
    }

    public static boolean isHibernateInitialized(Object obj) {
        if (obj == null) {
            return false;
        }
        if (method_HibernateIsInitialized == null && !method_HibernateIsInitialized_error) {
            try {
                method_HibernateIsInitialized = Class.forName("org.hibernate.Hibernate").getMethod("isInitialized", Object.class);
            } catch (Throwable unused) {
                method_HibernateIsInitialized_error = true;
            }
        }
        Method method = method_HibernateIsInitialized;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(null, obj)).booleanValue();
            } catch (Throwable unused2) {
            }
        }
        return true;
    }

    private static boolean isJSONTypeIgnore(Class<?> cls, String str) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType != null) {
            String[] strArrIncludes = jSONType.includes();
            if (strArrIncludes.length > 0) {
                for (String str2 : strArrIncludes) {
                    if (str.equals(str2)) {
                        return false;
                    }
                }
                return true;
            }
            for (String str3 : jSONType.ignores()) {
                if (str.equals(str3)) {
                    return true;
                }
            }
        }
        if (cls.getSuperclass() == Object.class || cls.getSuperclass() == null) {
            return false;
        }
        return isJSONTypeIgnore(cls.getSuperclass(), str);
    }

    public static boolean isJacksonCreator(Method method) {
        if (method == null) {
            return false;
        }
        if (class_JacksonCreator == null && !class_JacksonCreator_error) {
            try {
                class_JacksonCreator = Class.forName("com.fasterxml.jackson.annotation.JsonCreator");
            } catch (Throwable unused) {
                class_JacksonCreator_error = true;
            }
        }
        Class<? extends Annotation> cls = class_JacksonCreator;
        return cls != null && method.isAnnotationPresent(cls);
    }

    public static boolean isKotlin(Class cls) {
        if (kotlin_metadata == null && !kotlin_metadata_error) {
            try {
                kotlin_metadata = InterfaceC10774e.class;
            } catch (Throwable unused) {
                kotlin_metadata_error = true;
            }
        }
        return kotlin_metadata != null && cls.isAnnotationPresent(kotlin_metadata);
    }

    private static boolean isKotlinIgnore(Class cls, String str) {
        if (kotlinIgnores == null && !kotlinIgnores_error) {
            try {
                HashMap map = new HashMap();
                C10398c.a aVar = C10398c.f24748g;
                map.put(C10398c.class, new String[]{"getEndInclusive", "isEmpty"});
                C10405j.a aVar2 = C10405j.f24760g;
                map.put(C10405j.class, new String[]{"getEndInclusive", "isEmpty"});
                C10408m.a aVar3 = C10408m.f24770g;
                map.put(C10408m.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(C10400e.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(AbstractC10399d.class, new String[]{"getEndInclusive", "isEmpty"});
                kotlinIgnores = map;
            } catch (Throwable unused) {
                kotlinIgnores_error = true;
            }
        }
        if (kotlinIgnores == null) {
            return false;
        }
        String[] strArr = kotlinIgnores.get(cls);
        return strArr != null && Arrays.binarySearch(strArr, str) >= 0;
    }

    public static boolean isNumber(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '+' || cCharAt == '-') {
                if (i10 != 0) {
                    return false;
                }
            } else if (cCharAt < '0' || cCharAt > '9') {
                return false;
            }
        }
        return true;
    }

    public static boolean isPath(Class<?> cls) {
        if (pathClass == null && !pathClass_error) {
            try {
                pathClass = Class.forName("java.nio.file.Path");
            } catch (Throwable unused) {
                pathClass_error = true;
            }
        }
        Class<?> cls2 = pathClass;
        if (cls2 != null) {
            return cls2.isAssignableFrom(cls);
        }
        return false;
    }

    public static boolean isProxy(Class<?> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            String name = cls2.getName();
            if (name.equals("net.sf.cglib.proxy.Factory") || name.equals("org.springframework.cglib.proxy.Factory") || name.equals("javassist.util.proxy.ProxyObject") || name.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject") || name.equals("org.hibernate.proxy.HibernateProxy") || name.equals("org.springframework.context.annotation.ConfigurationClassEnhancer$EnhancedConfiguration")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTransient(Method method) {
        if (method == null) {
            return false;
        }
        if (!transientClassInited) {
            try {
                transientClass = Class.forName("java.beans.Transient");
            } catch (Exception unused) {
            } catch (Throwable th) {
                transientClassInited = true;
                throw th;
            }
            transientClassInited = true;
        }
        Class<? extends Annotation> cls = transientClass;
        return (cls == null || getAnnotation(method, cls) == null) ? false : true;
    }

    public static boolean isXmlField(Class cls) {
        Annotation annotation;
        Object objInvoke;
        if (class_XmlAccessorType == null && !classXmlAccessorType_error) {
            try {
                class_XmlAccessorType = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
            } catch (Throwable unused) {
                classXmlAccessorType_error = true;
            }
        }
        if (class_XmlAccessorType == null || (annotation = getAnnotation((Class<?>) cls, (Class<Annotation>) class_XmlAccessorType)) == null) {
            return false;
        }
        if (method_XmlAccessorType_value == null && !classXmlAccessorType_error) {
            try {
                method_XmlAccessorType_value = class_XmlAccessorType.getMethod("value", null);
            } catch (Throwable unused2) {
                classXmlAccessorType_error = true;
            }
        }
        if (method_XmlAccessorType_value == null) {
            return false;
        }
        if (classXmlAccessorType_error) {
            objInvoke = null;
        } else {
            try {
                objInvoke = method_XmlAccessorType_value.invoke(annotation, null);
            } catch (Throwable unused3) {
                classXmlAccessorType_error = true;
            }
        }
        if (objInvoke == null) {
            return false;
        }
        if (class_XmlAccessType == null && !classXmlAccessorType_error) {
            try {
                class_XmlAccessType = Class.forName("javax.xml.bind.annotation.XmlAccessType");
                field_XmlAccessType_FIELD = class_XmlAccessType.getField("FIELD");
                field_XmlAccessType_FIELD_VALUE = field_XmlAccessType_FIELD.get(null);
            } catch (Throwable unused4) {
                classXmlAccessorType_error = true;
            }
        }
        return objInvoke == field_XmlAccessType_FIELD_VALUE;
    }

    public static Class<?> loadClass(String str) {
        return loadClass(str, null);
    }

    public static long longExtractValue(Number number) {
        return number instanceof BigDecimal ? ((BigDecimal) number).longValueExact() : number.longValue();
    }

    public static long longValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return 0L;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
    }

    private static ParameterizedType makeParameterizedType(Class<?> cls, Type[] typeArr, Map<TypeVariable, Type> map) {
        int length = typeArr.length;
        Type[] typeArr2 = new Type[length];
        for (int i10 = 0; i10 < length; i10++) {
            typeArr2[i10] = getActualType(typeArr[i10], map);
        }
        return new ParameterizedTypeImpl(typeArr2, null, cls);
    }

    public static int num(char c10, char c11) {
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return -1;
        }
        return ((c10 - '0') * 10) + (c11 - '0');
    }

    public static double parseDouble(String str) {
        double d10;
        double d11;
        int length = str.length();
        if (length > 10) {
            return Double.parseDouble(str);
        }
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '-' && i11 == 0) {
                z10 = true;
            } else if (cCharAt == '.') {
                if (i10 != 0) {
                    return Double.parseDouble(str);
                }
                i10 = (length - i11) - 1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return Double.parseDouble(str);
                }
                j10 = (j10 * 10) + (cCharAt - '0');
            }
        }
        if (z10) {
            j10 = -j10;
        }
        switch (i10) {
            case 0:
                return j10;
            case 1:
                d10 = j10;
                d11 = 10.0d;
                break;
            case 2:
                d10 = j10;
                d11 = 100.0d;
                break;
            case 3:
                d10 = j10;
                d11 = 1000.0d;
                break;
            case 4:
                d10 = j10;
                d11 = 10000.0d;
                break;
            case 5:
                d10 = j10;
                d11 = 100000.0d;
                break;
            case 6:
                d10 = j10;
                d11 = 1000000.0d;
                break;
            case 7:
                d10 = j10;
                d11 = 1.0E7d;
                break;
            case 8:
                d10 = j10;
                d11 = 1.0E8d;
                break;
            case 9:
                d10 = j10;
                d11 = 1.0E9d;
                break;
            default:
                return Double.parseDouble(str);
        }
        return d10 / d11;
    }

    public static float parseFloat(String str) {
        float f10;
        float f11;
        int length = str.length();
        if (length >= 10) {
            return Float.parseFloat(str);
        }
        long j10 = 0;
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '-' && i11 == 0) {
                z10 = true;
            } else if (cCharAt == '.') {
                if (i10 != 0) {
                    return Float.parseFloat(str);
                }
                i10 = (length - i11) - 1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return Float.parseFloat(str);
                }
                j10 = (j10 * 10) + (cCharAt - '0');
            }
        }
        if (z10) {
            j10 = -j10;
        }
        switch (i10) {
            case 0:
                return j10;
            case 1:
                f10 = j10;
                f11 = 10.0f;
                break;
            case 2:
                f10 = j10;
                f11 = 100.0f;
                break;
            case 3:
                f10 = j10;
                f11 = 1000.0f;
                break;
            case 4:
                f10 = j10;
                f11 = 10000.0f;
                break;
            case 5:
                f10 = j10;
                f11 = 100000.0f;
                break;
            case 6:
                f10 = j10;
                f11 = 1000000.0f;
                break;
            case 7:
                f10 = j10;
                f11 = 1.0E7f;
                break;
            case 8:
                f10 = j10;
                f11 = 1.0E8f;
                break;
            case 9:
                f10 = j10;
                f11 = 1.0E9f;
                break;
            default:
                return Float.parseFloat(str);
        }
        return f10 / f11;
    }

    public static void setAccessible(AccessibleObject accessibleObject) {
        if (setAccessibleEnable && !accessibleObject.isAccessible()) {
            try {
                accessibleObject.setAccessible(true);
            } catch (AccessControlException unused) {
                setAccessibleEnable = false;
            }
        }
    }

    public static short shortValue(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return (short) 0;
        }
        int iScale = bigDecimal.scale();
        return (iScale < -100 || iScale > 100) ? bigDecimal.shortValueExact() : bigDecimal.shortValue();
    }

    public static Locale toLocale(String str) {
        String[] strArrSplit = str.split(BundleUtil.UNDERLINE_TAG);
        return strArrSplit.length == 1 ? new Locale(strArrSplit[0]) : strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
    }

    public static Type unwrapOptional(Type type) {
        if (!optionalClassInited) {
            try {
                optionalClass = Class.forName("java.util.Optional");
            } catch (Exception unused) {
            } catch (Throwable th) {
                optionalClassInited = true;
                throw th;
            }
            optionalClassInited = true;
        }
        if (!(type instanceof ParameterizedType)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return parameterizedType.getRawType() == optionalClass ? parameterizedType.getActualTypeArguments()[0] : type;
    }

    public static SerializeBeanInfo buildBeanInfo(Class<?> cls, Map<String, String> map, PropertyNamingStrategy propertyNamingStrategy, boolean z10) throws SecurityException {
        PropertyNamingStrategy propertyNamingStrategy2;
        int i10;
        String[] strArr;
        String str;
        String str2;
        Class<?> cls2;
        Map<String, String> map2;
        List<FieldInfo> listComputeGetters;
        List arrayList;
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        if (jSONType != null) {
            String[] strArrOrders = jSONType.orders();
            String strTypeName = jSONType.typeName();
            if (strTypeName.length() == 0) {
                strTypeName = null;
            }
            PropertyNamingStrategy propertyNamingStrategyNaming = jSONType.naming();
            if (propertyNamingStrategyNaming != PropertyNamingStrategy.CamelCase) {
                propertyNamingStrategy = propertyNamingStrategyNaming;
            }
            int iM3381of = SerializerFeature.m3381of(jSONType.serialzeFeatures());
            String strTypeKey = null;
            for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                JSONType jSONType2 = (JSONType) getAnnotation(superclass, JSONType.class);
                if (jSONType2 == null) {
                    break;
                }
                strTypeKey = jSONType2.typeKey();
                if (strTypeKey.length() != 0) {
                    break;
                }
            }
            for (Class<?> cls3 : cls.getInterfaces()) {
                JSONType jSONType3 = (JSONType) getAnnotation(cls3, JSONType.class);
                if (jSONType3 != null) {
                    strTypeKey = jSONType3.typeKey();
                    if (strTypeKey.length() != 0) {
                        break;
                    }
                }
            }
            propertyNamingStrategy2 = propertyNamingStrategy;
            str2 = (strTypeKey == null || strTypeKey.length() != 0) ? strTypeKey : null;
            strArr = strArrOrders;
            str = strTypeName;
            i10 = iM3381of;
        } else {
            propertyNamingStrategy2 = propertyNamingStrategy;
            i10 = 0;
            strArr = null;
            str = null;
            str2 = null;
        }
        HashMap map3 = new HashMap();
        ParserConfig.parserAllFieldToCache(cls, map3);
        if (z10) {
            listComputeGetters = computeGettersWithFieldBase(cls, map, false, propertyNamingStrategy2);
            cls2 = cls;
            map2 = map;
        } else {
            cls2 = cls;
            map2 = map;
            listComputeGetters = computeGetters(cls2, jSONType, map2, map3, false, propertyNamingStrategy2);
        }
        FieldInfo[] fieldInfoArr = new FieldInfo[listComputeGetters.size()];
        listComputeGetters.toArray(fieldInfoArr);
        if (strArr == null || strArr.length == 0) {
            arrayList = new ArrayList(listComputeGetters);
            Collections.sort(arrayList);
        } else {
            arrayList = z10 ? computeGettersWithFieldBase(cls2, map2, true, propertyNamingStrategy2) : computeGetters(cls2, jSONType, map2, map3, true, propertyNamingStrategy2);
        }
        FieldInfo[] fieldInfoArr2 = new FieldInfo[arrayList.size()];
        arrayList.toArray(fieldInfoArr2);
        if (Arrays.equals(fieldInfoArr2, fieldInfoArr)) {
            fieldInfoArr2 = fieldInfoArr;
        }
        return new SerializeBeanInfo(cls2, jSONType, str, str2, i10, fieldInfoArr, fieldInfoArr2);
    }

    public static Date castToDate(Object obj, String str) throws NumberFormatException {
        long j10;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof BigDecimal) {
            return new Date(longValue((BigDecimal) obj));
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if ("unixtime".equals(str)) {
                jLongValue *= 1000;
            }
            return new Date(jLongValue);
        }
        if (obj instanceof String) {
            String strSubstring = (String) obj;
            JSONScanner jSONScanner = new JSONScanner(strSubstring);
            try {
                if (jSONScanner.scanISO8601DateIfMatch(false)) {
                    return jSONScanner.getCalendar().getTime();
                }
                jSONScanner.close();
                if (strSubstring.startsWith("/Date(") && strSubstring.endsWith(")/")) {
                    strSubstring = strSubstring.substring(6, strSubstring.length() - 2);
                }
                if (strSubstring.indexOf(45) > 0 || strSubstring.indexOf(43) > 0 || str != null) {
                    if (str == null) {
                        int length = strSubstring.length();
                        str = (length == JSON.DEFFAULT_DATE_FORMAT.length() || (length == 22 && JSON.DEFFAULT_DATE_FORMAT.equals("yyyyMMddHHmmssSSSZ"))) ? JSON.DEFFAULT_DATE_FORMAT : length == 10 ? "yyyy-MM-dd" : length == 19 ? "yyyy-MM-dd HH:mm:ss" : (length == 29 && strSubstring.charAt(26) == ':' && strSubstring.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : (length == 23 && strSubstring.charAt(19) == ',') ? "yyyy-MM-dd HH:mm:ss,SSS" : "yyyy-MM-dd HH:mm:ss.SSS";
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, JSON.defaultLocale);
                    simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
                    try {
                        return simpleDateFormat.parse(strSubstring);
                    } catch (ParseException unused) {
                        throw new JSONException("can not cast to Date, value : " + strSubstring);
                    }
                }
                if (strSubstring.length() == 0) {
                    return null;
                }
                j10 = Long.parseLong(strSubstring);
            } finally {
                jSONScanner.close();
            }
        } else {
            j10 = -1;
        }
        if (j10 != -1) {
            return new Date(j10);
        }
        Class<?> cls = obj.getClass();
        if ("oracle.sql.TIMESTAMP".equals(cls.getName())) {
            if (oracleTimestampMethod == null && !oracleTimestampMethodInited) {
                try {
                    oracleTimestampMethod = cls.getMethod("toJdbc", null);
                } catch (NoSuchMethodException unused2) {
                } catch (Throwable th) {
                    oracleTimestampMethodInited = true;
                    throw th;
                }
                oracleTimestampMethodInited = true;
            }
            try {
                return (Date) oracleTimestampMethod.invoke(obj, null);
            } catch (Exception e10) {
                throw new JSONException("can not cast oracle.sql.TIMESTAMP to Date", e10);
            }
        }
        if (!"oracle.sql.DATE".equals(cls.getName())) {
            throw new JSONException("can not cast to Date, value : " + obj);
        }
        if (oracleDateMethod == null && !oracleDateMethodInited) {
            try {
                oracleDateMethod = cls.getMethod("toJdbc", null);
            } catch (NoSuchMethodException unused3) {
            } catch (Throwable th2) {
                oracleDateMethodInited = true;
                throw th2;
            }
            oracleDateMethodInited = true;
        }
        try {
            return (Date) oracleDateMethod.invoke(obj, null);
        } catch (Exception e11) {
            throw new JSONException("can not cast oracle.sql.DATE to Date", e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig) throws ClassNotFoundException {
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                return (T) new StackTraceElement(str, str2, str3, number == null ? 0 : number instanceof BigDecimal ? ((BigDecimal) number).intValueExact() : number.intValue());
            }
            Object obj = map.get(JSON.DEFAULT_TYPE_KEY);
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (parserConfig == null) {
                    parserConfig = ParserConfig.global;
                }
                Class<?> clsCheckAutoType = parserConfig.checkAutoType(str4, null);
                if (clsCheckAutoType == null) {
                    throw new ClassNotFoundException(str4 + " not found");
                }
                if (!clsCheckAutoType.equals(cls)) {
                    return (T) castToJavaBean(map, clsCheckAutoType, parserConfig);
                }
            }
            if (cls.isInterface()) {
                JSONObject jSONObject = map instanceof JSONObject ? (JSONObject) map : new JSONObject(map);
                if (parserConfig == null) {
                    parserConfig = ParserConfig.getGlobalInstance();
                }
                return parserConfig.get(cls) != null ? (T) JSON.parseObject(JSON.toJSONString(jSONObject), cls) : (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, jSONObject);
            }
            if (cls == Locale.class) {
                Object obj2 = map.get(IjkMediaMeta.IJKM_KEY_LANGUAGE);
                Object obj3 = map.get("country");
                if (obj2 instanceof String) {
                    String str5 = (String) obj2;
                    if (obj3 instanceof String) {
                        return (T) new Locale(str5, (String) obj3);
                    }
                    if (obj3 == null) {
                        return (T) new Locale(str5);
                    }
                }
            }
            if (cls == String.class && (map instanceof JSONObject)) {
                return (T) map.toString();
            }
            if (cls == JSON.class && (map instanceof JSONObject)) {
                return map;
            }
            if (cls == LinkedHashMap.class && (map instanceof JSONObject)) {
                T t10 = (T) ((JSONObject) map).getInnerMap();
                if (t10 instanceof LinkedHashMap) {
                    return t10;
                }
            }
            if (cls.isInstance(map)) {
                return map;
            }
            if (cls == JSONObject.class) {
                return (T) new JSONObject(map);
            }
            if (parserConfig == null) {
                parserConfig = ParserConfig.getGlobalInstance();
            }
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
            if (javaBeanDeserializer != null) {
                return (T) javaBeanDeserializer.createInstance(map, parserConfig);
            }
            throw new JSONException("can not get javaBeanDeserializer. " + cls.getName());
        } catch (Exception e10) {
            throw new JSONException(e10.getMessage(), e10);
        }
    }

    public static List<FieldInfo> computeGetters(Class<?> cls, Map<String, String> map, boolean z10) {
        JSONType jSONType = (JSONType) getAnnotation(cls, JSONType.class);
        HashMap map2 = new HashMap();
        ParserConfig.parserAllFieldToCache(cls, map2);
        return computeGetters(cls, jSONType, map, map2, z10, PropertyNamingStrategy.CamelCase);
    }

    public static Constructor getKotlinConstructor(Constructor[] constructorArr, String[] strArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if ((strArr == null || parameterTypes.length == strArr.length) && ((parameterTypes.length <= 0 || !parameterTypes[parameterTypes.length - 1].getName().equals("kotlin.jvm.internal.n")) && (constructor == null || constructor.getParameterTypes().length < parameterTypes.length))) {
                constructor = constructor2;
            }
        }
        return constructor;
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader) {
        return loadClass(str, classLoader, false);
    }

    public static int num(char c10, char c11, char c12, char c13) {
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return -1;
        }
        return ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0');
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader, boolean z10) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() <= 198) {
            Class<?> clsLoadClass = mappings.get(str);
            if (clsLoadClass != null) {
                return clsLoadClass;
            }
            if (str.charAt(0) == '[') {
                return Array.newInstance(loadClass(str.substring(1), classLoader), 0).getClass();
            }
            if (str.startsWith("L") && str.endsWith(";")) {
                return loadClass(str.substring(1, str.length() - 1), classLoader);
            }
            if (classLoader != null) {
                try {
                    clsLoadClass = classLoader.loadClass(str);
                    if (!z10) {
                        return clsLoadClass;
                    }
                    mappings.put(str, clsLoadClass);
                    return clsLoadClass;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            try {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null && contextClassLoader != classLoader) {
                    clsLoadClass = contextClassLoader.loadClass(str);
                    if (z10) {
                        mappings.put(str, clsLoadClass);
                    }
                    return clsLoadClass;
                }
            } catch (Throwable unused) {
            }
            try {
                clsLoadClass = Class.forName(str);
                if (z10) {
                    mappings.put(str, clsLoadClass);
                }
            } catch (Throwable unused2) {
            }
            return clsLoadClass;
        }
        throw new JSONException("illegal className : " + str);
    }

    public static int num(char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18) {
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9' || c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9' || c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9' || c16 < '0' || c16 > '9' || c17 < '0' || c17 > '9' || c18 < '0' || c18 > '9') {
            return -1;
        }
        return ((c10 - '0') * 100000000) + ((c11 - '0') * ExceptionCode.CRASH_EXCEPTION) + ((c12 - '0') * 1000000) + ((c13 - '0') * 100000) + ((c14 - '0') * 10000) + ((c15 - '0') * 1000) + ((c16 - '0') * 100) + ((c17 - '0') * 10) + (c18 - '0');
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x045a, code lost:
    
        if (r0 == null) goto L200;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0405 A[PHI: r12
      0x0405: PHI (r12v7 java.util.Map<java.lang.String, java.lang.reflect.Field>) = 
      (r12v6 java.util.Map<java.lang.String, java.lang.reflect.Field>)
      (r12v8 java.util.Map<java.lang.String, java.lang.reflect.Field>)
      (r12v8 java.util.Map<java.lang.String, java.lang.reflect.Field>)
     binds: [B:226:0x0403, B:229:0x040c, B:239:0x042b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x045e A[PHI: r0
      0x045e: PHI (r0v29 java.lang.String) = (r0v19 java.lang.String), (r0v31 java.lang.String) binds: [B:242:0x044a, B:244:0x0450] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9 A[PHI: r6 r8 r21
      0x00f9: PHI (r6v14 java.lang.String[]) = (r6v1 java.lang.String[]), (r6v1 java.lang.String[]), (r6v16 java.lang.String[]) binds: [B:42:0x00bd, B:44:0x00c7, B:46:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r8v14 java.lang.annotation.Annotation[][]) = 
      (r8v1 java.lang.annotation.Annotation[][])
      (r8v1 java.lang.annotation.Annotation[][])
      (r8v16 java.lang.annotation.Annotation[][])
     binds: [B:42:0x00bd, B:44:0x00c7, B:46:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x00f9: PHI (r21v2 java.lang.reflect.Constructor<?>[]) = 
      (r21v0 java.lang.reflect.Constructor<?>[])
      (r21v7 java.lang.reflect.Constructor<?>[])
      (r21v7 java.lang.reflect.Constructor<?>[])
     binds: [B:42:0x00bd, B:44:0x00c7, B:46:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.alibaba.fastjson.util.FieldInfo> computeGetters(java.lang.Class<?> r32, com.alibaba.fastjson.annotation.JSONType r33, java.util.Map<java.lang.String, java.lang.String> r34, java.util.Map<java.lang.String, java.lang.reflect.Field> r35, boolean r36, com.alibaba.fastjson.PropertyNamingStrategy r37) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.computeGetters(java.lang.Class, com.alibaba.fastjson.annotation.JSONType, java.util.Map, java.util.Map, boolean, com.alibaba.fastjson.PropertyNamingStrategy):java.util.List");
    }

    private static Type getCollectionItemType(Class<?> cls) {
        return cls.getName().startsWith("java.") ? Object.class : getCollectionItemType(getCollectionSuperType(cls));
    }

    private static Type getCollectionItemType(ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (rawType == Collection.class) {
            return getWildcardTypeUpperBounds(actualTypeArguments[0]);
        }
        Class cls = (Class) rawType;
        Map<TypeVariable, Type> mapCreateActualTypeMap = createActualTypeMap(cls.getTypeParameters(), actualTypeArguments);
        Type collectionSuperType = getCollectionSuperType(cls);
        if (collectionSuperType instanceof ParameterizedType) {
            Class<?> rawClass = getRawClass(collectionSuperType);
            Type[] actualTypeArguments2 = ((ParameterizedType) collectionSuperType).getActualTypeArguments();
            if (actualTypeArguments2.length > 0) {
                return getCollectionItemType(makeParameterizedType(rawClass, actualTypeArguments2, mapCreateActualTypeMap));
            }
            return getCollectionItemType(rawClass);
        }
        return getCollectionItemType((Class<?>) collectionSuperType);
    }

    public static Annotation[][] getParameterAnnotations(Constructor constructor) {
        Annotation[][] parameterAnnotations;
        Constructor declaredConstructor;
        Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
        Type mixInAnnotations = JSON.getMixInAnnotations(constructor.getDeclaringClass());
        Constructor constructor2 = null;
        Class cls = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (cls != null) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            ArrayList arrayList = new ArrayList(2);
            for (Class<?> enclosingClass = cls.getEnclosingClass(); enclosingClass != null; enclosingClass = enclosingClass.getEnclosingClass()) {
                arrayList.add(enclosingClass);
            }
            int size = arrayList.size();
            Class superclass = cls;
            while (true) {
                if (superclass == null || superclass == Object.class) {
                    break;
                }
                try {
                    if (size != 0) {
                        Class<?>[] clsArr = new Class[parameterTypes.length + size];
                        System.arraycopy(parameterTypes, 0, clsArr, size, parameterTypes.length);
                        for (int i10 = size; i10 > 0; i10--) {
                            int i11 = i10 - 1;
                            clsArr[i11] = (Class) arrayList.get(i11);
                        }
                        declaredConstructor = cls.getDeclaredConstructor(clsArr);
                    } else {
                        declaredConstructor = cls.getDeclaredConstructor(parameterTypes);
                    }
                    constructor2 = declaredConstructor;
                } catch (NoSuchMethodException unused) {
                    size--;
                    superclass = superclass.getSuperclass();
                }
            }
            if (constructor2 != null && (parameterAnnotations = constructor2.getParameterAnnotations()) != null) {
                return parameterAnnotations;
            }
        }
        return parameterAnnotations2;
    }

    public static <A extends Annotation> A getAnnotation(Field field, Class<A> cls) throws NoSuchFieldException {
        A a10;
        A a11 = (A) field.getAnnotation(cls);
        Type mixInAnnotations = JSON.getMixInAnnotations(field.getDeclaringClass());
        Field declaredField = null;
        Class superclass = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (superclass != null) {
            String name = field.getName();
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredField = superclass.getDeclaredField(name);
                    break;
                } catch (NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredField != null && (a10 = (A) declaredField.getAnnotation(cls)) != null) {
                return a10;
            }
        }
        return a11;
    }

    public static <A extends Annotation> A getAnnotation(Method method, Class<A> cls) throws NoSuchMethodException, SecurityException {
        A a10;
        A a11 = (A) method.getAnnotation(cls);
        Type mixInAnnotations = JSON.getMixInAnnotations(method.getDeclaringClass());
        Method declaredMethod = null;
        Class superclass = mixInAnnotations instanceof Class ? (Class) mixInAnnotations : null;
        if (superclass != null) {
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredMethod = superclass.getDeclaredMethod(name, parameterTypes);
                    break;
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                }
            }
            if (declaredMethod != null && (a10 = (A) declaredMethod.getAnnotation(cls)) != null) {
                return a10;
            }
        }
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T cast(Object obj, Type type, ParserConfig parserConfig) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) cast(obj, (Class) type, parserConfig);
        }
        if (type instanceof ParameterizedType) {
            return (T) cast(obj, (ParameterizedType) type, parserConfig);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str) || "NULL".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new JSONException("can not cast to : " + type);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v13, types: [T, java.util.Map$Entry] */
    public static <T> T cast(Object obj, ParameterizedType parameterizedType, ParserConfig parserConfig) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Object objCast;
        T t10;
        Object objCast2;
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                ?? r10 = (T) new ArrayList(list.size());
                for (int i10 = 0; i10 < list.size(); i10++) {
                    Object obj2 = list.get(i10);
                    if (type instanceof Class) {
                        if (obj2 != null && obj2.getClass() == JSONObject.class) {
                            objCast = ((JSONObject) obj2).toJavaObject((Class) type, parserConfig, 0);
                        } else {
                            objCast = cast(obj2, (Class<Object>) type, parserConfig);
                        }
                    } else {
                        objCast = cast(obj2, type, parserConfig);
                    }
                    r10.add(objCast);
                }
                return r10;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == Collection.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        t10 = (T) new TreeSet();
                    } else {
                        t10 = (T) new ArrayList();
                    }
                } else {
                    t10 = (T) new HashSet();
                }
                for (T t11 : (Iterable) obj) {
                    if (type2 instanceof Class) {
                        if (t11 != null && t11.getClass() == JSONObject.class) {
                            objCast2 = ((JSONObject) t11).toJavaObject((Class) type2, parserConfig, 0);
                        } else {
                            objCast2 = cast((Object) t11, (Class<Object>) type2, parserConfig);
                        }
                    } else {
                        objCast2 = cast(t11, type2, parserConfig);
                    }
                    ((Collection) t10).add(objCast2);
                }
                return t10;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r102 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r102.put(cast(entry.getKey(), type3, parserConfig), cast(entry.getValue(), type4, parserConfig));
                }
                return r102;
            }
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) cast(obj, rawType, parserConfig);
        }
        if (rawType == Map.Entry.class && (obj instanceof Map)) {
            Map map = (Map) obj;
            if (map.size() == 1) {
                ?? r92 = (T) ((Map.Entry) map.entrySet().iterator().next());
                Object value = r92.getValue();
                if (actualTypeArguments.length == 2 && (value instanceof Map)) {
                    r92.setValue(cast(value, actualTypeArguments[1], parserConfig));
                }
                return r92;
            }
        }
        if (rawType instanceof Class) {
            if (parserConfig == null) {
                parserConfig = ParserConfig.global;
            }
            ObjectDeserializer deserializer = parserConfig.getDeserializer(rawType);
            if (deserializer != null) {
                return (T) deserializer.deserialze(new DefaultJSONParser(JSON.toJSONString(obj), parserConfig), parameterizedType, null);
            }
        }
        throw new JSONException("can not cast to : " + parameterizedType);
    }
}
