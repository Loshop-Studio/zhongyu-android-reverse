package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.ResolveFieldDeserializer;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.LongCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public class DefaultJSONParser implements Closeable {
    public static final int NONE = 0;
    public static final int NeedToResolve = 1;
    public static final int TypeNameRedirect = 2;
    private static final Set<Class<?>> primitiveClasses;
    private String[] autoTypeAccept;
    private boolean autoTypeEnable;
    protected ParserConfig config;
    protected ParseContext context;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    private List<ExtraProcessor> extraProcessors;
    private List<ExtraTypeProvider> extraTypeProviders;
    protected FieldTypeResolver fieldTypeResolver;
    public final Object input;
    protected transient BeanContext lastBeanContext;
    public final JSONLexer lexer;
    private int objectKeyLevel;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    public static class ResolveTask {
        public final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        public final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        primitiveClasses = hashSet;
        hashSet.addAll(Arrays.asList(Boolean.TYPE, Byte.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE, Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, String.class));
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.getGlobalInstance(), JSON.DEFAULT_PARSER_FEATURE);
    }

    private void addContext(ParseContext parseContext) {
        int i10 = this.contextArrayIndex;
        this.contextArrayIndex = i10 + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i10 >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[(parseContextArr.length * 3) / 2];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        this.contextArray[i10] = parseContext;
    }

    public final void accept(int i10) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == i10) {
            jSONLexer.nextToken();
            return;
        }
        throw new JSONException("syntax error, expect " + JSONToken.name(i10) + ", actual " + JSONToken.name(jSONLexer.token()));
    }

    public void acceptType(String str) {
        JSONLexer jSONLexer = this.lexer;
        jSONLexer.nextTokenWithColon();
        if (jSONLexer.token() != 4) {
            throw new JSONException("type not match error");
        }
        if (!str.equals(jSONLexer.stringVal())) {
            throw new JSONException("type not match error");
        }
        jSONLexer.nextToken();
        if (jSONLexer.token() == 16) {
            jSONLexer.nextToken();
        }
    }

    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    public void checkListResolve(Collection collection) {
        if (this.resolveStatus == 1) {
            if (!(collection instanceof List)) {
                ResolveTask lastResolveTask = getLastResolveTask();
                lastResolveTask.fieldDeserializer = new ResolveFieldDeserializer(collection);
                lastResolveTask.ownerContext = this.context;
                setResolveStatus(0);
                return;
            }
            int size = collection.size() - 1;
            ResolveTask lastResolveTask2 = getLastResolveTask();
            lastResolveTask2.fieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, size);
            lastResolveTask2.ownerContext = this.context;
            setResolveStatus(0);
        }
    }

    public void checkMapResolve(Map map, Object obj) {
        if (this.resolveStatus == 1) {
            ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
            ResolveTask lastResolveTask = getLastResolveTask();
            lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
            lastResolveTask.ownerContext = this.context;
            setResolveStatus(0);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        JSONLexer jSONLexer = this.lexer;
        try {
            if (jSONLexer.isEnabled(Feature.AutoCloseSource) && jSONLexer.token() != 20) {
                throw new JSONException("not close json text, token : " + JSONToken.name(jSONLexer.token()));
            }
        } finally {
            jSONLexer.close();
        }
    }

    public void config(Feature feature, boolean z10) {
        this.lexer.config(feature, z10);
    }

    public ParserConfig getConfig() {
        return this.config;
    }

    public ParseContext getContext() {
        return this.context;
    }

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.getLocale());
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.lexer.getTimeZone());
        }
        return this.dateFormat;
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    public FieldTypeResolver getFieldTypeResolver() {
        return this.fieldTypeResolver;
    }

    public String getInput() {
        Object obj = this.input;
        return obj instanceof char[] ? new String((char[]) obj) : obj.toString();
    }

    public ResolveTask getLastResolveTask() {
        return this.resolveTaskList.get(r0.size() - 1);
    }

    public JSONLexer getLexer() {
        return this.lexer;
    }

    public Object getObject(String str) {
        for (int i10 = 0; i10 < this.contextArrayIndex; i10++) {
            if (str.equals(this.contextArray[i10].toString())) {
                return this.contextArray[i10].object;
            }
        }
        return null;
    }

    public ParseContext getOwnerContext() {
        return this.context.parent;
    }

    public int getResolveStatus() {
        return this.resolveStatus;
    }

    public List<ResolveTask> getResolveTaskList() {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        return this.resolveTaskList;
    }

    public SymbolTable getSymbolTable() {
        return this.symbolTable;
    }

    public void handleResovleTask(Object obj) {
        Object objEval;
        FieldInfo fieldInfo;
        List<ResolveTask> list = this.resolveTaskList;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ResolveTask resolveTask = this.resolveTaskList.get(i10);
            String str = resolveTask.referenceValue;
            ParseContext parseContext = resolveTask.ownerContext;
            Object obj2 = parseContext != null ? parseContext.object : null;
            if (str.startsWith("$")) {
                objEval = getObject(str);
                if (objEval == null) {
                    try {
                        JSONPath jSONPathCompile = JSONPath.compile(str);
                        if (jSONPathCompile.isRef()) {
                            objEval = jSONPathCompile.eval(obj);
                        }
                    } catch (JSONPathException unused) {
                    }
                }
            } else {
                objEval = resolveTask.context.object;
            }
            FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
            if (fieldDeserializer != null) {
                if (objEval != null && objEval.getClass() == JSONObject.class && (fieldInfo = fieldDeserializer.fieldInfo) != null && !Map.class.isAssignableFrom(fieldInfo.fieldClass)) {
                    Object obj3 = this.contextArray[0].object;
                    JSONPath jSONPathCompile2 = JSONPath.compile(str);
                    if (jSONPathCompile2.isRef()) {
                        objEval = jSONPathCompile2.eval(obj3);
                    }
                }
                if (fieldDeserializer.getOwnerClass() != null && !fieldDeserializer.getOwnerClass().isInstance(obj2) && resolveTask.ownerContext.parent != null && fieldDeserializer.getOwnerClass().isInstance(resolveTask.ownerContext.parent.object)) {
                    obj2 = resolveTask.ownerContext.parent.object;
                }
                fieldDeserializer.setValue(obj2, objEval);
            }
        }
    }

    public boolean isEnabled(Feature feature) {
        return this.lexer.isEnabled(feature);
    }

    public Object parse() {
        return parse(null);
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public Object parseArrayWithType(Type type) {
        if (this.lexer.token() == 8) {
            this.lexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length != 1) {
            throw new JSONException("not support type " + type);
        }
        Type type2 = actualTypeArguments[0];
        if (type2 instanceof Class) {
            ArrayList arrayList = new ArrayList();
            parseArray((Class<?>) type2, (Collection) arrayList);
            return arrayList;
        }
        if (type2 instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type2;
            Type type3 = wildcardType.getUpperBounds()[0];
            if (!Object.class.equals(type3)) {
                ArrayList arrayList2 = new ArrayList();
                parseArray((Class<?>) type3, (Collection) arrayList2);
                return arrayList2;
            }
            if (wildcardType.getLowerBounds().length == 0) {
                return parse();
            }
            throw new JSONException("not support type : " + type);
        }
        if (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 1) {
                throw new JSONException("not support : " + typeVariable);
            }
            Type type4 = bounds[0];
            if (type4 instanceof Class) {
                ArrayList arrayList3 = new ArrayList();
                parseArray((Class<?>) type4, (Collection) arrayList3);
                return arrayList3;
            }
        }
        if (type2 instanceof ParameterizedType) {
            ArrayList arrayList4 = new ArrayList();
            parseArray((ParameterizedType) type2, arrayList4);
            return arrayList4;
        }
        throw new JSONException("TODO : " + type);
    }

    public void parseExtra(Object obj, String str) {
        this.lexer.nextTokenWithColon();
        List<ExtraTypeProvider> list = this.extraTypeProviders;
        Type extraType = null;
        if (list != null) {
            Iterator<ExtraTypeProvider> it = list.iterator();
            while (it.hasNext()) {
                extraType = it.next().getExtraType(obj, str);
            }
        }
        Object object = extraType == null ? parse() : parseObject(extraType);
        if (obj instanceof ExtraProcessable) {
            ((ExtraProcessable) obj).processExtra(str, object);
            return;
        }
        List<ExtraProcessor> list2 = this.extraProcessors;
        if (list2 != null) {
            Iterator<ExtraProcessor> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().processExtra(obj, str, object);
            }
        }
        if (this.resolveStatus == 1) {
            this.resolveStatus = 0;
        }
    }

    public Object parseKey() {
        if (this.lexer.token() != 18) {
            return parse(null);
        }
        String strStringVal = this.lexer.stringVal();
        this.lexer.nextToken(16);
        return strStringVal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x0290, code lost:
    
        r5.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x029b, code lost:
    
        if (r5.token() != 13) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x029d, code lost:
    
        r5.nextToken(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02a8, code lost:
    
        if ((r17.config.getDeserializer(r8) instanceof com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02aa, code lost:
    
        r13 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r18, (java.lang.Class<java.lang.Object>) r8, r17.config);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b4, code lost:
    
        if (r13 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02b8, code lost:
    
        if (r8 != java.lang.Cloneable.class) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ba, code lost:
    
        r13 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02c6, code lost:
    
        if ("java.util.Collections$EmptyMap".equals(r7) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c8, code lost:
    
        r13 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02d1, code lost:
    
        if ("java.util.Collections$UnmodifiableMap".equals(r7) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02d3, code lost:
    
        r13 = java.util.Collections.unmodifiableMap(new java.util.HashMap());
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02dd, code lost:
    
        r13 = r8.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e1, code lost:
    
        setContext(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e4, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ec, code lost:
    
        throw new com.alibaba.fastjson.JSONException("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02ed, code lost:
    
        setResolveStatus(2);
        r3 = r17.context;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f3, code lost:
    
        if (r3 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02f5, code lost:
    
        if (r19 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02f9, code lost:
    
        if ((r19 instanceof java.lang.Integer) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02ff, code lost:
    
        if ((r3.fieldName instanceof java.lang.Integer) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0301, code lost:
    
        popContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0308, code lost:
    
        if (r18.size() <= 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x030a, code lost:
    
        r0 = com.alibaba.fastjson.util.TypeUtils.cast((java.lang.Object) r18, (java.lang.Class<java.lang.Object>) r8, r17.config);
        setResolveStatus(0);
        parseObject(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0317, code lost:
    
        setContext(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x031a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x031b, code lost:
    
        r0 = r17.config.getDeserializer(r8);
        r3 = r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x032b, code lost:
    
        if (com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class.isAssignableFrom(r3) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x032f, code lost:
    
        if (r3 == com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer.class) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0333, code lost:
    
        if (r3 == com.alibaba.fastjson.parser.deserializer.ThrowableDeserializer.class) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0335, code lost:
    
        setResolveStatus(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x033c, code lost:
    
        if ((r0 instanceof com.alibaba.fastjson.parser.deserializer.MapDeserializer) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x033e, code lost:
    
        setResolveStatus(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0342, code lost:
    
        r0 = r0.deserialze(r17, r8, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0346, code lost:
    
        setContext(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0349, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021e A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0459 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0480 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04dc A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05db A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05e7 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05f3 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0608 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:24:0x0074, B:26:0x0078, B:31:0x0085, B:34:0x0098, B:38:0x00ad, B:117:0x021e, B:118:0x0224, B:120:0x022f, B:122:0x0237, B:126:0x024d, B:128:0x025b, B:141:0x0288, B:142:0x0290, B:144:0x029d, B:145:0x02a0, B:147:0x02aa, B:153:0x02ba, B:154:0x02c0, B:156:0x02c8, B:157:0x02cb, B:159:0x02d3, B:160:0x02dd, B:163:0x02e5, B:164:0x02ec, B:165:0x02ed, B:168:0x02f7, B:170:0x02fb, B:172:0x0301, B:173:0x0304, B:175:0x030a, B:178:0x031b, B:184:0x0335, B:188:0x0342, B:185:0x033a, B:187:0x033e, B:130:0x0262, B:132:0x0268, B:137:0x0275, B:138:0x0278, B:196:0x0353, B:200:0x035f, B:202:0x0367, B:204:0x0371, B:206:0x0382, B:208:0x038c, B:210:0x0394, B:212:0x0398, B:214:0x039e, B:217:0x03a3, B:219:0x03a7, B:242:0x040c, B:244:0x0414, B:247:0x041d, B:248:0x0437, B:221:0x03ad, B:223:0x03b5, B:226:0x03bb, B:227:0x03c8, B:230:0x03d1, B:233:0x03d7, B:236:0x03dc, B:237:0x03e9, B:239:0x03f3, B:241:0x0401, B:249:0x0438, B:250:0x0456, B:252:0x0459, B:254:0x045d, B:256:0x0461, B:259:0x0467, B:263:0x0470, B:269:0x0480, B:271:0x048f, B:273:0x049a, B:274:0x04a2, B:275:0x04a5, B:287:0x04d1, B:289:0x04dc, B:294:0x04e9, B:297:0x04f9, B:298:0x0519, B:282:0x04b5, B:284:0x04bf, B:286:0x04ce, B:285:0x04c4, B:301:0x051e, B:303:0x0528, B:305:0x0530, B:306:0x0533, B:308:0x053e, B:309:0x0542, B:311:0x054d, B:314:0x0554, B:317:0x055e, B:318:0x0563, B:321:0x0568, B:323:0x056d, B:327:0x0579, B:329:0x0581, B:331:0x0594, B:335:0x05af, B:337:0x05b7, B:340:0x05bd, B:342:0x05c3, B:344:0x05cb, B:347:0x05db, B:350:0x05e3, B:352:0x05e7, B:353:0x05ee, B:355:0x05f3, B:356:0x05f6, B:358:0x05fe, B:361:0x0608, B:364:0x0612, B:365:0x0617, B:366:0x061c, B:367:0x0636, B:332:0x059d, B:333:0x05a2, B:368:0x0637, B:370:0x0649, B:373:0x0650, B:376:0x065e, B:377:0x067e, B:41:0x00c1, B:42:0x00df, B:45:0x00e4, B:47:0x00ef, B:49:0x00f3, B:51:0x00f7, B:54:0x00fd, B:61:0x010c, B:63:0x0114, B:66:0x0126, B:67:0x013e, B:68:0x013f, B:69:0x0144, B:80:0x0159, B:81:0x015f, B:83:0x0166, B:85:0x0171, B:92:0x0183, B:95:0x018d, B:96:0x01a5, B:90:0x017e, B:84:0x016b, B:97:0x01a6, B:98:0x01be, B:104:0x01c8, B:106:0x01d0, B:109:0x01e3, B:110:0x0203, B:111:0x0204, B:112:0x0209, B:113:0x020a, B:115:0x0214, B:378:0x067f, B:379:0x0686, B:380:0x0687, B:381:0x068c, B:382:0x068d, B:383:0x0692), top: B:386:0x0074, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x05fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object parseObject(java.util.Map r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public void popContext() {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return;
        }
        this.context = this.context.parent;
        int i10 = this.contextArrayIndex;
        if (i10 <= 0) {
            return;
        }
        int i11 = i10 - 1;
        this.contextArrayIndex = i11;
        this.contextArray[i11] = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resolveReference(java.lang.String r5) {
        /*
            r4 = this;
            com.alibaba.fastjson.parser.ParseContext[] r0 = r4.contextArray
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 0
        L7:
            com.alibaba.fastjson.parser.ParseContext[] r2 = r4.contextArray
            int r3 = r2.length
            if (r0 >= r3) goto L22
            int r3 = r4.contextArrayIndex
            if (r0 >= r3) goto L22
            r2 = r2[r0]
            java.lang.String r3 = r2.toString()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1f
            java.lang.Object r5 = r2.object
            return r5
        L1f:
            int r0 = r0 + 1
            goto L7
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.resolveReference(java.lang.String):java.lang.Object");
    }

    public void setConfig(ParserConfig parserConfig) {
        this.config = parserConfig;
    }

    public void setContext(ParseContext parseContext) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return;
        }
        this.context = parseContext;
    }

    public void setDateFomrat(DateFormat dateFormat) {
        setDateFormat(dateFormat);
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }

    public void setFieldTypeResolver(FieldTypeResolver fieldTypeResolver) {
        this.fieldTypeResolver = fieldTypeResolver;
    }

    public void setResolveStatus(int i10) {
        this.resolveStatus = i10;
    }

    public void throwException(int i10) {
        throw new JSONException("syntax error, expect " + JSONToken.name(i10) + ", actual " + JSONToken.name(this.lexer.token()));
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(str, new JSONScanner(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    public Object parse(Object obj) {
        JSONLexer jSONLexer = this.lexer;
        int i10 = jSONLexer.token();
        if (i10 == 2) {
            Number numberIntegerValue = jSONLexer.integerValue();
            jSONLexer.nextToken();
            return numberIntegerValue;
        }
        if (i10 == 3) {
            Number numberDecimalValue = jSONLexer.decimalValue(jSONLexer.isEnabled(Feature.UseBigDecimal));
            jSONLexer.nextToken();
            return numberDecimalValue;
        }
        if (i10 == 4) {
            String strStringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            if (!jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                return strStringVal;
            }
            JSONScanner jSONScanner = new JSONScanner(strStringVal);
            try {
                return jSONScanner.scanISO8601DateIfMatch() ? jSONScanner.getCalendar().getTime() : strStringVal;
            } finally {
                jSONScanner.close();
            }
        }
        if (i10 == 12) {
            return parseObject(new JSONObject(jSONLexer.isEnabled(Feature.OrderedField)), obj);
        }
        if (i10 == 14) {
            JSONArray jSONArray = new JSONArray();
            parseArray(jSONArray, obj);
            return jSONLexer.isEnabled(Feature.UseObjectArray) ? jSONArray.toArray() : jSONArray;
        }
        if (i10 == 18) {
            if ("NaN".equals(jSONLexer.stringVal())) {
                jSONLexer.nextToken();
                return null;
            }
            throw new JSONException("syntax error, " + jSONLexer.info());
        }
        if (i10 == 26) {
            byte[] bArrBytesValue = jSONLexer.bytesValue();
            jSONLexer.nextToken();
            return bArrBytesValue;
        }
        switch (i10) {
            case 6:
                jSONLexer.nextToken();
                return Boolean.TRUE;
            case 7:
                jSONLexer.nextToken();
                return Boolean.FALSE;
            case 8:
                jSONLexer.nextToken();
                return null;
            case 9:
                jSONLexer.nextToken(18);
                if (jSONLexer.token() != 18) {
                    throw new JSONException("syntax error");
                }
                jSONLexer.nextToken(10);
                accept(10);
                long jLongValue = jSONLexer.integerValue().longValue();
                accept(2);
                accept(11);
                return new Date(jLongValue);
            default:
                switch (i10) {
                    case 20:
                        if (jSONLexer.isBlankInput()) {
                            return null;
                        }
                        throw new JSONException("unterminated json string, " + jSONLexer.info());
                    case 21:
                        jSONLexer.nextToken();
                        HashSet hashSet = new HashSet();
                        parseArray(hashSet, obj);
                        return hashSet;
                    case 22:
                        jSONLexer.nextToken();
                        TreeSet treeSet = new TreeSet();
                        parseArray(treeSet, obj);
                        return treeSet;
                    case 23:
                        jSONLexer.nextToken();
                        return null;
                    default:
                        throw new JSONException("syntax error, " + jSONLexer.info());
                }
        }
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i10) {
        this(str, new JSONScanner(str, i10), parserConfig);
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public ParseContext setContext(Object obj, Object obj2) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return null;
        }
        return setContext(this.context, obj, obj2);
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public DefaultJSONParser(char[] cArr, int i10, ParserConfig parserConfig, int i11) {
        this(cArr, new JSONScanner(cArr, i10, i11), parserConfig);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.getGlobalInstance());
    }

    public void parseArray(Type type, Collection collection, Object obj) {
        ObjectDeserializer deserializer;
        int i10 = this.lexer.token();
        if (i10 == 21 || i10 == 22) {
            this.lexer.nextToken();
            i10 = this.lexer.token();
        }
        if (i10 == 14) {
            Class cls = Integer.TYPE;
            if (cls != type) {
                if (String.class == type) {
                    deserializer = StringCodec.instance;
                    this.lexer.nextToken(4);
                } else {
                    deserializer = this.config.getDeserializer(type);
                    this.lexer.nextToken(deserializer.getFastMatchToken());
                }
            } else {
                deserializer = IntegerCodec.instance;
                this.lexer.nextToken(2);
            }
            ParseContext parseContext = this.context;
            setContext(collection, obj);
            int i11 = 0;
            while (true) {
                try {
                    if (this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                        while (this.lexer.token() == 16) {
                            this.lexer.nextToken();
                        }
                    }
                    if (this.lexer.token() == 15) {
                        setContext(parseContext);
                        this.lexer.nextToken(16);
                        return;
                    }
                    Object objDeserialze = null;
                    if (cls != type) {
                        if (String.class == type) {
                            if (this.lexer.token() == 4) {
                                objDeserialze = this.lexer.stringVal();
                                this.lexer.nextToken(16);
                            } else {
                                Object obj2 = parse();
                                if (obj2 != null) {
                                    objDeserialze = obj2.toString();
                                }
                            }
                            collection.add(objDeserialze);
                        } else {
                            if (this.lexer.token() == 8) {
                                this.lexer.nextToken();
                            } else {
                                objDeserialze = deserializer.deserialze(this, type, Integer.valueOf(i11));
                            }
                            collection.add(objDeserialze);
                            checkListResolve(collection);
                        }
                    } else {
                        collection.add(IntegerCodec.instance.deserialze(this, null, null));
                    }
                    if (this.lexer.token() == 16) {
                        this.lexer.nextToken(deserializer.getFastMatchToken());
                    }
                    i11++;
                } catch (Throwable th) {
                    setContext(parseContext);
                    throw th;
                }
            }
        } else {
            throw new JSONException("expect '[', but " + JSONToken.name(i10) + ", " + this.lexer.info());
        }
    }

    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.isEnabled(Feature.DisableCircularReferenceDetect)) {
            return null;
        }
        ParseContext parseContext2 = new ParseContext(parseContext, obj, obj2);
        this.context = parseContext2;
        addContext(parseContext2);
        return this.context;
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        this((Object) null, jSONLexer, parserConfig);
    }

    public final void accept(int i10, int i11) {
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == i10) {
            jSONLexer.nextToken(i11);
        } else {
            throwException(i10);
        }
    }

    public DefaultJSONParser(Object obj, JSONLexer jSONLexer, ParserConfig parserConfig) {
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.contextArrayIndex = 0;
        this.resolveStatus = 0;
        this.extraTypeProviders = null;
        this.extraProcessors = null;
        this.fieldTypeResolver = null;
        this.objectKeyLevel = 0;
        this.autoTypeAccept = null;
        this.lexer = jSONLexer;
        this.input = obj;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char current = jSONLexer.getCurrent();
        if (current == '{') {
            jSONLexer.next();
            ((JSONLexerBase) jSONLexer).token = 12;
        } else if (current == '[') {
            jSONLexer.next();
            ((JSONLexerBase) jSONLexer).token = 14;
        } else {
            jSONLexer.nextToken();
        }
    }

    public Object[] parseArray(Type[] typeArr) {
        Object objCast;
        Class<?> componentType;
        boolean zIsArray;
        Class cls;
        int i10 = 8;
        if (this.lexer.token() == 8) {
            this.lexer.nextToken(16);
            return null;
        }
        int i11 = 14;
        if (this.lexer.token() == 14) {
            Object[] objArr = new Object[typeArr.length];
            if (typeArr.length == 0) {
                this.lexer.nextToken(15);
                if (this.lexer.token() == 15) {
                    this.lexer.nextToken(16);
                    return new Object[0];
                }
                throw new JSONException("syntax error");
            }
            this.lexer.nextToken(2);
            int i12 = 0;
            while (i12 < typeArr.length) {
                if (this.lexer.token() == i10) {
                    this.lexer.nextToken(16);
                    objCast = null;
                } else {
                    Type type = typeArr[i12];
                    if (type != Integer.TYPE && type != Integer.class) {
                        if (type == String.class) {
                            if (this.lexer.token() == 4) {
                                objCast = this.lexer.stringVal();
                                this.lexer.nextToken(16);
                            } else {
                                objCast = TypeUtils.cast(parse(), type, this.config);
                            }
                        } else {
                            if (i12 == typeArr.length - 1 && (type instanceof Class) && (((cls = (Class) type) != byte[].class && cls != char[].class) || this.lexer.token() != 4)) {
                                zIsArray = cls.isArray();
                                componentType = cls.getComponentType();
                            } else {
                                componentType = null;
                                zIsArray = false;
                            }
                            if (zIsArray && this.lexer.token() != i11) {
                                ArrayList arrayList = new ArrayList();
                                ObjectDeserializer deserializer = this.config.getDeserializer(componentType);
                                int fastMatchToken = deserializer.getFastMatchToken();
                                if (this.lexer.token() != 15) {
                                    while (true) {
                                        arrayList.add(deserializer.deserialze(this, type, null));
                                        if (this.lexer.token() != 16) {
                                            break;
                                        }
                                        this.lexer.nextToken(fastMatchToken);
                                    }
                                    if (this.lexer.token() != 15) {
                                        throw new JSONException("syntax error :" + JSONToken.name(this.lexer.token()));
                                    }
                                }
                                objCast = TypeUtils.cast(arrayList, type, this.config);
                            } else {
                                objCast = this.config.getDeserializer(type).deserialze(this, type, Integer.valueOf(i12));
                            }
                        }
                    } else if (this.lexer.token() == 2) {
                        objCast = Integer.valueOf(this.lexer.intValue());
                        this.lexer.nextToken(16);
                    } else {
                        objCast = TypeUtils.cast(parse(), type, this.config);
                    }
                }
                objArr[i12] = objCast;
                if (this.lexer.token() == 15) {
                    break;
                }
                if (this.lexer.token() == 16) {
                    if (i12 == typeArr.length - 1) {
                        this.lexer.nextToken(15);
                    } else {
                        this.lexer.nextToken(2);
                    }
                    i12++;
                    i10 = 8;
                    i11 = 14;
                } else {
                    throw new JSONException("syntax error :" + JSONToken.name(this.lexer.token()));
                }
            }
            if (this.lexer.token() == 15) {
                this.lexer.nextToken(16);
                return objArr;
            }
            throw new JSONException("syntax error");
        }
        throw new JSONException("syntax error : " + this.lexer.tokenName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0239, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(com.alibaba.fastjson.parser.deserializer.PropertyProcessable r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parse(com.alibaba.fastjson.parser.deserializer.PropertyProcessable, java.lang.Object):java.lang.Object");
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    public final void parseArray(Collection collection, Object obj) {
        Object object;
        Number numberDecimalValue;
        JSONLexer jSONLexer = this.lexer;
        if (jSONLexer.token() == 21 || jSONLexer.token() == 22) {
            jSONLexer.nextToken();
        }
        if (jSONLexer.token() == 14) {
            jSONLexer.nextToken(4);
            ParseContext parseContext = this.context;
            if (parseContext != null && parseContext.level > 512) {
                throw new JSONException("array level > 512");
            }
            setContext(collection, obj);
            int i10 = 0;
            while (true) {
                try {
                    if (jSONLexer.isEnabled(Feature.AllowArbitraryCommas)) {
                        while (jSONLexer.token() == 16) {
                            jSONLexer.nextToken();
                        }
                    }
                    int i11 = jSONLexer.token();
                    if (i11 == 2) {
                        Number numberIntegerValue = jSONLexer.integerValue();
                        jSONLexer.nextToken(16);
                        object = numberIntegerValue;
                    } else if (i11 == 3) {
                        if (jSONLexer.isEnabled(Feature.UseBigDecimal)) {
                            numberDecimalValue = jSONLexer.decimalValue(true);
                        } else {
                            numberDecimalValue = jSONLexer.decimalValue(false);
                        }
                        object = numberDecimalValue;
                        jSONLexer.nextToken(16);
                    } else if (i11 == 4) {
                        String strStringVal = jSONLexer.stringVal();
                        jSONLexer.nextToken(16);
                        object = strStringVal;
                        if (jSONLexer.isEnabled(Feature.AllowISO8601DateFormat)) {
                            JSONScanner jSONScanner = new JSONScanner(strStringVal);
                            Object time = strStringVal;
                            if (jSONScanner.scanISO8601DateIfMatch()) {
                                time = jSONScanner.getCalendar().getTime();
                            }
                            jSONScanner.close();
                            object = time;
                        }
                    } else if (i11 == 6) {
                        Boolean bool = Boolean.TRUE;
                        jSONLexer.nextToken(16);
                        object = bool;
                    } else if (i11 != 7) {
                        object = null;
                        object = null;
                        if (i11 == 8) {
                            jSONLexer.nextToken(4);
                        } else if (i11 == 12) {
                            object = parseObject(new JSONObject(jSONLexer.isEnabled(Feature.OrderedField)), Integer.valueOf(i10));
                        } else {
                            if (i11 == 20) {
                                throw new JSONException("unclosed jsonArray");
                            }
                            if (i11 == 23) {
                                jSONLexer.nextToken(4);
                            } else if (i11 == 14) {
                                JSONArray jSONArray = new JSONArray();
                                parseArray(jSONArray, Integer.valueOf(i10));
                                object = jSONArray;
                                if (jSONLexer.isEnabled(Feature.UseObjectArray)) {
                                    object = jSONArray.toArray();
                                }
                            } else if (i11 != 15) {
                                object = parse();
                            } else {
                                jSONLexer.nextToken(16);
                                setContext(parseContext);
                                return;
                            }
                        }
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        jSONLexer.nextToken(16);
                        object = bool2;
                    }
                    collection.add(object);
                    checkListResolve(collection);
                    if (jSONLexer.token() == 16) {
                        jSONLexer.nextToken(4);
                    }
                    i10++;
                } catch (Throwable th) {
                    setContext(parseContext);
                    throw th;
                }
            }
        } else {
            throw new JSONException("syntax error, expect [, actual " + JSONToken.name(jSONLexer.token()) + ", pos " + jSONLexer.pos() + ", fieldName " + obj);
        }
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T parseObject(Type type, Object obj) {
        int i10 = this.lexer.token();
        if (i10 == 8) {
            this.lexer.nextToken();
            return null;
        }
        if (i10 == 4) {
            if (type == byte[].class) {
                T t10 = (T) this.lexer.bytesValue();
                this.lexer.nextToken();
                return t10;
            }
            if (type == char[].class) {
                String strStringVal = this.lexer.stringVal();
                this.lexer.nextToken();
                return (T) strStringVal.toCharArray();
            }
        }
        ObjectDeserializer deserializer = this.config.getDeserializer(type);
        try {
            if (deserializer.getClass() == JavaBeanDeserializer.class) {
                if (this.lexer.token() != 12 && this.lexer.token() != 14) {
                    throw new JSONException("syntax error,except start with { or [,but actually start with " + this.lexer.tokenName());
                }
                return (T) ((JavaBeanDeserializer) deserializer).deserialze(this, type, obj, 0);
            }
            return (T) deserializer.deserialze(this, type, obj);
        } catch (JSONException e10) {
            throw e10;
        } catch (Throwable th) {
            throw new JSONException(th.getMessage(), th);
        }
    }

    public void parseObject(Object obj) {
        Object objDeserialze;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        JavaBeanDeserializer javaBeanDeserializer = deserializer instanceof JavaBeanDeserializer ? (JavaBeanDeserializer) deserializer : null;
        if (this.lexer.token() != 12 && this.lexer.token() != 16) {
            throw new JSONException("syntax error, expect {, actual " + this.lexer.tokenName());
        }
        while (true) {
            String strScanSymbol = this.lexer.scanSymbol(this.symbolTable);
            if (strScanSymbol == null) {
                if (this.lexer.token() == 13) {
                    this.lexer.nextToken(16);
                    return;
                } else if (this.lexer.token() != 16 || !this.lexer.isEnabled(Feature.AllowArbitraryCommas)) {
                }
            }
            FieldDeserializer fieldDeserializer = javaBeanDeserializer != null ? javaBeanDeserializer.getFieldDeserializer(strScanSymbol) : null;
            if (fieldDeserializer == null) {
                if (this.lexer.isEnabled(Feature.IgnoreNotMatch)) {
                    this.lexer.nextTokenWithColon();
                    parse();
                    if (this.lexer.token() == 13) {
                        this.lexer.nextToken();
                        return;
                    }
                } else {
                    throw new JSONException("setter not found, class " + cls.getName() + ", property " + strScanSymbol);
                }
            } else {
                FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                Class<?> cls2 = fieldInfo.fieldClass;
                Type type = fieldInfo.fieldType;
                if (cls2 == Integer.TYPE) {
                    this.lexer.nextTokenWithColon(2);
                    objDeserialze = IntegerCodec.instance.deserialze(this, type, null);
                } else if (cls2 == String.class) {
                    this.lexer.nextTokenWithColon(4);
                    objDeserialze = StringCodec.deserialze(this);
                } else if (cls2 == Long.TYPE) {
                    this.lexer.nextTokenWithColon(2);
                    objDeserialze = LongCodec.instance.deserialze(this, type, null);
                } else {
                    ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                    this.lexer.nextTokenWithColon(deserializer2.getFastMatchToken());
                    objDeserialze = deserializer2.deserialze(this, type, null);
                }
                fieldDeserializer.setValue(obj, objDeserialze);
                if (this.lexer.token() != 16 && this.lexer.token() == 13) {
                    this.lexer.nextToken(16);
                    return;
                }
            }
        }
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    public JSONObject parseObject() {
        Object object = parseObject((Map) new JSONObject(this.lexer.isEnabled(Feature.OrderedField)));
        if (object instanceof JSONObject) {
            return (JSONObject) object;
        }
        if (object == null) {
            return null;
        }
        return new JSONObject((Map<String, Object>) object);
    }
}
