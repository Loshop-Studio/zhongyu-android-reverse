package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class HttpException extends IOException {

    /* renamed from: a */
    public final int f654a;

    public HttpException(int i4) {
        this("Http request failed with status code: " + i4, i4);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i4) {
        this(str, i4, null);
    }

    public HttpException(String str, int i4, Throwable th) {
        super(str, th);
        this.f654a = i4;
    }
}
