package p172y;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: y.d */
/* loaded from: classes.dex */
public final class C3485d {

    /* renamed from: a */
    private static long f12155a;

    /* renamed from: b */
    private static Method f12156b;

    /* renamed from: c */
    private static Method f12157c;

    /* renamed from: d */
    private static Method f12158d;

    /* renamed from: e */
    private static Method f12159e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f12155a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f12156b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f12157c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f12158d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f12159e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e4) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e4);
            }
        }
    }

    /* renamed from: a */
    public static void m10560a(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    public static void m10561b() {
        Trace.endSection();
    }
}
