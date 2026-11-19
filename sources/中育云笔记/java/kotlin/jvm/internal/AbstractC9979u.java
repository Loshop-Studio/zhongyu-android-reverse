package kotlin.jvm.internal;

import com.alibaba.android.arouter.utils.Consts;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.u */
/* loaded from: classes6.dex */
public abstract class AbstractC9979u {

    /* renamed from: kotlin.jvm.internal.u$a */
    public static class a {
    }

    /* renamed from: a */
    public static boolean m20288a(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    /* renamed from: b */
    public static boolean m20289b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m20290c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m20301n(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: d */
    public static void m20291d(Object obj) {
        if (obj == null) {
            m20304q();
        }
    }

    /* renamed from: e */
    public static void m20292e(Object obj, String str) {
        if (obj == null) {
            m20305r(str);
        }
    }

    /* renamed from: f */
    public static void m20293f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m20301n(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: g */
    public static void m20294g(Object obj, String str) {
        if (obj == null) {
            m20308u(str);
        }
    }

    /* renamed from: h */
    public static void m20295h(Object obj, String str) {
        if (obj == null) {
            m20307t(str);
        }
    }

    /* renamed from: i */
    public static int m20296i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    /* renamed from: j */
    public static int m20297j(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    /* renamed from: k */
    public static String m20298k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC9979u.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + Consts.DOT + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: l */
    public static void m20299l() {
        m20309v();
    }

    /* renamed from: m */
    public static void m20300m(int i10, String str) {
        m20309v();
    }

    /* renamed from: n */
    public static Throwable m20301n(Throwable th) {
        return m20302o(th, AbstractC9979u.class.getName());
    }

    /* renamed from: o */
    public static Throwable m20302o(Throwable th, String str) {
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
    public static String m20303p(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m20304q() {
        throw ((NullPointerException) m20301n(new NullPointerException()));
    }

    /* renamed from: r */
    public static void m20305r(String str) {
        throw ((NullPointerException) m20301n(new NullPointerException(str)));
    }

    /* renamed from: s */
    public static void m20306s() {
        throw ((KotlinNullPointerException) m20301n(new KotlinNullPointerException()));
    }

    /* renamed from: t */
    public static void m20307t(String str) {
        throw ((IllegalArgumentException) m20301n(new IllegalArgumentException(m20298k(str))));
    }

    /* renamed from: u */
    public static void m20308u(String str) {
        throw ((NullPointerException) m20301n(new NullPointerException(m20298k(str))));
    }

    /* renamed from: v */
    public static void m20309v() {
        m20310w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: w */
    public static void m20310w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: x */
    public static void m20311x(String str) {
        throw ((UninitializedPropertyAccessException) m20301n(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: y */
    public static void m20312y(String str) {
        m20311x("lateinit property " + str + " has not been initialized");
    }
}
