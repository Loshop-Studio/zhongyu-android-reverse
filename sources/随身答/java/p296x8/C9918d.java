package p296x8;

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
import p182m8.AbstractC9042a;
import p182m8.AbstractC9045d;

/* renamed from: x8.d */
/* loaded from: classes5.dex */
public final class C9918d implements HostnameVerifier {

    /* renamed from: a */
    public static final C9918d f17747a = new C9918d();

    /* renamed from: a */
    public final List m16984a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) m16986c(certificate, 7), (Iterable) m16986c(certificate, 2));
    }

    /* renamed from: b */
    public final String m16985b(String str) {
        if (!m16987d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List m16986c(X509Certificate x509Certificate, int i9) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i9)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* renamed from: d */
    public final boolean m16987d(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    /* renamed from: e */
    public final boolean m16988e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return AbstractC9045d.m14493i(host) ? m16991h(host, certificate) : m16990g(host, certificate);
    }

    /* renamed from: f */
    public final boolean m16989f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.startsWith$default(str, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !StringsKt.startsWith$default(str2, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, "..", false, 2, (Object) null)) {
            if (!StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.endsWith$default(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String strM16985b = m16985b(str2);
            if (!StringsKt.contains$default((CharSequence) strM16985b, (CharSequence) "*", false, 2, (Object) null)) {
                return Intrinsics.areEqual(str3, strM16985b);
            }
            if (!StringsKt.startsWith$default(strM16985b, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) strM16985b, '*', 1, false, 4, (Object) null) != -1 || str3.length() < strM16985b.length() || Intrinsics.areEqual("*.", strM16985b)) {
                return false;
            }
            String strSubstring = strM16985b.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!StringsKt.endsWith$default(str3, strSubstring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m16990g(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM16985b = m16985b(str);
        List listM16986c = m16986c(x509Certificate, 2);
        if (listM16986c != null && listM16986c.isEmpty()) {
            return false;
        }
        Iterator it = listM16986c.iterator();
        while (it.hasNext()) {
            if (f17747a.m16989f(strM16985b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m16991h(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM14458e = AbstractC9042a.m14458e(str);
        List listM16986c = m16986c(x509Certificate, 7);
        if (listM16986c != null && listM16986c.isEmpty()) {
            return false;
        }
        Iterator it = listM16986c.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strM14458e, AbstractC9042a.m14458e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!m16987d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m16988e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
