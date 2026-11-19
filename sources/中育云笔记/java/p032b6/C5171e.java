package p032b6;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p114d6.AbstractC8995e;
import p114d6.AbstractC8996f;

/* renamed from: b6.e */
/* loaded from: classes5.dex */
public class C5171e implements X509TrustManager {

    /* renamed from: a */
    public List f3021a = new ArrayList();

    /* renamed from: b */
    public X509Certificate[] f3022b;

    public C5171e(InputStream inputStream, String str) throws IOException {
        m2689a(inputStream, str);
    }

    /* renamed from: a */
    public final void m2689a(InputStream inputStream, String str) throws IOException {
        if (inputStream == null || str == null) {
            throw new IllegalArgumentException("inputstream or trustPwd is null");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                KeyStore keyStore = KeyStore.getInstance("bks");
                keyStore.load(inputStream, str.toCharArray());
                trustManagerFactory.init(keyStore);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        this.f3021a.add((X509TrustManager) trustManager);
                    }
                }
                AbstractC8995e.m17558b(inputStream);
            } finally {
                AbstractC8995e.m17558b(inputStream);
            }
        } catch (IOException | NegativeArraySizeException | OutOfMemoryError | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AbstractC8996f.m17563d("SX509TM", "loadInputStream: exception : " + e10.getMessage());
        }
        AbstractC8996f.m17561b("SX509TM", "loadInputStream: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    /* renamed from: b */
    public void m2690b(X509Certificate[] x509CertificateArr) {
        this.f3022b = x509CertificateArr;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        AbstractC8996f.m17564e("SX509TM", "checkClientTrusted: ");
        Iterator it = this.f3021a.iterator();
        while (it.hasNext()) {
            try {
                ((X509TrustManager) it.next()).checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e10) {
                AbstractC8996f.m17563d("SX509TM", "checkServerTrusted CertificateException" + e10.getMessage());
            }
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        m2690b(x509CertificateArr);
        AbstractC8996f.m17564e("SX509TM", "checkServerTrusted begin,size=" + x509CertificateArr.length + ",authType=" + str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int size = this.f3021a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                AbstractC8996f.m17564e("SX509TM", "check server i=" + i10);
                X509TrustManager x509TrustManager = (X509TrustManager) this.f3021a.get(i10);
                X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
                if (acceptedIssuers != null) {
                    AbstractC8996f.m17564e("SX509TM", "client root ca size=" + acceptedIssuers.length);
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                AbstractC8996f.m17564e("SX509TM", "checkServerTrusted end, " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                return;
            } catch (CertificateException e10) {
                AbstractC8996f.m17563d("SX509TM", "checkServerTrusted error :" + e10.getMessage() + " , time : " + i10);
                if (i10 == size - 1) {
                    if (x509CertificateArr.length > 0) {
                        AbstractC8996f.m17563d("SX509TM", "root ca issuer : " + x509CertificateArr[x509CertificateArr.length - 1].getIssuerDN());
                    }
                    throw e10;
                }
            }
        }
        AbstractC8996f.m17561b("SX509TM", "checkServerTrusted: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3021a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(((X509TrustManager) it.next()).getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e10) {
            AbstractC8996f.m17563d("SX509TM", "getAcceptedIssuers exception : " + e10.getMessage());
            return new X509Certificate[0];
        }
    }
}
