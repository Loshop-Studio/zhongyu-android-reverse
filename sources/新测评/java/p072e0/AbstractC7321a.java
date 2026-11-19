package p072e0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p061d0.InterfaceC7277b;
import p083f0.C7422a;

/* renamed from: e0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7321a {

    /* renamed from: a */
    public static final String f11847a = null;

    /* renamed from: c */
    public static Map f11849c;

    /* renamed from: d */
    public static Map f11850d;

    /* renamed from: g */
    public static C7422a f11853g;

    /* renamed from: b */
    public static final ExecutorService f11848b = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: e */
    public static final AtomicBoolean f11851e = new AtomicBoolean(false);

    /* renamed from: f */
    public static final AtomicBoolean f11852f = new AtomicBoolean(false);

    /* renamed from: h */
    public static final InterfaceC7277b f11854h = AbstractC7323c.m11642a(AbstractC7321a.class);

    /* renamed from: i */
    public static boolean f11855i = false;

    /* renamed from: j */
    public static final SimpleDateFormat f11856j = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: e0.a$b */
    public static class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f11857a;

        /* renamed from: b */
        public final /* synthetic */ C7322b f11858b;

        /* renamed from: c */
        public final /* synthetic */ String f11859c;

        public b(Context context, C7322b c7322b, String str) {
            this.f11857a = context;
            this.f11858b = c7322b;
            this.f11859c = str;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            AbstractC7321a.m11628j(this.f11857a, this.f11858b, this.f11859c);
        }
    }

    /* renamed from: e0.a$c */
    public static class c {

        /* renamed from: a */
        public int f11860a;

        /* renamed from: b */
        public String f11861b;

        /* renamed from: c */
        public String f11862c;

        public c() {
            this.f11860a = -1;
            this.f11861b = "";
            this.f11862c = "";
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* renamed from: b */
    public static void m11620b(Application application) {
        if (f11852f.compareAndSet(false, true)) {
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* renamed from: c */
    public static void m11621c(Context context) {
        if (f11851e.compareAndSet(false, true)) {
            f11849c = new ConcurrentHashMap();
            f11850d = m11629k(context);
            C7422a c7422a = new C7422a();
            f11853g = c7422a;
            c7422a.f12125i = Boolean.valueOf(f11855i);
            f11853g.m11951b(context, "24527540@android", "24527540", m11626h(context), null, null);
            f11853g.f12120d = "56fc10fbe8c6ae7d0d895f49c4fb6838";
        }
    }

    /* renamed from: f */
    public static void m11624f(Context context, Map map) throws JSONException {
        SharedPreferences.Editor editorRemove;
        if (map == null || map.isEmpty()) {
            editorRemove = context.getSharedPreferences("sp_emas_info", 0).edit().remove("emas_sdk_info");
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str : map.keySet()) {
                c cVar = (c) map.get(str);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    jSONObject.put("version", cVar.f11862c);
                    jSONObject.put("time", cVar.f11861b);
                    jSONObject.put("statu", cVar.f11860a);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
            editorRemove = context.getSharedPreferences("sp_emas_info", 0).edit().putString("emas_sdk_info", jSONArray.toString());
        }
        editorRemove.apply();
    }

    /* renamed from: g */
    public static void m11625g(Application application, C7322b c7322b) {
        if (application == null) {
            f11854h.mo11529a("asyncSend failed. application is null. ");
            return;
        }
        if (c7322b == null) {
            f11854h.mo11529a("asyncSend failed. sdk info is null. ");
            return;
        }
        String strM11636a = c7322b.m11636a();
        if (TextUtils.isEmpty(strM11636a)) {
            f11854h.mo11529a("asyncSend failed. sdk id is empty. ");
            return;
        }
        if (TextUtils.isEmpty(c7322b.m11637b())) {
            f11854h.mo11529a("asyncSend failed. sdk version is empty. ");
            return;
        }
        m11621c(application.getApplicationContext());
        m11620b(application);
        f11849c.put(strM11636a, c7322b);
        m11627i(application.getApplicationContext(), c7322b);
    }

    /* renamed from: h */
    public static String m11626h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static void m11627i(Context context, C7322b c7322b) {
        String str = f11856j.format(new Date(System.currentTimeMillis()));
        try {
            c cVar = (c) f11850d.get(c7322b.m11636a());
            if (cVar == null || !TextUtils.equals(str, cVar.f11861b) || !TextUtils.equals(c7322b.m11637b(), cVar.f11862c) || cVar.f11860a != 0) {
                f11848b.execute(new b(context, c7322b, str));
                return;
            }
            f11854h.mo11529a(c7322b.m11636a() + " " + c7322b.m11637b() + " send abort send. ");
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static void m11628j(Context context, C7322b c7322b, String str) throws JSONException {
        c cVar = (c) f11850d.get(c7322b.m11636a());
        if (cVar == null) {
            cVar = new c(null);
            f11850d.put(c7322b.m11636a(), cVar);
        }
        HashMap map = new HashMap();
        map.put("sdkId", c7322b.m11636a());
        map.put("packageName", context.getPackageName());
        map.put("sdkVersion", c7322b.m11637b());
        map.put("kVersion", "1.1.4");
        if (!TextUtils.isEmpty(c7322b.m11638c())) {
            map.put("appKey", c7322b.m11638c());
        }
        Map map2 = c7322b.f11866d;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put("_aliyun_biz_id", "emas-active");
        InterfaceC7277b interfaceC7277b = f11854h;
        interfaceC7277b.mo11529a(c7322b.m11636a() + " " + c7322b.m11637b() + " start send. ");
        boolean zBooleanValue = f11853g.m11952c("adash-emas.cn-hangzhou.aliyuncs.com", System.currentTimeMillis(), f11847a, 19999, c7322b.m11636a() + "_biz_active", null, null, map).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(c7322b.m11636a());
        sb.append(" ");
        sb.append(c7322b.m11637b());
        sb.append(" send ");
        sb.append(zBooleanValue ? "success. " : "failed. ");
        interfaceC7277b.mo11529a(sb.toString());
        cVar.f11861b = str;
        cVar.f11862c = c7322b.m11637b();
        cVar.f11860a = zBooleanValue ? 0 : -1;
        m11624f(context, f11850d);
    }

    /* renamed from: k */
    public static Map m11629k(Context context) throws JSONException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String string = context.getSharedPreferences("sp_emas_info", 0).getString("emas_sdk_info", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string2 = jSONObject.getString("id");
                        c cVar = new c(null);
                        cVar.f11861b = jSONObject.getString("time");
                        cVar.f11860a = jSONObject.getInt("statu");
                        cVar.f11862c = jSONObject.getString("version");
                        concurrentHashMap.put(string2, cVar);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: e0.a$a */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (AbstractC7321a.f11849c == null || AbstractC7321a.f11849c.isEmpty()) {
                return;
            }
            Iterator it = AbstractC7321a.f11849c.values().iterator();
            while (it.hasNext()) {
                AbstractC7321a.m11627i(activity.getApplicationContext(), (C7322b) it.next());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
