package com.efs.sdk.base.p039a.p042c.p043a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import com.efs.sdk.base.IConfigRefreshAction;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p046e.C5668f;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.p051a.C5684a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.a.c.a.c */
/* loaded from: classes3.dex */
public final class C5656c implements Handler.Callback {

    /* renamed from: a */
    public static final Random f4666a = new Random();

    /* renamed from: b */
    public IConfigRefreshAction f4667b;

    /* renamed from: c */
    public boolean f4668c;

    /* renamed from: d */
    public C5655b f4669d;

    /* renamed from: e */
    public Map<IConfigCallback, String[]> f4670e;

    /* renamed from: f */
    private Handler f4671f;

    /* renamed from: g */
    private SharedPreferencesOnSharedPreferenceChangeListenerC5658e f4672g;

    /* renamed from: h */
    private long f4673h;

    /* renamed from: com.efs.sdk.base.a.c.a.c$a */
    public static class a {

        /* renamed from: a */
        private static final C5656c f4675a = new C5656c(0);
    }

    public /* synthetic */ C5656c(byte b10) {
        this();
    }

    /* renamed from: e */
    private void m4070e() {
        if (!C5668f.a.f4715a.m4117a()) {
            C5697d.m4181a("efs.config", "has no permission to refresh config from remote");
            return;
        }
        if (!this.f4668c) {
            C5697d.m4181a("efs.config", "disable refresh config from remote");
            return;
        }
        String strRefresh = m4072g().refresh();
        C5697d.m4181a("efs.config", "efs config is ".concat(String.valueOf(strRefresh)));
        if (TextUtils.isEmpty(strRefresh)) {
            return;
        }
        m4077a(strRefresh);
    }

    /* renamed from: f */
    private void m4071f() {
        boolean zM4090a;
        try {
            zM4090a = this.f4672g.m4090a(this.f4669d);
        } catch (Throwable unused) {
            zM4090a = false;
        }
        if (zM4090a) {
            return;
        }
        this.f4671f.sendEmptyMessageDelayed(3, 3000L);
    }

    @NonNull
    /* renamed from: g */
    private IConfigRefreshAction m4072g() {
        IConfigRefreshAction iConfigRefreshAction = this.f4667b;
        return iConfigRefreshAction == null ? C5654a.m4062a() : iConfigRefreshAction;
    }

