package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p116h0.AbstractC8706j;
import p193o.InterfaceC9498b;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f3152a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f3153b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo3038a();

        /* renamed from: b */
        short mo3039b();

        int read(byte[] bArr, int i10);

        long skip(long j10);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C5434a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f3154a;

        public C5434a(ByteBuffer byteBuffer) {
            this.f3154a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo3038a() {
            return (mo3039b() << 8) | mo3039b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public short mo3039b() throws Reader.EndOfFileException {
            if (this.f3154a.remaining() >= 1) {
                return (short) (this.f3154a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f3154a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f3154a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f3154a.remaining(), j10);
            ByteBuffer byteBuffer = this.f3154a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C5435b {

        /* renamed from: a */
        public final ByteBuffer f3155a;

        public C5435b(byte[] bArr, int i10) {
            this.f3155a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: a */
        public short m3040a(int i10) {
            if (m3042c(i10, 2)) {
                return this.f3155a.getShort(i10);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m3041b(int i10) {
            if (m3042c(i10, 4)) {
                return this.f3155a.getInt(i10);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m3042c(int i10, int i11) {
            return this.f3155a.remaining() - i10 >= i11;
        }

        /* renamed from: d */
        public int m3043d() {
            return this.f3155a.remaining();
        }

        /* renamed from: e */
        public void m3044e(ByteOrder byteOrder) {
            this.f3155a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C5436c implements Reader {

        /* renamed from: a */
        public final InputStream f3156a;

        public C5436c(InputStream inputStream) {
            this.f3156a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo3038a() {
            return (mo3039b() << 8) | mo3039b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public short mo3039b() throws IOException {
            int i10 = this.f3156a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) throws Reader.EndOfFileException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f3156a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f3156a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f3156a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    /* renamed from: e */
    public static int m3029e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* renamed from: h */
    public static boolean m3030h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* renamed from: k */
    public static int m3031k(C5435b c5435b) {
        ByteOrder byteOrder;
        short sM3040a = c5435b.m3040a(6);
        if (sM3040a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM3040a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c5435b.m3044e(byteOrder);
        int iM3041b = c5435b.m3041b(10) + 6;
        short sM3040a2 = c5435b.m3040a(iM3041b);
        for (int i10 = 0; i10 < sM3040a2; i10++) {
            int iM3029e = m3029e(iM3041b, i10);
            if (c5435b.m3040a(iM3029e) == 274) {
                short sM3040a3 = c5435b.m3040a(iM3029e + 2);
                if (sM3040a3 < 1 || sM3040a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM3041b2 = c5435b.m3041b(iM3029e + 4);
                    if (iM3041b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i11 = iM3041b2 + f3153b[sM3040a3];
                        if (i11 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i12 = iM3029e + 8;
                            if (i12 < 0 || i12 > c5435b.m3043d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i11 >= 0 && i11 + i12 <= c5435b.m3043d()) {
                                    return c5435b.m3040a(i12);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo2823a(ByteBuffer byteBuffer, InterfaceC9498b interfaceC9498b) {
        return m3032f(new C5434a((ByteBuffer) AbstractC8706j.m14181d(byteBuffer)), (InterfaceC9498b) AbstractC8706j.m14181d(interfaceC9498b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo2824b(ByteBuffer byteBuffer) {
        return m3033g(new C5434a((ByteBuffer) AbstractC8706j.m14181d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo2825c(InputStream inputStream, InterfaceC9498b interfaceC9498b) {
        return m3032f(new C5436c((InputStream) AbstractC8706j.m14181d(inputStream)), (InterfaceC9498b) AbstractC8706j.m14181d(interfaceC9498b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo2826d(InputStream inputStream) {
        return m3033g(new C5436c((InputStream) AbstractC8706j.m14181d(inputStream)));
    }

    /* renamed from: f */
    public final int m3032f(Reader reader, InterfaceC9498b interfaceC9498b) {
        try {
            if (!m3030h(reader.mo3038a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM3035j = m3035j(reader);
            if (iM3035j == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC9498b.mo17614b(iM3035j, byte[].class);
            try {
                return m3036l(reader, bArr, iM3035j);
            } finally {
                interfaceC9498b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public final ImageHeaderParser.ImageType m3033g(Reader reader) {
        try {
            int iMo3038a = reader.mo3038a();
            if (iMo3038a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo3039b = (iMo3038a << 8) | reader.mo3039b();
            if (iMo3039b == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo3039b2 = (iMo3039b << 8) | reader.mo3039b();
            if (iMo3039b2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo3039b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo3039b2 != 1380533830) {
                return m3037m(reader, iMo3039b2);
            }
            reader.skip(4L);
            if (((reader.mo3038a() << 16) | reader.mo3038a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo3038a2 = (reader.mo3038a() << 16) | reader.mo3038a();
            if ((iMo3038a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iMo3038a2 & 255;
            if (i10 == 88) {
                reader.skip(4L);
                short sMo3039b = reader.mo3039b();
                return (sMo3039b & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sMo3039b & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo3039b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: i */
    public final boolean m3034i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f3152a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f3152a;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final int m3035j(Reader reader) {
        while (reader.mo3039b() == 255) {
            short sMo3039b = reader.mo3039b();
            if (sMo3039b == 218) {
                return -1;
            }
            if (sMo3039b == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo3038a = reader.mo3038a() - 2;
            if (sMo3039b == 225) {
                return iMo3038a;
            }
            long j10 = iMo3038a;
            if (reader.skip(j10) != j10) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: l */
    public final int m3036l(Reader reader, byte[] bArr, int i10) {
        if (reader.read(bArr, i10) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m3034i(bArr, i10)) {
            return m3031k(new C5435b(bArr, i10));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: m */
    public final ImageHeaderParser.ImageType m3037m(Reader reader, int i10) {
        if (((reader.mo3038a() << 16) | reader.mo3038a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo3038a = (reader.mo3038a() << 16) | reader.mo3038a();
        if (iMo3038a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = iMo3038a == 1635150182;
        reader.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iMo3038a2 = (reader.mo3038a() << 16) | reader.mo3038a();
                if (iMo3038a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iMo3038a2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
