package okhttp3;

import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.C2730l;
import kotlin.collections.C2731m;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2915h;
import p128o2.InterfaceC2913f;
import p171x2.InterfaceC3459a;

/* loaded from: classes.dex */
public final class Handshake {
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final CipherSuite cipherSuite;

    @NotNull
    private final List<Certificate> localCertificates;

    @NotNull
    private final InterfaceC2913f peerCertificates$delegate;

    @NotNull
    private final TlsVersion tlsVersion;

    /* renamed from: okhttp3.Handshake$peerCertificates$2 */
    static final class C29302 extends AbstractC2770m implements InterfaceC3459a<List<? extends Certificate>> {
        final /* synthetic */ InterfaceC3459a $peerCertificatesFn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C29302(InterfaceC3459a interfaceC3459a) {
            super(0);
            this.$peerCertificatesFn = interfaceC3459a;
        }

        @Override // p171x2.InterfaceC3459a
        @NotNull
        public final List<? extends Certificate> invoke() {
            try {
                return (List) this.$peerCertificatesFn.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return C2730l.m9139f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull InterfaceC3459a<? extends List<? extends Certificate>> peerCertificatesFn) {
        C2769l.m9241e(tlsVersion, "tlsVersion");
        C2769l.m9241e(cipherSuite, "cipherSuite");
        C2769l.m9241e(localCertificates, "localCertificates");
        C2769l.m9241e(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates$delegate = C2915h.m9984a(new C29302(peerCertificatesFn));
    }

    @NotNull
    public static final Handshake get(@NotNull SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    @NotNull
    public static final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C2769l.m9240d(type, "type");
        return type;
    }

    @NotNull
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m10780deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @NotNull
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m10781deprecated_localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m10782deprecated_localPrincipal() {
        return localPrincipal();
    }

    @NotNull
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m10783deprecated_peerCertificates() {
        return peerCertificates();
    }

    @Nullable
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m10784deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @NotNull
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m10785deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && C2769l.m9237a(handshake.cipherSuite, this.cipherSuite) && C2769l.m9237a(handshake.peerCertificates(), peerCertificates()) && C2769l.m9237a(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @NotNull
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @Nullable
    public final Principal localPrincipal() {
        Object objM9171x = C2738t.m9171x(this.localCertificates);
        if (!(objM9171x instanceof X509Certificate)) {
            objM9171x = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objM9171x;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @Nullable
    public final Principal peerPrincipal() {
        Object objM9171x = C2738t.m9171x(peerCertificates());
        if (!(objM9171x instanceof X509Certificate)) {
            objM9171x = null;
        }
        X509Certificate x509Certificate = (X509Certificate) objM9171x;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @NotNull
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @NotNull
    public String toString() {
        List<Certificate> listPeerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(C2731m.m9149p(listPeerCertificates, 10));
        Iterator<T> it = listPeerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(C2731m.m9149p(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C2764g c2764g) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            return certificateArr != null ? Util.immutableListOf((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length)) : C2730l.m9139f();
        }

        @NotNull
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m10786deprecated_get(@NotNull SSLSession sslSession) throws IOException {
            C2769l.m9241e(sslSession, "sslSession");
            return get(sslSession);
        }

        @NotNull
        public final Handshake get(@NotNull SSLSession handshake) throws IOException {
            List<Certificate> listM9139f;
            C2769l.m9241e(handshake, "$this$handshake");
            String cipherSuite = handshake.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int iHashCode = cipherSuite.hashCode();
            if (iHashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : iHashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            CipherSuite cipherSuiteForJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
            String protocol = handshake.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (C2769l.m9237a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion tlsVersionForJavaName = TlsVersion.Companion.forJavaName(protocol);
            try {
                listM9139f = toImmutableList(handshake.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM9139f = C2730l.m9139f();
            }
            return new Handshake(tlsVersionForJavaName, cipherSuiteForJavaName, toImmutableList(handshake.getLocalCertificates()), new Handshake$Companion$handshake$1(listM9139f));
        }

        @NotNull
        public final Handshake get(@NotNull TlsVersion tlsVersion, @NotNull CipherSuite cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
            C2769l.m9241e(tlsVersion, "tlsVersion");
            C2769l.m9241e(cipherSuite, "cipherSuite");
            C2769l.m9241e(peerCertificates, "peerCertificates");
            C2769l.m9241e(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Handshake$Companion$get$1(Util.toImmutableList(peerCertificates)));
        }
    }
}
