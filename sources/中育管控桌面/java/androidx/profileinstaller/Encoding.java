package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.UByte;

/* loaded from: classes3.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    public static int bitsToBytes(int i6) {
        return ((i6 + 7) & (-8)) / 8;
    }

    public static byte[] compress(@NonNull byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    @NonNull
    public static RuntimeException error(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    public static byte[] read(@NonNull InputStream inputStream, int i6) throws IOException {
        byte[] bArr = new byte[i6];
        int i7 = 0;
        while (i7 < i6) {
            int i8 = inputStream.read(bArr, i7, i6 - i7);
            if (i8 < 0) {
                throw error("Not enough bytes to read: " + i6);
            }
            i7 += i8;
        }
        return bArr;
    }

    @NonNull
    public static byte[] readCompressed(@NonNull InputStream inputStream, int i6, int i7) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i7];
            byte[] bArr2 = new byte[2048];
            int i8 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i8 < i6) {
                int i9 = inputStream.read(bArr2);
                if (i9 < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i6 + " bytes");
                }
                inflater.setInput(bArr2, 0, i9);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i7 - iInflate);
                    i8 += i9;
                } catch (DataFormatException e6) {
                    throw error(e6.getMessage());
                }
            }
            if (i8 == i6) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw error("Inflater did not finish");
            }
            throw error("Didn't read enough bytes during decompression. expected=" + i6 + " actual=" + i8);
        } finally {
            inflater.end();
        }
    }

    @NonNull
    public static String readString(InputStream inputStream, int i6) {
        return new String(read(inputStream, i6), StandardCharsets.UTF_8);
    }

    public static long readUInt(@NonNull InputStream inputStream, int i6) throws IOException {
        byte[] bArr = read(inputStream, i6);
        long j6 = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            j6 += (bArr[i7] & UByte.MAX_VALUE) << (i7 * 8);
        }
        return j6;
    }

    public static int readUInt16(@NonNull InputStream inputStream) {
        return (int) readUInt(inputStream, 2);
    }

    public static long readUInt32(@NonNull InputStream inputStream) {
        return readUInt(inputStream, 4);
    }

    public static int readUInt8(@NonNull InputStream inputStream) {
        return (int) readUInt(inputStream, 1);
    }

    public static int utf8Length(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void writeAll(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, @Nullable FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i6 = inputStream.read(bArr);
            if (i6 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i6);
            }
        }
    }

    public static void writeCompressed(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        writeUInt32(outputStream, bArr.length);
        byte[] bArrCompress = compress(bArr);
        writeUInt32(outputStream, bArrCompress.length);
        outputStream.write(bArrCompress);
    }

    public static void writeString(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void writeUInt(@NonNull OutputStream outputStream, long j6, int i6) throws IOException {
        byte[] bArr = new byte[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            bArr[i7] = (byte) ((j6 >> (i7 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void writeUInt16(@NonNull OutputStream outputStream, int i6) throws IOException {
        writeUInt(outputStream, i6, 2);
    }

    public static void writeUInt32(@NonNull OutputStream outputStream, long j6) throws IOException {
        writeUInt(outputStream, j6, 4);
    }

    public static void writeUInt8(@NonNull OutputStream outputStream, int i6) throws IOException {
        writeUInt(outputStream, i6, 1);
    }
}
