package p171m9;

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
import p028b9.AbstractC5067a;
import p028b9.AbstractC5070d;

/* renamed from: m9.d */
/* loaded from: classes5.dex */
public final class C8574d implements HostnameVerifier {

    /* renamed from: a */
    public static final C8574d f14216a = new C8574d();

    /* renamed from: a */
    public final List m14113a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.plus((Collection) m14115c(certificate, 7), (Iterable) m14115c(certificate, 2));
    }

    /* renamed from: b */
    public final String m14114b(String str) {
        if (!m14116d(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: c */
    public final List m14115c(X509Certificate x509Certificate, int i10) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* renamed from: d */
    public final boolean m14116d(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    /* renamed from: e */
    public final boolean m14117e(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return AbstractC5070d.m2644i(host) ? m14120h(host, certificate) : m14119g(host, certificate);
    }

    /* renamed from: f */
    public final boolean m14118f(String str, String str2) {
        if (str != null && str.length() != 0 && !StringsKt.startsWith$default(str, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !StringsKt.startsWith$default(str2, ".", false, 2, (Object) null) && !StringsKt.endsWith$default(str2, "..", false, 2, (Object) null)) {
            if (!StringsKt.endsWith$default(str, ".", false, 2, (Object) null)) {
                str = str + '.';
            }
            String str3 = str;
            if (!StringsKt.endsWith$default(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + '.';
            }
            String strM14114b = m14114b(str2);
            if (!StringsKt.contains$default((CharSequence) strM14114b, (CharSequence) "*", false, 2, (Object) null)) {
                return Intrinsics.areEqual(str3, strM14114b);
            }
            if (!StringsKt.startsWith$default(strM14114b, "*.", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) strM14114b, '*', 1, false, 4, (Object) null) != -1 || str3.length() < strM14114b.length() || Intrinsics.areEqual("*.", strM14114b)) {
                return false;
            }
            String strSubstring = strM14114b.substring(1);
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
    public final boolean m14119g(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM14114b = m14114b(str);
        List listM14115c = m14115c(x509Certificate, 2);
        if (listM14115c != null && listM14115c.isEmpty()) {
            return false;
        }
        Iterator it = listM14115c.iterator();
        while (it.hasNext()) {
            if (f14216a.m14118f(strM14114b, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m14120h(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM2609e = AbstractC5067a.m2609e(str);
        List listM14115c = m14115c(x509Certificate, 7);
        if (listM14115c != null && listM14115c.isEmpty()) {
            return false;
        }
        Iterator it = listM14115c.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strM2609e, AbstractC5067a.m2609e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!m14116d(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m14117e(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
