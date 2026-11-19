package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class JavaBeanInfo {
    public final Method buildMethod;
    public final Class<?> builderClass;
    public final Class<?> clazz;
    public final Constructor<?> creatorConstructor;
    public Type[] creatorConstructorParameterTypes;
    public String[] creatorConstructorParameters;
    public final Constructor<?> defaultConstructor;
    public final int defaultConstructorParameterSize;
    public final Method factoryMethod;
    public final FieldInfo[] fields;
    public final JSONType jsonType;

    /* renamed from: kotlin, reason: collision with root package name */
    public boolean f28538kotlin;
    public Constructor<?> kotlinDefaultConstructor;
    public String[] orders;
    public final int parserFeatures;
    public final FieldInfo[] sortedFields;
    public final String typeKey;
    public final String typeName;

    public JavaBeanInfo(Class<?> cls, Class<?> cls2, Constructor<?> constructor, Constructor<?> constructor2, Method method, Method method2, JSONType jSONType, List<FieldInfo> list) {
        JSONField jSONField;
        this.clazz = cls;
        this.builderClass = cls2;
        this.defaultConstructor = constructor;
        this.creatorConstructor = constructor2;
        this.factoryMethod = method;
        this.parserFeatures = TypeUtils.getParserFeatures(cls);
        this.buildMethod = method2;
        this.jsonType = jSONType;
        if (jSONType != null) {
            String strTypeName = jSONType.typeName();
            String strTypeKey = jSONType.typeKey();
            this.typeKey = strTypeKey.length() <= 0 ? null : strTypeKey;
            if (strTypeName.length() != 0) {
                this.typeName = strTypeName;
            } else {
                this.typeName = cls.getName();
            }
            String[] strArrOrders = jSONType.orders();
            this.orders = strArrOrders.length == 0 ? null : strArrOrders;
        } else {
            this.typeName = cls.getName();
            this.typeKey = null;
            this.orders = null;
        }
        FieldInfo[] fieldInfoArr = new FieldInfo[list.size()];
        this.fields = fieldInfoArr;
        list.toArray(fieldInfoArr);
        FieldInfo[] fieldInfoArr2 = new FieldInfo[fieldInfoArr.length];
        int i10 = 0;
        if (this.orders != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
            for (FieldInfo fieldInfo : fieldInfoArr) {
                linkedHashMap.put(fieldInfo.name, fieldInfo);
            }
            int i11 = 0;
            for (String str : this.orders) {
                FieldInfo fieldInfo2 = (FieldInfo) linkedHashMap.get(str);
                if (fieldInfo2 != null) {
                    fieldInfoArr2[i11] = fieldInfo2;
                    linkedHashMap.remove(str);
                    i11++;
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                fieldInfoArr2[i11] = (FieldInfo) it.next();
                i11++;
            }
        } else {
            System.arraycopy(fieldInfoArr, 0, fieldInfoArr2, 0, fieldInfoArr.length);
            Arrays.sort(fieldInfoArr2);
        }
        this.sortedFields = Arrays.equals(this.fields, fieldInfoArr2) ? this.fields : fieldInfoArr2;
        if (constructor != null) {
            this.defaultConstructorParameterSize = constructor.getParameterTypes().length;
        } else if (method != null) {
            this.defaultConstructorParameterSize = method.getParameterTypes().length;
        } else {
            this.defaultConstructorParameterSize = 0;
        }
        if (constructor2 != null) {
            this.creatorConstructorParameterTypes = constructor2.getParameterTypes();
            boolean zIsKotlin = TypeUtils.isKotlin(cls);
            this.f28538kotlin = zIsKotlin;
            if (!zIsKotlin) {
                if (this.creatorConstructorParameterTypes.length == this.fields.length) {
                    while (true) {
                        Type[] typeArr = this.creatorConstructorParameterTypes;
                        if (i10 >= typeArr.length) {
                            return;
                        }
                        if (typeArr[i10] != this.fields[i10].fieldClass) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                this.creatorConstructorParameters = ASMUtils.lookupParameterNames(constructor2);
                return;
            }
            this.creatorConstructorParameters = TypeUtils.getKoltinConstructorParameters(cls);
            try {
                this.kotlinDefaultConstructor = cls.getConstructor(null);
            } catch (Throwable unused) {
            }
            Annotation[][] parameterAnnotations = TypeUtils.getParameterAnnotations(constructor2);
            for (int i12 = 0; i12 < this.creatorConstructorParameters.length && i12 < parameterAnnotations.length; i12++) {
                Annotation[] annotationArr = parameterAnnotations[i12];
                int length = annotationArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        jSONField = null;
                        break;
                    }
                    Annotation annotation = annotationArr[i13];
                    if (annotation instanceof JSONField) {
                        jSONField = (JSONField) annotation;
                        break;
                    }
                    i13++;
                }
                if (jSONField != null) {
                    String strName = jSONField.name();
                    if (strName.length() > 0) {
                        this.creatorConstructorParameters[i12] = strName;
                    }
                }
            }
        }
    }

    public static boolean add(List<FieldInfo> list, FieldInfo fieldInfo) {
        for (int size = list.size() - 1; size >= 0; size--) {
            FieldInfo fieldInfo2 = list.get(size);
            if (fieldInfo2.name.equals(fieldInfo.name) && (!fieldInfo2.getOnly || fieldInfo.getOnly)) {
                if (fieldInfo2.fieldClass.isAssignableFrom(fieldInfo.fieldClass)) {
                    list.set(size, fieldInfo);
                    return true;
                }
                if (fieldInfo2.compareTo(fieldInfo) >= 0) {
                    return false;
                }
                list.set(size, fieldInfo);
                return true;
            }
        }
        list.add(fieldInfo);
        return true;
    }

    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy) {
        return build(cls, type, propertyNamingStrategy, false, TypeUtils.compatibleWithJavaBean, false);
    }

    private static Map<TypeVariable, Type> buildGenericInfo(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = null;
        if (superclass == null) {
            return null;
        }
        while (true) {
            Class<? super Object> cls2 = superclass;
            Class<?> cls3 = cls;
            cls = cls2;
            if (cls == null || cls == Object.class) {
                break;
            }
            if (cls3.getGenericSuperclass() instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) cls3.getGenericSuperclass()).getActualTypeArguments();
                TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (map.containsKey(actualTypeArguments[i10])) {
                        map.put(typeParameters[i10], map.get(actualTypeArguments[i10]));
                    } else {
                        map.put(typeParameters[i10], actualTypeArguments[i10]);
                    }
                }
            }
            superclass = cls.getSuperclass();
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019 A[EDGE_INSN: B:44:0x0019->B:6:0x0019 BREAK  A[LOOP:1: B:20:0x0053->B:45:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void computeFields(java.lang.Class<?> r18, java.lang.reflect.Type r19, com.alibaba.fastjson.PropertyNamingStrategy r20, java.util.List<com.alibaba.fastjson.util.FieldInfo> r21, java.lang.reflect.Field[] r22) {
        /*
            r0 = r20
            r1 = r22
            java.util.Map r14 = buildGenericInfo(r18)
            int r15 = r1.length
            r16 = 0
            r2 = r16
        Ld:
            if (r2 >= r15) goto Lcd
            r5 = r1[r2]
            int r3 = r5.getModifiers()
            r4 = r3 & 8
            if (r4 == 0) goto L1f
        L19:
            r17 = r2
            r2 = r21
            goto Lc8
        L1f:
            r3 = r3 & 16
            if (r3 == 0) goto L4f
            java.lang.Class r3 = r5.getType()
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L4f
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L4f
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r4 = java.util.concurrent.atomic.AtomicLong.class
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L4f
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r4 = java.util.concurrent.atomic.AtomicInteger.class
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L4f
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r4 = java.util.concurrent.atomic.AtomicBoolean.class
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L19
        L4f:
            java.util.Iterator r3 = r21.iterator()
        L53:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r3.next()
            com.alibaba.fastjson.util.FieldInfo r4 = (com.alibaba.fastjson.util.FieldInfo) r4
            java.lang.String r4 = r4.name
            java.lang.String r6 = r5.getName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L53
            goto L19
        L6c:
            java.lang.String r3 = r5.getName()
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r4 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r4 = com.alibaba.fastjson.util.TypeUtils.getAnnotation(r5, r4)
            r12 = r4
            com.alibaba.fastjson.annotation.JSONField r12 = (com.alibaba.fastjson.annotation.JSONField) r12
            if (r12 == 0) goto La8
            boolean r4 = r12.deserialize()
            if (r4 != 0) goto L82
            goto L19
        L82:
            int r4 = r12.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r6 = r12.serialzeFeatures()
            int r6 = com.alibaba.fastjson.serializer.SerializerFeature.m3381of(r6)
            com.alibaba.fastjson.parser.Feature[] r7 = r12.parseFeatures()
            int r7 = com.alibaba.fastjson.parser.Feature.m3330of(r7)
            java.lang.String r8 = r12.name()
            int r8 = r8.length()
            if (r8 == 0) goto La4
            java.lang.String r3 = r12.name()
        La4:
            r8 = r4
            r9 = r6
            r10 = r7
            goto Lac
        La8:
            r8 = r16
            r9 = r8
            r10 = r9
        Lac:
            if (r0 == 0) goto Lb2
            java.lang.String r3 = r0.translate(r3)
        Lb2:
            r4 = r2
            com.alibaba.fastjson.util.FieldInfo r2 = new com.alibaba.fastjson.util.FieldInfo
            r11 = 0
            r13 = 0
            r6 = r4
            r4 = 0
            r7 = r19
            r17 = r6
            r6 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r2
            r2 = r21
            add(r2, r3)
        Lc8:
            int r3 = r17 + 1
            r2 = r3
            goto Ld
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.JavaBeanInfo.computeFields(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson.PropertyNamingStrategy, java.util.List, java.lang.reflect.Field[]):void");
    }

    public static Class<?> getBuilderClass(JSONType jSONType) {
        return getBuilderClass(null, jSONType);
    }

    public static Constructor<?> getCreatorConstructor(Constructor[] constructorArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            if (((JSONCreator) constructor2.getAnnotation(JSONCreator.class)) != null) {
                if (constructor != null) {
                    throw new JSONException("multi-JSONCreator");
                }
                constructor = constructor2;
            }
        }
        if (constructor != null) {
            return constructor;
        }
        for (Constructor constructor3 : constructorArr) {
            Annotation[][] parameterAnnotations = TypeUtils.getParameterAnnotations(constructor3);
            if (parameterAnnotations.length != 0) {
                int length = parameterAnnotations.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        for (Annotation annotation : parameterAnnotations[i10]) {
                            if (annotation instanceof JSONField) {
                                break;
                            }
                        }
                    } else {
                        if (constructor != null) {
                            throw new JSONException("multi-JSONCreator");
                        }
                        constructor = constructor3;
                    }
                    i10++;
                }
            }
        }
        return constructor;
    }

    public static Constructor<?> getDefaultConstructor(Class<?> cls, Constructor<?>[] constructorArr) {
        Constructor<?> constructor = null;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        int length = constructorArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Constructor<?> constructor2 = constructorArr[i10];
            if (constructor2.getParameterTypes().length == 0) {
                constructor = constructor2;
                break;
            }
            i10++;
        }
        if (constructor == null && cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
            for (Constructor<?> constructor3 : constructorArr) {
                Class<?>[] parameterTypes = constructor3.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                    return constructor3;
                }
            }
        }
        return constructor;
    }

    private static Method getFactoryMethod(Class<?> cls, Method[] methodArr, boolean z10) {
        Method method = null;
        for (Method method2 : methodArr) {
            if (Modifier.isStatic(method2.getModifiers()) && cls.isAssignableFrom(method2.getReturnType()) && ((JSONCreator) TypeUtils.getAnnotation(method2, JSONCreator.class)) != null) {
                if (method != null) {
                    throw new JSONException("multi-JSONCreator");
                }
                method = method2;
            }
        }
        if (method == null && z10) {
            for (Method method3 : methodArr) {
                if (TypeUtils.isJacksonCreator(method3)) {
                    return method3;
                }
            }
        }
        return method;
    }

    private static FieldInfo getField(List<FieldInfo> list, String str) {
        Field field;
        for (FieldInfo fieldInfo : list) {
            if (fieldInfo.name.equals(str) || ((field = fieldInfo.field) != null && fieldInfo.getAnnotation() != null && field.getName().equals(str))) {
                return fieldInfo;
            }
        }
        return null;
    }

    public static JavaBeanInfo build(Class<?> cls, Type type, PropertyNamingStrategy propertyNamingStrategy, boolean z10, boolean z11) {
        return build(cls, type, propertyNamingStrategy, z10, z11, false);
    }

    public static Class<?> getBuilderClass(Class<?> cls, JSONType jSONType) {
        Class<?> clsBuilder;
        if (cls != null && cls.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest")) {
            return TypeUtils.loadClass("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder");
        }
        if (jSONType == null || (clsBuilder = jSONType.builder()) == Void.class) {
            return null;
        }
        return clsBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.alibaba.fastjson.annotation.JSONField] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson.util.JavaBeanInfo build(java.lang.Class<?> r45, java.lang.reflect.Type r46, com.alibaba.fastjson.PropertyNamingStrategy r47, boolean r48, boolean r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 3004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.JavaBeanInfo.build(java.lang.Class, java.lang.reflect.Type, com.alibaba.fastjson.PropertyNamingStrategy, boolean, boolean, boolean):com.alibaba.fastjson.util.JavaBeanInfo");
    }
}
