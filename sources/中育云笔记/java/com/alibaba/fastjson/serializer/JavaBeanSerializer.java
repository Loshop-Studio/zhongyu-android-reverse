package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class JavaBeanSerializer extends SerializeFilterable implements ObjectSerializer {
    protected SerializeBeanInfo beanInfo;
    protected final FieldSerializer[] getters;
    private volatile transient long[] hashArray;
    private volatile transient short[] hashArrayMapping;
    protected final FieldSerializer[] sortedGetters;

    public JavaBeanSerializer(Class<?> cls) {
        this(cls, (Map<String, String>) null);
    }

    public static Map<String, String> createAliasMap(String... strArr) {
        HashMap map = new HashMap();
        for (String str : strArr) {
            map.put(str, str);
        }
        return map;
    }

    public boolean applyLabel(JSONSerializer jSONSerializer, String str) {
        List<LabelFilter> list = jSONSerializer.labelFilters;
        if (list != null) {
            Iterator<LabelFilter> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().apply(str)) {
                    return false;
                }
            }
        }
        List<LabelFilter> list2 = this.labelFilters;
        if (list2 == null) {
            return true;
        }
        Iterator<LabelFilter> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (!it2.next().apply(str)) {
                return false;
            }
        }
        return true;
    }

    public BeanContext getBeanContext(int i10) {
        return this.sortedGetters[i10].fieldContext;
    }

    public Set<String> getFieldNames(Object obj) {
        HashSet hashSet = new HashSet();
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            if (fieldSerializer.getPropertyValueDirect(obj) != null) {
                hashSet.add(fieldSerializer.fieldInfo.name);
            }
        }
        return hashSet;
    }

    public FieldSerializer getFieldSerializer(String str) {
        if (str == null) {
            return null;
        }
        int length = this.sortedGetters.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            int iCompareTo = this.sortedGetters[i11].fieldInfo.name.compareTo(str);
            if (iCompareTo < 0) {
                i10 = i11 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return this.sortedGetters[i11];
                }
                length = i11 - 1;
            }
        }
        return null;
    }

    public Type getFieldType(int i10) {
        return this.sortedGetters[i10].fieldInfo.fieldType;
    }

    public Object getFieldValue(Object obj, String str) {
        FieldSerializer fieldSerializer = getFieldSerializer(str);
        if (fieldSerializer == null) {
            throw new JSONException("field not found. " + str);
        }
        try {
            return fieldSerializer.getPropertyValue(obj);
        } catch (IllegalAccessException e10) {
            throw new JSONException("getFieldValue error." + str, e10);
        } catch (InvocationTargetException e11) {
            throw new JSONException("getFieldValue error." + str, e11);
        }
    }

    public List<Object> getFieldValues(Object obj) {
        ArrayList arrayList = new ArrayList(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            arrayList.add(fieldSerializer.getPropertyValue(obj));
        }
        return arrayList;
    }

    public Map<String, Object> getFieldValuesMap(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            boolean zIsEnabled = SerializerFeature.isEnabled(fieldSerializer.features, SerializerFeature.SkipTransientField);
            FieldInfo fieldInfo = fieldSerializer.fieldInfo;
            if (!zIsEnabled || fieldInfo == null || !fieldInfo.fieldTransient) {
                if (fieldInfo.unwrapped) {
                    Object json = JSON.toJSON(fieldSerializer.getPropertyValue(obj));
                    if (json instanceof Map) {
                        linkedHashMap.putAll((Map) json);
                    } else {
                        linkedHashMap.put(fieldSerializer.fieldInfo.name, fieldSerializer.getPropertyValue(obj));
                    }
                } else {
                    linkedHashMap.put(fieldInfo.name, fieldSerializer.getPropertyValue(obj));
                }
            }
        }
        return linkedHashMap;
    }

    public List<Object> getObjectFieldValues(Object obj) {
        ArrayList arrayList = new ArrayList(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            Class<?> cls = fieldSerializer.fieldInfo.fieldClass;
            if (!cls.isPrimitive() && !cls.getName().startsWith("java.lang.")) {
                arrayList.add(fieldSerializer.getPropertyValue(obj));
            }
        }
        return arrayList;
    }

    public int getSize(Object obj) {
        int i10 = 0;
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            if (fieldSerializer.getPropertyValueDirect(obj) != null) {
                i10++;
            }
        }
        return i10;
    }

    public Class<?> getType() {
        return this.beanInfo.beanType;
    }

    public boolean isWriteAsArray(JSONSerializer jSONSerializer) {
        return isWriteAsArray(jSONSerializer, 0);
    }

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i10, false);
    }

    public char writeAfter(JSONSerializer jSONSerializer, Object obj, char c10) {
        List<AfterFilter> list = jSONSerializer.afterFilters;
        if (list != null) {
            Iterator<AfterFilter> it = list.iterator();
            while (it.hasNext()) {
                c10 = it.next().writeAfter(jSONSerializer, obj, c10);
            }
        }
        List<AfterFilter> list2 = this.afterFilters;
        if (list2 != null) {
            Iterator<AfterFilter> it2 = list2.iterator();
            while (it2.hasNext()) {
                c10 = it2.next().writeAfter(jSONSerializer, obj, c10);
            }
        }
        return c10;
    }

    public void writeAsArray(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i10);
    }

    public void writeAsArrayNonContext(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i10);
    }

    public char writeBefore(JSONSerializer jSONSerializer, Object obj, char c10) {
        List<BeforeFilter> list = jSONSerializer.beforeFilters;
        if (list != null) {
            Iterator<BeforeFilter> it = list.iterator();
            while (it.hasNext()) {
                c10 = it.next().writeBefore(jSONSerializer, obj, c10);
            }
        }
        List<BeforeFilter> list2 = this.beforeFilters;
        if (list2 != null) {
            Iterator<BeforeFilter> it2 = list2.iterator();
            while (it2.hasNext()) {
                c10 = it2.next().writeBefore(jSONSerializer, obj, c10);
            }
        }
        return c10;
    }

    public void writeClassName(JSONSerializer jSONSerializer, String str, Object obj) {
        if (str == null) {
            str = jSONSerializer.config.typeKey;
        }
        jSONSerializer.out.writeFieldName(str, false);
        String name = this.beanInfo.typeName;
        if (name == null) {
            Class<?> superclass = obj.getClass();
            if (TypeUtils.isProxy(superclass)) {
                superclass = superclass.getSuperclass();
            }
            name = superclass.getName();
        }
        jSONSerializer.write(name);
    }

    public void writeDirectNonContext(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i10);
    }

    public void writeNoneASM(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws Throwable {
        write(jSONSerializer, obj, obj2, type, i10, false);
    }

    public boolean writeReference(JSONSerializer jSONSerializer, Object obj, int i10) {
        IdentityHashMap<Object, SerialContext> identityHashMap;
        SerialContext serialContext = jSONSerializer.context;
        int i11 = SerializerFeature.DisableCircularReferenceDetect.mask;
        if (serialContext == null || (serialContext.features & i11) != 0 || (i10 & i11) != 0 || (identityHashMap = jSONSerializer.references) == null || !identityHashMap.containsKey(obj)) {
            return false;
        }
        jSONSerializer.writeReference(obj);
        return true;
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
        this(cls, createAliasMap(strArr));
    }

    public boolean isWriteAsArray(JSONSerializer jSONSerializer, int i10) {
        int i11 = SerializerFeature.BeanToArray.mask;
        return ((this.beanInfo.features & i11) == 0 && !jSONSerializer.out.beanToArray && (i10 & i11) == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01d5, code lost:
    
        if ((r11.features & r32) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02aa, code lost:
    
        if ((r31 & r3.mask) == 0) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b4 A[Catch: all -> 0x036f, Exception -> 0x0374, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x0374, blocks: (B:59:0x00c7, B:73:0x0103, B:81:0x0118, B:96:0x0141, B:109:0x0172, B:206:0x02b4, B:215:0x02d3), top: B:425:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x037b A[Catch: all -> 0x02ea, Exception -> 0x02ef, TryCatch #2 {Exception -> 0x02ef, blocks: (B:217:0x02d7, B:219:0x02db, B:221:0x02df, B:229:0x02f6, B:231:0x02fa, B:233:0x02fe, B:236:0x0308, B:238:0x030c, B:240:0x0310, B:243:0x031a, B:245:0x031e, B:247:0x0322, B:250:0x0330, B:252:0x0334, B:254:0x0338, B:257:0x0346, B:259:0x034a, B:261:0x034e, B:264:0x035c, B:266:0x0360, B:268:0x0364, B:276:0x037b, B:278:0x037f, B:280:0x0383, B:283:0x038e, B:285:0x039b, B:289:0x03a5, B:291:0x03ab, B:349:0x046a, B:351:0x046e, B:353:0x0472, B:356:0x047b, B:358:0x0483, B:359:0x048b, B:361:0x0491, B:296:0x03b6, B:297:0x03b9, B:299:0x03bf, B:301:0x03cb, B:308:0x03e0, B:313:0x03ea, B:314:0x03f2, B:316:0x03f7, B:319:0x03ff, B:324:0x040c, B:326:0x0414, B:327:0x041d, B:329:0x0426, B:331:0x042d, B:332:0x0432, B:334:0x0435, B:335:0x043a, B:336:0x043f, B:338:0x0444, B:339:0x0449, B:340:0x044e, B:342:0x0452, B:344:0x0456, B:347:0x0462, B:348:0x0466, B:377:0x04c6, B:379:0x04ce, B:381:0x04d6), top: B:414:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x046e A[Catch: all -> 0x02ea, Exception -> 0x02ef, TryCatch #2 {Exception -> 0x02ef, blocks: (B:217:0x02d7, B:219:0x02db, B:221:0x02df, B:229:0x02f6, B:231:0x02fa, B:233:0x02fe, B:236:0x0308, B:238:0x030c, B:240:0x0310, B:243:0x031a, B:245:0x031e, B:247:0x0322, B:250:0x0330, B:252:0x0334, B:254:0x0338, B:257:0x0346, B:259:0x034a, B:261:0x034e, B:264:0x035c, B:266:0x0360, B:268:0x0364, B:276:0x037b, B:278:0x037f, B:280:0x0383, B:283:0x038e, B:285:0x039b, B:289:0x03a5, B:291:0x03ab, B:349:0x046a, B:351:0x046e, B:353:0x0472, B:356:0x047b, B:358:0x0483, B:359:0x048b, B:361:0x0491, B:296:0x03b6, B:297:0x03b9, B:299:0x03bf, B:301:0x03cb, B:308:0x03e0, B:313:0x03ea, B:314:0x03f2, B:316:0x03f7, B:319:0x03ff, B:324:0x040c, B:326:0x0414, B:327:0x041d, B:329:0x0426, B:331:0x042d, B:332:0x0432, B:334:0x0435, B:335:0x043a, B:336:0x043f, B:338:0x0444, B:339:0x0449, B:340:0x044e, B:342:0x0452, B:344:0x0456, B:347:0x0462, B:348:0x0466, B:377:0x04c6, B:379:0x04ce, B:381:0x04d6), top: B:414:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04d6 A[Catch: all -> 0x02ea, Exception -> 0x02ef, TRY_LEAVE, TryCatch #2 {Exception -> 0x02ef, blocks: (B:217:0x02d7, B:219:0x02db, B:221:0x02df, B:229:0x02f6, B:231:0x02fa, B:233:0x02fe, B:236:0x0308, B:238:0x030c, B:240:0x0310, B:243:0x031a, B:245:0x031e, B:247:0x0322, B:250:0x0330, B:252:0x0334, B:254:0x0338, B:257:0x0346, B:259:0x034a, B:261:0x034e, B:264:0x035c, B:266:0x0360, B:268:0x0364, B:276:0x037b, B:278:0x037f, B:280:0x0383, B:283:0x038e, B:285:0x039b, B:289:0x03a5, B:291:0x03ab, B:349:0x046a, B:351:0x046e, B:353:0x0472, B:356:0x047b, B:358:0x0483, B:359:0x048b, B:361:0x0491, B:296:0x03b6, B:297:0x03b9, B:299:0x03bf, B:301:0x03cb, B:308:0x03e0, B:313:0x03ea, B:314:0x03f2, B:316:0x03f7, B:319:0x03ff, B:324:0x040c, B:326:0x0414, B:327:0x041d, B:329:0x0426, B:331:0x042d, B:332:0x0432, B:334:0x0435, B:335:0x043a, B:336:0x043f, B:338:0x0444, B:339:0x0449, B:340:0x044e, B:342:0x0452, B:344:0x0456, B:347:0x0462, B:348:0x0466, B:377:0x04c6, B:379:0x04ce, B:381:0x04d6), top: B:414:0x02d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0507 A[Catch: all -> 0x0059, TRY_ENTER, TryCatch #7 {all -> 0x0059, blocks: (B:26:0x0055, B:31:0x0061, B:33:0x0064, B:35:0x006c, B:36:0x0072, B:38:0x007f, B:40:0x0083, B:51:0x00a5, B:55:0x00b3, B:57:0x00c4, B:65:0x00f4, B:75:0x0109, B:83:0x011e, B:85:0x0124, B:102:0x0156, B:105:0x0164, B:113:0x0188, B:115:0x0196, B:118:0x01a5, B:120:0x01b1, B:208:0x02b8, B:210:0x02c4, B:386:0x04e5, B:389:0x0507, B:397:0x0557, B:399:0x055d, B:400:0x0575, B:402:0x0579, B:406:0x0582, B:407:0x0587, B:391:0x051e, B:393:0x0522, B:395:0x0526, B:396:0x0541, B:124:0x01bd, B:126:0x01cb, B:128:0x01cf, B:133:0x01de, B:135:0x01e2, B:136:0x01e6, B:138:0x01ec, B:140:0x01f0, B:142:0x01f6, B:144:0x0204, B:146:0x0208, B:150:0x0213, B:153:0x021a, B:155:0x0220, B:158:0x0225, B:160:0x022d, B:162:0x023b, B:164:0x023f, B:168:0x024a, B:171:0x0251, B:173:0x0257, B:176:0x025c, B:178:0x0264, B:180:0x0272, B:182:0x0276, B:186:0x0282, B:188:0x0286, B:189:0x0289, B:191:0x028f, B:193:0x0293, B:195:0x0298, B:197:0x029c, B:199:0x02a6, B:90:0x0130, B:42:0x0089, B:44:0x008f, B:46:0x0093, B:49:0x009b), top: B:420:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x055d A[Catch: all -> 0x0059, TryCatch #7 {all -> 0x0059, blocks: (B:26:0x0055, B:31:0x0061, B:33:0x0064, B:35:0x006c, B:36:0x0072, B:38:0x007f, B:40:0x0083, B:51:0x00a5, B:55:0x00b3, B:57:0x00c4, B:65:0x00f4, B:75:0x0109, B:83:0x011e, B:85:0x0124, B:102:0x0156, B:105:0x0164, B:113:0x0188, B:115:0x0196, B:118:0x01a5, B:120:0x01b1, B:208:0x02b8, B:210:0x02c4, B:386:0x04e5, B:389:0x0507, B:397:0x0557, B:399:0x055d, B:400:0x0575, B:402:0x0579, B:406:0x0582, B:407:0x0587, B:391:0x051e, B:393:0x0522, B:395:0x0526, B:396:0x0541, B:124:0x01bd, B:126:0x01cb, B:128:0x01cf, B:133:0x01de, B:135:0x01e2, B:136:0x01e6, B:138:0x01ec, B:140:0x01f0, B:142:0x01f6, B:144:0x0204, B:146:0x0208, B:150:0x0213, B:153:0x021a, B:155:0x0220, B:158:0x0225, B:160:0x022d, B:162:0x023b, B:164:0x023f, B:168:0x024a, B:171:0x0251, B:173:0x0257, B:176:0x025c, B:178:0x0264, B:180:0x0272, B:182:0x0276, B:186:0x0282, B:188:0x0286, B:189:0x0289, B:191:0x028f, B:193:0x0293, B:195:0x0298, B:197:0x029c, B:199:0x02a6, B:90:0x0130, B:42:0x0089, B:44:0x008f, B:46:0x0093, B:49:0x009b), top: B:420:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0579 A[Catch: all -> 0x0059, TryCatch #7 {all -> 0x0059, blocks: (B:26:0x0055, B:31:0x0061, B:33:0x0064, B:35:0x006c, B:36:0x0072, B:38:0x007f, B:40:0x0083, B:51:0x00a5, B:55:0x00b3, B:57:0x00c4, B:65:0x00f4, B:75:0x0109, B:83:0x011e, B:85:0x0124, B:102:0x0156, B:105:0x0164, B:113:0x0188, B:115:0x0196, B:118:0x01a5, B:120:0x01b1, B:208:0x02b8, B:210:0x02c4, B:386:0x04e5, B:389:0x0507, B:397:0x0557, B:399:0x055d, B:400:0x0575, B:402:0x0579, B:406:0x0582, B:407:0x0587, B:391:0x051e, B:393:0x0522, B:395:0x0526, B:396:0x0541, B:124:0x01bd, B:126:0x01cb, B:128:0x01cf, B:133:0x01de, B:135:0x01e2, B:136:0x01e6, B:138:0x01ec, B:140:0x01f0, B:142:0x01f6, B:144:0x0204, B:146:0x0208, B:150:0x0213, B:153:0x021a, B:155:0x0220, B:158:0x0225, B:160:0x022d, B:162:0x023b, B:164:0x023f, B:168:0x024a, B:171:0x0251, B:173:0x0257, B:176:0x025c, B:178:0x0264, B:180:0x0272, B:182:0x0276, B:186:0x0282, B:188:0x0286, B:189:0x0289, B:191:0x028f, B:193:0x0293, B:195:0x0298, B:197:0x029c, B:199:0x02a6, B:90:0x0130, B:42:0x0089, B:44:0x008f, B:46:0x0093, B:49:0x009b), top: B:420:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0147 A[PHI: r21
      0x0147: PHI (r21v8 com.alibaba.fastjson.serializer.FieldSerializer) = 
      (r21v1 com.alibaba.fastjson.serializer.FieldSerializer)
      (r21v4 com.alibaba.fastjson.serializer.FieldSerializer)
      (r21v1 com.alibaba.fastjson.serializer.FieldSerializer)
      (r21v1 com.alibaba.fastjson.serializer.FieldSerializer)
      (r21v1 com.alibaba.fastjson.serializer.FieldSerializer)
     binds: [B:79:0x0114, B:97:0x0145, B:86:0x0128, B:71:0x0100, B:66:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r36, java.lang.Object r37, java.lang.Object r38, java.lang.reflect.Type r39, int r40, boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type, int, boolean):void");
    }

    public JavaBeanSerializer(Class<?> cls, Map<String, String> map) {
        this(TypeUtils.buildBeanInfo(cls, map, null));
    }

    public JavaBeanSerializer(SerializeBeanInfo serializeBeanInfo) {
        FieldSerializer[] fieldSerializerArr;
        this.beanInfo = serializeBeanInfo;
        this.sortedGetters = new FieldSerializer[serializeBeanInfo.sortedFields.length];
        int i10 = 0;
        while (true) {
            fieldSerializerArr = this.sortedGetters;
            if (i10 >= fieldSerializerArr.length) {
                break;
            }
            fieldSerializerArr[i10] = new FieldSerializer(serializeBeanInfo.beanType, serializeBeanInfo.sortedFields[i10]);
            i10++;
        }
        FieldInfo[] fieldInfoArr = serializeBeanInfo.fields;
        if (fieldInfoArr == serializeBeanInfo.sortedFields) {
            this.getters = fieldSerializerArr;
        } else {
            this.getters = new FieldSerializer[fieldInfoArr.length];
            int i11 = 0;
            while (true) {
                if (i11 >= this.getters.length) {
                    break;
                }
                FieldSerializer fieldSerializer = getFieldSerializer(serializeBeanInfo.fields[i11].name);
                if (fieldSerializer == null) {
                    FieldSerializer[] fieldSerializerArr2 = this.sortedGetters;
                    System.arraycopy(fieldSerializerArr2, 0, this.getters, 0, fieldSerializerArr2.length);
                    break;
                } else {
                    this.getters[i11] = fieldSerializer;
                    i11++;
                }
            }
        }
        JSONType jSONType = serializeBeanInfo.jsonType;
        if (jSONType != null) {
            for (Class<? extends SerializeFilter> cls : jSONType.serialzeFilters()) {
                try {
                    addFilter(cls.getConstructor(null).newInstance(null));
                } catch (Exception unused) {
                }
            }
        }
    }

    public FieldSerializer getFieldSerializer(long j10) {
        PropertyNamingStrategy[] propertyNamingStrategyArrValues;
        int iBinarySearch;
        if (this.hashArray == null) {
            propertyNamingStrategyArrValues = PropertyNamingStrategy.values();
            long[] jArr = new long[this.sortedGetters.length * propertyNamingStrategyArrValues.length];
            int i10 = 0;
            int i11 = 0;
            while (true) {
                FieldSerializer[] fieldSerializerArr = this.sortedGetters;
                if (i10 >= fieldSerializerArr.length) {
                    break;
                }
                String str = fieldSerializerArr[i10].fieldInfo.name;
                jArr[i11] = TypeUtils.fnv1a_64(str);
                i11++;
                for (PropertyNamingStrategy propertyNamingStrategy : propertyNamingStrategyArrValues) {
                    String strTranslate = propertyNamingStrategy.translate(str);
                    if (!str.equals(strTranslate)) {
                        jArr[i11] = TypeUtils.fnv1a_64(strTranslate);
                        i11++;
                    }
                }
                i10++;
            }
            Arrays.sort(jArr, 0, i11);
            this.hashArray = new long[i11];
            System.arraycopy(jArr, 0, this.hashArray, 0, i11);
        } else {
            propertyNamingStrategyArrValues = null;
        }
        int iBinarySearch2 = Arrays.binarySearch(this.hashArray, j10);
        if (iBinarySearch2 < 0) {
            return null;
        }
        if (this.hashArrayMapping == null) {
            if (propertyNamingStrategyArrValues == null) {
                propertyNamingStrategyArrValues = PropertyNamingStrategy.values();
            }
            short[] sArr = new short[this.hashArray.length];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (true) {
                FieldSerializer[] fieldSerializerArr2 = this.sortedGetters;
                if (i12 >= fieldSerializerArr2.length) {
                    break;
                }
                String str2 = fieldSerializerArr2[i12].fieldInfo.name;
                int iBinarySearch3 = Arrays.binarySearch(this.hashArray, TypeUtils.fnv1a_64(str2));
                if (iBinarySearch3 >= 0) {
                    sArr[iBinarySearch3] = (short) i12;
                }
                for (PropertyNamingStrategy propertyNamingStrategy2 : propertyNamingStrategyArrValues) {
                    String strTranslate2 = propertyNamingStrategy2.translate(str2);
                    if (!str2.equals(strTranslate2) && (iBinarySearch = Arrays.binarySearch(this.hashArray, TypeUtils.fnv1a_64(strTranslate2))) >= 0) {
                        sArr[iBinarySearch] = (short) i12;
                    }
                }
                i12++;
            }
            this.hashArrayMapping = sArr;
        }
        short s10 = this.hashArrayMapping[iBinarySearch2];
        if (s10 != -1) {
            return this.sortedGetters[s10];
        }
        return null;
    }

    public Object getFieldValue(Object obj, String str, long j10, boolean z10) {
        FieldSerializer fieldSerializer = getFieldSerializer(j10);
        if (fieldSerializer == null) {
            if (!z10) {
                return null;
            }
            throw new JSONException("field not found. " + str);
        }
        try {
            return fieldSerializer.getPropertyValue(obj);
        } catch (IllegalAccessException e10) {
            throw new JSONException("getFieldValue error." + str, e10);
        } catch (InvocationTargetException e11) {
            throw new JSONException("getFieldValue error." + str, e11);
        }
    }
}
