package p146f7;

import android.util.Log;

/* renamed from: f7.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9204c {

    /* renamed from: a */
    public static boolean f21452a = true;

    /* renamed from: b */
    public static String f21453b = "OkGo";

    /* renamed from: a */
    public static void m18111a(Throwable th) {
        if (!f21452a || th == null) {
            return;
        }
        th.printStackTrace();
    }

    /* renamed from: c */
    public static void m18113c(String str) {
        m18114d(f21453b, str);
    }

    /* renamed from: d */
    public static void m18114d(String str, String str2) {
        if (f21452a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: b */
    public static void m18112b(String str, String str2) {
    }
}
