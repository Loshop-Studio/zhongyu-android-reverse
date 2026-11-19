package p018b0;

import java.io.IOException;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: b0.e */
/* loaded from: classes3.dex */
public abstract class AbstractC5088e {
    /* renamed from: a */
    public static final long m2130a(BufferedSource bufferedSource, ByteString byteString, long j9, long j10) throws IOException {
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        byte b10 = byteString.getByte(0);
        long size = j10 - byteString.size();
        long j11 = j9;
        while (j11 < size) {
            BufferedSource bufferedSource2 = bufferedSource;
            long jIndexOf = bufferedSource2.indexOf(b10, j11, size);
            if (jIndexOf == -1 || bufferedSource2.rangeEquals(jIndexOf, byteString)) {
                return jIndexOf;
            }
            j11 = jIndexOf + 1;
            bufferedSource = bufferedSource2;
        }
        return -1L;
    }
}
