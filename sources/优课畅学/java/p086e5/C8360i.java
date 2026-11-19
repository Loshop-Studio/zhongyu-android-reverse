package p086e5;

import android.content.Context;
import android.os.Environment;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.math.BigDecimal;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: e5.i */
/* loaded from: classes5.dex */
public final class C8360i {

    /* renamed from: a */
    public static final C8360i f15886a = new C8360i();

    /* renamed from: a */
    public final void m13632a(Context context) {
        AbstractC9133u.m16133g(context, "context");
        m13633b(context.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            m13633b(context.getExternalCacheDir());
        }
    }

    /* renamed from: b */
    public final boolean m13633b(File file) {
        if (file != null && file.isDirectory()) {
            for (String str : file.list()) {
                if (!m13633b(new File(file, str))) {
                    return false;
                }
            }
        }
        if (file != null) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m13634c(String str) {
        if (str != null) {
            return new File(str).exists();
        }
        return false;
    }

    /* renamed from: d */
    public final long m13635d(File file) {
        long length;
        AbstractC9133u.m16133g(file, "file");
        long j10 = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            int length2 = fileArrListFiles.length;
            for (int i10 = 0; i10 < length2; i10++) {
                if (fileArrListFiles[i10].isDirectory()) {
                    File file2 = fileArrListFiles[i10];
                    AbstractC9133u.m16132f(file2, "get(...)");
                    length = m13635d(file2);
                } else {
                    length = fileArrListFiles[i10].length();
                }
                j10 += length;
            }
            return j10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return j10;
        }
    }

    /* renamed from: e */
    public final String m13636e(long j10) {
        long j11 = 1024;
        long j12 = j10 / j11;
        long j13 = j12 / j11;
        if (j13 < 1) {
            return new BigDecimal(j12).setScale(2, 4).toPlainString() + "K";
        }
        long j14 = j13 / j11;
        if (j14 < 1) {
            return new BigDecimal(j13).setScale(2, 4).toPlainString() + "M";
        }
        long j15 = j14 / j11;
        if (j15 < 1) {
            return new BigDecimal(j14).setScale(2, 4).toPlainString() + "G";
        }
        return new BigDecimal(j15).setScale(2, 4).toPlainString() + ExifInterface.GPS_DIRECTION_TRUE;
    }

    /* renamed from: f */
    public final String m13637f(Context context) {
        File externalCacheDir;
        AbstractC9133u.m16133g(context, "context");
        File cacheDir = context.getCacheDir();
        AbstractC9133u.m16132f(cacheDir, "getCacheDir(...)");
        long jM13635d = m13635d(cacheDir);
        if (Environment.getExternalStorageState().equals("mounted") && (externalCacheDir = context.getExternalCacheDir()) != null) {
            jM13635d += f15886a.m13635d(externalCacheDir);
        }
        return m13636e(jM13635d);
    }
}
