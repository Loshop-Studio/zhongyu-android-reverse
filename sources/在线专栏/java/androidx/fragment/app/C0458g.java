package androidx.fragment.app;

import androidx.collection.C0253g;
import androidx.fragment.app.Fragment;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public class C0458g {

    /* renamed from: a */
    private static final C0253g<ClassLoader, C0253g<String, Class<?>>> f3186a = new C0253g<>();

    /* renamed from: b */
    static boolean m2615b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m2616c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m2616c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0253g<ClassLoader, C0253g<String, Class<?>>> c0253g = f3186a;
        C0253g<String, Class<?>> c0253g2 = c0253g.get(classLoader);
        if (c0253g2 == null) {
            c0253g2 = new C0253g<>();
            c0253g.put(classLoader, c0253g2);
        }
        Class<?> cls = c0253g2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0253g2.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m2617d(ClassLoader classLoader, String str) {
        try {
            return m2616c(classLoader, str);
        } catch (ClassCastException e4) {
            throw new Fragment.C0424j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e4);
        } catch (ClassNotFoundException e5) {
            throw new Fragment.C0424j("Unable to instantiate fragment " + str + ": make sure class name exists", e5);
        }
    }

    /* renamed from: a */
    public Fragment mo2519a(ClassLoader classLoader, String str) {
        throw null;
    }
}
