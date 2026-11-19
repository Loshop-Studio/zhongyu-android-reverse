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
import ke.AbstractC9920d;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

/* loaded from: classes6.dex */
public final class Handshake {

    /* renamed from: e */
    public static final Companion f24950e = new Companion(null);

    /* renamed from: a */
    public final TlsVersion f24951a;

    /* renamed from: b */
    public final C10495a f24952b;

    /* renamed from: c */
    public final List f24953c;

    /* renamed from: d */
    public final InterfaceC10773d f24954d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final Handshake m21951a(SSLSession sSLSession) throws IOException {
            final List listM24136n;
            AbstractC9979u.m20294g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (AbstractC9979u.m20289b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : AbstractC9979u.m20289b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C10495a c10495aM21964b = C10495a.f25028b.m21964b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (AbstractC9979u.m20289b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM21958a = TlsVersion.f24966d.m21958a(protocol);
            try {
                listM24136n = m21952b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM24136n = AbstractC10978w.m24136n();
            }
            return new Handshake(tlsVersionM21958a, c10495aM21964b, m21952b(sSLSession.getLocalCertificates()), new InterfaceC9529a() { // from class: okhttp3.Handshake$Companion$handshake$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final List invoke() {
                    return listM24136n;
                }
            });
        }

        /* renamed from: b */
        public final List m21952b(Certificate[] certificateArr) {
            return certificateArr != null ? AbstractC9920d.m20041w(Arrays.copyOf(certificateArr, certificateArr.length)) : AbstractC10978w.m24136n();
        }

        public Companion() {
        }
    }

    public Handshake(TlsVersion tlsVersion, C10495a cipherSuite, List localCertificates, final InterfaceC9529a peerCertificatesFn) {
        AbstractC9979u.m20294g(tlsVersion, "tlsVersion");
        AbstractC9979u.m20294g(cipherSuite, "cipherSuite");
        AbstractC9979u.m20294g(localCertificates, "localCertificates");
        AbstractC9979u.m20294g(peerCertificatesFn, "peerCertificatesFn");
        this.f24951a = tlsVersion;
        this.f24952b = cipherSuite;
        this.f24953c = localCertificates;
        this.f24954d = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final List invoke() {
                try {
                    return (List) peerCertificatesFn.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return AbstractC10978w.m24136n();
                }
            }
        });
    }

    /* renamed from: a */
    public final C10495a m21946a() {
        return this.f24952b;
    }

    /* renamed from: b */
    public final String m21947b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        AbstractC9979u.m20293f(type, "type");
        return type;
    }

    /* renamed from: c */
    public final List m21948c() {
        return this.f24953c;
    }

    /* renamed from: d */
    public final List m21949d() {
        return (List) this.f24954d.getValue();
    }

    /* renamed from: e */
    public final TlsVersion m21950e() {
        return this.f24951a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.f24951a == this.f24951a && AbstractC9979u.m20289b(handshake.f24952b, this.f24952b) && AbstractC9979u.m20289b(handshake.m21949d(), m21949d()) && AbstractC9979u.m20289b(handshake.f24953c, this.f24953c);
    }

    public int hashCode() {
        return ((((((527 + this.f24951a.hashCode()) * 31) + this.f24952b.hashCode()) * 31) + m21949d().hashCode()) * 31) + this.f24953c.hashCode();
    }

    public String toString() {
        List listM21949d = m21949d();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(listM21949d, 10));
        Iterator it = listM21949d.iterator();
        while (it.hasNext()) {
            arrayList.add(m21947b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f24951a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f24952b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List list = this.f24953c;
        ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m21947b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
