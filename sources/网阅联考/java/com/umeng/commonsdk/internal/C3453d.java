package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import androidx.core.os.EnvironmentCompat;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C3454a;
import com.umeng.commonsdk.internal.utils.C3457d;
import com.umeng.commonsdk.internal.utils.C3463j;
import com.umeng.commonsdk.internal.utils.C3464k;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3510b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.d */
/* loaded from: classes2.dex */
public class C3453d {
    /* renamed from: a */
    public static void m3489a(Context context) throws JSONException {
        try {
            ULog.m3686i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C3335ai.f1670aK, C3449a.f2580e);
            JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, m3496d(context), UMServerURL.PATH_ANALYTICS, C3335ai.f1660aA, C3449a.f2580e);
            if (jSONObjectBuildEnvelopeWithExtHeader == null || jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                return;
            }
            ULog.m3686i("walle", "[internal] workEvent send envelope back, result is ok");
            C3454a.m3519e(context);
        } catch (Exception e4) {
            UMCrashManager.reportCrash(context, e4);
        }
    }

    /* renamed from: b */
    public static void m3493b(Context context) {
        ULog.m3686i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            m3502j(context);
        }
    }

    /* renamed from: c */
    public static void m3495c(Context context) {
        ULog.m3686i("walle", "[internal] begin by stateful--->>>");
        if (context == null || !UMEnvelopeBuild.getTransmissionSendFlag()) {
            return;
        }
        m3502j(context);
    }

    /* renamed from: d */
    public static JSONObject m3496d(Context context) throws Throwable {
        JSONArray jSONArrayM3500h;
        JSONArray jSONArrayM3503k;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(C3510b.f2974I) && (jSONArrayM3503k = m3503k(applicationContext)) != null && jSONArrayM3503k.length() > 0) {
                    jSONObject2.put("rs", jSONArrayM3503k);
                }
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
            try {
                JSONArray jSONArrayM3504l = m3504l(applicationContext);
                if (jSONArrayM3504l != null && jSONArrayM3504l.length() > 0) {
                    jSONObject2.put("by", jSONArrayM3504l);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
            try {
                m3490a(applicationContext, jSONObject2);
            } catch (Exception e6) {
                UMCrashManager.reportCrash(applicationContext, e6);
            }
            try {
                m3494b(applicationContext, jSONObject2);
            } catch (Exception e7) {
                UMCrashManager.reportCrash(applicationContext, e7);
            }
            try {
                JSONObject jSONObjectM3488a = m3488a();
                if (jSONObjectM3488a != null && jSONObjectM3488a.length() > 0) {
                    jSONObject2.put("build", jSONObjectM3488a);
                }
            } catch (Exception e8) {
                UMCrashManager.reportCrash(applicationContext, e8);
            }
            try {
                JSONObject jSONObjectM3497e = m3497e(applicationContext);
                if (jSONObjectM3497e != null && jSONObjectM3497e.length() > 0) {
                    jSONObject2.put("scr", jSONObjectM3497e);
                }
            } catch (Exception e9) {
                UMCrashManager.reportCrash(applicationContext, e9);
            }
            try {
                JSONObject jSONObjectM3498f = m3498f(applicationContext);
                if (jSONObjectM3498f != null && jSONObjectM3498f.length() > 0) {
                    jSONObject2.put("sinfo", jSONObjectM3498f);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArrayM3516d = C3454a.m3516d(applicationContext);
                if (jSONArrayM3516d != null && jSONArrayM3516d.length() > 0) {
                    try {
                        jSONObject3.put("wl", jSONArrayM3516d);
                    } catch (JSONException unused) {
                    }
                }
                jSONObject2.put("winfo", jSONObject3);
            } catch (Exception e11) {
                UMCrashManager.reportCrash(applicationContext, e11);
            }
            try {
                JSONArray jSONArrayM3499g = m3499g(applicationContext);
                if (jSONArrayM3499g != null && jSONArrayM3499g.length() > 0) {
                    jSONObject2.put("input", jSONArrayM3499g);
                }
            } catch (Exception e12) {
                UMCrashManager.reportCrash(applicationContext, e12);
            }
            try {
                if (FieldManager.allow(C3510b.f2998af) && (jSONArrayM3500h = m3500h(applicationContext)) != null && jSONArrayM3500h.length() > 0) {
                    jSONObject2.put("appls", jSONArrayM3500h);
                }
            } catch (Exception e13) {
                UMCrashManager.reportCrash(applicationContext, e13);
            }
            try {
                JSONObject jSONObjectM3501i = m3501i(applicationContext);
                if (jSONObjectM3501i != null && jSONObjectM3501i.length() > 0) {
                    jSONObject2.put("mem", jSONObjectM3501i);
                }
            } catch (Exception e14) {
                UMCrashManager.reportCrash(applicationContext, e14);
            }
            try {
                JSONObject jSONObjectM3492b = m3492b();
                if (jSONObjectM3492b != null && jSONObjectM3492b.length() > 0) {
                    jSONObject2.put(C3335ai.f1743w, jSONObjectM3492b);
                }
            } catch (Exception unused2) {
            }
            try {
                jSONObject.put(C3335ai.f1704as, jSONObject2);
            } catch (JSONException e15) {
                UMCrashManager.reportCrash(applicationContext, e15);
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static JSONObject m3497e(Context context) throws JSONException {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", C3454a.m3521g(context));
                jSONObject.put("a_nav_h", C3454a.m3522h(context));
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
    public static JSONObject m3498f(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", C3454a.m3506a(applicationContext, packageName));
                jSONObject.put("a_alut", C3454a.m3508b(applicationContext, packageName));
                jSONObject.put("a_c", C3454a.m3512c(applicationContext, packageName));
                jSONObject.put("a_uid", C3454a.m3514d(applicationContext, packageName));
                if (C3454a.m3507a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("tf", C3454a.m3510b());
                jSONObject.put("s_fs", C3454a.m3505a(applicationContext));
                jSONObject.put("a_meid", DeviceConfig.getMeid(applicationContext));
                jSONObject.put("a_imsi", DeviceConfig.getImsi(applicationContext));
                jSONObject.put("st", C3454a.m3515d());
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
                jSONObject.put("hn", C3454a.m3517e());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
        }
        return jSONObject;
    }

    /* renamed from: g */
    public static JSONArray m3499g(Context context) {
        Context applicationContext;
        List<InputMethodInfo> listM3524j;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM3524j = C3454a.m3524j((applicationContext = context.getApplicationContext()))) != null) {
            for (InputMethodInfo inputMethodInfo : listM3524j) {
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
    public static JSONArray m3500h(Context context) throws JSONException {
        Context applicationContext;
        List<C3454a.a> listM3525k;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM3525k = C3454a.m3525k((applicationContext = context.getApplicationContext()))) != null && !listM3525k.isEmpty()) {
            for (C3454a.a aVar : listM3525k) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", aVar.f2620a);
                        jSONObject.put("a_la", aVar.f2621b);
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
    public static JSONObject m3501i(Context context) throws JSONException {
        Context applicationContext;
        ActivityManager.MemoryInfo memoryInfoM3526l;
        JSONObject jSONObject = new JSONObject();
        if (context != null && (memoryInfoM3526l = C3454a.m3526l((applicationContext = context.getApplicationContext()))) != null) {
            try {
                jSONObject.put(C3335ai.f1665aF, memoryInfoM3526l.totalMem);
                jSONObject.put("f", memoryInfoM3526l.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
        }
        return jSONObject;
    }

    /* renamed from: j */
    private static void m3502j(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, C3449a.f2581f, C3450b.m3469a(context).m3470a(), null);
            }
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。");
            UMWorkDispatch.sendEvent(context, C3449a.f2597v, C3450b.m3469a(context).m3470a(), null, 5000L);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* renamed from: k */
    private static JSONArray m3503k(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
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
    private static JSONArray m3504l(Context context) {
        JSONArray jSONArray = new JSONArray();
        String strM3565a = C3463j.m3565a(context);
        if (!TextUtils.isEmpty(strM3565a)) {
            try {
                jSONArray.put(new JSONObject(strM3565a));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private static JSONObject m3492b() throws Throwable {
        try {
            C3457d.a aVarM3545a = C3457d.m3545a();
            if (aVarM3545a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", aVarM3545a.f2647a);
                jSONObject.put("pla", aVarM3545a.f2648b);
                jSONObject.put("cpus", aVarM3545a.f2649c);
                jSONObject.put("fea", aVarM3545a.f2650d);
                jSONObject.put("imp", aVarM3545a.f2651e);
                jSONObject.put("arc", aVarM3545a.f2652f);
                jSONObject.put("var", aVarM3545a.f2653g);
                jSONObject.put("par", aVarM3545a.f2654h);
                jSONObject.put("rev", aVarM3545a.f2655i);
                jSONObject.put("har", aVarM3545a.f2656j);
                jSONObject.put("rev", aVarM3545a.f2657k);
                jSONObject.put("ser", aVarM3545a.f2658l);
                jSONObject.put("cur_cpu", C3457d.m3548d());
                jSONObject.put("max_cpu", C3457d.m3546b());
                jSONObject.put("min_cpu", C3457d.m3547c());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m3490a(Context context, JSONObject jSONObject) throws JSONException {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getApplicationContext().getPackageManager()) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m3491a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
        m3491a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
        m3491a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
        m3491a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
        m3491a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
    }

    /* renamed from: a */
    private static void m3491a(JSONObject jSONObject, String str, boolean z3) throws JSONException {
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
    public static JSONObject m3488a() throws JSONException {
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
            jSONObject.put("a_uk", EnvironmentCompat.MEDIA_UNKNOWN);
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            jSONObject.put("a_bos", Build.VERSION.BASE_OS);
            jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
            jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static void m3494b(Context context, JSONObject jSONObject) throws JSONException {
        if (context != null) {
            String strM3569a = C3464k.m3569a(context);
            if (TextUtils.isEmpty(strM3569a)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strM3569a);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2.has(C3464k.f2686d)) {
                    jSONObject.put(C3464k.f2686d, jSONObject2.opt(C3464k.f2686d));
                }
                if (jSONObject2.has(C3464k.f2685c)) {
                    jSONObject.put(C3464k.f2685c, jSONObject2.opt(C3464k.f2685c));
                }
                if (jSONObject2.has(C3464k.f2684b)) {
                    jSONObject.put(C3464k.f2684b, jSONObject2.opt(C3464k.f2684b));
                }
            } catch (Exception unused) {
            }
        }
    }
}
