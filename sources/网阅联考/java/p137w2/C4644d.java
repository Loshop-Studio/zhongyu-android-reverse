package p137w2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p117r2.AbstractC4514q;
import p117r2.C4495a;
import p117r2.C4500c0;
import p117r2.C4517t;
import p117r2.C4521x;
import p121s2.AbstractC4550b;
import p141x2.C4670g;
import p141x2.InterfaceC4667d;

/* renamed from: w2.d */
/* loaded from: classes2.dex */
public final class C4644d {

    /* renamed from: a */
    public RouteSelector.C4432b f5890a;

    /* renamed from: b */
    public RouteSelector f5891b;

    /* renamed from: c */
    public int f5892c;

    /* renamed from: d */
    public int f5893d;

    /* renamed from: e */
    public int f5894e;

    /* renamed from: f */
    public C4500c0 f5895f;

    /* renamed from: g */
    public final C4647g f5896g;

    /* renamed from: h */
    public final C4495a f5897h;

    /* renamed from: i */
    public final C4645e f5898i;

    /* renamed from: j */
    public final AbstractC4514q f5899j;

    public C4644d(C4647g connectionPool, C4495a address, C4645e call, AbstractC4514q eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f5896g = connectionPool;
        this.f5897h = address;
        this.f5898i = call;
        this.f5899j = eventListener;
    }

    /* renamed from: a */
    public final InterfaceC4667d m6495a(C4521x client, C4670g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            return m6497c(chain.m6589e(), chain.m6591g(), chain.m6593i(), client.m6090v(), client.m6068B(), !Intrinsics.areEqual(chain.m6592h().m6138g(), "GET")).m5614w(client, chain);
        } catch (IOException e4) {
            m6502h(e4);
            throw new RouteException(e4);
        } catch (RouteException e5) {
            m6502h(e5.getLastConnectException());
            throw e5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.internal.connection.RealConnection m6496b(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p137w2.C4644d.m6496b(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* renamed from: c */
    public final RealConnection m6497c(int i4, int i5, int i6, int i7, boolean z3, boolean z4) throws IOException {
        while (true) {
            RealConnection realConnectionM6496b = m6496b(i4, i5, i6, i7, z3);
            if (realConnectionM6496b.m5612u(z4)) {
                return realConnectionM6496b;
            }
            realConnectionM6496b.m5616y();
            if (this.f5895f == null) {
                RouteSelector.C4432b c4432b = this.f5890a;
                if (c4432b != null ? c4432b.m5632b() : true) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.f5891b;
                    if (!(routeSelector != null ? routeSelector.m5624b() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final C4495a m6498d() {
        return this.f5897h;
    }

    /* renamed from: e */
    public final boolean m6499e() {
        RouteSelector routeSelector;
        if (this.f5892c == 0 && this.f5893d == 0 && this.f5894e == 0) {
            return false;
        }
        if (this.f5895f != null) {
            return true;
        }
        C4500c0 c4500c0M6500f = m6500f();
        if (c4500c0M6500f != null) {
            this.f5895f = c4500c0M6500f;
            return true;
        }
        RouteSelector.C4432b c4432b = this.f5890a;
        if ((c4432b == null || !c4432b.m5632b()) && (routeSelector = this.f5891b) != null) {
            return routeSelector.m5624b();
        }
        return true;
    }

    /* renamed from: f */
    public final C4500c0 m6500f() {
        RealConnection realConnectionM6514l;
        if (this.f5892c > 1 || this.f5893d > 1 || this.f5894e > 0 || (realConnectionM6514l = this.f5898i.m6514l()) == null) {
            return null;
        }
        synchronized (realConnectionM6514l) {
            if (realConnectionM6514l.m5608q() != 0) {
                return null;
            }
            if (AbstractC4550b.m6225g(realConnectionM6514l.m5617z().m5847a().m5798l(), this.f5897h.m5798l())) {
                return realConnectionM6514l.m5617z();
            }
            return null;
        }
    }

    /* renamed from: g */
    public final boolean m6501g(C4517t url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C4517t c4517tM5798l = this.f5897h.m5798l();
        return url.m5992n() == c4517tM5798l.m5992n() && Intrinsics.areEqual(url.m5987i(), c4517tM5798l.m5987i());
    }

    /* renamed from: h */
    public final void m6502h(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f5895f = null;
        if ((e4 instanceof StreamResetException) && ((StreamResetException) e4).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f5892c++;
        } else if (e4 instanceof ConnectionShutdownException) {
            this.f5893d++;
        } else {
            this.f5894e++;
        }
    }
}
