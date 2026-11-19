package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3335ai;
import com.umeng.analytics.pro.C3337ak;
import com.umeng.analytics.pro.C3338al;
import com.umeng.analytics.pro.C3339am;
import com.umeng.analytics.pro.C3397n;
import com.umeng.analytics.pro.C3409z;
import com.umeng.commonsdk.C3431a;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C3473b;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.C3488i;
import com.umeng.commonsdk.utils.C3510b;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.c */
/* loaded from: classes2.dex */
public class C3451c implements UMLogDataProtocol {

    /* renamed from: b */
    private static int f2605b = 1;

    /* renamed from: c */
    private static final String f2606c = "info";

    /* renamed from: d */
    private static final String f2607d = "stat";

    /* renamed from: e */
    private static Class<?> f2608e = null;

    /* renamed from: f */
    private static Method f2609f = null;

    /* renamed from: g */
    private static Method f2610g = null;

    /* renamed from: h */
    private static Method f2611h = null;

    /* renamed from: i */
    private static boolean f2612i = false;

    /* renamed from: a */
    private Context f2613a;

    static {
        m3477c();
    }

    public C3451c(Context context) {
        if (context != null) {
            this.f2613a = context.getApplicationContext();
        }
    }

    /* renamed from: b */
    public static String m3475b() {
        Method method;
        Class<?> cls = f2608e;
        if (cls == null || (method = f2609f) == null || f2611h == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) f2611h.invoke(objInvoke, new Object[0]) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private static void m3477c() {
        try {
            f2608e = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f2609f = declaredMethod;
            }
            Method declaredMethod2 = f2608e.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f2610g = declaredMethod2;
            }
            Method declaredMethod3 = f2608e.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f2611h = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m3479d() {
        C3337ak c3337akM2924a = C3337ak.m2924a(this.f2613a);
        C3338al c3338alM2929a = c3337akM2924a.m2929a(C3339am.f1805c);
        if (c3338alM2929a != null) {
            UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = c3338alM2929a.f1797a;
                String str2 = c3338alM2929a.f1798b;
                JSONObject jSONObjectM3636a = new C3473b().m3636a(this.f2613a.getApplicationContext(), new JSONObject(c3338alM2929a.f1799c), new JSONObject(c3338alM2929a.f1800d), c3338alM2929a.f1801e, str2, c3338alM2929a.f1802f);
                if (jSONObjectM3636a == null || !jSONObjectM3636a.has("exception")) {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                c3337akM2924a.m2931a(C3339am.f1805c, str);
                c3337akM2924a.m2933b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    private void m3481e() {
        if (f2612i) {
            if (FieldManager.allow(C3510b.f2972G)) {
                return;
            }
            f2612i = false;
        } else {
            if (!FieldManager.allow(C3510b.f2972G) || Build.VERSION.SDK_INT <= 28) {
                return;
            }
            f2612i = true;
            m3474a(this.f2613a, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                    if (TextUtils.isEmpty(str)) {
                        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = C3451c.this.f2613a.getSharedPreferences(C3488i.f2823a, 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(C3488i.f2824b, str);
                            editorEdit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                    UMWorkDispatch.sendEvent(C3451c.this.f2613a, C3449a.f2598w, C3450b.m3469a(C3451c.this.f2613a).m3470a(), null);
                }
            });
        }
    }

    /* renamed from: f */
    private void m3483f() {
        if (!FieldManager.allow(C3510b.f2972G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        f2612i = true;
        UMConfigureImpl.registerInterruptFlag();
        UMConfigureImpl.init(this.f2613a);
        f2605b++;
        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
        UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
            @Override // com.umeng.commonsdk.utils.onMessageSendListener
            public void onMessageSend() {
                if (C3451c.this.f2613a != null) {
                    UMWorkDispatch.sendEvent(C3451c.this.f2613a, C3449a.f2599x, C3450b.m3469a(C3451c.this.f2613a).m3470a(), null);
                }
                UMConfigureImpl.removeMessageSendListener(this);
            }
        });
        m3476b(this.f2613a);
    }

    /* renamed from: g */
    private void m3484g() {
        if (f2605b <= 0) {
            m3485h();
            m3480d(this.f2613a);
        }
    }

    /* renamed from: h */
    private void m3485h() {
        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f2613a)) {
            m3482e(this.f2613a);
            C3431a.m3404a(this.f2613a);
            Context context = this.f2613a;
            UMWorkDispatch.sendEvent(context, C3397n.a.f2290x, CoreProtocol.getInstance(context), null);
            Context context2 = this.f2613a;
            UMWorkDispatch.sendEvent(context2, C3449a.f2595t, C3450b.m3469a(context2).m3470a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j4) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r10, int r11) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.C3451c.workEvent(java.lang.Object, int):void");
    }

    /* renamed from: a */
    public String m3486a() {
        Method method;
        Class<?> cls = f2608e;
        if (cls == null || (method = f2609f) == null || f2610g == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) f2610g.invoke(objInvoke, this.f2613a) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static void m3476b(final Context context) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C3488i.f2823a, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strM3361a = C3409z.m3361a(context);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(strM3361a) && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(C3488i.f2825c, (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                        editorEdit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(C3488i.f2824b, strM3361a);
                        editorEdit2.commit();
                    }
                    if (Build.VERSION.SDK_INT > 28) {
                        UMConfigureImpl.removeInterruptFlag();
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* renamed from: a */
    private void m3473a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put("app_version", UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(C3335ai.f1744x, AnalyticsConstants.SDK_TYPE);
            JSONObject jSONObjectBuildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (jSONObjectBuildZeroEnvelopeWithExtHeader != null && jSONObjectBuildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m3478c(final Context context) {
        if (!FieldManager.allow(C3510b.f2972G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        m3474a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
            @Override // com.umeng.commonsdk.listener.OnGetOaidListener
            public void onGetOaid(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C3488i.f2823a, 0);
                    if (sharedPreferences == null || sharedPreferences.getString(C3488i.f2824b, "").equalsIgnoreCase(str)) {
                        return;
                    }
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(C3488i.f2824b, str);
                    editorEdit.commit();
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: e */
    private static void m3482e(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + C3339am.f1814l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m3474a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String strM3361a = C3409z.m3361a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(strM3361a);
                }
            }
        }).start();
    }

    /* renamed from: a */
    private static Class<?> m3472a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private void m3480d(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> clsM3472a = m3472a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsM3472a.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(clsM3472a, new Object[0])) == null || (declaredMethod = clsM3472a.getDeclaredMethod("init", Context.class, String.class, m3472a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }
}
