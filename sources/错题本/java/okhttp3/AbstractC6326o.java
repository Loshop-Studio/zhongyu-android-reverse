package okhttp3;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import p139p7.AbstractC6396c;
import p152r6.InterfaceC6469a;
import p185v7.AbstractC6683l;

/* renamed from: okhttp3.o */
/* loaded from: classes4.dex */
public abstract class AbstractC6326o {
    /* renamed from: a */
    public static void m5951a(StringBuilder sb, String key) {
        AbstractC5830k.m5330g(key, "key");
        sb.append('\"');
        int length = key.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = key.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }

    /* renamed from: b */
    public static void m5952b(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC6396c.m6047g("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
            }
        }
    }

    /* renamed from: c */
    public static void m5953c(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC6396c.m6047g("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                sb.append(AbstractC6396c.m6055o(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    /* renamed from: d */
    public static int m5954d(String str, int i, int i8, boolean z8) {
        while (i < i8) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z8)) {
                return i;
            }
            i++;
        }
        return i8;
    }

    /* renamed from: e */
    public static C6328p m5955e(SSLSession sSLSession) throws IOException {
        final List listM6050j;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C6316j c6316jM5882c = C6316j.f10202b.m5882c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        TlsVersion.Companion.getClass();
        TlsVersion tlsVersionM5960a = C6327o0.m5960a(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listM6050j = peerCertificates != null ? AbstractC6396c.m6050j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : EmptyList.INSTANCE;
        } catch (SSLPeerUnverifiedException unused) {
            listM6050j = EmptyList.INSTANCE;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C6328p(tlsVersionM5960a, c6316jM5882c, localCertificates != null ? AbstractC6396c.m6050j(Arrays.copyOf(localCertificates, localCertificates.length)) : EmptyList.INSTANCE, new InterfaceC6469a() { // from class: okhttp3.Handshake$Companion$handshake$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            @NotNull
            public final List<Certificate> invoke() {
                return listM6050j;
            }
        });
    }

    /* renamed from: f */
    public static C6333u m5956f(String str) {
        AbstractC5830k.m5330g(str, "<this>");
        Matcher matcher = C6333u.f10275d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(AbstractC1923c.m1047k('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        AbstractC5830k.m5329f(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        AbstractC5830k.m5329f(US, "US");
        String lowerCase = strGroup.toLowerCase(US);
        AbstractC5830k.m5329f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        AbstractC5830k.m5329f(strGroup2, "typeSubtype.group(2)");
        AbstractC5830k.m5329f(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = C6333u.f10276e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC0584a.m911l('\"', str, sb).toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (AbstractC5862w.m5409C(strGroup4, "'", false) && AbstractC5862w.m5414u(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    AbstractC5830k.m5329f(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new C6333u(str, (String[]) arrayList.toArray(new String[0]), lowerCase);
    }

    /* renamed from: g */
    public static C6329q m5957g(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i8 = 0; i8 < length; i8++) {
            String str = strArr2[i8];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i8] = AbstractC5855p.m5403k0(str).toString();
        }
        int iM6373m = AbstractC6683l.m6373m(0, strArr2.length - 1, 2);
        if (iM6373m >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                m5952b(str2);
                m5953c(str3, str2);
                if (i == iM6373m) {
                    break;
                }
                i += 2;
            }
        }
        return new C6329q(strArr2);
    }

    /* renamed from: h */
    public static C6333u m5958h(String str) {
        AbstractC5830k.m5330g(str, "<this>");
        try {
            return m5956f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m5959i(int r14, java.lang.String r15) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.AbstractC6326o.m5959i(int, java.lang.String):long");
    }
}
