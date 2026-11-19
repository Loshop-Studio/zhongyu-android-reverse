package p303q5;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.huawei.hms.framework.common.Logger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: q5.a */
/* loaded from: classes5.dex */
public class C10737a {

    /* renamed from: a */
    public String f25852a;

    /* renamed from: b */
    public long f25853b;

    /* renamed from: c */
    public final Map f25854c = new ConcurrentHashMap(16);

    /* renamed from: a */
    public String m22798a() {
        return this.f25852a;
    }

    /* renamed from: b */
    public C10739c m22799b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (C10739c) this.f25854c.get(str);
        }
        Logger.m8588w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    /* renamed from: c */
    public void m22800c(long j10) {
        this.f25853b = j10;
    }

    /* renamed from: d */
    public void m22801d(String str, C10739c c10739c) {
        if (TextUtils.isEmpty(str) || c10739c == null) {
            return;
        }
        this.f25854c.put(str, c10739c);
    }

    /* renamed from: e */
    public JSONObject m22802e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, TextUtils.isEmpty(this.f25852a) ? "" : this.f25852a);
        jSONObject.put("cacheControl", this.f25853b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f25854c.keySet().iterator();
        while (it.hasNext()) {
            C10739c c10739c = (C10739c) this.f25854c.get((String) it.next());
            if (c10739c != null) {
                jSONArray.put(c10739c.m22817g());
            }
        }
        Logger.m8580i("ApplicationBean", "local config save to sp, services count:" + jSONArray.length());
        jSONObject.put("services", jSONArray);
        return jSONObject;
    }

    /* renamed from: f */
    public void m22803f(String str) {
        this.f25852a = str;
    }
}
