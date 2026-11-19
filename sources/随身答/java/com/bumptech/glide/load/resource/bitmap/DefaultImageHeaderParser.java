package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import kotlin.UByte;
import p091e1.AbstractC7837i;
import p164l0.InterfaceC8865b;

/* loaded from: classes3.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f3515a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f3516b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo3243a();

        /* renamed from: b */
        int mo3244b(byte[] bArr, int i9);

        /* renamed from: c */
        short mo3245c();

        long skip(long j9);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    public static final class C5496a implements Reader {

        /* renamed from: a */
        public final ByteBuffer f3517a;

        public C5496a(ByteBuffer byteBuffer) {
            this.f3517a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo3243a() {
            return (mo3245c() << 8) | mo3245c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo3244b(byte[] bArr, int i9) {
            int iMin = Math.min(i9, this.f3517a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f3517a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo3245c() throws Reader.EndOfFileException {
            if (this.f3517a.remaining() >= 1) {
                return (short) (this.f3517a.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j9) {
            int iMin = (int) Math.min(this.f3517a.remaining(), j9);
            ByteBuffer byteBuffer = this.f3517a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    public static final class C5497b {

        /* renamed from: a */
        public final ByteBuffer f3518a;

        public C5497b(byte[] bArr, int i9) {
            this.f3518a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i9);
        }

        /* renamed from: a */
        public short m3246a(int i9) {
            if (m3248c(i9, 2)) {
                return this.f3518a.getShort(i9);
            }
            return (short) -1;
        }

        /* renamed from: b */
        public int m3247b(int i9) {
            if (m3248c(i9, 4)) {
                return this.f3518a.getInt(i9);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean m3248c(int i9, int i10) {
            return this.f3518a.remaining() - i9 >= i10;
        }

        /* renamed from: d */
        public int m3249d() {
            return this.f3518a.remaining();
        }

        /* renamed from: e */
        public void m3250e(ByteOrder byteOrder) {
            this.f3518a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    public static final class C5498c implements Reader {

        /* renamed from: a */
        public final InputStream f3519a;

        public C5498c(InputStream inputStream) {
            this.f3519a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: a */
        public int mo3243a() {
            return (mo3245c() << 8) | mo3245c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: b */
        public int mo3244b(byte[] bArr, int i9) throws Reader.EndOfFileException {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i9 && (i11 = this.f3519a.read(bArr, i10, i9 - i10)) != -1) {
                i10 += i11;
            }
            if (i10 == 0 && i11 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i10;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        /* renamed from: c */
        public short mo3245c() throws IOException {
            int i9 = this.f3519a.read();
            if (i9 != -1) {
                return (short) i9;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long skip(long j9) throws IOException {
            if (j9 < 0) {
                return 0L;
            }
            long j10 = j9;
            while (j10 > 0) {
                long jSkip = this.f3519a.skip(j10);
                if (jSkip <= 0) {
                    if (this.f3519a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j10 -= jSkip;
            }
            return j9 - j10;
        }
    }

    /* renamed from: d */
    public static int m3235d(int i9, int i10) {
        return i9 + 2 + (i10 * 12);
    }

    /* renamed from: g */
    public static boolean m3236g(int i9) {
        return (i9 & 65496) == 65496 || i9 == 19789 || i9 == 18761;
    }

    /* renamed from: j */
    public static int m3237j(C5497b c5497b) {
        ByteOrder byteOrder;
        short sM3246a = c5497b.m3246a(6);
        if (sM3246a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sM3246a != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        c5497b.m3250e(byteOrder);
        int iM3247b = c5497b.m3247b(10) + 6;
        short sM3246a2 = c5497b.m3246a(iM3247b);
        for (int i9 = 0; i9 < sM3246a2; i9++) {
            int iM3235d = m3235d(iM3247b, i9);
            if (c5497b.m3246a(iM3235d) == 274) {
                short sM3246a3 = c5497b.m3246a(iM3235d + 2);
                if (sM3246a3 < 1 || sM3246a3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int iM3247b2 = c5497b.m3247b(iM3235d + 4);
                    if (iM3247b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i10 = iM3247b2 + f3516b[sM3246a3];
                        if (i10 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i11 = iM3235d + 8;
                            if (i11 < 0 || i11 > c5497b.m3249d()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i10 >= 0 && i10 + i11 <= c5497b.m3249d()) {
                                    return c5497b.m3246a(i11);
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
    public int mo3078a(InputStream inputStream, InterfaceC8865b interfaceC8865b) {
        return m3238e(new C5498c((InputStream) AbstractC7837i.m12256d(inputStream)), (InterfaceC8865b) AbstractC7837i.m12256d(interfaceC8865b));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo3079b(ByteBuffer byteBuffer) {
        return m3239f(new C5496a((ByteBuffer) AbstractC7837i.m12256d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo3080c(InputStream inputStream) {
        return m3239f(new C5498c((InputStream) AbstractC7837i.m12256d(inputStream)));
    }

    /* renamed from: e */
    public final int m3238e(Reader reader, InterfaceC8865b interfaceC8865b) {
        try {
            if (!m3236g(reader.mo3243a())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iM3241i = m3241i(reader);
            if (iM3241i == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) interfaceC8865b.mo13725c(iM3241i, byte[].class);
            try {
                return m3242k(reader, bArr, iM3241i);
            } finally {
                interfaceC8865b.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public final ImageHeaderParser.ImageType m3239f(Reader reader) {
        try {
            int iMo3243a = reader.mo3243a();
            if (iMo3243a == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iMo3245c = (iMo3243a << 8) | reader.mo3245c();
            if (iMo3245c == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iMo3245c2 = (iMo3245c << 8) | reader.mo3245c();
            if (iMo3245c2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.mo3245c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iMo3245c2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            reader.skip(4L);
            if (((reader.mo3243a() << 16) | reader.mo3243a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iMo3243a2 = (reader.mo3243a() << 16) | reader.mo3243a();
            if ((iMo3243a2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i9 = iMo3243a2 & 255;
            if (i9 == 88) {
                reader.skip(4L);
                return (reader.mo3245c() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i9 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            reader.skip(4L);
            return (reader.mo3245c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: h */
    public final boolean m3240h(byte[] bArr, int i9) {
        boolean z9 = bArr != null && i9 > f3515a.length;
        if (z9) {
            int i10 = 0;
            while (true) {
                byte[] bArr2 = f3515a;
                if (i10 >= bArr2.length) {
                    break;
                }
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
        return z9;
    }

    /* renamed from: i */
    public final int m3241i(Reader reader) {
        while (reader.mo3245c() == 255) {
            short sMo3245c = reader.mo3245c();
            if (sMo3245c == 218) {
                return -1;
            }
            if (sMo3245c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int iMo3243a = reader.mo3243a() - 2;
            if (sMo3245c == 225) {
                return iMo3243a;
            }
            long j9 = iMo3243a;
            if (reader.skip(j9) != j9) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: k */
    public final int m3242k(Reader reader, byte[] bArr, int i9) {
        if (reader.mo3244b(bArr, i9) != i9) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (m3240h(bArr, i9)) {
            return m3237j(new C5497b(bArr, i9));
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }
}