    /* renamed from: h */
    private boolean m4073h() {
        SharedPreferencesOnSharedPreferenceChangeListenerC5658e.m4088b();
        long j9 = 0;
        try {
            SharedPreferencesOnSharedPreferenceChangeListenerC5658e sharedPreferencesOnSharedPreferenceChangeListenerC5658e = this.f4672g;
            sharedPreferencesOnSharedPreferenceChangeListenerC5658e.m4091c();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC5658e.f4677a != null) {
                j9 = sharedPreferencesOnSharedPreferenceChangeListenerC5658e.f4677a.getLong("last_refresh_time", 0L);
            }
        } catch (Throwable unused) {
        }
        return System.currentTimeMillis() - j9 >= 28800000;
    }

    /* renamed from: i */
    private void m4074i() {
        try {
            for (ValueCallback<Pair<Message, Message>> valueCallback : C5661a.f4682a.m4059a(1)) {
                Message messageObtain = Message.obtain(null, 1, new JSONObject(this.f4669d.f4664e).toString());
                Message messageObtain2 = Message.obtain();
                valueCallback.onReceiveValue(new Pair<>(messageObtain, messageObtain2));
                messageObtain.recycle();
                messageObtain2.recycle();
            }
            Iterator<IEfsReporterObserver> it = C5661a.f4682a.f4656o.iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        } catch (Throwable th) {
            C5697d.m4183b("efs.base", "efs.config", th);
        }
    }

    /* renamed from: c */
    public final Map<String, String> m4079c() {
        return new HashMap(this.f4669d.f4664e);
    }

    /* renamed from: d */
    public final void m4080d() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.efs.sdk.base.a.c.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    for (IConfigCallback iConfigCallback : C5656c.this.f4670e.keySet()) {
                        String[] strArr = (String[]) C5656c.this.f4670e.get(iConfigCallback);
                        HashMap map = new HashMap();
                        if (strArr != null && strArr.length != 0) {
                            for (String str : strArr) {
                                if (C5656c.this.f4669d.f4664e.containsKey(str)) {
                                    map.put(str, C5656c.this.m4079c().get(str));
                                    C5697d.m4181a("efs.config", "--->>> configCallback key is " + str + " ## value is " + C5656c.this.m4079c().get(str));
                                }
                            }
                        }
                        iConfigCallback.onChange(map);
                    }
                    C5656c.this.f4670e.clear();
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        C5655b c5655b;
        int i9 = message.what;
        if (i9 == 0) {
            boolean zM4087a = SharedPreferencesOnSharedPreferenceChangeListenerC5658e.m4087a();
            C5697d.m4181a("efs.config", "--->>> 删除旧的配置文件 ".concat(String.valueOf(zM4087a)));
            if (zM4087a) {
                this.f4671f.sendEmptyMessage(1);
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC5658e sharedPreferencesOnSharedPreferenceChangeListenerC5658e = this.f4672g;
                sharedPreferencesOnSharedPreferenceChangeListenerC5658e.m4091c();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC5658e.f4677a == null) {
                    c5655b = null;
                } else {
                    C5655b c5655bM4064a = C5655b.m4064a();
                    c5655bM4064a.f4660a = sharedPreferencesOnSharedPreferenceChangeListenerC5658e.f4677a.getInt("cver", -1);
                    Set<String> setKeySet = sharedPreferencesOnSharedPreferenceChangeListenerC5658e.f4677a.getAll().keySet();
                    HashMap map = new HashMap();
                    for (String str : setKeySet) {
                        String string = sharedPreferencesOnSharedPreferenceChangeListenerC5658e.f4677a.getString(str, "");
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str, string);
                        }
                    }
                    c5655bM4064a.m4065a(map);
                    c5655b = c5655bM4064a;
                }
                if (c5655b == null) {
                    C5697d.m4181a("efs.config", "--->>> 首次启动本地无配置或加载失败 ");
                } else if (m4068a(c5655b)) {
                    C5697d.m4181a("efs.config", "--->>> 一致 ");
                } else {
                    this.f4669d = c5655b;
                    String str2 = "load config from storage";
                    if (-1 != c5655b.f4660a) {
                        m4074i();
                        m4080d();
                        str2 = "load config from storage and notify observer";
                    }
                    C5697d.m4181a("efs.config", str2);
                }
            }
        } else if (i9 == 1) {
            int i10 = message.arg1;
            if (i10 <= this.f4669d.f4660a) {
                C5697d.m4181a("efs.config", "current config version is " + i10 + ", no need to refresh");
                C5697d.m4181a("efs.config", "current config version(" + this.f4669d.f4660a + ") is " + i10 + ", no need to refresh");
            } else {
                m4070e();
            }
        } else if (i9 != 2) {
            if (i9 == 3) {
                m4071f();
            }
        } else if (C5668f.a.f4715a.m4117a()) {
            if (m4073h()) {
                m4070e();
            } else {
                C5697d.m4181a("efs.config", "No update is required, less than 8h since the last update");
            }
        }
        return true;
    }

    private C5656c() {
        this.f4668c = true;
        this.f4670e = new HashMap();
        this.f4671f = new Handler(C5684a.f4739a.getLooper(), this);
        this.f4672g = new SharedPreferencesOnSharedPreferenceChangeListenerC5658e();
        this.f4669d = C5655b.m4064a();
        this.f4673h = C5661a.f4682a.f4651j;
    }

    /* renamed from: a */
    public static C5656c m4066a() {
        return a.f4675a;
    }

    /* renamed from: b */
    public final void m4078b() {
        this.f4671f.sendEmptyMessage(0);
        this.f4671f.sendEmptyMessageDelayed(2, this.f4673h);
    }

    /* renamed from: a */
    public final void m4076a(int i9) {
        if (i9 <= this.f4669d.f4660a) {
            C5697d.m4181a("efs.config", "current config version is " + i9 + ", no need to refresh");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = i9;
        messageObtain.what = 1;
        this.f4671f.sendMessage(messageObtain);
    }

    /* renamed from: a */
    public final String m4075a(boolean z9) {
        if (z9) {
            return "https://" + this.f4669d.f4662c;
        }
        return this.f4669d.f4661b + this.f4669d.f4662c;
    }

    /* renamed from: a */
    public final void m4077a(String str) {
        C5655b c5655bM4064a = C5655b.m4064a();
        if (C5657d.m4085a(str, c5655bM4064a)) {
            if (m4068a(c5655bM4064a)) {
                return;
            }
            this.f4669d = c5655bM4064a;
            m4071f();
            m4074i();
            m4080d();
            return;
        }
        this.f4671f.sendEmptyMessageDelayed(1, 3000L);
    }

    /* renamed from: a */
    private boolean m4068a(C5655b c5655b) {
        if (this.f4669d.f4660a >= c5655b.f4660a) {
            return true;
        }
        C5697d.m4181a("efs.config", "current config version (" + this.f4669d.f4660a + ") is older than another (" + c5655b.f4660a + ")");
        return false;
    }
}
