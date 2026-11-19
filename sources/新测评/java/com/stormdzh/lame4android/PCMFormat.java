package com.stormdzh.lame4android;

/* loaded from: classes4.dex */
public enum PCMFormat {
    PCM_8BIT(1, 3),
    PCM_16BIT(2, 2);


    /* renamed from: a */
    public int f4811a;

    /* renamed from: b */
    public int f4812b;

    PCMFormat(int i10, int i11) {
        this.f4811a = i10;
        this.f4812b = i11;
    }

    /* renamed from: a */
    public int m4494a() {
        return this.f4812b;
    }

    /* renamed from: f */
    public int m4495f() {
        return this.f4811a;
    }
}
