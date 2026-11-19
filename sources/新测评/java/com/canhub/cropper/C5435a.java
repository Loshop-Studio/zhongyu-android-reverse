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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p148io.CloseableKt;
import p152l1.AbstractC8489c;

/* renamed from: com.canhub.cropper.a */
/* loaded from: classes3.dex */
public final class C5435a {

    /* renamed from: a */
    public static final C5435a f4159a = new C5435a();

    /* renamed from: b */
    public static final Rect f4160b = new Rect();

    /* renamed from: c */
    public static final RectF f4161c = new RectF();

    /* renamed from: d */
    public static final RectF f4162d = new RectF();

    /* renamed from: e */
    public static final float[] f4163e = new float[6];

    /* renamed from: f */
    public static final float[] f4164f = new float[6];

    /* renamed from: g */
    public static int f4165g;

    /* renamed from: h */
    public static Pair f4166h;

    /* renamed from: com.canhub.cropper.a$a */
    public static final class a {

        /* renamed from: a */
        public final Bitmap f4167a;

        /* renamed from: b */
        public final int f4168b;

        public a(Bitmap bitmap, int i10) {
            this.f4167a = bitmap;
            this.f4168b = i10;
        }

        /* renamed from: a */
        public final Bitmap m3948a() {
            return this.f4167a;
        }

        /* renamed from: b */
        public final int m3949b() {
            return this.f4168b;
        }
    }

    /* renamed from: com.canhub.cropper.a$b */
    public static final class b {

        /* renamed from: a */
        public final Bitmap f4169a;

        /* renamed from: b */
        public final int f4170b;

        /* renamed from: c */
        public final boolean f4171c;

        /* renamed from: d */
        public final boolean f4172d;

        public b(Bitmap bitmap, int i10, boolean z9, boolean z10) {
            this.f4169a = bitmap;
            this.f4170b = i10;
            this.f4171c = z9;
            this.f4172d = z10;
        }

        /* renamed from: a */
        public final Bitmap m3950a() {
            return this.f4169a;
        }

        /* renamed from: b */
        public final int m3951b() {
            return this.f4170b;
        }

        /* renamed from: c */
        public final boolean m3952c() {
            return this.f4171c;
        }

        /* renamed from: d */
        public final boolean m3953d() {
            return this.f4172d;
        }
    }

