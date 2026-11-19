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
import com.bumptech.glide.load.resource.bitmap.InterfaceC4738b;
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
import p016b1.AbstractC4404f;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p053f0.C6284c;
import p053f0.C6285d;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6497b;
import p074i0.InterfaceC6499d;
import p118o0.AbstractC7514y;
import p118o0.C7495f;
import p118o0.C7509t;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes3.dex */
public final class C4737a {

    /* renamed from: f */
    public static final C6284c f2544f = C6284c.m6415f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f2262c);

    /* renamed from: g */
    public static final C6284c f2545g = C6284c.m6414e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C6284c f2546h = DownsampleStrategy.f2522h;

    /* renamed from: i */
    public static final C6284c f2547i;

    /* renamed from: j */
    public static final C6284c f2548j;

    /* renamed from: k */
    public static final Set f2549k;

    /* renamed from: l */
    public static final b f2550l;

    /* renamed from: m */
    public static final Set f2551m;

    /* renamed from: n */
    public static final Queue f2552n;

    /* renamed from: a */
    public final InterfaceC6499d f2553a;

    /* renamed from: b */
    public final DisplayMetrics f2554b;

    /* renamed from: c */
    public final InterfaceC6497b f2555c;

    /* renamed from: d */
    public final List f2556d;

    /* renamed from: e */
    public final C7509t f2557e = C7509t.m8633b();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* renamed from: a */
        void mo2839a(InterfaceC6499d interfaceC6499d, Bitmap bitmap);

        /* renamed from: b */
        void mo2840b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f2547i = C6284c.m6415f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f2548j = C6284c.m6415f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f2549k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f2550l = new a();
        f2551m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f2552n = AbstractC4409k.m1445f(0);
    }

    public C4737a(List list, DisplayMetrics displayMetrics, InterfaceC6499d interfaceC6499d, InterfaceC6497b interfaceC6497b) {
        this.f2556d = list;
        this.f2554b = (DisplayMetrics) AbstractC4408j.m1438d(displayMetrics);
        this.f2553a = (InterfaceC6499d) AbstractC4408j.m1438d(interfaceC6499d);
        this.f2555c = (InterfaceC6497b) AbstractC4408j.m1438d(interfaceC6497b);
    }

    /* renamed from: a */
    public static int m2813a(double d6) {
        return m2827x((d6 / (r1 / r0)) * m2827x(m2818l(d6) * d6));
    }

    /* renamed from: c */
    public static void m2814c(ImageHeaderParser.ImageType imageType, InterfaceC4738b interfaceC4738b, b bVar, InterfaceC6499d interfaceC6499d, DownsampleStrategy downsampleStrategy, int i6, int i7, int i8, int i9, int i10, BitmapFactory.Options options) {
        int i11;
        int i12;
        int iFloor;
        int iFloor2;
        if (i7 <= 0 || i8 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (m2821r(i6)) {
            i12 = i7;
            i11 = i8;
        } else {
            i11 = i7;
            i12 = i8;
        }
        float fMo2781b = downsampleStrategy.mo2781b(i11, i12, i9, i10);
        if (fMo2781b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo2781b + " from: " + downsampleStrategy + ", source: [" + i7 + "x" + i8 + "], target: [" + i9 + "x" + i10 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo2780a = downsampleStrategy.mo2780a(i11, i12, i9, i10);
        if (sampleSizeRoundingMo2780a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f6 = i11;
        float f7 = i12;
        int iM2827x = i11 / m2827x(fMo2781b * f6);
        int iM2827x2 = i12 / m2827x(fMo2781b * f7);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo2780a == sampleSizeRounding ? Math.max(iM2827x, iM2827x2) : Math.min(iM2827x, iM2827x2)));
        if (sampleSizeRoundingMo2780a == sampleSizeRounding && iMax < 1.0f / fMo2781b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f6 / fMin);
            iFloor2 = (int) Math.ceil(f7 / fMin);
            int i13 = iMax / 8;
            if (i13 > 0) {
                iFloor /= i13;
                iFloor2 /= i13;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f8 = iMax;
            iFloor = (int) Math.floor(f6 / f8);
            iFloor2 = (int) Math.floor(f7 / f8);
        } else if (imageType.isWebp()) {
            float f9 = iMax;
            iFloor = Math.round(f6 / f9);
            iFloor2 = Math.round(f7 / f9);
        } else if (i11 % iMax == 0 && i12 % iMax == 0) {
            iFloor = i11 / iMax;
            iFloor2 = i12 / iMax;
        } else {
            int[] iArrM2819m = m2819m(interfaceC4738b, options, bVar, interfaceC6499d);
            iFloor = iArrM2819m[0];
            iFloor2 = iArrM2819m[1];
        }
        double dMo2781b = downsampleStrategy.mo2781b(iFloor, iFloor2, i9, i10);
        options.inTargetDensity = m2813a(dMo2781b);
        options.inDensity = m2818l(dMo2781b);
        if (m2822s(options)) {
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
    public static android.graphics.Bitmap m2815i(com.bumptech.glide.load.resource.bitmap.InterfaceC4738b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C4737a.b r6, p074i0.InterfaceC6499d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo2840b()
            r4.mo2842b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p118o0.AbstractC7514y.m8658i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo2841a(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = p118o0.AbstractC7514y.m8658i()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = m2824u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.mo7197c(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = m2815i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = p118o0.AbstractC7514y.m8658i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C4737a.m2815i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, i0.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static String m2816j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m2817k() {
        BitmapFactory.Options options;
        Queue queue = f2552n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m2826w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m2818l(double d6) {
        if (d6 > 1.0d) {
            d6 = 1.0d / d6;
        }
        return (int) Math.round(d6 * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m2819m(InterfaceC4738b interfaceC4738b, BitmapFactory.Options options, b bVar, InterfaceC6499d interfaceC6499d) {
        options.inJustDecodeBounds = true;
        m2815i(interfaceC4738b, options, bVar, interfaceC6499d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m2820n(BitmapFactory.Options options) {
        return m2816j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m2821r(int i6) {
        return i6 == 90 || i6 == 270;
    }

    /* renamed from: s */
    public static boolean m2822s(BitmapFactory.Options options) {
        int i6;
        int i7 = options.inTargetDensity;
        return i7 > 0 && (i6 = options.inDensity) > 0 && i7 != i6;
    }

    /* renamed from: t */
    public static void m2823t(int i6, int i7, String str, BitmapFactory.Options options, Bitmap bitmap, int i8, int i9, long j6) {
        m2816j(bitmap);
        m2820n(options);
        int i10 = options.inSampleSize;
        Thread.currentThread().getName();
        AbstractC4404f.m1421a(j6);
    }

    /* renamed from: u */
    public static IOException m2824u(IllegalArgumentException illegalArgumentException, int i6, int i7, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i6 + ", outHeight: " + i7 + ", outMimeType: " + str + ", inBitmap: " + m2820n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m2825v(BitmapFactory.Options options) {
        m2826w(options);
        Queue queue = f2552n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m2826w(BitmapFactory.Options options) {
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
    public static int m2827x(double d6) {
        return (int) (d6 + 0.5d);
    }

    /* renamed from: y */
    public static void m2828y(BitmapFactory.Options options, InterfaceC6499d interfaceC6499d, int i6, int i7) {
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
        options.inBitmap = interfaceC6499d.mo7199e(i6, i7, config);
    }

    /* renamed from: b */
    public final void m2829b(InterfaceC4738b interfaceC4738b, DecodeFormat decodeFormat, boolean z6, boolean z7, BitmapFactory.Options options, int i6, int i7) {
        boolean zHasAlpha;
        if (this.f2557e.m8639g(i6, i7, options, z6, z7)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC4738b.mo2844d().hasAlpha();
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
    public InterfaceC6440j m2830d(ParcelFileDescriptor parcelFileDescriptor, int i6, int i7, C6285d c6285d) {
        return m2831e(new InterfaceC4738b.c(parcelFileDescriptor, this.f2556d, this.f2555c), i6, i7, c6285d, f2550l);
    }

    /* renamed from: e */
    public final InterfaceC6440j m2831e(InterfaceC4738b interfaceC4738b, int i6, int i7, C6285d c6285d, b bVar) {
        byte[] bArr = (byte[]) this.f2555c.mo7190c(65536, byte[].class);
        BitmapFactory.Options optionsM2817k = m2817k();
        optionsM2817k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c6285d.m6420c(f2544f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c6285d.m6420c(f2545g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c6285d.m6420c(DownsampleStrategy.f2522h);
        boolean zBooleanValue = ((Boolean) c6285d.m6420c(f2547i)).booleanValue();
        C6284c c6284c = f2548j;
        try {
            return C7495f.m8619c(m2834h(interfaceC4738b, optionsM2817k, downsampleStrategy, decodeFormat, preferredColorSpace, c6285d.m6420c(c6284c) != null && ((Boolean) c6285d.m6420c(c6284c)).booleanValue(), i6, i7, zBooleanValue, bVar), this.f2553a);
        } finally {
            m2825v(optionsM2817k);
            this.f2555c.put(bArr);
        }
    }

    /* renamed from: f */
    public InterfaceC6440j m2832f(InputStream inputStream, int i6, int i7, C6285d c6285d, b bVar) {
        return m2831e(new InterfaceC4738b.b(inputStream, this.f2556d, this.f2555c), i6, i7, c6285d, bVar);
    }

    /* renamed from: g */
    public InterfaceC6440j m2833g(ByteBuffer byteBuffer, int i6, int i7, C6285d c6285d) {
        return m2831e(new InterfaceC4738b.a(byteBuffer, this.f2556d, this.f2555c), i6, i7, c6285d, f2550l);
    }

    /* renamed from: h */
    public final Bitmap m2834h(InterfaceC4738b interfaceC4738b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z6, int i6, int i7, boolean z7, b bVar) {
        int i8;
        String str;
        int iRound;
        long jM1422b = AbstractC4404f.m1422b();
        int[] iArrM2819m = m2819m(interfaceC4738b, options, bVar, this.f2553a);
        int i9 = iArrM2819m[0];
        int i10 = iArrM2819m[1];
        String str2 = options.outMimeType;
        boolean z8 = (i9 == -1 || i10 == -1) ? false : z6;
        int iMo2843c = interfaceC4738b.mo2843c();
        int iM8659j = AbstractC7514y.m8659j(iMo2843c);
        boolean zM8662m = AbstractC7514y.m8662m(iMo2843c);
        int i11 = i6;
        if (i11 != Integer.MIN_VALUE) {
            i8 = i7;
        } else if (m2821r(iM8659j)) {
            i8 = i7;
            i11 = i10;
        } else {
            i8 = i7;
            i11 = i9;
        }
        if (i8 == Integer.MIN_VALUE) {
            i8 = m2821r(iM8659j) ? i9 : i10;
        }
        ImageHeaderParser.ImageType imageTypeMo2844d = interfaceC4738b.mo2844d();
        m2814c(imageTypeMo2844d, interfaceC4738b, bVar, this.f2553a, downsampleStrategy, iM8659j, i9, i10, i11, i8, options);
        int i12 = i11;
        int i13 = i8;
        m2829b(interfaceC4738b, decodeFormat, z8, zM8662m, options, i12, i13);
        int i14 = Build.VERSION.SDK_INT;
        if (m2838z(imageTypeMo2844d)) {
            if (i9 < 0 || i10 < 0 || !z7) {
                float f6 = m2822s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f7 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i9 / f7);
                int iCeil2 = (int) Math.ceil(i10 / f7);
                iRound = Math.round(iCeil * f6);
                int iRound2 = Math.round(iCeil2 * f6);
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i13 = iRound2;
            } else {
                iRound = i12;
                str = "Downsampler";
            }
            if (iRound > 0 && i13 > 0) {
                m2828y(options, this.f2553a, iRound, i13);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace != null) {
            if (i14 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i14 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapM2815i = m2815i(interfaceC4738b, options, bVar, this.f2553a);
        bVar.mo2839a(this.f2553a, bitmapM2815i);
        if (Log.isLoggable(str, 2)) {
            m2823t(i9, i10, str2, options, bitmapM2815i, i6, i7, jM1422b);
        }
        if (bitmapM2815i == null) {
            return null;
        }
        bitmapM2815i.setDensity(this.f2554b.densityDpi);
        Bitmap bitmapM8663n = AbstractC7514y.m8663n(this.f2553a, bitmapM2815i, iMo2843c);
        if (!bitmapM2815i.equals(bitmapM8663n)) {
            this.f2553a.mo7197c(bitmapM2815i);
        }
        return bitmapM8663n;
    }

    /* renamed from: o */
    public boolean m2835o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m2573c();
    }

    /* renamed from: p */
    public boolean m2836p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m2837q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m2838z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C4737a.b
        /* renamed from: b */
        public void mo2840b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C4737a.b
        /* renamed from: a */
        public void mo2839a(InterfaceC6499d interfaceC6499d, Bitmap bitmap) {
        }
    }
}
