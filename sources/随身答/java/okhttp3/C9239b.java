package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p182m8.AbstractC9045d;

/* renamed from: okhttp3.b */
/* loaded from: classes5.dex */
public final class C9239b {

    /* renamed from: e */
    public static final b f15800e = new b(null);

    /* renamed from: f */
    public static final C9238a[] f15801f;

    /* renamed from: g */
    public static final C9238a[] f15802g;

    /* renamed from: h */
    public static final C9239b f15803h;

    /* renamed from: i */
    public static final C9239b f15804i;

    /* renamed from: j */
    public static final C9239b f15805j;

    /* renamed from: k */
    public static final C9239b f15806k;

    /* renamed from: a */
    public final boolean f15807a;

    /* renamed from: b */
    public final boolean f15808b;

    /* renamed from: c */
    public final String[] f15809c;

    /* renamed from: d */
    public final String[] f15810d;

    /* renamed from: okhttp3.b$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    static {
        C9238a c9238a = C9238a.f15772o1;
        C9238a c9238a2 = C9238a.f15775p1;
        C9238a c9238a3 = C9238a.f15778q1;
        C9238a c9238a4 = C9238a.f15730a1;
        C9238a c9238a5 = C9238a.f15742e1;
        C9238a c9238a6 = C9238a.f15733b1;
        C9238a c9238a7 = C9238a.f15745f1;
        C9238a c9238a8 = C9238a.f15763l1;
        C9238a c9238a9 = C9238a.f15760k1;
        C9238a[] c9238aArr = {c9238a, c9238a2, c9238a3, c9238a4, c9238a5, c9238a6, c9238a7, c9238a8, c9238a9};
        f15801f = c9238aArr;
        C9238a[] c9238aArr2 = {c9238a, c9238a2, c9238a3, c9238a4, c9238a5, c9238a6, c9238a7, c9238a8, c9238a9, C9238a.f15700L0, C9238a.f15702M0, C9238a.f15756j0, C9238a.f15759k0, C9238a.f15691H, C9238a.f15699L, C9238a.f15761l};
        f15802g = c9238aArr2;
        a aVarM14853c = new a(true).m14853c((C9238a[]) Arrays.copyOf(c9238aArr, c9238aArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f15803h = aVarM14853c.m14856f(tlsVersion, tlsVersion2).m14854d(true).m14851a();
        f15804i = new a(true).m14853c((C9238a[]) Arrays.copyOf(c9238aArr2, c9238aArr2.length)).m14856f(tlsVersion, tlsVersion2).m14854d(true).m14851a();
        f15805j = new a(true).m14853c((C9238a[]) Arrays.copyOf(c9238aArr2, c9238aArr2.length)).m14856f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m14854d(true).m14851a();
        f15806k = new a(false).m14851a();
    }

    public C9239b(boolean z9, boolean z10, String[] strArr, String[] strArr2) {
        this.f15807a = z9;
        this.f15808b = z10;
        this.f15809c = strArr;
        this.f15810d = strArr2;
    }

    /* renamed from: c */
    public final void m14844c(SSLSocket sslSocket, boolean z9) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        C9239b c9239bM14848g = m14848g(sslSocket, z9);
        if (c9239bM14848g.m14850i() != null) {
            sslSocket.setEnabledProtocols(c9239bM14848g.f15810d);
        }
        if (c9239bM14848g.m14845d() != null) {
            sslSocket.setEnabledCipherSuites(c9239bM14848g.f15809c);
        }
    }

    /* renamed from: d */
    public final List m14845d() {
        String[] strArr = this.f15809c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C9238a.f15731b.m14838b(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    /* renamed from: e */
    public final boolean m14846e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f15807a) {
            return false;
        }
        String[] strArr = this.f15810d;
        if (strArr != null && !AbstractC9045d.m14505u(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f15809c;
        return strArr2 == null || AbstractC9045d.m14505u(strArr2, socket.getEnabledCipherSuites(), C9238a.f15731b.m14839c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9239b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z9 = this.f15807a;
        C9239b c9239b = (C9239b) obj;
        if (z9 != c9239b.f15807a) {
            return false;
        }
        return !z9 || (Arrays.equals(this.f15809c, c9239b.f15809c) && Arrays.equals(this.f15810d, c9239b.f15810d) && this.f15808b == c9239b.f15808b);
    }

    /* renamed from: f */
    public final boolean m14847f() {
        return this.f15807a;
    }

    /* renamed from: g */
    public final C9239b m14848g(SSLSocket sSLSocket, boolean z9) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f15809c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC9045d.m14463E(enabledCipherSuites, this.f15809c, C9238a.f15731b.m14839c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f15810d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC9045d.m14463E(enabledProtocols, this.f15810d, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iM14508x = AbstractC9045d.m14508x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C9238a.f15731b.m14839c());
        if (z9 && iM14508x != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iM14508x];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = AbstractC9045d.m14499o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarM14852b = aVar.m14852b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarM14852b.m14855e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m14851a();
    }

    /* renamed from: h */
    public final boolean m14849h() {
        return this.f15808b;
    }

    public int hashCode() {
        if (!this.f15807a) {
            return 17;
        }
        String[] strArr = this.f15809c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f15810d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f15808b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m14850i() {
        String[] strArr = this.f15810d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.m14832a(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public String toString() {
        if (!this.f15807a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m14845d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m14850i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f15808b + ')';
    }

    /* renamed from: okhttp3.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f15811a;

        /* renamed from: b */
        public String[] f15812b;

        /* renamed from: c */
        public String[] f15813c;

        /* renamed from: d */
        public boolean f15814d;

        public a(boolean z9) {
            this.f15811a = z9;
        }

        /* renamed from: a */
        public final C9239b m14851a() {
            return new C9239b(this.f15811a, this.f15814d, this.f15812b, this.f15813c);
        }

        /* renamed from: b */
        public final a m14852b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f15811a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f15812b = (String[]) cipherSuites.clone();
            return this;
        }

        /* renamed from: c */
        public final a m14853c(C9238a... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f15811a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C9238a c9238a : cipherSuites) {
                arrayList.add(c9238a.m14835c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m14852b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final a m14854d(boolean z9) {
            if (!this.f15811a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f15814d = z9;
            return this;
        }

        /* renamed from: e */
        public final a m14855e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f15811a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f15813c = (String[]) tlsVersions.clone();
            return this;
        }

        /* renamed from: f */
        public final a m14856f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f15811a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m14855e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C9239b connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f15811a = connectionSpec.m14847f();
            this.f15812b = connectionSpec.f15809c;
            this.f15813c = connectionSpec.f15810d;
            this.f15814d = connectionSpec.m14849h();
        }
    }
}
