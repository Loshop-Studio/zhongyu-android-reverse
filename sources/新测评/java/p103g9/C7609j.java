package p103g9;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.connection.RealConnection;
import p011a9.AbstractC0061x;
import p011a9.C0038a0;
import p011a9.C0055r;
import p011a9.C0059v;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0056s;
import p028b9.AbstractC5070d;
import p092f9.C7499c;
import p092f9.C7501e;

/* renamed from: g9.j */
/* loaded from: classes5.dex */
public final class C7609j implements InterfaceC0056s {

    /* renamed from: b */
    public static final a f12762b = new a(null);

    /* renamed from: a */
    public final C0059v f12763a;

    /* renamed from: g9.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7609j(C0059v client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f12763a = client;
    }

    /* renamed from: a */
    public final C0060w m12525a(C0062y c0062y, String str) {
        String strM413n;
        C0055r c0055rM218q;
        if (!this.f12763a.m320t() || (strM413n = C0062y.m413n(c0062y, HttpHeaders.LOCATION, null, 2, null)) == null || (c0055rM218q = c0062y.m431w().m381j().m218q(strM413n)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(c0055rM218q.m219r(), c0062y.m431w().m381j().m219r()) && !this.f12763a.m321u()) {
            return null;
        }
        C0060w.a aVarM379h = c0062y.m431w().m379h();
        if (C7605f.m12509a(str)) {
            int iM418i = c0062y.m418i();
            C7605f c7605f = C7605f.f12748a;
            boolean z9 = c7605f.m12512c(str) || iM418i == 308 || iM418i == 307;
            if (!c7605f.m12511b(str) || iM418i == 308 || iM418i == 307) {
                aVarM379h.m391j(str, z9 ? c0062y.m431w().m372a() : null);
            } else {
                aVarM379h.m391j("GET", null);
            }
            if (!z9) {
                aVarM379h.m393l("Transfer-Encoding");
                aVarM379h.m393l(HttpHeaders.CONTENT_LENGTH);
                aVarM379h.m393l(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!AbstractC5070d.m2645j(c0062y.m431w().m381j(), c0055rM218q)) {
            aVarM379h.m393l(HttpHeaders.AUTHORIZATION);
        }
        return aVarM379h.m395n(c0055rM218q).m384b();
    }

    /* renamed from: b */
    public final C0060w m12526b(C0062y c0062y, C7499c c7499c) throws ProtocolException {
        RealConnection realConnectionM12137h;
        C0038a0 c0038a0M14455z = (c7499c == null || (realConnectionM12137h = c7499c.m12137h()) == null) ? null : realConnectionM12137h.m14455z();
        int iM418i = c0062y.m418i();
        String strM378g = c0062y.m431w().m378g();
        if (iM418i != 307 && iM418i != 308) {
            if (iM418i == 401) {
                return this.f12763a.m308f().mo90a(c0038a0M14455z, c0062y);
            }
            if (iM418i == 421) {
                AbstractC0061x abstractC0061xM372a = c0062y.m431w().m372a();
                if ((abstractC0061xM372a != null && abstractC0061xM372a.isOneShot()) || c7499c == null || !c7499c.m12141l()) {
                    return null;
                }
                c7499c.m12137h().m14453x();
                return c0062y.m431w();
            }
            if (iM418i == 503) {
                C0062y c0062yM428t = c0062y.m428t();
                if ((c0062yM428t == null || c0062yM428t.m418i() != 503) && m12530f(c0062y, Integer.MAX_VALUE) == 0) {
                    return c0062y.m431w();
                }
                return null;
            }
            if (iM418i == 407) {
                Intrinsics.checkNotNull(c0038a0M14455z);
                if (c0038a0M14455z.m87b().type() == Proxy.Type.HTTP) {
                    return this.f12763a.m299E().mo90a(c0038a0M14455z, c0062y);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM418i == 408) {
                if (!this.f12763a.m302H()) {
                    return null;
                }
                AbstractC0061x abstractC0061xM372a2 = c0062y.m431w().m372a();
                if (abstractC0061xM372a2 != null && abstractC0061xM372a2.isOneShot()) {
                    return null;
                }
                C0062y c0062yM428t2 = c0062y.m428t();
                if ((c0062yM428t2 == null || c0062yM428t2.m418i() != 408) && m12530f(c0062y, 0) <= 0) {
                    return c0062y.m431w();
                }
                return null;
            }
            switch (iM418i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m12525a(c0062y, strM378g);
    }

    /* renamed from: c */
    public final boolean m12527c(IOException iOException, boolean z9) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z9 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m12528d(IOException iOException, C7501e c7501e, C0060w c0060w, boolean z9) {
        if (this.f12763a.m302H()) {
            return !(z9 && m12529e(iOException, c0060w)) && m12527c(iOException, z9) && c7501e.m12185y();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m12529e(IOException iOException, C0060w c0060w) {
        AbstractC0061x abstractC0061xM372a = c0060w.m372a();
        return (abstractC0061xM372a != null && abstractC0061xM372a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m12530f(C0062y c0062y, int i10) throws NumberFormatException {
        String strM413n = C0062y.m413n(c0062y, "Retry-After", null, 2, null);
        if (strM413n == null) {
            return i10;
        }
        if (!new Regex("\\d+").matches(strM413n)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM413n);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.m12177q();
        r6 = m12526b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.m12142m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.m12163A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.m12172k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.m372a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.m12172k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.m414a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        p028b9.AbstractC5070d.m2648m(r0);
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
    
        r0 = r0.m427s().m447o(r7.m427s().m434b(null).m435c()).m435c();
     */
    @Override // p011a9.InterfaceC0056s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p011a9.C0062y intercept(p011a9.InterfaceC0056s.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            g9.g r11 = (p103g9.C7606g) r11
            a9.w r0 = r11.m12519i()
            f9.e r1 = r11.m12515e()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m12171i(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Lcf
            a9.y r0 = r11.mo269b(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 okhttp3.internal.connection.RouteException -> Lb2
            if (r7 == 0) goto L40
            a9.y$a r0 = r0.m427s()     // Catch: java.lang.Throwable -> L42
            a9.y$a r6 = r7.m427s()     // Catch: java.lang.Throwable -> L42
            a9.y$a r6 = r6.m434b(r4)     // Catch: java.lang.Throwable -> L42
            a9.y r6 = r6.m435c()     // Catch: java.lang.Throwable -> L42
            a9.y$a r0 = r0.m447o(r6)     // Catch: java.lang.Throwable -> L42
            a9.y r0 = r0.m435c()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ld7
        L45:
            f9.c r0 = r1.m12177q()     // Catch: java.lang.Throwable -> L42
            a9.w r6 = r10.m12526b(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.m12142m()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.m12163A()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.m12172k(r3)
            return r7
        L5e:
            a9.x r0 = r6.m372a()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.m12172k(r3)
            return r7
        L6e:
            a9.z r0 = r7.m414a()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            p028b9.AbstractC5070d.m2648m(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.m12172k(r5)
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
            boolean r9 = r10.m12528d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lad
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L42
        La7:
            r1.m12172k(r5)
            r6 = r3
            goto L19
        Lad:
            java.lang.Throwable r11 = p028b9.AbstractC5070d.m2634Y(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lb2:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.m12528d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lc6
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La7
        Lc6:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = p028b9.AbstractC5070d.m2634Y(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lcf:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld7:
            r1.m12172k(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p103g9.C7609j.intercept(a9.s$a):a9.y");
    }
}
