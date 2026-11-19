package p236r8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8920s;
import p226q8.C9380c;
import p226q8.C9382e;

/* renamed from: r8.g */
/* loaded from: classes5.dex */
public final class C9445g implements InterfaceC8920s.a {

    /* renamed from: a */
    public final C9382e f16461a;

    /* renamed from: b */
    public final List f16462b;

    /* renamed from: c */
    public final int f16463c;

    /* renamed from: d */
    public final C9380c f16464d;

    /* renamed from: e */
    public final C8924w f16465e;

    /* renamed from: f */
    public final int f16466f;

    /* renamed from: g */
    public final int f16467g;

    /* renamed from: h */
    public final int f16468h;

    /* renamed from: i */
    public int f16469i;

    public C9445g(C9382e call, List interceptors, int i9, C9380c c9380c, C8924w request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f16461a = call;
        this.f16462b = interceptors;
        this.f16463c = i9;
        this.f16464d = c9380c;
        this.f16465e = request;
        this.f16466f = i10;
        this.f16467g = i11;
        this.f16468h = i12;
    }

    /* renamed from: d */
    public static /* synthetic */ C9445g m15600d(C9445g c9445g, int i9, C9380c c9380c, C8924w c8924w, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = c9445g.f16463c;
        }
        if ((i13 & 2) != 0) {
            c9380c = c9445g.f16464d;
        }
        if ((i13 & 4) != 0) {
            c8924w = c9445g.f16465e;
        }
        if ((i13 & 8) != 0) {
            i10 = c9445g.f16466f;
        }
        if ((i13 & 16) != 0) {
            i11 = c9445g.f16467g;
        }
        if ((i13 & 32) != 0) {
            i12 = c9445g.f16468h;
        }
        int i14 = i11;
        int i15 = i12;
        return c9445g.m15601c(i9, c9380c, c8924w, i10, i14, i15);
    }

    @Override // p172l8.InterfaceC8920s.a
    /* renamed from: a */
    public C8924w mo14024a() {
        return this.f16465e;
    }

    @Override // p172l8.InterfaceC8920s.a
    /* renamed from: b */
    public C8926y mo14025b(C8924w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f16463c >= this.f16462b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f16469i++;
        C9380c c9380c = this.f16464d;
        if (c9380c != null) {
            if (!c9380c.m15371j().m15391g(request.m14137j())) {
                throw new IllegalStateException(("network interceptor " + this.f16462b.get(this.f16463c - 1) + " must retain the same host and port").toString());
            }
            if (this.f16469i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f16462b.get(this.f16463c - 1) + " must call proceed() exactly once").toString());
            }
        }
        C9445g c9445gM15600d = m15600d(this, this.f16463c + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC8920s interfaceC8920s = (InterfaceC8920s) this.f16462b.get(this.f16463c);
        C8926y c8926yIntercept = interfaceC8920s.intercept(c9445gM15600d);
        if (c8926yIntercept == null) {
            throw new NullPointerException("interceptor " + interfaceC8920s + " returned null");
        }
        if (this.f16464d != null && this.f16463c + 1 < this.f16462b.size() && c9445gM15600d.f16469i != 1) {
            throw new IllegalStateException(("network interceptor " + interfaceC8920s + " must call proceed() exactly once").toString());
        }
        if (c8926yIntercept.m14170a() != null) {
            return c8926yIntercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC8920s + " returned a response with no body").toString());
    }

    /* renamed from: c */
    public final C9445g m15601c(int i9, C9380c c9380c, C8924w request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C9445g(this.f16461a, this.f16462b, i9, c9380c, request, i10, i11, i12);
    }

    @Override // p172l8.InterfaceC8920s.a
    public InterfaceC8906e call() {
        return this.f16461a;
    }

    /* renamed from: e */
    public final C9382e m15602e() {
        return this.f16461a;
    }

    /* renamed from: f */
    public final int m15603f() {
        return this.f16466f;
    }

    /* renamed from: g */
    public final C9380c m15604g() {
        return this.f16464d;
    }

    /* renamed from: h */
    public final int m15605h() {
        return this.f16467g;
    }

    /* renamed from: i */
    public final C8924w m15606i() {
        return this.f16465e;
    }

    /* renamed from: j */
    public final int m15607j() {
        return this.f16468h;
    }

    /* renamed from: k */
    public int m15608k() {
        return this.f16467g;
    }
}
