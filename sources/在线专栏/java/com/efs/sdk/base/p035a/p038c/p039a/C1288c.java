package com.efs.sdk.base.p035a.p038c.p039a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p042e.C1300f;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.p047a.C1316a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.c.a.c */
/* loaded from: classes.dex */
public final class C1288c implements Handler.Callback {

    /* renamed from: a */
    public static final Random f7032a = new Random();

    /* renamed from: b */
    public IConfigRefreshAction f7033b;

    /* renamed from: c */
    public boolean f7034c;

    /* renamed from: d */
    public C1287b f7035d;

    /* renamed from: e */
    public Map<IConfigCallback, String[]> f7036e;

    /* renamed from: f */
    private Handler f7037f;

    /* renamed from: g */
    private SharedPreferencesOnSharedPreferenceChangeListenerC1290e f7038g;

    /* renamed from: h */
    private long f7039h;

    /* renamed from: com.efs.sdk.base.a.c.a.c$a */
    static class a {

        /* renamed from: a */
        private static final C1288c f7041a = new C1288c(0);
    }

    /* synthetic */ C1288c(byte b4) {
        this();
    }

    /* renamed from: e */
    private void m5460e() {
        if (!C1300f.a.f7081a.m5507a()) {
            C1329d.m5571a("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.f7034c) {
            C1329d.m5571a("efs.config", "disable refresh config from remote");
            return;
        }
        String strRefresh = m5462g().refresh();
        C1329d.m5571a("efs.config", "efs config is ".concat(String.valueOf(strRefresh)));
        if (TextUtils.isEmpty(strRefresh)) {
            return;
        }
        m5467a(strRefresh);
    }

    /* renamed from: f */
    private void m5461f() {
        boolean zM5480a;
        try {
            zM5480a = this.f7038g.m5480a(this.f7035d);
        } catch (Throwable unused) {
            zM5480a = false;
        }
        if (zM5480a) {
            return;
        }
        this.f7037f.sendEmptyMessageDelayed(3, 3000L);
    }

    /* renamed from: g */
    private IConfigRefreshAction m5462g() {
        IConfigRefreshAction iConfigRefreshAction = this.f7033b;
        return iConfigRefreshAction == null ? C1286a.m5452a() : iConfigRefreshAction;
    }

    /* renamed from: h */
    private boolean m5463h() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1290e.m5478b();
        long j4 = 0;
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC1290e sharedPreferencesOnSharedPreferenceChangeListenerC1290e = this.f7038g;
            sharedPreferencesOnSharedPreferenceChangeListenerC1290e.m5481c();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1290e.f7043a != null) {
                j4 = sharedPreferencesOnSharedPreferenceChangeListenerC1290e.f7043a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        return System.currentTimeMillis() - j4 >= 28800000;
    }

