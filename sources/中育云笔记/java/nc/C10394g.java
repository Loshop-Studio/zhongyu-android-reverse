package nc;

import java.util.concurrent.ExecutorService;

/* renamed from: nc.g */
/* loaded from: classes6.dex */
public class C10394g {

    /* renamed from: a */
    public final InterfaceC10389b f24731a;

    /* renamed from: b */
    public final Object f24732b;

    /* renamed from: c */
    public final ExecutorService f24733c;

    /* renamed from: d */
    public InterfaceC10388a f24734d;

    /* renamed from: e */
    public boolean f24735e;

    /* renamed from: f */
    public boolean f24736f;

    /* renamed from: g */
    public boolean f24737g;

    public C10394g(InterfaceC10389b interfaceC10389b, Object obj, ExecutorService executorService) {
        this.f24731a = interfaceC10389b;
        this.f24732b = obj;
        this.f24733c = executorService;
    }

    /* renamed from: a */
    public InterfaceC10391d m21716a(InterfaceC10388a interfaceC10388a) {
        C10395h c10395h;
        if (this.f24735e) {
            c10395h = new C10395h(interfaceC10388a);
            interfaceC10388a = c10395h;
        } else {
            c10395h = null;
        }
        this.f24734d = interfaceC10388a;
        C10392e c10392e = new C10392e(this.f24731a, this.f24732b, interfaceC10388a);
        if (c10395h != null) {
            c10395h.m21719c(c10392e);
        }
        if (this.f24736f) {
            if (this.f24737g) {
                throw new IllegalStateException("Illegal combination of single() and onlyChanges()");
            }
            this.f24731a.mo19274b(interfaceC10388a, this.f24732b);
            return c10392e;
        }
        this.f24731a.mo19275c(interfaceC10388a, this.f24732b);
        if (!this.f24737g) {
            this.f24731a.mo19274b(interfaceC10388a, this.f24732b);
        }
        return c10392e;
    }

    /* renamed from: b */
    public C10394g m21717b() {
        this.f24737g = true;
        return this;
    }

    /* renamed from: c */
    public C10394g m21718c() {
        this.f24735e = true;
        return this;
    }
}
