package okhttp3;

import com.bumptech.glide.AbstractC2857b;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p050d3.AbstractC3709c;

/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: a */
    public final Set f5028a;

    /* renamed from: b */
    public final AbstractC3709c f5029b;

    /* renamed from: d */
    public static final C4427b f5027d = new C4427b(null);

    /* renamed from: c */
    public static final CertificatePinner f5026c = new C4426a().m5568a();

    /* renamed from: okhttp3.CertificatePinner$a */
    public static final class C4426a {

        /* renamed from: a */
        public final List f5030a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final CertificatePinner m5568a() {
            return new CertificatePinner(CollectionsKt___CollectionsKt.toSet(this.f5030a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: okhttp3.CertificatePinner$b */
    public static final class C4427b {
        public C4427b() {
        }

        public /* synthetic */ C4427b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m5569a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
            }
            return "sha256/" + m5570b((X509Certificate) certificate).base64();
        }

        /* renamed from: b */
        public final ByteString m5570b(X509Certificate sha256Hash) {
            Intrinsics.checkNotNullParameter(sha256Hash, "$this$sha256Hash");
            ByteString.Companion companion = ByteString.INSTANCE;
            PublicKey publicKey = sha256Hash.getPublicKey();
            Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }
    }

    public CertificatePinner(Set pins, AbstractC3709c abstractC3709c) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f5028a = pins;
        this.f5029b = abstractC3709c;
    }

    /* renamed from: a */
    public final void m5563a(final String hostname, final List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        m5564b(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke() {
                List<Certificate> listMo1513a;
                AbstractC3709c abstractC3709cM5566d = this.f5031a.m5566d();
                if (abstractC3709cM5566d == null || (listMo1513a = abstractC3709cM5566d.mo1513a(peerCertificates, hostname)) == null) {
                    listMo1513a = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listMo1513a, 10));
                for (Certificate certificate : listMo1513a) {
                    if (certificate == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    /* renamed from: b */
    public final void m5564b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listM5565c = m5565c(hostname);
        if (listM5565c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM5565c.iterator();
            if (it.hasNext()) {
                AbstractC2857b.m1678a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f5027d.m5569a(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            Intrinsics.checkNotNullExpressionValue(subjectDN, "element.subjectDN");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listM5565c.iterator();
        while (it2.hasNext()) {
            AbstractC2857b.m1678a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    /* renamed from: c */
    public final List m5565c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f5028a;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listEmptyList;
        }
        AbstractC2857b.m1678a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final AbstractC3709c m5566d() {
        return this.f5029b;
    }

    /* renamed from: e */
    public final CertificatePinner m5567e(AbstractC3709c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f5029b, certificateChainCleaner) ? this : new CertificatePinner(this.f5028a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (Intrinsics.areEqual(certificatePinner.f5028a, this.f5028a) && Intrinsics.areEqual(certificatePinner.f5029b, this.f5029b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f5028a.hashCode()) * 41;
        AbstractC3709c abstractC3709c = this.f5029b;
        return iHashCode + (abstractC3709c != null ? abstractC3709c.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, AbstractC3709c abstractC3709c, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i4 & 2) != 0 ? null : abstractC3709c);
    }
}
