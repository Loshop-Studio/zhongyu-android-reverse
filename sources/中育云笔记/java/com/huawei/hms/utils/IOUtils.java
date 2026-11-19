package com.huawei.hms.utils;

import com.huawei.hms.support.log.HMSLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class IOUtils {
    public static void closeQuietly(Reader reader) throws IOException {
        closeQuietly((Closeable) reader);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) {
        return copy(inputStream, outputStream, new byte[4096]);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static InputStream toInputStream(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public static void closeQuietly(Writer writer) throws IOException {
        closeQuietly((Closeable) writer);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        long j10 = 0;
        if (inputStream != null && outputStream != null) {
            if (bArr == null) {
                bArr = new byte[4096];
            }
            while (true) {
                int i10 = inputStream.read(bArr);
                if (-1 == i10) {
                    break;
                }
                outputStream.write(bArr, 0, i10);
                j10 += i10;
            }
        }
        return j10;
    }

    public static void closeQuietly(InputStream inputStream) throws IOException {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(OutputStream outputStream) throws IOException {
        closeQuietly((Closeable) outputStream);
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                HMSLog.m8725e("IOUtils", "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }
}
