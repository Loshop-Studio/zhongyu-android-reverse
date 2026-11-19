package com.efs.sdk.base.p020a.p028f;

import com.efs.sdk.base.Constants;

/* renamed from: com.efs.sdk.base.a.f.a */
/* loaded from: classes2.dex */
public final class C2929a {

    /* renamed from: a */
    public String f1112a;

    /* renamed from: b */
    public byte f1113b;

    /* renamed from: c */
    public int f1114c = 0;

    /* renamed from: d */
    public String f1115d = Constants.CP_NONE;

    /* renamed from: e */
    public int f1116e = 1;

    /* renamed from: f */
    long f1117f = 0;

    /* renamed from: g */
    int f1118g = 1;

    public C2929a(String str, byte b4) {
        this.f1113b = (byte) 2;
        this.f1112a = str;
        if (b4 <= 0 || 3 < b4) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b4)));
        }
        this.f1113b = b4;
    }
}
