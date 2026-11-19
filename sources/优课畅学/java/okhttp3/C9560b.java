package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p147j9.AbstractC9031a;
import p147j9.AbstractC9038h;
import p168l7.AbstractC9260b;

/* renamed from: okhttp3.b */
/* loaded from: classes5.dex */
public final class C9560b {

    /* renamed from: e */
    public static final b f19080e = new b(null);

    /* renamed from: f */
    public static final List f19081f;

    /* renamed from: g */
    public static final List f19082g;

    /* renamed from: h */
    public static final C9560b f19083h;

    /* renamed from: i */
    public static final C9560b f19084i;

    /* renamed from: j */
    public static final C9560b f19085j;

    /* renamed from: k */
    public static final C9560b f19086k;

    /* renamed from: a */
    public final boolean f19087a;

    /* renamed from: b */
    public final boolean f19088b;

    /* renamed from: c */
    public final String[] f19089c;

    /* renamed from: d */
    public final String[] f19090d;

    /* renamed from: okhttp3.b$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        public b() {
        }
    }

    static {
        C9559a c9559a = C9559a.f19052o1;
        C9559a c9559a2 = C9559a.f19055p1;
        C9559a c9559a3 = C9559a.f19058q1;
        C9559a c9559a4 = C9559a.f19010a1;
        C9559a c9559a5 = C9559a.f19022e1;
        C9559a c9559a6 = C9559a.f19013b1;
        C9559a c9559a7 = C9559a.f19025f1;
        C9559a c9559a8 = C9559a.f19043l1;
        C9559a c9559a9 = C9559a.f19040k1;
        List listM14774q = AbstractC8809v.m14774q(c9559a, c9559a2, c9559a3, c9559a4, c9559a5, c9559a6, c9559a7, c9559a8, c9559a9);
        f19081f = listM14774q;
        List listM14774q2 = AbstractC8809v.m14774q(c9559a, c9559a2, c9559a3, c9559a4, c9559a5, c9559a6, c9559a7, c9559a8, c9559a9, C9559a.f18980L0, C9559a.f18982M0, C9559a.f19036j0, C9559a.f19039k0, C9559a.f18971H, C9559a.f18979L, C9559a.f19041l);
        f19082g = listM14774q2;
        a aVar = new a(true);
        C9559a[] c9559aArr = (C9559a[]) listM14774q.toArray(new C9559a[0]);
        a aVarM17893c = aVar.m17893c((C9559a[]) Arrays.copyOf(c9559aArr, c9559aArr.length));
        TlsVersion tlsVersion = TlsVersion.f18949c;
        TlsVersion tlsVersion2 = TlsVersion.f18950d;
        f19083h = aVarM17893c.m17896f(tlsVersion, tlsVersion2).m17894d(true).m17891a();
        a aVar2 = new a(true);
        C9559a[] c9559aArr2 = (C9559a[]) listM14774q2.toArray(new C9559a[0]);
        f19084i = aVar2.m17893c((C9559a[]) Arrays.copyOf(c9559aArr2, c9559aArr2.length)).m17896f(tlsVersion, tlsVersion2).m17894d(true).m17891a();
        a aVar3 = new a(true);
        C9559a[] c9559aArr3 = (C9559a[]) listM14774q2.toArray(new C9559a[0]);
        f19085j = aVar3.m17893c((C9559a[]) Arrays.copyOf(c9559aArr3, c9559aArr3.length)).m17896f(tlsVersion, tlsVersion2, TlsVersion.f18951e, TlsVersion.f18952f).m17894d(true).m17891a();
        f19086k = new a(false).m17891a();
    }

    public C9560b(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f19087a = z10;
        this.f19088b = z11;
        this.f19089c = strArr;
        this.f19090d = strArr2;
    }

    /* renamed from: b */
    public final void m17883b(SSLSocket sslSocket, boolean z10) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        C9560b c9560bM17888g = m17888g(sslSocket, z10);
        if (c9560bM17888g.m17890i() != null) {
            sslSocket.setEnabledProtocols(c9560bM17888g.f19090d);
        }
        if (c9560bM17888g.m17884c() != null) {
            sslSocket.setEnabledCipherSuites(c9560bM17888g.f19089c);
        }
    }

    /* renamed from: c */
    public final List m17884c() {
        String[] strArr = this.f19089c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C9559a.f19011b.m17878b(str));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String[] m17885d() {
        return this.f19089c;
    }

    /* renamed from: e */
    public final boolean m17886e(SSLSocket socket) {
        AbstractC9133u.m16133g(socket, "socket");
        if (!this.f19087a) {
            return false;
        }
        String[] strArr = this.f19090d;
        if (strArr != null && !AbstractC9038h.m15756l(strArr, socket.getEnabledProtocols(), AbstractC9260b.m16979f())) {
            return false;
        }
        String[] strArr2 = this.f19089c;
        return strArr2 == null || AbstractC9038h.m15756l(strArr2, socket.getEnabledCipherSuites(), C9559a.f19011b.m17879c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9560b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f19087a;
        C9560b c9560b = (C9560b) obj;
        if (z10 != c9560b.f19087a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f19089c, c9560b.f19089c) && Arrays.equals(this.f19090d, c9560b.f19090d) && this.f19088b == c9560b.f19088b);
    }

    /* renamed from: f */
    public final boolean m17887f() {
        return this.f19087a;
    }

    /* renamed from: g */
    public final C9560b m17888g(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        AbstractC9133u.m16130d(enabledCipherSuites);
        String[] strArrM15698c = AbstractC9031a.m15698c(this, enabledCipherSuites);
        if (this.f19090d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC9133u.m16132f(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = AbstractC9038h.m15765u(enabledProtocols2, this.f19090d, AbstractC9260b.m16979f());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC9133u.m16130d(supportedCipherSuites);
        int iM15757m = AbstractC9038h.m15757m(supportedCipherSuites, "TLS_FALLBACK_SCSV", C9559a.f19011b.m17879c());
        if (z10 && iM15757m != -1) {
            String str = supportedCipherSuites[iM15757m];
            AbstractC9133u.m16132f(str, "get(...)");
            strArrM15698c = AbstractC9038h.m15751g(strArrM15698c, str);
        }
        return new a(this).m17892b((String[]) Arrays.copyOf(strArrM15698c, strArrM15698c.length)).m17895e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m17891a();
    }

    /* renamed from: h */
    public final boolean m17889h() {
        return this.f19088b;
    }

    public int hashCode() {
        if (!this.f19087a) {
            return 17;
        }
        String[] strArr = this.f19089c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f19090d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f19088b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m17890i() {
        String[] strArr = this.f19090d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f18948b.m17872a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f19087a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m17884c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m17890i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f19088b + ')';
    }

    /* renamed from: okhttp3.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f19091a;

        /* renamed from: b */
        public String[] f19092b;

        /* renamed from: c */
        public String[] f19093c;

        /* renamed from: d */
        public boolean f19094d;

        public a(boolean z10) {
            this.f19091a = z10;
        }

        /* renamed from: a */
        public final C9560b m17891a() {
            return new C9560b(this.f19091a, this.f19094d, this.f19092b, this.f19093c);
        }

        /* renamed from: b */
        public final a m17892b(String... cipherSuites) {
            AbstractC9133u.m16133g(cipherSuites, "cipherSuites");
            if (!this.f19091a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            this.f19092b = (String[]) objArrCopyOf;
            return this;
        }

        /* renamed from: c */
        public final a m17893c(C9559a... cipherSuites) {
            AbstractC9133u.m16133g(cipherSuites, "cipherSuites");
            if (!this.f19091a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C9559a c9559a : cipherSuites) {
                arrayList.add(c9559a.m17875c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m17892b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final a m17894d(boolean z10) {
            if (!this.f19091a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f19094d = z10;
            return this;
        }

        /* renamed from: e */
        public final a m17895e(String... tlsVersions) {
            AbstractC9133u.m16133g(tlsVersions, "tlsVersions");
            if (!this.f19091a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
            this.f19093c = (String[]) objArrCopyOf;
            return this;
        }

        /* renamed from: f */
        public final a m17896f(TlsVersion... tlsVersions) {
            AbstractC9133u.m16133g(tlsVersions, "tlsVersions");
            if (!this.f19091a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.m17871b());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m17895e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C9560b connectionSpec) {
            AbstractC9133u.m16133g(connectionSpec, "connectionSpec");
            this.f19091a = connectionSpec.m17887f();
            this.f19092b = connectionSpec.m17885d();
            this.f19093c = connectionSpec.f19090d;
            this.f19094d = connectionSpec.m17889h();
        }
    }
}
