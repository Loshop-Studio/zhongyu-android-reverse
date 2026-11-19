package com.alibaba.sdk.android.push.p058a;

import com.alibaba.sdk.android.error.ErrorCode;

/* renamed from: com.alibaba.sdk.android.push.a.f */
/* loaded from: classes3.dex */
public class C5649f extends Exception {

    /* renamed from: a */
    private final ErrorCode f4212a;

    public C5649f(ErrorCode errorCode) {
        super(errorCode.toShortString());
        this.f4212a = errorCode;
    }

    /* renamed from: a */
    public ErrorCode m3606a() {
        return this.f4212a;
    }
}
