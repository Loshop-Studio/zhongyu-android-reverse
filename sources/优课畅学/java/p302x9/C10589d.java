package p302x9;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Utf8;
import org.slf4j.Marker;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p147j9.AbstractC9036f;

/* renamed from: x9.d */
/* loaded from: classes5.dex */
public final class C10589d implements HostnameVerifier {

    /* renamed from: a */
    public static final C10589d f20983a = new C10589d();

    /* renamed from: a */
    public final List m19745a(X509Certificate certificate) {
        AbstractC9133u.m16133g(certificate, "certificate");
        return AbstractC8778f0.m14529F0(m19747c(certificate, 7), m19747c(certificate, 2));
    }

    /* renamed from: b */
    public final String m19746b(String str) {
        if (!m19748d(str)) {
            return str;
        }
        Locale US = Locale.US;
        AbstractC9133u.m16132f(US, "US");
        String lowerCase = str.toLowerCase(US);
        AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List m19747c(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return AbstractC8809v.m14771n();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC9133u.m16128b(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return AbstractC8809v.m14771n();
        }
    }

    /* renamed from: d */
    public final boolean m19748d(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    /* renamed from: e */
    public final boolean m19749e(String host, X509Certificate certificate) {
        AbstractC9133u.m16133g(host, "host");
        AbstractC9133u.m16133g(certificate, "certificate");
        return AbstractC9036f.m15728a(host) ? m19752h(host, certificate) : m19751g(host, certificate);
    }

    /* renamed from: f */
    public final boolean m19750f(String str, String str2) {
        if (str != null && str.length() != 0 && !AbstractC8687z.m14105M(str, ".", false, 2, null) && !AbstractC8687z.m14111z(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !AbstractC8687z.m14105M(str2, ".", false, 2, null) && !AbstractC8687z.m14111z(str2, "..", false, 2, null)) {
            if (!AbstractC8687z.m14111z(str, ".", false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!AbstractC8687z.m14111z(str2, ".", false, 2, null)) {
                str2 = str2 + '.';
            }
            String strM19746b = m19746b(str2);
            if (!AbstractC8661c0.m13973S(strM19746b, Marker.ANY_MARKER, false, 2, null)) {
                return AbstractC9133u.m16128b(str3, strM19746b);
            }
            if (!AbstractC8687z.m14105M(strM19746b, "*.", false, 2, null) || AbstractC8661c0.m13990e0(strM19746b, '*', 1, false, 4, null) != -1 || str3.length() < strM19746b.length() || AbstractC9133u.m16128b("*.", strM19746b)) {
                return false;
            }
            String strSubstring = strM19746b.substring(1);
            AbstractC9133u.m16132f(strSubstring, "substring(...)");
            if (!AbstractC8687z.m14111z(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || AbstractC8661c0.m13996k0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m19751g(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM19746b = m19746b(str);
        List listM19747c = m19747c(x509Certificate, 2);
        if (listM19747c != null && listM19747c.isEmpty()) {
            return false;
        }
        Iterator it = listM19747c.iterator();
        while (it.hasNext()) {
            if (f20983a.m19750f(strM19746b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m19752h(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM15738k = AbstractC9036f.m15738k(str);
        List listM19747c = m19747c(x509Certificate, 7);
        if (listM19747c != null && listM19747c.isEmpty()) {
            return false;
        }
        Iterator it = listM19747c.iterator();
        while (it.hasNext()) {
            if (AbstractC9133u.m16128b(strM15738k, AbstractC9036f.m15738k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        AbstractC9133u.m16133g(host, "host");
        AbstractC9133u.m16133g(session, "session");
        if (!m19748d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC9133u.m16131e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m19749e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
