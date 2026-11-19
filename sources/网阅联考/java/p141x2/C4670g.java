package p141x2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4496a0;
import p117r2.C4522y;
import p117r2.InterfaceC4502e;
import p117r2.InterfaceC4518u;
import p137w2.C4643c;
import p137w2.C4645e;

/* renamed from: x2.g */
/* loaded from: classes2.dex */
public final class C4670g implements InterfaceC4518u.a {

    /* renamed from: a */
    public int f5969a;

    /* renamed from: b */
    public final C4645e f5970b;

    /* renamed from: c */
    public final List f5971c;

    /* renamed from: d */
    public final int f5972d;

    /* renamed from: e */
    public final C4643c f5973e;

    /* renamed from: f */
    public final C4522y f5974f;

    /* renamed from: g */
    public final int f5975g;

    /* renamed from: h */
    public final int f5976h;

    /* renamed from: i */
    public final int f5977i;

    public C4670g(C4645e call, List interceptors, int i4, C4643c c4643c, C4522y request, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f5970b = call;
        this.f5971c = interceptors;
        this.f5972d = i4;
        this.f5973e = c4643c;
        this.f5974f = request;
        this.f5975g = i5;
        this.f5976h = i6;
        this.f5977i = i7;
    }

    /* renamed from: c */
    public static /* synthetic */ C4670g m6586c(C4670g c4670g, int i4, C4643c c4643c, C4522y c4522y, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = c4670g.f5972d;
        }
        if ((i8 & 2) != 0) {
            c4643c = c4670g.f5973e;
        }
        C4643c c4643c2 = c4643c;
        if ((i8 & 4) != 0) {
            c4522y = c4670g.f5974f;
        }
        C4522y c4522y2 = c4522y;
        if ((i8 & 8) != 0) {
            i5 = c4670g.f5975g;
        }
        int i9 = i5;
        if ((i8 & 16) != 0) {
            i6 = c4670g.f5976h;
        }
        int i10 = i6;
        if ((i8 & 32) != 0) {
            i7 = c4670g.f5977i;
        }
        return c4670g.m6587b(i4, c4643c2, c4522y2, i9, i10, i7);
    }

    @Override // p117r2.InterfaceC4518u.a
    /* renamed from: S */
    public C4522y mo6045S() {
        return this.f5974f;
    }

    @Override // p117r2.InterfaceC4518u.a
    /* renamed from: a */
    public C4496a0 mo6046a(C4522y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(this.f5972d < this.f5971c.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f5969a++;
        C4643c c4643c = this.f5973e;
        if (c4643c != null) {
            if (!c4643c.m6482j().m6501g(request.m6141j())) {
                throw new IllegalStateException(("network interceptor " + ((InterfaceC4518u) this.f5971c.get(this.f5972d - 1)) + " must retain the same host and port").toString());
            }
            if (!(this.f5969a == 1)) {
                throw new IllegalStateException(("network interceptor " + ((InterfaceC4518u) this.f5971c.get(this.f5972d - 1)) + " must call proceed() exactly once").toString());
            }
        }
        C4670g c4670gM6586c = m6586c(this, this.f5972d + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC4518u interfaceC4518u = (InterfaceC4518u) this.f5971c.get(this.f5972d);
        C4496a0 c4496a0Intercept = interfaceC4518u.intercept(c4670gM6586c);
        if (c4496a0Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC4518u + " returned null");
        }
        if (this.f5973e != null) {
            if (!(this.f5972d + 1 >= this.f5971c.size() || c4670gM6586c.f5969a == 1)) {
                throw new IllegalStateException(("network interceptor " + interfaceC4518u + " must call proceed() exactly once").toString());
            }
        }
        if (c4496a0Intercept.m5800a() != null) {
            return c4496a0Intercept;
        }
        throw new IllegalStateException(("interceptor " + interfaceC4518u + " returned a response with no body").toString());
    }

    /* renamed from: b */
    public final C4670g m6587b(int i4, C4643c c4643c, C4522y request, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C4670g(this.f5970b, this.f5971c, i4, c4643c, request, i5, i6, i7);
    }

    @Override // p117r2.InterfaceC4518u.a
    public InterfaceC4502e call() {
        return this.f5970b;
    }

    /* renamed from: d */
    public final C4645e m6588d() {
        return this.f5970b;
    }

    /* renamed from: e */
    public final int m6589e() {
        return this.f5975g;
    }

    /* renamed from: f */
    public final C4643c m6590f() {
        return this.f5973e;
    }

    /* renamed from: g */
    public final int m6591g() {
        return this.f5976h;
    }

    /* renamed from: h */
    public final C4522y m6592h() {
        return this.f5974f;
    }

    /* renamed from: i */
    public final int m6593i() {
        return this.f5977i;
    }

    /* renamed from: j */
    public int m6594j() {
        return this.f5976h;
    }
}
