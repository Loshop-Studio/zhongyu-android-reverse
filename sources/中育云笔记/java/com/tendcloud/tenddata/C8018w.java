package com.tendcloud.tenddata;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.w */
/* loaded from: classes5.dex */
public final class C8018w {

    /* renamed from: a */
    public static final int f15119a = 1;

    /* renamed from: b */
    public static final int f15120b = 2;

    /* renamed from: c */
    public static final int f15121c = 3;

    /* renamed from: d */
    private String f15122d;

    /* renamed from: e */
    private String f15123e;

    /* renamed from: f */
    private String f15124f;

    /* renamed from: g */
    private String f15125g;

    /* renamed from: h */
    private String f15126h;

    /* renamed from: i */
    private String f15127i;

    /* renamed from: j */
    private JSONObject f15128j;

    /* renamed from: k */
    private int f15129k;

    /* renamed from: l */
    private List<C8007k> f15130l;

    /* renamed from: a */
    public JSONObject m12112a() {
        return this.f15128j;
    }

    /* renamed from: b */
    public String m12113b() {
        return this.f15127i;
    }

    /* renamed from: c */
    public String m12114c() {
        return this.f15125g;
    }

    /* renamed from: d */
    public int m12115d() {
        return this.f15129k;
    }

    /* renamed from: e */
    public List<C8007k> m12116e() {
        return this.f15130l;
    }

    /* renamed from: f */
    public String m12117f() {
        return this.f15122d;
    }

    /* renamed from: g */
    public String m12118g() {
        return this.f15123e;
    }

    /* renamed from: h */
    public String m12119h() {
        return this.f15126h;
    }

    /* renamed from: i */
    public String m12120i() {
        return this.f15124f;
    }

    /* renamed from: j */
    public boolean m12121j() {
        try {
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
        }
        if (TextUtils.isEmpty(m12117f())) {
            return true;
        }
        int iM12115d = m12115d();
        if (iM12115d == 1) {
            return TextUtils.isEmpty(m12119h());
        }
        if (iM12115d == 2) {
            return TextUtils.isEmpty(m12114c());
        }
        if (iM12115d != 3) {
            return true;
        }
        return TextUtils.isEmpty(m12113b());
    }

    public void setEventId(String str) {
        this.f15122d = str;
    }

    public void setEventName(String str) {
        this.f15123e = str;
    }

    public void setEventParams(List<C8007k> list) {
        this.f15130l = list;
    }

    public void setEventPath(String str) {
        this.f15125g = str;
    }

    public void setEventSame(String str) {
        this.f15127i = str;
    }

    public void setEventSameRules(JSONObject jSONObject) {
        this.f15128j = jSONObject;
    }

    public void setEventValue(String str) {
        this.f15126h = str;
    }

    public void setPagePath(String str) {
        this.f15124f = str;
    }

    public void setPropagation(int i10) {
        this.f15129k = i10;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", m12117f());
            jSONObject.put("eventName", m12118g());
            jSONObject.put("eventValue", m12119h());
            jSONObject.put("pagePath", m12120i());
            jSONObject.put("eventPath", m12114c());
            jSONObject.put("eventParams", m12116e());
            jSONObject.put("eventSame", m12113b());
            jSONObject.put("eventSameRules", m12112a());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static C8018w m12111a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            C8018w c8018w = new C8018w();
            c8018w.setEventId(jSONObject.optString("eventId"));
            c8018w.setEventName(jSONObject.optString("eventName"));
            c8018w.setEventValue(jSONObject.optString("eventValue"));
            c8018w.setPagePath(jSONObject.optString("pagePath"));
            c8018w.setEventPath(jSONObject.optString("eventPath"));
            c8018w.setEventSame(jSONObject.optString("eventSame"));
            c8018w.setEventSameRules(jSONObject.optJSONObject("eventSameRules"));
            if (jSONObject.has("eventParams")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("eventParams");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray(jSONObject.optString("eventParams"));
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C8007k c8007k = new C8007k();
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    c8007k.setKey(jSONObject2.optString("key"));
                    c8007k.setXpath(jSONObject2.optString("xpath"));
                    arrayList.add(c8007k);
                }
                c8018w.setEventParams(arrayList);
            }
            return c8018w;
        } catch (Throwable unused) {
            return null;
        }
    }
}
