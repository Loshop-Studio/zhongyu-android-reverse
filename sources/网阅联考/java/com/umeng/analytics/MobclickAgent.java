package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3392i;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MobclickAgent {

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);


        /* renamed from: a */
        private int f1561a;

        EScenarioType(int i4) {
            this.f1561a = i4;
        }

        public int toValue() {
            return this.f1561a;
        }
    }

    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void clearPreProperties(Context context) {
        getAgent().m2803g(context);
    }

    public static void disable() {
        AnalyticsConfig.enable = false;
    }

    private static void disableExceptionCatch() {
        C3320b.m2757a().m2784a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    public static void enableEncrypt(boolean z3) {
    }

    public static C3320b getAgent() {
        return C3320b.m2757a();
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().m2804h(context);
    }

    private static void init(Context context) {
        C3320b.m2757a().m2765a(context);
    }

    public static void onEvent(Context context, String str) {
        C3320b.m2757a().m2770a(context, str, (String) null, -1L, 1);
    }

    public static void onEventObject(Context context, String str, Map<String, Object> map) {
        if (map == null) {
            UMLog.m3426aq(C3392i.f2167a, 0, "\\|");
        } else {
            C3320b.m2757a().m2773a(context, str, map, -1L);
        }
    }

    public static void onEventValue(Context context, String str, Map<String, String> map, int i4) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("__ct__", Integer.valueOf(i4));
        C3320b.m2757a().m2773a(context, str, map2, -1L);
    }

    private static void onGKVEvent(Context context, String str, HashMap<String, Object> map) {
        C3320b.m2757a().m2771a(context, str, map);
    }

    public static void onKillProcess(Context context) {
        C3320b.m2757a().m2794d(context);
    }

    public static void onPageEnd(String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.m3426aq(C3392i.f2144D, 0, "\\|");
        } else {
            C3320b.m2757a().m2789b(str);
        }
    }

    public static void onPageStart(String str) {
        if (TextUtils.isEmpty(str)) {
            UMLog.m3426aq(C3392i.f2143C, 0, "\\|");
        } else {
            C3320b.m2757a().m2780a(str);
        }
    }

    public static void onPause(Context context) {
        C3320b.m2757a().m2791c(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignOff() {
        C3320b.m2757a().m2807j();
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.m3426aq(C3392i.f2198n, 0, "\\|");
        } else {
            C3320b.m2757a().m2786b(context);
        }
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().m2776a(context, jSONObject);
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
        C3320b.m2757a().m2784a(z3);
    }

    public static void setCheckDevice(boolean z3) {
    }

    public static void setDebugMode(boolean z3) {
    }

    public static void setFirstLaunchEvent(Context context, List<String> list) {
        getAgent().m2775a(context, list);
    }

    private static void setGameScenarioType(Context context) {
        C3320b.m2757a().m2767a(context, EScenarioType.E_UM_GAME);
    }

    public static void setLatencyWindow(long j4) {
    }

    public static void setLocation(double d4, double d5) {
        C3320b.m2757a().m2763a(d4, d5);
    }

    public static void setOpenGLContext(GL10 gl10) {
        C3320b.m2757a().m2783a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        C3320b.m2757a().m2777a(pageMode);
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void setSecret(Context context, String str) {
        C3320b.m2757a().m2792c(context, str);
    }

    public static void setSessionContinueMillis(long j4) {
        if (j4 <= 30000) {
            j4 = 30000;
        }
        C3320b.m2757a().m2764a(j4);
    }

    private static void setSysListener(ISysListener iSysListener) {
        C3320b.m2757a().m2778a(iSysListener);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().m2801f(context, str);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m3426aq(C3392i.f2195k, 0, "\\|");
        } else {
            C3320b.m2757a().m2770a(context, str, str2, -1L, 1);
        }
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m3426aq(C3392i.f2204t, 0, "\\|");
            return;
        }
        if (str2.length() > 64) {
            UMLog.m3426aq(C3392i.f2205u, 0, "\\|");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C3320b.m2757a().m2781a("_adhoc", str2);
        } else if (str.length() > 32) {
            UMLog.m3426aq(C3392i.f2206v, 0, "\\|");
        } else {
            C3320b.m2757a().m2781a(str, str2);
        }
    }

    public static void onEvent(Context context, String str, Map<String, String> map) {
        if (map == null) {
            UMLog.m3426aq(C3392i.f2167a, 0, "\\|");
        } else {
            C3320b.m2757a().m2773a(context, str, new HashMap(map), -1L);
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
