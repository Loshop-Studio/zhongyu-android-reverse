package com.efs.sdk.base.p035a.p043f;

import com.efs.sdk.base.Constants;

/* renamed from: com.efs.sdk.base.a.f.a */
/* loaded from: classes.dex */
public final class C1301a {

    /* renamed from: a */
    public String f7082a;

    /* renamed from: b */
    public byte f7083b;

    /* renamed from: c */
    public int f7084c = 0;

    /* renamed from: d */
    public String f7085d = Constants.CP_NONE;

    /* renamed from: e */
    public int f7086e = 1;

    /* renamed from: f */
    long f7087f = 0;

    /* renamed from: g */
    int f7088g = 1;

    C1301a(String str, byte b4) {
        this.f7083b = (byte) 2;
        this.f7082a = str;
        if (b4 <= 0 || 3 < b4) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b4)));
        }
        this.f7083b = b4;
    }
}