    /* renamed from: i */
    private void m5464i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : C1293a.f7048a.m5449a(1)) {
                Message messageObtain = Message.obtain(null, 1, new JSONObject(this.f7035d.f7030e).toString());
                Message messageObtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(messageObtain, messageObtain2));
                messageObtain.recycle();
                messageObtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = C1293a.f7048a.f7022o.iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            C1329d.m5573b("efs.base", "efs.config", th);
        }
    }

    /* renamed from: c */
    public final Map<String, String> m5469c() {
        return new HashMap(this.f7035d.f7030e);
    }

    /* renamed from: d */
    public final void m5470d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.a.c.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : C1288c.this.f7036e.keySet()) {
                        String[] strArr = (String[]) C1288c.this.f7036e.get(iConfigCallback);
                        HashMap map = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (C1288c.this.f7035d.f7030e.containsKey(str)) {
                                    map.put(str, C1288c.this.m5469c().get(str));
                                    C1329d.m5571a("efs.config", "--->>> configCallback key is " + str + " ## value is " + C1288c.this.m5469c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(map);
                    }
                    C1288c.this.f7036e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1287b c1287b;
        int i4 = message.what;
        if (i4 == 0) {
            boolean zM5477a = SharedPreferencesOnSharedPreferenceChangeListenerC1290e.m5477a();
            C1329d.m5571a("efs.config", "--->>> 删除旧的配置文件 ".concat(String.valueOf(zM5477a)));
            if (zM5477a) {
                this.f7037f.sendEmptyMessage(1);
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC1290e sharedPreferencesOnSharedPreferenceChangeListenerC1290e = this.f7038g;
                sharedPreferencesOnSharedPreferenceChangeListenerC1290e.m5481c();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1290e.f7043a == null) {
                    c1287b = null;
                } else {
                    C1287b c1287bM5454a = C1287b.m5454a();
                    c1287bM5454a.f7026a = sharedPreferencesOnSharedPreferenceChangeListenerC1290e.f7043a.getInt("cver", -1);
                    Set<String> setKeySet = sharedPreferencesOnSharedPreferenceChangeListenerC1290e.f7043a.getAll().keySet();
                    HashMap map = new HashMap();
                    for (String str : setKeySet) {
                        String string = sharedPreferencesOnSharedPreferenceChangeListenerC1290e.f7043a.getString(str, "");
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str, string);
                        }
                    }
                    c1287bM5454a.m5455a(map);
                    c1287b = c1287bM5454a;
                }
                if (c1287b == null) {
                    C1329d.m5571a("efs.config", "--->>> 首次启动本地无配置或加载失败 ");
                } else if (m5458a(c1287b)) {
                    C1329d.m5571a("efs.config", "--->>> 一致 ");
                } else {
                    this.f7035d = c1287b;
                    String str2 = "load config from storage";
                    if (-1 != c1287b.f7026a) {
                        m5464i();
                        m5470d();
                        str2 = "load config from storage and notify observer";
                    }
                    C1329d.m5571a("efs.config", str2);
                }
            }
        } else if (i4 == 1) {
            int i5 = message.arg1;
            if (i5 <= this.f7035d.f7026a) {
                C1329d.m5571a("efs.config", "current config version is " + i5 + ", no need to refresh");
                C1329d.m5571a("efs.config", "current config version(" + this.f7035d.f7026a + ") is " + i5 + ", no need to refresh");
            } else {
                m5460e();
            }
        } else if (i4 != 2) {
            if (i4 == 3) {
                m5461f();
            }
        } else if (C1300f.a.f7081a.m5507a()) {
            if (m5463h()) {
                m5460e();
            } else {
                C1329d.m5571a("efs.config", "No update is required, less than 8h since the last update");
            }
        }
        return true;
    }

    private C1288c() {
        this.f7034c = true;
        this.f7036e = new HashMap();
        this.f7037f = new Handler(C1316a.f7105a.getLooper(), this);
        this.f7038g = new SharedPreferencesOnSharedPreferenceChangeListenerC1290e();
        this.f7035d = C1287b.m5454a();
        this.f7039h = C1293a.f7048a.f7017j;
    }

    /* renamed from: a */
    public static C1288c m5456a() {
        return a.f7041a;
    }

    /* renamed from: b */
    public final void m5468b() {
        this.f7037f.sendEmptyMessage(0);
        this.f7037f.sendEmptyMessageDelayed(2, this.f7039h);
    }

    /* renamed from: a */
    public final void m5466a(int i4) {
        if (i4 <= this.f7035d.f7026a) {
            C1329d.m5571a("efs.config", "current config version is " + i4 + ", no need to refresh");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i4;
        messageObtain.what = 1;
        this.f7037f.sendMessage(messageObtain);
    }

    /* renamed from: a */
    public final String m5465a(boolean z3) {
        if (z3) {
            return "https://" + this.f7035d.f7028c;
        }
        return this.f7035d.f7027b + this.f7035d.f7028c;
    }

    /* renamed from: a */
    public final void m5467a(String str) {
        C1287b c1287bM5454a = C1287b.m5454a();
        if (C1289d.m5475a(str, c1287bM5454a)) {
            if (m5458a(c1287bM5454a)) {
                return;
            }
            this.f7035d = c1287bM5454a;
            m5461f();
            m5464i();
            m5470d();
            return;
        }
        this.f7037f.sendEmptyMessageDelayed(1, 3000L);
    }

    /* renamed from: a */
    private boolean m5458a(C1287b c1287b) {
        if (this.f7035d.f7026a >= c1287b.f7026a) {
            return true;
        }
        C1329d.m5571a("efs.config", "current config version (" + this.f7035d.f7026a + ") is older than another (" + c1287b.f7026a + ")");
        return false;
    }
}
