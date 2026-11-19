package p114d6;

import android.util.Log;

/* renamed from: d6.f */
/* loaded from: classes5.dex */
public abstract class AbstractC8996f {
    /* renamed from: a */
    public static String m17560a(String str) {
        return "SecurityComp10201304: " + str;
    }

    /* renamed from: c */
    public static void m17562c(String str, String str2, Throwable th) {
        Log.e(m17560a(str), str2, th);
    }

    /* renamed from: d */
    public static void m17563d(String str, String str2) {
        Log.e(m17560a(str), str2);
    }

    /* renamed from: e */
    public static void m17564e(String str, String str2) {
        Log.i(m17560a(str), str2);
    }

    /* renamed from: f */
    public static void m17565f(String str, String str2) {
        Log.w(m17560a(str), str2);
    }

    /* renamed from: b */
    public static void m17561b(String str, String str2) {
    }
}
