package p092e2;

import android.content.Context;
import android.text.TextUtils;
import p144j2.C8211b;

/* renamed from: e2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7841c {

    /* renamed from: a */
    public static String[] f13176a = new String[2];

    /* renamed from: a */
    public static void m12285a(Context context, String str, String str2) {
        String[] strArr = f13176a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C8211b.m13226a(context).m13227b(str, str2);
        }
    }

    /* renamed from: b */
    public static String[] m12286b(Context context) {
        String[] strArrM13228c;
        if (!TextUtils.isEmpty(f13176a[0]) && !TextUtils.isEmpty(f13176a[1])) {
            return f13176a;
        }
        if (context == null || (strArrM13228c = C8211b.m13226a(context).m13228c()) == null) {
            return null;
        }
        String[] strArr = f13176a;
        strArr[0] = strArrM13228c[0];
        strArr[1] = strArrM13228c[1];
        return strArr;
    }

    /* renamed from: c */
    public static void m12287c(Context context) {
        String[] strArr = f13176a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C8211b.m13226a(context).m13229d();
        }
    }
}
