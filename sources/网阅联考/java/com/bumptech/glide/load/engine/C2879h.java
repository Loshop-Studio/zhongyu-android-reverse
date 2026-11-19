package com.bumptech.glide.load.engine;

import p062g0.AbstractC3749i;
import p076j.InterfaceC3792b;
import p093m.InterfaceC4361j;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes2.dex */
public class C2879h implements InterfaceC4361j {

    /* renamed from: a */
    public final boolean f831a;

    /* renamed from: b */
    public final boolean f832b;

    /* renamed from: c */
    public final InterfaceC4361j f833c;

    /* renamed from: d */
    public final a f834d;

    /* renamed from: e */
    public final InterfaceC3792b f835e;

    /* renamed from: f */
    public int f836f;

    /* renamed from: g */
    public boolean f837g;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface a {
        /* renamed from: d */
        void mo1862d(InterfaceC3792b interfaceC3792b, C2879h c2879h);
    }

    public C2879h(InterfaceC4361j interfaceC4361j, boolean z3, boolean z4, InterfaceC3792b interfaceC3792b, a aVar) {
        this.f833c = (InterfaceC4361j) AbstractC3749i.m4768d(interfaceC4361j);
        this.f831a = z3;
        this.f832b = z4;
        this.f835e = interfaceC3792b;
        this.f834d = (a) AbstractC3749i.m4768d(aVar);
    }

    /* renamed from: a */
    public synchronized void m1897a() {
        if (this.f837g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f836f++;
    }

    @Override // p093m.InterfaceC4361j
    /* renamed from: b */
    public Class mo1898b() {
        return this.f833c.mo1898b();
    }

    /* renamed from: c */
    public InterfaceC4361j m1899c() {
        return this.f833c;
    }

    /* renamed from: d */
    public boolean m1900d() {
        return this.f831a;
    }

    /* renamed from: e */
    public void m1901e() {
        boolean z3;
        synchronized (this) {
            int i4 = this.f836f;
            if (i4 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z3 = true;
            int i5 = i4 - 1;
            this.f836f = i5;
            if (i5 != 0) {
                z3 = false;
            }
        }
        if (z3) {
            this.f834d.mo1862d(this.f835e, this);
        }
    }

    @Override // p093m.InterfaceC4361j
    public Object get() {
        return this.f833c.get();
    }

    @Override // p093m.InterfaceC4361j
    public int getSize() {
        return this.f833c.getSize();
    }

    @Override // p093m.InterfaceC4361j
    public synchronized void recycle() {
        if (this.f836f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f837g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f837g = true;
        if (this.f832b) {
            this.f833c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f831a + ", listener=" + this.f834d + ", key=" + this.f835e + ", acquired=" + this.f836f + ", isRecycled=" + this.f837g + ", resource=" + this.f833c + '}';
    }
}
