package com.tendcloud.tenddata;

import org.json.JSONObject;

/* loaded from: classes5.dex */
public class TalkingDataSearch extends JSONObject {

    /* renamed from: a */
    private static final String f14209a = "category";

    /* renamed from: b */
    private static final String f14210b = "content";

    private TalkingDataSearch() {
    }

    public static TalkingDataSearch createSearch() {
        return new TalkingDataSearch();
    }

    public TalkingDataSearch setCategory(String str) {
        try {
            put(f14209a, str);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set category error ", th);
            return this;
        }
    }

    public TalkingDataSearch setContent(String str) {
        try {
            put("content", str);
            return this;
        } catch (Throwable th) {
            C7896ca.m11370a("set content error ", th);
            return this;
        }
    }
}
