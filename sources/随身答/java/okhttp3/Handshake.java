package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p182m8.AbstractC9045d;

/* loaded from: classes5.dex */
public final class Handshake {

    /* renamed from: e */
    public static final Companion f15653e = new Companion(null);

    /* renamed from: a */
    public final TlsVersion f15654a;

    /* renamed from: b */
    public final C9238a f15655b;

    /* renamed from: c */
    public final List f15656c;

    /* renamed from: d */
    public final Lazy f15657d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Handshake m14825a(SSLSession sSLSession) throws IOException {
            final List listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C9238a c9238aM14838b = C9238a.f15731b.m14838b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM14832a = TlsVersion.INSTANCE.m14832a(protocol);
            try {
                listEmptyList = m14826b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new Handshake(tlsVersionM14832a, c9238aM14838b, m14826b(sSLSession.getLocalCertificates()), new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final List<? extends Certificate> invoke() {
                    return listEmptyList;
                }
            });
        }

        /* renamed from: b */
        public final List m14826b(Certificate[] certificateArr) {
            return certificateArr != null ? AbstractC9045d.m14507w(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        public Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, C9238a cipherSuite, List localCertificates, final Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f15654a = tlsVersion;
        this.f15655b = cipherSuite;
        this.f15656c = localCertificates;
        this.f15657d = LazyKt.lazy(new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                try {
                    return (List) peerCertificatesFn.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt.emptyList();
                }
            }
        });
    }

    /* renamed from: a */
    public final C9238a m14820a() {
        return this.f15655b;
    }

    /* renamed from: b */
    public final String m14821b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    /* renamed from: c */
    public final List m14822c() {
        return this.f15656c;
    }

    /* renamed from: d */
    public final List m14823d() {
        return (List) this.f15657d.getValue();
    }

    /* renamed from: e */
    public final TlsVersion m14824e() {
        return this.f15654a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f15654a == this.f15654a && Intrinsics.areEqual(handshake.f15655b, this.f15655b) && Intrinsics.areEqual(handshake.m14823d(), m14823d()) && Intrinsics.areEqual(handshake.f15656c, this.f15656c);
    }

    public int hashCode() {
        return ((((((527 + this.f15654a.hashCode()) * 31) + this.f15655b.hashCode()) * 31) + m14823d().hashCode()) * 31) + this.f15656c.hashCode();
    }

    public String toString() {
        List listM14823d = m14823d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM14823d, 10));
        Iterator it = listM14823d.iterator();
        while (it.hasNext()) {
            arrayList.add(m14821b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f15654a);
        sb.append(" cipherSuite=");
        sb.append(this.f15655b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f15656c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m14821b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
