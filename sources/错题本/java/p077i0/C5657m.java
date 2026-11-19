package p077i0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.PreferredColorSpace;
import io.reactivex.internal.operators.observable.C5707c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import p016b0.C3071g;
import p024c0.C3210g;
import p024c0.InterfaceC3205b;
import p180v0.AbstractC6664k;
import p185v7.AbstractC6675d;
import p202y.C6762e;
import p202y.C6763f;

/* renamed from: i0.m */
/* loaded from: classes2.dex */
public final class C5657m {

    /* renamed from: f */
    public static final C6762e f8802f = C6762e.m6435a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g */
    public static final C6762e f8803g = C6762e.m6435a(PreferredColorSpace.SRGB, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h */
    public static final C6762e f8804h;

    /* renamed from: i */
    public static final C6762e f8805i;

    /* renamed from: j */
    public static final Set f8806j;

    /* renamed from: k */
    public static final C5707c f8807k;

    /* renamed from: l */
    public static final Set f8808l;

    /* renamed from: m */
    public static final ArrayDeque f8809m;

    /* renamed from: a */
    public final InterfaceC3205b f8810a;

    /* renamed from: b */
    public final DisplayMetrics f8811b;

    /* renamed from: c */
    public final C3210g f8812c;

    /* renamed from: d */
    public final ArrayList f8813d;

    /* renamed from: e */
    public final C5663s f8814e = C5663s.m4993a();

    static {
        C5655k c5655k = C5655k.f8794b;
        Boolean bool = Boolean.FALSE;
        f8804h = C6762e.m6435a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f8805i = C6762e.m6435a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f8806j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f8807k = new C5707c();
        f8808l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC6664k.f11243a;
        f8809m = new ArrayDeque(0);
    }

    public C5657m(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC3205b interfaceC3205b, C3210g c3210g) {
        this.f8813d = arrayList;
        AbstractC6675d.m6344f(displayMetrics, "Argument must not be null");
        this.f8811b = displayMetrics;
        this.f8810a = interfaceC3205b;
        this.f8812c = c3210g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r5;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m4987c(p016b0.C3071g r9, android.graphics.BitmapFactory.Options r10, p077i0.InterfaceC5656l r11, p024c0.InterfaceC3205b r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto L22
            r11.mo118l()
            int r1 = r9.f1419a
            switch(r1) {
                case 7: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r9.f1420b
            z.h r1 = (p208z.C6803h) r1
            java.lang.Object r1 = r1.f11475b
            com.bumptech.glide.load.resource.bitmap.a r1 = (com.bumptech.glide.load.resource.bitmap.C3419a) r1
            monitor-enter(r1)
            byte[] r2 = r1.f2303a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.f2305c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r9
        L22:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = p077i0.AbstractC5665u.f8827b
            r4.lock()
            android.graphics.Bitmap r9 = r9.m2019c(r10)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L7c
            r4.unlock()
            return r9
        L35:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = android.support.v4.media.AbstractC0037f.m99x(r6, r7, r1, r8, r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r3)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = m4988d(r2)     // Catch: java.lang.Throwable -> L7c
            r1.append(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7c
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7c
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L7c
            if (r1 == 0) goto L66
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L7c
        L66:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7b
            r12.mo2142b(r0)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            android.graphics.Bitmap r9 = m4987c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L7c
            java.util.concurrent.locks.Lock r10 = p077i0.AbstractC5665u.f8827b
            r10.unlock()
            return r9
        L7a:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L7c
        L7c:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = p077i0.AbstractC5665u.f8827b
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p077i0.C5657m.m4987c(b0.g, android.graphics.BitmapFactory$Options, i0.l, c0.b):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public static String m4988d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: e */
    public static void m4989e(BitmapFactory.Options options) {
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

    /* renamed from: a */
    public final C5647c m4990a(C3071g c3071g, int i, int i8, C6763f c6763f, InterfaceC5656l interfaceC5656l) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f8812c.m2155e(byte[].class, 65536);
        synchronized (C5657m.class) {
            arrayDeque = f8809m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m4989e(options);
            }
        }
        options.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c6763f.m6436c(f8802f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c6763f.m6436c(f8803g);
        C5655k c5655k = (C5655k) c6763f.m6436c(C5655k.f8799g);
        boolean zBooleanValue = ((Boolean) c6763f.m6436c(f8804h)).booleanValue();
        C6762e c6762e = f8805i;
        try {
            C5647c c5647cM4972b = C5647c.m4972b(m4991b(c3071g, options, c5655k, decodeFormat, preferredColorSpace, c6763f.m6436c(c6762e) != null && ((Boolean) c6763f.m6436c(c6762e)).booleanValue(), i, i8, zBooleanValue, interfaceC5656l), this.f8810a);
            m4989e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f8812c.m2160j(bArr);
            return c5647cM4972b;
        } catch (Throwable th) {
            m4989e(options);
            ArrayDeque arrayDeque2 = f8809m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f8812c.m2160j(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap m4991b(p016b0.C3071g r44, android.graphics.BitmapFactory.Options r45, p077i0.C5655k r46, com.bumptech.glide.load.DecodeFormat r47, com.bumptech.glide.load.PreferredColorSpace r48, boolean r49, int r50, int r51, boolean r52, p077i0.InterfaceC5656l r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p077i0.C5657m.m4991b(b0.g, android.graphics.BitmapFactory$Options, i0.k, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, i0.l):android.graphics.Bitmap");
    }
}
