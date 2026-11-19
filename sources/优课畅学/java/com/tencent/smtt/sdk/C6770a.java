package com.tencent.smtt.sdk;

/* renamed from: com.tencent.smtt.sdk.a */
/* loaded from: classes4.dex */
public class C6770a {

    /* renamed from: a */
    public static int f6731a = 600;

    /* renamed from: b */
    private static int f6732b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r3 = r3.substring(r4 + 9).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r3.length() == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r3.contains("k") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r2 = java.lang.Integer.parseInt(r3.substring(0, r3.indexOf("k")).trim()) / 1024;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: IOException -> 0x005b, PHI: r3
      0x0069: PHI (r3v4 java.io.BufferedReader) = (r3v2 java.io.BufferedReader), (r3v5 java.io.BufferedReader) binds: [B:32:0x0067, B:38:0x0072] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {IOException -> 0x005b, blocks: (B:23:0x0057, B:33:0x0069), top: B:53:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005c -> B:40:0x0075). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5978a() throws java.io.IOException {
        /*
            java.lang.String r0 = "k"
            int r1 = com.tencent.smtt.sdk.C6770a.f6732b
            if (r1 <= 0) goto L7
            return r1
        L7:
            java.lang.String r1 = "/proc/meminfo"
            r2 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            r5 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
        L17:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r3 == 0) goto L57
            java.lang.String r4 = "MemTotal:"
            int r4 = r3.indexOf(r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            r5 = -1
            if (r5 == r4) goto L17
            int r4 = r4 + 9
            java.lang.String r3 = r3.substring(r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r3 == 0) goto L57
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r4 == 0) goto L57
            boolean r4 = r3.contains(r0)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            if (r4 == 0) goto L57
            int r0 = r3.indexOf(r0)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            java.lang.String r0 = r3.substring(r2, r0)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L54
            int r2 = r0 / 1024
            goto L57
        L51:
            r0 = move-exception
            r3 = r1
            goto L64
        L54:
            r0 = move-exception
            r3 = r1
            goto L6f
        L57:
            r1.close()     // Catch: java.io.IOException -> L5b
            goto L75
        L5b:
            r0 = move-exception
            r0.printStackTrace()
            goto L75
        L60:
            r0 = move-exception
            goto L64
        L62:
            r0 = move-exception
            goto L6f
        L64:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L75
        L69:
            r3.close()     // Catch: java.io.IOException -> L5b
            goto L75
        L6d:
            r0 = move-exception
            goto L78
        L6f:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L75
            goto L69
        L75:
            com.tencent.smtt.sdk.C6770a.f6732b = r2
            return r2
        L78:
            if (r3 == 0) goto L82
            r3.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r1 = move-exception
            r1.printStackTrace()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C6770a.m5978a():int");
    }
}
