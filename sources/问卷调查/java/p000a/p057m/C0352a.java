package p000a.p057m;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000a.p057m.AbstractC0355d;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.m.a */
/* loaded from: classes.dex */
public final class C0352a {

    /* renamed from: c */
    public static C0352a f2157c = new C0352a();

    /* renamed from: a */
    public final Map<Class<?>, a> f2158a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f2159b = new HashMap();

    /* renamed from: a.m.a$a */
    public static class a {

        /* renamed from: a */
        public final Map<AbstractC0355d.a, List<b>> f2160a = new HashMap();

        /* renamed from: b */
        public final Map<b, AbstractC0355d.a> f2161b;

        public a(Map<b, AbstractC0355d.a> map) {
            this.f2161b = map;
            for (Map.Entry<b, AbstractC0355d.a> entry : map.entrySet()) {
                AbstractC0355d.a value = entry.getValue();
                List<b> arrayList = this.f2160a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2160a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m1267a(List<b> list, InterfaceC0358g interfaceC0358g, AbstractC0355d.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.f2162a;
                        if (i == 0) {
                            bVar.f2163b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f2163b.invoke(obj, interfaceC0358g);
                        } else if (i == 2) {
                            bVar.f2163b.invoke(obj, interfaceC0358g, aVar);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    /* renamed from: a.m.a$b */
    public static final class b {

        /* renamed from: a */
        public final int f2162a;

        /* renamed from: b */
        public final Method f2163b;

        public b(int i, Method method) {
            this.f2162a = i;
            this.f2163b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2162a == bVar.f2162a && this.f2163b.getName().equals(bVar.f2163b.getName());
        }

        public int hashCode() {
            return this.f2163b.getName().hashCode() + (this.f2162a * 31);
        }
    }

    /* renamed from: a */
    public final a m1264a(Class<?> cls, Method[] methodArr) throws SecurityException {
        int i;
        a aVarM1265b;
        Class<?> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM1265b = m1265b(superclass)) != null) {
            map.putAll(aVarM1265b.f2161b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0355d.a> entry : m1265b(cls2).f2161b.entrySet()) {
                m1266c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0365n interfaceC0365n = (InterfaceC0365n) method.getAnnotation(InterfaceC0365n.class);
            if (interfaceC0365n != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0358g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC0355d.a aVarValue = interfaceC0365n.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0355d.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC0355d.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1266c(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f2158a.put(cls, aVar);
        this.f2159b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public a m1265b(Class<?> cls) {
        a aVar = this.f2158a.get(cls);
        return aVar != null ? aVar : m1264a(cls, null);
    }

    /* renamed from: c */
    public final void m1266c(Map<b, AbstractC0355d.a> map, b bVar, AbstractC0355d.a aVar, Class<?> cls) {
        AbstractC0355d.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f2163b;
        StringBuilder sbM2079g = C0561a.m2079g("Method ");
        sbM2079g.append(method.getName());
        sbM2079g.append(" in ");
        sbM2079g.append(cls.getName());
        sbM2079g.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sbM2079g.append(aVar2);
        sbM2079g.append(", new value ");
        sbM2079g.append(aVar);
        throw new IllegalArgumentException(sbM2079g.toString());
    }
}
