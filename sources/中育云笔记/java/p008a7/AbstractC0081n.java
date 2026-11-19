package p008a7;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: a7.n */
/* loaded from: classes5.dex */
public abstract class AbstractC0081n {

    /* renamed from: a */
    public static SharedPreferences f65a;

    /* renamed from: a */
    public static SharedPreferences m223a(Context context) {
        if (f65a == null) {
            f65a = context.getSharedPreferences("PictureSpUtils", 0);
        }
        return f65a;
    }

    /* renamed from: b */
    public static void m224b(Context context, String str, boolean z10) {
        m223a(context).edit().putBoolean(str, z10).apply();
    }

    /* renamed from: c */
    public static void m225c(Context context, String str, String str2) {
        m223a(context).edit().putString(str, str2).apply();
    }
}
