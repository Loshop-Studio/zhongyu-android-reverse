package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C1908i;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MobclickAgent {

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);


        /* renamed from: a */
        private int f8153a;

        EScenarioType(int i4) {
            this.f8153a = i4;
        }

        public int toValue() {
            return this.f8153a;
        }
    }

    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void clearPreProperties(Context context) {
        getAgent().m6726g(context);
    }

    public static void disable() {
        AnalyticsConfig.enable = false;
    }

    private static void disableExceptionCatch() {
        C1836b.m6680a().m6707a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    public static void enableEncrypt(boolean z3) {
    }

    public static C1836b getAgent() {
        return C1836b.m6680a();
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().m6727h(context);
    }

    private static void init(Context context) {
        C1836b.m6680a().m6688a(context);
    }

    public static void onEvent(Context context, String str) {
        C1836b.m6680a().m6693a(context, str, (String) null, -1L, 1);
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
        if (map == null) {
            UMLog.m7349aq(C1908i.f8759a, 0, "\\|");
        } else {
            C1836b.m6680a().m6696a(context, str, map, -1L);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i4) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("__ct__", Integer.valueOf(i4));
        C1836b.m6680a().m6696a(context, str, map2, -1L);
    }

    private static void onGKVEvent(Context context, String str, HashMap<String, Object> map) {
        C1836b.m6680a().m6694a(context, str, map);
    }

    public static void onKillProcess(Context context) {
        C1836b.m6680a().m6717d(context);
    }

    public static void onPageEnd(String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.m7349aq(C1908i.f8736D, 0, "\\|");
        } else {
            C1836b.m6680a().m6712b(str);
        }
    }

    public static void onPageStart(String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.m7349aq(C1908i.f8735C, 0, "\\|");
        } else {
            C1836b.m6680a().m6703a(str);
        }
    }

    public static void onPause(Context context) {
        C1836b.m6680a().m6714c(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignOff() {
        C1836b.m6680a().m6730j();
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.m7349aq(C1908i.f8790n, 0, "\\|");
        } else {
            C1836b.m6680a().m6709b(context);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().m6699a(context, jSONObject);
    }

    public static void reportError(Context context, String str) {
        try {
            String str2 = UMCrash.KEY_CALLBACK_PAGE_ACTION;
            Method declaredMethod = UMCrash.class.getDeclaredMethod("generateCustomLog", String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(UMCrash.class, str, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void setCatchUncaughtExceptions(boolean z3) {
        C1836b.m6680a().m6707a(z3);
    }

    public static void setCheckDevice(boolean z3) {
    }

    public static void setDebugMode(boolean z3) {
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        getAgent().m6698a(context, list);
    }

    private static void setGameScenarioType(Context context) {
        C1836b.m6680a().m6690a(context, EScenarioType.E_UM_GAME);
    }

    public static void setLatencyWindow(long j4) {
    }

    public static void setLocation(double d4, double d5) {
        C1836b.m6680a().m6686a(d4, d5);
    }

    public static void setOpenGLContext(GL10 gl10) {
        C1836b.m6680a().m6706a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        C1836b.m6680a().m6700a(pageMode);
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void setSecret(Context context, String str) {
        C1836b.m6680a().m6715c(context, str);
    }

    public static void setSessionContinueMillis(long j4) {
        if (j4 <= 30000) {
            j4 = 30000;
        }
        C1836b.m6680a().m6687a(j4);
    }

    private static void setSysListener(ISysListener iSysListener) {
        C1836b.m6680a().m6701a(iSysListener);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().m6724f(context, str);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m7349aq(C1908i.f8787k, 0, "\\|");
        } else {
            C1836b.m6680a().m6693a(context, str, str2, -1L, 1);
        }
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m7349aq(C1908i.f8796t, 0, "\\|");
            return;
        }
        if (str2.length() > 64) {
            UMLog.m7349aq(C1908i.f8797u, 0, "\\|");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C1836b.m6680a().m6704a("_adhoc", str2);
        } else if (str.length() > 32) {
            UMLog.m7349aq(C1908i.f8798v, 0, "\\|");
        } else {
            C1836b.m6680a().m6704a(str, str2);
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        if (map == null) {
            UMLog.m7349aq(C1908i.f8759a, 0, "\\|");
        } else {
            C1836b.m6680a().m6696a(context, str, new HashMap(map), -1L);
        }
    }

    public static void reportError(Context context, Throwable th) {
        try {
            String str = UMCrash.KEY_CALLBACK_PAGE_ACTION;
            Method declaredMethod = UMCrash.class.getDeclaredMethod("generateCustomLog", Throwable.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(UMCrash.class, th, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }
}
