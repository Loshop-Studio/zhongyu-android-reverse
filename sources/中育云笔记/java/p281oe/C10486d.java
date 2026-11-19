package p281oe;

import java.io.IOException;
import je.AbstractC9735o;
import je.C9720a;
import je.C9721a0;
import je.C9738r;
import je.C9742v;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p281oe.C10490h;
import pe.C10680g;
import pe.InterfaceC10677d;

/* renamed from: oe.d */
/* loaded from: classes6.dex */
public final class C10486d {

    /* renamed from: a */
    public final C10488f f24890a;

    /* renamed from: b */
    public final C9720a f24891b;

    /* renamed from: c */
    public final C10487e f24892c;

    /* renamed from: d */
    public final AbstractC9735o f24893d;

    /* renamed from: e */
    public C10490h.b f24894e;

    /* renamed from: f */
    public C10490h f24895f;

    /* renamed from: g */
    public int f24896g;

    /* renamed from: h */
    public int f24897h;

    /* renamed from: i */
    public int f24898i;

    /* renamed from: j */
    public C9721a0 f24899j;

    public C10486d(C10488f connectionPool, C9720a address, C10487e call, AbstractC9735o eventListener) {
        AbstractC9979u.m20294g(connectionPool, "connectionPool");
        AbstractC9979u.m20294g(address, "address");
        AbstractC9979u.m20294g(call, "call");
        AbstractC9979u.m20294g(eventListener, "eventListener");
        this.f24890a = connectionPool;
        this.f24891b = address;
        this.f24892c = call;
        this.f24893d = eventListener;
    }

    /* renamed from: a */
    public final InterfaceC10677d m21879a(C9742v client, C10680g chain) {
        AbstractC9979u.m20294g(client, "client");
        AbstractC9979u.m20294g(chain, "chain");
        try {
        } catch (IOException e10) {
            e = e10;
        } catch (RouteException e11) {
            e = e11;
        }
        try {
            return m21881c(chain.m22629f(), chain.m22631h(), chain.m22633j(), client.m19505A(), client.m19511G(), !AbstractC9979u.m20289b(chain.m22632i().m19589g(), "GET")).m22013x(client, chain);
        } catch (IOException e12) {
            e = e12;
            IOException iOException = e;
            m21886h(iOException);
            throw new RouteException(iOException);
        } catch (RouteException e13) {
            e = e13;
            RouteException routeException = e;
            m21886h(routeException.m22018d());
            throw routeException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0146  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RealConnection m21880b(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p281oe.C10486d.m21880b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* renamed from: c */
    public final RealConnection m21881c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            RealConnection realConnectionM21880b = m21880b(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            if (realConnectionM21880b.m22011v(z11)) {
                return realConnectionM21880b;
            }
            realConnectionM21880b.m22015z();
            if (this.f24899j == null) {
                C10490h.b bVar = this.f24894e;
                if (bVar != null ? bVar.m21936b() : true) {
                    continue;
                } else {
                    C10490h c10490h = this.f24895f;
                    if (!(c10490h != null ? c10490h.m21928a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i10 = i17;
            i11 = i16;
            i12 = i15;
            i13 = i14;
            z10 = z12;
        }
    }

    /* renamed from: d */
    public final C9720a m21882d() {
        return this.f24891b;
    }

    /* renamed from: e */
    public final boolean m21883e() {
        C10490h c10490h;
        if (this.f24896g == 0 && this.f24897h == 0 && this.f24898i == 0) {
            return false;
        }
        if (this.f24899j != null) {
            return true;
        }
        C9721a0 c9721a0M21884f = m21884f();
        if (c9721a0M21884f != null) {
            this.f24899j = c9721a0M21884f;
            return true;
        }
        C10490h.b bVar = this.f24894e;
        if ((bVar == null || !bVar.m21936b()) && (c10490h = this.f24895f) != null) {
            return c10490h.m21928a();
        }
        return true;
    }

    /* renamed from: f */
    public final C9721a0 m21884f() {
        RealConnection realConnectionM21899m;
        if (this.f24896g > 1 || this.f24897h > 1 || this.f24898i > 0 || (realConnectionM21899m = this.f24892c.m21899m()) == null) {
            return null;
        }
        synchronized (realConnectionM21899m) {
            if (realConnectionM21899m.m22007r() != 0) {
                return null;
            }
            if (AbstractC9920d.m20028j(realConnectionM21899m.m21984A().m19297a().m19296l(), this.f24891b.m19296l())) {
                return realConnectionM21899m.m21984A();
            }
            return null;
        }
    }

    /* renamed from: g */
    public final boolean m21885g(C9738r url) {
        AbstractC9979u.m20294g(url, "url");
        C9738r c9738rM19296l = this.f24891b.m19296l();
        return url.m19424n() == c9738rM19296l.m19424n() && AbstractC9979u.m20289b(url.m19419i(), c9738rM19296l.m19419i());
    }

    /* renamed from: h */
    public final void m21886h(IOException e10) {
        AbstractC9979u.m20294g(e10, "e");
        this.f24899j = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).f25154c == ErrorCode.REFUSED_STREAM) {
            this.f24896g++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.f24897h++;
        } else {
            this.f24898i++;
        }
    }
}
