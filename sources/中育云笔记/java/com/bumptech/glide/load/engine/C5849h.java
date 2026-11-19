package com.bumptech.glide.load.engine;

import p109d1.AbstractC8909j;
import p168h0.InterfaceC9435b;
import p198j0.InterfaceC9657j;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes3.dex */
public class C5849h implements InterfaceC9657j {

    /* renamed from: c */
    public final boolean f4892c;

    /* renamed from: d */
    public final boolean f4893d;

    /* renamed from: e */
    public final InterfaceC9657j f4894e;

    /* renamed from: f */
    public final a f4895f;

    /* renamed from: g */
    public final InterfaceC9435b f4896g;

    /* renamed from: h */
    public int f4897h;

    /* renamed from: i */
    public boolean f4898i;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface a {
        /* renamed from: a */
        void mo4182a(InterfaceC9435b interfaceC9435b, C5849h c5849h);
    }

    public C5849h(InterfaceC9657j interfaceC9657j, boolean z10, boolean z11, InterfaceC9435b interfaceC9435b, a aVar) {
        this.f4894e = (InterfaceC9657j) AbstractC8909j.m17468d(interfaceC9657j);
        this.f4892c = z10;
        this.f4893d = z11;
        this.f4896g = interfaceC9435b;
        this.f4895f = (a) AbstractC8909j.m17468d(aVar);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return this.f4894e.mo4219a();
    }

    /* renamed from: b */
    public synchronized void m4220b() {
        if (this.f4898i) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f4897h++;
    }

    /* renamed from: c */
    public InterfaceC9657j m4221c() {
        return this.f4894e;
    }

    /* renamed from: d */
    public boolean m4222d() {
        return this.f4892c;
    }

    /* renamed from: e */
    public void m4223e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f4897h;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f4897h = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f4895f.mo4182a(this.f4896g, this);
        }
    }

    @Override // p198j0.InterfaceC9657j
    public Object get() {
        return this.f4894e.get();
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return this.f4894e.getSize();
    }

    @Override // p198j0.InterfaceC9657j
    public synchronized void recycle() {
        if (this.f4897h > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f4898i) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f4898i = true;
        if (this.f4893d) {
            this.f4894e.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f4892c + ", listener=" + this.f4895f + ", key=" + this.f4896g + ", acquired=" + this.f4897h + ", isRecycled=" + this.f4898i + ", resource=" + this.f4894e + '}';
    }
}
