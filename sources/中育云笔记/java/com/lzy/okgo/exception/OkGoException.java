package com.lzy.okgo.exception;

/* loaded from: classes5.dex */
public class OkGoException extends Exception {
    public OkGoException(String str) {
        super(str);
    }

    /* renamed from: a */
    public static OkGoException m9650a() {
        return new OkGoException("breakpoint file has expired!");
    }

    /* renamed from: c */
    public static OkGoException m9651c() {
        return new OkGoException("breakpoint file does not exist!");
    }

    /* renamed from: d */
    public static OkGoException m9652d() {
        return new OkGoException("unknown exception!");
    }
}
