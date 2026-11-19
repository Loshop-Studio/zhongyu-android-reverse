package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;
import p062g0.AbstractC3749i;
import p098n.InterfaceC4393b;

/* loaded from: classes2.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f861a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f862b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo1919a();

        /* renamed from: b */
        int mo1920b(byte[] bArr, int i4);

        /* renamed from: c */
        short mo1921c();

        long skip(long j4);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C2883a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f863a;

        public C2883a(ByteBuffer byteBuffer) {
            this.f863a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo1919a() {
            return (mo1921c() << 8) | mo1921c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo1920b(byte[] bArr, int i4) {
            int iMin = Math.min(i4, this.f863a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f863a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo1921c() throws Reader.EndOfFileException {
            if (this.f863a.remaining() >= 1) {
                return (short) (this.f863a.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j4) {
            int iMin = (int) Math.min(this.f863a.remaining(), j4);
            ByteBuffer byteBuffer = this.f863a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C2884b {

        /* renamed from: a */
        public final ByteBuffer f864a;

        public C2884b(byte[] bArr, int i4) {
            this.f864a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i4);
        }

        /* renamed from: a */
        public short m1922a(int i4) {
            if (m1924c(i4, 2)) {
                return this.f864a.getShort(i4);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m1923b(int i4) {
            if (m1924c(i4, 4)) {
                return this.f864a.getInt(i4);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m1924c(int i4, int i5) {
            return this.f864a.remaining() - i4 >= i5;
        }

        /* renamed from: d */
        public int m1925d() {
            return this.f864a.remaining();
        }

        /* renamed from: e */
        public void m1926e(ByteOrder byteOrder) {
            this.f864a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C2885c implements Reader {

        /* renamed from: a */
        public final InputStream f865a;

        public C2885c(InputStream inputStream) {
            this.f865a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo1919a() {
            return (mo1921c() << 8) | mo1921c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo1920b(byte[] bArr, int i4) throws Reader.EndOfFileException {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4 && (i6 = this.f865a.read(bArr, i5, i4 - i5)) != -1) {
                i5 += i6;
            }
            if (i5 == 0 && i6 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i5;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo1921c() throws IOException {
            int i4 = this.f865a.read();
            if (i4 != -1) {
                return (short) i4;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j4) throws IOException {
            if (j4 < 0) {
                return 0L;
            }
            long j5 = j4;
            while (j5 > 0) {
                long jSkip = this.f865a.skip(j5);
                if (jSkip <= 0) {
                    if (this.f865a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j5 -= jSkip;
            }
            return j4 - j5;
        }
    }

    /* renamed from: d */
    public static int m1911d(int i4, int i5) {
        return i4 + 2 + (i5 * 12);
    }

    /* renamed from: g */
    public static boolean m1912g(int i4) {
        return (i4 & 65496) == 65496 || i4 == 19789 || i4 == 18761;
    }

    /* renamed from: j */
    public static int m1913j(C2884b c2884b) {
        ByteOrder byteOrder;
        short sM1922a = c2884b.m1922a(6);
        if (sM1922a != 18761) {
            if (sM1922a != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append((int) sM1922a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        c2884b.m1926e(byteOrder);
        int iM1923b = c2884b.m1923b(10) + 6;
        short sM1922a2 = c2884b.m1922a(iM1923b);
        for (int i4 = 0; i4 < sM1922a2; i4++) {
            int iM1911d = m1911d(iM1923b, i4);
            short sM1922a3 = c2884b.m1922a(iM1911d);
            if (sM1922a3 == 274) {
                short sM1922a4 = c2884b.m1922a(iM1911d + 2);
                if (sM1922a4 >= 1 && sM1922a4 <= 12) {
                    int iM1923b2 = c2884b.m1923b(iM1911d + 4);
                    if (iM1923b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i4);
                            sb2.append(" tagType=");
                            sb2.append((int) sM1922a3);
                            sb2.append(" formatCode=");
                            sb2.append((int) sM1922a4);
                            sb2.append(" componentCount=");
                            sb2.append(iM1923b2);
                        }
                        int i5 = iM1923b2 + f862b[sM1922a4];
                        if (i5 <= 4) {
                            int i6 = iM1911d + 8;
                            if (i6 >= 0 && i6 <= c2884b.m1925d()) {
                                if (i5 >= 0 && i5 + i6 <= c2884b.m1925d()) {
                                    return c2884b.m1922a(i6);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal number of bytes for TI tag data tagType=");
                                    sb3.append((int) sM1922a3);
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Illegal tagValueOffset=");
                                sb4.append(i6);
                                sb4.append(" tagType=");
                                sb4.append((int) sM1922a3);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append((int) sM1922a4);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append((int) sM1922a4);
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo1753a(ByteBuffer byteBuffer) {
        return m1915f(new C2883a((ByteBuffer) AbstractC3749i.m4768d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo1754b(InputStream inputStream) {
        return m1915f(new C2885c((InputStream) AbstractC3749i.m4768d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo1755c(InputStream inputStream, InterfaceC4393b interfaceC4393b) {
        return m1914e(new C2885c((InputStream) AbstractC3749i.m4768d(inputStream)), (InterfaceC4393b) AbstractC3749i.m4768d(interfaceC4393b));
    }

    /* renamed from: e */
    public final int m1914e(Reader reader, InterfaceC4393b interfaceC4393b) {
        try {
            int iMo1919a = reader.mo1919a();
            if (!m1912g(iMo1919a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Parser doesn't handle magic number: ");
                    sb.append(iMo1919a);
                }
                return -1;
            }
            int iM1917i = m1917i(reader);
            if (iM1917i == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC4393b.mo5386d(iM1917i, byte[].class);
            try {
                return m1918k(reader, bArr, iM1917i);
            } finally {
                interfaceC4393b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public final ImageHeaderParser.ImageType m1915f(Reader reader) {
        try {
            int iMo1919a = reader.mo1919a();
            if (iMo1919a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo1921c = (iMo1919a << 8) | reader.mo1921c();
            if (iMo1921c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo1921c2 = (iMo1921c << 8) | reader.mo1921c();
            if (iMo1921c2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo1921c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo1921c2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.mo1919a() << 16) | reader.mo1919a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo1919a2 = (reader.mo1919a() << 16) | reader.mo1919a();
            if ((iMo1919a2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i4 = iMo1919a2 & 255;
            if (i4 == 88) {
                reader.skip(4L);
                return (reader.mo1921c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i4 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo1921c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: h */
    public final boolean m1916h(byte[] bArr, int i4) {
        boolean z3 = bArr != null && i4 > f861a.length;
        if (z3) {
            int i5 = 0;
            while (true) {
                byte[] bArr2 = f861a;
                if (i5 >= bArr2.length) {
                    break;
                }
                if (bArr[i5] != bArr2[i5]) {
                    return false;
                }
                i5++;
            }
        }
        return z3;
    }

    /* renamed from: i */
    public final int m1917i(Reader reader) {
        short sMo1921c;
        int iMo1919a;
        long j4;
        long jSkip;
        do {
            short sMo1921c2 = reader.mo1921c();
            if (sMo1921c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append((int) sMo1921c2);
                }
                return -1;
            }
            sMo1921c = reader.mo1921c();
            if (sMo1921c == 218) {
                return -1;
            }
            if (sMo1921c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            iMo1919a = reader.mo1919a() - 2;
            if (sMo1921c == 225) {
                return iMo1919a;
            }
            j4 = iMo1919a;
            jSkip = reader.skip(j4);
        } while (jSkip == j4);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append((int) sMo1921c);
            sb2.append(", wanted to skip: ");
            sb2.append(iMo1919a);
            sb2.append(", but actually skipped: ");
            sb2.append(jSkip);
        }
        return -1;
    }

    /* renamed from: k */
    public final int m1918k(Reader reader, byte[] bArr, int i4) {
        int iMo1920b = reader.mo1920b(bArr, i4);
        if (iMo1920b == i4) {
            if (m1916h(bArr, i4)) {
                return m1913j(new C2884b(bArr, i4));
            }
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to read exif segment data, length: ");
            sb.append(i4);
            sb.append(", actually read: ");
            sb.append(iMo1920b);
        }
        return -1;
    }
}
