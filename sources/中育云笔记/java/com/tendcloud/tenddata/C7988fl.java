package com.tendcloud.tenddata;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fl */
/* loaded from: classes5.dex */
public class C7988fl extends AbstractC7987fk {

    /* renamed from: a */
    public static final String f14947a = "TalkingData";

    /* renamed from: c */
    public static final String f14948c = "SaaS";

    /* renamed from: d */
    public static final int f14949d = 0;

    /* renamed from: e */
    public static final int f14950e = 1;

    /* renamed from: f */
    public static final int f14951f = 2;

    /* renamed from: g */
    public static final int f14952g = 3;

    /* renamed from: h */
    public static final int f14953h = 4;

    /* renamed from: i */
    public static final int f14954i = 5;

    /* renamed from: j */
    public static final int f14955j = 6;

    /* renamed from: k */
    public static final int f14956k = 7;

    /* renamed from: l */
    public static final int f14957l = 8;

    /* renamed from: n */
    private static String f14958n = "";

    /* renamed from: o */
    private static int f14959o = 4;

    /* renamed from: m */
    private final String f14960m = "Android";

    public C7988fl() {
        m11979a("version", (Object) 5);
        m11979a("minorVersion", (Object) 0);
        m11979a("build", (Object) 17);
        if (!C7912cq.m11608b(C7843ab.f14323w)) {
            try {
                m11979a("jobNum", Integer.valueOf(Integer.parseInt(C7843ab.f14323w)));
            } catch (Throwable unused) {
            }
        }
        m11979a("partner", f14948c);
        m11979a("platform", "Android");
        m11979a("type", f14947a);
        m11979a("framework", f14958n);
        int i10 = f14959o;
        if (i10 > 0) {
            m11979a(TypedValues.TransitionType.S_FROM, Integer.valueOf(i10));
        }
    }

    /* renamed from: a */
    public String m11982a() {
        return f14958n;
    }

    public void setFrameWork(String str) {
        f14958n = str;
    }

    /* renamed from: a */
    public void m11983a(String str, String str2, String str3) throws JSONException {
        JSONArray jSONArray;
        if (this.f14946b.isNull("features")) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = this.f14946b.getJSONArray("features");
            } catch (JSONException e10) {
                e10.printStackTrace();
                jSONArray = null;
            }
        }
        if (jSONArray != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, str);
                jSONObject.put("version", str2);
                jSONObject.put("minorVersion", str3);
                jSONArray.put(jSONObject);
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            m11979a("features", jSONArray);
        }
    }
}
