package com.tendcloud.tenddata;

import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.ff */
/* loaded from: classes5.dex */
public class C7982ff extends AbstractC7987fk {

    /* renamed from: a */
    static C7982ff f14935a;

    private C7982ff() {
    }

    /* renamed from: a */
    public static synchronized C7982ff m11972a() {
        try {
            if (f14935a == null) {
                f14935a = new C7982ff();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14935a;
    }

    @Override // com.tendcloud.tenddata.AbstractC7987fk
    /* renamed from: b */
    public Object mo11973b() {
        String strM11402m;
        try {
            if (!f14935a.f14946b.has("account") && (strM11402m = C7897cb.m11402m()) != null) {
                f14935a.m11979a("account", (Object) new JSONObject(strM11402m));
            }
        } catch (Throwable unused) {
        }
        return super.mo11973b();
    }

    public void setCurrentPageName(String str) {
        m11979a("page", str);
    }

    public void setDeepLink(String str) {
        try {
            m11979a("deeplink", str);
        } catch (Throwable unused) {
        }
    }

    public void setProfile(JSONObject jSONObject) {
        m11979a("account", (Object) jSONObject);
    }

    public void setSessionId(String str) {
        m11979a("sessionId", str);
    }

    public void setSessionStartTime(long j10) {
        m11979a("sessionStartTime", Long.valueOf(j10));
    }

    public void setSubprofile(JSONObject jSONObject) {
        m11979a("subaccount", (Object) jSONObject);
    }
}
