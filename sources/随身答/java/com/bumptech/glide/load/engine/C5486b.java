package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.InterfaceC5487c;
import java.io.File;
import java.util.List;
import p122h0.InterfaceC8082b;
import p132i0.InterfaceC8115d;
import p152k0.C8250a;
import p194o0.InterfaceC9146m;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes3.dex */
public class C5486b implements InterfaceC5487c, InterfaceC8115d.a {

    /* renamed from: a */
    public final List f3395a;

    /* renamed from: b */
    public final C5488d f3396b;

    /* renamed from: c */
    public final InterfaceC5487c.a f3397c;

    /* renamed from: d */
    public int f3398d;

    /* renamed from: e */
    public InterfaceC8082b f3399e;

    /* renamed from: f */
    public List f3400f;

    /* renamed from: g */
    public int f3401g;

    /* renamed from: h */
    public volatile InterfaceC9146m.a f3402h;

    /* renamed from: i */
    public File f3403i;

    public C5486b(C5488d c5488d, InterfaceC5487c.a aVar) {
        this(c5488d.m3158c(), c5488d, aVar);
    }

    /* renamed from: b */
    private boolean m3152b() {
        return this.f3401g < this.f3400f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c
    /* renamed from: a */
    public boolean mo3153a() {
        while (true) {
            boolean z9 = false;
            if (this.f3400f != null && m3152b()) {
                this.f3402h = null;
                while (!z9 && m3152b()) {
                    List list = this.f3400f;
                    int i9 = this.f3401g;
                    this.f3401g = i9 + 1;
                    this.f3402h = ((InterfaceC9146m) list.get(i9)).mo14656b(this.f3403i, this.f3396b.m3174s(), this.f3396b.m3161f(), this.f3396b.m3166k());
                    if (this.f3402h != null && this.f3396b.m3175t(this.f3402h.f15426c.mo12978a())) {
                        this.f3402h.f15426c.mo12985d(this.f3396b.m3167l(), this);
                        z9 = true;
                    }
                }
                return z9;
            }
            int i10 = this.f3398d + 1;
            this.f3398d = i10;
            if (i10 >= this.f3395a.size()) {
                return false;
            }
            InterfaceC8082b interfaceC8082b = (InterfaceC8082b) this.f3395a.get(this.f3398d);
            File fileMo14251b = this.f3396b.m3159d().mo14251b(new C8250a(interfaceC8082b, this.f3396b.m3170o()));
            this.f3403i = fileMo14251b;
            if (fileMo14251b != null) {
                this.f3399e = interfaceC8082b;
                this.f3400f = this.f3396b.m3165j(fileMo14251b);
                this.f3401g = 0;
            }
        }
    }

    @Override // p132i0.InterfaceC8115d.a
    /* renamed from: c */
    public void mo3154c(Exception exc) {
        this.f3397c.mo3096d(this.f3399e, exc, this.f3402h.f15426c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5487c
    public void cancel() {
        InterfaceC9146m.a aVar = this.f3402h;
        if (aVar != null) {
            aVar.f15426c.cancel();
        }
    }

    @Override // p132i0.InterfaceC8115d.a
    /* renamed from: f */
    public void mo3155f(Object obj) {
        this.f3397c.mo3097e(this.f3399e, obj, this.f3402h.f15426c, DataSource.DATA_DISK_CACHE, this.f3399e);
    }

    public C5486b(List list, C5488d c5488d, InterfaceC5487c.a aVar) {
        this.f3398d = -1;
        this.f3395a = list;
        this.f3396b = c5488d;
        this.f3397c = aVar;
    }
}
