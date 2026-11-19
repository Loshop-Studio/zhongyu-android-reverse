package p000a.p052k.p053b;

import p000a.p021e.C0136h;
import p000a.p052k.p053b.ComponentCallbacksC0320m;
import p070b.p071a.p072a.p073a.C0561a;

/* renamed from: a.k.b.y */
/* loaded from: classes.dex */
public class C0344y {

    /* renamed from: a */
    public static final C0136h<ClassLoader, C0136h<String, Class<?>>> f2118a = new C0136h<>();

    /* renamed from: b */
    public static Class<?> m1246b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0136h<ClassLoader, C0136h<String, Class<?>>> c0136h = f2118a;
        C0136h<String, Class<?>> orDefault = c0136h.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C0136h<>();
            c0136h.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    /* renamed from: c */
    public static Class<? extends ComponentCallbacksC0320m> m1247c(ClassLoader classLoader, String str) {
        try {
            return m1246b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new ComponentCallbacksC0320m.c(C0561a.m2077e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new ComponentCallbacksC0320m.c(C0561a.m2077e("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    /* renamed from: a */
    public ComponentCallbacksC0320m mo1069a(ClassLoader classLoader, String str) {
        throw null;
    }
}
