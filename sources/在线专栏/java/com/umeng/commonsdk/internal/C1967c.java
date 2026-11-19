package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C1853ak;
import com.umeng.analytics.pro.C1854al;
import com.umeng.analytics.pro.C1855am;
import com.umeng.analytics.pro.C1913n;
import com.umeng.analytics.pro.C1925z;
import com.umeng.commonsdk.C1947a;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C1989b;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.C2004i;
import com.umeng.commonsdk.utils.C2026b;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.c */
/* loaded from: classes.dex */
public class C1967c implements UMLogDataProtocol {

    /* renamed from: b */
    private static int f9197b = 1;

    /* renamed from: c */
    private static final String f9198c = "info";

    /* renamed from: d */
    private static final String f9199d = "stat";

    /* renamed from: e */
    private static Class<?> f9200e = null;

    /* renamed from: f */
    private static Method f9201f = null;

    /* renamed from: g */
    private static Method f9202g = null;

    /* renamed from: h */
    private static Method f9203h = null;

    /* renamed from: i */
    private static boolean f9204i = false;

    /* renamed from: a */
    private Context f9205a;

    static {
        m7400c();
    }

    public C1967c(Context context) {
        if (context != null) {
            this.f9205a = context.getApplicationContext();
        }
    }

    /* renamed from: b */
    public static String m7398b() {
        Method method;
        Class<?> cls = f9200e;
        if (cls == null || (method = f9201f) == null || f9203h == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) f9203h.invoke(objInvoke, new Object[0]) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    private static void m7400c() {
        try {
            f9200e = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod != null) {
                f9201f = declaredMethod;
            }
            Method declaredMethod2 = f9200e.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f9202g = declaredMethod2;
            }
            Method declaredMethod3 = f9200e.getDeclaredMethod("getSDKVersion", new Class[0]);
            if (declaredMethod3 != null) {
                f9203h = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private void m7402d() {
        C1853ak c1853akM6847a = C1853ak.m6847a(this.f9205a);
        C1854al c1854alM6852a = c1853akM6847a.m6852a(C1855am.f8397c);
        if (c1854alM6852a != null) {
            UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = c1854alM6852a.f8389a;
                String str2 = c1854alM6852a.f8390b;
                JSONObject jSONObjectM7559a = new C1989b().m7559a(this.f9205a.getApplicationContext(), new JSONObject(c1854alM6852a.f8391c), new JSONObject(c1854alM6852a.f8392d), c1854alM6852a.f8393e, str2, c1854alM6852a.f8394f);
                if (jSONObjectM7559a == null || !jSONObjectM7559a.has("exception")) {
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                } else {
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                }
                c1853akM6847a.m6854a(C1855am.f8397c, str);
                c1853akM6847a.m6856b();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    private void m7404e() {
        if (f9204i) {
            if (FieldManager.allow(C2026b.f9564G)) {
                return;
            }
            f9204i = false;
        } else {
            if (!FieldManager.allow(C2026b.f9564G) || Build.VERSION.SDK_INT <= 28) {
                return;
            }
            f9204i = true;
            m7397a(this.f9205a, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                    if (TextUtils.isEmpty(str)) {
                        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = C1967c.this.f9205a.getSharedPreferences(C2004i.f9415a, 0);
                        if (sharedPreferences != null) {
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(C2004i.f9416b, str);
                            editorEdit.commit();
                        }
                    } catch (Throwable unused) {
                    }
                    UMWorkDispatch.sendEvent(C1967c.this.f9205a, C1965a.f9190w, C1966b.m7392a(C1967c.this.f9205a).m7393a(), null);
                }
            });
        }
    }

    /* renamed from: f */
    private void m7406f() {
        if (!FieldManager.allow(C2026b.f9564G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        f9204i = true;
        UMConfigureImpl.registerInterruptFlag();
        UMConfigureImpl.init(this.f9205a);
        f9197b++;
        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
        UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
            @Override // com.umeng.commonsdk.utils.onMessageSendListener
            public void onMessageSend() {
                if (C1967c.this.f9205a != null) {
                    UMWorkDispatch.sendEvent(C1967c.this.f9205a, C1965a.f9191x, C1966b.m7392a(C1967c.this.f9205a).m7393a(), null);
                }
                UMConfigureImpl.removeMessageSendListener(this);
            }
        });
        m7399b(this.f9205a);
    }

    /* renamed from: g */
    private void m7407g() {
        if (f9197b <= 0) {
            m7408h();
            m7403d(this.f9205a);
        }
    }

    /* renamed from: h */
    private void m7408h() {
        UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f9205a)) {
            m7405e(this.f9205a);
            C1947a.m7327a(this.f9205a);
            Context context = this.f9205a;
            UMWorkDispatch.sendEvent(context, C1913n.a.f8882x, CoreProtocol.getInstance(context), null);
            Context context2 = this.f9205a;
            UMWorkDispatch.sendEvent(context2, C1965a.f9187t, C1966b.m7392a(context2).m7393a(), null);
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j4) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void workEvent(java.lang.Object r9, int r10) throws org.json.JSONException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.C1967c.workEvent(java.lang.Object, int):void");
    }

    /* renamed from: a */
    public String m7409a() {
        Method method;
        Class<?> cls = f9200e;
        if (cls == null || (method = f9201f) == null || f9202g == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, new Object[0]);
            return objInvoke != null ? (String) f9202g.invoke(objInvoke, this.f9205a) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static void m7399b(final Context context) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C2004i.f9415a, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strM7284a = C1925z.m7284a(context);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(strM7284a) && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(C2004i.f9417c, (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                        editorEdit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(C2004i.f9416b, strM7284a);
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
    private void m7396a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appkey", UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put("app_version", UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put("os", "Android");
            JSONObject jSONObjectBuildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (jSONObjectBuildZeroEnvelopeWithExtHeader != null && jSONObjectBuildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m7401c(final Context context) {
        if (!FieldManager.allow(C2026b.f9564G) || Build.VERSION.SDK_INT <= 28) {
            return;
        }
        m7397a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
            @Override // com.umeng.commonsdk.listener.OnGetOaidListener
            public void onGetOaid(String str) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C2004i.f9415a, 0);
                    if (sharedPreferences == null || sharedPreferences.getString(C2004i.f9416b, "").equalsIgnoreCase(str)) {
                        return;
                    }
                    UMRTLog.m7355e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(C2004i.f9416b, str);
                    editorEdit.commit();
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: e */
    private static void m7405e(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + File.separator + C1855am.f8406l);
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m7397a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String strM7284a = C1925z.m7284a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(strM7284a);
                }
            }
        }).start();
    }

    /* renamed from: a */
    private static Class<?> m7395a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private void m7403d(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class<?> clsM7395a = m7395a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsM7395a.getDeclaredMethod("getInstance", new Class[0]);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(clsM7395a, new Object[0])) == null || (declaredMethod = clsM7395a.getDeclaredMethod("init", Context.class, String.class, m7395a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }
}
