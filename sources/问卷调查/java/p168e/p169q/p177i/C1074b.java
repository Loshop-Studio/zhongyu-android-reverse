package p168e.p169q.p177i;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p160d.p162f.p164b.C1011d;

/* renamed from: e.q.i.b */
/* loaded from: classes.dex */
public final class C1074b implements InterfaceC1076d {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f5644a;

    public C1074b(X509Certificate... x509CertificateArr) {
        C1011d.m2809e(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C1011d.m2808d(subjectX500Principal, "caCert.subjectX500Principal");
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f5644a = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1074b) && C1011d.m2805a(((C1074b) obj).f5644a, this.f5644a));
    }

    public int hashCode() {
        return this.f5644a.hashCode();
    }
}
