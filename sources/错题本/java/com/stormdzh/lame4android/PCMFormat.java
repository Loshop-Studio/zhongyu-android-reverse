package com.stormdzh.lame4android;

/* loaded from: classes3.dex */
public enum PCMFormat {
    PCM_8BIT(1, 3),
    PCM_16BIT(2, 2);


    /* renamed from: a */
    private int f3215a;

    /* renamed from: b */
    private int f3216b;

    PCMFormat(int i, int i8) {
        this.f3215a = i;
        this.f3216b = i8;
    }

    public int getAudioFormat() {
        return this.f3216b;
    }

    public int getBytesPerFrame() {
        return this.f3215a;
    }

    public void setAudioFormat(int i) {
        this.f3216b = i;
    }

    public void setBytesPerFrame(int i) {
        this.f3215a = i;
    }
}
