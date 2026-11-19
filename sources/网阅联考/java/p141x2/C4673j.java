package p141x2;

import androidx.compose.animation.core.AnimationConstants;
import com.zykj.http.interceptor.HeadInterceptor;
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
import p117r2.AbstractC4523z;
import p117r2.C4496a0;
import p117r2.C4500c0;
import p117r2.C4517t;
import p117r2.C4521x;
import p117r2.C4522y;
import p117r2.InterfaceC4518u;
import p121s2.AbstractC4550b;
import p137w2.C4643c;
import p137w2.C4645e;

/* renamed from: x2.j */
/* loaded from: classes2.dex */
public final class C4673j implements InterfaceC4518u {

    /* renamed from: b */
    public static final a f5982b = new a(null);

    /* renamed from: a */
    public final C4521x f5983a;

    /* renamed from: x2.j$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4673j(C4521x client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f5983a = client;
    }

    /* renamed from: a */
    public final C4522y m6598a(C4496a0 c4496a0, String str) {
        String strM5799i;
        C4517t c4517tM5995q;
        if (!this.f5983a.m6084p() || (strM5799i = C4496a0.m5799i(c4496a0, "Location", null, 2, null)) == null || (c4517tM5995q = c4496a0.m5816r().m6141j().m5995q(strM5799i)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(c4517tM5995q.m5996r(), c4496a0.m5816r().m6141j().m5996r()) && !this.f5983a.m6085q()) {
            return null;
        }
        C4522y.a aVarM6139h = c4496a0.m5816r().m6139h();
        if (C4669f.m6582a(str)) {
            int iM5804e = c4496a0.m5804e();
            C4669f c4669f = C4669f.f5968a;
            boolean z3 = c4669f.m6585c(str) || iM5804e == 308 || iM5804e == 307;
            if (!c4669f.m6584b(str) || iM5804e == 308 || iM5804e == 307) {
                aVarM6139h.m6146e(str, z3 ? c4496a0.m5816r().m6132a() : null);
            } else {
                aVarM6139h.m6146e("GET", null);
            }
            if (!z3) {
                aVarM6139h.m6147f("Transfer-Encoding");
                aVarM6139h.m6147f("Content-Length");
                aVarM6139h.m6147f("Content-Type");
            }
        }
        if (!AbstractC4550b.m6225g(c4496a0.m5816r().m6141j(), c4517tM5995q)) {
            aVarM6139h.m6147f(HeadInterceptor.AUTH_KEY);
        }
        return aVarM6139h.m6150i(c4517tM5995q).m6143b();
    }

    /* renamed from: b */
    public final C4522y m6599b(C4496a0 c4496a0, C4643c c4643c) throws ProtocolException {
        RealConnection realConnectionM6480h;
        C4500c0 c4500c0M5617z = (c4643c == null || (realConnectionM6480h = c4643c.m6480h()) == null) ? null : realConnectionM6480h.m5617z();
        int iM5804e = c4496a0.m5804e();
        String strM6138g = c4496a0.m5816r().m6138g();
        if (iM5804e != 307 && iM5804e != 308) {
            if (iM5804e == 401) {
                return this.f5983a.m6073e().mo5837a(c4500c0M5617z, c4496a0);
            }
            if (iM5804e == 421) {
                AbstractC4523z abstractC4523zM6132a = c4496a0.m5816r().m6132a();
                if ((abstractC4523zM6132a != null && abstractC4523zM6132a.isOneShot()) || c4643c == null || !c4643c.m6483k()) {
                    return null;
                }
                c4643c.m6480h().m5615x();
                return c4496a0.m5816r();
            }
            if (iM5804e == 503) {
                C4496a0 c4496a0M5813o = c4496a0.m5813o();
                if ((c4496a0M5813o == null || c4496a0M5813o.m5804e() != 503) && m6603f(c4496a0, Integer.MAX_VALUE) == 0) {
                    return c4496a0.m5816r();
                }
                return null;
            }
            if (iM5804e == 407) {
                Intrinsics.checkNotNull(c4500c0M5617z);
                if (c4500c0M5617z.m5848b().type() == Proxy.Type.HTTP) {
                    return this.f5983a.m6093y().mo5837a(c4500c0M5617z, c4496a0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM5804e == 408) {
                if (!this.f5983a.m6068B()) {
                    return null;
                }
                AbstractC4523z abstractC4523zM6132a2 = c4496a0.m5816r().m6132a();
                if (abstractC4523zM6132a2 != null && abstractC4523zM6132a2.isOneShot()) {
                    return null;
                }
                C4496a0 c4496a0M5813o2 = c4496a0.m5813o();
                if ((c4496a0M5813o2 == null || c4496a0M5813o2.m5804e() != 408) && m6603f(c4496a0, 0) <= 0) {
                    return c4496a0.m5816r();
                }
                return null;
            }
            switch (iM5804e) {
                case AnimationConstants.DefaultDurationMillis /* 300 */:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m6598a(c4496a0, strM6138g);
    }

    /* renamed from: c */
    public final boolean m6600c(IOException iOException, boolean z3) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z3 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m6601d(IOException iOException, C4645e c4645e, C4522y c4522y, boolean z3) {
        if (this.f5983a.m6068B()) {
            return !(z3 && m6602e(iOException, c4522y)) && m6600c(iOException, z3) && c4645e.m6525w();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m6602e(IOException iOException, C4522y c4522y) {
        AbstractC4523z abstractC4523zM6132a = c4522y.m6132a();
        return (abstractC4523zM6132a != null && abstractC4523zM6132a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m6603f(C4496a0 c4496a0, int i4) throws NumberFormatException {
        String strM5799i = C4496a0.m5799i(c4496a0, "Retry-After", null, 2, null);
        if (strM5799i == null) {
            return i4;
        }
        if (!new Regex("\\d+").matches(strM5799i)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM5799i);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
        r0 = r1.m6517o();
        r6 = m6599b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.m6484l() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r1.m6527y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r1.m6512j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        r0 = r6.m6132a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r0.isOneShot() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r1.m6512j(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r0 = r7.m5800a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        p121s2.AbstractC4550b.m6228j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r8 > 20) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r0 = r0.m5812n().m5832o(r7.m5812n().m5819b(null).m5820c()).m5820c();
     */
    @Override // p117r2.InterfaceC4518u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p117r2.C4496a0 intercept(p117r2.InterfaceC4518u.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            x2.g r11 = (p141x2.C4670g) r11
            r2.y r0 = r11.m6592h()
            w2.e r1 = r11.m6588d()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m6511i(r0, r6)
            boolean r6 = r1.mo5868T()     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto Lcf
            r2.a0 r0 = r11.mo6046a(r0)     // Catch: java.io.IOException -> L95 okhttp3.internal.connection.RouteException -> Lad java.lang.Throwable -> Ld7
            if (r7 == 0) goto L40
            r2.a0$a r0 = r0.m5812n()     // Catch: java.lang.Throwable -> Ld7
            r2.a0$a r6 = r7.m5812n()     // Catch: java.lang.Throwable -> Ld7
            r2.a0$a r6 = r6.m5819b(r4)     // Catch: java.lang.Throwable -> Ld7
            r2.a0 r6 = r6.m5820c()     // Catch: java.lang.Throwable -> Ld7
            r2.a0$a r0 = r0.m5832o(r6)     // Catch: java.lang.Throwable -> Ld7
            r2.a0 r0 = r0.m5820c()     // Catch: java.lang.Throwable -> Ld7
        L40:
            r7 = r0
            w2.c r0 = r1.m6517o()     // Catch: java.lang.Throwable -> Ld7
            r2.y r6 = r10.m6599b(r7, r0)     // Catch: java.lang.Throwable -> Ld7
            if (r6 != 0) goto L5a
            if (r0 == 0) goto L56
            boolean r11 = r0.m6484l()     // Catch: java.lang.Throwable -> Ld7
            if (r11 == 0) goto L56
            r1.m6527y()     // Catch: java.lang.Throwable -> Ld7
        L56:
            r1.m6512j(r3)
            return r7
        L5a:
            r2.z r0 = r6.m6132a()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L6a
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L6a
            r1.m6512j(r3)
            return r7
        L6a:
            r2.b0 r0 = r7.m5800a()     // Catch: java.lang.Throwable -> Ld7
            if (r0 == 0) goto L73
            p121s2.AbstractC4550b.m6228j(r0)     // Catch: java.lang.Throwable -> Ld7
        L73:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L7e
            r1.m6512j(r5)
            r0 = r6
            goto L18
        L7e:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> Ld7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld7
            r0.<init>()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld7
            r0.append(r8)     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld7
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        L95:
            r6 = move-exception
            boolean r9 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> Ld7
            if (r9 != 0) goto L9c
            r9 = r5
            goto L9d
        L9c:
            r9 = r3
        L9d:
            boolean r9 = r10.m6601d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto La8
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> Ld7
            goto Lc0
        La8:
            java.lang.Throwable r11 = p121s2.AbstractC4550b.m6217T(r6, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Lad:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> Ld7
            boolean r9 = r10.m6601d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> Ld7
            if (r9 == 0) goto Lc6
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> Ld7
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> Ld7
        Lc0:
            r1.m6512j(r5)
            r6 = r3
            goto L19
        Lc6:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> Ld7
            java.lang.Throwable r11 = p121s2.AbstractC4550b.m6217T(r11, r2)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Lcf:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r11     // Catch: java.lang.Throwable -> Ld7
        Ld7:
            r11 = move-exception
            r1.m6512j(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p141x2.C4673j.intercept(r2.u$a):r2.a0");
    }
}
