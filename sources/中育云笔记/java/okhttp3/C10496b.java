package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10947g0;
import p364uc.AbstractC11382b;

/* renamed from: okhttp3.b */
/* loaded from: classes6.dex */
public final class C10496b {

    /* renamed from: e */
    public static final b f25097e = new b(null);

    /* renamed from: f */
    public static final C10495a[] f25098f;

    /* renamed from: g */
    public static final C10495a[] f25099g;

    /* renamed from: h */
    public static final C10496b f25100h;

    /* renamed from: i */
    public static final C10496b f25101i;

    /* renamed from: j */
    public static final C10496b f25102j;

    /* renamed from: k */
    public static final C10496b f25103k;

    /* renamed from: a */
    public final boolean f25104a;

    /* renamed from: b */
    public final boolean f25105b;

    /* renamed from: c */
    public final String[] f25106c;

    /* renamed from: d */
    public final String[] f25107d;

    /* renamed from: okhttp3.b$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        public b() {
        }
    }

    static {
        C10495a c10495a = C10495a.f25069o1;
        C10495a c10495a2 = C10495a.f25072p1;
        C10495a c10495a3 = C10495a.f25075q1;
        C10495a c10495a4 = C10495a.f25027a1;
        C10495a c10495a5 = C10495a.f25039e1;
        C10495a c10495a6 = C10495a.f25030b1;
        C10495a c10495a7 = C10495a.f25042f1;
        C10495a c10495a8 = C10495a.f25060l1;
        C10495a c10495a9 = C10495a.f25057k1;
        C10495a[] c10495aArr = {c10495a, c10495a2, c10495a3, c10495a4, c10495a5, c10495a6, c10495a7, c10495a8, c10495a9};
        f25098f = c10495aArr;
        C10495a[] c10495aArr2 = {c10495a, c10495a2, c10495a3, c10495a4, c10495a5, c10495a6, c10495a7, c10495a8, c10495a9, C10495a.f24997L0, C10495a.f24999M0, C10495a.f25053j0, C10495a.f25056k0, C10495a.f24988H, C10495a.f24996L, C10495a.f25058l};
        f25099g = c10495aArr2;
        a aVarM21979c = new a(true).m21979c((C10495a[]) Arrays.copyOf(c10495aArr, c10495aArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f25100h = aVarM21979c.m21982f(tlsVersion, tlsVersion2).m21980d(true).m21977a();
        f25101i = new a(true).m21979c((C10495a[]) Arrays.copyOf(c10495aArr2, c10495aArr2.length)).m21982f(tlsVersion, tlsVersion2).m21980d(true).m21977a();
        f25102j = new a(true).m21979c((C10495a[]) Arrays.copyOf(c10495aArr2, c10495aArr2.length)).m21982f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m21980d(true).m21977a();
        f25103k = new a(false).m21977a();
    }

    public C10496b(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f25104a = z10;
        this.f25105b = z11;
        this.f25106c = strArr;
        this.f25107d = strArr2;
    }

    /* renamed from: c */
    public final void m21970c(SSLSocket sslSocket, boolean z10) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        C10496b c10496bM21974g = m21974g(sslSocket, z10);
        if (c10496bM21974g.m21976i() != null) {
            sslSocket.setEnabledProtocols(c10496bM21974g.f25107d);
        }
        if (c10496bM21974g.m21971d() != null) {
            sslSocket.setEnabledCipherSuites(c10496bM21974g.f25106c);
        }
    }

    /* renamed from: d */
    public final List m21971d() {
        String[] strArr = this.f25106c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C10495a.f25028b.m21964b(str));
        }
        return AbstractC10947g0.m23922X0(arrayList);
    }

    /* renamed from: e */
    public final boolean m21972e(SSLSocket socket) {
        AbstractC9979u.m20294g(socket, "socket");
        if (!this.f25104a) {
            return false;
        }
        String[] strArr = this.f25107d;
        if (strArr != null && !AbstractC9920d.m20039u(strArr, socket.getEnabledProtocols(), AbstractC11382b.m25332f())) {
            return false;
        }
        String[] strArr2 = this.f25106c;
        return strArr2 == null || AbstractC9920d.m20039u(strArr2, socket.getEnabledCipherSuites(), C10495a.f25028b.m21965c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10496b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f25104a;
        C10496b c10496b = (C10496b) obj;
        if (z10 != c10496b.f25104a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f25106c, c10496b.f25106c) && Arrays.equals(this.f25107d, c10496b.f25107d) && this.f25105b == c10496b.f25105b);
    }

    /* renamed from: f */
    public final boolean m21973f() {
        return this.f25104a;
    }

    /* renamed from: g */
    public final C10496b m21974g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f25106c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            AbstractC9979u.m20293f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC9920d.m19997E(enabledCipherSuites, this.f25106c, C10495a.f25028b.m21965c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f25107d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            AbstractC9979u.m20293f(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC9920d.m19997E(enabledProtocols, this.f25107d, AbstractC11382b.m25332f());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC9979u.m20293f(supportedCipherSuites, "supportedCipherSuites");
        int iM20042x = AbstractC9920d.m20042x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C10495a.f25028b.m21965c());
        if (z10 && iM20042x != -1) {
            AbstractC9979u.m20293f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iM20042x];
            AbstractC9979u.m20293f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = AbstractC9920d.m20033o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        AbstractC9979u.m20293f(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarM21978b = aVar.m21978b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        AbstractC9979u.m20293f(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarM21978b.m21981e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m21977a();
    }

    /* renamed from: h */
    public final boolean m21975h() {
        return this.f25105b;
    }

    public int hashCode() {
        if (!this.f25104a) {
            return 17;
        }
        String[] strArr = this.f25106c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f25107d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f25105b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m21976i() {
        String[] strArr = this.f25107d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.f24966d.m21958a(str));
        }
        return AbstractC10947g0.m23922X0(arrayList);
    }

    public String toString() {
        if (!this.f25104a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m21971d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m21976i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f25105b + ')';
    }

    /* renamed from: okhttp3.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f25108a;

        /* renamed from: b */
        public String[] f25109b;

        /* renamed from: c */
        public String[] f25110c;

        /* renamed from: d */
        public boolean f25111d;

        public a(boolean z10) {
            this.f25108a = z10;
        }

        /* renamed from: a */
        public final C10496b m21977a() {
            return new C10496b(this.f25108a, this.f25111d, this.f25109b, this.f25110c);
        }

        /* renamed from: b */
        public final a m21978b(String... cipherSuites) {
            AbstractC9979u.m20294g(cipherSuites, "cipherSuites");
            if (!this.f25108a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f25109b = (String[]) cipherSuites.clone();
            return this;
        }

        /* renamed from: c */
        public final a m21979c(C10495a... cipherSuites) {
            AbstractC9979u.m20294g(cipherSuites, "cipherSuites");
            if (!this.f25108a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C10495a c10495a : cipherSuites) {
                arrayList.add(c10495a.m21961c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m21978b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final a m21980d(boolean z10) {
            if (!this.f25108a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f25111d = z10;
            return this;
        }

        /* renamed from: e */
        public final a m21981e(String... tlsVersions) {
            AbstractC9979u.m20294g(tlsVersions, "tlsVersions");
            if (!this.f25108a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f25110c = (String[]) tlsVersions.clone();
            return this;
        }

        /* renamed from: f */
        public final a m21982f(TlsVersion... tlsVersions) {
            AbstractC9979u.m20294g(tlsVersions, "tlsVersions");
            if (!this.f25108a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.m21957c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m21981e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C10496b connectionSpec) {
            AbstractC9979u.m20294g(connectionSpec, "connectionSpec");
            this.f25108a = connectionSpec.m21973f();
            this.f25109b = connectionSpec.f25106c;
            this.f25110c = connectionSpec.f25107d;
            this.f25111d = connectionSpec.m21975h();
        }
    }
}
