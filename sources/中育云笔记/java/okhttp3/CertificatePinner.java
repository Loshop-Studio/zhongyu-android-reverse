package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.ByteString;
import p181hd.InterfaceC9529a;
import p212k.AbstractC9764r;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import ve.AbstractC11618c;

/* loaded from: classes6.dex */
public final class CertificatePinner {

    /* renamed from: c */
    public static final C10492b f24942c = new C10492b(null);

    /* renamed from: d */
    public static final CertificatePinner f24943d = new C10491a().m21943a();

    /* renamed from: a */
    public final Set f24944a;

    /* renamed from: b */
    public final AbstractC11618c f24945b;

    /* renamed from: okhttp3.CertificatePinner$a */
    public static final class C10491a {

        /* renamed from: a */
        public final List f24946a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final CertificatePinner m21943a() {
            return new CertificatePinner(AbstractC10947g0.m23929c1(this.f24946a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: okhttp3.CertificatePinner$b */
    public static final class C10492b {
        public /* synthetic */ C10492b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final String m21944a(Certificate certificate) {
            AbstractC9979u.m20294g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + m21945b((X509Certificate) certificate).base64();
        }

        /* renamed from: b */
        public final ByteString m21945b(X509Certificate x509Certificate) {
            AbstractC9979u.m20294g(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC9979u.m20293f(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        public C10492b() {
        }
    }

    public CertificatePinner(Set pins, AbstractC11618c abstractC11618c) {
        AbstractC9979u.m20294g(pins, "pins");
        this.f24944a = pins;
        this.f24945b = abstractC11618c;
    }

    /* renamed from: a */
    public final void m21938a(final String hostname, final List peerCertificates) {
        AbstractC9979u.m20294g(hostname, "hostname");
        AbstractC9979u.m20294g(peerCertificates, "peerCertificates");
        m21939b(hostname, new InterfaceC9529a() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final List invoke() {
                List listMo25221a;
                AbstractC11618c abstractC11618cM21941d = this.f24947c.m21941d();
                if (abstractC11618cM21941d == null || (listMo25221a = abstractC11618cM21941d.mo25221a(peerCertificates, hostname)) == null) {
                    listMo25221a = peerCertificates;
                }
                List<Certificate> list = listMo25221a;
                ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
                for (Certificate certificate : list) {
                    AbstractC9979u.m20292e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    /* renamed from: b */
    public final void m21939b(String hostname, InterfaceC9529a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        AbstractC9979u.m20294g(hostname, "hostname");
        AbstractC9979u.m20294g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listM21940c = m21940c(hostname);
        if (listM21940c.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM21940c.iterator();
            if (it.hasNext()) {
                AbstractC9764r.m19682a(it.next());
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(f24942c.m21944a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        Iterator it2 = listM21940c.iterator();
        while (it2.hasNext()) {
            AbstractC9764r.m19682a(it2.next());
            sb2.append("\n    ");
            sb2.append((Object) null);
        }
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    /* renamed from: c */
    public final List m21940c(String hostname) {
        AbstractC9979u.m20294g(hostname, "hostname");
        Set set = this.f24944a;
        List listM24136n = AbstractC10978w.m24136n();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listM24136n;
        }
        AbstractC9764r.m19682a(it.next());
        throw null;
    }

    /* renamed from: d */
    public final AbstractC11618c m21941d() {
        return this.f24945b;
    }

    /* renamed from: e */
    public final CertificatePinner m21942e(AbstractC11618c certificateChainCleaner) {
        AbstractC9979u.m20294g(certificateChainCleaner, "certificateChainCleaner");
        return AbstractC9979u.m20289b(this.f24945b, certificateChainCleaner) ? this : new CertificatePinner(this.f24944a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return AbstractC9979u.m20289b(certificatePinner.f24944a, this.f24944a) && AbstractC9979u.m20289b(certificatePinner.f24945b, this.f24945b);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f24944a.hashCode()) * 41;
        AbstractC11618c abstractC11618c = this.f24945b;
        return iHashCode + (abstractC11618c != null ? abstractC11618c.hashCode() : 0);
    }

    public /* synthetic */ CertificatePinner(Set set, AbstractC11618c abstractC11618c, int i10, AbstractC9972n abstractC9972n) {
        this(set, (i10 & 2) != 0 ? null : abstractC11618c);
    }
}
