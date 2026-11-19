package p050d3;

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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p121s2.AbstractC4549a;
import p121s2.AbstractC4550b;

/* renamed from: d3.d */
/* loaded from: classes2.dex */
public final class C3710d implements HostnameVerifier {

    /* renamed from: a */
    public static final C3710d f4334a = new C3710d();

    /* renamed from: a */
    public final List m4699a(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt___CollectionsKt.plus((Collection) m4700b(certificate, 7), (Iterable) m4700b(certificate, 2));
    }

    /* renamed from: b */
    public final List m4700b(X509Certificate x509Certificate, int i4) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!Intrinsics.areEqual(list.get(0), Integer.valueOf(i4))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* renamed from: c */
    public final boolean m4701c(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return AbstractC4550b.m6224f(host) ? m4704f(host, certificate) : m4703e(host, certificate);
    }

    /* renamed from: d */
    public final boolean m4702d(String str, String str2) {
        if (!(str == null || str.length() == 0) && !StringsKt__StringsJVMKt.startsWith$default(str, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !StringsKt__StringsJVMKt.startsWith$default(str2, ".", false, 2, null) && !StringsKt__StringsJVMKt.endsWith$default(str2, "..", false, 2, null)) {
                if (!StringsKt__StringsJVMKt.endsWith$default(str, ".", false, 2, null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!StringsKt__StringsJVMKt.endsWith$default(str2, ".", false, 2, null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (str2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "*", false, 2, (Object) null)) {
                    return Intrinsics.areEqual(str3, lowerCase);
                }
                if (!StringsKt__StringsJVMKt.startsWith$default(lowerCase, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) lowerCase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < lowerCase.length() || Intrinsics.areEqual("*.", lowerCase)) {
                    return false;
                }
                String strSubstring = lowerCase.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                if (!StringsKt__StringsJVMKt.endsWith$default(str3, strSubstring, false, 2, null)) {
                    return false;
                }
                int length = str3.length() - strSubstring.length();
                return length <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, '.', length + (-1), false, 4, (Object) null) == -1;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m4703e(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        List listM4700b = m4700b(x509Certificate, 2);
        if ((listM4700b instanceof Collection) && listM4700b.isEmpty()) {
            return false;
        }
        Iterator it = listM4700b.iterator();
        while (it.hasNext()) {
            if (f4334a.m4702d(lowerCase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m4704f(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        String strM6197e = AbstractC4549a.m6197e(str);
        List listM4700b = m4700b(x509Certificate, 7);
        if ((listM4700b instanceof Collection) && listM4700b.isEmpty()) {
            return false;
        }
        Iterator it = listM4700b.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(strM6197e, AbstractC4549a.m6197e((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return m4701c(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
