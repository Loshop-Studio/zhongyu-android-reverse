package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
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
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import okio.Utf8;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;

@SuppressLint({"Assert"})
/* renamed from: com.tendcloud.tenddata.bv */
/* loaded from: classes5.dex */
public class C7890bv {

    /* renamed from: a */
    public static final int f14445a = 0;

    /* renamed from: b */
    public static final int f14446b = 1;

    /* renamed from: c */
    public static final int f14447c = 0;

    /* renamed from: d */
    public static final int f14448d = 2;

    /* renamed from: e */
    public static final int f14449e = 4;

    /* renamed from: f */
    public static final int f14450f = 8;

    /* renamed from: g */
    public static final int f14451g = 16;

    /* renamed from: h */
    public static final int f14452h = 32;

    /* renamed from: i */
    static final /* synthetic */ boolean f14453i = true;

    /* renamed from: j */
    private static final int f14454j = 76;

    /* renamed from: l */
    private static final byte f14456l = 10;

    /* renamed from: m */
    private static final String f14457m = "US-ASCII";

    /* renamed from: o */
    private static final byte f14459o = -1;

    /* renamed from: p */
    private static final byte[] f14460p = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: n */
    private static final byte f14458n = -5;

    /* renamed from: k */
    private static final byte f14455k = 61;

