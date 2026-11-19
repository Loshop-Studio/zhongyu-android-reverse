package p096g2;

import android.content.Context;
import p129j2.AbstractC7781a;

/* renamed from: g2.d */
/* loaded from: classes4.dex */
public abstract class AbstractC7514d {
    /* renamed from: a */
    public static boolean m12226a(Context context) {
        try {
            return m12227b(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m12227b(Context context, String str) {
        if (context == null) {
            return false;
        }
        return AbstractC7781a.m13152a(context) >= 23 ? context.checkSelfPermission(str) == 0 : AbstractC7513c.m12224a(context, str) == 0;
    }

    /* renamed from: c */
    public static boolean m12228c(Context context) {
        try {
            return m12227b(context, "android.permission.READ_PHONE_STATE");
        } catch (Throwable unused) {
            return false;
        }
    }
}
