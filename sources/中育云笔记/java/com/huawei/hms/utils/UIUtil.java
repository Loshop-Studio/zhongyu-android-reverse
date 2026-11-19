package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import android.widget.Button;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import com.taobao.accs.AccsClientConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes5.dex */
public class UIUtil {

    /* renamed from: com.huawei.hms.utils.UIUtil$a */
    public class DialogInterfaceOnShowListenerC7362a implements DialogInterface.OnShowListener {
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (dialogInterface instanceof AlertDialog) {
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                UIUtil.m8832c(alertDialog, -2, false);
                UIUtil.m8832c(alertDialog, -3, false);
                UIUtil.m8832c(alertDialog, -1, true);
                return;
            }
            HMSLog.m8725e("UIUtil", "In enableFocusedForButtonsInTV, DialogInterface is invalid, dialog = " + dialogInterface);
        }
    }

    /* renamed from: a */
    public static int m8830a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
    }

    /* renamed from: c */
    public static void m8832c(AlertDialog alertDialog, int i10, boolean z10) {
        Button button = alertDialog.getButton(i10);
        if (button == null) {
            HMSLog.m8725e("UIUtil", "In enableFocused, button is null.");
            return;
        }
        button.setFocusable(true);
        button.setFocusableInTouchMode(true);
        if (z10) {
            button.requestFocus();
        }
    }

    public static <T extends Dialog> T enableFocusedForButtonsInTV(T t10) {
        t10.setCanceledOnTouchOutside(false);
        if (!isTVDevice()) {
            return t10;
        }
        if (t10 instanceof AlertDialog) {
            t10.setOnShowListener(new DialogInterfaceOnShowListenerC7362a());
            return t10;
        }
        HMSLog.m8725e("UIUtil", "In enableFocusedForButtonsInTV, dialog is invalid, dialog = " + t10);
        return t10;
    }

    public static Activity getActiveActivity(Activity activity, Context context) {
        if (isBackground(context)) {
            HMSLog.m8727i("UIUtil", "isBackground" + isBackground(context));
            return null;
        }
        if (activity == null) {
            HMSLog.m8727i("UIUtil", "activity is null");
            return ActivityMgr.INST.getCurrentActivity();
        }
        if (!activity.isFinishing()) {
            return activity;
        }
        HMSLog.m8727i("UIUtil", "activity isFinishing is " + activity.isFinishing());
        return ActivityMgr.INST.getCurrentActivity();
    }

    public static int getDialogThemeId(Activity activity) {
        if (m8830a(activity) != 0) {
            return 0;
        }
        return (activity == null || activity.getResources() == null || activity.getResources().getConfiguration() == null || (activity.getResources().getConfiguration().uiMode & 48) != 32) ? 3 : 2;
    }

    public static String getProcessName(Context context, int i10) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME)) != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == i10) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    public static String getSystemProperties(String str, String str2) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.m8725e("UIUtil", "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    public static boolean isActivityFullscreen(Activity activity) {
        if (activity != null) {
            return (activity.getWindow().getAttributes().flags & 1024) == 1024;
        }
        HMSLog.m8728w("UIUtil", "activity is null");
        return false;
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = getProcessName(context, Process.myPid());
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (TextUtils.equals(next.processName, processName)) {
                HMSLog.m8727i("UIUtil", "appProcess.importance is " + next.importance);
                boolean z10 = next.importance == 100;
                boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
                HMSLog.m8727i("UIUtil", "isForground is " + z10 + "***  isLockedState is " + zIsKeyguardLocked);
                if (!z10 || zIsKeyguardLocked) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isTVDevice() {
        return getSystemProperties("ro.build.characteristics", AccsClientConfig.DEFAULT_CONFIG_TAG).equalsIgnoreCase("tv");
    }

    public static Intent modifyIntentBehaviorsSafe(Intent intent) {
        if (intent == null) {
            return null;
        }
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.media.action.IMAGE_CAPTURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || "android.media.action.VIDEO_CAPTURE".equals(action)) {
            intent.setAction("android.intent.action.VIEW");
        }
        intent.setFlags(intent.getFlags() & (-196));
        return intent;
    }
}
