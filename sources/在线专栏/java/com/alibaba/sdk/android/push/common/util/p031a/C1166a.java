package com.alibaba.sdk.android.push.common.util.p031a;

import com.alibaba.sdk.android.error.ErrorCode;

/* renamed from: com.alibaba.sdk.android.push.common.util.a.a */
/* loaded from: classes.dex */
public class C1166a extends Exception {

    /* renamed from: a */
    private final ErrorCode f6744a;

    public C1166a(ErrorCode errorCode) {
        super(errorCode.toShortString());
        this.f6744a = errorCode;
    }

    /* renamed from: a */
    public ErrorCode m5177a() {
        return this.f6744a;
    }
}
