package p092f9;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p011a9.AbstractC0052o;
import p011a9.C0037a;
import p011a9.C0038a0;
import p011a9.C0055r;
import p011a9.C0059v;
import p028b9.AbstractC5070d;
import p092f9.C7504h;
import p103g9.C7606g;
import p103g9.InterfaceC7603d;

/* renamed from: f9.d */
/* loaded from: classes5.dex */
public final class C7500d {

    /* renamed from: a */
    public final C7502f f12309a;

    /* renamed from: b */
    public final C0037a f12310b;

    /* renamed from: c */
    public final C7501e f12311c;

    /* renamed from: d */
    public final AbstractC0052o f12312d;

    /* renamed from: e */
    public C7504h.b f12313e;

    /* renamed from: f */
    public C7504h f12314f;

    /* renamed from: g */
    public int f12315g;

    /* renamed from: h */
    public int f12316h;

    /* renamed from: i */
    public int f12317i;

    /* renamed from: j */
    public C0038a0 f12318j;

    public C7500d(C7502f connectionPool, C0037a address, C7501e call, AbstractC0052o eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f12309a = connectionPool;
        this.f12310b = address;
        this.f12311c = call;
        this.f12312d = eventListener;
    }

    /* renamed from: a */
    public final InterfaceC7603d m12153a(C0059v client, C7606g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
        } catch (IOException e10) {
            e = e10;
        } catch (RouteException e11) {
            e = e11;
        }
        try {
            return m12155c(chain.m12516f(), chain.m12518h(), chain.m12520j(), client.m296B(), client.m302H(), !Intrinsics.areEqual(chain.m12519i().m378g(), "GET")).m14452w(client, chain);
        } catch (IOException e12) {
            e = e12;
            IOException iOException = e;
            m12160h(iOException);
            throw new RouteException(iOException);
        } catch (RouteException e13) {
            e = e13;
            RouteException routeException = e;
            m12160h(routeException.getLastConnectException());
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
    public final okhttp3.internal.connection.RealConnection m12154b(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p092f9.C7500d.m12154b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* renamed from: c */
    public final RealConnection m12155c(int i10, int i11, int i12, int i13, boolean z9, boolean z10) throws IOException {
        while (true) {
            RealConnection realConnectionM12154b = m12154b(i10, i11, i12, i13, z9);
            boolean z11 = z9;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            if (realConnectionM12154b.m14450u(z10)) {
                return realConnectionM12154b;
            }
            realConnectionM12154b.m14454y();
            if (this.f12318j == null) {
                C7504h.b bVar = this.f12313e;
                if (bVar != null ? bVar.m12210b() : true) {
                    continue;
                } else {
                    C7504h c7504h = this.f12314f;
                    if (!(c7504h != null ? c7504h.m12202a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i10 = i17;
            i11 = i16;
            i12 = i15;
            i13 = i14;
            z9 = z11;
        }
    }

    /* renamed from: d */
    public final C0037a m12156d() {
        return this.f12310b;
    }

    /* renamed from: e */
    public final boolean m12157e() {
        C7504h c7504h;
        if (this.f12315g == 0 && this.f12316h == 0 && this.f12317i == 0) {
            return false;
        }
        if (this.f12318j != null) {
            return true;
        }
        C0038a0 c0038a0M12158f = m12158f();
        if (c0038a0M12158f != null) {
            this.f12318j = c0038a0M12158f;
            return true;
        }
        C7504h.b bVar = this.f12313e;
        if ((bVar == null || !bVar.m12210b()) && (c7504h = this.f12314f) != null) {
            return c7504h.m12202a();
        }
        return true;
    }

    /* renamed from: f */
    public final C0038a0 m12158f() {
        RealConnection realConnectionM12174m;
        if (this.f12315g > 1 || this.f12316h > 1 || this.f12317i > 0 || (realConnectionM12174m = this.f12311c.m12174m()) == null) {
            return null;
        }
        synchronized (realConnectionM12174m) {
            if (realConnectionM12174m.m14446q() != 0) {
                return null;
            }
            if (AbstractC5070d.m2645j(realConnectionM12174m.m14455z().m86a().m85l(), this.f12310b.m85l())) {
                return realConnectionM12174m.m14455z();
            }
            return null;
        }
    }

    /* renamed from: g */
    public final boolean m12159g(C0055r url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C0055r c0055rM85l = this.f12310b.m85l();
        return url.m215n() == c0055rM85l.m215n() && Intrinsics.areEqual(url.m210i(), c0055rM85l.m210i());
    }

    /* renamed from: h */
    public final void m12160h(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f12318j = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f12315g++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.f12316h++;
        } else {
            this.f12317i++;
        }
    }
}
