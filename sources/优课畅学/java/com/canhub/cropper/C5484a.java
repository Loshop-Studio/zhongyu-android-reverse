package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.canhub.cropper.CropException;
import com.canhub.cropper.CropImageView;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p149k0.AbstractC9049c;
import p256t7.AbstractC10117b;
import p322z7.AbstractC10729c;

/* renamed from: com.canhub.cropper.a */
/* loaded from: classes3.dex */
public final class C5484a {

    /* renamed from: a */
    public static final C5484a f3592a = new C5484a();

    /* renamed from: b */
    public static final Rect f3593b = new Rect();

    /* renamed from: c */
    public static final RectF f3594c = new RectF();

    /* renamed from: d */
    public static final RectF f3595d = new RectF();

    /* renamed from: e */
    public static final float[] f3596e = new float[6];

    /* renamed from: f */
    public static final float[] f3597f = new float[6];

    /* renamed from: g */
    public static int f3598g;

    /* renamed from: h */
    public static Pair f3599h;

    /* renamed from: com.canhub.cropper.a$a */
    public static final class a {

        /* renamed from: a */
        public final Bitmap f3600a;

        /* renamed from: b */
        public final int f3601b;

        public a(Bitmap bitmap, int i10) {
            this.f3600a = bitmap;
            this.f3601b = i10;
        }

        /* renamed from: a */
        public final Bitmap m3392a() {
            return this.f3600a;
        }

        /* renamed from: b */
        public final int m3393b() {
            return this.f3601b;
        }
    }

    /* renamed from: com.canhub.cropper.a$b */
    public static final class b {

        /* renamed from: a */
        public final Bitmap f3602a;

        /* renamed from: b */
        public final int f3603b;

        /* renamed from: c */
        public final boolean f3604c;

        /* renamed from: d */
        public final boolean f3605d;

        public b(Bitmap bitmap, int i10, boolean z10, boolean z11) {
            this.f3602a = bitmap;
            this.f3603b = i10;
            this.f3604c = z10;
            this.f3605d = z11;
        }

        /* renamed from: a */
        public final Bitmap m3394a() {
            return this.f3602a;
        }

        /* renamed from: b */
        public final int m3395b() {
            return this.f3603b;
        }

        /* renamed from: c */
        public final boolean m3396c() {
            return this.f3604c;
        }

        /* renamed from: d */
        public final boolean m3397d() {
            return this.f3605d;
        }
    }

