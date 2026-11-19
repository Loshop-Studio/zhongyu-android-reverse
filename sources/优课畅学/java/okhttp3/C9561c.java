package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9561c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p147j9.AbstractC9041k;
import p300x7.InterfaceC10559a;

/* renamed from: okhttp3.c */
/* loaded from: classes5.dex */
public final class C9561c {

    /* renamed from: e */
    public static final a f19095e = new a(null);

    /* renamed from: a */
    public final TlsVersion f19096a;

    /* renamed from: b */
    public final C9559a f19097b;

    /* renamed from: c */
    public final List f19098c;

    /* renamed from: d */
    public final InterfaceC8724d f19099d;

    /* renamed from: okhttp3.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: c */
        public static final List m17905c(List list) {
            return list;
        }

        /* renamed from: b */
        public final C9561c m17906b(SSLSession sSLSession) throws IOException {
            final List listM14771n;
            AbstractC9133u.m16133g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (AbstractC9133u.m16128b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || AbstractC9133u.m16128b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C9559a c9559aM17878b = C9559a.f19011b.m17878b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (AbstractC9133u.m16128b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM17872a = TlsVersion.f18948b.m17872a(protocol);
            try {
                listM14771n = AbstractC9041k.m15793w(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM14771n = AbstractC8809v.m14771n();
            }
            return new C9561c(tlsVersionM17872a, c9559aM17878b, AbstractC9041k.m15793w(sSLSession.getLocalCertificates()), new InterfaceC10559a() { // from class: i9.u
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return C9561c.a.m17905c(listM14771n);
                }
            });
        }

        public a() {
        }
    }

    public C9561c(TlsVersion tlsVersion, C9559a cipherSuite, List localCertificates, final InterfaceC10559a peerCertificatesFn) {
        AbstractC9133u.m16133g(tlsVersion, "tlsVersion");
        AbstractC9133u.m16133g(cipherSuite, "cipherSuite");
        AbstractC9133u.m16133g(localCertificates, "localCertificates");
        AbstractC9133u.m16133g(peerCertificatesFn, "peerCertificatesFn");
        this.f19096a = tlsVersion;
        this.f19097b = cipherSuite;
        this.f19098c = localCertificates;
        this.f19099d = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: i9.t
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return C9561c.m17898f(peerCertificatesFn);
            }
        });
    }

    /* renamed from: f */
    public static final List m17898f(InterfaceC10559a interfaceC10559a) {
        try {
            return (List) interfaceC10559a.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return AbstractC8809v.m14771n();
        }
    }

    /* renamed from: b */
    public final C9559a m17899b() {
        return this.f19097b;
    }

    /* renamed from: c */
    public final String m17900c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC9133u.m16132f(type, "getType(...)");
        return type;
    }

    /* renamed from: d */
    public final List m17901d() {
        return this.f19098c;
    }

    /* renamed from: e */
    public final List m17902e() {
        return (List) this.f19099d.getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9561c)) {
            return false;
        }
        C9561c c9561c = (C9561c) obj;
        return c9561c.f19096a == this.f19096a && AbstractC9133u.m16128b(c9561c.f19097b, this.f19097b) && AbstractC9133u.m16128b(c9561c.m17902e(), m17902e()) && AbstractC9133u.m16128b(c9561c.f19098c, this.f19098c);
    }

    /* renamed from: g */
    public final TlsVersion m17903g() {
        return this.f19096a;
    }

    public int hashCode() {
        return ((((((527 + this.f19096a.hashCode()) * 31) + this.f19097b.hashCode()) * 31) + m17902e().hashCode()) * 31) + this.f19098c.hashCode();
    }

    public String toString() {
        List listM17902e = m17902e();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM17902e, 10));
        Iterator it = listM17902e.iterator();
        while (it.hasNext()) {
            arrayList.add(m17900c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f19096a);
        sb.append(" cipherSuite=");
        sb.append(this.f19097b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f19098c;
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m17900c((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
