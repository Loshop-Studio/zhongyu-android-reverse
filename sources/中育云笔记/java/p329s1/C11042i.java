package p329s1;

import android.text.TextUtils;
import androidx.collection.SieveCacheKt;
import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import p354u1.C11321a;
import p354u1.InterfaceC11322b;
import p369v1.AbstractC11413d;
import p369v1.InterfaceC11412c;

/* renamed from: s1.i */
/* loaded from: classes3.dex */
public class C11042i implements InterfaceC11048o {

    /* renamed from: a */
    public final InterfaceC11412c f26651a;

    /* renamed from: b */
    public final InterfaceC11322b f26652b;

    /* renamed from: c */
    public final HostnameVerifier f26653c;

    /* renamed from: d */
    public final TrustManager[] f26654d;

    /* renamed from: e */
    public C11049p f26655e;

    /* renamed from: f */
    public HttpURLConnection f26656f;

    /* renamed from: g */
    public InputStream f26657g;

    public C11042i(String str, HostnameVerifier hostnameVerifier, TrustManager[] trustManagerArr) {
        this(str, AbstractC11413d.m25370a(), hostnameVerifier, trustManagerArr);
    }

    @Override // p329s1.InterfaceC11048o
    /* renamed from: a */
    public void mo24447a(long j10) throws NoSuchAlgorithmException, KeyManagementException, ProxyCacheException {
        try {
            HttpURLConnection httpURLConnectionM24453g = m24453g(j10, -1);
            this.f26656f = httpURLConnectionM24453g;
            String contentType = httpURLConnectionM24453g.getContentType();
            this.f26657g = new BufferedInputStream(this.f26656f.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.f26656f;
            C11049p c11049p = new C11049p(this.f26655e.f26675a, m24454h(httpURLConnection, j10, httpURLConnection.getResponseCode()), contentType);
            this.f26655e = c11049p;
            this.f26651a.mo25367a(c11049p.f26675a, c11049p);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error opening connection for " + this.f26655e.f26675a + " with offset " + j10, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24448b() throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 0
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 0
            java.net.HttpURLConnection r0 = r7.m24453g(r0, r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L35
            long r1 = r7.m24449c(r0)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r4 = r0.getContentType()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            s1.p r5 = new s1.p     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            s1.p r6 = r7.f26655e     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r6 = r6.f26675a     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r5.<init>(r6, r1, r4)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r7.f26655e = r5     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            v1.c r1 = r7.f26651a     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r2 = r5.f26675a     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r1.mo25367a(r2, r5)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            p329s1.AbstractC11047n.m24485c(r3)
            r0.disconnect()
            return
        L2e:
            r1 = move-exception
            goto L58
        L30:
            r1 = move-exception
            goto L37
        L32:
            r1 = move-exception
            r0 = r3
            goto L58
        L35:
            r1 = move-exception
            r0 = r3
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "Error fetching info from "
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            s1.p r4 = r7.f26655e     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.f26675a     // Catch: java.lang.Throwable -> L2e
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L2e
            p329s1.AbstractC11039f.m24402b(r2, r1)     // Catch: java.lang.Throwable -> L2e
            p329s1.AbstractC11047n.m24485c(r3)
            if (r0 == 0) goto L57
            r0.disconnect()
        L57:
            return
        L58:
            p329s1.AbstractC11047n.m24485c(r3)
            if (r0 == 0) goto L60
            r0.disconnect()
        L60:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p329s1.C11042i.m24448b():void");
    }

    /* renamed from: c */
    public final long m24449c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // p329s1.InterfaceC11048o
    public void close() {
        HttpURLConnection httpURLConnection = this.f26656f;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e10) {
                AbstractC11039f.m24402b("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me https://github.com/danikula or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e12) {
                e = e12;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me https://github.com/danikula or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    /* renamed from: d */
    public synchronized String m24450d() {
        try {
            if (TextUtils.isEmpty(this.f26655e.f26677c)) {
                m24448b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26655e.f26677c;
    }

    /* renamed from: e */
    public String m24451e() {
        return this.f26655e.f26675a;
    }

    /* renamed from: f */
    public final void m24452f(HttpURLConnection httpURLConnection, String str) {
        Map mapAddHeaders = this.f26652b.addHeaders(str);
        if (mapAddHeaders == null) {
            return;
        }
        AbstractC11039f.m24401a("****** injectCustomHeaders ****** :" + mapAddHeaders.size());
        for (Map.Entry entry : mapAddHeaders.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: g */
    public final HttpURLConnection m24453g(long j10, int i10) throws NoSuchAlgorithmException, IOException, KeyManagementException, ProxyCacheException {
        HttpURLConnection httpURLConnection;
        boolean z10;
        String headerField = this.f26655e.f26675a;
        int i11 = 0;
        do {
            if (!headerField.startsWith("https") || this.f26653c == null || this.f26654d == null) {
                httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(this.f26653c);
                try {
                    SSLContext sSLContext = SSLContext.getInstance("SSL");
                    sSLContext.init(null, this.f26654d, new SecureRandom());
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLContext.getSocketFactory());
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(this.f26653c);
                } catch (KeyManagementException | NoSuchAlgorithmException e10) {
                    e10.printStackTrace();
                }
            }
            m24452f(httpURLConnection, headerField);
            if (j10 > 0) {
                if (j10 > SieveCacheKt.NodeLinkMask) {
                    String strValueOf = String.valueOf(j10);
                    httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + (strValueOf.contains(Consts.DOT) ? Long.valueOf(strValueOf.substring(0, strValueOf.indexOf(Consts.DOT))).longValue() : j10) + "-");
                } else {
                    httpURLConnection.setRequestProperty(HttpHeaders.RANGE, "bytes=" + ((int) j10) + "-");
                }
            }
            if (i10 > 0) {
                httpURLConnection.setConnectTimeout(i10);
                httpURLConnection.setReadTimeout(i10);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z10 = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z10) {
                headerField = httpURLConnection.getHeaderField("Location");
                i11++;
                httpURLConnection.disconnect();
            }
            if (i11 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i11);
            }
        } while (z10);
        return httpURLConnection;
    }

    /* renamed from: h */
    public final long m24454h(HttpURLConnection httpURLConnection, long j10, int i10) {
        long jM24449c = m24449c(httpURLConnection);
        return i10 == 200 ? jM24449c : i10 == 206 ? jM24449c + j10 : this.f26655e.f26676b;
    }

    @Override // p329s1.InterfaceC11048o
    public synchronized long length() {
        try {
            if (this.f26655e.f26676b == SieveCacheKt.NodeMetaAndPreviousMask) {
                m24448b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26655e.f26676b;
    }

    @Override // p329s1.InterfaceC11048o
    public int read(byte[] bArr) throws ProxyCacheException {
        InputStream inputStream = this.f26657g;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.f26655e.f26675a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e10) {
            throw new InterruptedProxyCacheException("Reading source " + this.f26655e.f26675a + " is interrupted", e10);
        } catch (IOException e11) {
            throw new ProxyCacheException("Error reading data from " + this.f26655e.f26675a, e11);
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f26655e + "}";
    }

    public C11042i(String str, InterfaceC11412c interfaceC11412c, HostnameVerifier hostnameVerifier, TrustManager[] trustManagerArr) {
        this(str, interfaceC11412c, new C11321a(), hostnameVerifier, trustManagerArr);
    }

    public C11042i(String str, InterfaceC11412c interfaceC11412c, InterfaceC11322b interfaceC11322b, HostnameVerifier hostnameVerifier, TrustManager[] trustManagerArr) {
        this.f26651a = (InterfaceC11412c) AbstractC11045l.m24467d(interfaceC11412c);
        this.f26652b = (InterfaceC11322b) AbstractC11045l.m24467d(interfaceC11322b);
        this.f26653c = hostnameVerifier;
        this.f26654d = trustManagerArr;
        C11049p c11049p = interfaceC11412c.get(str);
        this.f26655e = c11049p == null ? new C11049p(str, SieveCacheKt.NodeMetaAndPreviousMask, AbstractC11047n.m24489g(str)) : c11049p;
    }

    public C11042i(C11042i c11042i) {
        this.f26655e = c11042i.f26655e;
        this.f26651a = c11042i.f26651a;
        this.f26652b = c11042i.f26652b;
        this.f26654d = c11042i.f26654d;
        this.f26653c = c11042i.f26653c;
    }
}
