package p226q8;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p172l8.AbstractC8916o;
import p172l8.C8901a;
import p172l8.C8902a0;
import p172l8.C8919r;
import p172l8.C8923v;
import p182m8.AbstractC9045d;
import p226q8.C9385h;
import p236r8.C9445g;
import p236r8.InterfaceC9442d;

/* renamed from: q8.d */
/* loaded from: classes5.dex */
public final class C9381d {

    /* renamed from: a */
    public final C9383f f16317a;

    /* renamed from: b */
    public final C8901a f16318b;

    /* renamed from: c */
    public final C9382e f16319c;

    /* renamed from: d */
    public final AbstractC8916o f16320d;

    /* renamed from: e */
    public C9385h.b f16321e;

    /* renamed from: f */
    public C9385h f16322f;

    /* renamed from: g */
    public int f16323g;

    /* renamed from: h */
    public int f16324h;

    /* renamed from: i */
    public int f16325i;

    /* renamed from: j */
    public C8902a0 f16326j;

    public C9381d(C9383f connectionPool, C8901a address, C9382e call, AbstractC8916o eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f16317a = connectionPool;
        this.f16318b = address;
        this.f16319c = call;
        this.f16320d = eventListener;
    }

    /* renamed from: a */
    public final InterfaceC9442d m15385a(C8923v client, C9445g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
        } catch (IOException e10) {
            e = e10;
        } catch (RouteException e11) {
            e = e11;
        }
        try {
            return m15387c(chain.m15603f(), chain.m15605h(), chain.m15607j(), client.m14052B(), client.m14058H(), !Intrinsics.areEqual(chain.m15606i().m14134g(), "GET")).m14886w(client, chain);
        } catch (IOException e12) {
            e = e12;
            IOException iOException = e;
            m15392h(iOException);
            throw new RouteException(iOException);
        } catch (RouteException e13) {
            e = e13;
            RouteException routeException = e;
            m15392h(routeException.getLastConnectException());
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
    public final okhttp3.internal.connection.RealConnection m15386b(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p226q8.C9381d.m15386b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* renamed from: c */
    public final RealConnection m15387c(int i9, int i10, int i11, int i12, boolean z9, boolean z10) throws IOException {
        while (true) {
            RealConnection realConnectionM15386b = m15386b(i9, i10, i11, i12, z9);
            boolean z11 = z9;
            int i13 = i12;
            int i14 = i11;
            int i15 = i10;
            int i16 = i9;
            if (realConnectionM15386b.m14884u(z10)) {
                return realConnectionM15386b;
            }
            realConnectionM15386b.m14888y();
            if (this.f16326j == null) {
                C9385h.b bVar = this.f16321e;
                if (bVar != null ? bVar.m15442b() : true) {
                    continue;
                } else {
                    C9385h c9385h = this.f16322f;
                    if (!(c9385h != null ? c9385h.m15434a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i9 = i16;
            i10 = i15;
            i11 = i14;
            i12 = i13;
            z9 = z11;
        }
    }

    /* renamed from: d */
    public final C8901a m15388d() {
        return this.f16318b;
    }

    /* renamed from: e */
    public final boolean m15389e() {
        C9385h c9385h;
        if (this.f16323g == 0 && this.f16324h == 0 && this.f16325i == 0) {
            return false;
        }
        if (this.f16326j != null) {
            return true;
        }
        C8902a0 c8902a0M15390f = m15390f();
        if (c8902a0M15390f != null) {
            this.f16326j = c8902a0M15390f;
            return true;
        }
        C9385h.b bVar = this.f16321e;
        if ((bVar == null || !bVar.m15442b()) && (c9385h = this.f16322f) != null) {
            return c9385h.m15434a();
        }
        return true;
    }

    /* renamed from: f */
    public final C8902a0 m15390f() {
        RealConnection realConnectionM15406n;
        if (this.f16323g > 1 || this.f16324h > 1 || this.f16325i > 0 || (realConnectionM15406n = this.f16319c.m15406n()) == null) {
            return null;
        }
        synchronized (realConnectionM15406n) {
            if (realConnectionM15406n.m14880q() != 0) {
                return null;
            }
            if (AbstractC9045d.m14494j(realConnectionM15406n.m14889z().m13845a().m13844l(), this.f16318b.m13844l())) {
                return realConnectionM15406n.m14889z();
            }
            return null;
        }
    }

    /* renamed from: g */
    public final boolean m15391g(C8919r url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C8919r c8919rM13844l = this.f16318b.m13844l();
        return url.m13971n() == c8919rM13844l.m13971n() && Intrinsics.areEqual(url.m13966i(), c8919rM13844l.m13966i());
    }

    /* renamed from: h */
    public final void m15392h(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f16326j = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f16323g++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.f16324h++;
        } else {
            this.f16325i++;
        }
    }
}
