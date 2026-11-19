package com.tendcloud.tenddata;

/* renamed from: com.tendcloud.tenddata.ay */
/* loaded from: classes5.dex */
public class C7866ay extends Exception {

    /* renamed from: a */
    private static final long f14394a = 3731842424390998726L;

    /* renamed from: b */
    private int f14395b;

    public C7866ay(int i10) {
        this.f14395b = i10;
    }

    /* renamed from: a */
    public int m11259a() {
        return this.f14395b;
    }

    public C7866ay(int i10, String str) {
        super(str);
        this.f14395b = i10;
    }

    public C7866ay(int i10, Throwable th) {
        super(th);
        this.f14395b = i10;
    }

    public C7866ay(int i10, String str, Throwable th) {
        super(str, th);
        this.f14395b = i10;
    }
}
