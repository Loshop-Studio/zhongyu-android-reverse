package p203o9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.text.Regex;
import okhttp3.internal.http2.ConnectionShutdownException;
import p136i9.AbstractC8901c0;
import p136i9.C8897a0;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8907f0;
import p136i9.C8925w;
import p136i9.InterfaceC8926x;
import p147j9.AbstractC9041k;
import p192n9.C9481h;
import p192n9.C9487n;
import p192n9.C9488o;

/* renamed from: o9.j */
/* loaded from: classes5.dex */
public final class C9555j implements InterfaceC8926x {

    /* renamed from: b */
    public static final a f18931b = new a(null);

    /* renamed from: a */
    public final C8897a0 f18932a;

    /* renamed from: o9.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9555j(C8897a0 client) {
        AbstractC9133u.m16133g(client, "client");
        this.f18932a = client;
    }

    /* renamed from: a */
    public final C8899b0 m17860a(C8903d0 c8903d0, String str) {
        String strM15123k;
        C8925w c8925wM15292p;
        if (!this.f18932a.m14983s() || (strM15123k = C8903d0.m15123k(c8903d0, HttpHeaders.LOCATION, null, 2, null)) == null || (c8925wM15292p = c8903d0.m15141t().m15052l().m15292p(strM15123k)) == null) {
            return null;
        }
        if (!AbstractC9133u.m16128b(c8925wM15292p.m15293q(), c8903d0.m15141t().m15052l().m15293q()) && !this.f18932a.m14984t()) {
            return null;
        }
        C8899b0.a aVarM15049i = c8903d0.m15141t().m15049i();
        if (C9551f.m17844a(str)) {
            int iM15128f = c8903d0.m15128f();
            C9551f c9551f = C9551f.f18917a;
            boolean z10 = c9551f.m17847c(str) || iM15128f == 308 || iM15128f == 307;
            if (!c9551f.m17846b(str) || iM15128f == 308 || iM15128f == 307) {
                aVarM15049i.m15069q(str, z10 ? c8903d0.m15141t().m15041a() : null);
            } else {
                aVarM15049i.m15069q("GET", null);
            }
            if (!z10) {
                aVarM15049i.m15070r("Transfer-Encoding");
                aVarM15049i.m15070r(HttpHeaders.CONTENT_LENGTH);
                aVarM15049i.m15070r(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!AbstractC9041k.m15776f(c8903d0.m15141t().m15052l(), c8925wM15292p)) {
            aVarM15049i.m15070r(HttpHeaders.AUTHORIZATION);
        }
        return aVarM15049i.m15073u(c8925wM15292p).m15055b();
    }

    /* renamed from: b */
    public final C8899b0 m17861b(C8903d0 c8903d0, C9481h c9481h) throws ProtocolException {
        C9488o c9488oM17476j;
        C8907f0 c8907f0M17560t = (c9481h == null || (c9488oM17476j = c9481h.m17476j()) == null) ? null : c9488oM17476j.m17560t();
        int iM15128f = c8903d0.m15128f();
        String strM15048h = c8903d0.m15141t().m15048h();
        if (iM15128f != 307 && iM15128f != 308) {
            if (iM15128f == 401) {
                return this.f18932a.m14970f().mo15040a(c8907f0M17560t, c8903d0);
            }
            if (iM15128f == 421) {
                AbstractC8901c0 abstractC8901c0M15041a = c8903d0.m15141t().m15041a();
                if ((abstractC8901c0M15041a != null && abstractC8901c0M15041a.isOneShot()) || c9481h == null || !c9481h.m17480n()) {
                    return null;
                }
                c9481h.m17476j().m17559s();
                return c8903d0.m15141t();
            }
            if (iM15128f == 503) {
                C8903d0 c8903d0M15138q = c8903d0.m15138q();
                if ((c8903d0M15138q == null || c8903d0M15138q.m15128f() != 503) && m17865f(c8903d0, Integer.MAX_VALUE) == 0) {
                    return c8903d0.m15141t();
                }
                return null;
            }
            if (iM15128f == 407) {
                AbstractC9133u.m16130d(c8907f0M17560t);
                if (c8907f0M17560t.m15175b().type() == Proxy.Type.HTTP) {
                    return this.f18932a.m14958E().mo15040a(c8907f0M17560t, c8903d0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM15128f == 408) {
                if (!this.f18932a.m14961H()) {
                    return null;
                }
                AbstractC8901c0 abstractC8901c0M15041a2 = c8903d0.m15141t().m15041a();
                if (abstractC8901c0M15041a2 != null && abstractC8901c0M15041a2.isOneShot()) {
                    return null;
                }
                C8903d0 c8903d0M15138q2 = c8903d0.m15138q();
                if ((c8903d0M15138q2 == null || c8903d0M15138q2.m15128f() != 408) && m17865f(c8903d0, 0) <= 0) {
                    return c8903d0.m15141t();
                }
                return null;
            }
            switch (iM15128f) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m17860a(c8903d0, strM15048h);
    }

    /* renamed from: c */
    public final boolean m17862c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m17863d(IOException iOException, C9487n c9487n, C8899b0 c8899b0) {
        boolean z10 = iOException instanceof ConnectionShutdownException;
        boolean z11 = !z10;
        if (this.f18932a.m14961H()) {
            return (z10 || !m17864e(iOException, c8899b0)) && m17862c(iOException, z11) && c9487n.m17534z();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m17864e(IOException iOException, C8899b0 c8899b0) {
        AbstractC8901c0 abstractC8901c0M15041a = c8899b0.m15041a();
        return (abstractC8901c0M15041a != null && abstractC8901c0M15041a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m17865f(C8903d0 c8903d0, int i10) throws NumberFormatException {
        String strM15123k = C8903d0.m15123k(c8903d0, "Retry-After", null, 2, null);
        if (strM15123k == null) {
            return i10;
        }
        if (!new Regex("\\d+").m16181h(strM15123k)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM15123k);
        AbstractC9133u.m16132f(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = p147j9.AbstractC9033c.m15699a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r7 = r0.m15156n(r6).m15145c();
        r0 = r1.m17525p();
        r6 = m17861b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r0.m17481o() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.m17512A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1.m17523n().m15241n(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r1.m17520k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r0 = r6.m15041a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r1.m17523n().m15241n(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r1.m17520k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        p147j9.AbstractC9038h.m15750f(r7.m15124b());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r8 > 20) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r1.m17523n().m15241n(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r1.m17523n().m15241n(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r1.m17520k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r12.mo15333b(r0).m15137p().m15159q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    @Override // p136i9.InterfaceC8926x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p136i9.C8903d0 intercept(p136i9.InterfaceC8926x.a r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r12, r0)
            o9.g r12 = (p203o9.C9552g) r12
            i9.b0 r0 = r12.m17854i()
            n9.n r1 = r12.m17850e()
            java.util.List r2 = p134i7.AbstractC8809v.m14771n()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m17519j(r0, r6, r12)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto Ld0
            i9.d0 r6 = r12.mo15333b(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> Lb3
            i9.d0$a r6 = r6.m15137p()     // Catch: java.lang.Throwable -> L35
            i9.d0$a r0 = r6.m15159q(r0)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L39
            i9.d0 r6 = p147j9.AbstractC9033c.m15699a(r7)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r12 = move-exception
            r3 = r5
            goto Ld8
        L39:
            r6 = r4
        L3a:
            i9.d0$a r0 = r0.m15156n(r6)     // Catch: java.lang.Throwable -> L35
            i9.d0 r7 = r0.m15145c()     // Catch: java.lang.Throwable -> L35
            n9.h r0 = r1.m17525p()     // Catch: java.lang.Throwable -> L35
            i9.b0 r6 = r11.m17861b(r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L65
            if (r0 == 0) goto L57
            boolean r12 = r0.m17481o()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L57
            r1.m17512A()     // Catch: java.lang.Throwable -> L35
        L57:
            i9.r r12 = r1.m17523n()     // Catch: java.lang.Throwable -> L62
            r12.m15241n(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.m17520k(r3)
            return r7
        L62:
            r12 = move-exception
            goto Ld8
        L65:
            i9.c0 r0 = r6.m15041a()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            i9.r r12 = r1.m17523n()     // Catch: java.lang.Throwable -> L62
            r12.m15241n(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.m17520k(r3)
            return r7
        L7c:
            i9.e0 r0 = r7.m15124b()     // Catch: java.lang.Throwable -> L35
            p147j9.AbstractC9038h.m15750f(r0)     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L95
            i9.r r0 = r1.m17523n()     // Catch: java.lang.Throwable -> L35
            r0.m15241n(r1, r7, r6)     // Catch: java.lang.Throwable -> L35
            r1.m17520k(r5)
            r0 = r6
            goto L18
        L95:
            i9.r r12 = r1.m17523n()     // Catch: java.lang.Throwable -> L35
            r12.m15241n(r1, r7, r4)     // Catch: java.lang.Throwable -> L35
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            r0.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Lb3:
            r6 = move-exception
            boolean r9 = r11.m17863d(r6, r1, r0)     // Catch: java.lang.Throwable -> L35
            i9.r r10 = r1.m17523n()     // Catch: java.lang.Throwable -> L35
            r10.m15224A(r1, r6, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto Lcb
            java.util.List r2 = p134i7.AbstractC8778f0.m14530G0(r2, r6)     // Catch: java.lang.Throwable -> L35
            r1.m17520k(r5)
            r6 = r3
            goto L19
        Lcb:
            java.lang.Throwable r12 = p147j9.AbstractC9038h.m15743D(r6, r2)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld0:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Canceled"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld8:
            r1.m17520k(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p203o9.C9555j.intercept(i9.x$a):i9.d0");
    }
}
