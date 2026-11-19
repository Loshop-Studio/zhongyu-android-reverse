package androidx.lifecycle;

import androidx.lifecycle.AbstractC0496f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
final class C0488b {

    /* renamed from: c */
    static C0488b f3395c = new C0488b();

    /* renamed from: a */
    private final Map<Class<?>, a> f3396a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3397b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class a {

        /* renamed from: a */
        final Map<AbstractC0496f.b, List<b>> f3398a = new HashMap();

        /* renamed from: b */
        final Map<b, AbstractC0496f.b> f3399b;

        a(Map<b, AbstractC0496f.b> map) {
            this.f3399b = map;
            for (Map.Entry<b, AbstractC0496f.b> entry : map.entrySet()) {
                AbstractC0496f.b value = entry.getValue();
                List<b> arrayList = this.f3398a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f3398a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m2835b(List<b> list, InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m2837a(interfaceC0504l, bVar, obj);
                }
            }
        }

        /* renamed from: a */
        void m2836a(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m2835b(this.f3398a.get(bVar), interfaceC0504l, bVar, obj);
            m2835b(this.f3398a.get(AbstractC0496f.b.ON_ANY), interfaceC0504l, bVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    static final class b {

        /* renamed from: a */
        final int f3400a;

        /* renamed from: b */
        final Method f3401b;

        b(int i4, Method method) {
            this.f3400a = i4;
            this.f3401b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m2837a(InterfaceC0504l interfaceC0504l, AbstractC0496f.b bVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i4 = this.f3400a;
                if (i4 == 0) {
                    this.f3401b.invoke(obj, new Object[0]);
                } else if (i4 == 1) {
                    this.f3401b.invoke(obj, interfaceC0504l);
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    this.f3401b.invoke(obj, interfaceC0504l, bVar);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to call observer method", e5.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3400a == bVar.f3400a && this.f3401b.getName().equals(bVar.f3401b.getName());
        }

        public int hashCode() {
            return (this.f3400a * 31) + this.f3401b.getName().hashCode();
        }
    }

    C0488b() {
    }

    /* renamed from: a */
    private a m2830a(Class<?> cls, Method[] methodArr) {
        int i4;
        a aVarM2833c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM2833c = m2833c(superclass)) != null) {
            map.putAll(aVarM2833c.f3399b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC0496f.b> entry : m2833c(cls2).f3399b.entrySet()) {
                m2832e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m2831b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            InterfaceC0513u interfaceC0513u = (InterfaceC0513u) method.getAnnotation(InterfaceC0513u.class);
            if (interfaceC0513u != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0504l.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                AbstractC0496f.b bVarValue = interfaceC0513u.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC0496f.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != AbstractC0496f.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2832e(map, new b(i4, method), bVarValue, cls);
                z3 = true;
            }
        }
        a aVar = new a(map);
        this.f3396a.put(cls, aVar);
        this.f3397b.put(cls, Boolean.valueOf(z3));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m2831b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    /* renamed from: e */
    private void m2832e(Map<b, AbstractC0496f.b> map, b bVar, AbstractC0496f.b bVar2, Class<?> cls) {
        AbstractC0496f.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f3401b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    /* renamed from: c */
    a m2833c(Class<?> cls) {
        a aVar = this.f3396a.get(cls);
        return aVar != null ? aVar : m2830a(cls, null);
    }

    /* renamed from: d */
    boolean m2834d(Class<?> cls) {
        Boolean bool = this.f3397b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM2831b = m2831b(cls);
        for (Method method : methodArrM2831b) {
            if (((InterfaceC0513u) method.getAnnotation(InterfaceC0513u.class)) != null) {
                m2830a(cls, methodArrM2831b);
                return true;
            }
        }
        this.f3397b.put(cls, Boolean.FALSE);
        return false;
    }
}