    /* renamed from: com.canhub.cropper.a$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3606a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f3606a = iArr;
        }
    }

    /* renamed from: A */
    public final float m3355A(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: B */
    public final float m3356B(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: C */
    public final float m3357C(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: D */
    public final float m3358D(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return m3356B(points) - m3355A(points);
    }

    /* renamed from: E */
    public final b m3359E(Bitmap bitmap, Context context, Uri uri) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(uri, "uri");
        ExifInterface exifInterface = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    ExifInterface exifInterface2 = new ExifInterface(inputStreamOpenInputStream);
                    AbstractC10117b.m18861a(inputStreamOpenInputStream, null);
                    exifInterface = exifInterface2;
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        return exifInterface != null ? m3360F(bitmap, exifInterface) : new b(bitmap, 0, false, false);
    }

    /* renamed from: F */
    public final b m3360F(Bitmap bitmap, ExifInterface exif) {
        AbstractC9133u.m16133g(exif, "exif");
        boolean z10 = true;
        int attributeInt = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        int i10 = attributeInt != 3 ? (attributeInt == 5 || attributeInt == 6 || attributeInt == 7) ? 90 : attributeInt != 8 ? 0 : 270 : TXLiveConstants.RENDER_ROTATION_180;
        boolean z11 = attributeInt == 2 || attributeInt == 5;
        if (attributeInt != 4 && attributeInt != 7) {
            z10 = false;
        }
        return new b(bitmap, i10, z11, z10);
    }

    /* renamed from: G */
    public final Bitmap m3361G(Bitmap bitmap, int i10, int i11, CropImageView.RequestSizeOptions options) {
        Bitmap bitmapCreateScaledBitmap;
        AbstractC9133u.m16133g(options, "options");
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions = CropImageView.RequestSizeOptions.f3509d;
                if (options == requestSizeOptions || options == CropImageView.RequestSizeOptions.f3508c || options == CropImageView.RequestSizeOptions.f3510e) {
                    if (options == CropImageView.RequestSizeOptions.f3510e) {
                        AbstractC9133u.m16130d(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        AbstractC9133u.m16130d(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i10, height / i11);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == requestSizeOptions) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!AbstractC9133u.m16128b(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        AbstractC9133u.m16130d(bitmap);
        return bitmap;
    }

    /* renamed from: H */
    public final Bitmap m3362H(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        if (i10 <= 0 && !z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z10 ? -1 : 1, z11 ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        AbstractC9133u.m16132f(bitmapCreateBitmap, "createBitmap(...)");
        if (!AbstractC9133u.m16128b(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: I */
    public final void m3363I(Pair pair) {
        f3599h = pair;
    }

    /* renamed from: J */
    public final Uri m3364J(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(compressFormat, "compressFormat");
        if (uri == null) {
            uri = m3366a(context, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
        AbstractC9133u.m16130d(outputStreamOpenOutputStream);
        try {
            bitmap.compress(compressFormat, i10, outputStreamOpenOutputStream);
            AbstractC10117b.m18861a(outputStreamOpenOutputStream, null);
            return uri;
        } finally {
        }
    }

    /* renamed from: K */
    public final Uri m3365K(Context context, Bitmap bitmap, Uri uri) {
        AbstractC9133u.m16133g(context, "context");
        try {
            AbstractC9133u.m16130d(bitmap);
            return m3364J(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e10);
            return null;
        }
    }

    /* renamed from: a */
    public final Uri m3366a(Context context, Bitmap.CompressFormat compressFormat) throws IOException {
        try {
            int i10 = c.f3606a[compressFormat.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? ".webp" : ".png" : ".jpg";
            if (Build.VERSION.SDK_INT < 29) {
                return Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            try {
                File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                AbstractC9133u.m16130d(fileCreateTempFile);
                return AbstractC9049c.m15843b(context, fileCreateTempFile);
            } catch (Exception e10) {
                Log.e("AIC", String.valueOf(e10.getMessage()));
                File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                AbstractC9133u.m16130d(fileCreateTempFile2);
                return AbstractC9049c.m15843b(context, fileCreateTempFile2);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to create temp file for output image", e11);
        }
    }

    /* renamed from: b */
    public final int m3367b(int i10, int i11) {
        if (f3598g == 0) {
            f3598g = m3383r();
        }
        int i12 = 1;
        if (f3598g <= 0) {
            return 1;
        }
        while (true) {
            int i13 = i11 / i12;
            int i14 = f3598g;
            if (i13 <= i14 && i10 / i12 <= i14) {
                return i12;
            }
            i12 *= 2;
        }
    }

    /* renamed from: c */
    public final int m3368c(int i10, int i11, int i12, int i13) {
        int i14 = 1;
        if (i11 <= i13 && i10 <= i12) {
            return 1;
        }
        while ((i11 / 2) / i14 > i13 && (i10 / 2) / i14 > i12) {
            i14 *= 2;
        }
        return i14;
    }

    /* renamed from: d */
    public final a m3369d(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        Context context2 = context;
        AbstractC9133u.m16133g(context2, "context");
        float[] cropPoints = fArr;
        AbstractC9133u.m16133g(cropPoints, "cropPoints");
        int i17 = 1;
        while (true) {
            try {
                AbstractC9133u.m16130d(uri);
                return m3370e(context2, uri, cropPoints, i10, i11, i12, z10, i13, i14, i15, i16, z11, z12, i17);
            } catch (OutOfMemoryError e10) {
                i17 *= 2;
                if (i17 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i17 + "): " + uri + "\r\n" + e10.getMessage(), e10);
                }
                context2 = context;
                cropPoints = fArr;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.canhub.cropper.C5484a.a m3370e(android.content.Context r17, android.net.Uri r18, float[] r19, int r20, int r21, int r22, boolean r23, int r24, int r25, int r26, int r27, boolean r28, boolean r29, int r30) {
        /*
            r16 = this;
            r5 = r20
            r6 = r16
            r7 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            android.graphics.Rect r4 = r6.m3390y(r7, r8, r9, r10, r11, r12)
            if (r26 <= 0) goto L19
            r10 = r26
            goto L1e
        L19:
            int r0 = r4.width()
            r10 = r0
        L1e:
            if (r27 <= 0) goto L23
            r11 = r27
            goto L28
        L23:
            int r0 = r4.height()
            r11 = r0
        L28:
            r0 = 0
            r6 = r16
            r7 = r17
            r8 = r18
            r12 = r30
            r9 = r4
            com.canhub.cropper.a$a r1 = r6.m3378m(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L42
            android.graphics.Bitmap r0 = r1.m3392a()     // Catch: java.lang.Exception -> L43
            int r1 = r1.m3393b()     // Catch: java.lang.Exception -> L43
        L3e:
            r15 = r1
            r1 = r0
            r0 = r15
            goto L45
        L42:
            r4 = r9
        L43:
            r1 = 1
            goto L3e
        L45:
            if (r1 == 0) goto L71
            r6 = r16
            r13 = r28
            r14 = r29
            android.graphics.Bitmap r2 = r6.m3362H(r1, r5, r13, r14)     // Catch: java.lang.OutOfMemoryError -> L6c
            int r1 = r5 % 90
            if (r1 == 0) goto L66
            r3 = r19
            r7 = r24
            r8 = r25
            r1 = r6
            r6 = r23
            android.graphics.Bitmap r2 = r1.m3374i(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.OutOfMemoryError -> L63
            goto L66
        L63:
            r0 = move-exception
            r1 = r2
            goto L6d
        L66:
            com.canhub.cropper.a$a r1 = new com.canhub.cropper.a$a
            r1.<init>(r2, r0)
            goto L8d
        L6c:
            r0 = move-exception
        L6d:
            r1.recycle()
            throw r0
        L71:
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r23
            r7 = r24
            r8 = r25
            r13 = r28
            r14 = r29
            r9 = r30
            r12 = r11
            r11 = r10
            r10 = r4
            r4 = r19
            com.canhub.cropper.a$a r0 = r1.m3371f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r0
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.C5484a.m3370e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.canhub.cropper.a$a");
    }

    /* renamed from: f */
    public final a m3371f(Context context, Uri uri, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z11, boolean z12) throws Throwable {
        Bitmap bitmap;
        float[] fArr2;
        Bitmap bitmapM3373h = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iM3368c = i13 * m3368c(rect.width(), rect.height(), i14, i15);
            options.inSampleSize = iM3368c;
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC9133u.m16132f(contentResolver, "getContentResolver(...)");
            Bitmap bitmapM3375j = m3375j(contentResolver, uri, options);
            if (bitmapM3375j != null) {
                try {
                    int length = fArr.length;
                    try {
                        fArr2 = new float[length];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        for (int i16 = 0; i16 < length; i16++) {
                            fArr2[i16] = fArr2[i16] / options.inSampleSize;
                        }
                        bitmap = bitmapM3375j;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapM3375j;
                    }
                    try {
                        bitmapM3373h = m3373h(bitmap, fArr2, i10, z10, i11, i12, 1.0f, z11, z12);
                        if (!AbstractC9133u.m16128b(bitmapM3373h, bitmap)) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!AbstractC9133u.m16128b(null, bitmap)) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = bitmapM3375j;
                }
            }
            return new a(bitmapM3373h, iM3368c);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmapM3373h.recycle();
            }
            throw e11;
        }
    }

    /* renamed from: g */
    public final a m3372g(Bitmap bitmap, float[] cropPoints, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12) {
        AbstractC9133u.m16133g(cropPoints, "cropPoints");
        int i13 = 1;
        do {
            try {
                AbstractC9133u.m16130d(bitmap);
                return new a(m3373h(bitmap, cropPoints, i10, z10, i11, i12, 1 / i13, z11, z12), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    /* renamed from: h */
    public final Bitmap m3373h(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, float f10, boolean z11, boolean z12) {
        float f11 = f10;
        Rect rectM3390y = m3390y(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = z11 ? -f11 : f11;
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM3390y.left, rectM3390y.top, rectM3390y.width(), rectM3390y.height(), matrix, true);
        AbstractC9133u.m16132f(bitmapCreateBitmap, "createBitmap(...)");
        if (AbstractC9133u.m16128b(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i10 % 90 != 0 ? m3374i(bitmapCreateBitmap, fArr, rectM3390y, i10, z10, i11, i12) : bitmapCreateBitmap;
    }

    /* renamed from: i */
    public final Bitmap m3374i(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z10, int i11, int i12) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i10 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i10);
        int i13 = (i10 < 90 || (181 <= i10 && i10 < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f10 = fArr[i14];
            if (f10 >= i13 - 1 && f10 <= i13 + 1) {
                int i15 = i14 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i15]));
                iAbs2 = (int) Math.abs(Math.cos(radians) * (fArr[i15] - rect.top));
                iAbs3 = (int) Math.abs((fArr[i15] - rect.top) / Math.sin(radians));
                iAbs = (int) Math.abs((rect.bottom - fArr[i15]) / Math.cos(radians));
                break;
            }
            i14 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z10) {
            m3379n(rect, i11, i12);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!AbstractC9133u.m16128b(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: j */
    public final Bitmap m3375j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws IllegalAccessException, CropException.FailedToDecodeImage, IOException, IllegalArgumentException, InvocationTargetException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f3593b, options);
                    AbstractC10117b.m18861a(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC10117b.m18861a(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    /* renamed from: k */
    public final BitmapFactory.Options m3376k(ContentResolver contentResolver, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, f3593b, options);
            options.inJustDecodeBounds = false;
            AbstractC10117b.m18861a(inputStreamOpenInputStream, null);
            return options;
        } finally {
        }
    }

    /* renamed from: l */
    public final a m3377l(Context context, Uri uri, int i10, int i11) throws CropException.FailedToLoadBitmap {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(uri, "uri");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC9133u.m16130d(contentResolver);
            BitmapFactory.Options optionsM3376k = m3376k(contentResolver, uri);
            int i12 = optionsM3376k.outWidth;
            if (i12 == -1 && optionsM3376k.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsM3376k.inSampleSize = Math.max(m3368c(i12, optionsM3376k.outHeight, i10, i11), m3367b(optionsM3376k.outWidth, optionsM3376k.outHeight));
            return new a(m3375j(contentResolver, uri, optionsM3376k), optionsM3376k.inSampleSize);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        }
    }

    /* renamed from: m */
    public final a m3378m(Context context, Uri uri, Rect rect, int i10, int i11, int i12) throws CropException.FailedToLoadBitmap, FileNotFoundException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i13;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * m3368c(rect.width(), rect.height(), i10, i11);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC9133u.m16130d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    AbstractC9133u.m16130d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            AbstractC9133u.m16130d(bitmapRegionDecoderNewInstance);
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            AbstractC10117b.m18861a(inputStreamOpenInputStream, null);
                            return aVar;
                        } catch (OutOfMemoryError unused) {
                            i13 = options.inSampleSize * 2;
                            options.inSampleSize = i13;
                        }
                    } finally {
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                    }
                } while (i13 <= 512);
                C8736p c8736p = C8736p.f16368a;
                AbstractC10117b.m18861a(inputStreamOpenInputStream, null);
                return new a(null, 1);
            } finally {
            }
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        }
    }

    /* renamed from: n */
    public final void m3379n(Rect rect, int i10, int i11) {
        if (i10 != i11 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    /* renamed from: o */
    public final Rect m3380o() {
        return f3593b;
    }

    /* renamed from: p */
    public final RectF m3381p() {
        return f3594c;
    }

    /* renamed from: q */
    public final Pair m3382q() {
        return f3599h;
    }

    /* renamed from: r */
    public final int m3383r() {
        try {
            EGL egl = EGLContext.getEGL();
            AbstractC9133u.m16131e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i10 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i10, iArr);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i13], 12332, iArr2);
                int i14 = iArr2[0];
                if (i12 < i14) {
                    i12 = i14;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i12, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    /* renamed from: s */
    public final float[] m3384s() {
        return f3596e;
    }

    /* renamed from: t */
    public final float[] m3385t() {
        return f3597f;
    }

    /* renamed from: u */
    public final RectF m3386u() {
        return f3595d;
    }

    /* renamed from: v */
    public final float m3387v(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: w */
    public final float m3388w(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return (m3356B(points) + m3355A(points)) / 2.0f;
    }

    /* renamed from: x */
    public final float m3389x(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return (m3387v(points) + m3357C(points)) / 2.0f;
    }

    /* renamed from: y */
    public final Rect m3390y(float[] cropPoints, int i10, int i11, boolean z10, int i12, int i13) {
        AbstractC9133u.m16133g(cropPoints, "cropPoints");
        Rect rect = new Rect(AbstractC10729c.m20035d(Math.max(0.0f, m3355A(cropPoints))), AbstractC10729c.m20035d(Math.max(0.0f, m3357C(cropPoints))), AbstractC10729c.m20035d(Math.min(i10, m3356B(cropPoints))), AbstractC10729c.m20035d(Math.min(i11, m3387v(cropPoints))));
        if (z10) {
            m3379n(rect, i12, i13);
        }
        return rect;
    }

    /* renamed from: z */
    public final float m3391z(float[] points) {
        AbstractC9133u.m16133g(points, "points");
        return m3387v(points) - m3357C(points);
    }
}
