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
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.InterfaceC5506b;
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
import p091e1.AbstractC7833e;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p122h0.C8083c;
import p122h0.C8084d;
import p132i0.C8124m;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8865b;
import p164l0.InterfaceC8867d;
import p228r0.AbstractC9414x;
import p228r0.C9395e;
import p228r0.C9409s;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes3.dex */
public final class C5505a {

    /* renamed from: f */
    public static final C8083c f3538f = C8083c.m12902f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f3302c);

    /* renamed from: g */
    public static final C8083c f3539g = C8083c.m12902f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* renamed from: h */
    public static final C8083c f3540h = DownsampleStrategy.f3527h;

    /* renamed from: i */
    public static final C8083c f3541i;

    /* renamed from: j */
    public static final C8083c f3542j;

    /* renamed from: k */
    public static final Set f3543k;

    /* renamed from: l */
    public static final b f3544l;

    /* renamed from: m */
    public static final Set f3545m;

    /* renamed from: n */
    public static final Queue f3546n;

    /* renamed from: a */
    public final InterfaceC8867d f3547a;

    /* renamed from: b */
    public final DisplayMetrics f3548b;

    /* renamed from: c */
    public final InterfaceC8865b f3549c;

    /* renamed from: d */
    public final List f3550d;

    /* renamed from: e */
    public final C9409s f3551e = C9409s.m15478a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* renamed from: a */
        void mo3283a(InterfaceC8867d interfaceC8867d, Bitmap bitmap);

        /* renamed from: b */
        void mo3284b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3541i = C8083c.m12902f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f3542j = C8083c.m12902f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f3543k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f3544l = new a();
        f3545m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f3546n = AbstractC7838j.m12262e(0);
    }

    public C5505a(List list, DisplayMetrics displayMetrics, InterfaceC8867d interfaceC8867d, InterfaceC8865b interfaceC8865b) {
        this.f3550d = list;
        this.f3548b = (DisplayMetrics) AbstractC7837i.m12256d(displayMetrics);
        this.f3547a = (InterfaceC8867d) AbstractC7837i.m12256d(interfaceC8867d);
        this.f3549c = (InterfaceC8865b) AbstractC7837i.m12256d(interfaceC8865b);
    }

    /* renamed from: a */
    public static int m3257a(double d10) {
        return m3271x((d10 / (r1 / r0)) * m3271x(m3262l(d10) * d10));
    }

    /* renamed from: c */
    public static void m3258c(ImageHeaderParser.ImageType imageType, InterfaceC5506b interfaceC5506b, b bVar, InterfaceC8867d interfaceC8867d, DownsampleStrategy downsampleStrategy, int i9, int i10, int i11, int i12, int i13, BitmapFactory.Options options) {
        int i14;
        int i15;
        int iFloor;
        int iFloor2;
        if (i10 <= 0 || i11 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (m3265r(i9)) {
            i15 = i10;
            i14 = i11;
        } else {
            i14 = i10;
            i15 = i11;
        }
        float fMo3252b = downsampleStrategy.mo3252b(i14, i15, i12, i13);
        if (fMo3252b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo3252b + " from: " + downsampleStrategy + ", source: [" + i10 + "x" + i11 + "], target: [" + i12 + "x" + i13 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo3251a = downsampleStrategy.mo3251a(i14, i15, i12, i13);
        if (sampleSizeRoundingMo3251a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i14;
        float f11 = i15;
        int iM3271x = i14 / m3271x(fMo3252b * f10);
        int iM3271x2 = i15 / m3271x(fMo3252b * f11);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo3251a == sampleSizeRounding ? Math.max(iM3271x, iM3271x2) : Math.min(iM3271x, iM3271x2)));
        if (sampleSizeRoundingMo3251a == sampleSizeRounding && iMax < 1.0f / fMo3252b) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i16 = iMax / 8;
            if (i16 > 0) {
                iFloor /= i16;
                iFloor2 /= i16;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = iMax;
            iFloor = (int) Math.floor(f10 / f12);
            iFloor2 = (int) Math.floor(f11 / f12);
        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
            float f13 = iMax;
            iFloor = Math.round(f10 / f13);
            iFloor2 = Math.round(f11 / f13);
        } else if (i14 % iMax == 0 && i15 % iMax == 0) {
            iFloor = i14 / iMax;
            iFloor2 = i15 / iMax;
        } else {
            int[] iArrM3263m = m3263m(interfaceC5506b, options, bVar, interfaceC8867d);
            iFloor = iArrM3263m[0];
            iFloor2 = iArrM3263m[1];
        }
        double dMo3252b = downsampleStrategy.mo3252b(iFloor, iFloor2, i12, i13);
        options.inTargetDensity = m3257a(dMo3252b);
        options.inDensity = m3262l(dMo3252b);
        if (m3266s(options)) {
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
    public static android.graphics.Bitmap m3259i(com.bumptech.glide.load.resource.bitmap.InterfaceC5506b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C5505a.b r6, p164l0.InterfaceC8867d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo3284b()
            r4.mo3286b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p228r0.AbstractC9414x.m15499i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo3285a(r5)     // Catch: java.lang.IllegalArgumentException -> L23 java.lang.Throwable -> L3f
        L1b:
            java.util.concurrent.locks.Lock r5 = p228r0.AbstractC9414x.m15499i()
            r5.unlock()
            return r4
        L23:
            r3 = move-exception
            java.io.IOException r0 = m3268u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = "Downsampler"
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L3f
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L3e
            r7.mo13732c(r1)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            r1 = 0
            r5.inBitmap = r1     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            android.graphics.Bitmap r4 = m3259i(r4, r5, r6, r7)     // Catch: java.io.IOException -> L3d java.lang.Throwable -> L3f
            goto L1b
        L3d:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3e:
            throw r0     // Catch: java.lang.Throwable -> L3f
        L3f:
            r4 = move-exception
            java.util.concurrent.locks.Lock r5 = p228r0.AbstractC9414x.m15499i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C5505a.m3259i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, l0.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static String m3260j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m3261k() {
        BitmapFactory.Options options;
        Queue queue = f3546n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m3270w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m3262l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m3263m(InterfaceC5506b interfaceC5506b, BitmapFactory.Options options, b bVar, InterfaceC8867d interfaceC8867d) {
        options.inJustDecodeBounds = true;
        m3259i(interfaceC5506b, options, bVar, interfaceC8867d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m3264n(BitmapFactory.Options options) {
        return m3260j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m3265r(int i9) {
        return i9 == 90 || i9 == 270;
    }

    /* renamed from: s */
    public static boolean m3266s(BitmapFactory.Options options) {
        int i9;
        int i10 = options.inTargetDensity;
        return i10 > 0 && (i9 = options.inDensity) > 0 && i10 != i9;
    }

    /* renamed from: t */
    public static void m3267t(int i9, int i10, String str, BitmapFactory.Options options, Bitmap bitmap, int i11, int i12, long j9) {
        m3260j(bitmap);
        m3264n(options);
        int i13 = options.inSampleSize;
        Thread.currentThread().getName();
        AbstractC7833e.m12239a(j9);
    }

    /* renamed from: u */
    public static IOException m3268u(IllegalArgumentException illegalArgumentException, int i9, int i10, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i9 + ", outHeight: " + i10 + ", outMimeType: " + str + ", inBitmap: " + m3264n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m3269v(BitmapFactory.Options options) {
        m3270w(options);
        Queue queue = f3546n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m3270w(BitmapFactory.Options options) {
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
    public static int m3271x(double d10) {
        return (int) (d10 + 0.5d);
    }

    /* renamed from: y */
    public static void m3272y(BitmapFactory.Options options, InterfaceC8867d interfaceC8867d, int i9, int i10) {
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
        options.inBitmap = interfaceC8867d.mo13734e(i9, i10, config);
    }

    /* renamed from: b */
    public final void m3273b(InterfaceC5506b interfaceC5506b, DecodeFormat decodeFormat, boolean z9, boolean z10, BitmapFactory.Options options, int i9, int i10) {
        boolean zHasAlpha;
        if (this.f3551e.m15482e(i9, i10, options, z9, z10)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC5506b.mo3288d().hasAlpha();
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
    public InterfaceC8259j m3274d(ParcelFileDescriptor parcelFileDescriptor, int i9, int i10, C8084d c8084d) {
        return m3275e(new InterfaceC5506b.b(parcelFileDescriptor, this.f3550d, this.f3549c), i9, i10, c8084d, f3544l);
    }

    /* renamed from: e */
    public final InterfaceC8259j m3275e(InterfaceC5506b interfaceC5506b, int i9, int i10, C8084d c8084d, b bVar) {
        byte[] bArr = (byte[]) this.f3549c.mo13725c(65536, byte[].class);
        BitmapFactory.Options optionsM3261k = m3261k();
        optionsM3261k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c8084d.m12908c(f3538f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c8084d.m12908c(f3539g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8084d.m12908c(DownsampleStrategy.f3527h);
        boolean zBooleanValue = ((Boolean) c8084d.m12908c(f3541i)).booleanValue();
        C8083c c8083c = f3542j;
        try {
            return C9395e.m15464c(m3278h(interfaceC5506b, optionsM3261k, downsampleStrategy, decodeFormat, preferredColorSpace, c8084d.m12908c(c8083c) != null && ((Boolean) c8084d.m12908c(c8083c)).booleanValue(), i9, i10, zBooleanValue, bVar), this.f3547a);
        } finally {
            m3269v(optionsM3261k);
            this.f3549c.put(bArr);
        }
    }

    /* renamed from: f */
    public InterfaceC8259j m3276f(InputStream inputStream, int i9, int i10, C8084d c8084d) {
        return m3277g(inputStream, i9, i10, c8084d, f3544l);
    }

    /* renamed from: g */
    public InterfaceC8259j m3277g(InputStream inputStream, int i9, int i10, C8084d c8084d, b bVar) {
        return m3275e(new InterfaceC5506b.a(inputStream, this.f3550d, this.f3549c), i9, i10, c8084d, bVar);
    }

    /* renamed from: h */
    public final Bitmap m3278h(InterfaceC5506b interfaceC5506b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z9, int i9, int i10, boolean z10, b bVar) {
        int i11;
        String str;
        int iRound;
        long jM12240b = AbstractC7833e.m12240b();
        int[] iArrM3263m = m3263m(interfaceC5506b, options, bVar, this.f3547a);
        int i12 = iArrM3263m[0];
        int i13 = iArrM3263m[1];
        String str2 = options.outMimeType;
        boolean z11 = (i12 == -1 || i13 == -1) ? false : z9;
        int iMo3287c = interfaceC5506b.mo3287c();
        int iM15500j = AbstractC9414x.m15500j(iMo3287c);
        boolean zM15503m = AbstractC9414x.m15503m(iMo3287c);
        int i14 = i9;
        if (i14 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (m3265r(iM15500j)) {
            i11 = i10;
            i14 = i13;
        } else {
            i11 = i10;
            i14 = i12;
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = m3265r(iM15500j) ? i12 : i13;
        }
        ImageHeaderParser.ImageType imageTypeMo3288d = interfaceC5506b.mo3288d();
        m3258c(imageTypeMo3288d, interfaceC5506b, bVar, this.f3547a, downsampleStrategy, iM15500j, i12, i13, i14, i11, options);
        int i15 = i14;
        int i16 = i11;
        m3273b(interfaceC5506b, decodeFormat, z11, zM15503m, options, i15, i16);
        int i17 = Build.VERSION.SDK_INT;
        if (m3282z(imageTypeMo3288d)) {
            if (i12 < 0 || i13 < 0 || !z10) {
                float f10 = m3266s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                float f11 = options.inSampleSize;
                int iCeil = (int) Math.ceil(i12 / f11);
                int iCeil2 = (int) Math.ceil(i13 / f11);
                iRound = Math.round(iCeil * f10);
                int iRound2 = Math.round(iCeil2 * f10);
                str = "Downsampler";
                Log.isLoggable(str, 2);
                i16 = iRound2;
            } else {
                iRound = i15;
                str = "Downsampler";
            }
            if (iRound > 0 && i16 > 0) {
                m3272y(options, this.f3547a, iRound, i16);
            }
        } else {
            str = "Downsampler";
        }
        if (i17 >= 28) {
            options.inPreferredColorSpace = ColorSpace.get((preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i17 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM3259i = m3259i(interfaceC5506b, options, bVar, this.f3547a);
        bVar.mo3283a(this.f3547a, bitmapM3259i);
        if (Log.isLoggable(str, 2)) {
            m3267t(i12, i13, str2, options, bitmapM3259i, i9, i10, jM12240b);
        }
        if (bitmapM3259i == null) {
            return null;
        }
        bitmapM3259i.setDensity(this.f3548b.densityDpi);
        Bitmap bitmapM15504n = AbstractC9414x.m15504n(this.f3547a, bitmapM3259i, iMo3287c);
        if (!bitmapM3259i.equals(bitmapM15504n)) {
            this.f3547a.mo13732c(bitmapM3259i);
        }
        return bitmapM15504n;
    }

    /* renamed from: o */
    public boolean m3279o(ParcelFileDescriptor parcelFileDescriptor) {
        return C8124m.m13009c();
    }

    /* renamed from: p */
    public boolean m3280p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m3281q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m3282z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C5505a.b
        /* renamed from: b */
        public void mo3284b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C5505a.b
        /* renamed from: a */
        public void mo3283a(InterfaceC8867d interfaceC8867d, Bitmap bitmap) {
        }
    }
}
