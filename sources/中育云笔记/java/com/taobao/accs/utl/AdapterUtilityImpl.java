package com.taobao.accs.utl;

import android.app.AppOpsManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p074ta.utdid2.device.UTDevice;
import com.taobao.accs.ChannelService;
import com.taobao.accs.client.AdapterGlobalClientInfo;
import com.taobao.accs.data.MsgDistributeService;
import java.io.File;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class AdapterUtilityImpl {
    public static String BACK_APP_KEY = "";
    private static final String TAG = "AdapterUtilityImpl";
    private static boolean channelProcessChecked = false;
    private static String channelProcessName = "";
    private static boolean isChannelProcess = true;
    private static boolean isTargetProcess = true;
    public static String mAgooAppSecret = null;
    private static boolean mChecked = false;
    private static boolean mIsMainProc = true;
    private static boolean targetProcessChecked = false;
    private static String targetProcessName = "";
    public static final String channelService = ChannelService.class.getName();
    public static final String msgService = MsgDistributeService.class.getName();

    public static boolean checkIsWritable(String str, int i10) {
        if (str == null) {
            return false;
        }
        StatFs statFs = new StatFs(str);
        int blockSize = statFs.getBlockSize();
        boolean z10 = statFs.getAvailableBlocks() > 10 && ((long) statFs.getAvailableBlocks()) * ((long) blockSize) > ((long) i10);
        if (!z10) {
            ALog.m10122w("FileCheckUtils", "target : " + i10 + " st.getAvailableBlocks()=" + statFs.getAvailableBlocks() + ",st.getAvailableBlocks() * blockSize=" + (statFs.getAvailableBlocks() * blockSize), new Object[0]);
        }
        return z10;
    }

    public static String getChannelProcess(Context context) {
        if (TextUtils.isEmpty(channelProcessName)) {
            channelProcessName = getServiceProcess(context, channelService);
        }
        return channelProcessName;
    }

    public static String getDeviceId(Context context) {
        return UTDevice.getUtdid(context);
    }

    public static String getProcessName(Context context) throws Throwable {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        String processNameByActivityThread = getProcessNameByActivityThread(context);
        if (!TextUtils.isEmpty(processNameByActivityThread)) {
            return processNameByActivityThread;
        }
        String processNameByPid = getProcessNameByPid();
        return !TextUtils.isEmpty(processNameByPid) ? processNameByPid : "";
    }

    private static String getProcessNameByActivityThread(Context context) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, context.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, null);
        } catch (Exception e10) {
            ALog.m10121w(TAG, "getProcessNameByActivityThread error: ", e10, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getProcessNameByPid() throws java.lang.Throwable {
        /*
            int r0 = android.os.Process.myPid()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r3.<init>()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r4 = "/proc/"
            r3.append(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r3.append(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r0 = "/cmdline"
            r3.append(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            if (r0 == 0) goto L48
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L45
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r6 = r1
            r1 = r0
            r0 = r6
            goto L49
        L3c:
            r1 = move-exception
            goto L6a
        L3e:
            r2 = move-exception
            goto L55
        L40:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L6a
        L45:
            r2 = move-exception
            r0 = r1
            goto L55
        L48:
            r0 = r1
        L49:
            if (r1 == 0) goto L53
            r1.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r1 = move-exception
            r1.printStackTrace()
        L53:
            r1 = r0
            goto L69
        L55:
            java.lang.String r3 = "AdapterUtilityImpl"
            java.lang.String r4 = "getProcessNameByPid error: "
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3c
            com.taobao.accs.utl.ALog.m10121w(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.io.IOException -> L65
            goto L69
        L65:
            r0 = move-exception
            r0.printStackTrace()
        L69:
            return r1
        L6a:
            if (r0 == 0) goto L74
            r0.close()     // Catch: java.io.IOException -> L70
            goto L74
        L70:
            r0 = move-exception
            r0.printStackTrace()
        L74:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.AdapterUtilityImpl.getProcessNameByPid():java.lang.String");
    }

    public static String getServiceProcess(Context context, String str) throws PackageManager.NameNotFoundException {
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, str), 131584);
            if (serviceInfo == null) {
                return null;
            }
            String str2 = serviceInfo.processName;
            if (str2 == null) {
                return context.getPackageName();
            }
            if (!str2.startsWith(":")) {
                return serviceInfo.processName;
            }
            return context.getPackageName() + serviceInfo.processName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static String getStackMsg(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    public static String getTargetProcess(Context context) {
        if (TextUtils.isEmpty(targetProcessName)) {
            targetProcessName = getServiceProcess(context, msgService);
        }
        return targetProcessName;
    }

    public static long getUsableSpace() {
        try {
            File dataDirectory = Environment.getDataDirectory();
            if (dataDirectory == null) {
                return -1L;
            }
            return dataDirectory.getUsableSpace();
        } catch (Throwable th) {
            ALog.m10117e(TAG, "getUsableSpace", th, new Object[0]);
            return -1L;
        }
    }

    public static boolean isChannelProcess(Context context) throws Throwable {
        if (channelProcessChecked) {
            return isChannelProcess;
        }
        String processName = getProcessName(context);
        if (TextUtils.isEmpty(channelProcessName)) {
            channelProcessName = getServiceProcess(context, channelService);
        }
        boolean zEqualsIgnoreCase = processName.equalsIgnoreCase(channelProcessName);
        isChannelProcess = zEqualsIgnoreCase;
        channelProcessChecked = true;
        return zEqualsIgnoreCase;
    }

    public static boolean isMainProcess(Context context) throws Throwable {
        if (mChecked) {
            return mIsMainProc;
        }
        boolean zEqualsIgnoreCase = context.getPackageName().equalsIgnoreCase(getProcessName(context));
        mIsMainProc = zEqualsIgnoreCase;
        mChecked = true;
        return zEqualsIgnoreCase;
    }

    public static boolean isNetworkConnected(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = AdapterGlobalClientInfo.getInstance(context).getConnectivityManager().getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static String isNotificationEnabled(Context context) {
        boolean zIsTarget26 = Utils.isTarget26(context);
        Class cls = Integer.TYPE;
        boolean z10 = true;
        if (zIsTarget26) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i10 = applicationInfo.uid;
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                Method declaredMethod = notificationManager.getClass().getDeclaredMethod("getService", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(notificationManager, null);
                Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("areNotificationsEnabledForPackage", String.class, cls);
                declaredMethod2.setAccessible(true);
                return String.valueOf(declaredMethod2.invoke(objInvoke, packageName, Integer.valueOf(i10)));
            } catch (Throwable th) {
                ALog.m10117e(TAG, "Android O isNotificationEnabled", th, new Object[0]);
                return "unknown";
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo2 = context.getApplicationInfo();
            String packageName2 = context.getApplicationContext().getPackageName();
            int i11 = applicationInfo2.uid;
            Class<?> cls2 = Class.forName(AppOpsManager.class.getName());
            Method method = cls2.getMethod("checkOpNoThrow", cls, cls, String.class);
            Integer num = (Integer) cls2.getDeclaredField("OP_POST_NOTIFICATION").get(appOpsManager);
            num.intValue();
            if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i11), packageName2)).intValue() != 0) {
                z10 = false;
            }
            return String.valueOf(z10);
        } catch (Throwable th2) {
            ALog.m10117e(TAG, "isNotificationEnabled", th2, new Object[0]);
            return "unknown";
        }
    }

    public static boolean isTargetProcess(Context context) throws Throwable {
        if (targetProcessChecked) {
            return isTargetProcess;
        }
        String processName = getProcessName(context);
        if (TextUtils.isEmpty(targetProcessName)) {
            targetProcessName = getServiceProcess(context, msgService);
        }
        boolean zEqualsIgnoreCase = processName.equalsIgnoreCase(targetProcessName);
        isTargetProcess = zEqualsIgnoreCase;
        targetProcessChecked = true;
        return zEqualsIgnoreCase;
    }
}
