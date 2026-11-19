package p303q5;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q5.c */
/* loaded from: classes5.dex */
public class C10739c {

    /* renamed from: a */
    public String f25859a;

    /* renamed from: b */
    public String f25860b;

    /* renamed from: c */
    public final Map f25861c = new ConcurrentHashMap(16);

    /* renamed from: d */
    public List f25862d = new ArrayList(16);

    /* renamed from: a */
    public List m22811a() {
        return this.f25862d;
    }

    /* renamed from: b */
    public C10740d m22812b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (C10740d) this.f25861c.get(str);
        }
        Logger.m8588w("Service", "In servings.getServing(String groupId), the groupId is Empty or null");
        return null;
    }

    /* renamed from: c */
    public void m22813c(String str, C10740d c10740d) {
        if (TextUtils.isEmpty(str) || c10740d == null) {
            return;
        }
        this.f25861c.put(str, c10740d);
    }

    /* renamed from: d */
    public void m22814d(List list) {
        this.f25862d = list;
    }

    /* renamed from: e */
    public String m22815e() {
        return this.f25860b;
    }

    /* renamed from: f */
    public void m22816f(String str) {
        this.f25859a = str;
    }

    /* renamed from: g */
    public JSONObject m22817g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, this.f25859a);
        jSONObject.put("routeBy", this.f25860b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f25861c.keySet().iterator();
        while (it.hasNext()) {
            C10740d c10740d = (C10740d) this.f25861c.get((String) it.next());
            if (c10740d != null) {
                jSONArray.put(c10740d.m22823e());
            }
        }
        jSONObject.put("servings", jSONArray);
        if (this.f25862d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f25862d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((C10738b) it2.next()).m22809f());
            }
            jSONObject.put("countryGroups", jSONArray2);
        }
        return jSONObject;
    }

    /* renamed from: h */
    public void m22818h(String str) {
        this.f25860b = str;
    }
}
