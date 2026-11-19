package p039d0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: d0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6214d {

    /* renamed from: a */
    public static final Charset f7501a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f7502b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m6317a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m6318b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m6318b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
