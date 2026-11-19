package kotlin.jvm.internal;

import java.util.Arrays;
import p128o2.C2912e;
import p128o2.C2924q;

/* renamed from: kotlin.jvm.internal.l */
/* loaded from: classes.dex */
public class C2769l {
    private C2769l() {
    }

    /* renamed from: a */
    public static boolean m9237a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m9238b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m9246j(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m9239c(Object obj) {
        if (obj == null) {
            m9249m();
        }
    }

    /* renamed from: d */
    public static void m9240d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m9246j(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void m9241e(Object obj, String str) {
        if (obj == null) {
            m9252p(str);
        }
    }

    /* renamed from: f */
    public static void m9242f(Object obj, String str) {
        if (obj == null) {
            m9251o(str);
        }
    }

    /* renamed from: g */
    public static int m9243g(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 == i5 ? 0 : 1;
    }

    /* renamed from: h */
    private static String m9244h(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: i */
    public static void m9245i(int i4, String str) {
        m9253q();
    }

    /* renamed from: j */
    private static <T extends Throwable> T m9246j(T t3) {
        return (T) m9247k(t3, C2769l.class.getName());
    }

    /* renamed from: k */
    static <T extends Throwable> T m9247k(T t3, String str) {
        StackTraceElement[] stackTrace = t3.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i4 = i5;
            }
        }
        t3.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
        return t3;
    }

    /* renamed from: l */
    public static String m9248l(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: m */
    public static void m9249m() {
        throw ((NullPointerException) m9246j(new NullPointerException()));
    }

    /* renamed from: n */
    public static void m9250n() {
        throw ((C2912e) m9246j(new C2912e()));
    }

    /* renamed from: o */
    private static void m9251o(String str) {
        throw ((IllegalArgumentException) m9246j(new IllegalArgumentException(m9244h(str))));
    }

    /* renamed from: p */
    private static void m9252p(String str) {
        throw ((NullPointerException) m9246j(new NullPointerException(m9244h(str))));
    }

    /* renamed from: q */
    public static void m9253q() {
        m9254r("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: r */
    public static void m9254r(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: s */
    public static void m9255s(String str) {
        throw ((C2924q) m9246j(new C2924q(str)));
    }

    /* renamed from: t */
    public static void m9256t(String str) {
        m9255s("lateinit property " + str + " has not been initialized");
    }
}
