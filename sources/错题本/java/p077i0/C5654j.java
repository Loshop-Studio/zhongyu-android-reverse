package p077i0;

import android.support.v4.media.AbstractC0037f;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p024c0.C3210g;
import p129o2.C6268a;
import p185v7.AbstractC6675d;
import p202y.InterfaceC6759b;

/* renamed from: i0.j */
/* loaded from: classes2.dex */
public final class C5654j implements InterfaceC6759b {

    /* renamed from: a */
    public static final byte[] f8792a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f8793b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: d */
    public static ImageHeaderParser$ImageType m4979d(InterfaceC5653i interfaceC5653i) {
        try {
            int iMo4977f = interfaceC5653i.mo4977f();
            if (iMo4977f == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo4978u = (iMo4977f << 8) | interfaceC5653i.mo4978u();
            if (iMo4978u == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo4978u2 = (iMo4978u << 8) | interfaceC5653i.mo4978u();
            if (iMo4978u2 == -1991225785) {
                interfaceC5653i.skip(21L);
                try {
                    return interfaceC5653i.mo4978u() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo4978u2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            interfaceC5653i.skip(4L);
            if (((interfaceC5653i.mo4977f() << 16) | interfaceC5653i.mo4977f()) != 1464156752) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iMo4977f2 = (interfaceC5653i.mo4977f() << 16) | interfaceC5653i.mo4977f();
            if ((iMo4977f2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int i = iMo4977f2 & 255;
            if (i == 88) {
                interfaceC5653i.skip(4L);
                return (interfaceC5653i.mo4978u() & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (i != 76) {
                return ImageHeaderParser$ImageType.WEBP;
            }
            interfaceC5653i.skip(4L);
            return (interfaceC5653i.mo4978u() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return -1;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m4980e(p129o2.C6268a r9) throws java.io.IOException {
        /*
        L0:
            short r0 = r9.mo4978u()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown segmentId="
            r9.<init>(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.mo4978u()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L6a
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L3d
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L3d:
            int r1 = r9.mo4977f()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = android.support.v4.media.AbstractC0037f.m99x(r5, r9, r0, r2, r1)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p077i0.C5654j.m4980e(o2.a):int");
    }

    /* renamed from: f */
    public static int m4981f(C6268a c6268a, byte[] bArr, int i) throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteOrder byteOrder;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i9 < i && (i10 = ((InputStream) c6268a.f10022b).read(bArr, i9, i - i9)) != -1) {
            i9 += i10;
        }
        if (i9 == 0 && i10 == -1) {
            throw new DefaultImageHeaderParser$Reader$EndOfFileException();
        }
        if (i9 == i) {
            short s8 = 1;
            byte[] bArr2 = f8792a;
            boolean z8 = bArr != null && i > bArr2.length;
            if (z8) {
                int i11 = 0;
                while (true) {
                    if (i11 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i11] != bArr2[i11]) {
                        z8 = false;
                        break;
                    }
                    i11++;
                }
            }
            if (z8) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
                short s9 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
                if (s9 != 18761) {
                    if (s9 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s9));
                    }
                    byteOrder = ByteOrder.BIG_ENDIAN;
                } else {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
                int i12 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
                int i13 = i12 + 6;
                short s10 = byteBuffer.remaining() - i13 >= 2 ? byteBuffer.getShort(i13) : (short) -1;
                while (i8 < s10) {
                    int i14 = (i8 * 12) + i12 + 8;
                    short s11 = byteBuffer.remaining() - i14 >= 2 ? byteBuffer.getShort(i14) : (short) -1;
                    if (s11 == 274) {
                        int i15 = i14 + 2;
                        short s12 = byteBuffer.remaining() - i15 >= 2 ? byteBuffer.getShort(i15) : (short) -1;
                        if (s12 >= s8 && s12 <= 12) {
                            int i16 = i14 + 4;
                            int i17 = byteBuffer.remaining() - i16 >= 4 ? byteBuffer.getInt(i16) : -1;
                            if (i17 >= 0) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sbM99x = AbstractC0037f.m99x("Got tagIndex=", " tagType=", i8, " formatCode=", s11);
                                    sbM99x.append((int) s12);
                                    sbM99x.append(" componentCount=");
                                    sbM99x.append(i17);
                                    Log.d("DfltImageHeaderParser", sbM99x.toString());
                                }
                                int i18 = i17 + f8793b[s12];
                                if (i18 <= 4) {
                                    int i19 = i14 + 8;
                                    if (i19 < 0 || i19 > byteBuffer.remaining()) {
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i19 + " tagType=" + ((int) s11));
                                        }
                                    } else {
                                        if (i18 >= 0 && i18 + i19 <= byteBuffer.remaining()) {
                                            if (byteBuffer.remaining() - i19 >= 2) {
                                                return byteBuffer.getShort(i19);
                                            }
                                            return -1;
                                        }
                                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                            Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s11));
                                        }
                                    }
                                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s12));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s12));
                        }
                    }
                    i8++;
                    s8 = 1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + i9);
            return -1;
        }
        return -1;
    }

    @Override // p202y.InterfaceC6759b
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo4982a(ByteBuffer byteBuffer) {
        AbstractC6675d.m6344f(byteBuffer, "Argument must not be null");
        return m4979d(new C5652h(byteBuffer, 0));
    }

    @Override // p202y.InterfaceC6759b
    /* renamed from: b */
    public final ImageHeaderParser$ImageType mo4983b(InputStream inputStream) {
        return m4979d(new C6268a(inputStream, 19));
    }

    @Override // p202y.InterfaceC6759b
    /* renamed from: c */
    public final int mo4984c(InputStream inputStream, C3210g c3210g) throws IOException {
        C6268a c6268a = new C6268a(inputStream, 19);
        AbstractC6675d.m6344f(c3210g, "Argument must not be null");
        try {
            int iMo4977f = c6268a.mo4977f();
            if ((iMo4977f & 65496) == 65496 || iMo4977f == 19789 || iMo4977f == 18761) {
                int iM4980e = m4980e(c6268a);
                if (iM4980e != -1) {
                    byte[] bArr = (byte[]) c3210g.m2155e(byte[].class, iM4980e);
                    try {
                        return m4981f(c6268a, bArr, iM4980e);
                    } finally {
                        c3210g.m2160j(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iMo4977f);
                return -1;
            }
        } catch (DefaultImageHeaderParser$Reader$EndOfFileException unused) {
        }
        return -1;
    }
}
