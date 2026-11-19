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
import p028b9.AbstractC5070d;

/* loaded from: classes5.dex */
public final class Handshake {

    /* renamed from: e */
    public static final Companion f14526e = new Companion(null);

    /* renamed from: a */
    public final TlsVersion f14527a;

    /* renamed from: b */
    public final C8735a f14528b;

    /* renamed from: c */
    public final List f14529c;

    /* renamed from: d */
    public final Lazy f14530d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Handshake m14391a(SSLSession sSLSession) throws IOException {
            final List listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C8735a c8735aM14404b = C8735a.f14604b.m14404b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM14398a = TlsVersion.INSTANCE.m14398a(protocol);
            try {
                listEmptyList = m14392b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new Handshake(tlsVersionM14398a, c8735aM14404b, m14392b(sSLSession.getLocalCertificates()), new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
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
        public final List m14392b(Certificate[] certificateArr) {
            return certificateArr != null ? AbstractC5070d.m2658w(Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt.emptyList();
        }

        public Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, C8735a cipherSuite, List localCertificates, final Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f14527a = tlsVersion;
        this.f14528b = cipherSuite;
        this.f14529c = localCertificates;
        this.f14530d = LazyKt.lazy(new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
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
    public final C8735a m14386a() {
        return this.f14528b;
    }

    /* renamed from: b */
    public final String m14387b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    /* renamed from: c */
    public final List m14388c() {
        return this.f14529c;
    }

    /* renamed from: d */
    public final List m14389d() {
        return (List) this.f14530d.getValue();
    }

    /* renamed from: e */
    public final TlsVersion m14390e() {
        return this.f14527a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f14527a == this.f14527a && Intrinsics.areEqual(handshake.f14528b, this.f14528b) && Intrinsics.areEqual(handshake.m14389d(), m14389d()) && Intrinsics.areEqual(handshake.f14529c, this.f14529c);
    }

    public int hashCode() {
        return ((((((527 + this.f14527a.hashCode()) * 31) + this.f14528b.hashCode()) * 31) + m14389d().hashCode()) * 31) + this.f14529c.hashCode();
    }

    public String toString() {
        List listM14389d = m14389d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM14389d, 10));
        Iterator it = listM14389d.iterator();
        while (it.hasNext()) {
            arrayList.add(m14387b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f14527a);
        sb.append(" cipherSuite=");
        sb.append(this.f14528b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f14529c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m14387b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
