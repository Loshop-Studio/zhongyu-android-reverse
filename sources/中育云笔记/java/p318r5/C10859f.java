package p318r5;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.f */
/* loaded from: classes5.dex */
public class C10859f implements InterfaceC10892r0 {

    /* renamed from: a */
    public String f26209a;

    /* renamed from: b */
    public String f26210b;

    /* renamed from: c */
    public String f26211c;

    /* renamed from: d */
    public String f26212d;

    /* renamed from: e */
    public String f26213e;

    /* renamed from: f */
    public String f26214f;

    @Override // p318r5.InterfaceC10892r0
    /* renamed from: a */
    public JSONObject mo23412a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.f26209a);
        jSONObject.put("eventtime", this.f26212d);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f26210b);
        jSONObject.put("event_session_name", this.f26213e);
        jSONObject.put("first_session_event", this.f26214f);
        if (TextUtils.isEmpty(this.f26211c)) {
            return null;
        }
        jSONObject.put("properties", new JSONObject(this.f26211c));
        return jSONObject;
    }

    /* renamed from: b */
    public void m23413b(String str) {
        this.f26211c = str;
    }

    /* renamed from: c */
    public void m23414c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f26210b = jSONObject.optString(NotificationCompat.CATEGORY_EVENT);
        this.f26211c = AbstractC10888p0.m23586b(jSONObject.optString("properties"), C10890q0.m23591g().m23593a());
        this.f26209a = jSONObject.optString("type");
        this.f26212d = jSONObject.optString("eventtime");
        this.f26213e = jSONObject.optString("event_session_name");
        this.f26214f = jSONObject.optString("first_session_event");
    }

    /* renamed from: d */
    public String m23415d() {
        return this.f26212d;
    }

    /* renamed from: e */
    public void m23416e(String str) {
        this.f26210b = str;
    }

    /* renamed from: f */
    public String m23417f() {
        return this.f26209a;
    }

    /* renamed from: g */
    public void m23418g(String str) {
        this.f26212d = str;
    }

    /* renamed from: h */
    public JSONObject m23419h() throws JSONException {
        JSONObject jSONObjectMo23412a = mo23412a();
        jSONObjectMo23412a.put("properties", AbstractC10888p0.m23588d(this.f26211c, C10890q0.m23591g().m23593a()));
        return jSONObjectMo23412a;
    }

    /* renamed from: i */
    public void m23420i(String str) {
        this.f26209a = str;
    }

    /* renamed from: j */
    public void m23421j(String str) {
        this.f26214f = str;
    }

    /* renamed from: k */
    public void m23422k(String str) {
        this.f26213e = str;
    }
}
