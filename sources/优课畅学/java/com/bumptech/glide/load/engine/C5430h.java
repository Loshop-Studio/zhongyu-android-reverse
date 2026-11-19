package com.bumptech.glide.load.engine;

import p116h0.AbstractC8706j;
import p160l.InterfaceC9228b;
import p182n.InterfaceC9357j;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes3.dex */
public class C5430h implements InterfaceC9357j {

    /* renamed from: a */
    public final boolean f3122a;

    /* renamed from: b */
    public final boolean f3123b;

    /* renamed from: c */
    public final InterfaceC9357j f3124c;

    /* renamed from: d */
    public final a f3125d;

    /* renamed from: e */
    public final InterfaceC9228b f3126e;

    /* renamed from: f */
    public int f3127f;

    /* renamed from: g */
    public boolean f3128g;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface a {
        /* renamed from: d */
        void mo2981d(InterfaceC9228b interfaceC9228b, C5430h c5430h);
    }

    public C5430h(InterfaceC9357j interfaceC9357j, boolean z10, boolean z11, InterfaceC9228b interfaceC9228b, a aVar) {
        this.f3124c = (InterfaceC9357j) AbstractC8706j.m14181d(interfaceC9357j);
        this.f3122a = z10;
        this.f3123b = z11;
        this.f3126e = interfaceC9228b;
        this.f3125d = (a) AbstractC8706j.m14181d(aVar);
    }

    /* renamed from: a */
    public synchronized void m3015a() {
        if (this.f3128g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3127f++;
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return this.f3124c.mo3016b();
    }

    /* renamed from: c */
    public InterfaceC9357j m3017c() {
        return this.f3124c;
    }

    /* renamed from: d */
    public boolean m3018d() {
        return this.f3122a;
    }

    /* renamed from: e */
    public void m3019e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f3127f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f3127f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f3125d.mo2981d(this.f3126e, this);
        }
    }

    @Override // p182n.InterfaceC9357j
    public Object get() {
        return this.f3124c.get();
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return this.f3124c.getSize();
    }

    @Override // p182n.InterfaceC9357j
    public synchronized void recycle() {
        if (this.f3127f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3128g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3128g = true;
        if (this.f3123b) {
            this.f3124c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3122a + ", listener=" + this.f3125d + ", key=" + this.f3126e + ", acquired=" + this.f3127f + ", isRecycled=" + this.f3128g + ", resource=" + this.f3124c + '}';
    }
}
