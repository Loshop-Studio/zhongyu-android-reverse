package p077e5;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: e5.j */
/* loaded from: classes4.dex */
public final class C7349j {

    /* renamed from: a */
    public static final C7349j f11917a = new C7349j();

    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11763a(java.io.File r9, java.io.File r10) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "dest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: p077e5.C7349j.m11763a(java.io.File, java.io.File):void");
    }

    /* renamed from: b */
    public final String m11764b(Bitmap bitmap, String filePath, boolean z9) throws IOException {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
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
            if (StringsKt.endsWith$default(filePath, "png", false, 2, (Object) null)) {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            } else {
                bitmap.compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream);
            }
            fileOutputStream.close();
            if (z9) {
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
}
