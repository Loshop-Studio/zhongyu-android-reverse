package ve;

import com.alibaba.android.arouter.utils.Consts;
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
import ke.AbstractC9917a;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Utf8;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

/* renamed from: ve.d */
/* loaded from: classes6.dex */
public final class C11619d implements HostnameVerifier {

    /* renamed from: a */
    public static final C11619d f27521a = new C11619d();

    /* renamed from: a */
    public final List m25614a(X509Certificate certificate) throws CertificateParsingException {
        AbstractC9979u.m20294g(certificate, "certificate");
        return AbstractC10947g0.m23906H0(m25616c(certificate, 7), m25616c(certificate, 2));
    }

    /* renamed from: b */
    public final String m25615b(String str) {
        if (!m25617d(str)) {
            return str;
        }
        Locale US = Locale.US;
        AbstractC9979u.m20293f(US, "US");
        String lowerCase = str.toLowerCase(US);
        AbstractC9979u.m20293f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List m25616c(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return AbstractC10978w.m24136n();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC9979u.m20289b(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return AbstractC10978w.m24136n();
        }
    }

    /* renamed from: d */
    public final boolean m25617d(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    /* renamed from: e */
    public final boolean m25618e(String host, X509Certificate certificate) {
        AbstractC9979u.m20294g(host, "host");
        AbstractC9979u.m20294g(certificate, "certificate");
        return AbstractC9920d.m20027i(host) ? m25621h(host, certificate) : m25620g(host, certificate);
    }

    /* renamed from: f */
    public final boolean m25619f(String str, String str2) {
        if (str != null && str.length() != 0 && !AbstractC10819z.m23242O(str, Consts.DOT, false, 2, null) && !AbstractC10819z.m23229B(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !AbstractC10819z.m23242O(str2, Consts.DOT, false, 2, null) && !AbstractC10819z.m23229B(str2, "..", false, 2, null)) {
            if (!AbstractC10819z.m23229B(str, Consts.DOT, false, 2, null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!AbstractC10819z.m23229B(str2, Consts.DOT, false, 2, null)) {
                str2 = str2 + '.';
            }
            String strM25615b = m25615b(str2);
            if (!AbstractC10793c0.m23108U(strM25615b, "*", false, 2, null)) {
                return AbstractC9979u.m20289b(str3, strM25615b);
            }
            if (!AbstractC10819z.m23242O(strM25615b, "*.", false, 2, null) || AbstractC10793c0.m23128e0(strM25615b, '*', 1, false, 4, null) != -1 || str3.length() < strM25615b.length() || AbstractC9979u.m20289b("*.", strM25615b)) {
                return false;
            }
            String strSubstring = strM25615b.substring(1);
            AbstractC9979u.m20293f(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!AbstractC10819z.m23229B(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || AbstractC10793c0.m23135k0(str3, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m25620g(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM25615b = m25615b(str);
        List listM25616c = m25616c(x509Certificate, 2);
        if ((listM25616c instanceof Collection) && listM25616c.isEmpty()) {
            return false;
        }
        Iterator it = listM25616c.iterator();
        while (it.hasNext()) {
            if (f27521a.m25619f(strM25615b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m25621h(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM19992e = AbstractC9917a.m19992e(str);
        List listM25616c = m25616c(x509Certificate, 7);
        if ((listM25616c instanceof Collection) && listM25616c.isEmpty()) {
            return false;
        }
        Iterator it = listM25616c.iterator();
        while (it.hasNext()) {
            if (AbstractC9979u.m20289b(strM19992e, AbstractC9917a.m19992e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        AbstractC9979u.m20294g(host, "host");
        AbstractC9979u.m20294g(session, "session");
        if (!m25617d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            AbstractC9979u.m20292e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m25618e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
