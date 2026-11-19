package p122n0;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: n0.c */
/* loaded from: classes.dex */
final class C2880c {

    /* renamed from: n0.c$a */
    static class a {

        /* renamed from: a */
        long f11297a;

        /* renamed from: b */
        long f11298b;

        a() {
        }
    }

    /* renamed from: a */
    static long m9916a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j4 = aVar.f11298b;
        randomAccessFile.seek(aVar.f11297a);
        byte[] bArr = new byte[16384];
        int i4 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j4));
        while (i4 != -1) {
            crc32.update(bArr, 0, i4);
            j4 -= i4;
            if (j4 == 0) {
                break;
            }
            i4 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j4));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    static a m9917b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j4 = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
        long j5 = j4 >= 0 ? j4 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f11298b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f11297a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j5);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* renamed from: c */
    static long m9918c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m9916a(randomAccessFile, m9917b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
