package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.p */
/* loaded from: classes.dex */
public class C0508p {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3442a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC0494e>>> f3443b = new HashMap();

    /* renamed from: a */
    private static InterfaceC0494e m2895a(Constructor<? extends InterfaceC0494e> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC0494e> m2896b(Class<?> cls) throws NoSuchMethodException, SecurityException {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strM2897c = m2897c(canonicalName);
            if (!name.isEmpty()) {
                strM2897c = name + "." + strM2897c;
            }
            Constructor declaredConstructor = Class.forName(strM2897c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: c */
    public static String m2897c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m2898d(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Integer num = f3442a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM2901g = m2901g(cls);
        f3442a.put(cls, Integer.valueOf(iM2901g));
        return iM2901g;
    }

    /* renamed from: e */
    private static boolean m2899e(Class<?> cls) {
        return cls != null && InterfaceC0503k.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    static InterfaceC0501i m2900f(Object obj) {
        boolean z3 = obj instanceof InterfaceC0501i;
        boolean z4 = obj instanceof InterfaceC0492d;
        if (z3 && z4) {
            return new FullLifecycleObserverAdapter((InterfaceC0492d) obj, (InterfaceC0501i) obj);
        }
        if (z4) {
            return new FullLifecycleObserverAdapter((InterfaceC0492d) obj, null);
        }
        if (z3) {
            return (InterfaceC0501i) obj;
        }
        Class<?> cls = obj.getClass();
        if (m2898d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends InterfaceC0494e>> list = f3443b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m2895a(list.get(0), obj));
        }
        InterfaceC0494e[] interfaceC0494eArr = new InterfaceC0494e[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            interfaceC0494eArr[i4] = m2895a(list.get(i4), obj);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC0494eArr);
    }

    /* renamed from: g */
    private static int m2901g(Class<?> cls) throws NoSuchMethodException, SecurityException {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC0494e> constructorM2896b = m2896b(cls);
        if (constructorM2896b != null) {
            f3443b.put(cls, Collections.singletonList(constructorM2896b));
            return 2;
        }
        if (C0488b.f3395c.m2834d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m2899e(superclass)) {
            if (m2898d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f3443b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m2899e(cls2)) {
                if (m2898d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f3443b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f3443b.put(cls, arrayList);
        return 2;
    }
}
