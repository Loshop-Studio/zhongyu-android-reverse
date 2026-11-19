package p314z6;

/* renamed from: z6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC10006d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String m17370a(android.net.Uri r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            android.app.Application r1 = com.blankj.utilcode.util.Utils.getApp()     // Catch: java.lang.Throwable -> L4e java.io.FileNotFoundException -> L53
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L4e java.io.FileNotFoundException -> L53
            java.io.InputStream r7 = r1.openInputStream(r7)     // Catch: java.lang.Throwable -> L4e java.io.FileNotFoundException -> L53
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            android.app.Application r2 = com.blankj.utilcode.util.Utils.getApp()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            r5.<init>()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            r5.append(r3)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            java.lang.String r3 = ".jpg"
            r5.append(r3)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            com.blankj.utilcode.util.FileIOUtils.writeFileFromIS(r2, r7)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L4c
            if (r7 == 0) goto L49
            r7.close()     // Catch: java.io.IOException -> L45
            return r0
        L45:
            r7 = move-exception
            r7.printStackTrace()
        L49:
            return r0
        L4a:
            r0 = move-exception
            goto L63
        L4c:
            r1 = move-exception
            goto L55
        L4e:
            r7 = move-exception
            r6 = r0
            r0 = r7
            r7 = r6
            goto L63
        L53:
            r1 = move-exception
            r7 = r0
        L55:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L62
            r7.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r7 = move-exception
            r7.printStackTrace()
        L62:
            return r0
        L63:
            if (r7 == 0) goto L6d
            r7.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r7 = move-exception
            r7.printStackTrace()
        L6d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p314z6.AbstractC10006d.m17370a(android.net.Uri):java.lang.String");
    }
}