    /* renamed from: com.canhub.cropper.a$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4173a;

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
            f4173a = iArr;
        }
    }

    /* renamed from: A */
    public final float m3911A(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: B */
    public final float m3912B(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: C */
    public final float m3913C(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: D */
    public final float m3914D(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return m3912B(points) - m3911A(points);
    }

    /* renamed from: E */
    public final b m3915E(Bitmap bitmap, Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ExifInterface exifInterface = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    ExifInterface exifInterface2 = new ExifInterface(inputStreamOpenInputStream);
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                    exifInterface = exifInterface2;
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        return exifInterface != null ? m3916F(bitmap, exifInterface) : new b(bitmap, 0, false, false);
    }

    /* renamed from: F */
    public final b m3916F(Bitmap bitmap, ExifInterface exif) {
        Intrinsics.checkNotNullParameter(exif, "exif");
        boolean z9 = true;
        int attributeInt = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        int i10 = attributeInt != 3 ? (attributeInt == 5 || attributeInt == 6 || attributeInt == 7) ? 90 : attributeInt != 8 ? 0 : 270 : 180;
        boolean z10 = attributeInt == 2 || attributeInt == 5;
        if (attributeInt != 4 && attributeInt != 7) {
            z9 = false;
        }
        return new b(bitmap, i10, z10, z9);
    }

    /* renamed from: G */
    public final Bitmap m3917G(Bitmap bitmap, int i10, int i11, CropImageView.RequestSizeOptions options) {
        Bitmap bitmapCreateScaledBitmap;
        Intrinsics.checkNotNullParameter(options, "options");
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions = CropImageView.RequestSizeOptions.f4076d;
                if (options == requestSizeOptions || options == CropImageView.RequestSizeOptions.f4075c || options == CropImageView.RequestSizeOptions.f4077e) {
                    if (options == CropImageView.RequestSizeOptions.f4077e) {
                        Intrinsics.checkNotNull(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        Intrinsics.checkNotNull(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i10, height / i11);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == requestSizeOptions) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!Intrinsics.areEqual(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        Intrinsics.checkNotNull(bitmap);
        return bitmap;
    }

    /* renamed from: H */
    public final Bitmap m3918H(Bitmap bitmap, int i10, boolean z9, boolean z10) {
        if (i10 <= 0 && !z9 && !z10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z9 ? -1 : 1, z10 ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (!Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: I */
    public final void m3919I(Pair pair) {
        f4166h = pair;
    }

    /* renamed from: J */
    public final Uri m3920J(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, Uri uri) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(compressFormat, "compressFormat");
        if (uri == null) {
            uri = m3922a(context, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
        Intrinsics.checkNotNull(outputStreamOpenOutputStream);
        try {
            bitmap.compress(compressFormat, i10, outputStreamOpenOutputStream);
            CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
            return uri;
        } finally {
        }
    }

    /* renamed from: K */
    public final Uri m3921K(Context context, Bitmap bitmap, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intrinsics.checkNotNull(bitmap);
            return m3920J(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e10);
            return null;
        }
    }

    /* renamed from: a */
    public final Uri m3922a(Context context, Bitmap.CompressFormat compressFormat) throws IOException {
        try {
            int i10 = c.f4173a[compressFormat.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? ".webp" : ".png" : ".jpg";
            if (Build.VERSION.SDK_INT < 29) {
                return Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            try {
                File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                Intrinsics.checkNotNull(fileCreateTempFile);
                return AbstractC8489c.m13915b(context, fileCreateTempFile);
            } catch (Exception e10) {
                Log.e("AIC", String.valueOf(e10.getMessage()));
                File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                Intrinsics.checkNotNull(fileCreateTempFile2);
                return AbstractC8489c.m13915b(context, fileCreateTempFile2);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to create temp file for output image", e11);
        }
    }

    /* renamed from: b */
    public final int m3923b(int i10, int i11) {
        if (f4165g == 0) {
            f4165g = m3939r();
        }
        int i12 = 1;
        if (f4165g <= 0) {
            return 1;
        }
        while (true) {
            int i13 = i11 / i12;
            int i14 = f4165g;
            if (i13 <= i14 && i10 / i12 <= i14) {
                return i12;
            }
            i12 *= 2;
        }
    }

    /* renamed from: c */
    public final int m3924c(int i10, int i11, int i12, int i13) {
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
    public final a m3925d(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z9, int i13, int i14, int i15, int i16, boolean z10, boolean z11) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        float[] cropPoints = fArr;
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        int i17 = 1;
        while (true) {
            try {
                Intrinsics.checkNotNull(uri);
                return m3926e(context2, uri, cropPoints, i10, i11, i12, z9, i13, i14, i15, i16, z10, z11, i17);
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
    public final com.canhub.cropper.C5435a.a m3926e(android.content.Context r17, android.net.Uri r18, float[] r19, int r20, int r21, int r22, boolean r23, int r24, int r25, int r26, int r27, boolean r28, boolean r29, int r30) {
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
            android.graphics.Rect r4 = r6.m3946y(r7, r8, r9, r10, r11, r12)
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
            com.canhub.cropper.a$a r1 = r6.m3934m(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L42
            android.graphics.Bitmap r0 = r1.m3948a()     // Catch: java.lang.Exception -> L43
            int r1 = r1.m3949b()     // Catch: java.lang.Exception -> L43
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
            android.graphics.Bitmap r2 = r6.m3918H(r1, r5, r13, r14)     // Catch: java.lang.OutOfMemoryError -> L6c
            int r1 = r5 % 90
            if (r1 == 0) goto L66
            r3 = r19
            r7 = r24
            r8 = r25
            r1 = r6
            r6 = r23
            android.graphics.Bitmap r2 = r1.m3930i(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.OutOfMemoryError -> L63
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
            com.canhub.cropper.a$a r0 = r1.m3927f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r0
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.C5435a.m3926e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.canhub.cropper.a$a");
    }

    /* renamed from: f */
    public final a m3927f(Context context, Uri uri, float[] fArr, int i10, boolean z9, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z10, boolean z11) throws Throwable {
        Bitmap bitmap;
        float[] fArr2;
        Bitmap bitmapM3929h = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iM3924c = i13 * m3924c(rect.width(), rect.height(), i14, i15);
            options.inSampleSize = iM3924c;
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            Bitmap bitmapM3931j = m3931j(contentResolver, uri, options);
            if (bitmapM3931j != null) {
                try {
                    int length = fArr.length;
                    try {
                        fArr2 = new float[length];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        for (int i16 = 0; i16 < length; i16++) {
                            fArr2[i16] = fArr2[i16] / options.inSampleSize;
                        }
                        bitmap = bitmapM3931j;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapM3931j;
                    }
                    try {
                        bitmapM3929h = m3929h(bitmap, fArr2, i10, z9, i11, i12, 1.0f, z10, z11);
                        if (!Intrinsics.areEqual(bitmapM3929h, bitmap)) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!Intrinsics.areEqual((Object) null, bitmap)) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = bitmapM3931j;
                }
            }
            return new a(bitmapM3929h, iM3924c);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmapM3929h.recycle();
            }
            throw e11;
        }
    }

    /* renamed from: g */
    public final a m3928g(Bitmap bitmap, float[] cropPoints, int i10, boolean z9, int i11, int i12, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        int i13 = 1;
        do {
            try {
                Intrinsics.checkNotNull(bitmap);
                return new a(m3929h(bitmap, cropPoints, i10, z9, i11, i12, 1 / i13, z10, z11), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    /* renamed from: h */
    public final Bitmap m3929h(Bitmap bitmap, float[] fArr, int i10, boolean z9, int i11, int i12, float f10, boolean z10, boolean z11) {
        float f11 = f10;
        Rect rectM3946y = m3946y(fArr, bitmap.getWidth(), bitmap.getHeight(), z9, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = z10 ? -f11 : f11;
        if (z11) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM3946y.left, rectM3946y.top, rectM3946y.width(), rectM3946y.height(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        if (Intrinsics.areEqual(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i10 % 90 != 0 ? m3930i(bitmapCreateBitmap, fArr, rectM3946y, i10, z9, i11, i12) : bitmapCreateBitmap;
    }

    /* renamed from: i */
    public final Bitmap m3930i(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z9, int i11, int i12) {
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
        if (z9) {
            m3935n(rect, i11, i12);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!Intrinsics.areEqual(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: j */
    public final Bitmap m3931j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws CropException.FailedToDecodeImage, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f4160b, options);
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    /* renamed from: k */
    public final BitmapFactory.Options m3932k(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, f4160b, options);
            options.inJustDecodeBounds = false;
            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
            return options;
        } finally {
        }
    }

    /* renamed from: l */
    public final a m3933l(Context context, Uri uri, int i10, int i11) throws CropException.FailedToLoadBitmap {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNull(contentResolver);
            BitmapFactory.Options optionsM3932k = m3932k(contentResolver, uri);
            int i12 = optionsM3932k.outWidth;
            if (i12 == -1 && optionsM3932k.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsM3932k.inSampleSize = Math.max(m3924c(i12, optionsM3932k.outHeight, i10, i11), m3923b(optionsM3932k.outWidth, optionsM3932k.outHeight));
            return new a(m3931j(contentResolver, uri, optionsM3932k), optionsM3932k.inSampleSize);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        }
    }

    /* renamed from: m */
    public final a m3934m(Context context, Uri uri, Rect rect, int i10, int i11, int i12) throws CropException.FailedToLoadBitmap, FileNotFoundException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i13;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * m3924c(rect.width(), rect.height(), i10, i11);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    Intrinsics.checkNotNull(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    Intrinsics.checkNotNull(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            Intrinsics.checkNotNull(bitmapRegionDecoderNewInstance);
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
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
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return new a(null, 1);
            } finally {
            }
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        }
    }

    /* renamed from: n */
    public final void m3935n(Rect rect, int i10, int i11) {
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
    public final Rect m3936o() {
        return f4160b;
    }

    /* renamed from: p */
    public final RectF m3937p() {
        return f4161c;
    }

    /* renamed from: q */
    public final Pair m3938q() {
        return f4166h;
    }

    /* renamed from: r */
    public final int m3939r() {
        try {
            EGL egl = EGLContext.getEGL();
            Intrinsics.checkNotNull(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
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
    public final float[] m3940s() {
        return f4163e;
    }

    /* renamed from: t */
    public final float[] m3941t() {
        return f4164f;
    }

    /* renamed from: u */
    public final RectF m3942u() {
        return f4162d;
    }

    /* renamed from: v */
    public final float m3943v(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: w */
    public final float m3944w(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (m3912B(points) + m3911A(points)) / 2.0f;
    }

    /* renamed from: x */
    public final float m3945x(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return (m3943v(points) + m3913C(points)) / 2.0f;
    }

    /* renamed from: y */
    public final Rect m3946y(float[] cropPoints, int i10, int i11, boolean z9, int i12, int i13) {
        Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
        Rect rect = new Rect(MathKt.roundToInt(Math.max(0.0f, m3911A(cropPoints))), MathKt.roundToInt(Math.max(0.0f, m3913C(cropPoints))), MathKt.roundToInt(Math.min(i10, m3912B(cropPoints))), MathKt.roundToInt(Math.min(i11, m3943v(cropPoints))));
        if (z9) {
            m3935n(rect, i12, i13);
        }
        return rect;
    }

    /* renamed from: z */
    public final float m3947z(float[] points) {
        Intrinsics.checkNotNullParameter(points, "points");
        return m3943v(points) - m3913C(points);
    }
}
