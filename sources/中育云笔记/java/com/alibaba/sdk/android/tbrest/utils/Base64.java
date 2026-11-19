package com.alibaba.sdk.android.tbrest.utils;

import androidx.collection.SieveCacheKt;
import androidx.core.view.MotionEventCompat;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okio.Utf8;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

/* loaded from: classes3.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    private static final byte EQUALS_SIGN_ENC = -1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    private static final byte NEW_LINE = 10;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "US-ASCII";
    public static final int URL_SAFE = 16;
    private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte EQUALS_SIGN = 61;
    private static final byte[] _STANDARD_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _URL_SAFE_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] _URL_SAFE_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _ORDERED_ALPHABET = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] _ORDERED_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, 62, Utf8.REPLACEMENT_BYTE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    public static class InputStream extends FilterInputStream {
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10;
            if (this.position < 0) {
                if (this.encode) {
                    byte[] bArr = new byte[3];
                    int i11 = 0;
                    for (int i12 = 0; i12 < 3; i12++) {
                        int i13 = ((FilterInputStream) this).in.read();
                        if (i13 < 0) {
                            break;
                        }
                        bArr[i12] = (byte) i13;
                        i11++;
                    }
                    if (i11 <= 0) {
                        return -1;
                    }
                    Base64.encode3to4(bArr, 0, i11, this.buffer, 0, this.options);
                    this.position = 0;
                    this.numSigBytes = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i14 = 0;
                    while (i14 < 4) {
                        do {
                            i10 = ((FilterInputStream) this).in.read();
                            if (i10 < 0) {
                                break;
                            }
                        } while (this.decodabet[i10 & 127] <= -5);
                        if (i10 < 0) {
                            break;
                        }
                        bArr2[i14] = (byte) i10;
                        i14++;
                    }
                    if (i14 != 4) {
                        if (i14 == 0) {
                            return -1;
                        }
                        throw new IOException("Improperly padded Base64 input.");
                    }
                    this.numSigBytes = Base64.decode4to3(bArr2, 0, this.buffer, 0, this.options);
                    this.position = 0;
                }
            }
            int i15 = this.position;
            if (i15 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            }
            if (i15 >= this.numSigBytes) {
                return -1;
            }
            if (this.encode && this.breakLines && this.lineLength >= 76) {
                this.lineLength = 0;
                return 10;
            }
            this.lineLength++;
            byte[] bArr3 = this.buffer;
            int i16 = i15 + 1;
            this.position = i16;
            byte b10 = bArr3[i15];
            if (i16 >= this.bufferLength) {
                this.position = -1;
            }
            return b10 & 255;
        }

        public InputStream(java.io.InputStream inputStream, int i10) {
            super(inputStream);
            this.options = i10;
            this.breakLines = (i10 & 8) > 0;
            boolean z10 = (i10 & 1) > 0;
            this.encode = z10;
            int i11 = z10 ? 4 : 3;
            this.bufferLength = i11;
            this.buffer = new byte[i11];
            this.position = -1;
            this.lineLength = 0;
            this.decodabet = Base64.getDecodabet(i10);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                int i13 = read();
                if (i13 >= 0) {
                    bArr[i10 + i12] = (byte) i13;
                    i12++;
                } else if (i12 == 0) {
                    return -1;
                }
            }
            return i12;
        }
    }

    public static class OutputStream extends FilterOutputStream {

        /* renamed from: b4 */
        private byte[] f4530b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            flushBase64();
            super.close();
            this.buffer = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() throws IOException {
            int i10 = this.position;
            if (i10 > 0) {
                if (!this.encode) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(Base64.encode3to4(this.f4530b4, this.buffer, i10, this.options));
                this.position = 0;
            }
        }

        public void resumeEncoding() {
            this.suspendEncoding = false;
        }

        public void suspendEncoding() throws IOException {
            flushBase64();
            this.suspendEncoding = true;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(i10);
                return;
            }
            if (!this.encode) {
                byte b10 = this.decodabet[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) i10;
                if (i12 >= this.bufferLength) {
                    ((FilterOutputStream) this).out.write(this.f4530b4, 0, Base64.decode4to3(bArr, 0, this.f4530b4, 0, this.options));
                    this.position = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.buffer;
            int i13 = this.position;
            int i14 = i13 + 1;
            this.position = i14;
            bArr2[i13] = (byte) i10;
            int i15 = this.bufferLength;
            if (i14 >= i15) {
                ((FilterOutputStream) this).out.write(Base64.encode3to4(this.f4530b4, bArr2, i15, this.options));
                int i16 = this.lineLength + 4;
                this.lineLength = i16;
                if (this.breakLines && i16 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.lineLength = 0;
                }
                this.position = 0;
            }
        }

        public OutputStream(java.io.OutputStream outputStream, int i10) {
            super(outputStream);
            this.breakLines = (i10 & 8) != 0;
            boolean z10 = (i10 & 1) != 0;
            this.encode = z10;
            int i11 = z10 ? 3 : 4;
            this.bufferLength = i11;
            this.buffer = new byte[i11];
            this.position = 0;
            this.lineLength = 0;
            this.suspendEncoding = false;
            this.f4530b4 = new byte[4];
            this.options = i10;
            this.decodabet = Base64.getDecodabet(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    private Base64() {
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (i10 < 0 || (i13 = i10 + 3) >= bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
        }
        if (i11 < 0 || (i14 = i11 + 2) >= bArr2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
        }
        byte[] decodabet = getDecodabet(i12);
        byte b10 = bArr[i10 + 2];
        if (b10 == 61) {
            bArr2[i11] = (byte) ((((decodabet[bArr[i10 + 1]] & 255) << 12) | ((decodabet[bArr[i10]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b11 = bArr[i13];
        if (b11 == 61) {
            int i15 = ((decodabet[bArr[i10 + 1]] & 255) << 12) | ((decodabet[bArr[i10]] & 255) << 18) | ((decodabet[b10] & 255) << 6);
            bArr2[i11] = (byte) (i15 >>> 16);
            bArr2[i11 + 1] = (byte) (i15 >>> 8);
            return 2;
        }
        int i16 = ((decodabet[bArr[i10 + 1]] & 255) << 12) | ((decodabet[bArr[i10]] & 255) << 18) | ((decodabet[b10] & 255) << 6) | (decodabet[b11] & 255);
        bArr2[i11] = (byte) (i16 >> 16);
        bArr2[i11 + 1] = (byte) (i16 >> 8);
        bArr2[i14] = (byte) i16;
        return 3;
    }

    public static void decodeFileToFile(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArrDecodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(bArrDecodeFromFile);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                bufferedOutputStream2 = bufferedOutputStream;
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
        }
    }

    public static byte[] decodeFromFile(String str) throws Throwable {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() > SieveCacheKt.NodeLinkMask) {
                    throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
                }
                byte[] bArr = new byte[(int) file.length()];
                InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 0);
                int i10 = 0;
                while (true) {
                    try {
                        int i11 = inputStream2.read(bArr, i10, 4096);
                        if (i11 < 0) {
                            break;
                        }
                        i10 += i11;
                    } catch (IOException e10) {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
                return bArr2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static void decodeToFile(String str, String str2) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = new OutputStream(new FileOutputStream(str2), 0);
            } catch (IOException e10) {
                throw e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            outputStream.write(str.getBytes(PREFERRED_ENCODING));
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        } catch (IOException e11) {
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            try {
                outputStream2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    public static Object decodeToObject(String str) {
        return decodeToObject(str, 0, null);
    }

    public static void encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            encode3to4(bArr2, bArr, iMin, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int i10, int i11) {
        encode3to4(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static String encodeBase64String(byte[] bArr) {
        return (bArr == null || bArr.length <= 0) ? "" : encodeBytes(bArr);
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr) {
        try {
            return encodeBytesToBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void encodeFileToFile(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        String strEncodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(strEncodeFromFile.getBytes(PREFERRED_ENCODING));
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                bufferedOutputStream2 = bufferedOutputStream;
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
        }
    }

    public static String encodeFromFile(String str) throws Throwable {
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                InputStream inputStream2 = new InputStream(new BufferedInputStream(new FileInputStream(file)), 1);
                int i10 = 0;
                while (true) {
                    try {
                        int i11 = inputStream2.read(bArr, i10, 4096);
                        if (i11 < 0) {
                            break;
                        }
                        i10 += i11;
                    } catch (IOException e10) {
                        inputStream = inputStream2;
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i10, PREFERRED_ENCODING);
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static String encodeObject(Serializable serializable) {
        return encodeObject(serializable, 0);
    }

    public static void encodeToFile(byte[] bArr, String str) throws Throwable {
        OutputStream outputStream;
        if (bArr == null) {
            throw new NullPointerException("Data to encode was null.");
        }
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = new OutputStream(new FileOutputStream(str), 1);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStream.write(bArr);
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
                outputStream2 = outputStream;
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = outputStream;
                try {
                    outputStream2.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e11) {
        }
    }

    private static final byte[] getAlphabet(int i10) {
        return (i10 & 16) == 16 ? _URL_SAFE_ALPHABET : (i10 & 32) == 32 ? _ORDERED_ALPHABET : _STANDARD_ALPHABET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDecodabet(int i10) {
        return (i10 & 16) == 16 ? _URL_SAFE_DECODABET : (i10 & 32) == 32 ? _ORDERED_DECODABET : _STANDARD_DECODABET;
    }

    public static byte[] decode(byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13;
        if (bArr == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        if (i11 == 0) {
            return new byte[0];
        }
        if (i11 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i11);
        }
        byte[] decodabet = getDecodabet(i12);
        byte[] bArr2 = new byte[(i11 * 3) / 4];
        byte[] bArr3 = new byte[4];
        int i14 = 0;
        int iDecode4to3 = 0;
        while (i10 < i13) {
            byte b10 = bArr[i10];
            byte b11 = decodabet[b10 & 255];
            if (b11 < -5) {
                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i10] & 255), Integer.valueOf(i10)));
            }
            if (b11 >= -1) {
                int i15 = i14 + 1;
                bArr3[i14] = b10;
                if (i15 > 3) {
                    iDecode4to3 += decode4to3(bArr3, 0, bArr2, iDecode4to3, i12);
                    if (bArr[i10] == 61) {
                        break;
                    }
                    i14 = 0;
                } else {
                    i14 = i15;
                }
            }
            i10++;
        }
        byte[] bArr4 = new byte[iDecode4to3];
        System.arraycopy(bArr2, 0, bArr4, 0, iDecode4to3);
        return bArr4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static Object decodeToObject(String str, int i10, final ClassLoader classLoader) throws Throwable {
        ?? r32;
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArrDecode = decode(str, i10);
        ByteArrayInputStream byteArrayInputStream2 = null;
        objectInputStream = null;
        objectInputStream = null;
        ObjectInputStream objectInputStream = null;
        byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
            } catch (Throwable th) {
                th = th;
                r32 = classLoader;
            }
        } catch (IOException e10) {
            throw e10;
        } catch (ClassNotFoundException e11) {
            throw e11;
        } catch (Throwable th2) {
            th = th2;
            r32 = 0;
        }
        try {
            objectInputStream = classLoader == null ? new ObjectInputStream(byteArrayInputStream) : new ObjectInputStream(byteArrayInputStream) { // from class: com.alibaba.sdk.android.tbrest.utils.Base64.1
                @Override // java.io.ObjectInputStream
                public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
                    Class<?> cls = Class.forName(objectStreamClass.getName(), false, classLoader);
                    return cls == null ? super.resolveClass(objectStreamClass) : cls;
                }
            };
            Object object = objectInputStream.readObject();
            try {
                byteArrayInputStream.close();
            } catch (Exception unused) {
            }
            try {
                objectInputStream.close();
            } catch (Exception unused2) {
            }
            return object;
        } catch (IOException e12) {
            throw e12;
        } catch (ClassNotFoundException e13) {
            throw e13;
        } catch (Throwable th3) {
            th = th3;
            r32 = objectInputStream;
            byteArrayInputStream2 = byteArrayInputStream;
            try {
                byteArrayInputStream2.close();
            } catch (Exception unused3) {
            }
            try {
                r32.close();
                throw th;
            } catch (Exception unused4) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] alphabet = getAlphabet(i13);
        int i14 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << 24) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = alphabet[i14 >>> 18];
            bArr2[i12 + 1] = alphabet[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = EQUALS_SIGN;
            bArr2[i12 + 3] = EQUALS_SIGN;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = alphabet[i14 >>> 18];
            bArr2[i12 + 1] = alphabet[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = alphabet[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = EQUALS_SIGN;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = alphabet[i14 >>> 18];
        bArr2[i12 + 1] = alphabet[(i14 >>> 12) & 63];
        bArr2[i12 + 2] = alphabet[(i14 >>> 6) & 63];
        bArr2[i12 + 3] = alphabet[i14 & 63];
        return bArr2;
    }

    public static String encodeBytes(byte[] bArr, int i10) {
        return encodeBytes(bArr, 0, bArr.length, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static byte[] encodeBytesToBytes(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        ?? gZIPOutputStream;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i10);
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + i11);
        }
        if (i10 + i11 > bArr2.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr2.length)));
        }
        if ((i12 & 2) == 0) {
            boolean z10 = (i12 & 8) != 0;
            int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
            if (z10) {
                i13 += i13 / 76;
            }
            int i14 = i13;
            byte[] bArr3 = new byte[i14];
            int i15 = i11 - 2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i17 < i15) {
                encode3to4(bArr2, i17 + i10, 3, bArr3, i16, i12);
                i18 += 4;
                if (z10 && i18 >= 76) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                    i18 = 0;
                }
                i17 += 3;
                i16 += 4;
                bArr2 = bArr;
            }
            if (i17 < i11) {
                encode3to4(bArr, i17 + i10, i11 - i17, bArr3, i16, i12);
                i16 += 4;
            }
            if (i16 > i14 - 1) {
                return bArr3;
            }
            byte[] bArr4 = new byte[i16];
            System.arraycopy(bArr3, 0, bArr4, 0, i16);
            return bArr4;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                outputStream = new OutputStream(byteArrayOutputStream, i12 | 1);
                try {
                    gZIPOutputStream = new GZIPOutputStream(outputStream);
                } catch (IOException e10) {
                    e = e10;
                    gZIPOutputStream = 0;
                } catch (Throwable th) {
                    th = th;
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (Exception unused3) {
                        throw th;
                    }
                }
            } catch (IOException e11) {
                e = e11;
                outputStream = null;
                gZIPOutputStream = 0;
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            outputStream = null;
            gZIPOutputStream = 0;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            outputStream = null;
        }
        try {
            gZIPOutputStream.write(bArr2, i10, i11);
            gZIPOutputStream.close();
            try {
                gZIPOutputStream.close();
            } catch (Exception unused4) {
            }
            try {
                outputStream.close();
            } catch (Exception unused5) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused6) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e13) {
            e = e13;
            byteArrayOutputStream2 = byteArrayOutputStream;
            gZIPOutputStream = gZIPOutputStream;
            try {
                throw e;
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = byteArrayOutputStream2;
                byteArrayOutputStream2 = gZIPOutputStream;
                byteArrayOutputStream2.close();
                outputStream.close();
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream2 = gZIPOutputStream;
            byteArrayOutputStream2.close();
            outputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String encodeObject(Serializable serializable, int i10) throws Throwable {
        java.io.OutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        ObjectOutputStream objectOutputStream;
        if (serializable == null) {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        ObjectOutputStream objectOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                outputStream = new OutputStream(byteArrayOutputStream, i10 | 1);
                try {
                    if ((i10 & 2) != 0) {
                        gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            objectOutputStream2 = new ObjectOutputStream(gZIPOutputStream);
                            gZIPOutputStream = gZIPOutputStream;
                        } catch (IOException e10) {
                            e = e10;
                            objectOutputStream = objectOutputStream2;
                            objectOutputStream2 = byteArrayOutputStream;
                            gZIPOutputStream = gZIPOutputStream;
                            try {
                                throw e;
                            } catch (Throwable th) {
                                th = th;
                                ObjectOutputStream objectOutputStream3 = objectOutputStream;
                                byteArrayOutputStream = objectOutputStream2;
                                objectOutputStream2 = objectOutputStream3;
                                try {
                                    objectOutputStream2.close();
                                } catch (Exception unused) {
                                }
                                try {
                                    gZIPOutputStream.close();
                                } catch (Exception unused2) {
                                }
                                try {
                                    outputStream.close();
                                } catch (Exception unused3) {
                                }
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (Exception unused4) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream2.close();
                            gZIPOutputStream.close();
                            outputStream.close();
                            byteArrayOutputStream.close();
                            throw th;
                        }
                    } else {
                        objectOutputStream2 = new ObjectOutputStream(outputStream);
                        gZIPOutputStream = null;
                    }
                    objectOutputStream2.writeObject(serializable);
                    try {
                        objectOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused6) {
                    }
                    try {
                        outputStream.close();
                    } catch (Exception unused7) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused8) {
                    }
                    try {
                        return new String(byteArrayOutputStream.toByteArray(), PREFERRED_ENCODING);
                    } catch (UnsupportedEncodingException unused9) {
                        return new String(byteArrayOutputStream.toByteArray());
                    }
                } catch (IOException e11) {
                    e = e11;
                    ObjectOutputStream objectOutputStream4 = objectOutputStream2;
                    objectOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = objectOutputStream4;
                    gZIPOutputStream = objectOutputStream4;
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = objectOutputStream2;
                }
            } catch (IOException e12) {
                e = e12;
                gZIPOutputStream = null;
                outputStream = null;
                objectOutputStream2 = byteArrayOutputStream;
                objectOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                gZIPOutputStream = null;
                outputStream = null;
            }
        } catch (IOException e13) {
            e = e13;
            gZIPOutputStream = null;
            objectOutputStream = null;
            outputStream = null;
        } catch (Throwable th5) {
            th = th5;
            gZIPOutputStream = null;
            byteArrayOutputStream = 0;
            outputStream = null;
        }
    }

    public static String encodeBytes(byte[] bArr, int i10, int i11) {
        try {
            return encodeBytes(bArr, i10, i11, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArrEncodeBytesToBytes = encodeBytesToBytes(bArr, i10, i11, i12);
        try {
            return new String(bArrEncodeBytesToBytes, PREFERRED_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrEncodeBytesToBytes);
        }
    }

    public static void encode(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            encode3to4(bArr2, bArr, iMin, 0);
            for (int i10 = 0; i10 < 4; i10++) {
                charBuffer.put((char) (bArr2[i10] & 255));
            }
        }
    }

    public static byte[] decode(String str) {
        return decode(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static byte[] decode(String str, int i10) throws Throwable {
        byte[] bytes;
        ?? length;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes(PREFERRED_ENCODING);
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] bArrDecode = decode(bytes, 0, bytes.length, i10);
            boolean z10 = (i10 & 4) != 0;
            if (bArrDecode != null && (length = bArrDecode.length) >= 4 && !z10 && 35615 == ((bArrDecode[0] & 255) | ((bArrDecode[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int i11 = gZIPInputStream.read(bArr);
                                        if (i11 < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr, 0, i11);
                                    } catch (IOException e10) {
                                        e = e10;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayInputStream = byteArrayInputStream;
                                        try {
                                            e.printStackTrace();
                                            byteArrayOutputStream.close();
                                            length = byteArrayInputStream;
                                            gZIPInputStream.close();
                                            length.close();
                                            return bArrDecode;
                                        } catch (Throwable th) {
                                            th = th;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                                throw th;
                                            } catch (Exception unused4) {
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th;
                                    }
                                }
                                bArrDecode = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                length = byteArrayInputStream;
                            } catch (IOException e11) {
                                e = e11;
                                gZIPInputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused5) {
                    }
                } catch (IOException e13) {
                    e = e13;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return bArrDecode;
        }
        throw new NullPointerException("Input string was null.");
    }
}
