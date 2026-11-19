package com.lzy.okgo.exception;

/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {
    public HttpException(String str) {
        super(str);
    }

    /* renamed from: a */
    public static HttpException m9649a() {
        return new HttpException("network error! http response code is 404 or 5xx!");
    }
}
