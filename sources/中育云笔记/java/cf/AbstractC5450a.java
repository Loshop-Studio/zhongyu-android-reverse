package cf;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: cf.a */
/* loaded from: classes6.dex */
public abstract class AbstractC5450a {
    /* renamed from: a */
    public static int m2973a(InputStream inputStream, OutputStream outputStream) throws IOException {
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
    public static void m2974b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
