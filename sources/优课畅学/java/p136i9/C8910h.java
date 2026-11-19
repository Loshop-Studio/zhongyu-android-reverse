package p136i9;

import com.blankj.utilcode.util.AbstractC5379p;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.ByteString;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;
import p302x9.AbstractC10588c;

/* renamed from: i9.h */
/* loaded from: classes5.dex */
public final class C8910h {

    /* renamed from: c */
    public static final b f16736c = new b(null);

    /* renamed from: d */
    public static final C8910h f16737d = new a().m15185a();

    /* renamed from: a */
    public final Set f16738a;

    /* renamed from: b */
    public final AbstractC10588c f16739b;

    /* renamed from: i9.h$a */
    public static final class a {

        /* renamed from: a */
        public final List f16740a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C8910h m15185a() {
            return new C8910h(AbstractC8778f0.m14549Z0(this.f16740a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: i9.h$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final String m15186a(Certificate certificate) {
            AbstractC9133u.m16133g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + m15187b((X509Certificate) certificate).base64();
        }

        /* renamed from: b */
        public final ByteString m15187b(X509Certificate x509Certificate) {
            AbstractC9133u.m16133g(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            AbstractC9133u.m16132f(encoded, "getEncoded(...)");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        public b() {
        }
    }

    public C8910h(Set pins, AbstractC10588c abstractC10588c) {
        AbstractC9133u.m16133g(pins, "pins");
        this.f16738a = pins;
        this.f16739b = abstractC10588c;
    }

    /* renamed from: c */
    public static final List m15179c(C8910h c8910h, List list, String str) {
        List listMo19122a;
        AbstractC10588c abstractC10588c = c8910h.f16739b;
        if (abstractC10588c != null && (listMo19122a = abstractC10588c.mo19122a(list, str)) != null) {
            list = listMo19122a;
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        for (Certificate certificate : list) {
            AbstractC9133u.m16131e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m15180b(final String hostname, final List peerCertificates) {
        AbstractC9133u.m16133g(hostname, "hostname");
        AbstractC9133u.m16133g(peerCertificates, "peerCertificates");
        m15181d(hostname, new InterfaceC10559a() { // from class: i9.g
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C8910h.m15179c(this.f16730a, peerCertificates, hostname);
            }
        });
    }

    /* renamed from: d */
    public final void m15181d(String hostname, InterfaceC10559a cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        AbstractC9133u.m16133g(hostname, "hostname");
        AbstractC9133u.m16133g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listM15182e = m15182e(hostname);
        if (listM15182e.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM15182e.iterator();
            if (it.hasNext()) {
                AbstractC5379p.m2596a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f16736c.m15186a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listM15182e.iterator();
        while (it2.hasNext()) {
            AbstractC5379p.m2596a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* renamed from: e */
    public final List m15182e(String hostname) {
        AbstractC9133u.m16133g(hostname, "hostname");
        Set set = this.f16738a;
        List listM14771n = AbstractC8809v.m14771n();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listM14771n;
        }
        AbstractC5379p.m2596a(it.next());
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8910h)) {
            return false;
        }
        C8910h c8910h = (C8910h) obj;
        return AbstractC9133u.m16128b(c8910h.f16738a, this.f16738a) && AbstractC9133u.m16128b(c8910h.f16739b, this.f16739b);
    }

    /* renamed from: f */
    public final AbstractC10588c m15183f() {
        return this.f16739b;
    }

    /* renamed from: g */
    public final C8910h m15184g(AbstractC10588c certificateChainCleaner) {
        AbstractC9133u.m16133g(certificateChainCleaner, "certificateChainCleaner");
        return AbstractC9133u.m16128b(this.f16739b, certificateChainCleaner) ? this : new C8910h(this.f16738a, certificateChainCleaner);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f16738a.hashCode()) * 41;
        AbstractC10588c abstractC10588c = this.f16739b;
        return iHashCode + (abstractC10588c != null ? abstractC10588c.hashCode() : 0);
    }

    public /* synthetic */ C8910h(Set set, AbstractC10588c abstractC10588c, int i10, AbstractC9126n abstractC9126n) {
        this(set, (i10 & 2) != 0 ? null : abstractC10588c);
    }
}
