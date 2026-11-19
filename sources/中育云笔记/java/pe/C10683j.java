package pe;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import je.AbstractC9744x;
import je.C9721a0;
import je.C9738r;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9739s;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.text.Regex;
import okhttp3.internal.connection.RealConnection;
import p281oe.C10485c;
import p281oe.C10487e;

/* renamed from: pe.j */
/* loaded from: classes6.dex */
public final class C10683j implements InterfaceC9739s {

    /* renamed from: b */
    public static final a f25747b = new a(null);

    /* renamed from: a */
    public final C9742v f25748a;

    /* renamed from: pe.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C10683j(C9742v client) {
        AbstractC9979u.m20294g(client, "client");
        this.f25748a = client;
    }

    /* renamed from: a */
    public final C9743w m22638a(C9745y c9745y, String str) {
        String strM19626p;
        C9738r c9738rM19427q;
        if (!this.f25748a.m19529s() || (strM19626p = C9745y.m19626p(c9745y, "Location", null, 2, null)) == null || (c9738rM19427q = c9745y.m19645z().m19592j().m19427q(strM19626p)) == null) {
            return null;
        }
        if (!AbstractC9979u.m20289b(c9738rM19427q.m19428r(), c9745y.m19645z().m19592j().m19428r()) && !this.f25748a.m19530t()) {
            return null;
        }
        C9743w.a aVarM19590h = c9745y.m19645z().m19590h();
        if (C10679f.m22622a(str)) {
            int iM19632j = c9745y.m19632j();
            C10679f c10679f = C10679f.f25733a;
            boolean z10 = c10679f.m22625c(str) || iM19632j == 308 || iM19632j == 307;
            if (!c10679f.m22624b(str) || iM19632j == 308 || iM19632j == 307) {
                aVarM19590h.m19602j(str, z10 ? c9745y.m19645z().m19583a() : null);
            } else {
                aVarM19590h.m19602j("GET", null);
            }
            if (!z10) {
                aVarM19590h.m19605m("Transfer-Encoding");
                aVarM19590h.m19605m("Content-Length");
                aVarM19590h.m19605m("Content-Type");
            }
        }
        if (!AbstractC9920d.m20028j(c9745y.m19645z().m19592j(), c9738rM19427q)) {
            aVarM19590h.m19605m("Authorization");
        }
        return aVarM19590h.m19609q(c9738rM19427q).m19595b();
    }

