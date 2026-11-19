package pe;

import java.util.List;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9728h;
import je.InterfaceC9739s;
import kotlin.jvm.internal.AbstractC9979u;
import p281oe.C10485c;
import p281oe.C10487e;

/* renamed from: pe.g */
/* loaded from: classes6.dex */
public final class C10680g implements InterfaceC9739s.a {

    /* renamed from: a */
    public final C10487e f25734a;

    /* renamed from: b */
    public final List f25735b;

    /* renamed from: c */
    public final int f25736c;

    /* renamed from: d */
    public final C10485c f25737d;

    /* renamed from: e */
    public final C9743w f25738e;

    /* renamed from: f */
    public final int f25739f;

    /* renamed from: g */
    public final int f25740g;

    /* renamed from: h */
    public final int f25741h;

    /* renamed from: i */
    public int f25742i;

    public C10680g(C10487e call, List interceptors, int i10, C10485c c10485c, C9743w request, int i11, int i12, int i13) {
        AbstractC9979u.m20294g(call, "call");
        AbstractC9979u.m20294g(interceptors, "interceptors");
        AbstractC9979u.m20294g(request, "request");
        this.f25734a = call;
        this.f25735b = interceptors;
        this.f25736c = i10;
        this.f25737d = c10485c;
        this.f25738e = request;
        this.f25739f = i11;
        this.f25740g = i12;
        this.f25741h = i13;
    }

    /* renamed from: d */
    public static /* synthetic */ C10680g m22626d(C10680g c10680g, int i10, C10485c c10485c, C9743w c9743w, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c10680g.f25736c;
        }
        if ((i14 & 2) != 0) {
            c10485c = c10680g.f25737d;
        }
        if ((i14 & 4) != 0) {
            c9743w = c10680g.f25738e;
        }
        if ((i14 & 8) != 0) {
            i11 = c10680g.f25739f;
        }
        if ((i14 & 16) != 0) {
            i12 = c10680g.f25740g;
        }
        if ((i14 & 32) != 0) {
            i13 = c10680g.f25741h;
        }
        int i15 = i12;
        int i16 = i13;
        return c10680g.m22627c(i10, c10485c, c9743w, i11, i15, i16);
    }

    @Override // je.InterfaceC9739s.a
    /* renamed from: a */
    public C9745y mo19477a(C9743w request) {
        AbstractC9979u.m20294g(request, "request");
        if (this.f25736c >= this.f25735b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f25742i++;
        C10485c c10485c = this.f25737d;
        if (c10485c != null) {
            if (!c10485c.m21865j().m21885g(request.m19592j())) {
                throw new IllegalStateException(("network interceptor " + this.f25735b.get(this.f25736c - 1) + " must retain the same host and port").toString());
            }
            if (this.f25742i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f25735b.get(this.f25736c - 1) + " must call proceed() exactly once").toString());
            }
        }
        C10680g c10680gM22626d = m22626d(this, this.f25736c + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC9739s interfaceC9739s = (InterfaceC9739s) this.f25735b.get(this.f25736c);
        C9745y c9745yIntercept = interfaceC9739s.intercept(c10680gM22626d);
        if (c9745yIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC9739s + " returned null");
        }
        if (this.f25737d != null && this.f25736c + 1 < this.f25735b.size() && c10680gM22626d.f25742i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC9739s + " must call proceed() exactly once").toString());
        }
        if (c9745yIntercept.m19628e() != null) {
            return c9745yIntercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC9739s + " returned a response with no body").toString());
    }

    @Override // je.InterfaceC9739s.a
    /* renamed from: b */
    public InterfaceC9728h mo19478b() {
        C10485c c10485c = this.f25737d;
        if (c10485c != null) {
            return c10485c.m21863h();
        }
        return null;
    }

    /* renamed from: c */
    public final C10680g m22627c(int i10, C10485c c10485c, C9743w request, int i11, int i12, int i13) {
        AbstractC9979u.m20294g(request, "request");
        return new C10680g(this.f25734a, this.f25735b, i10, c10485c, request, i11, i12, i13);
    }

    @Override // je.InterfaceC9739s.a
    public InterfaceC9725e call() {
        return this.f25734a;
    }

    /* renamed from: e */
    public final C10487e m22628e() {
        return this.f25734a;
    }

    /* renamed from: f */
    public final int m22629f() {
        return this.f25739f;
    }

    /* renamed from: g */
    public final C10485c m22630g() {
        return this.f25737d;
    }

    /* renamed from: h */
    public final int m22631h() {
        return this.f25740g;
    }

    /* renamed from: i */
    public final C9743w m22632i() {
        return this.f25738e;
    }

    /* renamed from: j */
    public final int m22633j() {
        return this.f25741h;
    }

    /* renamed from: k */
    public int m22634k() {
        return this.f25740g;
    }

    @Override // je.InterfaceC9739s.a
    public C9743w request() {
        return this.f25738e;
    }
}
