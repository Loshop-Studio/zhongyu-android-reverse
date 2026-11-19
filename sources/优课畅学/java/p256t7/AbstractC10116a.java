package p256t7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: t7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10116a {
    /* renamed from: a */
    public static final long m18859a(InputStream inputStream, OutputStream out, int i10) throws IOException {
        AbstractC9133u.m16133g(inputStream, "<this>");
        AbstractC9133u.m16133g(out, "out");
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
    public static /* synthetic */ long m18860b(InputStream inputStream, OutputStream outputStream, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m18859a(inputStream, outputStream, i10);
    }
}
