package com.tendcloud.tenddata;

import android.os.SystemClock;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.tendcloud.tenddata.de */
/* loaded from: classes5.dex */
public final class C7927de {

    /* renamed from: a */
    private static final int f14685a = 600;

    /* renamed from: b */
    private int f14686b;

    /* renamed from: c */
    private byte[] f14687c;

    /* renamed from: d */
    private Map<String, List<String>> f14688d;

    private C7927de(int i10, String str) {
        this(i10, str.getBytes(), null);
    }

    /* renamed from: a */
    public static int m11680a() {
        return 600;
    }

    /* renamed from: b */
    public int m11686b() {
        return this.f14686b;
    }

    /* renamed from: c */
    public byte[] m11687c() {
        return this.f14687c;
    }

    /* renamed from: d */
    public Map<String, List<String>> m11688d() {
        return this.f14688d;
    }

    private C7927de(int i10, byte[] bArr, Map<String, List<String>> map) {
        this.f14686b = i10;
        this.f14687c = bArr;
        this.f14688d = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x002b A[EXC_TOP_SPLITTER, PHI: r6 r8
      0x002b: PHI (r6v1 com.tendcloud.tenddata.de) = (r6v0 com.tendcloud.tenddata.de), (r6v3 com.tendcloud.tenddata.de) binds: [B:17:0x0037, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r8v2 java.io.InputStream) = (r8v1 java.io.InputStream), (r8v3 java.io.InputStream) binds: [B:17:0x0037, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tendcloud.tenddata.C7927de m11683a(java.lang.String r9, java.net.HttpURLConnection r10, long r11, com.tendcloud.tenddata.C7924db r13) {
        /*
            r0 = 0
            int r3 = r10.getResponseCode()     // Catch: java.lang.Throwable -> L2f
            r1 = 400(0x190, float:5.6E-43)
            if (r3 <= r1) goto L11
            java.io.InputStream r1 = r10.getErrorStream()     // Catch: java.lang.Throwable -> Lf
        Ld:
            r8 = r1
            goto L16
        Lf:
            r8 = r0
            goto L32
        L11:
            java.io.InputStream r1 = r10.getInputStream()     // Catch: java.lang.Throwable -> Lf
            goto Ld
        L16:
            java.util.Map r1 = r10.getHeaderFields()     // Catch: java.lang.Throwable -> L32
            int r2 = r10.getContentLength()     // Catch: java.lang.Throwable -> L32
            com.tendcloud.tenddata.de r6 = m11681a(r3, r2, r8, r1)     // Catch: java.lang.Throwable -> L32
            r1 = r9
            r2 = r10
            r4 = r11
            r7 = r13
            m11685a(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L3a
        L2b:
            r8.close()     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L2f:
            r3 = 600(0x258, float:8.41E-43)
            goto Lf
        L32:
            com.tendcloud.tenddata.de r6 = new com.tendcloud.tenddata.de     // Catch: java.lang.Throwable -> L3b
            r6.<init>(r3, r0, r0)     // Catch: java.lang.Throwable -> L3b
            if (r8 == 0) goto L3a
            goto L2b
        L3a:
            return r6
        L3b:
            r0 = move-exception
            r9 = r0
            if (r8 == 0) goto L42
            r8.close()     // Catch: java.lang.Throwable -> L42
        L42:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.C7927de.m11683a(java.lang.String, java.net.HttpURLConnection, long, com.tendcloud.tenddata.db):com.tendcloud.tenddata.de");
    }

    /* renamed from: a */
    public static C7927de m11682a(String str) {
        return new C7927de(600, str);
    }

    /* renamed from: a */
    private static C7927de m11681a(int i10, int i11, InputStream inputStream, Map<String, List<String>> map) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = i11 != -1 ? new ByteArrayOutputStream(i11) : new ByteArrayOutputStream();
            while (true) {
                int i12 = inputStream.read();
                if (i12 != -1) {
                    byteArrayOutputStream.write(i12);
                } else {
                    inputStream.close();
                    return new C7927de(i10, byteArrayOutputStream.toByteArray(), map);
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m11685a(String str, HttpURLConnection httpURLConnection, int i10, long j10, C7927de c7927de, C7924db c7924db) {
        boolean z10;
        if (httpURLConnection != null) {
            try {
                if (httpURLConnection.getRequestMethod().equalsIgnoreCase("POST")) {
                    TreeMap treeMap = new TreeMap();
                    URL url = httpURLConnection.getURL();
                    treeMap.put("targetUrl", url.toString());
                    try {
                        treeMap.put("targetIP", InetAddress.getByName(url.getHost()).getHostAddress());
                    } catch (Throwable unused) {
                        treeMap.put("targetIP", "0.0.0.0");
                    }
                    if (i10 == 200) {
                        if (c7924db != null && c7924db.m11675a() != null) {
                            treeMap.put("reqSize", Integer.valueOf(c7924db.m11675a().length));
                        }
                        treeMap.put("respTime", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                        z10 = true;
                    } else {
                        treeMap.put("errorMsg", m11684a(c7927de));
                        treeMap.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, Integer.valueOf(i10));
                        z10 = false;
                    }
                    C7953ed.m11857a(str, z10, treeMap);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private static String m11684a(C7927de c7927de) {
        if (c7927de != null && c7927de.m11687c() != null) {
            try {
                byte[] bArrM11687c = c7927de.m11687c();
                if (bArrM11687c.length > 104857600) {
                    return "Input stream more than 100 MB size limit";
                }
                return new String(bArrM11687c);
            } catch (Throwable unused) {
            }
        }
        return "";
    }
}
