package p316z8;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: z8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10014a {
    /* renamed from: a */
    public static int m17385a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i9 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return i9;
            }
            outputStream.write(bArr, 0, i10);
            i9 += i10;
        }
    }

    /* renamed from: b */
    public static void m17386b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
