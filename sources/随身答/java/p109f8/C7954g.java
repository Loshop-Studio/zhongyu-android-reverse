package p109f8;

import java.util.concurrent.ExecutorService;

/* renamed from: f8.g */
/* loaded from: classes5.dex */
public class C7954g {

    /* renamed from: a */
    public final InterfaceC7949b f13404a;

    /* renamed from: b */
    public final Object f13405b;

    /* renamed from: c */
    public final ExecutorService f13406c;

    /* renamed from: d */
    public InterfaceC7948a f13407d;

    /* renamed from: e */
    public boolean f13408e;

    /* renamed from: f */
    public boolean f13409f;

    /* renamed from: g */
    public boolean f13410g;

    public C7954g(InterfaceC7949b interfaceC7949b, Object obj, ExecutorService executorService) {
        this.f13404a = interfaceC7949b;
        this.f13405b = obj;
        this.f13406c = executorService;
    }

    /* renamed from: a */
    public InterfaceC7951d m12498a(InterfaceC7948a interfaceC7948a) {
        C7955h c7955h;
        if (this.f13408e) {
            c7955h = new C7955h(interfaceC7948a);
            interfaceC7948a = c7955h;
        } else {
            c7955h = null;
        }
        this.f13407d = interfaceC7948a;
        C7952e c7952e = new C7952e(this.f13404a, this.f13405b, interfaceC7948a);
        if (c7955h != null) {
            c7955h.m12501c(c7952e);
        }
        if (this.f13409f) {
            if (this.f13410g) {
                throw new IllegalStateException("Illegal combination of single() and onlyChanges()");
            }
            this.f13404a.mo2301b(interfaceC7948a, this.f13405b);
            return c7952e;
        }
        this.f13404a.mo2300a(interfaceC7948a, this.f13405b);
        if (!this.f13410g) {
            this.f13404a.mo2301b(interfaceC7948a, this.f13405b);
        }
        return c7952e;
    }

    /* renamed from: b */
    public C7954g m12499b() {
        this.f13410g = true;
        return this;
    }

    /* renamed from: c */
    public C7954g m12500c() {
        this.f13408e = true;
        return this;
    }
}
