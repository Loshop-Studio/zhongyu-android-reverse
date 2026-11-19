package p127j0;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;
import kotlin.UByte;
import kotlin.p148io.encoding.Base64;
import okio.Utf8;

/* renamed from: j0.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7770a {

    /* renamed from: a */
    public static final byte[] f13392a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b */
    public static final byte[] f13393b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c */
    public static final byte[] f13394c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d */
    public static final byte[] f13395d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, Utf8.REPLACEMENT_BYTE, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e */
    public static final byte[] f13396e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f */
    public static final byte[] f13397f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, 62, Utf8.REPLACEMENT_BYTE, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: d */
    public static int m13088d(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
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
        byte[] bArrM13096l = m13096l(i12);
        byte b10 = bArr[i10 + 2];
        if (b10 == 61) {
            bArr2[i11] = (byte) ((((bArrM13096l[bArr[i10 + 1]] & UByte.MAX_VALUE) << 12) | ((bArrM13096l[bArr[i10]] & UByte.MAX_VALUE) << 18)) >>> 16);
            return 1;
        }
        byte b11 = bArr[i13];
        if (b11 == 61) {
            int i15 = ((bArrM13096l[bArr[i10 + 1]] & UByte.MAX_VALUE) << 12) | ((bArrM13096l[bArr[i10]] & UByte.MAX_VALUE) << 18) | ((bArrM13096l[b10] & UByte.MAX_VALUE) << 6);
            bArr2[i11] = (byte) (i15 >>> 16);
            bArr2[i11 + 1] = (byte) (i15 >>> 8);
            return 2;
        }
        int i16 = ((bArrM13096l[bArr[i10 + 1]] & UByte.MAX_VALUE) << 12) | ((bArrM13096l[bArr[i10]] & UByte.MAX_VALUE) << 18) | ((bArrM13096l[b10] & UByte.MAX_VALUE) << 6) | (bArrM13096l[b11] & UByte.MAX_VALUE);
        bArr2[i11] = (byte) (i16 >> 16);
        bArr2[i11 + 1] = (byte) (i16 >> 8);
        bArr2[i14] = (byte) i16;
        return 3;
    }

    /* renamed from: e */
    public static byte[] m13089e(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] bArrM13095k = m13095k(i13);
        int i14 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0) | (i11 > 2 ? (bArr[i10 + 2] << 24) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = bArrM13095k[i14 >>> 18];
            bArr2[i12 + 1] = bArrM13095k[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = Base64.padSymbol;
            bArr2[i12 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArrM13095k[i14 >>> 18];
            bArr2[i12 + 1] = bArrM13095k[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = bArrM13095k[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = Base64.padSymbol;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArrM13095k[i14 >>> 18];
        bArr2[i12 + 1] = bArrM13095k[(i14 >>> 12) & 63];
        bArr2[i12 + 2] = bArrM13095k[(i14 >>> 6) & 63];
        bArr2[i12 + 3] = bArrM13095k[i14 & 63];
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m13090f(byte[] bArr, byte[] bArr2, int i10, int i11) {
        m13089e(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    /* renamed from: g */
    public static String m13091g(byte[] bArr) {
        return (bArr == null || bArr.length <= 0) ? "" : m13092h(bArr);
    }

    /* renamed from: h */
    public static String m13092h(byte[] bArr) {
        try {
            return m13093i(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static String m13093i(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        byte[] bArrM13094j = m13094j(bArr, i10, i11, i12);
        try {
            return new String(bArrM13094j, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArrM13094j);
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
    /* renamed from: j */
    public static byte[] m13094j(byte[] bArr, int i10, int i11, int i12) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        a aVar;
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
            boolean z9 = (i12 & 8) != 0;
            int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
            if (z9) {
                i13 += i13 / 76;
            }
            int i14 = i13;
            byte[] bArr3 = new byte[i14];
            int i15 = i11 - 2;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i17 < i15) {
                m13089e(bArr2, i17 + i10, 3, bArr3, i16, i12);
                i18 += 4;
                if (z9 && i18 >= 76) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                    i18 = 0;
                }
                i17 += 3;
                i16 += 4;
                bArr2 = bArr;
            }
            if (i17 < i11) {
                m13089e(bArr, i17 + i10, i11 - i17, bArr3, i16, i12);
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
                aVar = new a(byteArrayOutputStream, i12 | 1);
                try {
                    gZIPOutputStream = new GZIPOutputStream(aVar);
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
                        aVar.close();
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
                aVar = null;
                gZIPOutputStream = 0;
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
            }
        } catch (IOException e12) {
            e = e12;
            aVar = null;
            gZIPOutputStream = 0;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            aVar = null;
        }
        try {
            gZIPOutputStream.write(bArr2, i10, i11);
            gZIPOutputStream.close();
            try {
                gZIPOutputStream.close();
            } catch (Exception unused4) {
            }
            try {
                aVar.close();
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
                aVar.close();
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            byteArrayOutputStream2 = gZIPOutputStream;
            byteArrayOutputStream2.close();
            aVar.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }

    /* renamed from: k */
    public static final byte[] m13095k(int i10) {
        return (i10 & 16) == 16 ? f13394c : (i10 & 32) == 32 ? f13396e : f13392a;
    }

    /* renamed from: l */
    public static final byte[] m13096l(int i10) {
        return (i10 & 16) == 16 ? f13395d : (i10 & 32) == 32 ? f13397f : f13393b;
    }

    /* renamed from: j0.a$a */
    public static class a extends FilterOutputStream {

        /* renamed from: a */
        public boolean f13398a;

        /* renamed from: b */
        public int f13399b;

        /* renamed from: c */
        public byte[] f13400c;

        /* renamed from: d */
        public int f13401d;

        /* renamed from: e */
        public int f13402e;

        /* renamed from: f */
        public boolean f13403f;

        /* renamed from: g */
        public byte[] f13404g;

        /* renamed from: h */
        public boolean f13405h;

        /* renamed from: i */
        public int f13406i;

        /* renamed from: j */
        public byte[] f13407j;

        public a(OutputStream outputStream, int i10) {
            super(outputStream);
            this.f13403f = (i10 & 8) != 0;
            boolean z9 = (i10 & 1) != 0;
            this.f13398a = z9;
            int i11 = z9 ? 3 : 4;
            this.f13401d = i11;
            this.f13400c = new byte[i11];
            this.f13399b = 0;
            this.f13402e = 0;
            this.f13405h = false;
            this.f13404g = new byte[4];
            this.f13406i = i10;
            this.f13407j = AbstractC7770a.m13096l(i10);
        }

        /* renamed from: a */
        public void m13097a() throws IOException {
            int i10 = this.f13399b;
            if (i10 > 0) {
                if (!this.f13398a) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(AbstractC7770a.m13090f(this.f13404g, this.f13400c, i10, this.f13406i));
                this.f13399b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            m13097a();
            super.close();
            this.f13400c = null;
            ((FilterOutputStream) this).out = null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.f13405h) {
                ((FilterOutputStream) this).out.write(i10);
                return;
            }
            if (!this.f13398a) {
                byte b10 = this.f13407j[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr = this.f13400c;
                int i11 = this.f13399b;
                int i12 = i11 + 1;
                this.f13399b = i12;
                bArr[i11] = (byte) i10;
                if (i12 >= this.f13401d) {
                    ((FilterOutputStream) this).out.write(this.f13404g, 0, AbstractC7770a.m13088d(bArr, 0, this.f13404g, 0, this.f13406i));
                    this.f13399b = 0;
                    return;
                }
                return;
            }
            byte[] bArr2 = this.f13400c;
            int i13 = this.f13399b;
            int i14 = i13 + 1;
            this.f13399b = i14;
            bArr2[i13] = (byte) i10;
            int i15 = this.f13401d;
            if (i14 >= i15) {
                ((FilterOutputStream) this).out.write(AbstractC7770a.m13090f(this.f13404g, bArr2, i15, this.f13406i));
                int i16 = this.f13402e + 4;
                this.f13402e = i16;
                if (this.f13403f && i16 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f13402e = 0;
                }
                this.f13399b = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            if (this.f13405h) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }
}
