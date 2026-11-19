package p215z7;

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
import kotlin.jvm.internal.AbstractC5830k;
import p204y1.AbstractC6768a;

/* renamed from: z7.a */
/* loaded from: classes4.dex */
public final class C6839a extends AbstractC6768a {

    /* renamed from: b */
    public final InterfaceC6842d f11592b;

    public C6839a(InterfaceC6842d trustRootIndex) {
        AbstractC5830k.m5330g(trustRootIndex, "trustRootIndex");
        this.f11592b = trustRootIndex;
    }

    @Override // p204y1.AbstractC6768a
    /* renamed from: e */
    public final List mo6413e(String hostname, List chain) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        AbstractC5830k.m5330g(chain, "chain");
        AbstractC5830k.m5330g(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        AbstractC5830k.m5329f(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        boolean z8 = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC5830k.m5328e(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateMo6334a = this.f11592b.mo6334a(x509Certificate);
            if (x509CertificateMo6334a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC5830k.m5329f(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC5830k.m5328e(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC5830k.m5325b(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z8) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateMo6334a)) {
                arrayList.add(x509CertificateMo6334a);
            }
            if (AbstractC5830k.m5325b(x509CertificateMo6334a.getIssuerDN(), x509CertificateMo6334a.getSubjectDN())) {
                try {
                    x509CertificateMo6334a.verify(x509CertificateMo6334a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z8 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C6839a) && AbstractC5830k.m5325b(((C6839a) obj).f11592b, this.f11592b);
    }

    public final int hashCode() {
        return this.f11592b.hashCode();
    }
}
