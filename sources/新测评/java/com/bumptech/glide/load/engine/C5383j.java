package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5356d;
import com.bumptech.glide.load.engine.InterfaceC5376c;
import java.io.File;
import java.util.List;
import p128j1.AbstractC7779b;
import p162m0.InterfaceC8537b;
import p184o0.C8691k;
import p228s0.InterfaceC9112n;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes3.dex */
public class C5383j implements InterfaceC5376c, InterfaceC5356d.a {

    /* renamed from: a */
    public final InterfaceC5376c.a f3700a;

    /* renamed from: b */
    public final C5377d f3701b;

    /* renamed from: c */
    public int f3702c;

    /* renamed from: d */
    public int f3703d = -1;

    /* renamed from: e */
    public InterfaceC8537b f3704e;

    /* renamed from: f */
    public List f3705f;

    /* renamed from: g */
    public int f3706g;

    /* renamed from: h */
    public volatile InterfaceC9112n.a f3707h;

    /* renamed from: i */
    public File f3708i;

    /* renamed from: j */
    public C8691k f3709j;

    public C5383j(C5377d c5377d, InterfaceC5376c.a aVar) {
        this.f3701b = c5377d;
        this.f3700a = aVar;
    }

    /* renamed from: a */
    private boolean m3576a() {
        return this.f3706g < this.f3705f.size();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
    /* renamed from: c */
    public void mo3412c(Exception exc) {
        this.f3700a.mo3440a(this.f3709j, exc, this.f3707h.f15786c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c
    public void cancel() {
        InterfaceC9112n.a aVar = this.f3707h;
        if (aVar != null) {
            aVar.f15786c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5376c
    /* renamed from: d */
    public boolean mo3502d() {
        AbstractC7779b.m13143a("ResourceCacheGenerator.startNext");
        try {
            List listM3505c = this.f3701b.m3505c();
            boolean z9 = false;
            if (listM3505c.isEmpty()) {
                AbstractC7779b.m13147e();
                return false;
            }
            List listM3515m = this.f3701b.m3515m();
            if (listM3515m.isEmpty()) {
                if (File.class.equals(this.f3701b.m3520r())) {
                    AbstractC7779b.m13147e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f3701b.m3511i() + " to " + this.f3701b.m3520r());
            }
            while (true) {
                if (this.f3705f != null && m3576a()) {
                    this.f3707h = null;
                    while (!z9 && m3576a()) {
                        List list = this.f3705f;
                        int i10 = this.f3706g;
                        this.f3706g = i10 + 1;
                        this.f3707h = ((InterfaceC9112n) list.get(i10)).mo15355b(this.f3708i, this.f3701b.m3522t(), this.f3701b.m3508f(), this.f3701b.m3513k());
                        if (this.f3707h != null && this.f3701b.m3523u(this.f3707h.f15786c.mo3399a())) {
                            this.f3707h.f15786c.mo3407e(this.f3701b.m3514l(), this);
                            z9 = true;
                        }
                    }
                    AbstractC7779b.m13147e();
                    return z9;
                }
                int i11 = this.f3703d + 1;
                this.f3703d = i11;
                if (i11 >= listM3515m.size()) {
                    int i12 = this.f3702c + 1;
                    this.f3702c = i12;
                    if (i12 >= listM3505c.size()) {
                        AbstractC7779b.m13147e();
                        return false;
                    }
                    this.f3703d = 0;
                }
                InterfaceC8537b interfaceC8537b = (InterfaceC8537b) listM3505c.get(this.f3702c);
                Class cls = (Class) listM3515m.get(this.f3703d);
                this.f3709j = new C8691k(this.f3701b.m3504b(), interfaceC8537b, this.f3701b.m3518p(), this.f3701b.m3522t(), this.f3701b.m3508f(), this.f3701b.m3521s(cls), cls, this.f3701b.m3513k());
                File fileMo14868a = this.f3701b.m3506d().mo14868a(this.f3709j);
                this.f3708i = fileMo14868a;
                if (fileMo14868a != null) {
                    this.f3704e = interfaceC8537b;
                    this.f3705f = this.f3701b.m3512j(fileMo14868a);
                    this.f3706g = 0;
                }
            }
        } catch (Throwable th) {
            AbstractC7779b.m13147e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d.a
    /* renamed from: f */
    public void mo3413f(Object obj) {
        this.f3700a.mo3441b(this.f3704e, obj, this.f3707h.f15786c, DataSource.RESOURCE_DISK_CACHE, this.f3709j);
    }
}
