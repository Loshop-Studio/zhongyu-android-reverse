package p066h;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: h.d */
/* loaded from: classes2.dex */
public abstract class AbstractC3761d {

    /* renamed from: a */
    public static final Charset f4445a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f4446b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m4848a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m4849b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m4849b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
