package p204p9;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: p9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8864a {
    /* renamed from: a */
    public static int m14865a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return i10;
            }
            outputStream.write(bArr, 0, i11);
            i10 += i11;
        }
    }

    /* renamed from: b */
    public static void m14866b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
