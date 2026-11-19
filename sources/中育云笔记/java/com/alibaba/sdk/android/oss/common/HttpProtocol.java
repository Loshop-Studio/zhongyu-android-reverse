package com.alibaba.sdk.android.oss.common;

import anet.channel.util.HttpConstant;

/* loaded from: classes3.dex */
public enum HttpProtocol {
    HTTP(HttpConstant.HTTP),
    HTTPS("https");

    private final String httpProtocol;

    HttpProtocol(String str) {
        this.httpProtocol = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.httpProtocol;
    }
}
