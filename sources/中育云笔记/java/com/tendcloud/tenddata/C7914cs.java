package com.tendcloud.tenddata;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tendcloud.tenddata.cs */
/* loaded from: classes5.dex */
final class C7914cs {

    /* renamed from: a */
    private static final Map<Class<?>, Map<Class<?>, Set<Method>>> f14632a = new ConcurrentHashMap();

    private C7914cs() {
    }

    /* renamed from: a */
    private static void m11633a(Class<?> cls) {
        try {
            Map<Class<?>, Set<Method>> map = new HashMap<>();
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().startsWith("onTDEBEvent") && method.getParameterTypes().length == 1) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length != 1) {
                        C7896ca.eForInternal("Method " + method + " must have one and only one argument.");
                    }
                    Class<?> cls2 = parameterTypes[0];
                    if (cls2.isInterface()) {
                        C7896ca.eForInternal("Method " + method + " must have a argument whose type is a class which can be instantialized.");
                    }
                    if ((1 & method.getModifiers()) == 0) {
                        C7896ca.eForInternal("Method " + method + " must be 'public'.");
                    }
                    Set<Method> hashSet = map.get(cls2);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        map.put(cls2, hashSet);
                    }
                    hashSet.add(method);
                }
            }
            f14632a.put(cls, map);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Map<Class<?>, Set<C7915ct>> m11632a(Object obj) {
        HashMap map = new HashMap();
        try {
            Class<?> cls = obj.getClass();
            Map<Class<?>, Map<Class<?>, Set<Method>>> map2 = f14632a;
            if (!map2.containsKey(cls)) {
                m11633a(cls);
            }
            Map<Class<?>, Set<Method>> map3 = map2.get(cls);
            if (map3 != null && !map3.isEmpty()) {
                for (Map.Entry<Class<?>, Set<Method>> entry : map3.entrySet()) {
                    HashSet hashSet = new HashSet();
                    Iterator<Method> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        hashSet.add(new C7915ct(obj, it.next()));
                    }
                    map.put(entry.getKey(), hashSet);
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }
}
