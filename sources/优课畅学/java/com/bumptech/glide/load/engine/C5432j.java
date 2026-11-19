package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5405d;
import com.bumptech.glide.load.engine.InterfaceC5425c;
import java.io.File;
import java.util.List;
import p127i0.AbstractC8749b;
import p160l.InterfaceC9228b;
import p182n.C9358k;
import p226r.InterfaceC9888n;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes3.dex */
public class C5432j implements InterfaceC5425c, InterfaceC5405d.a {

    /* renamed from: a */
    public final InterfaceC5425c.a f3133a;

    /* renamed from: b */
    public final C5426d f3134b;

    /* renamed from: c */
    public int f3135c;

    /* renamed from: d */
    public int f3136d = -1;

    /* renamed from: e */
    public InterfaceC9228b f3137e;

    /* renamed from: f */
    public List f3138f;

    /* renamed from: g */
    public int f3139g;

    /* renamed from: h */
    public volatile InterfaceC9888n.a f3140h;

    /* renamed from: i */
    public File f3141i;

    /* renamed from: j */
    public C9358k f3142j;

    public C5432j(C5426d c5426d, InterfaceC5425c.a aVar) {
        this.f3134b = c5426d;
        this.f3133a = aVar;
    }

    /* renamed from: b */
    private boolean m3022b() {
        return this.f3139g < this.f3138f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c
    /* renamed from: a */
    public boolean mo2948a() {
        AbstractC8749b.m14415a("ResourceCacheGenerator.startNext");
        try {
            List listM2951c = this.f3134b.m2951c();
            boolean z10 = false;
            if (listM2951c.isEmpty()) {
                AbstractC8749b.m14419e();
                return false;
            }
            List listM2961m = this.f3134b.m2961m();
            if (listM2961m.isEmpty()) {
                if (File.class.equals(this.f3134b.m2966r())) {
                    AbstractC8749b.m14419e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f3134b.m2957i() + " to " + this.f3134b.m2966r());
            }
            while (true) {
                if (this.f3138f != null && m3022b()) {
                    this.f3140h = null;
                    while (!z10 && m3022b()) {
                        List list = this.f3138f;
                        int i10 = this.f3139g;
                        this.f3139g = i10 + 1;
                        this.f3140h = ((InterfaceC9888n) list.get(i10)).mo18446b(this.f3141i, this.f3134b.m2968t(), this.f3134b.m2954f(), this.f3134b.m2959k());
                        if (this.f3140h != null && this.f3134b.m2969u(this.f3140h.f19821c.mo2846a())) {
                            this.f3140h.f19821c.mo2853d(this.f3134b.m2960l(), this);
                            z10 = true;
                        }
                    }
                    AbstractC8749b.m14419e();
                    return z10;
                }
                int i11 = this.f3136d + 1;
                this.f3136d = i11;
                if (i11 >= listM2961m.size()) {
                    int i12 = this.f3135c + 1;
                    this.f3135c = i12;
                    if (i12 >= listM2951c.size()) {
                        AbstractC8749b.m14419e();
                        return false;
                    }
                    this.f3136d = 0;
                }
                InterfaceC9228b interfaceC9228b = (InterfaceC9228b) listM2951c.get(this.f3135c);
                Class cls = (Class) listM2961m.get(this.f3136d);
                this.f3142j = new C9358k(this.f3134b.m2950b(), interfaceC9228b, this.f3134b.m2964p(), this.f3134b.m2968t(), this.f3134b.m2954f(), this.f3134b.m2967s(cls), cls, this.f3134b.m2959k());
                File fileMo18170a = this.f3134b.m2952d().mo18170a(this.f3142j);
                this.f3141i = fileMo18170a;
                if (fileMo18170a != null) {
                    this.f3137e = interfaceC9228b;
                    this.f3138f = this.f3134b.m2958j(fileMo18170a);
                    this.f3139g = 0;
                }
            }
        } catch (Throwable th) {
            AbstractC8749b.m14419e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
    /* renamed from: c */
    public void mo2858c(Exception exc) {
        this.f3133a.mo2889d(this.f3142j, exc, this.f3140h.f19821c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5425c
    public void cancel() {
        InterfaceC9888n.a aVar = this.f3140h;
        if (aVar != null) {
            aVar.f19821c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d.a
    /* renamed from: e */
    public void mo2859e(Object obj) {
        this.f3133a.mo2887b(this.f3137e, obj, this.f3140h.f19821c, DataSource.RESOURCE_DISK_CACHE, this.f3142j);
    }
}
