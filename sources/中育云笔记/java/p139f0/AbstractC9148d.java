package p139f0;

import anet.channel.request.Request;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: f0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9148d {

    /* renamed from: a */
    public static final Charset f21387a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f21388b = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: a */
    public static void m18043a(Closeable closeable) throws IOException {
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
    public static void m18044b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m18044b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
