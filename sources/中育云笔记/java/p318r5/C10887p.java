package p318r5;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.p */
/* loaded from: classes5.dex */
public class C10887p extends AbstractC10860f0 {

    /* renamed from: g */
    public String f26269g = "";

    @Override // p318r5.InterfaceC10892r0
    /* renamed from: a */
    public JSONObject mo23412a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("protocol_version", "3");
        jSONObject.put("compress_mode", "1");
        jSONObject.put("serviceid", this.f26218d);
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, this.f26215a);
        jSONObject.put("hmac", this.f26269g);
        jSONObject.put("chifer", this.f26220f);
        jSONObject.put("timestamp", this.f26216b);
        jSONObject.put("servicetag", this.f26217c);
        jSONObject.put("requestid", this.f26219e);
        return jSONObject;
    }

    /* renamed from: g */
    public void m23584g(String str) {
        this.f26269g = str;
    }
}
