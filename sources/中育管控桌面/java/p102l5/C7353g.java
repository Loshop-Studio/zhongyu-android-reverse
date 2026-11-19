package p102l5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.InterfaceC6363e;
import p058f5.InterfaceC6385x;
import p093k5.C6685h;
import p093k5.C6691n;

/* renamed from: l5.g */
/* loaded from: classes4.dex */
public final class C7353g implements InterfaceC6385x.a {

    /* renamed from: a */
    public final C6691n f9331a;

    /* renamed from: b */
    public final List f9332b;

    /* renamed from: c */
    public final int f9333c;

    /* renamed from: d */
    public final C6685h f9334d;

    /* renamed from: e */
    public final C6358b0 f9335e;

    /* renamed from: f */
    public final int f9336f;

    /* renamed from: g */
    public final int f9337g;

    /* renamed from: h */
    public final int f9338h;

    /* renamed from: i */
    public int f9339i;

    public C7353g(C6691n call, List interceptors, int i6, C6685h c6685h, C6358b0 request, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f9331a = call;
        this.f9332b = interceptors;
        this.f9333c = i6;
        this.f9334d = c6685h;
        this.f9335e = request;
        this.f9336f = i7;
        this.f9337g = i8;
        this.f9338h = i9;
    }

    /* renamed from: d */
    public static /* synthetic */ C7353g m8343d(C7353g c7353g, int i6, C6685h c6685h, C6358b0 c6358b0, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = c7353g.f9333c;
        }
        if ((i10 & 2) != 0) {
            c6685h = c7353g.f9334d;
        }
        if ((i10 & 4) != 0) {
            c6358b0 = c7353g.f9335e;
        }
        if ((i10 & 8) != 0) {
            i7 = c7353g.f9336f;
        }
        if ((i10 & 16) != 0) {
            i8 = c7353g.f9337g;
        }
        if ((i10 & 32) != 0) {
            i9 = c7353g.f9338h;
        }
        int i11 = i8;
        int i12 = i9;
        return c7353g.m8344c(i6, c6685h, c6358b0, i7, i11, i12);
    }

    @Override // p058f5.InterfaceC6385x.a
    /* renamed from: a */
    public C6358b0 mo6871a() {
        return this.f9335e;
    }

    @Override // p058f5.InterfaceC6385x.a
    /* renamed from: b */
    public C6362d0 mo6872b(C6358b0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f9333c >= this.f9332b.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.f9339i++;
        C6685h c6685h = this.f9334d;
        if (c6685h != null) {
            if (!c6685h.m7745l().mo7760b().mo7773e(request.m6588l())) {
                throw new IllegalStateException(("network interceptor " + this.f9332b.get(this.f9333c - 1) + " must retain the same host and port").toString());
            }
            if (this.f9339i != 1) {
                throw new IllegalStateException(("network interceptor " + this.f9332b.get(this.f9333c - 1) + " must call proceed() exactly once").toString());
            }
        }
        C7353g c7353gM8343d = m8343d(this, this.f9333c + 1, null, request, 0, 0, 0, 58, null);
        InterfaceC6385x interfaceC6385x = (InterfaceC6385x) this.f9332b.get(this.f9333c);
        C6362d0 c6362d0Intercept = interfaceC6385x.intercept(c7353gM8343d);
        if (c6362d0Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC6385x + " returned null");
        }
        if (this.f9334d == null || this.f9333c + 1 >= this.f9332b.size() || c7353gM8343d.f9339i == 1) {
            return c6362d0Intercept;
        }
        throw new IllegalStateException(("network interceptor " + interfaceC6385x + " must call proceed() exactly once").toString());
    }

    /* renamed from: c */
    public final C7353g m8344c(int i6, C6685h c6685h, C6358b0 request, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new C7353g(this.f9331a, this.f9332b, i6, c6685h, request, i7, i8, i9);
    }

    @Override // p058f5.InterfaceC6385x.a
    public InterfaceC6363e call() {
        return this.f9331a;
    }

    /* renamed from: e */
    public final C6691n m8345e() {
        return this.f9331a;
    }

    /* renamed from: f */
    public final int m8346f() {
        return this.f9336f;
    }

    /* renamed from: g */
    public final C6685h m8347g() {
        return this.f9334d;
    }

    /* renamed from: h */
    public final int m8348h() {
        return this.f9337g;
    }

    /* renamed from: i */
    public final C6358b0 m8349i() {
        return this.f9335e;
    }

    /* renamed from: j */
    public final int m8350j() {
        return this.f9338h;
    }

    /* renamed from: k */
    public int m8351k() {
        return this.f9337g;
    }
}
