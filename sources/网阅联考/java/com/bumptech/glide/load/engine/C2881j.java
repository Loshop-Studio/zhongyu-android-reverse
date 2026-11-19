package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.InterfaceC2874c;
import java.io.File;
import java.util.List;
import p076j.InterfaceC3792b;
import p081k.InterfaceC3843d;
import p093m.C4362k;
import p110q.InterfaceC4464m;

/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes2.dex */
public class C2881j implements InterfaceC2874c, InterfaceC3843d.a {

    /* renamed from: a */
    public final InterfaceC2874c.a f842a;

    /* renamed from: b */
    public final C2875d f843b;

    /* renamed from: c */
    public int f844c;

    /* renamed from: d */
    public int f845d = -1;

    /* renamed from: e */
    public InterfaceC3792b f846e;

    /* renamed from: f */
    public List f847f;

    /* renamed from: g */
    public int f848g;

    /* renamed from: h */
    public volatile InterfaceC4464m.a f849h;

    /* renamed from: i */
    public File f850i;

    /* renamed from: j */
    public C4362k f851j;

    public C2881j(C2875d c2875d, InterfaceC2874c.a aVar) {
        this.f843b = c2875d;
        this.f842a = aVar;
    }

    /* renamed from: a */
    public final boolean m1904a() {
        return this.f848g < this.f847f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c
    /* renamed from: b */
    public boolean mo1828b() {
        List listM1833c = this.f843b.m1833c();
        boolean z3 = false;
        if (listM1833c.isEmpty()) {
            return false;
        }
        List listM1843m = this.f843b.m1843m();
        if (listM1843m.isEmpty()) {
            if (File.class.equals(this.f843b.m1847q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f843b.m1839i() + " to " + this.f843b.m1847q());
        }
        while (true) {
            if (this.f847f != null && m1904a()) {
                this.f849h = null;
                while (!z3 && m1904a()) {
                    List list = this.f847f;
                    int i4 = this.f848g;
                    this.f848g = i4 + 1;
                    this.f849h = ((InterfaceC4464m) list.get(i4)).mo5671b(this.f850i, this.f843b.m1849s(), this.f843b.m1836f(), this.f843b.m1841k());
                    if (this.f849h != null && this.f843b.m1850t(this.f849h.f5195c.mo5114a())) {
                        this.f849h.f5195c.mo5123f(this.f843b.m1842l(), this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i5 = this.f845d + 1;
            this.f845d = i5;
            if (i5 >= listM1843m.size()) {
                int i6 = this.f844c + 1;
                this.f844c = i6;
                if (i6 >= listM1833c.size()) {
                    return false;
                }
                this.f845d = 0;
            }
            InterfaceC3792b interfaceC3792b = (InterfaceC3792b) listM1833c.get(this.f844c);
            Class cls = (Class) listM1843m.get(this.f845d);
            this.f851j = new C4362k(this.f843b.m1832b(), interfaceC3792b, this.f843b.m1845o(), this.f843b.m1849s(), this.f843b.m1836f(), this.f843b.m1848r(cls), cls, this.f843b.m1841k());
            File fileMo5498b = this.f843b.m1834d().mo5498b(this.f851j);
            this.f850i = fileMo5498b;
            if (fileMo5498b != null) {
                this.f846e = interfaceC3792b;
                this.f847f = this.f843b.m1840j(fileMo5498b);
                this.f848g = 0;
            }
        }
    }

    @Override // p081k.InterfaceC3843d.a
    /* renamed from: c */
    public void mo1829c(Exception exc) {
        this.f842a.mo1771d(this.f851j, exc, this.f849h.f5195c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c
    public void cancel() {
        InterfaceC4464m.a aVar = this.f849h;
        if (aVar != null) {
            aVar.f5195c.cancel();
        }
    }

    @Override // p081k.InterfaceC3843d.a
    /* renamed from: e */
    public void mo1830e(Object obj) {
        this.f842a.mo1768a(this.f846e, obj, this.f849h.f5195c, DataSource.RESOURCE_DISK_CACHE, this.f851j);
    }
}
