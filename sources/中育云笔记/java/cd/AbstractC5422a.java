package cd;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: cd.a */
/* loaded from: classes6.dex */
public abstract class AbstractC5422a {
    /* renamed from: a */
    public static final long m2900a(InputStream inputStream, OutputStream out, int i10) throws IOException {
        AbstractC9979u.m20294g(inputStream, "<this>");
        AbstractC9979u.m20294g(out, "out");
        byte[] bArr = new byte[i10];
        int i11 = inputStream.read(bArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(bArr, 0, i11);
            j10 += i11;
            i11 = inputStream.read(bArr);
        }
        return j10;
    }

    /* renamed from: b */
    public static /* synthetic */ long m2901b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m2900a(inputStream, outputStream, i10);
    }
}
