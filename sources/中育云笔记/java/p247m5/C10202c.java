package p247m5;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p203j5.C9681b;

/* renamed from: m5.c */
/* loaded from: classes5.dex */
public class C10202c {

    /* renamed from: a */
    public final GrsBaseInfo f24293a;

    /* renamed from: b */
    public final Context f24294b;

    /* renamed from: c */
    public final Set f24295c = new HashSet();

    public C10202c(GrsBaseInfo grsBaseInfo, Context context) {
        this.f24293a = grsBaseInfo;
        this.f24294b = context;
    }

    /* renamed from: a */
    public Context m21307a() {
        return this.f24294b;
    }

    /* renamed from: b */
    public void m21308b(String str) {
        this.f24295c.add(str);
    }

    /* renamed from: c */
    public GrsBaseInfo m21309c() {
        return this.f24293a;
    }

    /* renamed from: d */
    public String m21310d() {
        return this.f24295c.size() == 0 ? m21312f() : m21313g();
    }

    /* renamed from: e */
    public Set m21311e() {
        return this.f24295c;
    }

    /* renamed from: f */
    public final String m21312f() throws JSONException {
        Set setM19167h = C9681b.m19160a(this.f24294b.getPackageName()).m19167h();
        if (setM19167h.isEmpty()) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = setM19167h.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.m8572d("GrsRequestInfo", "post service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: g */
    public final String m21313g() throws JSONException {
        Logger.m8586v("GrsRequestInfo", "getGeoipService enter");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f24295c.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("services", jSONArray);
            Logger.m8587v("GrsRequestInfo", "post query service list is:%s", jSONObject.toString());
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
