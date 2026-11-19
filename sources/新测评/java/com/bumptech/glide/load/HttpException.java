package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class HttpException extends IOException {

    /* renamed from: a */
    public final int f3477a;

    public HttpException(int i10) {
        this("Http request failed", i10);
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
        this.f3477a = i10;
    }
}
