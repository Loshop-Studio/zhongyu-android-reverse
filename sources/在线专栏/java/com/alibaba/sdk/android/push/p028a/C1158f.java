package com.alibaba.sdk.android.push.p028a;

import com.alibaba.sdk.android.error.ErrorCode;

/* renamed from: com.alibaba.sdk.android.push.a.f */
/* loaded from: classes.dex */
public class C1158f extends Exception {

    /* renamed from: a */
    private final ErrorCode f6688a;

    public C1158f(ErrorCode errorCode) {
        super(errorCode.toShortString());
        this.f6688a = errorCode;
    }

    /* renamed from: a */
    public ErrorCode m5155a() {
        return this.f6688a;
    }
}
