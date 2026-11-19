package p092e2;

import android.content.Context;
import android.text.TextUtils;
import p144j2.C8211b;

/* renamed from: e2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7839a {

    /* renamed from: a */
    public static String f13164a = null;

    /* renamed from: b */
    public static String f13165b = null;

    /* renamed from: c */
    public static String f13166c = null;

    /* renamed from: d */
    public static int f13167d = 0;

    /* renamed from: e */
    public static boolean f13168e = false;

    /* renamed from: f */
    public static long f13169f = 30000;

    /* renamed from: g */
    public static boolean f13170g = false;

    /* renamed from: h */
    public static boolean f13171h = false;

    /* renamed from: i */
    public static boolean f13172i = true;

    /* renamed from: j */
    public static double[] f13173j;

    /* renamed from: a */
    public static String m12277a(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static double[] m12278b() {
        return f13173j;
    }

    /* renamed from: c */
    public static String m12279c(Context context) {
        if (TextUtils.isEmpty(f13164a)) {
            f13164a = C8211b.m13226a(context).m13230e();
        }
        return f13164a;
    }

    /* renamed from: d */
    public static int m12280d(Context context) {
        if (f13167d == 0) {
            f13167d = C8211b.m13226a(context).m13231f();
        }
        return f13167d;
    }
}
