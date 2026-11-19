package p318r5;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import anet.channel.request.Request;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.w */
/* loaded from: classes5.dex */
public class C10901w implements InterfaceC10892r0 {

    /* renamed from: a */
    public List f26309a;

    /* renamed from: b */
    public AbstractC10860f0 f26310b;

    /* renamed from: c */
    public AbstractC10846a1 f26311c;

    /* renamed from: d */
    public InterfaceC10892r0 f26312d;

    /* renamed from: e */
    public String f26313e = "";

    /* renamed from: f */
    public String f26314f;

    public C10901w(String str) {
        this.f26314f = str;
    }

    @Override // p318r5.InterfaceC10892r0
    /* renamed from: a */
    public JSONObject mo23412a() throws JSONException {
        String str;
        List list = this.f26309a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f26310b == null || this.f26311c == null || this.f26312d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f26310b.mo23412a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObjectMo23412a = this.f26312d.mo23412a();
            jSONObjectMo23412a.put("properties", this.f26311c.mo23412a());
            try {
                jSONObjectMo23412a.put("events_global_properties", new JSONObject(this.f26313e));
            } catch (JSONException unused) {
                jSONObjectMo23412a.put("events_global_properties", this.f26313e);
            }
            jSONObject2.put("events_common", jSONObjectMo23412a);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f26309a.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectMo23412a2 = ((C10859f) it.next()).mo23412a();
                if (jSONObjectMo23412a2 != null) {
                    jSONArray.put(jSONObjectMo23412a2);
                } else {
                    AbstractC10861f1.m23440l("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String strM23587c = AbstractC10888p0.m23587c(AbstractC10863g0.m23454g(jSONObject2.toString().getBytes(Request.DEFAULT_CHARSET)), this.f26314f);
                if (TextUtils.isEmpty(strM23587c)) {
                    AbstractC10861f1.m23440l("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, strM23587c);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        AbstractC10861f1.m23440l("hmsSdk", str);
        return null;
    }

    /* renamed from: b */
    public void m23689b(String str) {
        if (str != null) {
            this.f26313e = str;
        }
    }

    /* renamed from: c */
    public void m23690c(List list) {
        this.f26309a = list;
    }

    /* renamed from: d */
    public void m23691d(AbstractC10860f0 abstractC10860f0) {
        this.f26310b = abstractC10860f0;
    }

    /* renamed from: e */
    public void m23692e(C10872j0 c10872j0) {
        this.f26312d = c10872j0;
    }

    /* renamed from: f */
    public void m23693f(AbstractC10846a1 abstractC10846a1) {
        this.f26311c = abstractC10846a1;
    }
}
