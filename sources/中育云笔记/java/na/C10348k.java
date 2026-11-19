package na;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

/* renamed from: na.k */
/* loaded from: classes5.dex */
public final class C10348k {

    /* renamed from: a */
    public static final C10348k f24655a = new C10348k();

    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21645a(java.io.File r9, java.io.File r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r9, r0)
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r10, r0)
            boolean r0 = r10.exists()
            if (r0 == 0) goto L14
            r10.delete()
            goto L1b
        L14:
            java.io.File r0 = r10.getParentFile()
            r0.mkdirs()
        L1b:
            r10.createNewFile()
            r1 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            java.nio.channels.FileChannel r3 = r0.getChannel()     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4d
            long r6 = r3.size()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r4 = 0
            r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L45
            r3.close()
            r2.close()
            return
        L41:
            r0 = move-exception
            r9 = r0
        L43:
            r1 = r3
            goto L68
        L45:
            r0 = move-exception
            r9 = r0
        L47:
            r1 = r3
            goto L58
        L49:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L43
        L4d:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L47
        L51:
            r0 = move-exception
            r9 = r0
            r2 = r1
            goto L68
        L55:
            r0 = move-exception
            r9 = r0
            r2 = r1
        L58:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L60
            r1.close()
        L60:
            if (r2 == 0) goto L65
            r2.close()
        L65:
            return
        L66:
            r0 = move-exception
            r9 = r0
        L68:
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            if (r2 == 0) goto L72
            r2.close()
        L72:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: na.C10348k.m21645a(java.io.File, java.io.File):void");
    }

    /* renamed from: b */
    public final String m21646b(Bitmap bitmap, String filePath, boolean z10) throws IOException {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(filePath, "filePath");
        File file = new File(filePath);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (AbstractC10819z.m23229B(filePath, "png", false, 2, null)) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
            }
            fileOutputStream.close();
            if (z10) {
                bitmap.recycle();
            }
            return filePath;
        } catch (Exception e10) {
            e10.printStackTrace();
            if (!file.exists()) {
                return "";
            }
            file.delete();
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[Catch: IOException -> 0x006f, TRY_LEAVE, TryCatch #4 {IOException -> 0x006f, blocks: (B:35:0x006b, B:39:0x0073), top: B:47:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File m21647c(java.lang.String r5, java.lang.String r6, com.google.protobuf.MessageLite r7) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r5, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r6, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r7, r0)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.<init>(r2, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            boolean r5 = r1.exists()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r5 != 0) goto L30
            java.io.File r5 = r1.getParentFile()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r5.mkdirs()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.createNewFile()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            goto L36
        L2b:
            r5 = move-exception
            goto L69
        L2d:
            r5 = move-exception
            r6 = r0
            goto L52
        L30:
            r1.delete()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1.createNewFile()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
        L36:
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r7.writeTo(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            r5.flush()     // Catch: java.io.IOException -> L45
            r5.close()     // Catch: java.io.IOException -> L45
            return r1
        L45:
            r5 = move-exception
            r5.printStackTrace()
            return r1
        L4a:
            r6 = move-exception
            r0 = r5
            r5 = r6
            goto L69
        L4e:
            r6 = move-exception
            r3 = r6
            r6 = r5
            r5 = r3
        L52:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L5d
            r6.flush()     // Catch: java.io.IOException -> L5b
            goto L5d
        L5b:
            r5 = move-exception
            goto L63
        L5d:
            if (r6 == 0) goto L66
            r6.close()     // Catch: java.io.IOException -> L5b
            goto L66
        L63:
            r5.printStackTrace()
        L66:
            return r0
        L67:
            r5 = move-exception
            r0 = r6
        L69:
            if (r0 == 0) goto L71
            r0.flush()     // Catch: java.io.IOException -> L6f
            goto L71
        L6f:
            r6 = move-exception
            goto L77
        L71:
            if (r0 == 0) goto L7a
            r0.close()     // Catch: java.io.IOException -> L6f
            goto L7a
        L77:
            r6.printStackTrace()
        L7a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: na.C10348k.m21647c(java.lang.String, java.lang.String, com.google.protobuf.MessageLite):java.io.File");
    }
}
