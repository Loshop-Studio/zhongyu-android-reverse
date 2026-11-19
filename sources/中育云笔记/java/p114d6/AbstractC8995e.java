package p114d6;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: d6.e */
/* loaded from: classes5.dex */
public abstract class AbstractC8995e {
    /* renamed from: a */
    public static void m17557a(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                AbstractC8996f.m17563d("IOUtil", "closeSecure IOException");
            }
        }
    }

    /* renamed from: b */
    public static void m17558b(InputStream inputStream) throws IOException {
        m17557a(inputStream);
    }

    /* renamed from: c */
    public static void m17559c(OutputStream outputStream) throws IOException {
        m17557a(outputStream);
    }
}
