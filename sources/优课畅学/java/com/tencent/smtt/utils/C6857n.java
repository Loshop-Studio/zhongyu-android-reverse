package com.tencent.smtt.utils;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.tencent.smtt.utils.n */
/* loaded from: classes4.dex */
public class C6857n {

    /* renamed from: com.tencent.smtt.utils.n$a */
    public interface a {
        /* renamed from: a */
        void mo6060a(int i10);
    }

    /* renamed from: a */
    public static String m6331a(String str, Map<String, String> map, byte[] bArr, a aVar, boolean z10) throws Throwable {
        HttpURLConnection httpURLConnectionM6334a;
        if (bArr == null || (httpURLConnectionM6334a = m6334a(str, map)) == null) {
            return null;
        }
        if (z10) {
            m6336a(httpURLConnectionM6334a, bArr);
        } else {
            m6337b(httpURLConnectionM6334a, bArr);
        }
        return m6333a(httpURLConnectionM6334a, aVar, false);
    }

    /* renamed from: b */
    private static void m6337b(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m6332a(String str, byte[] bArr, a aVar, boolean z10) throws IOException {
        try {
            String str2 = str + (z10 ? C6860q.m6346a().m6351c() : C6859p.m6339a().m6344b());
            try {
                bArr = z10 ? C6860q.m6346a().m6349a(bArr) : C6859p.m6339a().m6343a(bArr);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (bArr == null) {
                return null;
            }
            HashMap map = new HashMap();
            map.put(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            map.put(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
            HttpURLConnection httpURLConnectionM6334a = m6334a(str2, map);
            if (httpURLConnectionM6334a == null) {
                return null;
            }
            m6337b(httpURLConnectionM6334a, bArr);
            return m6333a(httpURLConnectionM6334a, aVar, z10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: all -> 0x0058, LOOP:0: B:24:0x004c->B:26:0x0053, LOOP_END, TryCatch #1 {all -> 0x0058, blocks: (B:23:0x004a, B:24:0x004c, B:26:0x0053, B:30:0x0060, B:32:0x006d), top: B:47:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: all -> 0x0058, TryCatch #1 {all -> 0x0058, blocks: (B:23:0x004a, B:24:0x004c, B:26:0x0053, B:30:0x0060, B:32:0x006d), top: B:47:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #1 {all -> 0x0058, blocks: (B:23:0x004a, B:24:0x004c, B:26:0x0053, B:30:0x0060, B:32:0x006d), top: B:47:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005e A[EDGE_INSN: B:51:0x005e->B:29:0x005e BREAK  A[LOOP:0: B:24:0x004c->B:26:0x0053], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m6333a(java.net.HttpURLConnection r5, com.tencent.smtt.utils.C6857n.a r6, boolean r7) throws java.io.IOException {
        /*
            r0 = 0
            int r1 = r5.getResponseCode()     // Catch: java.lang.Throwable -> Lb
            if (r6 == 0) goto L10
            r6.mo6060a(r1)     // Catch: java.lang.Throwable -> Lb
            goto L10
        Lb:
            r5 = move-exception
            r6 = r0
            r7 = r6
            goto L8c
        L10:
            r6 = 200(0xc8, float:2.8E-43)
            if (r1 != r6) goto L83
            java.io.InputStream r6 = r5.getInputStream()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r5 = r5.getContentEncoding()     // Catch: java.lang.Throwable -> Lb
            if (r5 == 0) goto L2d
            java.lang.String r1 = "gzip"
            boolean r1 = r5.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L2d
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> Lb
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lb
        L2b:
            r6 = r5
            goto L43
        L2d:
            if (r5 == 0) goto L43
            java.lang.String r1 = "deflate"
            boolean r5 = r5.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> Lb
            if (r5 == 0) goto L43
            java.util.zip.InflaterInputStream r5 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> Lb
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> Lb
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> Lb
            goto L2b
        L43:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7f
            r5.<init>()     // Catch: java.lang.Throwable -> L7f
            r1 = 128(0x80, float:1.8E-43)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L58
        L4c:
            int r2 = r6.read(r1)     // Catch: java.lang.Throwable -> L58
            r3 = -1
            if (r2 == r3) goto L5e
            r3 = 0
            r5.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L58
            goto L4c
        L58:
            r7 = move-exception
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L8c
        L5e:
            if (r7 == 0) goto L6d
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L58
            byte[] r1 = r5.toByteArray()     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "utf-8"
            r7.<init>(r1, r2)     // Catch: java.lang.Throwable -> L58
        L6b:
            r0 = r6
            goto L85
        L6d:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L58
            com.tencent.smtt.utils.p r1 = com.tencent.smtt.utils.C6859p.m6339a()     // Catch: java.lang.Throwable -> L58
            byte[] r2 = r5.toByteArray()     // Catch: java.lang.Throwable -> L58
            byte[] r1 = r1.m6345c(r2)     // Catch: java.lang.Throwable -> L58
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L58
            goto L6b
        L7f:
            r5 = move-exception
            r7 = r6
            r6 = r0
            goto L8c
        L83:
            r5 = r0
            r7 = r5
        L85:
            m6335a(r0)
            m6335a(r5)
            return r7
        L8c:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L96
            m6335a(r7)
            m6335a(r6)
            return r0
        L96:
            r5 = move-exception
            m6335a(r7)
            m6335a(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C6857n.m6333a(java.net.HttpURLConnection, com.tencent.smtt.utils.n$a, boolean):java.lang.String");
    }

    /* renamed from: a */
    private static HttpURLConnection m6334a(String str, Map<String, String> map) throws ProtocolException {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e10) {
            e = e10;
        }
        try {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
            httpURLConnection.setRequestProperty("Connection", "close");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            return httpURLConnection;
        } catch (Exception e11) {
            e = e11;
            httpURLConnection2 = httpURLConnection;
            e.printStackTrace();
            return httpURLConnection2;
        }
    }

    /* renamed from: a */
    private static void m6335a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m6336a(HttpURLConnection httpURLConnection, byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        try {
            gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream(), 204800));
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.flush();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                    m6335a(null);
                    m6335a(gZIPOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                m6335a(null);
                m6335a(gZIPOutputStream);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
            m6335a(null);
            m6335a(gZIPOutputStream);
            throw th;
        }
        m6335a(null);
        m6335a(gZIPOutputStream);
    }
}
