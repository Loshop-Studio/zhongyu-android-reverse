package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
class ExifInterfaceUtils {
    private static final String TAG = "ExifInterfaceUtils";

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void setDataSource(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    private ExifInterfaceUtils() {
    }

    public static String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b7)));
        }
        return sb.toString();
    }

    public static void closeFileDescriptor(FileDescriptor fileDescriptor) throws ErrnoException {
        try {
            Os.close(fileDescriptor);
        } catch (ErrnoException e6) {
            Log.e(TAG, "Error closing fd.", e6);
        }
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static long[] convertToLongArray(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = iArr[i6];
        }
        return jArr;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i6 = 0;
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 == -1) {
                return i6;
            }
            i6 += i7;
            outputStream.write(bArr, 0, i7);
        }
    }

    public static long parseSubSeconds(String str) throws NumberFormatException {
        try {
            int iMin = Math.min(str.length(), 3);
            long j6 = Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j6 *= 10;
                iMin++;
            }
            return j6;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i6 = 0; i6 < bArr2.length; i6++) {
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
        }
        return true;
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i6) throws IOException {
        byte[] bArr = new byte[8192];
        while (i6 > 0) {
            int iMin = Math.min(i6, 8192);
            int i7 = inputStream.read(bArr, 0, iMin);
            if (i7 == iMin) {
                i6 -= i7;
                outputStream.write(bArr, 0, i7);
            } else {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
        }
    }
}
