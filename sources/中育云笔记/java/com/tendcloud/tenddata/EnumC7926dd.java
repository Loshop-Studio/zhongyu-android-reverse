package com.tendcloud.tenddata;

import java.net.HttpURLConnection;

/* renamed from: com.tendcloud.tenddata.dd */
/* loaded from: classes5.dex */
public enum EnumC7926dd {
    GET(false),
    POST(true);


    /* renamed from: c */
    private final boolean f14684c;

    EnumC7926dd(boolean z10) {
        this.f14684c = z10;
    }

    /* renamed from: a */
    public final void m11679a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.setRequestMethod(name());
            httpURLConnection.setDoOutput(this.f14684c);
            httpURLConnection.setDoInput(true);
        } catch (Throwable unused) {
        }
    }
}
