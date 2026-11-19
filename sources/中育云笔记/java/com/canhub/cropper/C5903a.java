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
import cd.AbstractC5423b;
import com.alibaba.fastjson.asm.Opcodes;
import com.canhub.cropper.CropException;
import com.canhub.cropper.CropImageView;
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
import kotlin.jvm.internal.AbstractC9979u;
import p157g1.AbstractC9260c;
import p211jd.AbstractC9719c;
import p309qc.C10786q;

/* renamed from: com.canhub.cropper.a */
/* loaded from: classes3.dex */
public final class C5903a {

    /* renamed from: a */
    public static final C5903a f5362a = new C5903a();

    /* renamed from: b */
    public static final Rect f5363b = new Rect();

    /* renamed from: c */
    public static final RectF f5364c = new RectF();

    /* renamed from: d */
    public static final RectF f5365d = new RectF();

    /* renamed from: e */
    public static final float[] f5366e = new float[6];

    /* renamed from: f */
    public static final float[] f5367f = new float[6];

    /* renamed from: g */
    public static int f5368g;

    /* renamed from: h */
    public static Pair f5369h;

    /* renamed from: com.canhub.cropper.a$a */
    public static final class a {

        /* renamed from: a */
        public final Bitmap f5370a;

        /* renamed from: b */
        public final int f5371b;

        public a(Bitmap bitmap, int i10) {
            this.f5370a = bitmap;
            this.f5371b = i10;
        }

        /* renamed from: a */
        public final Bitmap m4594a() {
            return this.f5370a;
        }

        /* renamed from: b */
        public final int m4595b() {
            return this.f5371b;
        }
    }

    /* renamed from: com.canhub.cropper.a$b */
    public static final class b {

        /* renamed from: a */
        public final Bitmap f5372a;

        /* renamed from: b */
        public final int f5373b;

        /* renamed from: c */
        public final boolean f5374c;

        /* renamed from: d */
        public final boolean f5375d;

        public b(Bitmap bitmap, int i10, boolean z10, boolean z11) {
            this.f5372a = bitmap;
            this.f5373b = i10;
            this.f5374c = z10;
            this.f5375d = z11;
        }

        /* renamed from: a */
        public final Bitmap m4596a() {
            return this.f5372a;
        }

        /* renamed from: b */
        public final int m4597b() {
            return this.f5373b;
        }

        /* renamed from: c */
        public final boolean m4598c() {
            return this.f5374c;
        }

        /* renamed from: d */
        public final boolean m4599d() {
            return this.f5375d;
        }
    }

