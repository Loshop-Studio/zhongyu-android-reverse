package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class HttpException extends IOException {

    /* renamed from: a */
    public final int f3308a;

    public HttpException(int i9) {
        this("Http request failed with status code: " + i9, i9);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i9) {
        this(str, i9, null);
    }

    public HttpException(String str, int i9, Throwable th) {
        super(str, th);
        this.f3308a = i9;
    }
}
