package okhttp3;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C7527c;
import p065g5.AbstractC6427k;

/* renamed from: okhttp3.c */
/* loaded from: classes4.dex */
public final class C7527c {

    /* renamed from: e */
    public static final a f9873e = new a(null);

    /* renamed from: a */
    public final TlsVersion f9874a;

    /* renamed from: b */
    public final C7525a f9875b;

    /* renamed from: c */
    public final List f9876c;

    /* renamed from: d */
    public final Lazy f9877d;

    /* renamed from: okhttp3.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static final List m8724c(List list) {
            return list;
        }

        /* renamed from: b */
        public final C7527c m8725b(SSLSession sSLSession) throws IOException {
            final List listEmptyList;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.areEqual(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.areEqual(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            C7525a c7525aM8697b = C7525a.f9789b.m8697b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.areEqual("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionM8691a = TlsVersion.INSTANCE.m8691a(protocol);
            try {
                listEmptyList = AbstractC6427k.m7035w(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return new C7527c(tlsVersionM8691a, c7525aM8697b, AbstractC6427k.m7035w(sSLSession.getLocalCertificates()), new Function0() { // from class: f5.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7527c.a.m8724c(listEmptyList);
                }
            });
        }

        public a() {
        }
    }

    public C7527c(TlsVersion tlsVersion, C7525a cipherSuite, List localCertificates, final Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f9874a = tlsVersion;
        this.f9875b = cipherSuite;
        this.f9876c = localCertificates;
        this.f9877d = LazyKt.lazy(new Function0() { // from class: f5.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7527c.m8717f(peerCertificatesFn);
            }
        });
    }

    /* renamed from: f */
    public static final List m8717f(Function0 function0) {
        try {
            return (List) function0.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* renamed from: b */
    public final C7525a m8718b() {
        return this.f9875b;
    }

    /* renamed from: c */
    public final String m8719c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    /* renamed from: d */
    public final List m8720d() {
        return this.f9876c;
    }

    /* renamed from: e */
    public final List m8721e() {
        return (List) this.f9877d.getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7527c)) {
            return false;
        }
        C7527c c7527c = (C7527c) obj;
        return c7527c.f9874a == this.f9874a && Intrinsics.areEqual(c7527c.f9875b, this.f9875b) && Intrinsics.areEqual(c7527c.m8721e(), m8721e()) && Intrinsics.areEqual(c7527c.f9876c, this.f9876c);
    }

    /* renamed from: g */
    public final TlsVersion m8722g() {
        return this.f9874a;
    }

    public int hashCode() {
        return ((((((527 + this.f9874a.hashCode()) * 31) + this.f9875b.hashCode()) * 31) + m8721e().hashCode()) * 31) + this.f9876c.hashCode();
    }

    public String toString() {
        List listM8721e = m8721e();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM8721e, 10));
        Iterator it = listM8721e.iterator();
        while (it.hasNext()) {
            arrayList.add(m8719c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.f9874a);
        sb.append(" cipherSuite=");
        sb.append(this.f9875b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List list = this.f9876c;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m8719c((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
