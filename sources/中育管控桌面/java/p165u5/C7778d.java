package p165u5;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Utf8;
import p065g5.AbstractC6422f;

/* renamed from: u5.d */
/* loaded from: classes4.dex */
public final class C7778d implements HostnameVerifier {

    /* renamed from: a */
    public static final C7778d f10303a = new C7778d();

    /* renamed from: a */
    public final List m9309a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) m9311c(certificate, 7), (Iterable) m9311c(certificate, 2));
    }

    /* renamed from: b */
    public final String m9310b(String str) {
        if (!m9312d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List m9311c(X509Certificate x509Certificate, int i6) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i6)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* renamed from: d */
    public final boolean m9312d(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    /* renamed from: e */
    public final boolean m9313e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return AbstractC6422f.m6970a(host) ? m9316h(host, certificate) : m9315g(host, certificate);
    }

    /* renamed from: f */
    public final boolean m9314f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.startsWith$default(str, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !StringsKt.startsWith$default(str2, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, "..", false, 2, (Object) null)) {
            if (!StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.endsWith$default(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String strM9310b = m9310b(str2);
            if (!StringsKt.contains$default((CharSequence) strM9310b, (CharSequence) "*", false, 2, (Object) null)) {
                return Intrinsics.areEqual(str3, strM9310b);
            }
            if (!StringsKt.startsWith$default(strM9310b, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) strM9310b, '*', 1, false, 4, (Object) null) != -1 || str3.length() < strM9310b.length() || Intrinsics.areEqual("*.", strM9310b)) {
                return false;
            }
            String strSubstring = strM9310b.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (!StringsKt.endsWith$default(str3, strSubstring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m9315g(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM9310b = m9310b(str);
        List listM9311c = m9311c(x509Certificate, 2);
        if (listM9311c != null && listM9311c.isEmpty()) {
            return false;
        }
        Iterator it = listM9311c.iterator();
        while (it.hasNext()) {
            if (f10303a.m9314f(strM9310b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m9316h(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM6980k = AbstractC6422f.m6980k(str);
        List listM9311c = m9311c(x509Certificate, 7);
        if (listM9311c != null && listM9311c.isEmpty()) {
            return false;
        }
        Iterator it = listM9311c.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strM6980k, AbstractC6422f.m6980k((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!m9312d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m9313e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
