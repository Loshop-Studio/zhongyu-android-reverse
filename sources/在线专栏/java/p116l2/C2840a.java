package p116l2;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: l2.a */
/* loaded from: classes.dex */
public class C2840a {
    /* renamed from: a */
    public static int m9535a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m9536b(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m9537c(Context context) {
        return m9536b(context, "cn.com.techvision.appstore");
    }
}
