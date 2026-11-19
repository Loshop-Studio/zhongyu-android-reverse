package p160d.p162f.p164b;

import java.util.Arrays;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.C0991a;
import p160d.C0993c;

/* renamed from: d.f.b.d */
/* loaded from: classes.dex */
public class C1011d {
    /* renamed from: a */
    public static boolean m2805a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m2806b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(C0561a.m2076d(str, " must not be null"));
        m2813i(illegalStateException);
        throw illegalStateException;
    }

    /* renamed from: c */
    public static void m2807c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m2813i(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: d */
    public static void m2808d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(C0561a.m2076d(str, " must not be null"));
        m2813i(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m2809e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m2812h(str));
        m2813i(nullPointerException);
        throw nullPointerException;
    }

    /* renamed from: f */
    public static void m2810f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m2812h(str));
        m2813i(illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: g */
    public static int m2811g(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: h */
    public static String m2812h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: i */
    public static <T extends Throwable> T m2813i(T t) {
        String name = C1011d.class.getName();
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (name.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: j */
    public static String m2814j(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: k */
    public static void m2815k() {
        C0991a c0991a = new C0991a();
        m2813i(c0991a);
        throw c0991a;
    }

    /* renamed from: l */
    public static void m2816l(String str) {
        C0993c c0993c = new C0993c(C0561a.m2077e("lateinit property ", str, " has not been initialized"));
        m2813i(c0993c);
        throw c0993c;
    }
}
