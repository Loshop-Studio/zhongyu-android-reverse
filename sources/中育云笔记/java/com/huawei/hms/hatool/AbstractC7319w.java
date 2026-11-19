package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;
import p318r5.AbstractC10861f1;
import p318r5.AbstractC10863g0;
import p318r5.C10884n0;

/* renamed from: com.huawei.hms.hatool.w */
/* loaded from: classes5.dex */
public abstract class AbstractC7319w {

    /* renamed from: com.huawei.hms.hatool.w$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static HttpURLConnection m8650a(String str, int i10, Map map, String str2) throws ProtocolException, a {
        if (TextUtils.isEmpty(str)) {
            AbstractC10861f1.m23433e("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        m8653d(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i10));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    httpURLConnection.setRequestProperty(str3, (String) entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    /* renamed from: b */
    public static C10884n0 m8651b(String str, byte[] bArr, Map map) {
        return m8652c(str, bArr, map, "POST");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0151  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.io.BufferedOutputStream, java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p318r5.C10884n0 m8652c(java.lang.String r6, byte[] r7, java.util.Map r8, java.lang.String r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.AbstractC7319w.m8652c(java.lang.String, byte[], java.util.Map, java.lang.String):r5.n0");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m8653d(java.net.HttpURLConnection r2) throws com.huawei.hms.hatool.AbstractC7319w.a {
        /*
            java.lang.String r0 = "hmsSdk"
            boolean r1 = r2 instanceof javax.net.ssl.HttpsURLConnection
            if (r1 == 0) goto L3a
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2
            android.content.Context r1 = p318r5.AbstractC10900v0.m23682q()     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L17 java.security.GeneralSecurityException -> L1a java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L20
            b6.b r0 = p032b6.C5168b.m2682b(r1)     // Catch: java.lang.IllegalAccessException -> L11 java.io.IOException -> L17 java.security.GeneralSecurityException -> L1a java.security.KeyStoreException -> L1d java.security.NoSuchAlgorithmException -> L20
            goto L24
        L11:
            java.lang.String r1 = "getSocketFactory(): Illegal Access Exception "
        L13:
            p318r5.AbstractC10861f1.m23441m(r0, r1)
            goto L23
        L17:
            java.lang.String r1 = "getSocketFactory(): IO Exception!"
            goto L13
        L1a:
            java.lang.String r1 = "getSocketFactory(): General Security Exception"
            goto L13
        L1d:
            java.lang.String r1 = "getSocketFactory(): Key Store exception"
            goto L13
        L20:
            java.lang.String r1 = "getSocketFactory(): Algorithm Exception!"
            goto L13
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L32
            r2.setSSLSocketFactory(r0)
            c6.a r0 = new c6.a
            r0.<init>()
            r2.setHostnameVerifier(r0)
            return
        L32:
            com.huawei.hms.hatool.w$a r2 = new com.huawei.hms.hatool.w$a
            java.lang.String r0 = "No ssl socket factory set"
            r2.<init>(r0)
            throw r2
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.AbstractC7319w.m8653d(java.net.HttpURLConnection):void");
    }

    /* renamed from: e */
    public static String m8654e(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                return AbstractC10863g0.m23449b(inputStream);
            } catch (IOException unused) {
                AbstractC10861f1.m23441m("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
                AbstractC10863g0.m23450c(inputStream);
                return "";
            }
        } finally {
            AbstractC10863g0.m23450c(inputStream);
        }
    }
}
