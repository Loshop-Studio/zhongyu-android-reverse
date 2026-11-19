package p344t5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.huawei.hms.support.log.HMSLog;
import java.util.List;

/* renamed from: t5.e */
/* loaded from: classes5.dex */
public abstract class AbstractC11231e {
    /* renamed from: a */
    public static int m24994a() {
        if (m24999f()) {
            return AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        return 134217728;
    }

    /* renamed from: b */
    public static Boolean m24995b(Context context, String str, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (listQueryIntentActivities != null && listQueryIntentActivities.size() > 0) {
                int size = listQueryIntentActivities.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (listQueryIntentActivities.get(i10).activityInfo != null && str.equals(listQueryIntentActivities.get(i10).activityInfo.applicationInfo.packageName)) {
                        return Boolean.TRUE;
                    }
                }
            }
        } catch (Exception e10) {
            HMSLog.m8726e("PushSelfShowLog", e10.toString(), e10);
        }
        return Boolean.FALSE;
    }

    /* renamed from: c */
    public static String m24996c(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            HMSLog.m8727i("PushSelfShowLog", "get the app name of package:" + str + " failed.");
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m24997d(Context context) {
        return "com.huawei.hwid".equals(context.getPackageName());
    }

    /* renamed from: e */
    public static Intent m24998e(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            HMSLog.m8728w("PushSelfShowLog", str + " not have launch activity");
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m24999f() {
        return true;
    }

    /* renamed from: g */
    public static boolean m25000g() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: h */
    public static boolean m25001h(Context context, String str) {
        if (context != null && str != null && !"".equals(str)) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 8192) == null) {
                    return false;
                }
                HMSLog.m8722d("PushSelfShowLog", str + " is installed");
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m25002i() {
        return true;
    }
}
