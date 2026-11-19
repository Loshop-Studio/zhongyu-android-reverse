package com.efs.sdk.base.p020a.p023c.p024a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p027e.C2928f;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.p032a.C2944a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.c.a.c */
/* loaded from: classes2.dex */
public final class C2916c implements Handler.Callback {

    /* renamed from: a */
    public static final Random f1062a = new Random();

    /* renamed from: b */
    public IConfigRefreshAction f1063b;

    /* renamed from: c */
    public boolean f1064c;

    /* renamed from: d */
    public C2915b f1065d;

    /* renamed from: e */
    public Map<IConfigCallback, String[]> f1066e;

    /* renamed from: f */
    private Handler f1067f;

    /* renamed from: g */
    private SharedPreferencesOnSharedPreferenceChangeListenerC2918e f1068g;

    /* renamed from: h */
    private long f1069h;

    /* renamed from: com.efs.sdk.base.a.c.a.c$a */
    public static class a {

        /* renamed from: a */
        private static final C2916c f1071a = new C2916c(0);
    }

    public /* synthetic */ C2916c(byte b4) {
        this();
    }

    /* renamed from: e */
    private void m2101e() {
        if (!C2928f.a.f1111a.m2148a()) {
            C2957d.m2212a("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.f1064c) {
            C2957d.m2212a("efs.config", "disable refresh config from remote");
            return;
        }
        String strRefresh = m2103g().refresh();
        C2957d.m2212a("efs.config", "efs config is ".concat(String.valueOf(strRefresh)));
        if (TextUtils.isEmpty(strRefresh)) {
            return;
        }
        m2108a(strRefresh);
    }

    /* renamed from: f */
    private void m2102f() {
        boolean zM2121a;
        try {
            zM2121a = this.f1068g.m2121a(this.f1065d);
        } catch (Throwable unused) {
            zM2121a = false;
        }
        if (zM2121a) {
            return;
        }
        this.f1067f.sendEmptyMessageDelayed(3, 3000L);
    }

    @NonNull
    /* renamed from: g */
    private IConfigRefreshAction m2103g() {
        IConfigRefreshAction iConfigRefreshAction = this.f1063b;
        return iConfigRefreshAction == null ? C2914a.m2093a() : iConfigRefreshAction;
    }

    /* renamed from: h */
    private boolean m2104h() {
        SharedPreferencesOnSharedPreferenceChangeListenerC2918e.m2119b();
        long j4 = 0;
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC2918e sharedPreferencesOnSharedPreferenceChangeListenerC2918e = this.f1068g;
            sharedPreferencesOnSharedPreferenceChangeListenerC2918e.m2122c();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC2918e.f1073a != null) {
                j4 = sharedPreferencesOnSharedPreferenceChangeListenerC2918e.f1073a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        return System.currentTimeMillis() - j4 >= 28800000;
    }

    /* renamed from: i */
    private void m2105i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : C2921a.f1078a.m2090a(1)) {
                Message messageObtain = Message.obtain(null, 1, new JSONObject(this.f1065d.f1060e).toString());
                Message messageObtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(messageObtain, messageObtain2));
                messageObtain.recycle();
                messageObtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = C2921a.f1078a.f1052o.iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            C2957d.m2214b("efs.base", "efs.config", th);
        }
    }

    /* renamed from: c */
    public final Map<String, String> m2110c() {
        return new HashMap(this.f1065d.f1060e);
    }

    /* renamed from: d */
    public final void m2111d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.a.c.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : C2916c.this.f1066e.keySet()) {
                        String[] strArr = (String[]) C2916c.this.f1066e.get(iConfigCallback);
                        HashMap map = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (C2916c.this.f1065d.f1060e.containsKey(str)) {
                                    map.put(str, C2916c.this.m2110c().get(str));
                                    C2957d.m2212a("efs.config", "--->>> configCallback key is " + str + " ## value is " + C2916c.this.m2110c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(map);
                    }
                    C2916c.this.f1066e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        C2915b c2915b;
        int i4 = message.what;
        if (i4 == 0) {
            boolean zM2118a = SharedPreferencesOnSharedPreferenceChangeListenerC2918e.m2118a();
            C2957d.m2212a("efs.config", "--->>> 删除旧的配置文件 ".concat(String.valueOf(zM2118a)));
            if (zM2118a) {
                this.f1067f.sendEmptyMessage(1);
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC2918e sharedPreferencesOnSharedPreferenceChangeListenerC2918e = this.f1068g;
                sharedPreferencesOnSharedPreferenceChangeListenerC2918e.m2122c();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC2918e.f1073a == null) {
                    c2915b = null;
                } else {
                    C2915b c2915bM2095a = C2915b.m2095a();
                    c2915bM2095a.f1056a = sharedPreferencesOnSharedPreferenceChangeListenerC2918e.f1073a.getInt("cver", -1);
                    Set<String> setKeySet = sharedPreferencesOnSharedPreferenceChangeListenerC2918e.f1073a.getAll().keySet();
                    HashMap map = new HashMap();
                    for (String str : setKeySet) {
                        String string = sharedPreferencesOnSharedPreferenceChangeListenerC2918e.f1073a.getString(str, "");
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str, string);
                        }
                    }
                    c2915bM2095a.m2096a(map);
                    c2915b = c2915bM2095a;
                }
                if (c2915b == null) {
                    C2957d.m2212a("efs.config", "--->>> 首次启动本地无配置或加载失败 ");
                } else if (m2099a(c2915b)) {
                    C2957d.m2212a("efs.config", "--->>> 一致 ");
                } else {
                    this.f1065d = c2915b;
                    String str2 = "load config from storage";
                    if (-1 != c2915b.f1056a) {
                        m2105i();
                        m2111d();
                        str2 = "load config from storage and notify observer";
                    }
                    C2957d.m2212a("efs.config", str2);
                }
            }
        } else if (i4 == 1) {
            int i5 = message.arg1;
            if (i5 <= this.f1065d.f1056a) {
                C2957d.m2212a("efs.config", "current config version is " + i5 + ", no need to refresh");
                C2957d.m2212a("efs.config", "current config version(" + this.f1065d.f1056a + ") is " + i5 + ", no need to refresh");
            } else {
                m2101e();
            }
        } else if (i4 != 2) {
            if (i4 == 3) {
                m2102f();
            }
        } else if (C2928f.a.f1111a.m2148a()) {
            if (m2104h()) {
                m2101e();
            } else {
                C2957d.m2212a("efs.config", "No update is required, less than 8h since the last update");
            }
        }
        return true;
    }

    private C2916c() {
        this.f1064c = true;
        this.f1066e = new HashMap();
        this.f1067f = new Handler(C2944a.f1135a.getLooper(), this);
        this.f1068g = new SharedPreferencesOnSharedPreferenceChangeListenerC2918e();
        this.f1065d = C2915b.m2095a();
        this.f1069h = C2921a.f1078a.f1047j;
    }

    /* renamed from: a */
    public static C2916c m2097a() {
        return a.f1071a;
    }

    /* renamed from: b */
    public final void m2109b() {
        this.f1067f.sendEmptyMessage(0);
        this.f1067f.sendEmptyMessageDelayed(2, this.f1069h);
    }

    /* renamed from: a */
    public final void m2107a(int i4) {
        if (i4 <= this.f1065d.f1056a) {
            C2957d.m2212a("efs.config", "current config version is " + i4 + ", no need to refresh");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i4;
        messageObtain.what = 1;
        this.f1067f.sendMessage(messageObtain);
    }

    /* renamed from: a */
    public final String m2106a(boolean z3) {
        if (z3) {
            return "https://" + this.f1065d.f1058c;
        }
        return this.f1065d.f1057b + this.f1065d.f1058c;
    }

    /* renamed from: a */
    public final void m2108a(String str) {
        C2915b c2915bM2095a = C2915b.m2095a();
        if (C2917d.m2116a(str, c2915bM2095a)) {
            if (m2099a(c2915bM2095a)) {
                return;
            }
            this.f1065d = c2915bM2095a;
            m2102f();
            m2105i();
            m2111d();
            return;
        }
        this.f1067f.sendEmptyMessageDelayed(1, 3000L);
    }

    /* renamed from: a */
    private boolean m2099a(C2915b c2915b) {
        if (this.f1065d.f1056a >= c2915b.f1056a) {
            return true;
        }
        C2957d.m2212a("efs.config", "current config version (" + this.f1065d.f1056a + ") is older than another (" + c2915b.f1056a + ")");
        return false;
    }
}