    /* renamed from: q */
    private static final byte[] f14461q = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f14458n, f14458n, -9, -9, f14458n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f14458n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, f14455k, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: r */
    private static final byte[] f14462r = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: s */
    private static final byte[] f14463s = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f14458n, f14458n, -9, -9, f14458n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f14458n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f14455k, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: t */
    private static final byte[] f14464t = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: u */
    private static final byte[] f14465u = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f14458n, f14458n, -9, -9, f14458n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f14458n, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, MqttWireMessage.MESSAGE_TYPE_UNSUBACK, MqttWireMessage.MESSAGE_TYPE_PINGREQ, 13, MqttWireMessage.MESSAGE_TYPE_DISCONNECT, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, f14455k, 62, Utf8.REPLACEMENT_BYTE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: com.tendcloud.tenddata.bv$a */
    public static class a extends FilterInputStream {
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public a(InputStream inputStream) {
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
                    C7890bv.m11331b(bArr, 0, i11, this.buffer, 0, this.options);
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
                    this.numSigBytes = C7890bv.m11325b(bArr2, 0, this.buffer, 0, this.options);
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

        public a(InputStream inputStream, int i10) {
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
            this.decodabet = C7890bv.m11334c(i10);
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

    /* renamed from: com.tendcloud.tenddata.bv$b */
    public static class b extends FilterOutputStream {

        /* renamed from: b4 */
        private byte[] f14466b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public b(OutputStream outputStream) {
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
                ((FilterOutputStream) this).out.write(C7890bv.m11332b(this.f14466b4, this.buffer, i10, this.options));
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
                    ((FilterOutputStream) this).out.write(this.f14466b4, 0, C7890bv.m11325b(bArr, 0, this.f14466b4, 0, this.options));
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
                ((FilterOutputStream) this).out.write(C7890bv.m11332b(this.f14466b4, bArr2, i15, this.options));
                int i16 = this.lineLength + 4;
                this.lineLength = i16;
                if (this.breakLines && i16 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.lineLength = 0;
                }
                this.position = 0;
            }
        }

        public b(OutputStream outputStream, int i10) {
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
            this.f14466b4 = new byte[4];
            this.options = i10;
            this.decodabet = C7890bv.m11334c(i10);
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

    private C7890bv() {
    }

    /* renamed from: b */
    private static final byte[] m11328b(int i10) {
        return (i10 & 16) == 16 ? f14462r : (i10 & 32) == 32 ? f14464t : f14460p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final byte[] m11334c(int i10) {
        return (i10 & 16) == 16 ? f14463s : (i10 & 32) == 32 ? f14465u : f14461q;
    }

    /* renamed from: d */
    public static String m11338d(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 1);
                int i10 = 0;
                while (true) {
                    try {
                        int i11 = aVar2.read(bArr, i10, 4096);
                        if (i11 < 0) {
                            break;
                        }
                        i10 += i11;
                    } catch (IOException e10) {
                        aVar = aVar2;
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        aVar = aVar2;
                        try {
                            aVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                String str2 = new String(bArr, 0, i10, f14457m);
                try {
                    aVar2.close();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m11332b(byte[] bArr, byte[] bArr2, int i10, int i11) {
        m11331b(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m11336c(byte[] bArr) {
        return m11337c(bArr, 0, bArr.length, 0);
    }

    /* renamed from: a */
    public static void m11317a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            m11332b(bArr2, bArr, iMin, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m11331b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] bArrM11328b = m11328b(i13);
        int i14 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << 24) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = bArrM11328b[i14 >>> 18];
            bArr2[i12 + 1] = bArrM11328b[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = f14455k;
            bArr2[i12 + 3] = f14455k;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArrM11328b[i14 >>> 18];
            bArr2[i12 + 1] = bArrM11328b[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = bArrM11328b[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = f14455k;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArrM11328b[i14 >>> 18];
        bArr2[i12 + 1] = bArrM11328b[(i14 >>> 12) & 63];
        bArr2[i12 + 2] = bArrM11328b[(i14 >>> 6) & 63];
        bArr2[i12 + 3] = bArrM11328b[i14 & 63];
        return bArr2;
    }

    /* renamed from: c */
    public static byte[] m11337c(byte[] bArr, int i10, int i11, int i12) throws IOException {
        int i13;
        if (bArr != null) {
            if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (i11 == 0) {
                return new byte[0];
            }
            if (i11 >= 4) {
                byte[] bArrM11334c = m11334c(i12);
                byte[] bArr2 = new byte[(i11 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i14 = 0;
                int iM11325b = 0;
                while (i10 < i13) {
                    byte b10 = bArr[i10];
                    byte b11 = bArrM11334c[b10 & 255];
                    if (b11 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i10] & 255), Integer.valueOf(i10)));
                    }
                    if (b11 >= -1) {
                        int i15 = i14 + 1;
                        bArr3[i14] = b10;
                        if (i15 > 3) {
                            iM11325b += m11325b(bArr3, 0, bArr2, iM11325b, i12);
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
                byte[] bArr4 = new byte[iM11325b];
                System.arraycopy(bArr2, 0, bArr4, 0, iM11325b);
                return bArr4;
            }
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + i11);
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    /* renamed from: a */
    public static void m11318a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int iMin = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, iMin);
            m11332b(bArr2, bArr, iMin, 0);
            for (int i10 = 0; i10 < 4; i10++) {
                charBuffer.put((char) (bArr2[i10] & 255));
            }
        }
    }

    /* renamed from: a */
    public static String m11310a(Serializable serializable) {
        return m11311a(serializable, 0);
    }

    /* renamed from: b */
    public static byte[] m11329b(byte[] bArr) {
        try {
            return m11330b(bArr, 0, bArr.length, 0);
        } catch (IOException e10) {
            if (f14453i) {
                return null;
            }
            throw new AssertionError("IOExceptions only come from GZipping, which is turned off: " + e10.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static String m11311a(Serializable serializable, int i10) throws Throwable {
        OutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ObjectOutputStream objectOutputStream;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bVar = new b(byteArrayOutputStream, i10 | 1);
                    try {
                        if ((i10 & 2) != 0) {
                            gZIPOutputStream = new GZIPOutputStream(bVar);
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
                                        bVar.close();
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
                                bVar.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream2 = new ObjectOutputStream(bVar);
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
                            bVar.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), f14457m);
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
                    bVar = null;
                    objectOutputStream2 = byteArrayOutputStream;
                    objectOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    gZIPOutputStream = null;
                    bVar = null;
                }
            } catch (IOException e13) {
                e = e13;
                gZIPOutputStream = null;
                objectOutputStream = null;
                bVar = null;
            } catch (Throwable th5) {
                th = th5;
                gZIPOutputStream = null;
                byteArrayOutputStream = 0;
                bVar = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
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
    /* renamed from: b */
    public static byte[] m11330b(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        b bVar;
        ?? gZIPOutputStream;
        byte[] bArr2 = bArr;
        if (bArr2 == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i10);
        }
        if (i11 >= 0) {
            if (i10 + i11 > bArr2.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr2.length)));
            }
            if ((i12 & 2) != 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bVar = new b(byteArrayOutputStream, i12 | 1);
                        try {
                            gZIPOutputStream = new GZIPOutputStream(bVar);
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
                                bVar.close();
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
                        bVar = null;
                        gZIPOutputStream = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                    }
                } catch (IOException e12) {
                    e = e12;
                    bVar = null;
                    gZIPOutputStream = 0;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                    bVar = null;
                }
                try {
                    gZIPOutputStream.write(bArr2, i10, i11);
                    gZIPOutputStream.close();
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused4) {
                    }
                    try {
                        bVar.close();
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
                        bVar.close();
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream2 = gZIPOutputStream;
                    byteArrayOutputStream2.close();
                    bVar.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            }
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
                m11331b(bArr2, i17 + i10, 3, bArr3, i16, i12);
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
                m11331b(bArr, i17 + i10, i11 - i17, bArr3, i16, i12);
                i16 += 4;
            }
            if (i16 > i14 - 1) {
                return bArr3;
            }
            byte[] bArr4 = new byte[i16];
            System.arraycopy(bArr3, 0, bArr4, 0, i16);
            return bArr4;
        }
        throw new IllegalArgumentException("Cannot have length offset: " + i11);
    }

    /* renamed from: c */
    public static byte[] m11335c(String str) throws Throwable {
        a aVar = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= SieveCacheKt.NodeLinkMask) {
                    byte[] bArr = new byte[(int) file.length()];
                    a aVar2 = new a(new BufferedInputStream(new FileInputStream(file)), 0);
                    int i10 = 0;
                    while (true) {
                        try {
                            int i11 = aVar2.read(bArr, i10, 4096);
                            if (i11 < 0) {
                                break;
                            }
                            i10 += i11;
                        } catch (IOException e10) {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            aVar = aVar2;
                            try {
                                aVar.close();
                            } catch (Exception unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    try {
                        aVar2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    /* renamed from: c */
    public static void m11333c(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        byte[] bArrM11335c = m11335c(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(bArrM11335c);
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

    /* renamed from: a */
    public static String m11312a(byte[] bArr) throws Throwable {
        String strM11315a;
        try {
            strM11315a = m11315a(bArr, 0, bArr.length, 0);
        } catch (IOException e10) {
            if (!f14453i) {
                throw new AssertionError(e10.getMessage());
            }
            strM11315a = null;
        }
        if (f14453i || strM11315a != null) {
            return strM11315a;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static String m11313a(byte[] bArr, int i10) {
        return m11315a(bArr, 0, bArr.length, i10);
    }

    /* renamed from: a */
    public static String m11314a(byte[] bArr, int i10, int i11) throws Throwable {
        String strM11315a;
        try {
            strM11315a = m11315a(bArr, i10, i11, 0);
        } catch (IOException e10) {
            if (!f14453i) {
                throw new AssertionError(e10.getMessage());
            }
            strM11315a = null;
        }
        if (f14453i || strM11315a != null) {
            return strM11315a;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static String m11315a(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArrM11330b = m11330b(bArr, i10, i11, i12);
        try {
            return new String(bArrM11330b, f14457m);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrM11330b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m11325b(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (bArr2 != null) {
            if (i10 >= 0 && (i13 = i10 + 3) < bArr.length) {
                if (i11 >= 0 && (i14 = i11 + 2) < bArr2.length) {
                    byte[] bArrM11334c = m11334c(i12);
                    byte b10 = bArr[i10 + 2];
                    if (b10 == 61) {
                        bArr2[i11] = (byte) ((((bArrM11334c[bArr[i10 + 1]] & 255) << 12) | ((bArrM11334c[bArr[i10]] & 255) << 18)) >>> 16);
                        return 1;
                    }
                    byte b11 = bArr[i13];
                    if (b11 == 61) {
                        int i15 = ((bArrM11334c[bArr[i10 + 1]] & 255) << 12) | ((bArrM11334c[bArr[i10]] & 255) << 18) | ((bArrM11334c[b10] & 255) << 6);
                        bArr2[i11] = (byte) (i15 >>> 16);
                        bArr2[i11 + 1] = (byte) (i15 >>> 8);
                        return 2;
                    }
                    int i16 = ((bArrM11334c[bArr[i10 + 1]] & 255) << 12) | ((bArrM11334c[bArr[i10]] & 255) << 18) | ((bArrM11334c[b10] & 255) << 6) | (bArrM11334c[b11] & 255);
                    bArr2[i11] = (byte) (i16 >> 16);
                    bArr2[i11 + 1] = (byte) (i16 >> 8);
                    bArr2[i14] = (byte) i16;
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
        }
        throw new NullPointerException("Destination array was null.");
    }

    /* renamed from: a */
    public static byte[] m11321a(String str) {
        return m11322a(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* renamed from: a */
    public static byte[] m11322a(String str, int i10) throws Throwable {
        byte[] bytes;
        ?? length;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        if (str != null) {
            try {
                bytes = str.getBytes(f14457m);
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            byte[] bArrM11337c = m11337c(bytes, 0, bytes.length, i10);
            boolean z10 = (i10 & 4) != 0;
            if (bArrM11337c != null && (length = bArrM11337c.length) >= 4 && !z10 && 35615 == ((bArrM11337c[0] & 255) | ((bArrM11337c[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) {
                byte[] bArr = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(bArrM11337c);
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
                                            return bArrM11337c;
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
                                bArrM11337c = byteArrayOutputStream2.toByteArray();
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
            return bArrM11337c;
        }
        throw new NullPointerException("Input string was null.");
    }

    /* renamed from: b */
    public static Object m11326b(String str) {
        return m11309a(str, 0, (ClassLoader) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* renamed from: a */
    public static Object m11309a(String str, int i10, final ClassLoader classLoader) throws Throwable {
        ?? r32;
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        byte[] bArrM11322a = m11322a(str, i10);
        ByteArrayInputStream byteArrayInputStream2 = null;
        objectInputStream = null;
        objectInputStream = null;
        ObjectInputStream objectInputStream2 = null;
        byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArrM11322a);
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
            if (classLoader == null) {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } else {
                objectInputStream = new ObjectInputStream(byteArrayInputStream) { // from class: com.tendcloud.tenddata.bv.1
                    @Override // java.io.ObjectInputStream
                    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
                        Class<?> cls = Class.forName(objectStreamClass.getName(), false, classLoader);
                        return cls == null ? super.resolveClass(objectStreamClass) : cls;
                    }
                };
            }
            objectInputStream2 = objectInputStream;
            Object object = objectInputStream2.readObject();
            try {
                byteArrayInputStream.close();
            } catch (Exception unused) {
            }
            try {
                objectInputStream2.close();
            } catch (Exception unused2) {
            }
            return object;
        } catch (IOException e12) {
            throw e12;
        } catch (ClassNotFoundException e13) {
            throw e13;
        } catch (Throwable th3) {
            th = th3;
            r32 = objectInputStream2;
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

    /* renamed from: b */
    public static void m11327b(String str, String str2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        String strM11338d = m11338d(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            } catch (Throwable th) {
                th = th;
            }
            try {
                bufferedOutputStream.write(strM11338d.getBytes(f14457m));
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

    /* renamed from: a */
    public static void m11319a(byte[] bArr, String str) throws Throwable {
        b bVar;
        if (bArr != null) {
            b bVar2 = null;
            try {
                try {
                    bVar = new b(new FileOutputStream(str), 1);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    bVar.write(bArr);
                    try {
                        bVar.close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } catch (IOException e10) {
                    bVar2 = bVar;
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                    try {
                        bVar2.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e11) {
                throw e11;
            }
        }
        throw new NullPointerException("Data to encode was null.");
    }

    /* renamed from: a */
    public static void m11316a(String str, String str2) throws Throwable {
        b bVar;
        b bVar2 = null;
        try {
            try {
                bVar = new b(new FileOutputStream(str2), 0);
            } catch (IOException e10) {
                throw e10;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bVar.write(str.getBytes(f14457m));
            try {
                bVar.close();
            } catch (Exception unused) {
            }
        } catch (IOException e11) {
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            try {
                bVar2.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }
}
