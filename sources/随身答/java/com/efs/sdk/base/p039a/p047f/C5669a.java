package com.efs.sdk.base.p039a.p047f;

/* renamed from: com.efs.sdk.base.a.f.a */
/* loaded from: classes3.dex */
public final class C5669a {

    /* renamed from: a */
    public String f4716a;

    /* renamed from: b */
    public byte f4717b;

    /* renamed from: c */
    public int f4718c = 0;

    /* renamed from: d */
    public String f4719d = "none";

    /* renamed from: e */
    public int f4720e = 1;

    /* renamed from: f */
    long f4721f = 0;

    /* renamed from: g */
    int f4722g = 1;

    public C5669a(String str, byte b10) {
        this.f4717b = (byte) 2;
        this.f4716a = str;
        if (b10 <= 0 || 3 < b10) {
            throw new IllegalArgumentException("log protocol flag invalid : ".concat(String.valueOf((int) b10)));
        }
        this.f4717b = b10;
    }
}
