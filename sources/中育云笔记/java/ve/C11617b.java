package ve;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ve.b */
/* loaded from: classes6.dex */
public final class C11617b implements InterfaceC11620e {

    /* renamed from: a */
    public final Map f27519a;

    public C11617b(X509Certificate... caCerts) {
        AbstractC9979u.m20294g(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            AbstractC9979u.m20293f(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f27519a = linkedHashMap;
    }

    @Override // ve.InterfaceC11620e
    /* renamed from: a */
    public X509Certificate mo24867a(X509Certificate cert) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        AbstractC9979u.m20294g(cert, "cert");
        Set set = (Set) this.f27519a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C11617b) && AbstractC9979u.m20289b(((C11617b) obj).f27519a, this.f27519a);
        }
        return true;
    }

    public int hashCode() {
        return this.f27519a.hashCode();
    }
}
