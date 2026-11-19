package p236r8;

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
import p172l8.AbstractC8925x;
import p172l8.C8902a0;
import p172l8.C8919r;
import p172l8.C8923v;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8920s;
import p182m8.AbstractC9045d;
import p226q8.C9380c;
import p226q8.C9382e;

/* renamed from: r8.j */
/* loaded from: classes5.dex */
public final class C9448j implements InterfaceC8920s {

    /* renamed from: b */
    public static final a f16474b = new a(null);

    /* renamed from: a */
    public final C8923v f16475a;

    /* renamed from: r8.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C9448j(C8923v client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f16475a = client;
    }

    /* renamed from: a */
    public final C8924w m15612a(C8926y c8926y, String str) {
        String strM14169n;
        C8919r c8919rM13974q;
        if (!this.f16475a.m14076t() || (strM14169n = C8926y.m14169n(c8926y, HttpHeaders.LOCATION, null, 2, null)) == null || (c8919rM13974q = c8926y.m14187w().m14137j().m13974q(strM14169n)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(c8919rM13974q.m13975r(), c8926y.m14187w().m14137j().m13975r()) && !this.f16475a.m14077u()) {
            return null;
        }
        C8924w.a aVarM14135h = c8926y.m14187w().m14135h();
        if (C9444f.m15596a(str)) {
            int iM14174i = c8926y.m14174i();
            C9444f c9444f = C9444f.f16460a;
            boolean z9 = c9444f.m15599c(str) || iM14174i == 308 || iM14174i == 307;
            if (!c9444f.m15598b(str) || iM14174i == 308 || iM14174i == 307) {
                aVarM14135h.m14147j(str, z9 ? c8926y.m14187w().m14128a() : null);
            } else {
                aVarM14135h.m14147j("GET", null);
            }
            if (!z9) {
                aVarM14135h.m14149l("Transfer-Encoding");
                aVarM14135h.m14149l(HttpHeaders.CONTENT_LENGTH);
                aVarM14135h.m14149l(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!AbstractC9045d.m14494j(c8926y.m14187w().m14137j(), c8919rM13974q)) {
            aVarM14135h.m14149l("Authorization");
        }
        return aVarM14135h.m14152o(c8919rM13974q).m14140b();
    }

    /* renamed from: b */
    public final C8924w m15613b(C8926y c8926y, C9380c c9380c) throws ProtocolException {
        RealConnection realConnectionM15369h;
        C8902a0 c8902a0M14889z = (c9380c == null || (realConnectionM15369h = c9380c.m15369h()) == null) ? null : realConnectionM15369h.m14889z();
        int iM14174i = c8926y.m14174i();
        String strM14134g = c8926y.m14187w().m14134g();
        if (iM14174i != 307 && iM14174i != 308) {
            if (iM14174i == 401) {
                return this.f16475a.m14064g().mo13849a(c8902a0M14889z, c8926y);
            }
            if (iM14174i == 421) {
                AbstractC8925x abstractC8925xM14128a = c8926y.m14187w().m14128a();
                if ((abstractC8925xM14128a != null && abstractC8925xM14128a.isOneShot()) || c9380c == null || !c9380c.m15373l()) {
                    return null;
                }
                c9380c.m15369h().m14887x();
                return c8926y.m14187w();
            }
            if (iM14174i == 503) {
                C8926y c8926yM14184t = c8926y.m14184t();
                if ((c8926yM14184t == null || c8926yM14184t.m14174i() != 503) && m15617f(c8926y, Integer.MAX_VALUE) == 0) {
                    return c8926y.m14187w();
                }
                return null;
            }
            if (iM14174i == 407) {
                Intrinsics.checkNotNull(c8902a0M14889z);
                if (c8902a0M14889z.m13846b().type() == Proxy.Type.HTTP) {
                    return this.f16475a.m14055E().mo13849a(c8902a0M14889z, c8926y);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM14174i == 408) {
                if (!this.f16475a.m14058H()) {
                    return null;
                }
                AbstractC8925x abstractC8925xM14128a2 = c8926y.m14187w().m14128a();
                if (abstractC8925xM14128a2 != null && abstractC8925xM14128a2.isOneShot()) {
                    return null;
                }
                C8926y c8926yM14184t2 = c8926y.m14184t();
                if ((c8926yM14184t2 == null || c8926yM14184t2.m14174i() != 408) && m15617f(c8926y, 0) <= 0) {
                    return c8926y.m14187w();
                }
                return null;
            }
            switch (iM14174i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m15612a(c8926y, strM14134g);
    }

    /* renamed from: c */
    public final boolean m15614c(IOException iOException, boolean z9) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z9 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m15615d(IOException iOException, C9382e c9382e, C8924w c8924w, boolean z9) {
        if (this.f16475a.m14058H()) {
            return !(z9 && m15616e(iOException, c8924w)) && m15614c(iOException, z9) && c9382e.m15417y();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m15616e(IOException iOException, C8924w c8924w) {
        AbstractC8925x abstractC8925xM14128a = c8924w.m14128a();
        return (abstractC8925xM14128a != null && abstractC8925xM14128a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m15617f(C8926y c8926y, int i9) throws NumberFormatException {
        String strM14169n = C8926y.m14169n(c8926y, "Retry-After", null, 2, null);
        if (strM14169n == null) {
            return i9;
        }
        if (!new Regex("\\d+").matches(strM14169n)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM14169n);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r0 = r1.m15409q();
        r6 = m15613b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r0.m15374m() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r1.m15395A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r1.m15404l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r0 = r6.m14128a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1.m15404l(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        r0 = r7.m14170a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        p182m8.AbstractC9045d.m14497m(r0);
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
    
        r0 = r0.m14183s().m14203o(r7.m14183s().m14190b(null).m14191c()).m14191c();
     */
    @Override // p172l8.InterfaceC8920s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p172l8.C8926y intercept(p172l8.InterfaceC8920s.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r8.g r11 = (p236r8.C9445g) r11
            l8.w r0 = r11.m15606i()
            q8.e r1 = r11.m15602e()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m15403j(r0, r6)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto Lcf
            l8.y r0 = r11.mo14025b(r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L99 okhttp3.internal.connection.RouteException -> Lb2
            if (r7 == 0) goto L40
            l8.y$a r0 = r0.m14183s()     // Catch: java.lang.Throwable -> L42
            l8.y$a r6 = r7.m14183s()     // Catch: java.lang.Throwable -> L42
            l8.y$a r6 = r6.m14190b(r4)     // Catch: java.lang.Throwable -> L42
            l8.y r6 = r6.m14191c()     // Catch: java.lang.Throwable -> L42
            l8.y$a r0 = r0.m14203o(r6)     // Catch: java.lang.Throwable -> L42
            l8.y r0 = r0.m14191c()     // Catch: java.lang.Throwable -> L42
        L40:
            r7 = r0
            goto L45
        L42:
            r11 = move-exception
            goto Ld7
        L45:
            q8.c r0 = r1.m15409q()     // Catch: java.lang.Throwable -> L42
            l8.w r6 = r10.m15613b(r7, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 != 0) goto L5e
            if (r0 == 0) goto L5a
            boolean r11 = r0.m15374m()     // Catch: java.lang.Throwable -> L42
            if (r11 == 0) goto L5a
            r1.m15395A()     // Catch: java.lang.Throwable -> L42
        L5a:
            r1.m15404l(r3)
            return r7
        L5e:
            l8.x r0 = r6.m14128a()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L6e
            r1.m15404l(r3)
            return r7
        L6e:
            l8.z r0 = r7.m14170a()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L77
            p182m8.AbstractC9045d.m14497m(r0)     // Catch: java.lang.Throwable -> L42
        L77:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L82
            r1.m15404l(r5)
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
            boolean r9 = r10.m15615d(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lad
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L42
        La7:
            r1.m15404l(r5)
            r6 = r3
            goto L19
        Lad:
            java.lang.Throwable r11 = p182m8.AbstractC9045d.m14483Y(r6, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lb2:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L42
            boolean r9 = r10.m15615d(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto Lc6
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L42
            goto La7
        Lc6:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L42
            java.lang.Throwable r11 = p182m8.AbstractC9045d.m14483Y(r11, r2)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Lcf:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        Ld7:
            r1.m15404l(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p236r8.C9448j.intercept(l8.s$a):l8.y");
    }
}
