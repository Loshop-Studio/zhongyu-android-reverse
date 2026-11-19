package p101f0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: f0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7908d {

    /* renamed from: a */
    public static final Charset f13319a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f13320b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m12433a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m12434b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m12434b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
