package p318r5;

import com.taobao.accs.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.j0 */
/* loaded from: classes5.dex */
public class C10872j0 extends AbstractC10849b1 {

    /* renamed from: b */
    public String f26236b = "";

    /* renamed from: c */
    public String f26237c = "";

    /* renamed from: d */
    public String f26238d = "";

    /* renamed from: e */
    public String f26239e = "";

    /* renamed from: f */
    public String f26240f = "";

    /* renamed from: g */
    public String f26241g;

    @Override // p318r5.InterfaceC10892r0
    /* renamed from: a */
    public JSONObject mo23412a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("androidid", this.f26179a);
        jSONObject.put("oaid", this.f26241g);
        jSONObject.put("uuid", this.f26240f);
        jSONObject.put("upid", this.f26239e);
        jSONObject.put(Constants.KEY_IMEI, this.f26236b);
        jSONObject.put("sn", this.f26237c);
        jSONObject.put("udid", this.f26238d);
        return jSONObject;
    }

    /* renamed from: b */
    public void m23498b(String str) {
        this.f26236b = str;
    }

    /* renamed from: c */
    public void m23499c(String str) {
        this.f26241g = str;
    }

    /* renamed from: d */
    public void m23500d(String str) {
        this.f26237c = str;
    }

    /* renamed from: e */
    public void m23501e(String str) {
        this.f26238d = str;
    }

    /* renamed from: f */
    public void m23502f(String str) {
        this.f26239e = str;
    }

    /* renamed from: g */
    public void m23503g(String str) {
        this.f26240f = str;
    }
}
