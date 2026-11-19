package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.u */
/* loaded from: classes5.dex */
public abstract class AbstractC9133u {

    /* renamed from: kotlin.jvm.internal.u$a */
    public static class a {
    }

    /* renamed from: a */
    public static boolean m16127a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    /* renamed from: b */
    public static boolean m16128b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m16129c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m16140n(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: d */
    public static void m16130d(Object obj) {
        if (obj == null) {
            m16143q();
        }
    }

    /* renamed from: e */
    public static void m16131e(Object obj, String str) {
        if (obj == null) {
            m16144r(str);
        }
    }

    /* renamed from: f */
    public static void m16132f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m16140n(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: g */
    public static void m16133g(Object obj, String str) {
        if (obj == null) {
            m16147u(str);
        }
    }

    /* renamed from: h */
    public static void m16134h(Object obj, String str) {
        if (obj == null) {
            m16146t(str);
        }
    }

    /* renamed from: i */
    public static int m16135i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: j */
    public static int m16136j(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* renamed from: k */
    public static String m16137k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC9133u.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: l */
    public static void m16138l() {
        m16148v();
    }

    /* renamed from: m */
    public static void m16139m(int i10, String str) {
        m16148v();
    }

    /* renamed from: n */
    public static Throwable m16140n(Throwable th) {
        return m16141o(th, AbstractC9133u.class.getName());
    }

    /* renamed from: o */
    public static Throwable m16141o(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    /* renamed from: p */
    public static String m16142p(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m16143q() {
        throw ((NullPointerException) m16140n(new NullPointerException()));
    }

    /* renamed from: r */
    public static void m16144r(String str) {
        throw ((NullPointerException) m16140n(new NullPointerException(str)));
    }

    /* renamed from: s */
    public static void m16145s() {
        throw ((KotlinNullPointerException) m16140n(new KotlinNullPointerException()));
    }

    /* renamed from: t */
    public static void m16146t(String str) {
        throw ((IllegalArgumentException) m16140n(new IllegalArgumentException(m16137k(str))));
    }

    /* renamed from: u */
    public static void m16147u(String str) {
        throw ((NullPointerException) m16140n(new NullPointerException(m16137k(str))));
    }

    /* renamed from: v */
    public static void m16148v() {
        m16149w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: w */
    public static void m16149w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: x */
    public static void m16150x(String str) {
        throw ((UninitializedPropertyAccessException) m16140n(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: y */
    public static void m16151y(String str) {
        m16150x("lateinit property " + str + " has not been initialized");
    }
}
