package com.bumptech.glide.load.engine;

import p091e1.AbstractC7837i;
import p122h0.InterfaceC8082b;
import p152k0.InterfaceC8259j;

/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes3.dex */
public class C5492h implements InterfaceC8259j {

    /* renamed from: a */
    public final boolean f3485a;

    /* renamed from: b */
    public final boolean f3486b;

    /* renamed from: c */
    public final InterfaceC8259j f3487c;

    /* renamed from: d */
    public final a f3488d;

    /* renamed from: e */
    public final InterfaceC8082b f3489e;

    /* renamed from: f */
    public int f3490f;

    /* renamed from: g */
    public boolean f3491g;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    public interface a {
        /* renamed from: a */
        void mo3184a(InterfaceC8082b interfaceC8082b, C5492h c5492h);
    }

    public C5492h(InterfaceC8259j interfaceC8259j, boolean z9, boolean z10, InterfaceC8082b interfaceC8082b, a aVar) {
        this.f3487c = (InterfaceC8259j) AbstractC7837i.m12256d(interfaceC8259j);
        this.f3485a = z9;
        this.f3486b = z10;
        this.f3489e = interfaceC8082b;
        this.f3488d = (a) AbstractC7837i.m12256d(aVar);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return this.f3487c.mo3221a();
    }

    /* renamed from: b */
    public synchronized void m3222b() {
        if (this.f3491g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f3490f++;
    }

    /* renamed from: c */
    public InterfaceC8259j m3223c() {
        return this.f3487c;
    }

    /* renamed from: d */
    public boolean m3224d() {
        return this.f3485a;
    }

    /* renamed from: e */
    public void m3225e() {
        boolean z9;
        synchronized (this) {
            int i9 = this.f3490f;
            if (i9 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z9 = true;
            int i10 = i9 - 1;
            this.f3490f = i10;
            if (i10 != 0) {
                z9 = false;
            }
        }
        if (z9) {
            this.f3488d.mo3184a(this.f3489e, this);
        }
    }

    @Override // p152k0.InterfaceC8259j
    public Object get() {
        return this.f3487c.get();
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return this.f3487c.getSize();
    }

    @Override // p152k0.InterfaceC8259j
    public synchronized void recycle() {
        if (this.f3490f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f3491g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f3491g = true;
        if (this.f3486b) {
            this.f3487c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3485a + ", listener=" + this.f3488d + ", key=" + this.f3489e + ", acquired=" + this.f3490f + ", isRecycled=" + this.f3491g + ", resource=" + this.f3487c + '}';
    }
}
