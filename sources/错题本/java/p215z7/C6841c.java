package p215z7;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import okio.Utf8;

/* renamed from: z7.c */
/* loaded from: classes4.dex */
public final class C6841c implements HostnameVerifier {

    /* renamed from: a */
    public static final C6841c f11594a = new C6841c();

    /* renamed from: a */
    public static List m6500a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC5830k.m5325b(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6501b(java.lang.String r13, java.security.cert.X509Certificate r14) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p215z7.C6841c.m6501b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        AbstractC5830k.m5330g(host, "host");
        AbstractC5830k.m5330g(session, "session");
        if (host.length() == ((int) Utf8.size$default(host, 0, 0, 3, null))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                AbstractC5830k.m5328e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return m6501b(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
