package p117r2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.TlsVersion;
import p121s2.AbstractC4550b;

/* renamed from: r2.k */
/* loaded from: classes2.dex */
public final class C4508k {

    /* renamed from: e */
    public static final C4505h[] f5482e;

    /* renamed from: f */
    public static final C4505h[] f5483f;

    /* renamed from: g */
    public static final C4508k f5484g;

    /* renamed from: h */
    public static final C4508k f5485h;

    /* renamed from: i */
    public static final C4508k f5486i;

    /* renamed from: j */
    public static final C4508k f5487j;

    /* renamed from: k */
    public static final b f5488k = new b(null);

    /* renamed from: a */
    public final boolean f5489a;

    /* renamed from: b */
    public final boolean f5490b;

    /* renamed from: c */
    public final String[] f5491c;

    /* renamed from: d */
    public final String[] f5492d;

    /* renamed from: r2.k$a */
    public static final class a {

        /* renamed from: a */
        public boolean f5493a;

        /* renamed from: b */
        public String[] f5494b;

        /* renamed from: c */
        public String[] f5495c;

        /* renamed from: d */
        public boolean f5496d;

        public a(boolean z3) {
            this.f5493a = z3;
        }

        /* renamed from: a */
        public final C4508k m5893a() {
            return new C4508k(this.f5493a, this.f5496d, this.f5494b, this.f5495c);
        }

        /* renamed from: b */
        public final a m5894b(String... cipherSuites) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f5493a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = cipherSuites.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f5494b = (String[]) objClone;
            return this;
        }

        /* renamed from: c */
        public final a m5895c(C4505h... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f5493a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C4505h c4505h : cipherSuites) {
                arrayList.add(c4505h.m5876c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return m5894b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final a m5896d(boolean z3) {
            if (!this.f5493a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f5496d = z3;
            return this;
        }

        /* renamed from: e */
        public final a m5897e(String... tlsVersions) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f5493a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = tlsVersions.clone();
            if (objClone == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            this.f5495c = (String[]) objClone;
            return this;
        }

        /* renamed from: f */
        public final a m5898f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f5493a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.getJavaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            String[] strArr = (String[]) array;
            return m5897e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C4508k connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f5493a = connectionSpec.m5889f();
            this.f5494b = connectionSpec.f5491c;
            this.f5495c = connectionSpec.f5492d;
            this.f5496d = connectionSpec.m5891h();
        }
    }

    /* renamed from: r2.k$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C4505h c4505h = C4505h.f5450n1;
        C4505h c4505h2 = C4505h.f5453o1;
        C4505h c4505h3 = C4505h.f5456p1;
        C4505h c4505h4 = C4505h.f5409Z0;
        C4505h c4505h5 = C4505h.f5420d1;
        C4505h c4505h6 = C4505h.f5411a1;
        C4505h c4505h7 = C4505h.f5423e1;
        C4505h c4505h8 = C4505h.f5441k1;
        C4505h c4505h9 = C4505h.f5438j1;
        C4505h[] c4505hArr = {c4505h, c4505h2, c4505h3, c4505h4, c4505h5, c4505h6, c4505h7, c4505h8, c4505h9};
        f5482e = c4505hArr;
        C4505h[] c4505hArr2 = {c4505h, c4505h2, c4505h3, c4505h4, c4505h5, c4505h6, c4505h7, c4505h8, c4505h9, C4505h.f5379K0, C4505h.f5381L0, C4505h.f5434i0, C4505h.f5437j0, C4505h.f5370G, C4505h.f5378K, C4505h.f5439k};
        f5483f = c4505hArr2;
        a aVarM5895c = new a(true).m5895c((C4505h[]) Arrays.copyOf(c4505hArr, c4505hArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f5484g = aVarM5895c.m5898f(tlsVersion, tlsVersion2).m5896d(true).m5893a();
        f5485h = new a(true).m5895c((C4505h[]) Arrays.copyOf(c4505hArr2, c4505hArr2.length)).m5898f(tlsVersion, tlsVersion2).m5896d(true).m5893a();
        f5486i = new a(true).m5895c((C4505h[]) Arrays.copyOf(c4505hArr2, c4505hArr2.length)).m5898f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).m5896d(true).m5893a();
        f5487j = new a(false).m5893a();
    }

    public C4508k(boolean z3, boolean z4, String[] strArr, String[] strArr2) {
        this.f5489a = z3;
        this.f5490b = z4;
        this.f5491c = strArr;
        this.f5492d = strArr2;
    }

    /* renamed from: c */
    public final void m5886c(SSLSocket sslSocket, boolean z3) throws CloneNotSupportedException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        C4508k c4508kM5890g = m5890g(sslSocket, z3);
        if (c4508kM5890g.m5892i() != null) {
            sslSocket.setEnabledProtocols(c4508kM5890g.f5492d);
        }
        if (c4508kM5890g.m5887d() != null) {
            sslSocket.setEnabledCipherSuites(c4508kM5890g.f5491c);
        }
    }

    /* renamed from: d */
    public final List m5887d() {
        String[] strArr = this.f5491c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C4505h.f5465s1.m5879b(str));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    /* renamed from: e */
    public final boolean m5888e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f5489a) {
            return false;
        }
        String[] strArr = this.f5492d;
        if (strArr != null && !AbstractC4550b.m6236r(strArr, socket.getEnabledProtocols(), ComparisonsKt__ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f5491c;
        return strArr2 == null || AbstractC4550b.m6236r(strArr2, socket.getEnabledCipherSuites(), C4505h.f5465s1.m5880c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4508k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z3 = this.f5489a;
        C4508k c4508k = (C4508k) obj;
        if (z3 != c4508k.f5489a) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f5491c, c4508k.f5491c) && Arrays.equals(this.f5492d, c4508k.f5492d) && this.f5490b == c4508k.f5490b);
    }

    /* renamed from: f */
    public final boolean m5889f() {
        return this.f5489a;
    }

    /* renamed from: g */
    public final C4508k m5890g(SSLSocket sSLSocket, boolean z3) throws CloneNotSupportedException {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f5491c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = AbstractC4550b.m6199B(enabledCipherSuites, this.f5491c, C4505h.f5465s1.m5880c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f5492d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = AbstractC4550b.m6199B(enabledProtocols, this.f5492d, ComparisonsKt__ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iM6239u = AbstractC4550b.m6239u(supportedCipherSuites, "TLS_FALLBACK_SCSV", C4505h.f5465s1.m5880c());
        if (z3 && iM6239u != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iM6239u];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = AbstractC4550b.m6230l(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarM5894b = aVar.m5894b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarM5894b.m5897e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).m5893a();
    }

    /* renamed from: h */
    public final boolean m5891h() {
        return this.f5490b;
    }

    public int hashCode() {
        if (!this.f5489a) {
            return 17;
        }
        String[] strArr = this.f5491c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f5492d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f5490b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m5892i() {
        String[] strArr = this.f5492d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.m5584a(str));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    public String toString() {
        if (!this.f5489a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m5887d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m5892i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f5490b + ')';
    }
}
