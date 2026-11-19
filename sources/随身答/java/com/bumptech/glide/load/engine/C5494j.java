package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.InterfaceC5487c;
import java.io.File;
import java.util.List;
import p122h0.InterfaceC8082b;
import p132i0.InterfaceC8115d;
import p152k0.C8260k;
import p194o0.InterfaceC9146m;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes3.dex */
public class C5494j implements InterfaceC5487c, InterfaceC8115d.a {

    /* renamed from: a */
    public final InterfaceC5487c.a f3496a;

    /* renamed from: b */
    public final C5488d f3497b;

    /* renamed from: c */
    public int f3498c;

    /* renamed from: d */
    public int f3499d = -1;

    /* renamed from: e */
    public InterfaceC8082b f3500e;

    /* renamed from: f */
    public List f3501f;

    /* renamed from: g */
    public int f3502g;

    /* renamed from: h */
    public volatile InterfaceC9146m.a f3503h;

    /* renamed from: i */
    public File f3504i;

    /* renamed from: j */
    public C8260k f3505j;

    public C5494j(C5488d c5488d, InterfaceC5487c.a aVar) {
        this.f3497b = c5488d;
        this.f3496a = aVar;
    }

    /* renamed from: b */
    private boolean m3228b() {
        return this.f3502g < this.f3501f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c
    /* renamed from: a */
    public boolean mo3153a() {
        List listM3158c = this.f3497b.m3158c();
        boolean z9 = false;
        if (listM3158c.isEmpty()) {
            return false;
        }
        List listM3168m = this.f3497b.m3168m();
        if (listM3168m.isEmpty()) {
            if (File.class.equals(this.f3497b.m3172q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f3497b.m3164i() + " to " + this.f3497b.m3172q());
        }
        while (true) {
            if (this.f3501f != null && m3228b()) {
                this.f3503h = null;
                while (!z9 && m3228b()) {
                    List list = this.f3501f;
                    int i9 = this.f3502g;
                    this.f3502g = i9 + 1;
                    this.f3503h = ((InterfaceC9146m) list.get(i9)).mo14656b(this.f3504i, this.f3497b.m3174s(), this.f3497b.m3161f(), this.f3497b.m3166k());
                    if (this.f3503h != null && this.f3497b.m3175t(this.f3503h.f15426c.mo12978a())) {
                        this.f3503h.f15426c.mo12985d(this.f3497b.m3167l(), this);
                        z9 = true;
                    }
                }
                return z9;
            }
            int i10 = this.f3499d + 1;
            this.f3499d = i10;
            if (i10 >= listM3168m.size()) {
                int i11 = this.f3498c + 1;
                this.f3498c = i11;
                if (i11 >= listM3158c.size()) {
                    return false;
                }
                this.f3499d = 0;
            }
            InterfaceC8082b interfaceC8082b = (InterfaceC8082b) listM3158c.get(this.f3498c);
            Class cls = (Class) listM3168m.get(this.f3499d);
            this.f3505j = new C8260k(this.f3497b.m3157b(), interfaceC8082b, this.f3497b.m3170o(), this.f3497b.m3174s(), this.f3497b.m3161f(), this.f3497b.m3173r(cls), cls, this.f3497b.m3166k());
            File fileMo14251b = this.f3497b.m3159d().mo14251b(this.f3505j);
            this.f3504i = fileMo14251b;
            if (fileMo14251b != null) {
                this.f3500e = interfaceC8082b;
                this.f3501f = this.f3497b.m3165j(fileMo14251b);
                this.f3502g = 0;
            }
        }
    }

    @Override // p132i0.InterfaceC8115d.a
    /* renamed from: c */
    public void mo3154c(Exception exc) {
        this.f3496a.mo3096d(this.f3505j, exc, this.f3503h.f15426c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c
    public void cancel() {
        InterfaceC9146m.a aVar = this.f3503h;
        if (aVar != null) {
            aVar.f15426c.cancel();
        }
    }

    @Override // p132i0.InterfaceC8115d.a
    /* renamed from: f */
    public void mo3155f(Object obj) {
        this.f3496a.mo3097e(this.f3500e, obj, this.f3503h.f15426c, DataSource.RESOURCE_DISK_CACHE, this.f3505j);
    }
}
