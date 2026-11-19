package p318r5;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r5.s */
/* loaded from: classes5.dex */
public final class C10893s {

    /* renamed from: c */
    public static C10893s f26280c;

    /* renamed from: a */
    public Context f26281a;

    /* renamed from: b */
    public final Object f26282b = new Object();

    /* renamed from: b */
    public static C10893s m23604b() {
        if (f26280c == null) {
            m23605g();
        }
        return f26280c;
    }

    /* renamed from: g */
    public static synchronized void m23605g() {
        if (f26280c == null) {
            f26280c = new C10893s();
        }
    }

    /* renamed from: a */
    public final JSONObject m23606a(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
                AbstractC10861f1.m23433e("hmsSdk", "Exception occured when transferring bundle to json");
            }
        }
        return jSONObject;
    }

    /* renamed from: c */
    public void m23607c(Context context) {
        synchronized (this.f26282b) {
            try {
                if (this.f26281a == null) {
                    this.f26281a = context;
                    C10885o.m23569a().m23571b(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public void m23608d(String str, int i10) {
        C10885o.m23569a().m23572c(str, i10);
    }

    /* renamed from: e */
    public void m23609e(String str, int i10, String str2, LinkedHashMap linkedHashMap) throws JSONException {
        C10885o.m23569a().m23573d(str, i10, str2, m23606a(linkedHashMap));
    }

    /* renamed from: f */
    public void m23610f(String str, Context context, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_constants", str3);
            C10885o.m23569a().m23573d(str, 0, str2, jSONObject);
        } catch (JSONException unused) {
            AbstractC10861f1.m23441m("hmsSdk", "onEvent():JSON structure Exception!");
        }
    }

    /* renamed from: h */
    public void m23611h(String str, int i10, String str2, LinkedHashMap linkedHashMap) throws JSONException {
        C10885o.m23569a().m23574e(str, i10, str2, m23606a(linkedHashMap), System.currentTimeMillis());
    }
}
