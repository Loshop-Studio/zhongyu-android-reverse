package p129j2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import android.text.TextUtils;

/* renamed from: j2.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7781a {
    /* renamed from: a */
    public static int m13152a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.targetSdkVersion;
        } catch (Exception e10) {
            AbstractC7788h.m13178d("", e10, new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    public static PackageInfo m13153b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
        } catch (Exception e10) {
            AbstractC7788h.m13178d("", e10, new Object[0]);
            return null;
        }
    }

    /* renamed from: c */
    public static String m13154c(Context context) {
        PackageInfo packageInfoM13153b = m13153b(context);
        return packageInfoM13153b != null ? packageInfoM13153b.packageName : "";
    }

    /* renamed from: d */
    public static String m13155d(Context context) {
        try {
            int iMyPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m13156e(Context context) {
        String strM13155d = m13155d(context);
        String strM13154c = m13154c(context);
        return TextUtils.isEmpty(strM13155d) || TextUtils.isEmpty(strM13154c) || strM13155d.equals(strM13154c);
    }
}
