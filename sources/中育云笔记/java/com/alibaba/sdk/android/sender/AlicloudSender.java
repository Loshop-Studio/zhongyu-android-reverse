package com.alibaba.sdk.android.sender;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.sdk.android.logger.ILog;
import com.alibaba.sdk.android.tbrest.SendService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.UTMini;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AlicloudSender {

    /* renamed from: a */
    private static final String f4444a = null;

    /* renamed from: c */
    private static Map<String, SdkInfo> f4446c;

    /* renamed from: d */
    private static Map<String, C5694a> f4447d;

    /* renamed from: g */
    private static SendService f4450g;

    /* renamed from: b */
    private static final ExecutorService f4445b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: e */
    private static final AtomicBoolean f4448e = new AtomicBoolean(false);

    /* renamed from: f */
    private static final AtomicBoolean f4449f = new AtomicBoolean(false);

    /* renamed from: h */
    private static final ILog f4451h = SenderLog.getLogger(AlicloudSender.class);

    /* renamed from: i */
    private static boolean f4452i = false;

    /* renamed from: j */
    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat f4453j = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: com.alibaba.sdk.android.sender.AlicloudSender$a */
    public static class C5694a {

        /* renamed from: a */
        private int f4457a;

        /* renamed from: b */
        private String f4458b;

        /* renamed from: c */
        private String f4459c;

        private C5694a() {
            this.f4457a = -1;
            this.f4458b = "";
            this.f4459c = "";
        }
    }

    public static void asyncSend(Application application, SdkInfo sdkInfo) {
        if (application == null) {
            f4451h.mo3533d("asyncSend failed. application is null. ");
            return;
        }
        if (sdkInfo == null) {
            f4451h.mo3533d("asyncSend failed. sdk info is null. ");
            return;
        }
        String strM3845a = sdkInfo.m3845a();
        if (TextUtils.isEmpty(strM3845a)) {
            f4451h.mo3533d("asyncSend failed. sdk id is empty. ");
            return;
        }
        if (TextUtils.isEmpty(sdkInfo.m3846b())) {
            f4451h.mo3533d("asyncSend failed. sdk version is empty. ");
            return;
        }
        m3831a(application.getApplicationContext());
        m3830a(application);
        f4446c.put(strM3845a, sdkInfo);
        m3836b(application.getApplicationContext(), sdkInfo);
    }

    /* renamed from: b */
    private static String m3835b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Map<String, C5694a> m3838c(Context context) throws JSONException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String string = context.getSharedPreferences("sp_emas_info", 0).getString("emas_sdk_info", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string2 = jSONObject.getString(AgooConstants.MESSAGE_ID);
                        C5694a c5694a = new C5694a();
                        c5694a.f4458b = jSONObject.getString("time");
                        c5694a.f4457a = jSONObject.getInt("statu");
                        c5694a.f4459c = jSONObject.getString("version");
                        concurrentHashMap.put(string2, c5694a);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return concurrentHashMap;
    }

    public static void openHttp() {
        f4452i = true;
    }

    /* renamed from: a */
    private static void m3830a(Application application) {
        if (f4449f.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.alibaba.sdk.android.sender.AlicloudSender.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    if (AlicloudSender.f4446c == null || AlicloudSender.f4446c.isEmpty()) {
                        return;
                    }
                    Iterator it = AlicloudSender.f4446c.values().iterator();
                    while (it.hasNext()) {
                        AlicloudSender.m3836b(activity.getApplicationContext(), (SdkInfo) it.next());
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                }
            });
        }
    }

    @Deprecated
    public static void asyncSend(Context context, SdkInfo sdkInfo) {
        if (context == null) {
            f4451h.mo3533d("asyncSend failed. context is null. ");
            return;
        }
        if (sdkInfo == null) {
            f4451h.mo3533d("asyncSend failed. sdk info is null. ");
            return;
        }
        String strM3845a = sdkInfo.m3845a();
        if (TextUtils.isEmpty(strM3845a)) {
            f4451h.mo3533d("asyncSend failed. sdk id is empty. ");
        } else {
            if (TextUtils.isEmpty(sdkInfo.m3846b())) {
                f4451h.mo3533d("asyncSend failed. sdk version is empty. ");
                return;
            }
            m3831a(context.getApplicationContext());
            f4446c.put(strM3845a, sdkInfo);
            m3836b(context.getApplicationContext(), sdkInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m3836b(final Context context, final SdkInfo sdkInfo) {
        final String str = f4453j.format(new Date(System.currentTimeMillis()));
        try {
            C5694a c5694a = f4447d.get(sdkInfo.m3845a());
            if (c5694a == null || !TextUtils.equals(str, c5694a.f4458b) || !TextUtils.equals(sdkInfo.m3846b(), c5694a.f4459c) || c5694a.f4457a != 0) {
                f4445b.execute(new Runnable() { // from class: com.alibaba.sdk.android.sender.AlicloudSender.2
                    @Override // java.lang.Runnable
                    public void run() throws JSONException {
                        AlicloudSender.m3837b(context, sdkInfo, str);
                    }
                });
                return;
            }
            f4451h.mo3533d(sdkInfo.m3845a() + " " + sdkInfo.m3846b() + " send abort send. ");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m3831a(Context context) {
        if (f4448e.compareAndSet(false, true)) {
            f4446c = new ConcurrentHashMap();
            f4447d = m3838c(context);
            SendService sendService = new SendService();
            f4450g = sendService;
            sendService.openHttp = Boolean.valueOf(f4452i);
            f4450g.init(context, "24527540@android", "24527540", m3835b(context), null, null);
            f4450g.appSecret = "56fc10fbe8c6ae7d0d895f49c4fb6838";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m3837b(Context context, SdkInfo sdkInfo, String str) throws JSONException {
        C5694a c5694a = f4447d.get(sdkInfo.m3845a());
        if (c5694a == null) {
            c5694a = new C5694a();
            f4447d.put(sdkInfo.m3845a(), c5694a);
        }
        HashMap map = new HashMap();
        map.put("sdkId", sdkInfo.m3845a());
        map.put(Constants.KEY_PACKAGE_NAME, context.getPackageName());
        map.put(Constants.KEY_SDK_VERSION, sdkInfo.m3846b());
        map.put("kVersion", "1.1.4");
        if (!TextUtils.isEmpty(sdkInfo.m3847c())) {
            map.put(Constants.KEY_APP_KEY, sdkInfo.m3847c());
        }
        Map<String, String> map2 = sdkInfo.f4461a;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put("_aliyun_biz_id", "emas-active");
        ILog iLog = f4451h;
        iLog.mo3533d(sdkInfo.m3845a() + " " + sdkInfo.m3846b() + " start send. ");
        boolean zBooleanValue = f4450g.sendRequest("adash-emas.cn-hangzhou.aliyuncs.com", System.currentTimeMillis(), f4444a, UTMini.EVENT_ID_AGOO, sdkInfo.m3845a() + "_biz_active", null, null, map).booleanValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sdkInfo.m3845a());
        sb2.append(" ");
        sb2.append(sdkInfo.m3846b());
        sb2.append(" send ");
        sb2.append(zBooleanValue ? "success. " : "failed. ");
        iLog.mo3533d(sb2.toString());
        c5694a.f4458b = str;
        c5694a.f4459c = sdkInfo.m3846b();
        c5694a.f4457a = zBooleanValue ? 0 : -1;
        m3834a(context, f4447d);
    }

    /* renamed from: a */
    private static void m3834a(Context context, Map<String, C5694a> map) throws JSONException {
        SharedPreferences.Editor editorRemove;
        if (map == null || map.isEmpty()) {
            editorRemove = context.getSharedPreferences("sp_emas_info", 0).edit().remove("emas_sdk_info");
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                C5694a c5694a = map.get(str);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AgooConstants.MESSAGE_ID, str);
                    jSONObject.put("version", c5694a.f4459c);
                    jSONObject.put("time", c5694a.f4458b);
                    jSONObject.put("statu", c5694a.f4457a);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
            editorRemove = context.getSharedPreferences("sp_emas_info", 0).edit().putString("emas_sdk_info", jSONArray.toString());
        }
        editorRemove.apply();
    }
}
