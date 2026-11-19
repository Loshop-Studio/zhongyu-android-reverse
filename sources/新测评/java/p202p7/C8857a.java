package p202p7;

import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: p7.a */
/* loaded from: classes5.dex */
public final class C8857a {

    /* renamed from: a */
    public static final C8857a f15058a = new C8857a();

    /* renamed from: a */
    public final JSONObject m14851a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            AbstractC8858b.f15060b.m14856b("【JSONUtil】", "getJSONObject解析json异常");
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final JSONArray m14852b(JSONObject jSONObject, String name) {
        Intrinsics.checkParameterIsNotNull(name, "name");
        if (jSONObject != null && !jSONObject.isNull(name)) {
            try {
                return jSONObject.getJSONArray(name);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final JSONObject m14853c(JSONArray jSONArray, int i10) {
        if (jSONArray == null || i10 < 0 || i10 >= jSONArray.length()) {
            return null;
        }
        try {
            return jSONArray.getJSONObject(i10);
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
