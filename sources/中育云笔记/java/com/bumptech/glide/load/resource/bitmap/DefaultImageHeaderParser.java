package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import anet.channel.request.Request;
import com.bumptech.glide.load.ImageHeaderParser;
import com.tendcloud.tenddata.C7863av;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p109d1.AbstractC8909j;
import p213k0.InterfaceC9770b;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f4922a = "Exif\u0000\u0000".getBytes(Charset.forName(Request.DEFAULT_CHARSET));

    /* renamed from: b */
    public static final int[] f4923b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo4242a();

        /* renamed from: b */
        short mo4243b();

        int read(byte[] bArr, int i10);

        long skip(long j10);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C5853a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f4924a;

        public C5853a(ByteBuffer byteBuffer) {
            this.f4924a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo4242a() {
            return (mo4243b() << 8) | mo4243b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public short mo4243b() throws Reader.EndOfFileException {
            if (this.f4924a.remaining() >= 1) {
                return (short) (this.f4924a.get() & C7863av.f14384i);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f4924a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f4924a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f4924a.remaining(), j10);
            ByteBuffer byteBuffer = this.f4924a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C5854b {

        /* renamed from: a */
        public final ByteBuffer f4925a;

        public C5854b(byte[] bArr, int i10) {
            this.f4925a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: a */
        public short m4244a(int i10) {
            if (m4246c(i10, 2)) {
                return this.f4925a.getShort(i10);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m4245b(int i10) {
            if (m4246c(i10, 4)) {
                return this.f4925a.getInt(i10);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m4246c(int i10, int i11) {
            return this.f4925a.remaining() - i10 >= i11;
        }

        /* renamed from: d */
        public int m4247d() {
            return this.f4925a.remaining();
        }

        /* renamed from: e */
        public void m4248e(ByteOrder byteOrder) {
            this.f4925a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C5855c implements Reader {

        /* renamed from: a */
        public final InputStream f4926a;

        public C5855c(InputStream inputStream) {
            this.f4926a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo4242a() {
            return (mo4243b() << 8) | mo4243b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public short mo4243b() throws IOException {
            int i10 = this.f4926a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int read(byte[] bArr, int i10) throws Reader.EndOfFileException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f4926a.read(bArr, i11, i10 - i11)) != -1) {
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
                long jSkip = this.f4926a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f4926a.read() == -1) {
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
    public static int m4233e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* renamed from: h */
    public static boolean m4234h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* renamed from: k */
    public static int m4235k(C5854b c5854b) {
        ByteOrder byteOrder;
        short sM4244a = c5854b.m4244a(6);
        if (sM4244a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM4244a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c5854b.m4248e(byteOrder);
        int iM4245b = c5854b.m4245b(10) + 6;
        short sM4244a2 = c5854b.m4244a(iM4245b);
        for (int i10 = 0; i10 < sM4244a2; i10++) {
            int iM4233e = m4233e(iM4245b, i10);
            if (c5854b.m4244a(iM4233e) == 274) {
                short sM4244a3 = c5854b.m4244a(iM4233e + 2);
                if (sM4244a3 < 1 || sM4244a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM4245b2 = c5854b.m4245b(iM4233e + 4);
                    if (iM4245b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i11 = iM4245b2 + f4923b[sM4244a3];
                        if (i11 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i12 = iM4233e + 8;
                            if (i12 < 0 || i12 > c5854b.m4247d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i11 >= 0 && i11 + i12 <= c5854b.m4247d()) {
                                    return c5854b.m4244a(i12);
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
    public int mo4029a(InputStream inputStream, InterfaceC9770b interfaceC9770b) {
        return m4236f(new C5855c((InputStream) AbstractC8909j.m17468d(inputStream)), (InterfaceC9770b) AbstractC8909j.m17468d(interfaceC9770b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo4030b(ByteBuffer byteBuffer) {
        return m4237g(new C5853a((ByteBuffer) AbstractC8909j.m17468d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo4031c(InputStream inputStream) {
        return m4237g(new C5855c((InputStream) AbstractC8909j.m17468d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo4032d(ByteBuffer byteBuffer, InterfaceC9770b interfaceC9770b) {
        return m4236f(new C5853a((ByteBuffer) AbstractC8909j.m17468d(byteBuffer)), (InterfaceC9770b) AbstractC8909j.m17468d(interfaceC9770b));
    }

    /* renamed from: f */
    public final int m4236f(Reader reader, InterfaceC9770b interfaceC9770b) {
        try {
            if (!m4234h(reader.mo4242a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM4239j = m4239j(reader);
            if (iM4239j == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC9770b.mo19703c(iM4239j, byte[].class);
            try {
                return m4240l(reader, bArr, iM4239j);
            } finally {
                interfaceC9770b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public final ImageHeaderParser.ImageType m4237g(Reader reader) {
        try {
            int iMo4242a = reader.mo4242a();
            if (iMo4242a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo4243b = (iMo4242a << 8) | reader.mo4243b();
            if (iMo4243b == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo4243b2 = (iMo4243b << 8) | reader.mo4243b();
            if (iMo4243b2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo4243b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo4243b2 != 1380533830) {
                return m4241m(reader, iMo4243b2);
            }
            reader.skip(4L);
            if (((reader.mo4242a() << 16) | reader.mo4242a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo4242a2 = (reader.mo4242a() << 16) | reader.mo4242a();
            if ((iMo4242a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iMo4242a2 & 255;
            if (i10 == 88) {
                reader.skip(4L);
                short sMo4243b = reader.mo4243b();
                return (sMo4243b & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (sMo4243b & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i10 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo4243b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: i */
    public final boolean m4238i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f4922a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f4922a;
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
    public final int m4239j(Reader reader) {
        while (reader.mo4243b() == 255) {
            short sMo4243b = reader.mo4243b();
            if (sMo4243b == 218) {
                return -1;
            }
            if (sMo4243b == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo4242a = reader.mo4242a() - 2;
            if (sMo4243b == 225) {
                return iMo4242a;
            }
            long j10 = iMo4242a;
            if (reader.skip(j10) != j10) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: l */
    public final int m4240l(Reader reader, byte[] bArr, int i10) {
        if (reader.read(bArr, i10) != i10) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m4238i(bArr, i10)) {
            return m4235k(new C5854b(bArr, i10));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: m */
    public final ImageHeaderParser.ImageType m4241m(Reader reader, int i10) {
        if (((reader.mo4242a() << 16) | reader.mo4242a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo4242a = (reader.mo4242a() << 16) | reader.mo4242a();
        if (iMo4242a == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = iMo4242a == 1635150182;
        reader.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iMo4242a2 = (reader.mo4242a() << 16) | reader.mo4242a();
                if (iMo4242a2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iMo4242a2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
