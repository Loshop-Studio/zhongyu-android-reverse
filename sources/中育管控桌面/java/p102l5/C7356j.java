package p102l5;

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
import okhttp3.internal.http2.ConnectionShutdownException;
import p058f5.AbstractC6360c0;
import p058f5.C6356a0;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6366f0;
import p058f5.C6384w;
import p058f5.InterfaceC6385x;
import p065g5.AbstractC6427k;
import p093k5.C6685h;
import p093k5.C6691n;
import p093k5.C6692o;

/* renamed from: l5.j */
/* loaded from: classes4.dex */
public final class C7356j implements InterfaceC6385x {

    /* renamed from: b */
    public static final a f9344b = new a(null);

    /* renamed from: a */
    public final C6356a0 f9345a;

    /* renamed from: l5.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C7356j(C6356a0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f9345a = client;
    }

    /* renamed from: a */
    public final C6358b0 m8355a(C6362d0 c6362d0, String str) {
        String strM6660o;
        C6384w c6384wM6831p;
        if (!this.f9345a.m6519s() || (strM6660o = C6362d0.m6660o(c6362d0, HttpHeaders.LOCATION, null, 2, null)) == null || (c6384wM6831p = c6362d0.m6678x().m6588l().m6831p(strM6660o)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual(c6384wM6831p.m6832q(), c6362d0.m6678x().m6588l().m6832q()) && !this.f9345a.m6520t()) {
            return null;
        }
        C6358b0.a aVarM6585i = c6362d0.m6678x().m6585i();
        if (C7352f.m8339a(str)) {
            int iM6665j = c6362d0.m6665j();
            C7352f c7352f = C7352f.f9330a;
            boolean z6 = c7352f.m8342c(str) || iM6665j == 308 || iM6665j == 307;
            if (!c7352f.m8341b(str) || iM6665j == 308 || iM6665j == 307) {
                aVarM6585i.m6605q(str, z6 ? c6362d0.m6678x().m6577a() : null);
            } else {
                aVarM6585i.m6605q("GET", null);
            }
            if (!z6) {
                aVarM6585i.m6607s("Transfer-Encoding");
                aVarM6585i.m6607s(HttpHeaders.CONTENT_LENGTH);
                aVarM6585i.m6607s(HttpHeaders.CONTENT_TYPE);
            }
        }
        if (!AbstractC6427k.m7018f(c6362d0.m6678x().m6588l(), c6384wM6831p)) {
            aVarM6585i.m6607s(HttpHeaders.AUTHORIZATION);
        }
        return aVarM6585i.m6610v(c6384wM6831p).m6591b();
    }

    /* renamed from: b */
    public final C6358b0 m8356b(C6362d0 c6362d0, C6685h c6685h) throws ProtocolException {
        C6692o c6692oM7743j;
        C6366f0 c6366f0M7827t = (c6685h == null || (c6692oM7743j = c6685h.m7743j()) == null) ? null : c6692oM7743j.m7827t();
        int iM6665j = c6362d0.m6665j();
        String strM6584h = c6362d0.m6678x().m6584h();
        if (iM6665j != 307 && iM6665j != 308) {
            if (iM6665j == 401) {
                return this.f9345a.m6506f().mo6576a(c6366f0M7827t, c6362d0);
            }
            if (iM6665j == 421) {
                AbstractC6360c0 abstractC6360c0M6577a = c6362d0.m6678x().m6577a();
                if ((abstractC6360c0M6577a != null && abstractC6360c0M6577a.isOneShot()) || c6685h == null || !c6685h.m7747n()) {
                    return null;
                }
                c6685h.m7743j().m7826s();
                return c6362d0.m6678x();
            }
            if (iM6665j == 503) {
                C6362d0 c6362d0M6675u = c6362d0.m6675u();
                if ((c6362d0M6675u == null || c6362d0M6675u.m6665j() != 503) && m8360f(c6362d0, Integer.MAX_VALUE) == 0) {
                    return c6362d0.m6678x();
                }
                return null;
            }
            if (iM6665j == 407) {
                Intrinsics.checkNotNull(c6366f0M7827t);
                if (c6366f0M7827t.m6714b().type() == Proxy.Type.HTTP) {
                    return this.f9345a.m6494E().mo6576a(c6366f0M7827t, c6362d0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM6665j == 408) {
                if (!this.f9345a.m6497H()) {
                    return null;
                }
                AbstractC6360c0 abstractC6360c0M6577a2 = c6362d0.m6678x().m6577a();
                if (abstractC6360c0M6577a2 != null && abstractC6360c0M6577a2.isOneShot()) {
                    return null;
                }
                C6362d0 c6362d0M6675u2 = c6362d0.m6675u();
                if ((c6362d0M6675u2 == null || c6362d0M6675u2.m6665j() != 408) && m8360f(c6362d0, 0) <= 0) {
                    return c6362d0.m6678x();
                }
                return null;
            }
            switch (iM6665j) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return m8355a(c6362d0, strM6584h);
    }

    /* renamed from: c */
    public final boolean m8357c(IOException iOException, boolean z6) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z6 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m8358d(IOException iOException, C6691n c6691n, C6358b0 c6358b0) {
        boolean z6 = iOException instanceof ConnectionShutdownException;
        boolean z7 = !z6;
        if (this.f9345a.m6497H()) {
            return (z6 || !m8359e(iOException, c6358b0)) && m8357c(iOException, z7) && c6691n.m7801z();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m8359e(IOException iOException, C6358b0 c6358b0) {
        AbstractC6360c0 abstractC6360c0M6577a = c6358b0.m6577a();
        return (abstractC6360c0M6577a != null && abstractC6360c0M6577a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m8360f(C6362d0 c6362d0, int i6) throws NumberFormatException {
        String strM6660o = C6362d0.m6660o(c6362d0, "Retry-After", null, 2, null);
        if (strM6660o == null) {
            return i6;
        }
        if (!new Regex("\\d+").matches(strM6660o)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strM6660o);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = p065g5.AbstractC6419c.m6941a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r7 = r0.m6693n(r6).m6682c();
        r0 = r1.m7792p();
        r6 = m8356b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r0.m7748o() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.m7779A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1.m7790n().m6780n(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r1.m7787k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r0 = r6.m6577a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r1.m7790n().m6780n(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r1.m7787k(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        p065g5.AbstractC6424h.m6992f(r7.m6661c());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r8 > 20) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r1.m7790n().m6780n(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r1.m7790n().m6780n(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d8, code lost:
    
        r1.m7787k(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00db, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r12.mo6872b(r0).m6674t().m6696q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    @Override // p058f5.InterfaceC6385x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p058f5.C6362d0 intercept(p058f5.InterfaceC6385x.a r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            l5.g r12 = (p102l5.C7353g) r12
            f5.b0 r0 = r12.m8349i()
            k5.n r1 = r12.m8345e()
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.m7786j(r0, r6, r12)
            boolean r6 = r1.isCanceled()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto Ld0
            f5.d0 r6 = r12.mo6872b(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> Lb3
            f5.d0$a r6 = r6.m6674t()     // Catch: java.lang.Throwable -> L35
            f5.d0$a r0 = r6.m6696q(r0)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L39
            f5.d0 r6 = p065g5.AbstractC6419c.m6941a(r7)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r12 = move-exception
            r3 = r5
            goto Ld8
        L39:
            r6 = r4
        L3a:
            f5.d0$a r0 = r0.m6693n(r6)     // Catch: java.lang.Throwable -> L35
            f5.d0 r7 = r0.m6682c()     // Catch: java.lang.Throwable -> L35
            k5.h r0 = r1.m7792p()     // Catch: java.lang.Throwable -> L35
            f5.b0 r6 = r11.m8356b(r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L65
            if (r0 == 0) goto L57
            boolean r12 = r0.m7748o()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L57
            r1.m7779A()     // Catch: java.lang.Throwable -> L35
        L57:
            f5.r r12 = r1.m7790n()     // Catch: java.lang.Throwable -> L62
            r12.m6780n(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.m7787k(r3)
            return r7
        L62:
            r12 = move-exception
            goto Ld8
        L65:
            f5.c0 r0 = r6.m6577a()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            f5.r r12 = r1.m7790n()     // Catch: java.lang.Throwable -> L62
            r12.m6780n(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.m7787k(r3)
            return r7
        L7c:
            f5.e0 r0 = r7.m6661c()     // Catch: java.lang.Throwable -> L35
            p065g5.AbstractC6424h.m6992f(r0)     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L95
            f5.r r0 = r1.m7790n()     // Catch: java.lang.Throwable -> L35
            r0.m6780n(r1, r7, r6)     // Catch: java.lang.Throwable -> L35
            r1.m7787k(r5)
            r0 = r6
            goto L18
        L95:
            f5.r r12 = r1.m7790n()     // Catch: java.lang.Throwable -> L35
            r12.m6780n(r1, r7, r4)     // Catch: java.lang.Throwable -> L35
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
            boolean r9 = r11.m8358d(r6, r1, r0)     // Catch: java.lang.Throwable -> L35
            f5.r r10 = r1.m7790n()     // Catch: java.lang.Throwable -> L35
            r10.m6763A(r1, r6, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto Lcb
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r6)     // Catch: java.lang.Throwable -> L35
            r1.m7787k(r5)
            r6 = r3
            goto L19
        Lcb:
            java.lang.Throwable r12 = p065g5.AbstractC6424h.m6985D(r6, r2)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld0:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Canceled"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld8:
            r1.m7787k(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p102l5.C7356j.intercept(f5.x$a):f5.d0");
    }
}
