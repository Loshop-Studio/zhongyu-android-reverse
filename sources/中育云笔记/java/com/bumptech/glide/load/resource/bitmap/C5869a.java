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
import com.bumptech.glide.load.resource.bitmap.InterfaceC5870b;
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
import p109d1.AbstractC8905f;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p168h0.C9437d;
import p168h0.C9438e;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9770b;
import p213k0.InterfaceC9772d;
import p298q0.AbstractC10716y;
import p298q0.C10697f;
import p298q0.C10710s;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes3.dex */
public final class C5869a {

    /* renamed from: f */
    public static final C9437d f4956f = C9437d.m18621f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f4674e);

    /* renamed from: g */
    public static final C9437d f4957g = C9437d.m18620e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C9437d f4958h = DownsampleStrategy.f4934h;

    /* renamed from: i */
    public static final C9437d f4959i;

    /* renamed from: j */
    public static final C9437d f4960j;

    /* renamed from: k */
    public static final Set f4961k;

    /* renamed from: l */
    public static final b f4962l;

    /* renamed from: m */
    public static final Set f4963m;

    /* renamed from: n */
    public static final Queue f4964n;

    /* renamed from: a */
    public final InterfaceC9772d f4965a;

    /* renamed from: b */
    public final DisplayMetrics f4966b;

    /* renamed from: c */
    public final InterfaceC9770b f4967c;

    /* renamed from: d */
    public final List f4968d;

    /* renamed from: e */
    public final C10710s f4969e = C10710s.m22673b();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* renamed from: a */
        void mo4308a(InterfaceC9772d interfaceC9772d, Bitmap bitmap);

        /* renamed from: b */
        void mo4309b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f4959i = C9437d.m18621f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f4960j = C9437d.m18621f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f4961k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4962l = new a();
        f4963m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f4964n = AbstractC8910k.m17475f(0);
    }

    public C5869a(List list, DisplayMetrics displayMetrics, InterfaceC9772d interfaceC9772d, InterfaceC9770b interfaceC9770b) {
        this.f4968d = list;
        this.f4966b = (DisplayMetrics) AbstractC8909j.m17468d(displayMetrics);
        this.f4965a = (InterfaceC9772d) AbstractC8909j.m17468d(interfaceC9772d);
        this.f4967c = (InterfaceC9770b) AbstractC8909j.m17468d(interfaceC9770b);
    }

    /* renamed from: a */
    public static int m4282a(double d10) {
        return m4296x((d10 / (r1 / r0)) * m4296x(m4287l(d10) * d10));
    }

    /* renamed from: c */
    public static void m4283c(ImageHeaderParser.ImageType imageType, InterfaceC5870b interfaceC5870b, b bVar, InterfaceC9772d interfaceC9772d, DownsampleStrategy downsampleStrategy, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
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
        if (m4290r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fMo4250b = downsampleStrategy.mo4250b(i15, i16, i13, i14);
        if (fMo4250b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo4250b + " from: " + downsampleStrategy + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo4249a = downsampleStrategy.mo4249a(i15, i16, i13, i14);
        if (sampleSizeRoundingMo4249a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iM4296x = i15 / m4296x(fMo4250b * f10);
        int iM4296x2 = i16 / m4296x(fMo4250b * f11);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo4249a == sampleSizeRounding ? Math.max(iM4296x, iM4296x2) : Math.min(iM4296x, iM4296x2)));
        if (sampleSizeRoundingMo4249a == sampleSizeRounding && iMax < 1.0f / fMo4250b) {
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
            int[] iArrM4288m = m4288m(interfaceC5870b, options, bVar, interfaceC9772d);
            iFloor = iArrM4288m[0];
            iFloor2 = iArrM4288m[1];
        }
        double dMo4250b = downsampleStrategy.mo4250b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = m4282a(dMo4250b);
        options.inDensity = m4287l(dMo4250b);
        if (m4291s(options)) {
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
    public static android.graphics.Bitmap m4284i(com.bumptech.glide.load.resource.bitmap.InterfaceC5870b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C5869a.b r6, p213k0.InterfaceC9772d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo4309b()
            r4.mo4311b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p298q0.AbstractC10716y.m22697h()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo4310a(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = p298q0.AbstractC10716y.m22697h()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = m4293u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.mo19710c(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = m4284i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = p298q0.AbstractC10716y.m22697h()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C5869a.m4284i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, k0.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static String m4285j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m4286k() {
        BitmapFactory.Options options;
        Queue queue = f4964n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m4295w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m4287l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m4288m(InterfaceC5870b interfaceC5870b, BitmapFactory.Options options, b bVar, InterfaceC9772d interfaceC9772d) {
        options.inJustDecodeBounds = true;
        m4284i(interfaceC5870b, options, bVar, interfaceC9772d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m4289n(BitmapFactory.Options options) {
        return m4285j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m4290r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* renamed from: s */
    public static boolean m4291s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    /* renamed from: t */
    public static void m4292t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        m4285j(bitmap);
        m4289n(options);
        int i14 = options.inSampleSize;
        Thread.currentThread().getName();
        AbstractC8905f.m17451a(j10);
    }

    /* renamed from: u */
    public static IOException m4293u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + m4289n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m4294v(BitmapFactory.Options options) {
        m4295w(options);
        Queue queue = f4964n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m4295w(BitmapFactory.Options options) {
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
    public static int m4296x(double d10) {
        return (int) (d10 + 0.5d);
    }

    /* renamed from: y */
    public static void m4297y(BitmapFactory.Options options, InterfaceC9772d interfaceC9772d, int i10, int i11) {
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
        options.inBitmap = interfaceC9772d.mo19712e(i10, i11, config);
    }

    /* renamed from: b */
    public final void m4298b(InterfaceC5870b interfaceC5870b, DecodeFormat decodeFormat, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f4969e.m22679g(i10, i11, options, z10, z11)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC5870b.mo4313d().hasAlpha();
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
    public InterfaceC9657j m4299d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C9438e c9438e) {
        return m4300e(new InterfaceC5870b.c(parcelFileDescriptor, this.f4968d, this.f4967c), i10, i11, c9438e, f4962l);
    }

    /* renamed from: e */
    public final InterfaceC9657j m4300e(InterfaceC5870b interfaceC5870b, int i10, int i11, C9438e c9438e, b bVar) {
        byte[] bArr = (byte[]) this.f4967c.mo19703c(65536, byte[].class);
        BitmapFactory.Options optionsM4286k = m4286k();
        optionsM4286k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c9438e.m18626c(f4956f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c9438e.m18626c(f4957g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c9438e.m18626c(DownsampleStrategy.f4934h);
        boolean zBooleanValue = ((Boolean) c9438e.m18626c(f4959i)).booleanValue();
        C9437d c9437d = f4960j;
        try {
            return C10697f.m22659c(m4303h(interfaceC5870b, optionsM4286k, downsampleStrategy, decodeFormat, preferredColorSpace, c9438e.m18626c(c9437d) != null && ((Boolean) c9438e.m18626c(c9437d)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f4965a);
        } finally {
            m4294v(optionsM4286k);
            this.f4967c.put(bArr);
        }
    }

    /* renamed from: f */
    public InterfaceC9657j m4301f(InputStream inputStream, int i10, int i11, C9438e c9438e, b bVar) {
        return m4300e(new InterfaceC5870b.b(inputStream, this.f4968d, this.f4967c), i10, i11, c9438e, bVar);
    }

    /* renamed from: g */
    public InterfaceC9657j m4302g(ByteBuffer byteBuffer, int i10, int i11, C9438e c9438e) {
        return m4300e(new InterfaceC5870b.a(byteBuffer, this.f4968d, this.f4967c), i10, i11, c9438e, f4962l);
    }

    /* renamed from: h */
    public final Bitmap m4303h(InterfaceC5870b interfaceC5870b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, b bVar) {
        int i12;
        String str;
        int iRound;
        long jM17452b = AbstractC8905f.m17452b();
        int[] iArrM4288m = m4288m(interfaceC5870b, options, bVar, this.f4965a);
        int i13 = iArrM4288m[0];
        int i14 = iArrM4288m[1];
        String str2 = options.outMimeType;
        boolean z12 = (i13 == -1 || i14 == -1) ? false : z10;
        int iMo4312c = interfaceC5870b.mo4312c();
        int iM22698i = AbstractC10716y.m22698i(iMo4312c);
        boolean zM22701l = AbstractC10716y.m22701l(iMo4312c);
        int i15 = i10;
        if (i15 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (m4290r(iM22698i)) {
            i12 = i11;
            i15 = i14;
        } else {
            i12 = i11;
            i15 = i13;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = m4290r(iM22698i) ? i13 : i14;
        }
        ImageHeaderParser.ImageType imageTypeMo4313d = interfaceC5870b.mo4313d();
        m4283c(imageTypeMo4313d, interfaceC5870b, bVar, this.f4965a, downsampleStrategy, iM22698i, i13, i14, i15, i12, options);
        int i16 = i15;
        int i17 = i12;
        m4298b(interfaceC5870b, decodeFormat, z12, zM22701l, options, i16, i17);
        int i18 = Build.VERSION.SDK_INT;
        if (m4307z(imageTypeMo4313d)) {
            if (i13 < 0 || i14 < 0 || !z11) {
                float f10 = m4291s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
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
                m4297y(options, this.f4965a, iRound, i17);
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
        Bitmap bitmapM4284i = m4284i(interfaceC5870b, options, bVar, this.f4965a);
        bVar.mo4308a(this.f4965a, bitmapM4284i);
        if (Log.isLoggable(str, 2)) {
            m4292t(i13, i14, str2, options, bitmapM4284i, i10, i11, jM17452b);
        }
        if (bitmapM4284i == null) {
            return null;
        }
        bitmapM4284i.setDensity(this.f4966b.densityDpi);
        Bitmap bitmapM22702m = AbstractC10716y.m22702m(this.f4965a, bitmapM4284i, iMo4312c);
        if (!bitmapM4284i.equals(bitmapM22702m)) {
            this.f4965a.mo19710c(bitmapM4284i);
        }
        return bitmapM22702m;
    }

    /* renamed from: o */
    public boolean m4304o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m4045b();
    }

    /* renamed from: p */
    public boolean m4305p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m4306q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m4307z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C5869a.b
        /* renamed from: b */
        public void mo4309b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5869a.b
        /* renamed from: a */
        public void mo4308a(InterfaceC9772d interfaceC9772d, Bitmap bitmap) {
        }
    }
}
