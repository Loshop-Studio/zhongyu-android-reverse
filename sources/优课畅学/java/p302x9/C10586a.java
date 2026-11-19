package p302x9;

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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: x9.a */
/* loaded from: classes5.dex */
public final class C10586a extends AbstractC10588c {

    /* renamed from: c */
    public static final a f20979c = new a(null);

    /* renamed from: b */
    public final InterfaceC10590e f20980b;

    /* renamed from: x9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C10586a(InterfaceC10590e trustRootIndex) {
        AbstractC9133u.m16133g(trustRootIndex, "trustRootIndex");
        this.f20980b = trustRootIndex;
    }

    @Override // p302x9.AbstractC10588c
    /* renamed from: a */
    public List mo19122a(List chain, String hostname) throws SSLPeerUnverifiedException {
        AbstractC9133u.m16133g(chain, "chain");
        AbstractC9133u.m16133g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC9133u.m16132f(objRemoveFirst, "removeFirst(...)");
        arrayList.add(objRemoveFirst);
        boolean z10 = false;
        for (int i10 = 0; i10 < 9; i10++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo18103a = this.f20980b.mo18103a(x509Certificate);
            if (x509CertificateMo18103a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC9133u.m16132f(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC9133u.m16131e(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m19743b(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z10) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !AbstractC9133u.m16128b(x509Certificate, x509CertificateMo18103a)) {
                arrayList.add(x509CertificateMo18103a);
            }
            if (m19743b(x509CertificateMo18103a, x509CertificateMo18103a, arrayList.size() - 2)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    /* renamed from: b */
    public final boolean m19743b(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i10) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        if (!AbstractC9133u.m16128b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i10) {
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
        return (obj instanceof C10586a) && AbstractC9133u.m16128b(((C10586a) obj).f20980b, this.f20980b);
    }

    public int hashCode() {
        return this.f20980b.hashCode();
    }
}