    /* renamed from: com.canhub.cropper.a$c */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5376a;

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
            f5376a = iArr;
        }
    }

    /* renamed from: A */
    public final float m4557A(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: B */
    public final float m4558B(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: C */
    public final float m4559C(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: D */
    public final float m4560D(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return m4558B(points) - m4557A(points);
    }

    /* renamed from: E */
    public final b m4561E(Bitmap bitmap, Context context, Uri uri) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(uri, "uri");
        ExifInterface exifInterface = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    ExifInterface exifInterface2 = new ExifInterface(inputStreamOpenInputStream);
                    AbstractC5423b.m2902a(inputStreamOpenInputStream, null);
                    exifInterface = exifInterface2;
                } finally {
                }
            }
        } catch (Throwable unused) {
        }
        return exifInterface != null ? m4562F(bitmap, exifInterface) : new b(bitmap, 0, false, false);
    }

    /* renamed from: F */
    public final b m4562F(Bitmap bitmap, ExifInterface exif) {
        AbstractC9979u.m20294g(exif, "exif");
        boolean z10 = true;
        int attributeInt = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        int i10 = attributeInt != 3 ? (attributeInt == 5 || attributeInt == 6 || attributeInt == 7) ? 90 : attributeInt != 8 ? 0 : 270 : Opcodes.GETFIELD;
        boolean z11 = attributeInt == 2 || attributeInt == 5;
        if (attributeInt != 4 && attributeInt != 7) {
            z10 = false;
        }
        return new b(bitmap, i10, z11, z10);
    }

    /* renamed from: G */
    public final Bitmap m4563G(Bitmap bitmap, int i10, int i11, CropImageView.RequestSizeOptions options) {
        Bitmap bitmapCreateScaledBitmap;
        AbstractC9979u.m20294g(options, "options");
        if (i10 > 0 && i11 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions = CropImageView.RequestSizeOptions.f5279f;
                if (options == requestSizeOptions || options == CropImageView.RequestSizeOptions.f5278e || options == CropImageView.RequestSizeOptions.f5280g) {
                    if (options == CropImageView.RequestSizeOptions.f5280g) {
                        AbstractC9979u.m20291d(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, false);
                    } else {
                        AbstractC9979u.m20291d(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i10, height / i11);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == requestSizeOptions) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!AbstractC9979u.m20289b(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e10) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e10);
            }
        }
        AbstractC9979u.m20291d(bitmap);
        return bitmap;
    }

    /* renamed from: H */
    public final Bitmap m4564H(Bitmap bitmap, int i10, boolean z10, boolean z11) {
        if (i10 <= 0 && !z10 && !z11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10);
        matrix.postScale(z10 ? -1 : 1, z11 ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        AbstractC9979u.m20293f(bitmapCreateBitmap, "createBitmap(...)");
        if (!AbstractC9979u.m20289b(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: I */
    public final void m4565I(Pair pair) {
        f5369h = pair;
    }

    /* renamed from: J */
    public final Uri m4566J(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(compressFormat, "compressFormat");
        if (uri == null) {
            uri = m4568a(context, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
        AbstractC9979u.m20291d(outputStreamOpenOutputStream);
        try {
            bitmap.compress(compressFormat, i10, outputStreamOpenOutputStream);
            AbstractC5423b.m2902a(outputStreamOpenOutputStream, null);
            return uri;
        } finally {
        }
    }

    /* renamed from: K */
    public final Uri m4567K(Context context, Bitmap bitmap, Uri uri) {
        AbstractC9979u.m20294g(context, "context");
        try {
            AbstractC9979u.m20291d(bitmap);
            return m4566J(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
        } catch (Exception e10) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e10);
            return null;
        }
    }

    /* renamed from: a */
    public final Uri m4568a(Context context, Bitmap.CompressFormat compressFormat) throws IOException {
        try {
            int i10 = c.f5376a[compressFormat.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? ".webp" : ".png" : ".jpg";
            if (Build.VERSION.SDK_INT < 29) {
                return Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            try {
                File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                AbstractC9979u.m20291d(fileCreateTempFile);
                return AbstractC9260c.m18257b(context, fileCreateTempFile);
            } catch (Exception e10) {
                Log.e("AIC", String.valueOf(e10.getMessage()));
                File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                AbstractC9979u.m20291d(fileCreateTempFile2);
                return AbstractC9260c.m18257b(context, fileCreateTempFile2);
            }
        } catch (IOException e11) {
            throw new RuntimeException("Failed to create temp file for output image", e11);
        }
    }

    /* renamed from: b */
    public final int m4569b(int i10, int i11) {
        if (f5368g == 0) {
            f5368g = m4585r();
        }
        int i12 = 1;
        if (f5368g <= 0) {
            return 1;
        }
        while (true) {
            int i13 = i11 / i12;
            int i14 = f5368g;
            if (i13 <= i14 && i10 / i12 <= i14) {
                return i12;
            }
            i12 *= 2;
        }
    }

    /* renamed from: c */
    public final int m4570c(int i10, int i11, int i12, int i13) {
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
    public final a m4571d(Context context, Uri uri, float[] fArr, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12) {
        Context context2 = context;
        AbstractC9979u.m20294g(context2, "context");
        float[] cropPoints = fArr;
        AbstractC9979u.m20294g(cropPoints, "cropPoints");
        int i17 = 1;
        while (true) {
            try {
                AbstractC9979u.m20291d(uri);
                return m4572e(context2, uri, cropPoints, i10, i11, i12, z10, i13, i14, i15, i16, z11, z12, i17);
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
    public final com.canhub.cropper.C5903a.a m4572e(android.content.Context r17, android.net.Uri r18, float[] r19, int r20, int r21, int r22, boolean r23, int r24, int r25, int r26, int r27, boolean r28, boolean r29, int r30) {
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
            android.graphics.Rect r4 = r6.m4592y(r7, r8, r9, r10, r11, r12)
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
            com.canhub.cropper.a$a r1 = r6.m4580m(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L42
            android.graphics.Bitmap r0 = r1.m4594a()     // Catch: java.lang.Exception -> L43
            int r1 = r1.m4595b()     // Catch: java.lang.Exception -> L43
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
            android.graphics.Bitmap r2 = r6.m4564H(r1, r5, r13, r14)     // Catch: java.lang.OutOfMemoryError -> L6c
            int r1 = r5 % 90
            if (r1 == 0) goto L66
            r3 = r19
            r7 = r24
            r8 = r25
            r1 = r6
            r6 = r23
            android.graphics.Bitmap r2 = r1.m4576i(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.OutOfMemoryError -> L63
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
            com.canhub.cropper.a$a r0 = r1.m4573f(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r0
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.C5903a.m4572e(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.canhub.cropper.a$a");
    }

    /* renamed from: f */
    public final a m4573f(Context context, Uri uri, float[] fArr, int i10, boolean z10, int i11, int i12, int i13, Rect rect, int i14, int i15, boolean z11, boolean z12) throws Throwable {
        Bitmap bitmap;
        float[] fArr2;
        Bitmap bitmapM4575h = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iM4570c = i13 * m4570c(rect.width(), rect.height(), i14, i15);
            options.inSampleSize = iM4570c;
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC9979u.m20293f(contentResolver, "getContentResolver(...)");
            Bitmap bitmapM4577j = m4577j(contentResolver, uri, options);
            if (bitmapM4577j != null) {
                try {
                    int length = fArr.length;
                    try {
                        fArr2 = new float[length];
                        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                        for (int i16 = 0; i16 < length; i16++) {
                            fArr2[i16] = fArr2[i16] / options.inSampleSize;
                        }
                        bitmap = bitmapM4577j;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = bitmapM4577j;
                    }
                    try {
                        bitmapM4575h = m4575h(bitmap, fArr2, i10, z10, i11, i12, 1.0f, z11, z12);
                        if (!AbstractC9979u.m20289b(bitmapM4575h, bitmap)) {
                            bitmap.recycle();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (!AbstractC9979u.m20289b(null, bitmap)) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = bitmapM4577j;
                }
            }
            return new a(bitmapM4575h, iM4570c);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        } catch (OutOfMemoryError e11) {
            if (0 != 0) {
                bitmapM4575h.recycle();
            }
            throw e11;
        }
    }

    /* renamed from: g */
    public final a m4574g(Bitmap bitmap, float[] cropPoints, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(cropPoints, "cropPoints");
        int i13 = 1;
        do {
            try {
                AbstractC9979u.m20291d(bitmap);
                return new a(m4575h(bitmap, cropPoints, i10, z10, i11, i12, 1 / i13, z11, z12), i13);
            } catch (OutOfMemoryError e10) {
                i13 *= 2;
            }
        } while (i13 <= 8);
        throw e10;
    }

    /* renamed from: h */
    public final Bitmap m4575h(Bitmap bitmap, float[] fArr, int i10, boolean z10, int i11, int i12, float f10, boolean z11, boolean z12) {
        float f11 = f10;
        Rect rectM4592y = m4592y(fArr, bitmap.getWidth(), bitmap.getHeight(), z10, i11, i12);
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = z11 ? -f11 : f11;
        if (z12) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM4592y.left, rectM4592y.top, rectM4592y.width(), rectM4592y.height(), matrix, true);
        AbstractC9979u.m20293f(bitmapCreateBitmap, "createBitmap(...)");
        if (AbstractC9979u.m20289b(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i10 % 90 != 0 ? m4576i(bitmapCreateBitmap, fArr, rectM4592y, i10, z10, i11, i12) : bitmapCreateBitmap;
    }

    /* renamed from: i */
    public final Bitmap m4576i(Bitmap bitmap, float[] fArr, Rect rect, int i10, boolean z10, int i11, int i12) {
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
            m4581n(rect, i11, i12);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!AbstractC9979u.m20289b(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: j */
    public final Bitmap m4577j(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws IllegalAccessException, CropException.FailedToDecodeImage, IOException, IllegalArgumentException, InvocationTargetException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f5363b, options);
                    AbstractC5423b.m2902a(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC5423b.m2902a(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    /* renamed from: k */
    public final BitmapFactory.Options m4578k(ContentResolver contentResolver, Uri uri) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, f5363b, options);
            options.inJustDecodeBounds = false;
            AbstractC5423b.m2902a(inputStreamOpenInputStream, null);
            return options;
        } finally {
        }
    }

    /* renamed from: l */
    public final a m4579l(Context context, Uri uri, int i10, int i11) throws CropException.FailedToLoadBitmap {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(uri, "uri");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC9979u.m20291d(contentResolver);
            BitmapFactory.Options optionsM4578k = m4578k(contentResolver, uri);
            int i12 = optionsM4578k.outWidth;
            if (i12 == -1 && optionsM4578k.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsM4578k.inSampleSize = Math.max(m4570c(i12, optionsM4578k.outHeight, i10, i11), m4569b(optionsM4578k.outWidth, optionsM4578k.outHeight));
            return new a(m4577j(contentResolver, uri, optionsM4578k), optionsM4578k.inSampleSize);
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        }
    }

    /* renamed from: m */
    public final a m4580m(Context context, Uri uri, Rect rect, int i10, int i11, int i12) throws CropException.FailedToLoadBitmap, FileNotFoundException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i13;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i12 * m4570c(rect.width(), rect.height(), i10, i11);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC9979u.m20291d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    AbstractC9979u.m20291d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            AbstractC9979u.m20291d(bitmapRegionDecoderNewInstance);
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            AbstractC5423b.m2902a(inputStreamOpenInputStream, null);
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
                C10786q c10786q = C10786q.f26013a;
                AbstractC5423b.m2902a(inputStreamOpenInputStream, null);
                return new a(null, 1);
            } finally {
            }
        } catch (Exception e10) {
            throw new CropException.FailedToLoadBitmap(uri, e10.getMessage());
        }
    }

    /* renamed from: n */
    public final void m4581n(Rect rect, int i10, int i11) {
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
    public final Rect m4582o() {
        return f5363b;
    }

    /* renamed from: p */
    public final RectF m4583p() {
        return f5364c;
    }

    /* renamed from: q */
    public final Pair m4584q() {
        return f5369h;
    }

    /* renamed from: r */
    public final int m4585r() {
        try {
            EGL egl = EGLContext.getEGL();
            AbstractC9979u.m20292e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
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
    public final float[] m4586s() {
        return f5366e;
    }

    /* renamed from: t */
    public final float[] m4587t() {
        return f5367f;
    }

    /* renamed from: u */
    public final RectF m4588u() {
        return f5365d;
    }

    /* renamed from: v */
    public final float m4589v(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: w */
    public final float m4590w(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return (m4558B(points) + m4557A(points)) / 2.0f;
    }

    /* renamed from: x */
    public final float m4591x(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return (m4589v(points) + m4559C(points)) / 2.0f;
    }

    /* renamed from: y */
    public final Rect m4592y(float[] cropPoints, int i10, int i11, boolean z10, int i12, int i13) {
        AbstractC9979u.m20294g(cropPoints, "cropPoints");
        Rect rect = new Rect(AbstractC9719c.m19282d(Math.max(0.0f, m4557A(cropPoints))), AbstractC9719c.m19282d(Math.max(0.0f, m4559C(cropPoints))), AbstractC9719c.m19282d(Math.min(i10, m4558B(cropPoints))), AbstractC9719c.m19282d(Math.min(i11, m4589v(cropPoints))));
        if (z10) {
            m4581n(rect, i12, i13);
        }
        return rect;
    }

    /* renamed from: z */
    public final float m4593z(float[] points) {
        AbstractC9979u.m20294g(points, "points");
        return m4589v(points) - m4559C(points);
    }
}
