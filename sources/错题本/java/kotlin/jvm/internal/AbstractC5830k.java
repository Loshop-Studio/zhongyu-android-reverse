package kotlin.jvm.internal;

import android.support.v4.media.AbstractC0037f;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;
import p045d6.C5434j;

/* renamed from: kotlin.jvm.internal.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5830k {
    /* renamed from: a */
    public static boolean m5324a(Float f, float f7) {
        return f != null && f.floatValue() == f7;
    }

    /* renamed from: b */
    public static boolean m5325b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m5326c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        m5336m(illegalStateException, AbstractC5830k.class.getName());
        throw illegalStateException;
    }

    /* renamed from: d */
    public static void m5327d(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        m5336m(nullPointerException, AbstractC5830k.class.getName());
        throw nullPointerException;
    }

    /* renamed from: e */
    public static void m5328e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        m5336m(nullPointerException, AbstractC5830k.class.getName());
        throw nullPointerException;
    }

    /* renamed from: f */
    public static void m5329f(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        m5336m(nullPointerException, AbstractC5830k.class.getName());
        throw nullPointerException;
    }

    /* renamed from: g */
    public static void m5330g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(m5334k(str));
        m5336m(nullPointerException, AbstractC5830k.class.getName());
        throw nullPointerException;
    }

    /* renamed from: h */
    public static void m5331h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(m5334k(str));
        m5336m(illegalArgumentException, AbstractC5830k.class.getName());
        throw illegalArgumentException;
    }

    /* renamed from: i */
    public static int m5332i(int i, int i8) {
        if (i < i8) {
            return -1;
        }
        return i == i8 ? 0 : 1;
    }

    /* renamed from: j */
    public static int m5333j(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    /* renamed from: k */
    public static String m5334k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC5830k.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        StringBuilder sbM101z = AbstractC0037f.m101z("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        sbM101z.append(str);
        return sbM101z.toString();
    }

    /* renamed from: l */
    public static final C5434j m5335l(Object[] array) {
        m5330g(array, "array");
        return new C5434j(array);
    }

    /* renamed from: m */
    public static void m5336m(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* renamed from: n */
    public static void m5337n() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        m5336m(kotlinNullPointerException, AbstractC5830k.class.getName());
        throw kotlinNullPointerException;
    }

    /* renamed from: o */
    public static void m5338o() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: p */
    public static void m5339p(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(AbstractC0037f.m86k("lateinit property ", str, " has not been initialized"));
        m5336m(uninitializedPropertyAccessException, AbstractC5830k.class.getName());
        throw uninitializedPropertyAccessException;
    }
}