    /* renamed from: b */
    public final C9743w m22639b(C9745y c9745y, C10485c c10485c) throws ProtocolException {
        RealConnection realConnectionM21863h;
        C9721a0 c9721a0M21984A = (c10485c == null || (realConnectionM21863h = c10485c.m21863h()) == null) ? null : realConnectionM21863h.m21984A();
        int iM19632j = c9745y.m19632j();
        String strM19589g = c9745y.m19645z().m19589g();
        if (iM19632j != 307 && iM19632j != 308) {
            if (iM19632j == 401) {
                return this.f25748a.m19517g().mo19301a(c9721a0M21984A, c9745y);
            }
            if (iM19632j == 421) {
                AbstractC9744x abstractC9744xM19583a = c9745y.m19645z().m19583a();
                if ((abstractC9744xM19583a != null && abstractC9744xM19583a.isOneShot()) || c10485c == null || !c10485c.m21867l()) {
                    return null;
                }
                c10485c.m21863h().m22014y();
                return c9745y.m19645z();
            }
            if (iM19632j == 503) {
                C9745y c9745yM19642w = c9745y.m19642w();
                if ((c9745yM19642w == null || c9745yM19642w.m19632j() != 503) && m22643f(c9745y, Integer.MAX_VALUE) == 0) {
                    return c9745y.m19645z();
                }
                return null;
            }
            if (iM19632j == 407) {
                AbstractC9979u.m20291d(c9721a0M21984A);
                if (c9721a0M21984A.m19298b().type() == Proxy.Type.HTTP) {
                    return this.f25748a.m19508D().mo19301a(c9721a0M21984A, c9745y);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM19632j == 408) {
                if (!this.f25748a.m19511G()) {
                    return null;
                }
                AbstractC9744x abstractC9744xM19583a2 = c9745y.m19645z().m19583a();
                if (abstractC9744xM19583a2 != null && abstractC9744xM19583a2.isOneShot()) {
                    return null;
                }
                C9745y c9745yM19642w2 = c9745y.m19642w();
                if ((c9745yM19642w2 == null || c9745yM19642w2.m19632j() != 408) && m22643f(c9745y, 0) <= 0) {
                    return c9745y.m19645z();
                }
                return null;
            }
            switch (iM19632j) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m22638a(c9745y, strM19589g);
    }

    /* renamed from: c */
    public final boolean m22640c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m22641d(IOException iOException, C10487e c10487e, C9743w c9743w, boolean z10) {
        if (this.f25748a.m19511G()) {
            return !(z10 && m22642e(iOException, c9743w)) && m22640c(iOException, z10) && c10487e.m21910x();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m22642e(IOException iOException, C9743w c9743w) {
        AbstractC9744x abstractC9744xM19583a = c9743w.m19583a();
        return (abstractC9744xM19583a != null && abstractC9744xM19583a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m22643f(C9745y c9745y, int i10) throws NumberFormatException {
        String strM19626p = C9745y.m19626p(c9745y, "Retry-After", null, 2, null);
        if (strM19626p == null) {
            return i10;
        }
        if (!new Regex("\\d+").m20341g(strM19626p)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM19626p);
        AbstractC9979u.m20293f(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.m21902p();
        r6 = m22639b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.m21868m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.m21912z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.m21897k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.m19583a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.m21897k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.m19628e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        ke.AbstractC9920d.m20031m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.m19641v().m19660o(r7.m19641v().m19647b(null).m19648c()).m19648c();
     */
    @Override // je.InterfaceC9739s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public je.C9745y intercept(je.InterfaceC9739s.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r11, r0)
            pe.g r11 = (pe.C10680g) r11
            je.w r0 = r11.m22632i()
            oe.e r1 = r11.m22628e()
            java.util.List r2 = p325rc.AbstractC10978w.m24136n()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m21896j(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Ld3
            je.y r0 = r11.mo19477a(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 okhttp3.internal.connection.RouteException -> Lb4
            if (r7 == 0) goto L40
            je.y$a r0 = r0.m19641v()     // Catch: java.lang.Throwable -> L42
            je.y$a r6 = r7.m19641v()     // Catch: java.lang.Throwable -> L42
            je.y$a r6 = r6.m19647b(r4)     // Catch: java.lang.Throwable -> L42
            je.y r6 = r6.m19648c()     // Catch: java.lang.Throwable -> L42
            je.y$a r0 = r0.m19660o(r6)     // Catch: java.lang.Throwable -> L42
            je.y r0 = r0.m19648c()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ldb
        L45:
            oe.c r0 = r1.m21902p()     // Catch: java.lang.Throwable -> L42
            je.w r6 = r10.m22639b(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.m21868m()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.m21912z()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.m21897k(r3)
            return r7
        L5e:
            je.x r0 = r6.m19583a()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.m21897k(r3)
            return r7
        L6e:
            je.z r0 = r7.m19628e()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            ke.AbstractC9920d.m20031m(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.m21897k(r5)
            r0 = r6
            goto L18
        L82:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L42
            r0.append(r8)     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L42
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L99:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L42
            r9 = r9 ^ r5
            boolean r9 = r10.m22641d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Laf
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = p325rc.AbstractC10947g0.m23907I0(r2, r6)     // Catch: java.lang.Throwable -> L42
        La9:
            r1.m21897k(r5)
            r6 = r3
            goto L19
        Laf:
            java.lang.Throwable r11 = ke.AbstractC9920d.m20017Y(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lb4:
            r6 = move-exception
            java.io.IOException r9 = r6.m22018d()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.m22641d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L42
            java.io.IOException r6 = r6.m22017c()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = p325rc.AbstractC10947g0.m23907I0(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La9
        Lca:
            java.io.IOException r11 = r6.m22017c()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = ke.AbstractC9920d.m20017Y(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld3:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ldb:
            r1.m21897k(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.C10683j.intercept(je.s$a):je.y");
    }
}
