package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;
import p117i1.AbstractC7651j;
import p195p0.InterfaceC8802b;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f3719a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f3720b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo3592a();

        /* renamed from: b */
        int mo3593b(byte[] bArr, int i10);

        /* renamed from: c */
        short mo3594c();

        long skip(long j10);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C5385a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f3721a;

        public C5385a(ByteBuffer byteBuffer) {
            this.f3721a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo3592a() {
            return (mo3594c() << 8) | mo3594c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo3593b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f3721a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f3721a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo3594c() throws Reader.EndOfFileException {
            if (this.f3721a.remaining() >= 1) {
                return (short) (this.f3721a.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f3721a.remaining(), j10);
            ByteBuffer byteBuffer = this.f3721a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C5386b {

        /* renamed from: a */
        public final ByteBuffer f3722a;

        public C5386b(byte[] bArr, int i10) {
            this.f3722a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: a */
        public short m3595a(int i10) {
            if (m3597c(i10, 2)) {
                return this.f3722a.getShort(i10);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m3596b(int i10) {
            if (m3597c(i10, 4)) {
                return this.f3722a.getInt(i10);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m3597c(int i10, int i11) {
            return this.f3722a.remaining() - i10 >= i11;
        }

        /* renamed from: d */
        public int m3598d() {
            return this.f3722a.remaining();
        }

        /* renamed from: e */
        public void m3599e(ByteOrder byteOrder) {
            this.f3722a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C5387c implements Reader {

        /* renamed from: a */
        public final InputStream f3723a;

        public C5387c(InputStream inputStream) {
            this.f3723a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo3592a() {
            return (mo3594c() << 8) | mo3594c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo3593b(byte[] bArr, int i10) throws Reader.EndOfFileException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f3723a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo3594c() throws IOException {
            int i10 = this.f3723a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f3723a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f3723a.read() == -1) {
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
    public static int m3583e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* renamed from: h */
    public static boolean m3584h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* renamed from: k */
    public static int m3585k(C5386b c5386b) {
        ByteOrder byteOrder;
        short sM3595a = c5386b.m3595a(6);
        if (sM3595a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM3595a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c5386b.m3599e(byteOrder);
        int iM3596b = c5386b.m3596b(10) + 6;
        short sM3595a2 = c5386b.m3595a(iM3596b);
        for (int i10 = 0; i10 < sM3595a2; i10++) {
            int iM3583e = m3583e(iM3596b, i10);
            if (c5386b.m3595a(iM3583e) == 274) {
                short sM3595a3 = c5386b.m3595a(iM3583e + 2);
                if (sM3595a3 < 1 || sM3595a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM3596b2 = c5386b.m3596b(iM3583e + 4);
                    if (iM3596b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i11 = iM3596b2 + f3720b[sM3595a3];
                        if (i11 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i12 = iM3583e + 8;
                            if (i12 < 0 || i12 > c5386b.m3598d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i11 >= 0 && i11 + i12 <= c5386b.m3598d()) {
                                    return c5386b.m3595a(i12);
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
    public int mo3376a(ByteBuffer byteBuffer, InterfaceC8802b interfaceC8802b) {
        return m3586f(new C5385a((ByteBuffer) AbstractC7651j.m12683d(byteBuffer)), (InterfaceC8802b) AbstractC7651j.m12683d(interfaceC8802b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo3377b(ByteBuffer byteBuffer) {
        return m3587g(new C5385a((ByteBuffer) AbstractC7651j.m12683d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public int mo3378c(InputStream inputStream, InterfaceC8802b interfaceC8802b) {
        return m3586f(new C5387c((InputStream) AbstractC7651j.m12683d(inputStream)), (InterfaceC8802b) AbstractC7651j.m12683d(interfaceC8802b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public ImageHeaderParser.ImageType mo3379d(InputStream inputStream) {
        return m3587g(new C5387c((InputStream) AbstractC7651j.m12683d(inputStream)));
    }

    /* renamed from: f */
    public final int m3586f(Reader reader, InterfaceC8802b interfaceC8802b) {
        try {
            if (!m3584h(reader.mo3592a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM3589j = m3589j(reader);
            if (iM3589j == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC8802b.mo14705c(iM3589j, byte[].class);
            try {
                return m3590l(reader, bArr, iM3589j);
            } finally {
                interfaceC8802b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public final ImageHeaderParser.ImageType m3587g(Reader reader) {
        try {
            int iMo3592a = reader.mo3592a();
            if (iMo3592a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo3594c = (iMo3592a << 8) | reader.mo3594c();
            if (iMo3594c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo3594c2 = (iMo3594c << 8) | reader.mo3594c();
            if (iMo3594c2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo3594c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo3594c2 != 1380533830) {
                return m3591m(reader, iMo3594c2);
            }
            reader.skip(4L);
            if (((reader.mo3592a() << 16) | reader.mo3592a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo3592a2 = (reader.mo3592a() << 16) | reader.mo3592a();
            if ((iMo3592a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iMo3592a2 & 255;
            if (i10 == 88) {
                reader.skip(4L);
                short sMo3594c = reader.mo3594c();
                return (sMo3594c & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sMo3594c & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo3594c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: i */
    public final boolean m3588i(byte[] bArr, int i10) {
        boolean z9 = bArr != null && i10 > f3719a.length;
        if (z9) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f3719a;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z9;
    }

    /* renamed from: j */
    public final int m3589j(Reader reader) {
        while (reader.mo3594c() == 255) {
            short sMo3594c = reader.mo3594c();
            if (sMo3594c == 218) {
                return -1;
            }
            if (sMo3594c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo3592a = reader.mo3592a() - 2;
            if (sMo3594c == 225) {
                return iMo3592a;
            }
            long j10 = iMo3592a;
            if (reader.skip(j10) != j10) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: l */
    public final int m3590l(Reader reader, byte[] bArr, int i10) {
        if (reader.mo3593b(bArr, i10) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m3588i(bArr, i10)) {
            return m3585k(new C5386b(bArr, i10));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: m */
    public final ImageHeaderParser.ImageType m3591m(Reader reader, int i10) {
        if (((reader.mo3592a() << 16) | reader.mo3592a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo3592a = (reader.mo3592a() << 16) | reader.mo3592a();
        if (iMo3592a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z9 = iMo3592a == 1635150182;
        reader.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iMo3592a2 = (reader.mo3592a() << 16) | reader.mo3592a();
                if (iMo3592a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iMo3592a2 == 1635150182) {
                    z9 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z9 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
