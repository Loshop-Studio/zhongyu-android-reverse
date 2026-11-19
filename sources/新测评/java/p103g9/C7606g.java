package p103g9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p011a9.InterfaceC0056s;
import p092f9.C7499c;
import p092f9.C7501e;

/* renamed from: g9.g */
/* loaded from: classes5.dex */
public final class C7606g implements InterfaceC0056s.a {

    /* renamed from: a */
    public final C7501e f12749a;

    /* renamed from: b */
    public final List f12750b;

    /* renamed from: c */
    public final int f12751c;

    /* renamed from: d */
    public final C7499c f12752d;

    /* renamed from: e */
    public final C0060w f12753e;

    /* renamed from: f */
    public final int f12754f;

    /* renamed from: g */
    public final int f12755g;

    /* renamed from: h */
    public final int f12756h;

    /* renamed from: i */
    public int f12757i;

    public C7606g(C7501e call, List interceptors, int i10, C7499c c7499c, C0060w request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f12749a = call;
        this.f12750b = interceptors;
        this.f12751c = i10;
        this.f12752d = c7499c;
        this.f12753e = request;
        this.f12754f = i11;
        this.f12755g = i12;
        this.f12756h = i13;
    }

    /* renamed from: d */
    public static /* synthetic */ C7606g m12513d(C7606g c7606g, int i10, C7499c c7499c, C0060w c0060w, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c7606g.f12751c;
        }
        if ((i14 & 2) != 0) {
            c7499c = c7606g.f12752d;
        }
        if ((i14 & 4) != 0) {
            c0060w = c7606g.f12753e;
        }
        if ((i14 & 8) != 0) {
            i11 = c7606g.f12754f;
        }
        if ((i14 & 16) != 0) {
            i12 = c7606g.f12755g;
        }
        if ((i14 & 32) != 0) {
            i13 = c7606g.f12756h;
        }
        int i15 = i12;
        int i16 = i13;
        return c7606g.m12514c(i10, c7499c, c0060w, i11, i15, i16);
    }

    @Override // p011a9.InterfaceC0056s.a
    /* renamed from: a */
    public C0060w mo268a() {
        return this.f12753e;
    }

    @Override // p011a9.InterfaceC0056s.a
    /* renamed from: b */
    public C0062y mo269b(C0060w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f12751c >= this.f12750b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f12757i++;
        C7499c c7499c = this.f12752d;
        if (c7499c != null) {
            if (!c7499c.m12139j().m12159g(request.m381j())) {
                throw new IllegalStateException(("network interceptor " + this.f12750b.get(this.f12751c - 1) + " must retain the same host and port").toString());
            }
            if (this.f12757i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f12750b.get(this.f12751c - 1) + " must call proceed() exactly once").toString());
            }
        }
        C7606g c7606gM12513d = m12513d(this, this.f12751c + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC0056s interfaceC0056s = (InterfaceC0056s) this.f12750b.get(this.f12751c);
        C0062y c0062yIntercept = interfaceC0056s.intercept(c7606gM12513d);
        if (c0062yIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC0056s + " returned null");
        }
        if (this.f12752d != null && this.f12751c + 1 < this.f12750b.size() && c7606gM12513d.f12757i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC0056s + " must call proceed() exactly once").toString());
        }
        if (c0062yIntercept.m414a() != null) {
            return c0062yIntercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC0056s + " returned a response with no body").toString());
    }

    /* renamed from: c */
    public final C7606g m12514c(int i10, C7499c c7499c, C0060w request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C7606g(this.f12749a, this.f12750b, i10, c7499c, request, i11, i12, i13);
    }

    @Override // p011a9.InterfaceC0056s.a
    public InterfaceC0042e call() {
        return this.f12749a;
    }

    /* renamed from: e */
    public final C7501e m12515e() {
        return this.f12749a;
    }

    /* renamed from: f */
    public final int m12516f() {
        return this.f12754f;
    }

    /* renamed from: g */
    public final C7499c m12517g() {
        return this.f12752d;
    }

    /* renamed from: h */
    public final int m12518h() {
        return this.f12755g;
    }

    /* renamed from: i */
    public final C0060w m12519i() {
        return this.f12753e;
    }

    /* renamed from: j */
    public final int m12520j() {
        return this.f12756h;
    }

    /* renamed from: k */
    public int m12521k() {
        return this.f12755g;
    }
}
