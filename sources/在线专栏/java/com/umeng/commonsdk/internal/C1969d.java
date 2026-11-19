package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C1851ai;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C1970a;
import com.umeng.commonsdk.internal.utils.C1973d;
import com.umeng.commonsdk.internal.utils.C1979j;
import com.umeng.commonsdk.internal.utils.C1980k;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C2026b;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.d */
/* loaded from: classes.dex */
public class C1969d {
    /* renamed from: a */
    public static void m7412a(Context context) throws JSONException {
        try {
            ULog.m7609i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1851ai.f8262aK, C1965a.f9172e);
            JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, m7419d(context), UMServerURL.PATH_ANALYTICS, C1851ai.f8252aA, C1965a.f9172e);
            if (jSONObjectBuildEnvelopeWithExtHeader == null || jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                return;
            }
            ULog.m7609i("walle", "[internal] workEvent send envelope back, result is ok");
            C1970a.m7442e(context);
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
        }
    }

    /* renamed from: b */
    public static void m7416b(Context context) {
        ULog.m7609i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            m7425j(context);
        }
    }

    /* renamed from: c */
    public static void m7418c(Context context) {
        ULog.m7609i("walle", "[internal] begin by stateful--->>>");
        if (context == null || !UMEnvelopeBuild.getTransmissionSendFlag()) {
            return;
        }
        m7425j(context);
    }

    /* renamed from: d */
    public static JSONObject m7419d(Context context) throws Throwable {
        JSONArray jSONArrayM7423h;
        JSONArray jSONArrayM7426k;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(C2026b.f9566I) && (jSONArrayM7426k = m7426k(applicationContext)) != null && jSONArrayM7426k.length() > 0) {
                    jSONObject2.put("rs", jSONArrayM7426k);
                }
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
            try {
                JSONArray jSONArrayM7427l = m7427l(applicationContext);
                if (jSONArrayM7427l != null && jSONArrayM7427l.length() > 0) {
                    jSONObject2.put("by", jSONArrayM7427l);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
            try {
                m7413a(applicationContext, jSONObject2);
            } catch (Exception e6) {
                UMCrashManager.reportCrash(applicationContext, e6);
            }
            try {
                m7417b(applicationContext, jSONObject2);
            } catch (Exception e7) {
                UMCrashManager.reportCrash(applicationContext, e7);
            }
            try {
                JSONObject jSONObjectM7411a = m7411a();
                if (jSONObjectM7411a != null && jSONObjectM7411a.length() > 0) {
                    jSONObject2.put("build", jSONObjectM7411a);
                }
            } catch (Exception e8) {
                UMCrashManager.reportCrash(applicationContext, e8);
            }
            try {
                JSONObject jSONObjectM7420e = m7420e(applicationContext);
                if (jSONObjectM7420e != null && jSONObjectM7420e.length() > 0) {
                    jSONObject2.put("scr", jSONObjectM7420e);
                }
            } catch (Exception e9) {
                UMCrashManager.reportCrash(applicationContext, e9);
            }
            try {
                JSONObject jSONObjectM7421f = m7421f(applicationContext);
                if (jSONObjectM7421f != null && jSONObjectM7421f.length() > 0) {
                    jSONObject2.put("sinfo", jSONObjectM7421f);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArrayM7439d = C1970a.m7439d(applicationContext);
                if (jSONArrayM7439d != null && jSONArrayM7439d.length() > 0) {
                    try {
                        jSONObject3.put("wl", jSONArrayM7439d);
                    } catch (JSONException unused) {
                    }
                }
                jSONObject2.put("winfo", jSONObject3);
            } catch (Exception e11) {
                UMCrashManager.reportCrash(applicationContext, e11);
            }
            try {
                JSONArray jSONArrayM7422g = m7422g(applicationContext);
                if (jSONArrayM7422g != null && jSONArrayM7422g.length() > 0) {
                    jSONObject2.put("input", jSONArrayM7422g);
                }
            } catch (Exception e12) {
                UMCrashManager.reportCrash(applicationContext, e12);
            }
            try {
                if (FieldManager.allow(C2026b.f9590af) && (jSONArrayM7423h = m7423h(applicationContext)) != null && jSONArrayM7423h.length() > 0) {
                    jSONObject2.put("appls", jSONArrayM7423h);
                }
            } catch (Exception e13) {
                UMCrashManager.reportCrash(applicationContext, e13);
            }
            try {
                JSONObject jSONObjectM7424i = m7424i(applicationContext);
                if (jSONObjectM7424i != null && jSONObjectM7424i.length() > 0) {
                    jSONObject2.put("mem", jSONObjectM7424i);
                }
            } catch (Exception e14) {
                UMCrashManager.reportCrash(applicationContext, e14);
            }
            try {
                JSONObject jSONObjectM7415b = m7415b();
                if (jSONObjectM7415b != null && jSONObjectM7415b.length() > 0) {
                    jSONObject2.put(C1851ai.f8335w, jSONObjectM7415b);
                }
            } catch (Exception unused2) {
            }
            try {
                jSONObject.put(C1851ai.f8296as, jSONObject2);
            } catch (JSONException e15) {
                UMCrashManager.reportCrash(applicationContext, e15);
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static JSONObject m7420e(Context context) throws JSONException {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", C1970a.m7444g(context));
                jSONObject.put("a_nav_h", C1970a.m7445h(context));
                if (context.getResources() != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
                    jSONObject.put("a_den", displayMetrics.density);
                    jSONObject.put("a_dpi", displayMetrics.densityDpi);
                }
            } catch (Exception e4) {
                UMCrashManager.reportCrash(context, e4);
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static JSONObject m7421f(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", C1970a.m7429a(applicationContext, packageName));
                jSONObject.put("a_alut", C1970a.m7431b(applicationContext, packageName));
                jSONObject.put("a_c", C1970a.m7435c(applicationContext, packageName));
                jSONObject.put("a_uid", C1970a.m7437d(applicationContext, packageName));
                if (C1970a.m7430a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("tf", C1970a.m7433b());
                jSONObject.put("s_fs", C1970a.m7428a(applicationContext));
                jSONObject.put("a_meid", DeviceConfig.getMeid(applicationContext));
                jSONObject.put("a_imsi", DeviceConfig.getImsi(applicationContext));
                jSONObject.put("st", C1970a.m7438d());
                String simICCID = DeviceConfig.getSimICCID(applicationContext);
                if (!TextUtils.isEmpty(simICCID)) {
                    try {
                        jSONObject.put("a_iccid", simICCID);
                    } catch (Exception unused) {
                    }
                }
                String secondSimIMEi = DeviceConfig.getSecondSimIMEi(applicationContext);
                if (!TextUtils.isEmpty(secondSimIMEi)) {
                    try {
                        jSONObject.put("a_simei", secondSimIMEi);
                    } catch (Exception unused2) {
                    }
                }
                jSONObject.put("hn", C1970a.m7440e());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
        }
        return jSONObject;
    }

    /* renamed from: g */
    public static JSONArray m7422g(Context context) {
        Context applicationContext;
        List<InputMethodInfo> listM7447j;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM7447j = C1970a.m7447j((applicationContext = context.getApplicationContext()))) != null) {
            for (InputMethodInfo inputMethodInfo : listM7447j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_id", inputMethodInfo.getId());
                    jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(applicationContext, th);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: h */
    public static JSONArray m7423h(Context context) throws JSONException {
        Context applicationContext;
        List<C1970a.a> listM7448k;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM7448k = C1970a.m7448k((applicationContext = context.getApplicationContext()))) != null && !listM7448k.isEmpty()) {
            for (C1970a.a aVar : listM7448k) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", aVar.f9212a);
                        jSONObject.put("a_la", aVar.f9213b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e4) {
                        UMCrashManager.reportCrash(applicationContext, e4);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: i */
    public static JSONObject m7424i(Context context) throws JSONException {
        Context applicationContext;
        ActivityManager.MemoryInfo memoryInfoM7449l;
        JSONObject jSONObject = new JSONObject();
        if (context != null && (memoryInfoM7449l = C1970a.m7449l((applicationContext = context.getApplicationContext()))) != null) {
            try {
                jSONObject.put("t", memoryInfoM7449l.totalMem);
                jSONObject.put("f", memoryInfoM7449l.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
        }
        return jSONObject;
    }

    /* renamed from: j */
    private static void m7425j(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, C1965a.f9173f, C1966b.m7392a(context).m7393a(), null);
            }
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。");
            UMWorkDispatch.sendEvent(context, C1965a.f9189v, C1966b.m7392a(context).m7393a(), null, 5000L);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: k */
    private static JSONArray m7426k(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(AgooConstants.OPEN_ACTIIVTY_NAME);
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
                return null;
            }
            for (int i4 = 0; i4 < runningServices.size(); i4++) {
                if (runningServices.get(i4) != null && runningServices.get(i4).service != null && runningServices.get(i4).service.getClassName() != null && runningServices.get(i4).service.getPackageName() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sn", runningServices.get(i4).service.getClassName().toString());
                        jSONObject.put("pn", runningServices.get(i4).service.getPackageName().toString());
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
            if (jSONArray == null) {
                return jSONArray;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject2.put("ls", jSONArray);
            } catch (JSONException unused2) {
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("sers", jSONObject2);
            } catch (JSONException unused3) {
            }
            JSONArray jSONArray2 = new JSONArray();
            try {
                jSONArray2.put(jSONObject3);
                return jSONArray2;
            } catch (Throwable th) {
                th = th;
                jSONArray = jSONArray2;
                UMCrashManager.reportCrash(context, th);
                return jSONArray;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: l */
    private static JSONArray m7427l(Context context) {
        JSONArray jSONArray = new JSONArray();
        String strM7488a = C1979j.m7488a(context);
        if (!TextUtils.isEmpty(strM7488a)) {
            try {
                jSONArray.put(new JSONObject(strM7488a));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private static JSONObject m7415b() throws Throwable {
        try {
            C1973d.a aVarM7468a = C1973d.m7468a();
            if (aVarM7468a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", aVarM7468a.f9239a);
                jSONObject.put("pla", aVarM7468a.f9240b);
                jSONObject.put("cpus", aVarM7468a.f9241c);
                jSONObject.put("fea", aVarM7468a.f9242d);
                jSONObject.put("imp", aVarM7468a.f9243e);
                jSONObject.put("arc", aVarM7468a.f9244f);
                jSONObject.put("var", aVarM7468a.f9245g);
                jSONObject.put("par", aVarM7468a.f9246h);
                jSONObject.put("rev", aVarM7468a.f9247i);
                jSONObject.put("har", aVarM7468a.f9248j);
                jSONObject.put("rev", aVarM7468a.f9249k);
                jSONObject.put("ser", aVarM7468a.f9250l);
                jSONObject.put("cur_cpu", C1973d.m7471d());
                jSONObject.put("max_cpu", C1973d.m7469b());
                jSONObject.put("min_cpu", C1973d.m7470c());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m7413a(Context context, JSONObject jSONObject) throws JSONException {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getApplicationContext().getPackageManager()) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m7414a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
        m7414a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
        m7414a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
        m7414a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
        m7414a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
    }

    /* renamed from: a */
    private static void m7414a(JSONObject jSONObject, String str, boolean z3) throws JSONException {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (z3) {
                jSONObject.put(str, 1);
            } else {
                jSONObject.put(str, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static JSONObject m7411a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_pr", Build.PRODUCT);
            jSONObject.put("a_bl", Build.BOOTLOADER);
            jSONObject.put("a_rv", Build.getRadioVersion());
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            JSONArray jSONArray = new JSONArray();
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                if (i5 >= strArr.length) {
                    break;
                }
                jSONArray.put(strArr[i5]);
                i5++;
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("a_s32", jSONArray);
            }
            JSONArray jSONArray2 = new JSONArray();
            int i6 = 0;
            while (true) {
                String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                if (i6 >= strArr2.length) {
                    break;
                }
                jSONArray2.put(strArr2[i6]);
                i6++;
            }
            if (jSONArray2.length() > 0) {
                jSONObject.put("a_s64", jSONArray2);
            }
            JSONArray jSONArray3 = new JSONArray();
            while (true) {
                String[] strArr3 = Build.SUPPORTED_ABIS;
                if (i4 >= strArr3.length) {
                    break;
                }
                jSONArray3.put(strArr3[i4]);
                i4++;
            }
            if (jSONArray3.length() > 0) {
                jSONObject.put("a_sa", jSONArray3);
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", UtilityImpl.NET_TYPE_UNKNOWN);
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put("a_bos", Build.VERSION.BASE_OS);
                jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
                jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            }
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m7417b(Context context, JSONObject jSONObject) throws JSONException {
        if (context != null) {
            String strM7492a = C1980k.m7492a(context);
            if (TextUtils.isEmpty(strM7492a)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strM7492a);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2.has(C1980k.f9278d)) {
                    jSONObject.put(C1980k.f9278d, jSONObject2.opt(C1980k.f9278d));
                }
                if (jSONObject2.has(C1980k.f9277c)) {
                    jSONObject.put(C1980k.f9277c, jSONObject2.opt(C1980k.f9277c));
                }
                if (jSONObject2.has(C1980k.f9276b)) {
                    jSONObject.put(C1980k.f9276b, jSONObject2.opt(C1980k.f9276b));
                }
            } catch (Exception unused) {
            }
        }
    }
}
