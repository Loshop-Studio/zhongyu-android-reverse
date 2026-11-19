package p258u8;

import java.util.concurrent.ExecutorService;

/* renamed from: u8.g */
/* loaded from: classes5.dex */
public class C9595g {

    /* renamed from: a */
    public final InterfaceC9590b f16800a;

    /* renamed from: b */
    public final Object f16801b;

    /* renamed from: c */
    public final ExecutorService f16802c;

    /* renamed from: d */
    public InterfaceC9589a f16803d;

    /* renamed from: e */
    public boolean f16804e;

    /* renamed from: f */
    public boolean f16805f;

    /* renamed from: g */
    public boolean f16806g;

    public C9595g(InterfaceC9590b interfaceC9590b, Object obj, ExecutorService executorService) {
        this.f16800a = interfaceC9590b;
        this.f16801b = obj;
        this.f16802c = executorService;
    }

    /* renamed from: a */
    public InterfaceC9592d m15987a(InterfaceC9589a interfaceC9589a) {
        C9596h c9596h;
        if (this.f16804e) {
            c9596h = new C9596h(interfaceC9589a);
            interfaceC9589a = c9596h;
        } else {
            c9596h = null;
        }
        this.f16803d = interfaceC9589a;
        C9593e c9593e = new C9593e(this.f16800a, this.f16801b, interfaceC9589a);
        if (c9596h != null) {
            c9596h.m15990c(c9593e);
        }
        if (this.f16805f) {
            if (this.f16806g) {
                throw new IllegalStateException("Illegal combination of single() and onlyChanges()");
            }
            this.f16800a.mo15091c(interfaceC9589a, this.f16801b);
            return c9593e;
        }
        this.f16800a.mo15090b(interfaceC9589a, this.f16801b);
        if (!this.f16806g) {
            this.f16800a.mo15091c(interfaceC9589a, this.f16801b);
        }
        return c9593e;
    }

    /* renamed from: b */
    public C9595g m15988b() {
        this.f16806g = true;
        return this;
    }

    /* renamed from: c */
    public C9595g m15989c() {
        this.f16804e = true;
        return this;
    }
}
