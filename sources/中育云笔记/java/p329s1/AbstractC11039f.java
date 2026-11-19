package p329s1;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: s1.f */
/* loaded from: classes3.dex */
public abstract class AbstractC11039f {

    /* renamed from: a */
    public static boolean f26623a = true;

    /* renamed from: a */
    public static void m24401a(String str) {
        if (!f26623a || TextUtils.isEmpty(str)) {
            return;
        }
        Log.e("HttpProxyCacheDebuger", str);
    }

    /* renamed from: b */
    public static void m24402b(String str, Exception exc) {
        if (f26623a) {
            if (!TextUtils.isEmpty(str)) {
                Log.e("HttpProxyCacheDebuger", str);
            }
            exc.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m24403c(String str, String str2) {
        if (!f26623a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.e(str, str2);
    }

    /* renamed from: d */
    public static void m24404d(String str) {
        m24405e("HttpProxyCacheDebuger", str);
    }

    /* renamed from: e */
    public static void m24405e(String str, String str2) {
        if (!f26623a || str2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2);
    }

    /* renamed from: f */
    public static void m24406f(String str) {
        m24407g("HttpProxyCacheDebuger", str);
    }

    /* renamed from: g */
    public static void m24407g(String str, String str2) {
        if (!f26623a || str2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(str, str2);
    }
}
