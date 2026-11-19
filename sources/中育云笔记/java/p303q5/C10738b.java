package p303q5;

import androidx.autofill.HintConstants;
import java.util.Iterator;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q5.b */
/* loaded from: classes5.dex */
public class C10738b {

    /* renamed from: a */
    public String f25855a;

    /* renamed from: b */
    public String f25856b;

    /* renamed from: c */
    public Set f25857c;

    /* renamed from: d */
    public String f25858d;

    /* renamed from: a */
    public Set m22804a() {
        return this.f25857c;
    }

    /* renamed from: b */
    public void m22805b(String str) {
        this.f25858d = str;
    }

    /* renamed from: c */
    public void m22806c(Set set) {
        this.f25857c = set;
    }

    /* renamed from: d */
    public String m22807d() {
        return this.f25855a;
    }

    /* renamed from: e */
    public void m22808e(String str) {
        this.f25855a = str;
    }

    /* renamed from: f */
    public JSONObject m22809f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AgooConstants.MESSAGE_ID, this.f25855a);
        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, this.f25856b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f25857c.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("countries", jSONArray);
        jSONObject.put("description", this.f25858d);
        return jSONObject;
    }

    /* renamed from: g */
    public void m22810g(String str) {
        this.f25856b = str;
    }
}
