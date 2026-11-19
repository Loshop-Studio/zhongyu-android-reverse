package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkManager;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes3.dex */
public final class ProcessUtils {
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ProcessUtils");
        AbstractC9979u.m20293f(strTagWithPrefix, "tagWithPrefix(\"ProcessUtils\")");
        TAG = strTagWithPrefix;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String getProcessName(Context context) {
        Object next;
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.INSTANCE.getProcessName();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            AbstractC9979u.m20291d(objInvoke);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable th) {
            Logger.get().debug(TAG, "Unable to check ActivityThread for processName", th);
        }
        int iMyPid = Process.myPid();
        Object systemService = context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean isDefaultProcess(Context context, Configuration configuration) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(configuration, "configuration");
        String processName = getProcessName(context);
        String defaultProcessName = configuration.getDefaultProcessName();
        return (defaultProcessName == null || defaultProcessName.length() == 0) ? AbstractC9979u.m20289b(processName, context.getApplicationInfo().processName) : AbstractC9979u.m20289b(processName, configuration.getDefaultProcessName());
    }
}
