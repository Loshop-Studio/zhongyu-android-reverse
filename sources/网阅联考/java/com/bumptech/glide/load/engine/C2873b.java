package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.InterfaceC2874c;
import java.io.File;
import java.util.List;
import p076j.InterfaceC3792b;
import p081k.InterfaceC3843d;
import p093m.C4352a;
import p110q.InterfaceC4464m;

/* renamed from: com.bumptech.glide.load.engine.b */
/* loaded from: classes2.dex */
public class C2873b implements InterfaceC2874c, InterfaceC3843d.a {

    /* renamed from: a */
    public final List f741a;

    /* renamed from: b */
    public final C2875d f742b;

    /* renamed from: c */
    public final InterfaceC2874c.a f743c;

    /* renamed from: d */
    public int f744d;

    /* renamed from: e */
    public InterfaceC3792b f745e;

    /* renamed from: f */
    public List f746f;

    /* renamed from: g */
    public int f747g;

    /* renamed from: h */
    public volatile InterfaceC4464m.a f748h;

    /* renamed from: i */
    public File f749i;

    public C2873b(C2875d c2875d, InterfaceC2874c.a aVar) {
        this(c2875d.m1833c(), c2875d, aVar);
    }

    /* renamed from: a */
    public final boolean m1827a() {
        return this.f747g < this.f746f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c
    /* renamed from: b */
    public boolean mo1828b() {
        while (true) {
            boolean z3 = false;
            if (this.f746f != null && m1827a()) {
                this.f748h = null;
                while (!z3 && m1827a()) {
                    List list = this.f746f;
                    int i4 = this.f747g;
                    this.f747g = i4 + 1;
                    this.f748h = ((InterfaceC4464m) list.get(i4)).mo5671b(this.f749i, this.f742b.m1849s(), this.f742b.m1836f(), this.f742b.m1841k());
                    if (this.f748h != null && this.f742b.m1850t(this.f748h.f5195c.mo5114a())) {
                        this.f748h.f5195c.mo5123f(this.f742b.m1842l(), this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i5 = this.f744d + 1;
            this.f744d = i5;
            if (i5 >= this.f741a.size()) {
                return false;
            }
            InterfaceC3792b interfaceC3792b = (InterfaceC3792b) this.f741a.get(this.f744d);
            File fileMo5498b = this.f742b.m1834d().mo5498b(new C4352a(interfaceC3792b, this.f742b.m1845o()));
            this.f749i = fileMo5498b;
            if (fileMo5498b != null) {
                this.f745e = interfaceC3792b;
                this.f746f = this.f742b.m1840j(fileMo5498b);
                this.f747g = 0;
            }
        }
    }

    @Override // p081k.InterfaceC3843d.a
    /* renamed from: c */
    public void mo1829c(Exception exc) {
        this.f743c.mo1771d(this.f745e, exc, this.f748h.f5195c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2874c
    public void cancel() {
        InterfaceC4464m.a aVar = this.f748h;
        if (aVar != null) {
            aVar.f5195c.cancel();
        }
    }

    @Override // p081k.InterfaceC3843d.a
    /* renamed from: e */
    public void mo1830e(Object obj) {
        this.f743c.mo1768a(this.f745e, obj, this.f748h.f5195c, DataSource.DATA_DISK_CACHE, this.f745e);
    }

    public C2873b(List list, C2875d c2875d, InterfaceC2874c.a aVar) {
        this.f744d = -1;
        this.f741a = list;
        this.f742b = c2875d;
        this.f743c = aVar;
    }
}
