package com.tencent.liteav.basic.p049d;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.liteav.basic.d.b */
/* loaded from: classes4.dex */
public class C6572b {

    /* renamed from: a */
    private final Map<String, String> f5286a = new HashMap();

    /* renamed from: b */
    private JSONObject f5287b = null;

    /* renamed from: b */
    private void m4877b() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f5286a.entrySet()) {
            sb.append(entry.getKey());
            sb.append(" : ");
            sb.append(entry.getValue());
            sb.append(SignParameters.NEW_LINE);
        }
        TXCLog.m4994i("CompatibleConfig", sb.toString());
    }

    /* renamed from: a */
    public synchronized void m4880a(JSONArray jSONArray) {
        this.f5286a.clear();
        JSONObject jSONObjectM4876b = m4876b(jSONArray);
        this.f5287b = jSONObjectM4876b;
        if (jSONObjectM4876b == null) {
            TXCLog.m4994i("CompatibleConfig", "can't find best match value");
        } else {
            m4875a(this.f5286a, "", jSONObjectM4876b);
            m4877b();
        }
    }

    /* renamed from: b */
    private JSONObject m4876b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = null;
        int i10 = 0;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                int iM4874a = m4874a(jSONObject2.optJSONObject("deviceinfo"));
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("deviceconfig");
                if (iM4874a > i10 && jSONObjectOptJSONObject != null) {
                    jSONObject = jSONObjectOptJSONObject;
                    i10 = iM4874a;
                }
            } catch (JSONException e10) {
                TXCLog.m4992e("CompatibleConfig", "Find best match value failed.", e10);
            }
        }
        TXCLog.m4995i("CompatibleConfig", "bestMatchLevel: %d", Integer.valueOf(i10));
        if (i10 > 0) {
            return jSONObject;
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void m4879a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f5286a.clear();
            JSONObject jSONObject = new JSONObject(str);
            this.f5287b = jSONObject;
            m4875a(this.f5286a, "", jSONObject);
            m4877b();
        } catch (JSONException e10) {
            TXCLog.m4992e("CompatibleConfig", "parse best match value failed.", e10);
        }
    }

    /* renamed from: a */
    public synchronized JSONObject m4878a() {
        return this.f5287b;
    }

    /* renamed from: a */
    private int m4874a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(Build.MANUFACTURER, jSONObject.optString("MANUFACTURER")));
        arrayList.add(new Pair(Build.MODEL, jSONObject.optString("MODEL")));
        arrayList.add(new Pair(String.valueOf(Build.VERSION.SDK_INT), jSONObject.optString("VERSION")));
        arrayList.add(new Pair(Build.VERSION.INCREMENTAL, jSONObject.optString("VERSION_INCREMENTAL")));
        arrayList.add(new Pair(Build.DISPLAY, jSONObject.optString("DISPLAY")));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            if (TextUtils.isEmpty((CharSequence) pair.second)) {
                return i10;
            }
            if (!((String) pair.first).equalsIgnoreCase((String) pair.second)) {
                return 0;
            }
        }
        return arrayList.size();
    }

    /* renamed from: a */
    private void m4875a(Map<String, String> map, String str, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                m4875a(map, str + "." + next, (JSONObject) objOpt);
            } else if (objOpt != null) {
                map.put(str + "." + next, objOpt.toString());
            }
        }
    }
}
