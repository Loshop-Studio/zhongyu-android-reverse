package p302x9;

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
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: x9.b */
/* loaded from: classes5.dex */
public final class C10587b implements InterfaceC10590e {

    /* renamed from: a */
    public final Map f20981a;

    public C10587b(X509Certificate... caCerts) {
        AbstractC9133u.m16133g(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f20981a = linkedHashMap;
    }

    @Override // p302x9.InterfaceC10590e
    /* renamed from: a */
    public X509Certificate mo18103a(X509Certificate cert) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        AbstractC9133u.m16133g(cert, "cert");
        Set set = (Set) this.f20981a.get(cert.getIssuerX500Principal());
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
            return (obj instanceof C10587b) && AbstractC9133u.m16128b(((C10587b) obj).f20981a, this.f20981a);
        }
        return true;
    }

    public int hashCode() {
        return this.f20981a.hashCode();
    }
}
