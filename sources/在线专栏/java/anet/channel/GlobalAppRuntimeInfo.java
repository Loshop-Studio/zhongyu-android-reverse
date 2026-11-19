package anet.channel;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.entity.ENV;
import anet.channel.fulltrace.C0893a;
import anet.channel.fulltrace.C0894b;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class GlobalAppRuntimeInfo {

    /* renamed from: a */
    private static Context f4977a;

    /* renamed from: e */
    private static String f4981e;

    /* renamed from: f */
    private static String f4982f;

    /* renamed from: g */
    private static String f4983g;

    /* renamed from: k */
    private static volatile long f4987k;

    /* renamed from: l */
    private static String f4988l;

    /* renamed from: b */
    private static ENV f4978b = ENV.ONLINE;

    /* renamed from: c */
    private static String f4979c = "";

    /* renamed from: d */
    private static String f4980d = "";

    /* renamed from: h */
    private static volatile boolean f4984h = true;

    /* renamed from: i */
    private static SharedPreferences f4985i = null;

    /* renamed from: j */
    private static volatile CopyOnWriteArrayList<String> f4986j = null;

    public static void addBucketInfo(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.length() > 32 || str2.length() > 32) {
            return;
        }
        synchronized (GlobalAppRuntimeInfo.class) {
            if (f4986j == null) {
                f4986j = new CopyOnWriteArrayList<>();
            }
            f4986j.add(str);
            f4986j.add(str2);
        }
    }

    public static CopyOnWriteArrayList<String> getBucketInfo() {
        return f4986j;
    }

    public static Context getContext() {
        return f4977a;
    }

    public static String getCurrentProcess() {
        return f4980d;
    }

    public static ENV getEnv() {
        return f4978b;
    }

    @Deprecated
    public static long getInitTime() {
        return f4987k;
    }

    @Deprecated
    public static int getStartType() {
        C0894b sceneInfo = C0893a.m4454a().getSceneInfo();
        if (sceneInfo != null) {
            return sceneInfo.f5159a;
        }
        return -1;
    }

    public static String getTtid() {
        return f4981e;
    }

    public static String getUserId() {
        return f4982f;
    }

    public static String getUtdid() {
        Context context;
        if (f4983g == null && (context = f4977a) != null) {
            f4983g = Utils.getDeviceId(context);
        }
        return f4983g;
    }

    public static boolean isAppBackground() {
        if (f4977a == null) {
            return true;
        }
        return f4984h;
    }

    public static boolean isTargetProcess() {
        if (TextUtils.isEmpty(f4979c) || TextUtils.isEmpty(f4980d)) {
            return true;
        }
        return f4979c.equalsIgnoreCase(f4980d);
    }

    public static void setBackground(boolean z3) {
        f4984h = z3;
    }

    public static void setContext(Context context) {
        f4977a = context;
        if (context != null) {
            if (TextUtils.isEmpty(f4980d)) {
                f4980d = Utils.getProcessName(context, Process.myPid());
            }
            if (TextUtils.isEmpty(f4979c)) {
                f4979c = Utils.getMainProcessName(context);
            }
            if (f4985i == null) {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                f4985i = defaultSharedPreferences;
                f4982f = defaultSharedPreferences.getString("UserId", null);
            }
            ALog.m4638e("awcn.GlobalAppRuntimeInfo", "", null, "CurrentProcess", f4980d, "TargetProcess", f4979c);
        }
    }

    public static void setCurrentProcess(String str) {
        f4980d = str;
    }

    public static void setEnv(ENV env) {
        f4978b = env;
    }

    @Deprecated
    public static void setInitTime(long j4) {
        f4987k = j4;
    }

    public static void setTargetProcess(String str) {
        f4979c = str;
    }

    public static void setTtid(String str) {
        f4981e = str;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int iIndexOf = str.indexOf("@");
            String strSubstring = null;
            String strSubstring2 = iIndexOf != -1 ? str.substring(0, iIndexOf) : null;
            String strSubstring3 = str.substring(iIndexOf + 1);
            int iLastIndexOf = strSubstring3.lastIndexOf("_");
            if (iLastIndexOf != -1) {
                String strSubstring4 = strSubstring3.substring(0, iLastIndexOf);
                strSubstring = strSubstring3.substring(iLastIndexOf + 1);
                strSubstring3 = strSubstring4;
            }
            f4988l = strSubstring;
            AmdcRuntimeInfo.setAppInfo(strSubstring3, strSubstring, strSubstring2);
        } catch (Exception unused) {
        }
    }

    public static void setUserId(String str) {
        String str2 = f4982f;
        if (str2 == null || !str2.equals(str)) {
            f4982f = str;
            StrategyCenter.getInstance().forceRefreshStrategy(DispatchConstants.getAmdcServerDomain());
            SharedPreferences sharedPreferences = f4985i;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("UserId", str).apply();
            }
        }
    }

    public static void setUtdid(String str) {
        String str2 = f4983g;
        if (str2 == null || !str2.equals(str)) {
            f4983g = str;
        }
    }

    public static boolean isTargetProcess(String str) {
        if (TextUtils.isEmpty(f4979c) || TextUtils.isEmpty(str)) {
            return true;
        }
        return f4979c.equalsIgnoreCase(str);
    }
}
