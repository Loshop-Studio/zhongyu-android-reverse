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
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p117r2.C4505h;
import p121s2.AbstractC4550b;

/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: e */
    public static final Companion f5034e = new Companion(null);

    /* renamed from: a */
    public final Lazy f5035a;

    /* renamed from: b */
    public final TlsVersion f5036b;

    /* renamed from: c */
    public final C4505h f5037c;

    /* renamed from: d */
    public final List f5038d;

    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Handshake m5577a(SSLSession handshake) throws IOException {
            final List listEmptyList;
            Intrinsics.checkNotNullParameter(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C4505h c4505hM5879b = C4505h.f5465s1.m5879b(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM5584a = TlsVersion.INSTANCE.m5584a(protocol);
            try {
                listEmptyList = m5578b(handshake.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            return new Handshake(tlsVersionM5584a, c4505hM5879b, m5578b(handshake.getLocalCertificates()), new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final List invoke() {
                    return listEmptyList;
                }
            });
        }

        /* renamed from: b */
        public final List m5578b(Certificate[] certificateArr) {
            return certificateArr != null ? AbstractC4550b.m6238t((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : CollectionsKt__CollectionsKt.emptyList();
        }
    }

    public Handshake(TlsVersion tlsVersion, C4505h cipherSuite, List localCertificates, final Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f5036b = tlsVersion;
        this.f5037c = cipherSuite;
        this.f5038d = localCertificates;
        this.f5035a = LazyKt__LazyJVMKt.lazy(new Function0<List<? extends Certificate>>() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                try {
                    return (List) peerCertificatesFn.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
            }
        });
    }

    /* renamed from: a */
    public final C4505h m5572a() {
        return this.f5037c;
    }

    /* renamed from: b */
    public final String m5573b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return type;
    }

    /* renamed from: c */
    public final List m5574c() {
        return this.f5038d;
    }

    /* renamed from: d */
    public final List m5575d() {
        return (List) this.f5035a.getValue();
    }

    /* renamed from: e */
    public final TlsVersion m5576e() {
        return this.f5036b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f5036b == this.f5036b && Intrinsics.areEqual(handshake.f5037c, this.f5037c) && Intrinsics.areEqual(handshake.m5575d(), m5575d()) && Intrinsics.areEqual(handshake.f5038d, this.f5038d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f5036b.hashCode()) * 31) + this.f5037c.hashCode()) * 31) + m5575d().hashCode()) * 31) + this.f5038d.hashCode();
    }

    public String toString() {
        List listM5575d = m5575d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listM5575d, 10));
        Iterator it = listM5575d.iterator();
        while (it.hasNext()) {
            arrayList.add(m5573b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.f5036b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.f5037c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        List list = this.f5038d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m5573b((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
