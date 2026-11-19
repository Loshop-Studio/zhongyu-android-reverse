package p333s5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* renamed from: s5.d */
/* loaded from: classes5.dex */
public abstract class AbstractC11064d {

    /* renamed from: a */
    public static String f26693a;

    /* renamed from: a */
    public static String m24521a() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return "";
                        }
                        String strTrim = line.trim();
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                        return strTrim;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.m8725e("CommFun", "get current app processes IOException!");
            return "";
        } catch (Exception e10) {
            HMSLog.m8725e("CommFun", "get current app processes exception!" + e10.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    public static String m24522b(Context context) throws IOException {
        if (!TextUtils.isEmpty(f26693a)) {
            return f26693a;
        }
        String strM24523c = m24523c(context);
        f26693a = strM24523c;
        if (!TextUtils.isEmpty(strM24523c)) {
            return f26693a;
        }
        String strM24521a = m24521a();
        f26693a = strM24521a;
        return strM24521a;
    }

    /* renamed from: c */
    public static String m24523c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
        if (activityManager == null) {
            return "";
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null || runningAppProcesses.size() == 0) {
            HMSLog.m8728w("CommFun", "get running app processes null!");
            return "";
        }
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid && runningAppProcessInfo.processName != null) {
                HMSLog.m8727i("CommFun", "info.pid -> " + runningAppProcessInfo.pid + ", info.processName -> " + runningAppProcessInfo.processName);
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    /* renamed from: d */
    public static boolean m24524d() {
        int i10 = HwBuildEx.VERSION.EMUI_SDK_INT;
        HMSLog.m8722d("CommFun", "Emui Api Level:" + i10);
        return i10 > 0;
    }

    /* renamed from: e */
    public static String m24525e(Context context) {
        String str = context.createDeviceProtectedStorageContext().getDataDir() + "";
        if (TextUtils.isEmpty(str)) {
            HMSLog.m8725e("CommFun", "get storage root path of the current user failed.");
        }
        return str;
    }

    /* renamed from: f */
    public static long m24526f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 16384).versionCode;
        } catch (Exception unused) {
            HMSLog.m8725e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    /* renamed from: g */
    public static boolean m24527g(Context context) {
        return m24524d() && HwBuildEx.VERSION.EMUI_SDK_INT < 21 && m24526f(context) < 110001400;
    }
}
