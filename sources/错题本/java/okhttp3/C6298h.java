package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p204y1.AbstractC6768a;

/* renamed from: okhttp3.h */
/* loaded from: classes4.dex */
public final class C6298h {

    /* renamed from: c */
    public static final C6298h f10088c = new C6298h(AbstractC5805t.m5221H0(new ArrayList()), null);

    /* renamed from: a */
    public final Set f10089a;

    /* renamed from: b */
    public final AbstractC6768a f10090b;

    public C6298h(Set pins, AbstractC6768a abstractC6768a) {
        AbstractC5830k.m5330g(pins, "pins");
        this.f10089a = pins;
        this.f10090b = abstractC6768a;
    }

    /* renamed from: a */
    public final void m5894a(final String hostname, final List peerCertificates) throws SSLPeerUnverifiedException {
        AbstractC5830k.m5330g(hostname, "hostname");
        AbstractC5830k.m5330g(peerCertificates, "peerCertificates");
        m5895b(hostname, new InterfaceC6469a() { // from class: okhttp3.CertificatePinner$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final List<X509Certificate> invoke() {
                AbstractC6768a abstractC6768a = this.this$0.f10090b;
                List<Certificate> listMo6413e = abstractC6768a != null ? abstractC6768a.mo6413e(hostname, peerCertificates) : peerCertificates;
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listMo6413e, 10));
                for (Certificate certificate : listMo6413e) {
                    AbstractC5830k.m5328e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    /* renamed from: b */
    public final void m5895b(String hostname, InterfaceC6469a interfaceC6469a) throws SSLPeerUnverifiedException {
        AbstractC5830k.m5330g(hostname, "hostname");
        Set set = this.f10089a;
        EmptyList emptyList = EmptyList.INSTANCE;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        if (emptyList.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) interfaceC6469a.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = emptyList.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(AbstractC6296g.m5893a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            if (it3.next() != null) {
                throw new ClassCastException();
            }
            sb.append("\n    null");
        }
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6298h)) {
            return false;
        }
        C6298h c6298h = (C6298h) obj;
        return AbstractC5830k.m5325b(c6298h.f10089a, this.f10089a) && AbstractC5830k.m5325b(c6298h.f10090b, this.f10090b);
    }

    public final int hashCode() {
        int iHashCode = (this.f10089a.hashCode() + 1517) * 41;
        AbstractC6768a abstractC6768a = this.f10090b;
        return iHashCode + (abstractC6768a != null ? abstractC6768a.hashCode() : 0);
    }
}
