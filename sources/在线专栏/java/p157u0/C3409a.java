package p157u0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: u0.a */
/* loaded from: classes.dex */
public final class C3409a {

    /* renamed from: a */
    private static long f11968a;

    /* renamed from: b */
    private static Method f11969b;

    /* renamed from: a */
    public static void m10410a(String str) {
        C3410b.m10415a(str);
    }

    /* renamed from: b */
    public static void m10411b() {
        C3410b.m10416b();
    }

    /* renamed from: c */
    private static void m10412c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m10413d() {
        try {
            if (f11969b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m10414e();
    }

    /* renamed from: e */
    private static boolean m10414e() {
        try {
            if (f11969b == null) {
                f11968a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f11969b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f11969b.invoke(null, Long.valueOf(f11968a))).booleanValue();
        } catch (Exception e4) {
            m10412c("isTagEnabled", e4);
            return false;
        }
    }
}
