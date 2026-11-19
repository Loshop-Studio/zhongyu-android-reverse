package com.bumptech.glide.load.engine;

import p016b1.AbstractC4408j;
import p053f0.InterfaceC6283b;
import p067h0.InterfaceC6440j;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes3.dex */
public class C4717h implements InterfaceC6440j {

    /* renamed from: a */
    public final boolean f2480a;

    /* renamed from: b */
    public final boolean f2481b;

    /* renamed from: c */
    public final InterfaceC6440j f2482c;

    /* renamed from: d */
    public final a f2483d;

    /* renamed from: e */
    public final InterfaceC6283b f2484e;

    /* renamed from: f */
    public int f2485f;

    /* renamed from: g */
    public boolean f2486g;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface a {
        /* renamed from: c */
        void mo2714c(InterfaceC6283b interfaceC6283b, C4717h c4717h);
    }

    public C4717h(InterfaceC6440j interfaceC6440j, boolean z6, boolean z7, InterfaceC6283b interfaceC6283b, a aVar) {
        this.f2482c = (InterfaceC6440j) AbstractC4408j.m1438d(interfaceC6440j);
        this.f2480a = z6;
        this.f2481b = z7;
        this.f2484e = interfaceC6283b;
        this.f2483d = (a) AbstractC4408j.m1438d(aVar);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return this.f2482c.mo2749a();
    }

    /* renamed from: b */
    public synchronized void m2750b() {
        if (this.f2486g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f2485f++;
    }

    /* renamed from: c */
    public InterfaceC6440j m2751c() {
        return this.f2482c;
    }

    /* renamed from: d */
    public boolean m2752d() {
        return this.f2480a;
    }

    /* renamed from: e */
    public void m2753e() {
        boolean z6;
        synchronized (this) {
            int i6 = this.f2485f;
            if (i6 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z6 = true;
            int i7 = i6 - 1;
            this.f2485f = i7;
            if (i7 != 0) {
                z6 = false;
            }
        }
        if (z6) {
            this.f2483d.mo2714c(this.f2484e, this);
        }
    }

    @Override // p067h0.InterfaceC6440j
    public Object get() {
        return this.f2482c.get();
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return this.f2482c.getSize();
    }

    @Override // p067h0.InterfaceC6440j
    public synchronized void recycle() {
        if (this.f2485f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f2486g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f2486g = true;
        if (this.f2481b) {
            this.f2482c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f2480a + ", listener=" + this.f2483d + ", key=" + this.f2484e + ", acquired=" + this.f2485f + ", isRecycled=" + this.f2486g + ", resource=" + this.f2482c + '}';
    }
}
