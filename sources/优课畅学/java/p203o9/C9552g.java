package p203o9;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.InterfaceC8904e;
import p136i9.InterfaceC8926x;
import p192n9.C9481h;
import p192n9.C9487n;

/* renamed from: o9.g */
/* loaded from: classes5.dex */
public final class C9552g implements InterfaceC8926x.a {

    /* renamed from: a */
    public final C9487n f18918a;

    /* renamed from: b */
    public final List f18919b;

    /* renamed from: c */
    public final int f18920c;

    /* renamed from: d */
    public final C9481h f18921d;

    /* renamed from: e */
    public final C8899b0 f18922e;

    /* renamed from: f */
    public final int f18923f;

    /* renamed from: g */
    public final int f18924g;

    /* renamed from: h */
    public final int f18925h;

    /* renamed from: i */
    public int f18926i;

    public C9552g(C9487n call, List interceptors, int i10, C9481h c9481h, C8899b0 request, int i11, int i12, int i13) {
        AbstractC9133u.m16133g(call, "call");
        AbstractC9133u.m16133g(interceptors, "interceptors");
        AbstractC9133u.m16133g(request, "request");
        this.f18918a = call;
        this.f18919b = interceptors;
        this.f18920c = i10;
        this.f18921d = c9481h;
        this.f18922e = request;
        this.f18923f = i11;
        this.f18924g = i12;
        this.f18925h = i13;
    }

    /* renamed from: d */
    public static /* synthetic */ C9552g m17848d(C9552g c9552g, int i10, C9481h c9481h, C8899b0 c8899b0, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c9552g.f18920c;
        }
        if ((i14 & 2) != 0) {
            c9481h = c9552g.f18921d;
        }
        if ((i14 & 4) != 0) {
            c8899b0 = c9552g.f18922e;
        }
        if ((i14 & 8) != 0) {
            i11 = c9552g.f18923f;
        }
        if ((i14 & 16) != 0) {
            i12 = c9552g.f18924g;
        }
        if ((i14 & 32) != 0) {
            i13 = c9552g.f18925h;
        }
        int i15 = i12;
        int i16 = i13;
        return c9552g.m17849c(i10, c9481h, c8899b0, i11, i15, i16);
    }

    @Override // p136i9.InterfaceC8926x.a
    /* renamed from: a */
    public C8899b0 mo15332a() {
        return this.f18922e;
    }

    @Override // p136i9.InterfaceC8926x.a
    /* renamed from: b */
    public C8903d0 mo15333b(C8899b0 request) {
        AbstractC9133u.m16133g(request, "request");
        if (this.f18920c >= this.f18919b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f18926i++;
        C9481h c9481h = this.f18921d;
        if (c9481h != null) {
            if (!c9481h.m17478l().mo17493b().mo17504b(request.m15052l())) {
                throw new IllegalStateException(("network interceptor " + this.f18919b.get(this.f18920c - 1) + " must retain the same host and port").toString());
            }
            if (this.f18926i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f18919b.get(this.f18920c - 1) + " must call proceed() exactly once").toString());
            }
        }
        C9552g c9552gM17848d = m17848d(this, this.f18920c + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC8926x interfaceC8926x = (InterfaceC8926x) this.f18919b.get(this.f18920c);
        C8903d0 c8903d0Intercept = interfaceC8926x.intercept(c9552gM17848d);
        if (c8903d0Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC8926x + " returned null");
        }
        if (this.f18921d == null || this.f18920c + 1 >= this.f18919b.size() || c9552gM17848d.f18926i == 1) {
            return c8903d0Intercept;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC8926x + " must call proceed() exactly once").toString());
    }

    /* renamed from: c */
    public final C9552g m17849c(int i10, C9481h c9481h, C8899b0 request, int i11, int i12, int i13) {
        AbstractC9133u.m16133g(request, "request");
        return new C9552g(this.f18918a, this.f18919b, i10, c9481h, request, i11, i12, i13);
    }

    @Override // p136i9.InterfaceC8926x.a
    public InterfaceC8904e call() {
        return this.f18918a;
    }

    /* renamed from: e */
    public final C9487n m17850e() {
        return this.f18918a;
    }

    /* renamed from: f */
    public final int m17851f() {
        return this.f18923f;
    }

    /* renamed from: g */
    public final C9481h m17852g() {
        return this.f18921d;
    }

    /* renamed from: h */
    public final int m17853h() {
        return this.f18924g;
    }

    /* renamed from: i */
    public final C8899b0 m17854i() {
        return this.f18922e;
    }

    /* renamed from: j */
    public final int m17855j() {
        return this.f18925h;
    }

    /* renamed from: k */
    public int m17856k() {
        return this.f18924g;
    }
}
