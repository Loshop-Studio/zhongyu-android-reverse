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
import p065g5.AbstractC6417a;
import p065g5.AbstractC6424h;

/* renamed from: okhttp3.b */
/* loaded from: classes4.dex */
public final class C7526b {

    /* renamed from: e */
    public static final b f9858e = new b(null);

    /* renamed from: f */
    public static final List f9859f;

    /* renamed from: g */
    public static final List f9860g;

    /* renamed from: h */
    public static final C7526b f9861h;

    /* renamed from: i */
    public static final C7526b f9862i;

    /* renamed from: j */
    public static final C7526b f9863j;

    /* renamed from: k */
    public static final C7526b f9864k;

    /* renamed from: a */
    public final boolean f9865a;

    /* renamed from: b */
    public final boolean f9866b;

    /* renamed from: c */
    public final String[] f9867c;

    /* renamed from: d */
    public final String[] f9868d;

    /* renamed from: okhttp3.b$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    static {
        C7525a c7525a = C7525a.f9830o1;
        C7525a c7525a2 = C7525a.f9833p1;
        C7525a c7525a3 = C7525a.f9836q1;
        C7525a c7525a4 = C7525a.f9788a1;
        C7525a c7525a5 = C7525a.f9800e1;
        C7525a c7525a6 = C7525a.f9791b1;
        C7525a c7525a7 = C7525a.f9803f1;
        C7525a c7525a8 = C7525a.f9821l1;
        C7525a c7525a9 = C7525a.f9818k1;
        List listListOf = CollectionsKt.listOf((Object[]) new C7525a[]{c7525a, c7525a2, c7525a3, c7525a4, c7525a5, c7525a6, c7525a7, c7525a8, c7525a9});
        f9859f = listListOf;
        List listListOf2 = CollectionsKt.listOf((Object[]) new C7525a[]{c7525a, c7525a2, c7525a3, c7525a4, c7525a5, c7525a6, c7525a7, c7525a8, c7525a9, C7525a.f9758L0, C7525a.f9760M0, C7525a.f9814j0, C7525a.f9817k0, C7525a.f9749H, C7525a.f9757L, C7525a.f9819l});
        f9860g = listListOf2;
        a aVar = new a(true);
        C7525a[] c7525aArr = (C7525a[]) listListOf.toArray(new C7525a[0]);
        a aVarM8712c = aVar.m8712c((C7525a[]) Arrays.copyOf(c7525aArr, c7525aArr.length));
        TlsVersion tlsVersion = TlsVersion.f9727c;
        TlsVersion tlsVersion2 = TlsVersion.f9728d;
        f9861h = aVarM8712c.m8715f(tlsVersion, tlsVersion2).m8713d(true).m8710a();
        a aVar2 = new a(true);
        C7525a[] c7525aArr2 = (C7525a[]) listListOf2.toArray(new C7525a[0]);
        f9862i = aVar2.m8712c((C7525a[]) Arrays.copyOf(c7525aArr2, c7525aArr2.length)).m8715f(tlsVersion, tlsVersion2).m8713d(true).m8710a();
        a aVar3 = new a(true);
        C7525a[] c7525aArr3 = (C7525a[]) listListOf2.toArray(new C7525a[0]);
        f9863j = aVar3.m8712c((C7525a[]) Arrays.copyOf(c7525aArr3, c7525aArr3.length)).m8715f(tlsVersion, tlsVersion2, TlsVersion.f9729e, TlsVersion.f9730f).m8713d(true).m8710a();
        f9864k = new a(false).m8710a();
    }

    public C7526b(boolean z6, boolean z7, String[] strArr, String[] strArr2) {
        this.f9865a = z6;
        this.f9866b = z7;
        this.f9867c = strArr;
        this.f9868d = strArr2;
    }

    /* renamed from: b */
    public final void m8702b(SSLSocket sslSocket, boolean z6) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        C7526b c7526bM8707g = m8707g(sslSocket, z6);
        if (c7526bM8707g.m8709i() != null) {
            sslSocket.setEnabledProtocols(c7526bM8707g.f9868d);
        }
        if (c7526bM8707g.m8703c() != null) {
            sslSocket.setEnabledCipherSuites(c7526bM8707g.f9867c);
        }
    }

    /* renamed from: c */
    public final List m8703c() {
        String[] strArr = this.f9867c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C7525a.f9789b.m8697b(str));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final String[] m8704d() {
        return this.f9867c;
    }

    /* renamed from: e */
    public final boolean m8705e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f9865a) {
            return false;
        }
        String[] strArr = this.f9868d;
        if (strArr != null && !AbstractC6424h.m6998l(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f9867c;
        return strArr2 == null || AbstractC6424h.m6998l(strArr2, socket.getEnabledCipherSuites(), C7525a.f9789b.m8698c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7526b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z6 = this.f9865a;
        C7526b c7526b = (C7526b) obj;
        if (z6 != c7526b.f9865a) {
            return false;
        }
        return !z6 || (Arrays.equals(this.f9867c, c7526b.f9867c) && Arrays.equals(this.f9868d, c7526b.f9868d) && this.f9866b == c7526b.f9866b);
    }

    /* renamed from: f */
    public final boolean m8706f() {
        return this.f9865a;
    }

    /* renamed from: g */
    public final C7526b m8707g(SSLSocket sSLSocket, boolean z6) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        Intrinsics.checkNotNull(enabledCipherSuites);
        String[] strArrM6940c = AbstractC6417a.m6940c(this, enabledCipherSuites);
        if (this.f9868d != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = AbstractC6424h.m7007u(enabledProtocols2, this.f9868d, ComparisonsKt.naturalOrder());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNull(supportedCipherSuites);
        int iM6999m = AbstractC6424h.m6999m(supportedCipherSuites, "TLS_FALLBACK_SCSV", C7525a.f9789b.m8698c());
        if (z6 && iM6999m != -1) {
            String str = supportedCipherSuites[iM6999m];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            strArrM6940c = AbstractC6424h.m6993g(strArrM6940c, str);
        }
        return new a(this).m8711b((String[]) Arrays.copyOf(strArrM6940c, strArrM6940c.length)).m8714e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).m8710a();
    }

    /* renamed from: h */
    public final boolean m8708h() {
        return this.f9866b;
    }

    public int hashCode() {
        if (!this.f9865a) {
            return 17;
        }
        String[] strArr = this.f9867c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f9868d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f9866b ? 1 : 0);
    }

    /* renamed from: i */
    public final List m8709i() {
        String[] strArr = this.f9868d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.m8691a(str));
        }
        return arrayList;
    }

    public String toString() {
        if (!this.f9865a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(m8703c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(m8709i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f9866b + ')';
    }

    /* renamed from: okhttp3.b$a */
    public static final class a {

        /* renamed from: a */
        public boolean f9869a;

        /* renamed from: b */
        public String[] f9870b;

        /* renamed from: c */
        public String[] f9871c;

        /* renamed from: d */
        public boolean f9872d;

        public a(boolean z6) {
            this.f9869a = z6;
        }

        /* renamed from: a */
        public final C7526b m8710a() {
            return new C7526b(this.f9869a, this.f9872d, this.f9870b, this.f9871c);
        }

        /* renamed from: b */
        public final a m8711b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f9869a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f9870b = (String[]) objArrCopyOf;
            return this;
        }

        /* renamed from: c */
        public final a m8712c(C7525a... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f9869a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C7525a c7525a : cipherSuites) {
                arrayList.add(c7525a.m8694c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m8711b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: d */
        public final a m8713d(boolean z6) {
            if (!this.f9869a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f9872d = z6;
            return this;
        }

        /* renamed from: e */
        public final a m8714e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f9869a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f9871c = (String[]) objArrCopyOf;
            return this;
        }

        /* renamed from: f */
        public final a m8715f(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f9869a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return m8714e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(C7526b connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f9869a = connectionSpec.m8706f();
            this.f9870b = connectionSpec.m8704d();
            this.f9871c = connectionSpec.f9868d;
            this.f9872d = connectionSpec.m8708h();
        }
    }
}
