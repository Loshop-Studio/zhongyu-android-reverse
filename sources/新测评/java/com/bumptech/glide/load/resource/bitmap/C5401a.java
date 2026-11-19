package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.InterfaceC5402b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import p117i1.AbstractC7647f;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p162m0.C8538c;
import p162m0.C8539d;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8802b;
import p195p0.InterfaceC8804d;
import p261v0.AbstractC9652y;
import p261v0.C9633f;
import p261v0.C9647t;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes3.dex */
public final class C5401a {

    /* renamed from: f */
    public static final C8538c f3753f = C8538c.m14052f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f3471c);

    /* renamed from: g */
    public static final C8538c f3754g = C8538c.m14051e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C8538c f3755h = DownsampleStrategy.f3731h;

    /* renamed from: i */
    public static final C8538c f3756i;

    /* renamed from: j */
    public static final C8538c f3757j;

    /* renamed from: k */
    public static final Set f3758k;

    /* renamed from: l */
    public static final b f3759l;

    /* renamed from: m */
    public static final Set f3760m;

    /* renamed from: n */
    public static final Queue f3761n;

    /* renamed from: a */
    public final InterfaceC8804d f3762a;

    /* renamed from: b */
    public final DisplayMetrics f3763b;

    /* renamed from: c */
    public final InterfaceC8802b f3764c;

    /* renamed from: d */
    public final List f3765d;

    /* renamed from: e */
    public final C9647t f3766e = C9647t.m16016b();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* renamed from: a */
        void mo3659a(InterfaceC8804d interfaceC8804d, Bitmap bitmap);

        /* renamed from: b */
        void mo3660b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3756i = C8538c.m14052f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3757j = C8538c.m14052f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3758k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3759l = new a();
        f3760m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f3761n = AbstractC7652k.m12690f(0);
    }

    public C5401a(List list, DisplayMetrics displayMetrics, InterfaceC8804d interfaceC8804d, InterfaceC8802b interfaceC8802b) {
        this.f3765d = list;
        this.f3763b = (DisplayMetrics) AbstractC7651j.m12683d(displayMetrics);
        this.f3762a = (InterfaceC8804d) AbstractC7651j.m12683d(interfaceC8804d);
        this.f3764c = (InterfaceC8802b) AbstractC7651j.m12683d(interfaceC8802b);
    }

    /* renamed from: a */
    public static int m3633a(double d10) {
        return m3647x((d10 / (r1 / r0)) * m3647x(m3638l(d10) * d10));
    }

    /* renamed from: c */
    public static void m3634c(ImageHeaderParser.ImageType imageType, InterfaceC5402b interfaceC5402b, b bVar, InterfaceC8804d interfaceC8804d, DownsampleStrategy downsampleStrategy, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (m3641r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fMo3601b = downsampleStrategy.mo3601b(i15, i16, i13, i14);
        if (fMo3601b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo3601b + " from: " + downsampleStrategy + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo3600a = downsampleStrategy.mo3600a(i15, i16, i13, i14);
        if (sampleSizeRoundingMo3600a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iM3647x = i15 / m3647x(fMo3601b * f10);
        int iM3647x2 = i16 / m3647x(fMo3601b * f11);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo3600a == sampleSizeRounding ? Math.max(iM3647x, iM3647x2) : Math.min(iM3647x, iM3647x2)));
        if (sampleSizeRoundingMo3600a == sampleSizeRounding && iMax < 1.0f / fMo3601b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i17 = iMax / 8;
            if (i17 > 0) {
                iFloor /= i17;
                iFloor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = iMax;
            iFloor = (int) Math.floor(f10 / f12);
            iFloor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = iMax;
            iFloor = Math.round(f10 / f13);
            iFloor2 = Math.round(f11 / f13);
        } else if (i15 % iMax == 0 && i16 % iMax == 0) {
            iFloor = i15 / iMax;
            iFloor2 = i16 / iMax;
        } else {
            int[] iArrM3639m = m3639m(interfaceC5402b, options, bVar, interfaceC8804d);
            iFloor = iArrM3639m[0];
            iFloor2 = iArrM3639m[1];
        }
        double dMo3601b = downsampleStrategy.mo3601b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = m3633a(dMo3601b);
        options.inDensity = m3638l(dMo3601b);
        if (m3642s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable("Downsampler", 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m3635i(com.bumptech.glide.load.resource.bitmap.InterfaceC5402b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C5401a.b r6, p195p0.InterfaceC8804d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo3660b()
            r4.mo3662b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p261v0.AbstractC9652y.m16041i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo3661a(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = p261v0.AbstractC9652y.m16041i()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = m3644u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.mo14712c(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = m3635i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = p261v0.AbstractC9652y.m16041i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C5401a.m3635i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, p0.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static String m3636j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m3637k() {
        BitmapFactory.Options options;
        Queue queue = f3761n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m3646w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m3638l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m3639m(InterfaceC5402b interfaceC5402b, BitmapFactory.Options options, b bVar, InterfaceC8804d interfaceC8804d) {
        options.inJustDecodeBounds = true;
        m3635i(interfaceC5402b, options, bVar, interfaceC8804d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m3640n(BitmapFactory.Options options) {
        return m3636j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m3641r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* renamed from: s */
    public static boolean m3642s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    /* renamed from: t */
    public static void m3643t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        m3636j(bitmap);
        m3640n(options);
        int i14 = options.inSampleSize;
        Thread.currentThread().getName();
        AbstractC7647f.m12666a(j10);
    }

    /* renamed from: u */
    public static IOException m3644u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + m3640n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m3645v(BitmapFactory.Options options) {
        m3646w(options);
        Queue queue = f3761n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m3646w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    public static int m3647x(double d10) {
        return (int) (d10 + 0.5d);
    }

    /* renamed from: y */
    public static void m3648y(BitmapFactory.Options options, InterfaceC8804d interfaceC8804d, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = interfaceC8804d.mo14714e(i10, i11, config);
    }

    /* renamed from: b */
    public final void m3649b(InterfaceC5402b interfaceC5402b, DecodeFormat decodeFormat, boolean z9, boolean z10, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f3766e.m16022g(i10, i11, options, z9, z10)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC5402b.mo3664d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(decodeFormat);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* renamed from: d */
    public InterfaceC8690j m3650d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C8539d c8539d) {
        return m3651e(new InterfaceC5402b.c(parcelFileDescriptor, this.f3765d, this.f3764c), i10, i11, c8539d, f3759l);
    }

    /* renamed from: e */
    public final InterfaceC8690j m3651e(InterfaceC5402b interfaceC5402b, int i10, int i11, C8539d c8539d, b bVar) {
        byte[] bArr = (byte[]) this.f3764c.mo14705c(65536, byte[].class);
        BitmapFactory.Options optionsM3637k = m3637k();
        optionsM3637k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c8539d.m14057c(f3753f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c8539d.m14057c(f3754g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8539d.m14057c(DownsampleStrategy.f3731h);
        boolean zBooleanValue = ((Boolean) c8539d.m14057c(f3756i)).booleanValue();
        C8538c c8538c = f3757j;
        try {
            return C9633f.m16002c(m3654h(interfaceC5402b, optionsM3637k, downsampleStrategy, decodeFormat, preferredColorSpace, c8539d.m14057c(c8538c) != null && ((Boolean) c8539d.m14057c(c8538c)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f3762a);
        } finally {
            m3645v(optionsM3637k);
            this.f3764c.put(bArr);
        }
    }

    /* renamed from: f */
    public InterfaceC8690j m3652f(InputStream inputStream, int i10, int i11, C8539d c8539d, b bVar) {
        return m3651e(new InterfaceC5402b.b(inputStream, this.f3765d, this.f3764c), i10, i11, c8539d, bVar);
    }

    /* renamed from: g */
    public InterfaceC8690j m3653g(ByteBuffer byteBuffer, int i10, int i11, C8539d c8539d) {
        return m3651e(new InterfaceC5402b.a(byteBuffer, this.f3765d, this.f3764c), i10, i11, c8539d, f3759l);
    }

    /* renamed from: h */
    public final Bitmap m3654h(InterfaceC5402b interfaceC5402b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z9, int i10, int i11, boolean z10, b bVar) {
        int i12;
        String str;
        int iRound;
        long jM12667b = AbstractC7647f.m12667b();
        int[] iArrM3639m = m3639m(interfaceC5402b, options, bVar, this.f3762a);
        int i13 = iArrM3639m[0];
        int i14 = iArrM3639m[1];
        String str2 = options.outMimeType;
        boolean z11 = (i13 == -1 || i14 == -1) ? false : z9;
        int iMo3663c = interfaceC5402b.mo3663c();
        int iM16042j = AbstractC9652y.m16042j(iMo3663c);
        boolean zM16045m = AbstractC9652y.m16045m(iMo3663c);
        int i15 = i10;
        if (i15 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (m3641r(iM16042j)) {
            i12 = i11;
            i15 = i14;
        } else {
            i12 = i11;
            i15 = i13;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = m3641r(iM16042j) ? i13 : i14;
        }
        ImageHeaderParser.ImageType imageTypeMo3664d = interfaceC5402b.mo3664d();
        m3634c(imageTypeMo3664d, interfaceC5402b, bVar, this.f3762a, downsampleStrategy, iM16042j, i13, i14, i15, i12, options);
        int i16 = i15;
        int i17 = i12;
        m3649b(interfaceC5402b, decodeFormat, z11, zM16045m, options, i16, i17);
        int i18 = Build.VERSION.SDK_INT;
        if (m3658z(imageTypeMo3664d)) {
            if (i13 < 0 || i14 < 0 || !z10) {
                float f10 = m3642s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f11 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i13 / f11);
                int iCeil2 = (int) Math.ceil(i14 / f11);
                iRound = Math.round(iCeil * f10);
                int iRound2 = Math.round(iCeil2 * f10);
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i17 = iRound2;
            } else {
                iRound = i16;
                str = "Downsampler";
            }
            if (iRound > 0 && i17 > 0) {
                m3648y(options, this.f3762a, iRound, i17);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace != null) {
            if (i18 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i18 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapM3635i = m3635i(interfaceC5402b, options, bVar, this.f3762a);
        bVar.mo3659a(this.f3762a, bitmapM3635i);
        if (Log.isLoggable(str, 2)) {
            m3643t(i13, i14, str2, options, bitmapM3635i, i10, i11, jM12667b);
        }
        if (bitmapM3635i == null) {
            return null;
        }
        bitmapM3635i.setDensity(this.f3763b.densityDpi);
        Bitmap bitmapM16046n = AbstractC9652y.m16046n(this.f3762a, bitmapM3635i, iMo3663c);
        if (!bitmapM3635i.equals(bitmapM16046n)) {
            this.f3762a.mo14712c(bitmapM3635i);
        }
        return bitmapM16046n;
    }

    /* renamed from: o */
    public boolean m3655o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m3392c();
    }

    /* renamed from: p */
    public boolean m3656p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m3657q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m3658z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C5401a.b
        /* renamed from: b */
        public void mo3660b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5401a.b
        /* renamed from: a */
        public void mo3659a(InterfaceC8804d interfaceC8804d, Bitmap bitmap) {
        }
    }
}
