package p058f5;

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
import p087k.AbstractC6619r;
import p165u5.AbstractC7777c;

/* renamed from: f5.h */
/* loaded from: classes4.dex */
public final class C6369h {

    /* renamed from: c */
    public static final b f7904c = new b(null);

    /* renamed from: d */
    public static final C6369h f7905d = new a().m6724a();

    /* renamed from: a */
    public final Set f7906a;

    /* renamed from: b */
    public final AbstractC7777c f7907b;

    /* renamed from: f5.h$a */
    public static final class a {

        /* renamed from: a */
        public final List f7908a = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final C6369h m6724a() {
            return new C6369h(CollectionsKt.toSet(this.f7908a), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: f5.h$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m6725a(Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + m6726b((X509Certificate) certificate).base64();
        }

        /* renamed from: b */
        public final ByteString m6726b(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        public b() {
        }
    }

    public C6369h(Set pins, AbstractC7777c abstractC7777c) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f7906a = pins;
        this.f7907b = abstractC7777c;
    }

    /* renamed from: c */
    public static final List m6718c(C6369h c6369h, List list, String str) {
        List listMo9086a;
        AbstractC7777c abstractC7777c = c6369h.f7907b;
        if (abstractC7777c != null && (listMo9086a = abstractC7777c.mo9086a(list, str)) != null) {
            list = listMo9086a;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Certificate certificate : list) {
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m6719b(final String hostname, final List peerCertificates) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        m6720d(hostname, new Function0() { // from class: f5.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6369h.m6718c(this.f7898a, peerCertificates, hostname);
            }
        });
    }

    /* renamed from: d */
    public final void m6720d(String hostname, Function0 cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List listM6721e = m6721e(hostname);
        if (listM6721e.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            Iterator it = listM6721e.iterator();
            if (it.hasNext()) {
                AbstractC6619r.m7572a(it.next());
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(f7904c.m6725a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        Iterator it2 = listM6721e.iterator();
        while (it2.hasNext()) {
            AbstractC6619r.m7572a(it2.next());
            sb.append("\n    ");
            sb.append((Object) null);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    /* renamed from: e */
    public final List m6721e(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set set = this.f7906a;
        List listEmptyList = CollectionsKt.emptyList();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return listEmptyList;
        }
        AbstractC6619r.m7572a(it.next());
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6369h)) {
            return false;
        }
        C6369h c6369h = (C6369h) obj;
        return Intrinsics.areEqual(c6369h.f7906a, this.f7906a) && Intrinsics.areEqual(c6369h.f7907b, this.f7907b);
    }

    /* renamed from: f */
    public final AbstractC7777c m6722f() {
        return this.f7907b;
    }

    /* renamed from: g */
    public final C6369h m6723g(AbstractC7777c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.f7907b, certificateChainCleaner) ? this : new C6369h(this.f7906a, certificateChainCleaner);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.f7906a.hashCode()) * 41;
        AbstractC7777c abstractC7777c = this.f7907b;
        return iHashCode + (abstractC7777c != null ? abstractC7777c.hashCode() : 0);
    }

    public /* synthetic */ C6369h(Set set, AbstractC7777c abstractC7777c, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i6 & 2) != 0 ? null : abstractC7777c);
    }
}
