package com.stormdzh.lame4android;

/* loaded from: classes4.dex */
public enum PCMFormat {
    PCM_8BIT(1, 3),
    PCM_16BIT(2, 2);


    /* renamed from: a */
    public int f5419a;

    /* renamed from: b */
    public int f5420b;

    PCMFormat(int i9, int i10) {
        this.f5419a = i9;
        this.f5420b = i10;
    }

    /* renamed from: a */
    public int m4699a() {
        return this.f5420b;
    }

    /* renamed from: c */
    public int m4700c() {
        return this.f5419a;
    }
}
