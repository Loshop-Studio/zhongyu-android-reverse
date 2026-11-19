package ve;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ve.a */
/* loaded from: classes6.dex */
public final class C11616a extends AbstractC11618c {

    /* renamed from: c */
    public static final a f27517c = new a(null);

    /* renamed from: b */
    public final InterfaceC11620e f27518b;

    /* renamed from: ve.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C11616a(InterfaceC11620e trustRootIndex) {
        AbstractC9979u.m20294g(trustRootIndex, "trustRootIndex");
        this.f27518b = trustRootIndex;
    }

    @Override // ve.AbstractC11618c
    /* renamed from: a */
    public List mo25221a(List chain, String hostname) throws SSLPeerUnverifiedException {
        AbstractC9979u.m20294g(chain, "chain");
        AbstractC9979u.m20294g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC9979u.m20293f(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo24867a = this.f27518b.mo24867a(x509Certificate);
            if (x509CertificateMo24867a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC9979u.m20293f(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC9979u.m20292e(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m25612b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z10) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !AbstractC9979u.m20289b(x509Certificate, x509CertificateMo24867a)) {
                arrayList.add(x509CertificateMo24867a);
            }
            if (m25612b(x509CertificateMo24867a, x509CertificateMo24867a)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* renamed from: b */
    public final boolean m25612b(X509Certificate x509Certificate, X509Certificate x509Certificate2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (!AbstractC9979u.m20289b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C11616a) && AbstractC9979u.m20289b(((C11616a) obj).f27518b, this.f27518b);
    }

    public int hashCode() {
        return this.f27518b.hashCode();
    }
}
