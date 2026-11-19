package p222q6;

import java.util.concurrent.ExecutorService;

/* renamed from: q6.g */
/* loaded from: classes5.dex */
public class C9840g {

    /* renamed from: a */
    public final InterfaceC9835b f19636a;

    /* renamed from: b */
    public final Object f19637b;

    /* renamed from: c */
    public final ExecutorService f19638c;

    /* renamed from: d */
    public InterfaceC9834a f19639d;

    /* renamed from: e */
    public boolean f19640e;

    /* renamed from: f */
    public boolean f19641f;

    /* renamed from: g */
    public boolean f19642g;

    public C9840g(InterfaceC9835b interfaceC9835b, Object obj, ExecutorService executorService) {
        this.f19636a = interfaceC9835b;
        this.f19637b = obj;
        this.f19638c = executorService;
    }

    /* renamed from: a */
    public InterfaceC9837d m18360a(InterfaceC9834a interfaceC9834a) {
        C9841h c9841h;
        if (this.f19640e) {
            c9841h = new C9841h(interfaceC9834a);
            interfaceC9834a = c9841h;
        } else {
            c9841h = null;
        }
        this.f19639d = interfaceC9834a;
        C9838e c9838e = new C9838e(this.f19636a, this.f19637b, interfaceC9834a);
        if (c9841h != null) {
            c9841h.m18363c(c9838e);
        }
        if (this.f19641f) {
            if (this.f19642g) {
                throw new IllegalStateException("Illegal combination of single() and onlyChanges()");
            }
            this.f19636a.mo15464b(interfaceC9834a, this.f19637b);
            return c9838e;
        }
        this.f19636a.mo15465c(interfaceC9834a, this.f19637b);
        if (!this.f19642g) {
            this.f19636a.mo15464b(interfaceC9834a, this.f19637b);
        }
        return c9838e;
    }

    /* renamed from: b */
    public C9840g m18361b() {
        this.f19642g = true;
        return this;
    }

    /* renamed from: c */
    public C9840g m18362c() {
        this.f19640e = true;
        return this;
    }
}
