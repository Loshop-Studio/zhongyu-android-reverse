package p090g1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import p169x0.AbstractC3445n;
import p169x0.C3433b;
import p177z0.C3507b;

/* renamed from: g1.g */
/* loaded from: classes.dex */
public class C2635g {

    /* renamed from: a */
    private static final String f10419a = AbstractC3445n.m10503f("ProcessUtils");

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static String m8839a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, C3507b.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            AbstractC3445n.m10501c().mo10504a(f10419a, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m8840b(Context context, C3433b c3433b) {
        String strM8839a = m8839a(context);
        return !TextUtils.isEmpty(c3433b.m10449b()) ? TextUtils.equals(strM8839a, c3433b.m10449b()) : TextUtils.equals(strM8839a, context.getApplicationInfo().processName);
    }
}
