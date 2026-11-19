package com.umeng.analytics.process;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.AbstractC6782a;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p092e2.AbstractC7839a;
import p092e2.AbstractC7841c;
import p114g2.C8030n0;
import p124h2.C8091a;
import p176m2.AbstractC8959h;
import p270v2.AbstractC9755c;
import p290x2.AbstractC9866a;
import p300y2.C9945a;
import p310z2.AbstractC9993d;
import p310z2.C9991b;
import p310z2.InterfaceC9990a;

/* renamed from: com.umeng.analytics.process.b */
/* loaded from: classes4.dex */
public class C6779b implements UMLogDataProtocol {

    /* renamed from: d */
    public static C6779b f6728d;

    /* renamed from: e */
    public static ScheduledThreadPoolExecutor f6729e = new ScheduledThreadPoolExecutor(1);

    /* renamed from: a */
    public C9991b f6730a = new C9991b();

    /* renamed from: b */
    public Context f6731b;

    /* renamed from: c */
    public List f6732c;

    /* renamed from: com.umeng.analytics.process.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8959h.m14293c("MobclickRT", "--->>> call processDBToMain start.");
            UMProcessDBHelper.m6229h(C6779b.this.f6731b).m6238l();
        }
    }

    /* renamed from: com.umeng.analytics.process.b$b */
    public class b implements InterfaceC9990a {
        public b() {
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: a */
        public boolean mo6244a(String str) {
            JSONObject jSONObjectM6268b;
            C6779b c6779b = C6779b.this;
            JSONObject jSONObjectMo6253d = c6779b.mo6253d(AbstractC6782a.m6278l(c6779b.f6731b));
            if (jSONObjectMo6253d != null && jSONObjectMo6253d.length() >= 1) {
                JSONObject jSONObject = (JSONObject) jSONObjectMo6253d.opt("header");
                JSONObject jSONObject2 = (JSONObject) jSONObjectMo6253d.opt("content");
                if (C6779b.this.f6731b != null && jSONObject != null && jSONObject2 != null && (jSONObjectM6268b = AbstractC6782a.m6268b(C6779b.this.f6731b, jSONObject, jSONObject2)) != null) {
                    C6779b.this.mo6251a(jSONObjectM6268b);
                }
            }
            return true;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: c */
        public boolean mo6245c(String str, Object obj) {
            return false;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: e */
        public boolean mo6246e(File file, int i9) {
            return false;
        }

        public /* synthetic */ b(C6779b c6779b, a aVar) {
            this();
        }
    }

    /* renamed from: com.umeng.analytics.process.b$c */
    public class c implements InterfaceC9990a {
        public c() {
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: a */
        public boolean mo6244a(String str) throws Throwable {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith("ua_")) {
                str = str.replaceFirst("ua_", "");
            }
            UMProcessDBHelper.m6229h(C6779b.this.f6731b).m6232e(str.replace(".db", ""), null, null);
            return true;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: c */
        public boolean mo6245c(String str, Object obj) {
            return false;
        }

        @Override // p310z2.InterfaceC9990a
        /* renamed from: e */
        public boolean mo6246e(File file, int i9) {
            return false;
        }

        public /* synthetic */ c(C6779b c6779b, a aVar) {
            this();
        }
    }

    /* renamed from: i */
    public static C6779b m6250i(Context context) {
        if (f6728d == null) {
            synchronized (C6779b.class) {
                try {
                    if (f6728d == null) {
                        f6728d = new C6779b();
                    }
                } finally {
                }
            }
        }
        C6779b c6779b = f6728d;
        c6779b.f6731b = context;
        return c6779b;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: a */
    public void mo6251a(Object obj) {
        List list;
        JSONObject jSONObjectOptJSONObject;
        if (obj == null || (list = this.f6732c) == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (!jSONObject.has("analytics") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("analytics")) == null || jSONObjectOptJSONObject.length() <= 0 || !jSONObjectOptJSONObject.has("ekv")) {
            return;
        }
        UMProcessDBHelper.m6229h(this.f6731b).m6233f(this.f6732c);
        this.f6732c.clear();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: c */
    public void mo6252c(Object obj, int i9) {
        if (AbstractC9993d.m17334s(this.f6731b)) {
            switch (i9) {
                case 36945:
                    f6729e.schedule(new a(), 5L, TimeUnit.SECONDS);
                    break;
                case 36946:
                    AbstractC8959h.m14293c("MobclickRT", "--->>> recv UM_PROCESS_CONSTRUCTMESSAGE msg.");
                    m6254e();
                    break;
            }
        }
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: d */
    public JSONObject mo6253d(long j9) {
        int iM12699a = C8030n0.m12698b().m12699a(this.f6731b);
        JSONObject jSONObjectM6256g = m6256g();
        if (jSONObjectM6256g.length() <= 0) {
            return null;
        }
        JSONObject jSONObjectM6257h = m6257h();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iM12699a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (jSONObjectM6256g.length() > 0) {
                jSONObject2.put("analytics", jSONObjectM6256g);
            }
            if (jSONObjectM6257h != null && jSONObjectM6257h.length() > 0) {
                jSONObject.put("header", jSONObjectM6257h);
            }
            if (jSONObject2.length() > 0) {
                if (jSONObject2.has("analytics")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("analytics");
                    if (jSONObjectOptJSONObject.length() == 1 && (jSONObjectOptJSONObject.optJSONObject("active_user") != null || !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("userlevel")))) {
                        return null;
                    }
                    if (jSONObjectOptJSONObject.length() == 2 && jSONObjectOptJSONObject.optJSONObject("active_user") != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("userlevel"))) {
                        return null;
                    }
                }
                jSONObject.put("content", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final void m6254e() {
        if (m6255f() != 0) {
            return;
        }
        this.f6730a.m17313d(C8091a.m12919h(this.f6731b, ""), new b(this, null));
    }

    /* renamed from: f */
    public final int m6255f() throws Throwable {
        int iM12699a = C8030n0.m12698b().m12699a(this.f6731b);
        if (iM12699a != 0) {
            try {
                AbstractC6778a.m6248b(C8091a.m12918c(this.f6731b), new c(this, null), null);
            } catch (Exception unused) {
            }
            UMProcessDBHelper.m6229h(this.f6731b).m6232e("_main_", null, null);
        }
        return iM12699a;
    }

    /* renamed from: g */
    public final JSONObject m6256g() {
        JSONObject jSONObjectM6241o = null;
        try {
            if (this.f6732c == null) {
                this.f6732c = new ArrayList();
            }
            jSONObjectM6241o = UMProcessDBHelper.m6229h(this.f6731b).m6241o(AbstractC6782a.m6278l(this.f6731b) - 2000, this.f6732c);
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(this.f6731b);
            if (sharedPreferencesM16841a != null) {
                String string = sharedPreferencesM16841a.getString("userlevel", "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObjectM6241o.put("userlevel", string);
                }
            }
            String[] strArrM12286b = AbstractC7841c.m12286b(this.f6731b);
            if (strArrM12286b != null && !TextUtils.isEmpty(strArrM12286b[0]) && !TextUtils.isEmpty(strArrM12286b[1])) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("provider", strArrM12286b[0]);
                jSONObject.put("puid", strArrM12286b[1]);
                if (jSONObject.length() > 0) {
                    jSONObjectM6241o.put("active_user", jSONObject);
                }
            }
            if (C9945a.m17137c(this.f6731b).m17141f()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C9945a.m17137c(this.f6731b).m17139d(), C9945a.m17137c(this.f6731b).m17138b());
                jSONObjectM6241o.put("group_info", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectM6241o;
    }

    /* renamed from: h */
    public final JSONObject m6257h() {
        String strOptString;
        String strOptString2;
        JSONObject jSONObjectM6242p;
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            if (AbstractC7839a.f13165b != null && (str = AbstractC7839a.f13166c) != null) {
                jSONObject.put("wrapper_version", str);
                jSONObject.put("wrapper_type", AbstractC7839a.f13165b);
            }
            jSONObject.put("vertical_type", AbstractC7839a.m12280d(this.f6731b));
            String str2 = "9.3.7";
            if (AbstractC7839a.m12280d(this.f6731b) == 1) {
                String strM12277a = AbstractC7839a.m12277a(this.f6731b);
                if (!TextUtils.isEmpty(strM12277a)) {
                    str2 = strM12277a;
                }
                jSONObject.put("sdk_version", str2);
            } else {
                jSONObject.put("sdk_version", "9.3.7");
            }
            if (this.f6732c.size() <= 0 || (jSONObjectM6242p = UMProcessDBHelper.m6229h(this.f6731b).m6242p((Integer) this.f6732c.get(0))) == null) {
                strOptString = "";
                strOptString2 = "";
            } else {
                strOptString = jSONObjectM6242p.optString("__av");
                strOptString2 = jSONObjectM6242p.optString("__vc");
            }
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject.put("app_version", AbstractC9993d.m17320e(this.f6731b));
            } else {
                jSONObject.put("app_version", strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                jSONObject.put("version_code", AbstractC9993d.m17319d(this.f6731b));
            } else {
                jSONObject.put("version_code", strOptString2);
            }
            String strM16392a = AbstractC9755c.m16392a(AbstractC7839a.m12279c(this.f6731b));
            if (!TextUtils.isEmpty(strM16392a)) {
                jSONObject.put("secret", strM16392a);
            }
            String strM6274h = AbstractC6782a.m6274h(this.f6731b, "pr_ve", null);
            SharedPreferences sharedPreferencesM16841a = AbstractC9866a.m16841a(this.f6731b);
            jSONObject.put("$pr_ve", AbstractC6782a.m6274h(this.f6731b, "pr_ve", null));
            jSONObject.put("$ud_da", AbstractC6782a.m6274h(this.f6731b, "ud_da", null));
            jSONObject.put("pro_ver", "1.0.0");
            if (TextUtils.isEmpty(strM6274h)) {
                jSONObject.put("$pr_ve", sharedPreferencesM16841a.getString("vers_pre_version", "0"));
                jSONObject.put("$ud_da", sharedPreferencesM16841a.getString("vers_date", new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()))));
            }
            return jSONObject;
        } catch (Throwable th) {
            th.printStackTrace();
            return jSONObject;
        }
    }
}
