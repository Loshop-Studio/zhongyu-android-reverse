package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5824d;
import com.bumptech.glide.load.engine.InterfaceC5844c;
import java.io.File;
import java.util.List;
import p125e1.AbstractC9070b;
import p168h0.InterfaceC9435b;
import p198j0.C9658k;
import p254n0.InterfaceC10300n;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes3.dex */
public class C5851j implements InterfaceC5844c, InterfaceC5824d.a {

    /* renamed from: c */
    public final InterfaceC5844c.a f4903c;

    /* renamed from: d */
    public final C5845d f4904d;

    /* renamed from: e */
    public int f4905e;

    /* renamed from: f */
    public int f4906f = -1;

    /* renamed from: g */
    public InterfaceC9435b f4907g;

    /* renamed from: h */
    public List f4908h;

    /* renamed from: i */
    public int f4909i;

    /* renamed from: j */
    public volatile InterfaceC10300n.a f4910j;

    /* renamed from: k */
    public File f4911k;

    /* renamed from: l */
    public C9658k f4912l;

    public C5851j(C5845d c5845d, InterfaceC5844c.a aVar) {
        this.f4904d = c5845d;
        this.f4903c = aVar;
    }

    /* renamed from: a */
    private boolean m4226a() {
        return this.f4909i < this.f4908h.size();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
    /* renamed from: b */
    public void mo4062b(Exception exc) {
        this.f4903c.mo4091b(this.f4912l, exc, this.f4910j.f24544c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c
    /* renamed from: c */
    public boolean mo4152c() {
        AbstractC9070b.m17864a("ResourceCacheGenerator.startNext");
        try {
            List listM4155c = this.f4904d.m4155c();
            boolean z10 = false;
            if (listM4155c.isEmpty()) {
                AbstractC9070b.m17868e();
                return false;
            }
            List listM4165m = this.f4904d.m4165m();
            if (listM4165m.isEmpty()) {
                if (File.class.equals(this.f4904d.m4170r())) {
                    AbstractC9070b.m17868e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f4904d.m4161i() + " to " + this.f4904d.m4170r());
            }
            while (true) {
                if (this.f4908h != null && m4226a()) {
                    this.f4910j = null;
                    while (!z10 && m4226a()) {
                        List list = this.f4908h;
                        int i10 = this.f4909i;
                        this.f4909i = i10 + 1;
                        this.f4910j = ((InterfaceC10300n) list.get(i10)).mo21421b(this.f4911k, this.f4904d.m4172t(), this.f4904d.m4158f(), this.f4904d.m4163k());
                        if (this.f4910j != null && this.f4904d.m4173u(this.f4910j.f24544c.mo4051a())) {
                            this.f4910j.f24544c.mo4057c(this.f4904d.m4164l(), this);
                            z10 = true;
                        }
                    }
                    AbstractC9070b.m17868e();
                    return z10;
                }
                int i11 = this.f4906f + 1;
                this.f4906f = i11;
                if (i11 >= listM4165m.size()) {
                    int i12 = this.f4905e + 1;
                    this.f4905e = i12;
                    if (i12 >= listM4155c.size()) {
                        AbstractC9070b.m17868e();
                        return false;
                    }
                    this.f4906f = 0;
                }
                InterfaceC9435b interfaceC9435b = (InterfaceC9435b) listM4155c.get(this.f4905e);
                Class cls = (Class) listM4165m.get(this.f4906f);
                this.f4912l = new C9658k(this.f4904d.m4154b(), interfaceC9435b, this.f4904d.m4168p(), this.f4904d.m4172t(), this.f4904d.m4158f(), this.f4904d.m4171s(cls), cls, this.f4904d.m4163k());
                File fileMo21107b = this.f4904d.m4156d().mo21107b(this.f4912l);
                this.f4911k = fileMo21107b;
                if (fileMo21107b != null) {
                    this.f4907g = interfaceC9435b;
                    this.f4908h = this.f4904d.m4162j(fileMo21107b);
                    this.f4909i = 0;
                }
            }
        } catch (Throwable th) {
            AbstractC9070b.m17868e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5844c
    public void cancel() {
        InterfaceC10300n.a aVar = this.f4910j;
        if (aVar != null) {
            aVar.f24544c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d.a
    /* renamed from: d */
    public void mo4063d(Object obj) {
        this.f4903c.mo4090a(this.f4907g, obj, this.f4910j.f24544c, DataSource.RESOURCE_DISK_CACHE, this.f4912l);
    }
}
