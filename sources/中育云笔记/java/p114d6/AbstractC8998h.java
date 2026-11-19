package p114d6;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: d6.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8998h {

    /* renamed from: a */
    public static SharedPreferences f20962a;

    /* renamed from: a */
    public static long m17567a(String str, long j10, Context context) {
        return m17569c(context).getLong(str, j10);
    }

    /* renamed from: b */
    public static String m17568b(String str, String str2, Context context) {
        return m17569c(context).getString(str, str2);
    }

    /* renamed from: c */
    public static synchronized SharedPreferences m17569c(Context context) {
        try {
            if (f20962a == null) {
                f20962a = context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20962a;
    }

    /* renamed from: d */
    public static void m17570d(String str, long j10, Context context) {
        m17569c(context).edit().putLong(str, j10).apply();
    }

    /* renamed from: e */
    public static void m17571e(String str, String str2, Context context) {
        m17569c(context).edit().putString(str, str2).apply();
    }
}
