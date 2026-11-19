package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.C5016a;
import anet.channel.fulltrace.C5017b;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class GlobalAppRuntimeInfo {

    /* renamed from: a */
    private static Context f2255a;

    /* renamed from: e */
    private static String f2259e;

    /* renamed from: f */
    private static String f2260f;

    /* renamed from: g */
    private static String f2261g;

    /* renamed from: k */
    private static volatile long f2265k;

    /* renamed from: l */
    private static String f2266l;

    /* renamed from: b */
    private static ENV f2256b = ENV.ONLINE;

    /* renamed from: c */
    private static String f2257c = "";

    /* renamed from: d */
    private static String f2258d = "";

    /* renamed from: h */
    private static volatile boolean f2262h = true;

    /* renamed from: i */
    private static SharedPreferences f2263i = null;

    /* renamed from: j */
    private static volatile CopyOnWriteArrayList<String> f2264j = null;

    public static void addBucketInfo(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.length() > 32 || str2.length() > 32) {
            return;
        }
        synchronized (GlobalAppRuntimeInfo.class) {
            try {
                if (f2264j == null) {
                    f2264j = new CopyOnWriteArrayList<>();
                }
                f2264j.add(str);
                f2264j.add(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return f2264j;
    }

    public static Context getContext() {
        return f2255a;
    }

    public static String getCurrentProcess() {
        return f2258d;
    }

    public static ENV getEnv() {
        return f2256b;
    }

    @Deprecated
    public static long getInitTime() {
        return f2265k;
    }

    @Deprecated
    public static int getStartType() {
        C5017b sceneInfo = C5016a.m2345a().getSceneInfo();
        if (sceneInfo != null) {
            return sceneInfo.f2437a;
        }
        return -1;
    }

    public static String getTtid() {
        return f2259e;
    }

    public static String getUserId() {
        return f2260f;
    }

    public static String getUtdid() {
        Context context;
        if (f2261g == null && (context = f2255a) != null) {
            f2261g = Utils.getDeviceId(context);
        }
        return f2261g;
    }

    public static boolean isAppBackground() {
        if (f2255a == null) {
            return true;
        }
        return f2262h;
    }

    public static boolean isTargetProcess() {
        if (TextUtils.isEmpty(f2257c) || TextUtils.isEmpty(f2258d)) {
            return true;
        }
        return f2257c.equalsIgnoreCase(f2258d);
    }

    public static void setBackground(boolean z10) {
        f2262h = z10;
    }

    public static void setContext(Context context) {
        f2255a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f2258d)) {
                f2258d = Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f2257c)) {
                f2257c = Utils.getMainProcessName(context);
            }
            if (f2263i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f2263i = defaultSharedPreferences;
                f2260f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.m2529e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f2258d, "TargetProcess", f2257c);
        }
    }

    public static void setCurrentProcess(String str) {
        f2258d = str;
    }

    public static void setEnv(ENV env) {
        f2256b = env;
    }

    @Deprecated
    public static void setInitTime(long j10) {
        f2265k = j10;
    }

    public static void setTargetProcess(String str) {
        f2257c = str;
    }

    public static void setTtid(String str) {
        f2259e = str;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iIndexOf = str.indexOf("@");
            String strSubstring = null;
            String strSubstring2 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
            String strSubstring3 = str.substring(iIndexOf + 1);
            int iLastIndexOf = strSubstring3.lastIndexOf(BundleUtil.UNDERLINE_TAG);
            if (iLastIndexOf != -1) {
                String strSubstring4 = strSubstring3.substring(0, iLastIndexOf);
                strSubstring = strSubstring3.substring(iLastIndexOf + 1);
                strSubstring3 = strSubstring4;
            }
            f2266l = strSubstring;
            AmdcRuntimeInfo.setAppInfo(strSubstring3, strSubstring, strSubstring2);
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        String str2 = f2260f;
        if (str2 == null || !str2.equals(str)) {
            f2260f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = f2263i;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setUtdid(String str) {
        String str2 = f2261g;
        if (str2 == null || !str2.equals(str)) {
            f2261g = str;
        }
    }

    public static boolean isTargetProcess(String str) {
        if (TextUtils.isEmpty(f2257c) || TextUtils.isEmpty(str)) {
            return true;
        }
        return f2257c.equalsIgnoreCase(str);
    }
}
