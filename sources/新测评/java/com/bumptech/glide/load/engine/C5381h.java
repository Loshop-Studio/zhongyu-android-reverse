package com.bumptech.glide.load.engine;

import p117i1.AbstractC7651j;
import p162m0.InterfaceC8537b;
import p184o0.InterfaceC8690j;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes3.dex */
public class C5381h implements InterfaceC8690j {

    /* renamed from: a */
    public final boolean f3689a;

    /* renamed from: b */
    public final boolean f3690b;

    /* renamed from: c */
    public final InterfaceC8690j f3691c;

    /* renamed from: d */
    public final a f3692d;

    /* renamed from: e */
    public final InterfaceC8537b f3693e;

    /* renamed from: f */
    public int f3694f;

    /* renamed from: g */
    public boolean f3695g;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface a {
        /* renamed from: c */
        void mo3534c(InterfaceC8537b interfaceC8537b, C5381h c5381h);
    }

    public C5381h(InterfaceC8690j interfaceC8690j, boolean z9, boolean z10, InterfaceC8537b interfaceC8537b, a aVar) {
        this.f3691c = (InterfaceC8690j) AbstractC7651j.m12683d(interfaceC8690j);
        this.f3689a = z9;
        this.f3690b = z10;
        this.f3693e = interfaceC8537b;
        this.f3692d = (a) AbstractC7651j.m12683d(aVar);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return this.f3691c.mo3569a();
    }

    /* renamed from: b */
    public synchronized void m3570b() {
        if (this.f3695g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3694f++;
    }

    /* renamed from: c */
    public InterfaceC8690j m3571c() {
        return this.f3691c;
    }

    /* renamed from: d */
    public boolean m3572d() {
        return this.f3689a;
    }

    /* renamed from: e */
    public void m3573e() {
        boolean z9;
        synchronized (this) {
            int i10 = this.f3694f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z9 = true;
            int i11 = i10 - 1;
            this.f3694f = i11;
            if (i11 != 0) {
                z9 = false;
            }
        }
        if (z9) {
            this.f3692d.mo3534c(this.f3693e, this);
        }
    }

    @Override // p184o0.InterfaceC8690j
    public Object get() {
        return this.f3691c.get();
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return this.f3691c.getSize();
    }

    @Override // p184o0.InterfaceC8690j
    public synchronized void recycle() {
        if (this.f3694f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3695g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3695g = true;
        if (this.f3690b) {
            this.f3691c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3689a + ", listener=" + this.f3692d + ", key=" + this.f3693e + ", acquired=" + this.f3694f + ", isRecycled=" + this.f3695g + ", resource=" + this.f3691c + '}';
    }
}
