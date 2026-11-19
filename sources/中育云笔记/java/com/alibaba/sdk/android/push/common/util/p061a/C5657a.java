package com.alibaba.sdk.android.push.common.util.p061a;

import com.alibaba.sdk.android.error.ErrorCode;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.a */
/* loaded from: classes3.dex */
public class C5657a extends Exception {

    /* renamed from: a */
    private final ErrorCode f4268a;

    public C5657a(ErrorCode errorCode) {
        super(errorCode.toShortString());
        this.f4268a = errorCode;
    }

    /* renamed from: a */
    public ErrorCode m3628a() {
        return this.f4268a;
    }
}
