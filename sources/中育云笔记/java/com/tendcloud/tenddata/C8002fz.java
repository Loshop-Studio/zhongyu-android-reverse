package com.tendcloud.tenddata;

import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.fz */
/* loaded from: classes5.dex */
public class C8002fz extends JSONObject {

    /* renamed from: a */
    private static final String f15010a = "category";

    /* renamed from: b */
    private static final String f15011b = "content";

    private C8002fz() {
    }

    /* renamed from: a */
    public static C8002fz m12022a() {
        return new C8002fz();
    }

    /* renamed from: b */
    public C8002fz m12024b(String str) {
        try {
            put("content", str);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set content error ", th);
            return this;
        }
    }

    /* renamed from: a */
    public C8002fz m12023a(String str) {
        try {
            put(f15010a, str);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set category error ", th);
            return this;
        }
    }
}
