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
import p137k.AbstractC7846r;
import p171m9.AbstractC8573c;

/* loaded from: classes5.dex */
public final class CertificatePinner {

    /* renamed from: c */
    public static final C8732b f14518c = new C8732b(null);

    /* renamed from: d */
    public static final CertificatePinner f14519d = new C8731a().m14383a();

    /* renamed from: a */
    public final Set f14520a;

    /* renamed from: b */
    public final AbstractC8573c f14521b;

    /* renamed from: okhttp3.CertificatePinner$a */
    public static final class C8731a {

        /* renamed from: a */
        public final List f14522a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final CertificatePinner m14383a() {
            return new CertificatePinner(CollectionsKt.toSet(this.f14522a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: okhttp3.CertificatePinner$b */
    public static final class C8732b {
        public /* synthetic */ C8732b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m14384a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + m14385b((X509Certificate) certificate).base64();
        }

        /* renamed from: b */
        public final ByteString m14385b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        public C8732b() {
        }
    }

    public CertificatePinner(Set pins, AbstractC8573c abstractC8573c) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f14520a = pins;
        this.f14521b = abstractC8573c;
    }

    /* renamed from: a */
    public final void m14378a(final String hostname, final List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        m14379b(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> listMo13531a;
                AbstractC8573c abstractC8573cM14381d = this.f14523a.m14381d();
                if (abstractC8573cM14381d == null || (listMo13531a = abstractC8573cM14381d.mo13531a(peerCertificates, hostname)) == null) {
                    listMo13531a = peerCertificates;
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo13531a, 10));
                for (Certificate certificate : listMo13531a) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    /* renamed from: b */
    public final void m14379b(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listM14380c = m14380c(hostname);
        if (listM14380c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM14380c.iterator();
            if (it.hasNext()) {
                AbstractC7846r.m13306a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f14518c.m14384a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listM14380c.iterator();
        while (it2.hasNext()) {
            AbstractC7846r.m13306a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    /* renamed from: c */
    public final List m14380c(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f14520a;
        List listEmptyList = CollectionsKt.emptyList();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listEmptyList;
        }
        AbstractC7846r.m13306a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final AbstractC8573c m14381d() {
        return this.f14521b;
    }

    /* renamed from: e */
    public final CertificatePinner m14382e(AbstractC8573c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f14521b, certificateChainCleaner) ? this : new CertificatePinner(this.f14520a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return Intrinsics.areEqual(certificatePinner.f14520a, this.f14520a) && Intrinsics.areEqual(certificatePinner.f14521b, this.f14521b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f14520a.hashCode()) * 41;
        AbstractC8573c abstractC8573c = this.f14521b;
        return iHashCode + (abstractC8573c != null ? abstractC8573c.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, AbstractC8573c abstractC8573c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : abstractC8573c);
    }
}
