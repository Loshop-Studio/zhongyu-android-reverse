package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.j1 */
/* loaded from: classes3.dex */
public final class C4118j1 extends Thread {

    /* renamed from: a */
    public final int f3839a = 4;

    /* renamed from: b */
    public int f3840b;

    /* renamed from: c */
    public String f3841c;

    /* renamed from: d */
    public byte[] f3842d;

    /* renamed from: e */
    public final /* synthetic */ C4143w f3843e;

    public C4118j1(C4143w c4143w) {
        this.f3843e = c4143w;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (this.f3839a != 4) {
            return;
        }
        this.f3843e.m3398a(this.f3840b, this.f3841c, this.f3842d, (InterfaceC4141v) null);
    }
}
