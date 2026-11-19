package p044c6;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p114d6.AbstractC8996f;
import p114d6.AsyncTaskC8994d;

/* renamed from: c6.a */
/* loaded from: classes5.dex */
public class C5402a implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) throws CertificateParsingException {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            AbstractC8996f.m17564e("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            AbstractC5404c.m2835a(str, x509Certificate, true);
            AsyncTaskC8994d.m17552b();
            return true;
        } catch (SSLException e10) {
            AbstractC8996f.m17563d("", "SSLException : " + e10.getMessage());
            return false;
        }
    }
}
