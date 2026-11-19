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
import com.bumptech.glide.load.resource.bitmap.InterfaceC5451b;
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
import p116h0.AbstractC8702f;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p160l.C9229c;
import p160l.C9230d;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9498b;
import p193o.InterfaceC9500d;
import p259u.AbstractC10137c0;
import p259u.C10142f;
import p259u.C10159w;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes3.dex */
public final class C5450a {

    /* renamed from: f */
    public static final C9229c f3186f = C9229c.m16935f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f2904c);

    /* renamed from: g */
    public static final C9229c f3187g = C9229c.m16934e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C9229c f3188h = DownsampleStrategy.f3164h;

    /* renamed from: i */
    public static final C9229c f3189i;

    /* renamed from: j */
    public static final C9229c f3190j;

    /* renamed from: k */
    public static final Set f3191k;

    /* renamed from: l */
    public static final b f3192l;

    /* renamed from: m */
    public static final Set f3193m;

    /* renamed from: n */
    public static final Queue f3194n;

    /* renamed from: a */
    public final InterfaceC9500d f3195a;

    /* renamed from: b */
    public final DisplayMetrics f3196b;

    /* renamed from: c */
    public final InterfaceC9498b f3197c;

    /* renamed from: d */
    public final List f3198d;

    /* renamed from: e */
    public final C10159w f3199e = C10159w.m19013b();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* renamed from: a */
        void mo3104a(InterfaceC9500d interfaceC9500d, Bitmap bitmap);

        /* renamed from: b */
        void mo3105b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3189i = C9229c.m16935f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3190j = C9229c.m16935f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3191k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3192l = new a();
        f3193m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f3194n = AbstractC8707k.m14188f(0);
    }

    public C5450a(List list, DisplayMetrics displayMetrics, InterfaceC9500d interfaceC9500d, InterfaceC9498b interfaceC9498b) {
        this.f3198d = list;
        this.f3196b = (DisplayMetrics) AbstractC8706j.m14181d(displayMetrics);
        this.f3195a = (InterfaceC9500d) AbstractC8706j.m14181d(interfaceC9500d);
        this.f3197c = (InterfaceC9498b) AbstractC8706j.m14181d(interfaceC9498b);
    }

    /* renamed from: a */
    public static int m3078a(double d10) {
        return m3092x((d10 / (r1 / r0)) * m3092x(m3083l(d10) * d10));
    }

    /* renamed from: c */
    public static void m3079c(ImageHeaderParser.ImageType imageType, InterfaceC5451b interfaceC5451b, b bVar, InterfaceC9500d interfaceC9500d, DownsampleStrategy downsampleStrategy, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
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
        if (m3086r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fMo3046b = downsampleStrategy.mo3046b(i15, i16, i13, i14);
        if (fMo3046b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo3046b + " from: " + downsampleStrategy + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo3045a = downsampleStrategy.mo3045a(i15, i16, i13, i14);
        if (sampleSizeRoundingMo3045a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iM3092x = i15 / m3092x(fMo3046b * f10);
        int iM3092x2 = i16 / m3092x(fMo3046b * f11);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo3045a == sampleSizeRounding ? Math.max(iM3092x, iM3092x2) : Math.min(iM3092x, iM3092x2)));
        if (sampleSizeRoundingMo3045a == sampleSizeRounding && iMax < 1.0f / fMo3046b) {
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
            int[] iArrM3084m = m3084m(interfaceC5451b, options, bVar, interfaceC9500d);
            iFloor = iArrM3084m[0];
            iFloor2 = iArrM3084m[1];
        }
        double dMo3046b = downsampleStrategy.mo3046b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = m3078a(dMo3046b);
        options.inDensity = m3083l(dMo3046b);
        if (m3087s(options)) {
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
    public static android.graphics.Bitmap m3080i(com.bumptech.glide.load.resource.bitmap.InterfaceC5451b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C5450a.b r6, p193o.InterfaceC9500d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo3105b()
            r4.mo3107b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p259u.AbstractC10137c0.m18980i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo3106a(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = p259u.AbstractC10137c0.m18980i()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = m3089u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.mo17620b(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = m3080i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = p259u.AbstractC10137c0.m18980i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C5450a.m3080i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, o.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static String m3081j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m3082k() {
        BitmapFactory.Options options;
        Queue queue = f3194n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m3091w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m3083l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m3084m(InterfaceC5451b interfaceC5451b, BitmapFactory.Options options, b bVar, InterfaceC9500d interfaceC9500d) {
        options.inJustDecodeBounds = true;
        m3080i(interfaceC5451b, options, bVar, interfaceC9500d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m3085n(BitmapFactory.Options options) {
        return m3081j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m3086r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* renamed from: s */
    public static boolean m3087s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    /* renamed from: t */
    public static void m3088t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        m3081j(bitmap);
        m3085n(options);
        int i14 = options.inSampleSize;
        Thread.currentThread().getName();
        AbstractC8702f.m14164a(j10);
    }

    /* renamed from: u */
    public static IOException m3089u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + m3085n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m3090v(BitmapFactory.Options options) {
        m3091w(options);
        Queue queue = f3194n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m3091w(BitmapFactory.Options options) {
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
    public static int m3092x(double d10) {
        return (int) (d10 + 0.5d);
    }

    /* renamed from: y */
    public static void m3093y(BitmapFactory.Options options, InterfaceC9500d interfaceC9500d, int i10, int i11) {
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
        options.inBitmap = interfaceC9500d.mo17622d(i10, i11, config);
    }

    /* renamed from: b */
    public final void m3094b(InterfaceC5451b interfaceC5451b, DecodeFormat decodeFormat, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f3199e.m19019g(i10, i11, options, z10, z11)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC5451b.mo3109d().hasAlpha();
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
    public InterfaceC9357j m3095d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C9230d c9230d) {
        return m3096e(new InterfaceC5451b.c(parcelFileDescriptor, this.f3198d, this.f3197c), i10, i11, c9230d, f3192l);
    }

    /* renamed from: e */
    public final InterfaceC9357j m3096e(InterfaceC5451b interfaceC5451b, int i10, int i11, C9230d c9230d, b bVar) {
        byte[] bArr = (byte[]) this.f3197c.mo17614b(65536, byte[].class);
        BitmapFactory.Options optionsM3082k = m3082k();
        optionsM3082k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c9230d.m16940c(f3186f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c9230d.m16940c(f3187g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c9230d.m16940c(DownsampleStrategy.f3164h);
        boolean zBooleanValue = ((Boolean) c9230d.m16940c(f3189i)).booleanValue();
        C9229c c9229c = f3190j;
        try {
            return C10142f.m18997c(m3099h(interfaceC5451b, optionsM3082k, downsampleStrategy, decodeFormat, preferredColorSpace, c9230d.m16940c(c9229c) != null && ((Boolean) c9230d.m16940c(c9229c)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f3195a);
        } finally {
            m3090v(optionsM3082k);
            this.f3197c.put(bArr);
        }
    }

    /* renamed from: f */
    public InterfaceC9357j m3097f(InputStream inputStream, int i10, int i11, C9230d c9230d, b bVar) {
        return m3096e(new InterfaceC5451b.b(inputStream, this.f3198d, this.f3197c), i10, i11, c9230d, bVar);
    }

    /* renamed from: g */
    public InterfaceC9357j m3098g(ByteBuffer byteBuffer, int i10, int i11, C9230d c9230d) {
        return m3096e(new InterfaceC5451b.a(byteBuffer, this.f3198d, this.f3197c), i10, i11, c9230d, f3192l);
    }

    /* renamed from: h */
    public final Bitmap m3099h(InterfaceC5451b interfaceC5451b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, b bVar) {
        int i12;
        String str;
        int iRound;
        long jM14165b = AbstractC8702f.m14165b();
        int[] iArrM3084m = m3084m(interfaceC5451b, options, bVar, this.f3195a);
        int i13 = iArrM3084m[0];
        int i14 = iArrM3084m[1];
        String str2 = options.outMimeType;
        boolean z12 = (i13 == -1 || i14 == -1) ? false : z10;
        int iMo3108c = interfaceC5451b.mo3108c();
        int iM18981j = AbstractC10137c0.m18981j(iMo3108c);
        boolean zM18984m = AbstractC10137c0.m18984m(iMo3108c);
        int i15 = i10;
        if (i15 != Integer.MIN_VALUE) {
            i12 = i11;
        } else if (m3086r(iM18981j)) {
            i12 = i11;
            i15 = i14;
        } else {
            i12 = i11;
            i15 = i13;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = m3086r(iM18981j) ? i13 : i14;
        }
        ImageHeaderParser.ImageType imageTypeMo3109d = interfaceC5451b.mo3109d();
        m3079c(imageTypeMo3109d, interfaceC5451b, bVar, this.f3195a, downsampleStrategy, iM18981j, i13, i14, i15, i12, options);
        int i16 = i15;
        int i17 = i12;
        m3094b(interfaceC5451b, decodeFormat, z12, zM18984m, options, i16, i17);
        int i18 = Build.VERSION.SDK_INT;
        if (m3103z(imageTypeMo3109d)) {
            if (i13 < 0 || i14 < 0 || !z11) {
                float f10 = m3087s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
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
                m3093y(options, this.f3195a, iRound, i17);
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
        Bitmap bitmapM3080i = m3080i(interfaceC5451b, options, bVar, this.f3195a);
        bVar.mo3104a(this.f3195a, bitmapM3080i);
        if (Log.isLoggable(str, 2)) {
            m3088t(i13, i14, str2, options, bitmapM3080i, i10, i11, jM14165b);
        }
        if (bitmapM3080i == null) {
            return null;
        }
        bitmapM3080i.setDensity(this.f3196b.densityDpi);
        Bitmap bitmapM18985n = AbstractC10137c0.m18985n(this.f3195a, bitmapM3080i, iMo3108c);
        if (!bitmapM3080i.equals(bitmapM18985n)) {
            this.f3195a.mo17620b(bitmapM3080i);
        }
        return bitmapM18985n;
    }

    /* renamed from: o */
    public boolean m3100o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m2839c();
    }

    /* renamed from: p */
    public boolean m3101p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m3102q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m3103z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C5450a.b
        /* renamed from: b */
        public void mo3105b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5450a.b
        /* renamed from: a */
        public void mo3104a(InterfaceC9500d interfaceC9500d, Bitmap bitmap) {
        }
    }
}
