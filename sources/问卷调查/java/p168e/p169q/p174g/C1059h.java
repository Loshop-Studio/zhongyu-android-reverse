package p168e.p169q.p174g;

import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p070b.p071a.p072a.p073a.C0561a;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.p177i.AbstractC1075c;
import p168e.p169q.p177i.C1073a;
import p168e.p169q.p177i.C1074b;
import p168e.p169q.p177i.InterfaceC1076d;

/* renamed from: e.q.g.h */
/* loaded from: classes.dex */
public class C1059h {

    /* renamed from: a */
    public static volatile C1059h f5626a;

    /* renamed from: b */
    public static final Logger f5627b;

    /* renamed from: c */
    public static final a f5628c;

    /* renamed from: e.q.g.h$a */
    public static final class a {
        public a(C1010c c1010c) {
        }

        /* renamed from: a */
        public final boolean m2857a() {
            return C1011d.m2805a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    static {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p168e.p169q.p174g.C1059h.<clinit>():void");
    }

    /* renamed from: a */
    public AbstractC1075c mo2850a(X509TrustManager x509TrustManager) {
        C1011d.m2809e(x509TrustManager, "trustManager");
        return new C1073a(mo2851b(x509TrustManager));
    }

    /* renamed from: b */
    public InterfaceC1076d mo2851b(X509TrustManager x509TrustManager) {
        C1011d.m2809e(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        C1011d.m2808d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C1074b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: c */
    public void m2856c(String str, int i, Throwable th) {
        C1011d.m2809e(str, "message");
        f5627b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: d */
    public SSLContext mo2852d() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C1011d.m2808d(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: e */
    public SSLSocketFactory mo2854e(X509TrustManager x509TrustManager) throws KeyManagementException {
        C1011d.m2809e(x509TrustManager, "trustManager");
        try {
            SSLContext sSLContextMo2852d = mo2852d();
            sSLContextMo2852d.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo2852d.getSocketFactory();
            C1011d.m2808d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS: " + e2, e2);
        }
    }

    /* renamed from: f */
    public X509TrustManager mo2853f() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        C1011d.m2808d(trustManagerFactory, "factory");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C1011d.m2807c(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        StringBuilder sbM2079g = C0561a.m2079g("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        C1011d.m2808d(string, "java.util.Arrays.toString(this)");
        sbM2079g.append(string);
        throw new IllegalStateException(sbM2079g.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C1011d.m2808d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
