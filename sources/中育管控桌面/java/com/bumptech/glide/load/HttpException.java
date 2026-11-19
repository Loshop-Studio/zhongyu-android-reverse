package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class HttpException extends IOException {

    /* renamed from: a */
    public final int f2268a;

    public HttpException(int i6) {
        this("Http request failed", i6);
    }

    public HttpException(String str, int i6) {
        this(str, i6, null);
    }

    public HttpException(String str, int i6, Throwable th) {
        super(str + ", status code: " + i6, th);
        this.f2268a = i6;
    }
}
