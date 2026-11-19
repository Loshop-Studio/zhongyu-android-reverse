package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;
import p016b1.AbstractC4408j;
import p074i0.InterfaceC6497b;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f2510a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f2511b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo2772a();

        /* renamed from: b */
        int mo2773b(byte[] bArr, int i6);

        /* renamed from: c */
        short mo2774c();

        long skip(long j6);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C4721a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f2512a;

        public C4721a(ByteBuffer byteBuffer) {
            this.f2512a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo2772a() {
            return (mo2774c() << 8) | mo2774c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo2773b(byte[] bArr, int i6) {
            int iMin = Math.min(i6, this.f2512a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f2512a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo2774c() throws Reader.EndOfFileException {
            if (this.f2512a.remaining() >= 1) {
                return (short) (this.f2512a.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j6) {
            int iMin = (int) Math.min(this.f2512a.remaining(), j6);
            ByteBuffer byteBuffer = this.f2512a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C4722b {

        /* renamed from: a */
        public final ByteBuffer f2513a;

        public C4722b(byte[] bArr, int i6) {
            this.f2513a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i6);
        }

        /* renamed from: a */
        public short m2775a(int i6) {
            if (m2777c(i6, 2)) {
                return this.f2513a.getShort(i6);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m2776b(int i6) {
            if (m2777c(i6, 4)) {
                return this.f2513a.getInt(i6);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m2777c(int i6, int i7) {
            return this.f2513a.remaining() - i6 >= i7;
        }

        /* renamed from: d */
        public int m2778d() {
            return this.f2513a.remaining();
        }

        /* renamed from: e */
        public void m2779e(ByteOrder byteOrder) {
            this.f2513a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C4723c implements Reader {

        /* renamed from: a */
        public final InputStream f2514a;

        public C4723c(InputStream inputStream) {
            this.f2514a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo2772a() {
            return (mo2774c() << 8) | mo2774c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo2773b(byte[] bArr, int i6) throws Reader.EndOfFileException {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i6 && (i8 = this.f2514a.read(bArr, i7, i6 - i7)) != -1) {
                i7 += i8;
            }
            if (i7 == 0 && i8 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i7;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo2774c() throws IOException {
            int i6 = this.f2514a.read();
            if (i6 != -1) {
                return (short) i6;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j6) throws IOException {
            if (j6 < 0) {
                return 0L;
            }
            long j7 = j6;
            while (j7 > 0) {
                long jSkip = this.f2514a.skip(j7);
                if (jSkip <= 0) {
                    if (this.f2514a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j7 -= jSkip;
            }
            return j6 - j7;
        }
    }

    /* renamed from: e */
    public static int m2763e(int i6, int i7) {
        return i6 + 2 + (i7 * 12);
    }

    /* renamed from: h */
    public static boolean m2764h(int i6) {
        return (i6 & 65496) == 65496 || i6 == 19789 || i6 == 18761;
    }

    /* renamed from: k */
    public static int m2765k(C4722b c4722b) {
        ByteOrder byteOrder;
        short sM2775a = c4722b.m2775a(6);
        if (sM2775a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM2775a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c4722b.m2779e(byteOrder);
        int iM2776b = c4722b.m2776b(10) + 6;
        short sM2775a2 = c4722b.m2775a(iM2776b);
        for (int i6 = 0; i6 < sM2775a2; i6++) {
            int iM2763e = m2763e(iM2776b, i6);
            if (c4722b.m2775a(iM2763e) == 274) {
                short sM2775a3 = c4722b.m2775a(iM2763e + 2);
                if (sM2775a3 < 1 || sM2775a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM2776b2 = c4722b.m2776b(iM2763e + 4);
                    if (iM2776b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i7 = iM2776b2 + f2511b[sM2775a3];
                        if (i7 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i8 = iM2763e + 8;
                            if (i8 < 0 || i8 > c4722b.m2778d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i7 >= 0 && i7 + i8 <= c4722b.m2778d()) {
                                    return c4722b.m2775a(i8);
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
    public int mo2557a(InputStream inputStream, InterfaceC6497b interfaceC6497b) {
        return m2766f(new C4723c((InputStream) AbstractC4408j.m1438d(inputStream)), (InterfaceC6497b) AbstractC4408j.m1438d(interfaceC6497b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo2558b(ByteBuffer byteBuffer) {
        return m2767g(new C4721a((ByteBuffer) AbstractC4408j.m1438d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo2559c(ByteBuffer byteBuffer, InterfaceC6497b interfaceC6497b) {
        return m2766f(new C4721a((ByteBuffer) AbstractC4408j.m1438d(byteBuffer)), (InterfaceC6497b) AbstractC4408j.m1438d(interfaceC6497b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo2560d(InputStream inputStream) {
        return m2767g(new C4723c((InputStream) AbstractC4408j.m1438d(inputStream)));
    }

    /* renamed from: f */
    public final int m2766f(Reader reader, InterfaceC6497b interfaceC6497b) {
        try {
            if (!m2764h(reader.mo2772a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM2769j = m2769j(reader);
            if (iM2769j == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC6497b.mo7190c(iM2769j, byte[].class);
            try {
                return m2770l(reader, bArr, iM2769j);
            } finally {
                interfaceC6497b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public final ImageHeaderParser.ImageType m2767g(Reader reader) {
        try {
            int iMo2772a = reader.mo2772a();
            if (iMo2772a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo2774c = (iMo2772a << 8) | reader.mo2774c();
            if (iMo2774c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo2774c2 = (iMo2774c << 8) | reader.mo2774c();
            if (iMo2774c2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo2774c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo2774c2 != 1380533830) {
                return m2771m(reader, iMo2774c2);
            }
            reader.skip(4L);
            if (((reader.mo2772a() << 16) | reader.mo2772a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo2772a2 = (reader.mo2772a() << 16) | reader.mo2772a();
            if ((iMo2772a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i6 = iMo2772a2 & 255;
            if (i6 == 88) {
                reader.skip(4L);
                short sMo2774c = reader.mo2774c();
                return (sMo2774c & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sMo2774c & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i6 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo2774c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: i */
    public final boolean m2768i(byte[] bArr, int i6) {
        boolean z6 = bArr != null && i6 > f2510a.length;
        if (z6) {
            int i7 = 0;
            while (true) {
                byte[] bArr2 = f2510a;
                if (i7 >= bArr2.length) {
                    break;
                }
                if (bArr[i7] != bArr2[i7]) {
                    return false;
                }
                i7++;
            }
        }
        return z6;
    }

    /* renamed from: j */
    public final int m2769j(Reader reader) {
        while (reader.mo2774c() == 255) {
            short sMo2774c = reader.mo2774c();
            if (sMo2774c == 218) {
                return -1;
            }
            if (sMo2774c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo2772a = reader.mo2772a() - 2;
            if (sMo2774c == 225) {
                return iMo2772a;
            }
            long j6 = iMo2772a;
            if (reader.skip(j6) != j6) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: l */
    public final int m2770l(Reader reader, byte[] bArr, int i6) {
        if (reader.mo2773b(bArr, i6) != i6) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m2768i(bArr, i6)) {
            return m2765k(new C4722b(bArr, i6));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: m */
    public final ImageHeaderParser.ImageType m2771m(Reader reader, int i6) {
        if (((reader.mo2772a() << 16) | reader.mo2772a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo2772a = (reader.mo2772a() << 16) | reader.mo2772a();
        if (iMo2772a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i7 = 0;
        boolean z6 = iMo2772a == 1635150182;
        reader.skip(4L);
        int i8 = i6 - 16;
        if (i8 % 4 == 0) {
            while (i7 < 5 && i8 > 0) {
                int iMo2772a2 = (reader.mo2772a() << 16) | reader.mo2772a();
                if (iMo2772a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iMo2772a2 == 1635150182) {
                    z6 = true;
                }
                i7++;
                i8 -= 4;
            }
        }
        return z6 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
