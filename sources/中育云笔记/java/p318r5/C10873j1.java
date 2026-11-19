package p318r5;

import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.j1 */
/* loaded from: classes5.dex */
public class C10873j1 extends AbstractC10846a1 {

    /* renamed from: f */
    public String f26242f;

    /* renamed from: g */
    public String f26243g;

    /* renamed from: h */
    public String f26244h;

    @Override // p318r5.InterfaceC10892r0
    /* renamed from: a */
    public JSONObject mo23412a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_rom_ver", this.f26244h);
        jSONObject.put("_emui_ver", this.f26162a);
        jSONObject.put("_model", Build.MODEL);
        jSONObject.put("_mcc", this.f26242f);
        jSONObject.put("_mnc", this.f26243g);
        jSONObject.put("_package_name", this.f26163b);
        jSONObject.put("_app_ver", this.f26164c);
        jSONObject.put("_lib_ver", "2.2.0.315");
        jSONObject.put("_channel", this.f26165d);
        jSONObject.put("_lib_name", "hianalytics");
        jSONObject.put("_oaid_tracking_flag", this.f26166e);
        return jSONObject;
    }

    /* renamed from: f */
    public void m23504f(String str) {
        this.f26242f = str;
    }

    /* renamed from: g */
    public void m23505g(String str) {
        this.f26243g = str;
    }

    /* renamed from: h */
    public void m23506h(String str) {
        this.f26244h = str;
    }
}
