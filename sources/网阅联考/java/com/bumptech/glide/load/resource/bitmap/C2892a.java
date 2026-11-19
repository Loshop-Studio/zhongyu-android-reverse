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
import com.bumptech.glide.load.resource.bitmap.InterfaceC2893b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p062g0.AbstractC3745e;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p076j.C3793c;
import p076j.C3794d;
import p081k.C3852m;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4393b;
import p098n.InterfaceC4395d;
import p122t.AbstractC4552a0;
import p122t.C4559e;
import p122t.C4576v;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* loaded from: classes2.dex */
public final class C2892a {

    /* renamed from: f */
    public static final C3793c f884f = C3793c.m4945f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f648c);

    /* renamed from: g */
    public static final C3793c f885g = C3793c.m4945f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* renamed from: h */
    public static final C3793c f886h = DownsampleStrategy.f873h;

    /* renamed from: i */
    public static final C3793c f887i;

    /* renamed from: j */
    public static final C3793c f888j;

    /* renamed from: k */
    public static final Set f889k;

    /* renamed from: l */
    public static final b f890l;

    /* renamed from: m */
    public static final Set f891m;

    /* renamed from: n */
    public static final Queue f892n;

    /* renamed from: a */
    public final InterfaceC4395d f893a;

    /* renamed from: b */
    public final DisplayMetrics f894b;

    /* renamed from: c */
    public final InterfaceC4393b f895c;

    /* renamed from: d */
    public final List f896d;

    /* renamed from: e */
    public final C4576v f897e = C4576v.m6297a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C2892a.b
        /* renamed from: a */
        public void mo1959a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2892a.b
        /* renamed from: b */
        public void mo1960b(InterfaceC4395d interfaceC4395d, Bitmap bitmap) {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* renamed from: a */
        void mo1959a();

        /* renamed from: b */
        void mo1960b(InterfaceC4395d interfaceC4395d, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f887i = C3793c.m4945f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f888j = C3793c.m4945f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f889k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f890l = new a();
        f891m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f892n = AbstractC3750j.m4774e(0);
    }

    public C2892a(List list, DisplayMetrics displayMetrics, InterfaceC4395d interfaceC4395d, InterfaceC4393b interfaceC4393b) {
        this.f896d = list;
        this.f894b = (DisplayMetrics) AbstractC3749i.m4768d(displayMetrics);
        this.f893a = (InterfaceC4395d) AbstractC3749i.m4768d(interfaceC4395d);
        this.f895c = (InterfaceC4393b) AbstractC3749i.m4768d(interfaceC4393b);
    }

    /* renamed from: a */
    public static int m1933a(double d4) {
        return m1947x((d4 / (r1 / r0)) * m1947x(m1938l(d4) * d4));
    }

    /* renamed from: c */
    public static void m1934c(ImageHeaderParser.ImageType imageType, InterfaceC2893b interfaceC2893b, b bVar, InterfaceC4395d interfaceC4395d, DownsampleStrategy downsampleStrategy, int i4, int i5, int i6, int i7, int i8, BitmapFactory.Options options) {
        int i9;
        int i10;
        int i11;
        int iFloor;
        double dFloor;
        int iRound;
        if (i5 <= 0 || i6 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType);
                sb.append(" with target [");
                sb.append(i7);
                sb.append("x");
                sb.append(i8);
                sb.append("]");
                return;
            }
            return;
        }
        if (m1941r(i4)) {
            i10 = i5;
            i9 = i6;
        } else {
            i9 = i5;
            i10 = i6;
        }
        float fMo1928b = downsampleStrategy.mo1928b(i9, i10, i7, i8);
        if (fMo1928b <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fMo1928b + " from: " + downsampleStrategy + ", source: [" + i5 + "x" + i6 + "], target: [" + i7 + "x" + i8 + "]");
        }
        DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo1927a = downsampleStrategy.mo1927a(i9, i10, i7, i8);
        if (sampleSizeRoundingMo1927a == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f4 = i9;
        float f5 = i10;
        int iM1947x = i9 / m1947x(fMo1928b * f4);
        int iM1947x2 = i10 / m1947x(fMo1928b * f5);
        DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
        int iMax = sampleSizeRoundingMo1927a == sampleSizeRounding ? Math.max(iM1947x, iM1947x2) : Math.min(iM1947x, iM1947x2);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 23 || !f889k.contains(options.outMimeType)) {
            int iMax2 = Math.max(1, Integer.highestOneBit(iMax));
            if (sampleSizeRoundingMo1927a == sampleSizeRounding && iMax2 < 1.0f / fMo1928b) {
                iMax2 <<= 1;
            }
            i11 = iMax2;
        } else {
            i11 = 1;
        }
        options.inSampleSize = i11;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(i11, 8);
            iFloor = (int) Math.ceil(f4 / fMin);
            iRound = (int) Math.ceil(f5 / fMin);
            int i13 = i11 / 8;
            if (i13 > 0) {
                iFloor /= i13;
                iRound /= i13;
            }
        } else {
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f6 = i11;
                iFloor = (int) Math.floor(f4 / f6);
                dFloor = Math.floor(f5 / f6);
            } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                if (i12 >= 24) {
                    float f7 = i11;
                    iFloor = Math.round(f4 / f7);
                    iRound = Math.round(f5 / f7);
                } else {
                    float f8 = i11;
                    iFloor = (int) Math.floor(f4 / f8);
                    dFloor = Math.floor(f5 / f8);
                }
            } else if (i9 % i11 == 0 && i10 % i11 == 0) {
                iFloor = i9 / i11;
                iRound = i10 / i11;
            } else {
                int[] iArrM1939m = m1939m(interfaceC2893b, options, bVar, interfaceC4395d);
                iFloor = iArrM1939m[0];
                iRound = iArrM1939m[1];
            }
            iRound = (int) dFloor;
        }
        double dMo1928b = downsampleStrategy.mo1928b(iFloor, iRound, i7, i8);
        options.inTargetDensity = m1933a(dMo1928b);
        options.inDensity = m1938l(dMo1928b);
        if (m1942s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculate scaling, source: [");
            sb2.append(i5);
            sb2.append("x");
            sb2.append(i6);
            sb2.append("], degreesToRotate: ");
            sb2.append(i4);
            sb2.append(", target: [");
            sb2.append(i7);
            sb2.append("x");
            sb2.append(i8);
            sb2.append("], power of two scaled: [");
            sb2.append(iFloor);
            sb2.append("x");
            sb2.append(iRound);
            sb2.append("], exact scale factor: ");
            sb2.append(fMo1928b);
            sb2.append(", power of 2 sample size: ");
            sb2.append(i11);
            sb2.append(", adjusted scale factor: ");
            sb2.append(dMo1928b);
            sb2.append(", target density: ");
            sb2.append(options.inTargetDensity);
            sb2.append(", density: ");
            sb2.append(options.inDensity);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r0;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m1935i(com.bumptech.glide.load.resource.bitmap.InterfaceC2893b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C2892a.b r6, p098n.InterfaceC4395d r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.mo1959a()
            r4.mo1963c()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p122t.AbstractC4552a0.m6253i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo1962b(r5)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L25
            java.util.concurrent.locks.Lock r5 = p122t.AbstractC4552a0.m6253i()
            r5.unlock()
            return r4
        L23:
            r4 = move-exception
            goto L49
        L25:
            r3 = move-exception
            java.io.IOException r0 = m1944u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L48
            r7.mo5392c(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L47
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L47
            android.graphics.Bitmap r4 = m1935i(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L47
            java.util.concurrent.locks.Lock r5 = p122t.AbstractC4552a0.m6253i()
            r5.unlock()
            return r4
        L47:
            throw r0     // Catch: java.lang.Throwable -> L23
        L48:
            throw r0     // Catch: java.lang.Throwable -> L23
        L49:
            java.util.concurrent.locks.Lock r5 = p122t.AbstractC4552a0.m6253i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C2892a.m1935i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, n.d):android.graphics.Bitmap");
    }

    /* renamed from: j */
    public static String m1936j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m1937k() {
        BitmapFactory.Options options;
        Queue queue = f892n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            m1946w(options);
        }
        return options;
    }

    /* renamed from: l */
    public static int m1938l(double d4) {
        if (d4 > 1.0d) {
            d4 = 1.0d / d4;
        }
        return (int) Math.round(d4 * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m1939m(InterfaceC2893b interfaceC2893b, BitmapFactory.Options options, b bVar, InterfaceC4395d interfaceC4395d) {
        options.inJustDecodeBounds = true;
        m1935i(interfaceC2893b, options, bVar, interfaceC4395d);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m1940n(BitmapFactory.Options options) {
        return m1936j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m1941r(int i4) {
        return i4 == 90 || i4 == 270;
    }

    /* renamed from: s */
    public static boolean m1942s(BitmapFactory.Options options) {
        int i4;
        int i5 = options.inTargetDensity;
        return i5 > 0 && (i4 = options.inDensity) > 0 && i5 != i4;
    }

    /* renamed from: t */
    public static void m1943t(int i4, int i5, String str, BitmapFactory.Options options, Bitmap bitmap, int i6, int i7, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m1936j(bitmap));
        sb.append(" from [");
        sb.append(i4);
        sb.append("x");
        sb.append(i5);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m1940n(options));
        sb.append(" for [");
        sb.append(i6);
        sb.append("x");
        sb.append(i7);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(AbstractC3745e.m4751a(j4));
    }

    /* renamed from: u */
    public static IOException m1944u(IllegalArgumentException illegalArgumentException, int i4, int i5, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i4 + ", outHeight: " + i5 + ", outMimeType: " + str + ", inBitmap: " + m1940n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m1945v(BitmapFactory.Options options) {
        m1946w(options);
        Queue queue = f892n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m1946w(BitmapFactory.Options options) {
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
    public static int m1947x(double d4) {
        return (int) (d4 + 0.5d);
    }

    /* renamed from: y */
    public static void m1948y(BitmapFactory.Options options, InterfaceC4395d interfaceC4395d, int i4, int i5) {
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
        options.inBitmap = interfaceC4395d.mo5394e(i4, i5, config);
    }

    /* renamed from: b */
    public final void m1949b(InterfaceC2893b interfaceC2893b, DecodeFormat decodeFormat, boolean z3, boolean z4, BitmapFactory.Options options, int i4, int i5) {
        boolean zHasAlpha;
        if (this.f897e.m6301e(i4, i5, options, z3, z4)) {
            return;
        }
        if (decodeFormat == DecodeFormat.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = interfaceC2893b.mo1964d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot determine whether the image has alpha or not from header, format ");
                sb.append(decodeFormat);
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
    public InterfaceC4361j m1950d(ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, C3794d c3794d) {
        return m1951e(new InterfaceC2893b.b(parcelFileDescriptor, this.f896d, this.f895c), i4, i5, c3794d, f890l);
    }

    /* renamed from: e */
    public final InterfaceC4361j m1951e(InterfaceC2893b interfaceC2893b, int i4, int i5, C3794d c3794d, b bVar) {
        byte[] bArr = (byte[]) this.f895c.mo5386d(65536, byte[].class);
        BitmapFactory.Options optionsM1937k = m1937k();
        optionsM1937k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c3794d.m4951c(f884f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c3794d.m4951c(f885g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c3794d.m4951c(DownsampleStrategy.f873h);
        boolean zBooleanValue = ((Boolean) c3794d.m4951c(f887i)).booleanValue();
        C3793c c3793c = f888j;
        try {
            return C4559e.m6280d(m1954h(interfaceC2893b, optionsM1937k, downsampleStrategy, decodeFormat, preferredColorSpace, c3794d.m4951c(c3793c) != null && ((Boolean) c3794d.m4951c(c3793c)).booleanValue(), i4, i5, zBooleanValue, bVar), this.f893a);
        } finally {
            m1945v(optionsM1937k);
            this.f895c.put(bArr);
        }
    }

    /* renamed from: f */
    public InterfaceC4361j m1952f(InputStream inputStream, int i4, int i5, C3794d c3794d) {
        return m1953g(inputStream, i4, i5, c3794d, f890l);
    }

    /* renamed from: g */
    public InterfaceC4361j m1953g(InputStream inputStream, int i4, int i5, C3794d c3794d, b bVar) {
        return m1951e(new InterfaceC2893b.a(inputStream, this.f896d, this.f895c), i4, i5, c3794d, bVar);
    }

    /* renamed from: h */
    public final Bitmap m1954h(InterfaceC2893b interfaceC2893b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z3, int i4, int i5, boolean z4, b bVar) {
        int i6;
        int i7;
        String str;
        int i8;
        int iRound;
        int iRound2;
        long jM4752b = AbstractC3745e.m4752b();
        int[] iArrM1939m = m1939m(interfaceC2893b, options, bVar, this.f893a);
        boolean z5 = false;
        int i9 = iArrM1939m[0];
        int i10 = iArrM1939m[1];
        String str2 = options.outMimeType;
        boolean z6 = (i9 == -1 || i10 == -1) ? false : z3;
        int iMo1961a = interfaceC2893b.mo1961a();
        int iM6254j = AbstractC4552a0.m6254j(iMo1961a);
        boolean zM6257m = AbstractC4552a0.m6257m(iMo1961a);
        if (i4 == Integer.MIN_VALUE) {
            i6 = i5;
            i7 = m1941r(iM6254j) ? i10 : i9;
        } else {
            i6 = i5;
            i7 = i4;
        }
        int i11 = i6 == Integer.MIN_VALUE ? m1941r(iM6254j) ? i9 : i10 : i6;
        ImageHeaderParser.ImageType imageTypeMo1964d = interfaceC2893b.mo1964d();
        m1934c(imageTypeMo1964d, interfaceC2893b, bVar, this.f893a, downsampleStrategy, iM6254j, i9, i10, i7, i11, options);
        m1949b(interfaceC2893b, decodeFormat, z6, zM6257m, options, i7, i11);
        int i12 = Build.VERSION.SDK_INT;
        int i13 = options.inSampleSize;
        if (m1958z(imageTypeMo1964d)) {
            if (i9 < 0 || i10 < 0 || !z4) {
                float f4 = m1942s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i14 = options.inSampleSize;
                float f5 = i14;
                int iCeil = (int) Math.ceil(i9 / f5);
                int iCeil2 = (int) Math.ceil(i10 / f5);
                iRound = Math.round(iCeil * f4);
                iRound2 = Math.round(iCeil2 * f4);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(iRound);
                    sb.append("x");
                    sb.append(iRound2);
                    sb.append("] for source [");
                    sb.append(i9);
                    sb.append("x");
                    sb.append(i10);
                    sb.append("], sampleSize: ");
                    sb.append(i14);
                    sb.append(", targetDensity: ");
                    sb.append(options.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f4);
                }
            } else {
                str = "Downsampler";
                iRound = i7;
                iRound2 = i11;
            }
            if (iRound > 0 && iRound2 > 0) {
                m1948y(options, this.f893a, iRound, iRound2);
            }
        } else {
            str = "Downsampler";
        }
        if (i12 >= 28) {
            if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                z5 = true;
            }
            options.inPreferredColorSpace = ColorSpace.get(z5 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i12 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapM1935i = m1935i(interfaceC2893b, options, bVar, this.f893a);
        bVar.mo1960b(this.f893a, bitmapM1935i);
        if (Log.isLoggable(str, 2)) {
            i8 = iMo1961a;
            m1943t(i9, i10, str2, options, bitmapM1935i, i4, i5, jM4752b);
        } else {
            i8 = iMo1961a;
        }
        if (bitmapM1935i == null) {
            return null;
        }
        bitmapM1935i.setDensity(this.f894b.densityDpi);
        Bitmap bitmapM6258n = AbstractC4552a0.m6258n(this.f893a, bitmapM1935i, i8);
        if (bitmapM1935i.equals(bitmapM6258n)) {
            return bitmapM6258n;
        }
        this.f893a.mo5392c(bitmapM1935i);
        return bitmapM6258n;
    }

    /* renamed from: o */
    public boolean m1955o(ParcelFileDescriptor parcelFileDescriptor) {
        return C3852m.m5145c();
    }

    /* renamed from: p */
    public boolean m1956p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean m1957q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean m1958z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
