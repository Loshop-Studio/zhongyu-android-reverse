package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.AbstractC5773a;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

/* renamed from: okhttp3.p */
/* loaded from: classes4.dex */
public final class C6328p {

    /* renamed from: a */
    public final TlsVersion f10259a;

    /* renamed from: b */
    public final C6316j f10260b;

    /* renamed from: c */
    public final List f10261c;

    /* renamed from: d */
    public final InterfaceC5429e f10262d;

    public C6328p(TlsVersion tlsVersion, C6316j c6316j, List localCertificates, final InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(tlsVersion, "tlsVersion");
        AbstractC5830k.m5330g(localCertificates, "localCertificates");
        this.f10259a = tlsVersion;
        this.f10260b = c6316j;
        this.f10261c = localCertificates;
        this.f10262d = AbstractC5773a.m5117b(new InterfaceC6469a() { // from class: okhttp3.Handshake$peerCertificates$2
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final List<Certificate> invoke() {
                try {
                    return (List) interfaceC6469a.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return EmptyList.INSTANCE;
                }
            }
        });
    }

    /* renamed from: a */
    public final List m5961a() {
        return (List) this.f10262d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6328p)) {
            return false;
        }
        C6328p c6328p = (C6328p) obj;
        return c6328p.f10259a == this.f10259a && AbstractC5830k.m5325b(c6328p.f10260b, this.f10260b) && AbstractC5830k.m5325b(c6328p.m5961a(), m5961a()) && AbstractC5830k.m5325b(c6328p.f10261c, this.f10261c);
    }

    public final int hashCode() {
        return this.f10261c.hashCode() + ((m5961a().hashCode() + ((this.f10260b.hashCode() + ((this.f10259a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listM5961a = m5961a();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(listM5961a, 10));
        for (Certificate certificate : listM5961a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC5830k.m5329f(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f10259a);
        sb.append(" cipherSuite=");
        sb.append(this.f10260b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f10261c;
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC5830k.m5329f(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
