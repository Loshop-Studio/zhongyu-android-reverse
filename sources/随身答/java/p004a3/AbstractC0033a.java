package p004a3;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;
import p176m2.AbstractC8959h;
import p210p2.AbstractC9318a;

/* renamed from: a3.a */
/* loaded from: classes4.dex */
public abstract class AbstractC0033a {

    /* renamed from: a */
    public static Map f110a;

    /* renamed from: a */
    public static void m171a(Context context, AbstractC0035c abstractC0035c) {
        if (context == null) {
            AbstractC8959h.m14292b("MobclickRT", "--->>> Sender:handleEvent: context is null.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("v_sdk_v", "1.0.0");
                Map map = f110a;
                if (map != null && map.size() > 0) {
                    for (String str : f110a.keySet()) {
                        jSONObject.put(str, f110a.get(str));
                    }
                }
            } catch (Throwable unused) {
            }
            new JSONObject();
            throw null;
        } catch (Throwable th) {
            AbstractC9318a.m15200b(context, th);
        }
    }
}
