package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC4692d;
import com.bumptech.glide.load.engine.InterfaceC4712c;
import java.io.File;
import java.util.List;
import p024c1.AbstractC4483b;
import p053f0.InterfaceC6283b;
import p067h0.C6441k;
import p097l0.InterfaceC7280n;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes3.dex */
public class C4719j implements InterfaceC4712c, InterfaceC4692d.a {

    /* renamed from: a */
    public final InterfaceC4712c.a f2491a;

    /* renamed from: b */
    public final C4713d f2492b;

    /* renamed from: c */
    public int f2493c;

    /* renamed from: d */
    public int f2494d = -1;

    /* renamed from: e */
    public InterfaceC6283b f2495e;

    /* renamed from: f */
    public List f2496f;

    /* renamed from: g */
    public int f2497g;

    /* renamed from: h */
    public volatile InterfaceC7280n.a f2498h;

    /* renamed from: i */
    public File f2499i;

    /* renamed from: j */
    public C6441k f2500j;

    public C4719j(C4713d c4713d, InterfaceC4712c.a aVar) {
        this.f2492b = c4713d;
        this.f2491a = aVar;
    }

    /* renamed from: a */
    private boolean m2756a() {
        return this.f2497g < this.f2496f.size();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
    /* renamed from: c */
    public void mo2593c(Exception exc) {
        this.f2491a.mo2622b(this.f2500j, exc, this.f2498h.f9232c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c
    public void cancel() {
        InterfaceC7280n.a aVar = this.f2498h;
        if (aVar != null) {
            aVar.f9232c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC4712c
    /* renamed from: d */
    public boolean mo2682d() {
        AbstractC4483b.m1587a("ResourceCacheGenerator.startNext");
        try {
            List listM2685c = this.f2492b.m2685c();
            boolean z6 = false;
            if (listM2685c.isEmpty()) {
                AbstractC4483b.m1591e();
                return false;
            }
            List listM2695m = this.f2492b.m2695m();
            if (listM2695m.isEmpty()) {
                if (File.class.equals(this.f2492b.m2700r())) {
                    AbstractC4483b.m1591e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f2492b.m2691i() + " to " + this.f2492b.m2700r());
            }
            while (true) {
                if (this.f2496f != null && m2756a()) {
                    this.f2498h = null;
                    while (!z6 && m2756a()) {
                        List list = this.f2496f;
                        int i6 = this.f2497g;
                        this.f2497g = i6 + 1;
                        this.f2498h = ((InterfaceC7280n) list.get(i6)).mo8191b(this.f2499i, this.f2492b.m2702t(), this.f2492b.m2688f(), this.f2492b.m2693k());
                        if (this.f2498h != null && this.f2492b.m2703u(this.f2498h.f9232c.mo2580a())) {
                            this.f2498h.f9232c.mo2588e(this.f2492b.m2694l(), this);
                            z6 = true;
                        }
                    }
                    AbstractC4483b.m1591e();
                    return z6;
                }
                int i7 = this.f2494d + 1;
                this.f2494d = i7;
                if (i7 >= listM2695m.size()) {
                    int i8 = this.f2493c + 1;
                    this.f2493c = i8;
                    if (i8 >= listM2685c.size()) {
                        AbstractC4483b.m1591e();
                        return false;
                    }
                    this.f2494d = 0;
                }
                InterfaceC6283b interfaceC6283b = (InterfaceC6283b) listM2685c.get(this.f2493c);
                Class cls = (Class) listM2695m.get(this.f2494d);
                this.f2500j = new C6441k(this.f2492b.m2684b(), interfaceC6283b, this.f2492b.m2698p(), this.f2492b.m2702t(), this.f2492b.m2688f(), this.f2492b.m2701s(cls), cls, this.f2492b.m2693k());
                File fileMo7440b = this.f2492b.m2686d().mo7440b(this.f2500j);
                this.f2499i = fileMo7440b;
                if (fileMo7440b != null) {
                    this.f2495e = interfaceC6283b;
                    this.f2496f = this.f2492b.m2692j(fileMo7440b);
                    this.f2497g = 0;
                }
            }
        } catch (Throwable th) {
            AbstractC4483b.m1591e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d.a
    /* renamed from: f */
    public void mo2594f(Object obj) {
        this.f2491a.mo2621a(this.f2495e, obj, this.f2498h.f9232c, DataSource.RESOURCE_DISK_CACHE, this.f2500j);
    }
}
