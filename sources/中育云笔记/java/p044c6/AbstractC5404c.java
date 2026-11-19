package p044c6;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import p114d6.AbstractC8996f;

/* renamed from: c6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC5404c {

    /* renamed from: a */
    public static final Pattern f3448a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    public static final String[] f3449b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f3449b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public static final void m2835a(String str, X509Certificate x509Certificate, boolean z10) throws SSLException, CertificateParsingException {
        String[] strArrM2838d = m2838d(x509Certificate);
        String[] strArrM2840f = m2840f(x509Certificate);
        AbstractC8996f.m17561b("", "cn is : " + Arrays.toString(strArrM2838d));
        AbstractC8996f.m17561b("", "san is : " + Arrays.toString(strArrM2840f));
        m2836b(str, strArrM2838d, strArrM2840f, z10);
    }

    /* renamed from: b */
    public static final void m2836b(String str, String[] strArr, String[] strArr2, boolean z10) throws SSLException {
        String str2;
        LinkedList linkedList = new LinkedList();
        if (strArr != null && strArr.length > 0 && (str2 = strArr[0]) != null) {
            linkedList.add(str2);
        }
        if (strArr2 != null) {
            for (String str3 : strArr2) {
                if (str3 != null) {
                    linkedList.add(str3);
                }
            }
        }
        if (linkedList.isEmpty()) {
            throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
        }
        StringBuffer stringBuffer = new StringBuffer();
        String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        Iterator it = linkedList.iterator();
        boolean zEquals = false;
        while (it.hasNext()) {
            String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
            stringBuffer.append(" <");
            stringBuffer.append(lowerCase2);
            stringBuffer.append('>');
            if (it.hasNext()) {
                stringBuffer.append(" OR");
            }
            if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(46, 2) == -1 || !m2837c(lowerCase2) || m2841g(str)) {
                zEquals = lowerCase.equals(lowerCase2);
            } else {
                boolean zEndsWith = lowerCase.endsWith(lowerCase2.substring(1));
                zEquals = (zEndsWith && z10) ? m2839e(lowerCase) == m2839e(lowerCase2) : zEndsWith;
            }
            if (zEquals) {
                break;
            }
        }
        if (zEquals) {
            return;
        }
        throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
    }

    /* renamed from: c */
    public static boolean m2837c(String str) {
        int length = str.length();
        if (length >= 7 && length <= 9) {
            int i10 = length - 3;
            if (str.charAt(i10) == '.') {
                return Arrays.binarySearch(f3449b, str.substring(2, i10)) < 0;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static String[] m2838d(X509Certificate x509Certificate) {
        List listM2830d = new C5403b(x509Certificate.getSubjectX500Principal()).m2830d("cn");
        if (listM2830d.isEmpty()) {
            return null;
        }
        String[] strArr = new String[listM2830d.size()];
        listM2830d.toArray(strArr);
        return strArr;
    }

    /* renamed from: e */
    public static int m2839e(String str) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == '.') {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: f */
    public static String[] m2840f(X509Certificate x509Certificate) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames;
        LinkedList linkedList = new LinkedList();
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e10) {
            AbstractC8996f.m17562c("", "Error parsing certificate.", e10);
            subjectAlternativeNames = null;
        }
        if (subjectAlternativeNames != null) {
            for (List<?> list : subjectAlternativeNames) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: g */
    public static boolean m2841g(String str) {
        return f3448a.matcher(str).matches();
    }
}
