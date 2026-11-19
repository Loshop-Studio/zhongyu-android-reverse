package p318r5;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.b */
/* loaded from: classes5.dex */
public class C10847b implements InterfaceRunnableC10897u {

    /* renamed from: c */
    public Context f26167c = AbstractC10900v0.m23682q();

    /* renamed from: d */
    public String f26168d;

    /* renamed from: e */
    public JSONObject f26169e;

    /* renamed from: f */
    public String f26170f;

    /* renamed from: g */
    public String f26171g;

    /* renamed from: h */
    public String f26172h;

    /* renamed from: i */
    public String f26173i;

    /* renamed from: j */
    public Boolean f26174j;

    public C10847b(String str, JSONObject jSONObject, String str2, String str3, long j10) {
        this.f26168d = str;
        this.f26169e = jSONObject;
        this.f26170f = str2;
        this.f26171g = str3;
        this.f26172h = String.valueOf(j10);
        if (AbstractC10882m1.m23559i(str2, "oper")) {
            C10894s0 c10894s0M23516b = C10876k1.m23513c().m23516b(str2, j10);
            this.f26173i = c10894s0M23516b.m23615a();
            this.f26174j = Boolean.valueOf(c10894s0M23516b.m23617f());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        AbstractC10861f1.m23430b("hmsSdk", "Begin to run EventRecordTask...");
        int iM23680o = AbstractC10900v0.m23680o();
        int iM23373l = AbstractC10850c.m23373l(this.f26170f, this.f26171g);
        if (AbstractC10865h.m23462c(this.f26167c, "stat_v2_1", iM23680o * 1048576)) {
            AbstractC10861f1.m23436h("hmsSdk", "stat sp file reach max limited size, delete it");
            AbstractC10877l.m23520d(this.f26167c, "stat_v2_1", new String[0]);
            return;
        }
        C10859f c10859f = new C10859f();
        c10859f.m23416e(this.f26168d);
        c10859f.m23413b(this.f26169e.toString());
        c10859f.m23420i(this.f26171g);
        c10859f.m23418g(this.f26172h);
        c10859f.m23422k(this.f26173i);
        Boolean bool = this.f26174j;
        c10859f.m23421j(bool == null ? null : String.valueOf(bool));
        try {
            JSONObject jSONObjectM23419h = c10859f.m23419h();
            String strM23581d = AbstractC10886o0.m23581d(this.f26170f, this.f26171g);
            String strM23518b = AbstractC10877l.m23518b(this.f26167c, "stat_v2_1", strM23581d, "");
            try {
                jSONArray = !TextUtils.isEmpty(strM23518b) ? new JSONArray(strM23518b) : new JSONArray();
            } catch (JSONException unused) {
                AbstractC10861f1.m23438j("hmsSdk", "Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObjectM23419h);
            AbstractC10877l.m23523g(this.f26167c, "stat_v2_1", strM23581d, jSONArray.toString());
            if (jSONArray.toString().length() > iM23373l * 1024) {
                C10885o.m23569a().m23575f(this.f26170f, this.f26171g);
            }
        } catch (JSONException unused2) {
            AbstractC10861f1.m23440l("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
