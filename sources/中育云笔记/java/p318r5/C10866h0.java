package p318r5;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.taobao.accs.utl.UtilityImpl;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.h0 */
/* loaded from: classes5.dex */
public class C10866h0 {

    /* renamed from: a */
    public String f26226a;

    /* renamed from: b */
    public String f26227b;

    /* renamed from: c */
    public String f26228c;

    /* renamed from: d */
    public List f26229d;

    /* renamed from: e */
    public String f26230e;

    public C10866h0(String str, String str2, String str3, List list, String str4) {
        this.f26226a = str;
        this.f26227b = str2;
        this.f26228c = str3;
        this.f26229d = list;
        this.f26230e = str4;
    }

    /* renamed from: a */
    public final String m23464a(String str, String str2) {
        String str3;
        String strM23368g = AbstractC10850c.m23368g(str, str2);
        if (TextUtils.isEmpty(strM23368g)) {
            AbstractC10861f1.m23431c("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else {
            if (!"diffprivacy".equals(str2)) {
                return "";
            }
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", strM23368g);
    }

    /* renamed from: b */
    public void m23465b() {
        String strM23464a = m23464a(this.f26226a, this.f26227b);
        if (TextUtils.isEmpty(strM23464a) && !"preins".equals(this.f26227b)) {
            AbstractC10861f1.m23440l("hmsSdk", "collectUrl is empty");
            return;
        }
        if (!"_hms_config_tag".equals(this.f26226a) && !"_openness_config_tag".equals(this.f26226a)) {
            m23467d();
        }
        C10901w c10901wM23469f = m23469f();
        if (c10901wM23469f == null) {
            C10856e.m23404d().m23405b(new C10874k(this.f26229d, this.f26226a, this.f26230e, this.f26227b));
            return;
        }
        byte[] bArrM23466c = m23466c(c10901wM23469f);
        if (bArrM23466c.length == 0) {
            AbstractC10861f1.m23440l("hmsSdk", "request body is empty");
        } else {
            C10856e.m23403c().m23405b(new C10891r(bArrM23466c, strM23464a, this.f26226a, this.f26227b, this.f26230e, this.f26229d));
        }
    }

    /* renamed from: c */
    public final byte[] m23466c(C10901w c10901w) {
        String str;
        try {
            JSONObject jSONObjectMo23412a = c10901w.mo23412a();
            if (jSONObjectMo23412a != null) {
                return AbstractC10863g0.m23454g(jSONObjectMo23412a.toString().getBytes(Request.DEFAULT_CHARSET));
            }
            AbstractC10861f1.m23440l("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            AbstractC10861f1.m23440l("hmsSdk", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "uploadEvents to json error";
            AbstractC10861f1.m23440l("hmsSdk", str);
            return new byte[0];
        }
    }

    /* renamed from: d */
    public final void m23467d() {
        if (AbstractC10865h.m23462c(AbstractC10900v0.m23682q(), "backup_event", UtilityImpl.TNET_FILE_SIZE)) {
            AbstractC10861f1.m23438j("hmsSdk", "backup file reach max limited size, delete it");
            AbstractC10877l.m23520d(AbstractC10900v0.m23682q(), "backup_event", new String[0]);
            return;
        }
        JSONArray jSONArrayM23468e = m23468e();
        String strM23582e = AbstractC10886o0.m23582e(this.f26226a, this.f26227b, this.f26230e);
        AbstractC10861f1.m23436h("hmsSdk", "Update data cached into backup,spKey: " + strM23582e);
        AbstractC10877l.m23523g(AbstractC10900v0.m23682q(), "backup_event", strM23582e, jSONArrayM23468e.toString());
    }

    /* renamed from: e */
    public final JSONArray m23468e() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f26229d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(((C10859f) it.next()).m23419h());
            } catch (JSONException unused) {
                AbstractC10861f1.m23436h("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    /* renamed from: f */
    public final C10901w m23469f() {
        return AbstractC10857e0.m23409f(this.f26229d, this.f26226a, this.f26227b, this.f26230e, this.f26228c);
    }
}
