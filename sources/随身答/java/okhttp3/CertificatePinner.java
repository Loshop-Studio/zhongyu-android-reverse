package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p217q.AbstractC9343a;
import p296x8.AbstractC9917c;

/* loaded from: classes5.dex */
public final class CertificatePinner {

    /* renamed from: c */
    public static final C9235b f15645c = new C9235b(null);

    /* renamed from: d */
    public static final CertificatePinner f15646d = new C9234a().m14817a();

    /* renamed from: a */
    public final Set f15647a;

    /* renamed from: b */
    public final AbstractC9917c f15648b;

    /* renamed from: okhttp3.CertificatePinner$a */
    public static final class C9234a {

        /* renamed from: a */
        public final List f15649a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final CertificatePinner m14817a() {
            return new CertificatePinner(CollectionsKt.toSet(this.f15649a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: okhttp3.CertificatePinner$b */
    public static final class C9235b {
        public /* synthetic */ C9235b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m14818a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + m14819b((X509Certificate) certificate).base64();
        }

        /* renamed from: b */
        public final ByteString m14819b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        public C9235b() {
        }
    }

    public CertificatePinner(Set pins, AbstractC9917c abstractC9917c) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f15647a = pins;
        this.f15648b = abstractC9917c;
    }

    /* renamed from: a */
    public final void m14812a(final String hostname, final List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        m14813b(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> listMo16564a;
                AbstractC9917c abstractC9917cM14815d = this.f15650a.m14815d();
                if (abstractC9917cM14815d == null || (listMo16564a = abstractC9917cM14815d.mo16564a(peerCertificates, hostname)) == null) {
                    listMo16564a = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo16564a, 10));
                for (Certificate certificate : listMo16564a) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    /* renamed from: b */
    public final void m14813b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listM14814c = m14814c(hostname);
        if (listM14814c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM14814c.iterator();
            if (it.hasNext()) {
                AbstractC9343a.m15285a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f15645c.m14818a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listM14814c.iterator();
        while (it2.hasNext()) {
            AbstractC9343a.m15285a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    /* renamed from: c */
    public final List m14814c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f15647a;
        List listEmptyList = CollectionsKt.emptyList();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listEmptyList;
        }
        AbstractC9343a.m15285a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final AbstractC9917c m14815d() {
        return this.f15648b;
    }

    /* renamed from: e */
    public final CertificatePinner m14816e(AbstractC9917c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f15648b, certificateChainCleaner) ? this : new CertificatePinner(this.f15647a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return Intrinsics.areEqual(certificatePinner.f15647a, this.f15647a) && Intrinsics.areEqual(certificatePinner.f15648b, this.f15648b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f15647a.hashCode()) * 41;
        AbstractC9917c abstractC9917c = this.f15648b;
        return iHashCode + (abstractC9917c != null ? abstractC9917c.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, AbstractC9917c abstractC9917c, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i9 & 2) != 0 ? null : abstractC9917c);
    }
}
