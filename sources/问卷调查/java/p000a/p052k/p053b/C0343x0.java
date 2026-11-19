package p000a.p052k.p053b;

import p000a.p057m.AbstractC0355d;
import p000a.p057m.C0359h;
import p000a.p057m.C0371t;
import p000a.p057m.InterfaceC0372u;
import p000a.p062p.C0404a;
import p000a.p062p.C0405b;
import p000a.p062p.InterfaceC0406c;

/* renamed from: a.k.b.x0 */
/* loaded from: classes.dex */
public class C0343x0 implements InterfaceC0406c, InterfaceC0372u {

    /* renamed from: b */
    public final C0371t f2115b;

    /* renamed from: c */
    public C0359h f2116c = null;

    /* renamed from: d */
    public C0405b f2117d = null;

    public C0343x0(ComponentCallbacksC0320m componentCallbacksC0320m, C0371t c0371t) {
        this.f2115b = c0371t;
    }

    @Override // p000a.p057m.InterfaceC0358g
    /* renamed from: a */
    public AbstractC0355d mo1151a() {
        m1245f();
        return this.f2116c;
    }

    /* renamed from: b */
    public void m1244b(AbstractC0355d.a aVar) {
        C0359h c0359h = this.f2116c;
        c0359h.m1281c("handleLifecycleEvent");
        c0359h.m1283f(aVar.m1277a());
    }

    @Override // p000a.p062p.InterfaceC0406c
    /* renamed from: d */
    public C0404a mo1153d() {
        m1245f();
        return this.f2117d.f2360b;
    }

    @Override // p000a.p057m.InterfaceC0372u
    /* renamed from: e */
    public C0371t mo1154e() {
        m1245f();
        return this.f2115b;
    }

    /* renamed from: f */
    public void m1245f() {
        if (this.f2116c == null) {
            this.f2116c = new C0359h(this);
            this.f2117d = new C0405b(this);
        }
    }
}
