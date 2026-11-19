package com.stormdzh.lame4android;

/* loaded from: classes4.dex */
public enum PCMFormat {
    PCM_8BIT(1, 3),
    PCM_16BIT(2, 2);


    /* renamed from: a */
    public int f4324a;

    /* renamed from: b */
    public int f4325b;

    PCMFormat(int i10, int i11) {
        this.f4324a = i10;
        this.f4325b = i11;
    }

    /* renamed from: a */
    public int m4108a() {
        return this.f4325b;
    }

    /* renamed from: b */
    public int m4109b() {
        return this.f4324a;
    }
}
