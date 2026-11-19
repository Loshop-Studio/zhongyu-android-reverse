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
import p028b9.AbstractC5070d;

/* renamed from: okhttp3.b */
/* loaded from: classes5.dex */
public final class C8736b {

    /* renamed from: e */
    public static final b f14673e = new b(null);

    /* renamed from: f */
    public static final C8735a[] f14674f;

    /* renamed from: g */
    public static final C8735a[] f14675g;

    /* renamed from: h */
    public static final C8736b f14676h;

    /* renamed from: i */
    public static final C8736b f14677i;

    /* renamed from: j */
    public static final C8736b f14678j;

    /* renamed from: k */
    public static final C8736b f14679k;

    /* renamed from: a */
    public final boolean f14680a;

    /* renamed from: b */
    public final boolean f14681b;

    /* renamed from: c */
    public final String[] f14682c;

    /* renamed from: d */
    public final String[] f14683d;

    /* renamed from: okhttp3.b$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    static {
        C8735a c8735a = C8735a.f14645o1;
        C8735a c8735a2 = C8735a.f14648p1;
        C8735a c8735a3 = C8735a.f14651q1;
        C8735a c8735a4 = C8735a.f14603a1;
        C8735a c8735a5 = C8735a.f14615e1;
        C8735a c8735a6 = C8735a.f14606b1;
        C8735a c8735a7 = C8735a.f14618f1;
        C8735a c8735a8 = C8735a.f14636l1;
        C8735a c8735a9 = C8735a.f14633k1;
        C8735a[] c8735aArr = {c8735a, c8735a2, c8735a3, c8735a4, c8735a5, c8735a6, c8735a7, c8735a8, c8735a9};
        f14674f = c8735aArr;
        C8735a[] c8735aArr2 = {c8735a, c8735a2, c8735a3, c8735a4, c8735a5, c8735a6, c8735a7, c8735a8, c8735a9, C8735a.f14573L0, C8735a.f14575M0, C8735a.f14629j0, C8735a.f14632k0, C8735a.f14564H, C8735a.f14572L, C8735a.f14634l};
        f14675g = c8735aArr2;
        a aVarM14419c = new a(true).m14419c((C8735a[]) Arrays.copyOf(c8735aArr, c8735aArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f14676h = aVarM14419c.m14422f(tlsVersion, tlsVersion2).m14420d(true).m14417a();
        f14677i = new a(true).m14419c((C8735a[]) Arrays.copyOf(c8735aArr2, c8735aArr2.length)).m14422f(tlsVersion, tlsVersion2).m14420d(true).m14417a();
        f14678j = new a(true).m14419c((C8735a[]) Arrays.copyOf(c8735aArr2, c8735aArr2.length)).m14422f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m14420d(true).m14417a();
        f14679k = new a(false).m14417a();
    }

    public C8736b(boolean z9, boolean z10, String[] strArr, String[] strArr2) {
        this.f14680a = z9;
        this.f14681b = z10;
        this.f14682c = strArr;
        this.f14683d = strArr2;
    }

    /* renamed from: c */
    public final void m14410c(SSLSocket sslSocket, boolean z9) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        C8736b c8736bM14414g = m14414g(sslSocket, z9);
        if (c8736bM14414g.m14416i() != null) {
            sslSocket.setEnabledProtocols(c8736bM14414g.f14683d);
        }
        if (c8736bM14414g.m14411d() != null) {
            sslSocket.setEnabledCipherSuites(c8736bM14414g.f14682c);
        }
    }

    /* renamed from: d */
    public final List m14411d() {
        String[] strArr = this.f14682c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C8735a.f14604b.m14404b(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    /* renamed from: e */
    public final boolean m14412e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f14680a) {
            return false;
        }
        String[] strArr = this.f14683d;
        if (strArr != null && !AbstractC5070d.m2656u(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f14682c;
        return strArr2 == null || AbstractC5070d.m2656u(strArr2, socket.getEnabledCipherSuites(), C8735a.f14604b.m14405c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8736b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z9 = this.f14680a;
        C8736b c8736b = (C8736b) obj;
        if (z9 != c8736b.f14680a) {
            return false;
        }
        return !z9 || (Arrays.equals(this.f14682c, c8736b.f14682c) && Arrays.equals(this.f14683d, c8736b.f14683d) && this.f14681b == c8736b.f14681b);
    }

    /* renamed from: f */
    public final boolean m14413f() {
        return this.f14680a;
    }

    /* renamed from: g */
    public final C8736b m14414g(SSLSocket sSLSocket, boolean z9) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f14682c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC5070d.m2614E(enabledCipherSuites, this.f14682c, C8735a.f14604b.m14405c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f14683d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC5070d.m2614E(enabledProtocols, this.f14683d, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iM2659x = AbstractC5070d.m2659x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C8735a.f14604b.m14405c());
        if (z9 && iM2659x != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iM2659x];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = AbstractC5070d.m2650o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarM14418b = aVar.m14418b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarM14418b.m14421e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m14417a();
    }

    /* renamed from: h */
    public final boolean m14415h() {
        return this.f14681b;
    }

    public int hashCode() {
        if (!this.f14680a) {
            return 17;
        }
        String[] strArr = this.f14682c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f14683d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f14681b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m14416i() {
        String[] strArr = this.f14683d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.m14398a(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public String toString() {
        if (!this.f14680a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m14411d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m14416i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f14681b + ')';
    }

    /* renamed from: okhttp3.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f14684a;

        /* renamed from: b */
        public String[] f14685b;

        /* renamed from: c */
        public String[] f14686c;

        /* renamed from: d */
        public boolean f14687d;

        public a(boolean z9) {
            this.f14684a = z9;
        }

        /* renamed from: a */
        public final C8736b m14417a() {
            return new C8736b(this.f14684a, this.f14687d, this.f14685b, this.f14686c);
        }

        /* renamed from: b */
        public final a m14418b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f14684a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f14685b = (String[]) cipherSuites.clone();
            return this;
        }

        /* renamed from: c */
        public final a m14419c(C8735a... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f14684a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C8735a c8735a : cipherSuites) {
                arrayList.add(c8735a.m14401c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m14418b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final a m14420d(boolean z9) {
            if (!this.f14684a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f14687d = z9;
            return this;
        }

        /* renamed from: e */
        public final a m14421e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f14684a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f14686c = (String[]) tlsVersions.clone();
            return this;
        }

        /* renamed from: f */
        public final a m14422f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f14684a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m14421e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C8736b connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f14684a = connectionSpec.m14413f();
            this.f14685b = connectionSpec.f14682c;
            this.f14686c = connectionSpec.f14683d;
            this.f14687d = connectionSpec.m14415h();
        }
    }
}
