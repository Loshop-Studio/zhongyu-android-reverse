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
import coil3.network.AbstractC3315g;
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
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p169t6.AbstractC6600a;

/* renamed from: com.canhub.cropper.h */
/* loaded from: classes2.dex */
public abstract class AbstractC3437h {

    /* renamed from: a */
    public static final Rect f2603a = new Rect();

    /* renamed from: b */
    public static final RectF f2604b = new RectF();

    /* renamed from: c */
    public static final RectF f2605c = new RectF();

    /* renamed from: d */
    public static final float[] f2606d = new float[6];

    /* renamed from: e */
    public static final float[] f2607e = new float[6];

    /* renamed from: f */
    public static int f2608f;

    /* renamed from: g */
    public static Pair f2609g;

    /* renamed from: a */
    public static int m2470a(int i, int i8) {
        int i9 = 1;
        if (f2608f == 0) {
            int iMax = 2048;
            try {
                EGL egl = EGLContext.getEGL();
                AbstractC5830k.m5328e(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
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
                iMax = Math.max(i12, 2048);
            } catch (Exception unused) {
            }
            f2608f = iMax;
        }
        if (f2608f > 0) {
            while (true) {
                int i15 = i8 / i9;
                int i16 = f2608f;
                if (i15 <= i16 && i / i9 <= i16) {
                    break;
                }
                i9 *= 2;
            }
        }
        return i9;
    }

    /* renamed from: b */
    public static int m2471b(int i, int i8, int i9, int i10) {
        int i11 = 1;
        if (i8 <= i10 && i <= i9) {
            return 1;
        }
        while ((i8 / 2) / i11 > i10 && (i / 2) / i11 > i9) {
            i11 *= 2;
        }
        return i11;
    }

    /* renamed from: c */
    public static C3431e m2472c(Context context, Uri uri, float[] fArr, int i, int i8, int i9, boolean z8, int i10, int i11, int i12, int i13, boolean z9, boolean z10) {
        float[] cropPoints = fArr;
        AbstractC5830k.m5330g(cropPoints, "cropPoints");
        int i14 = 1;
        while (true) {
            try {
                AbstractC5830k.m5327d(uri);
                return m2473d(context, uri, cropPoints, i, i8, i9, z8, i10, i11, i12, i13, z9, z10, i14);
            } catch (OutOfMemoryError e) {
                i14 *= 2;
                if (i14 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i14 + "): " + uri + "\r\n" + e.getMessage(), e);
                }
                cropPoints = fArr;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a A[Catch: OutOfMemoryError -> 0x0099, TRY_LEAVE, TryCatch #5 {OutOfMemoryError -> 0x0099, blocks: (B:37:0x0086, B:39:0x008a), top: B:87:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.canhub.cropper.C3431e m2473d(android.content.Context r19, android.net.Uri r20, float[] r21, int r22, int r23, int r24, boolean r25, int r26, int r27, int r28, int r29, boolean r30, boolean r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.AbstractC3437h.m2473d(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):com.canhub.cropper.e");
    }

    /* renamed from: e */
    public static C3431e m2474e(Bitmap bitmap, float[] cropPoints, int i, boolean z8, int i8, int i9, boolean z9, boolean z10) {
        AbstractC5830k.m5330g(cropPoints, "cropPoints");
        int i10 = 1;
        do {
            try {
                AbstractC5830k.m5327d(bitmap);
                return new C3431e(m2475f(bitmap, cropPoints, i, z8, i8, i9, 1 / i10, z9, z10), i10);
            } catch (OutOfMemoryError e) {
                i10 *= 2;
            }
        } while (i10 <= 8);
        throw e;
    }

    /* renamed from: f */
    public static Bitmap m2475f(Bitmap bitmap, float[] fArr, int i, boolean z8, int i8, int i9, float f, boolean z9, boolean z10) {
        Rect rectM2484o = m2484o(fArr, bitmap.getWidth(), bitmap.getHeight(), z8, i8, i9);
        Matrix matrix = new Matrix();
        matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        matrix.postScale(z9 ? -f : f, z10 ? -f : f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectM2484o.left, rectM2484o.top, rectM2484o.width(), rectM2484o.height(), matrix, true);
        AbstractC5830k.m5329f(bitmapCreateBitmap, "createBitmap(...)");
        if (bitmapCreateBitmap.equals(bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        return i % 90 != 0 ? m2476g(bitmap2, fArr, rectM2484o, i, z8, i8, i9) : bitmap2;
    }

    /* renamed from: g */
    public static Bitmap m2476g(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z8, int i8, int i9) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(i);
        int i10 = (i < 90 || (181 <= i && i < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= fArr.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f = fArr[i11];
            if (f >= i10 - 1 && f <= i10 + 1) {
                int i12 = i11 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * (rect.bottom - fArr[i12]));
                iAbs2 = (int) Math.abs(Math.cos(radians) * (fArr[i12] - rect.top));
                iAbs3 = (int) Math.abs((fArr[i12] - rect.top) / Math.sin(radians));
                iAbs = (int) Math.abs((rect.bottom - fArr[i12]) / Math.cos(radians));
                break;
            }
            i11 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (z8) {
            m2480k(rect, i8, i9);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!AbstractC5830k.m5325b(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: h */
    public static Bitmap m2477h(ContentResolver contentResolver, Uri uri, BitmapFactory.Options options) throws CropException.FailedToDecodeImage, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, f2603a, options);
                    AbstractC3315g.m2237e(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    AbstractC3315g.m2237e(inputStreamOpenInputStream, null);
                }
            } finally {
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    /* renamed from: i */
    public static C3431e m2478i(Context context, Uri uri, int i, int i8) throws CropException.FailedToLoadBitmap, FileNotFoundException {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            AbstractC5830k.m5327d(contentResolver);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStreamOpenInputStream, f2603a, options);
                options.inJustDecodeBounds = false;
                AbstractC3315g.m2237e(inputStreamOpenInputStream, null);
                int i9 = options.outWidth;
                if (i9 == -1 && options.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
                options.inSampleSize = Math.max(m2471b(i9, options.outHeight, i, i8), m2470a(options.outWidth, options.outHeight));
                return new C3431e(m2477h(contentResolver, uri, options), options.inSampleSize);
            } finally {
            }
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(uri, e.getMessage());
        }
    }

    /* renamed from: j */
    public static C3431e m2479j(Context context, Uri uri, Rect rect, int i, int i8, int i9) throws CropException.FailedToLoadBitmap, FileNotFoundException {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i10;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i9 * m2471b(rect.width(), rect.height(), i, i8);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    AbstractC5830k.m5327d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    AbstractC5830k.m5327d(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            AbstractC5830k.m5327d(bitmapRegionDecoderNewInstance);
                            C3431e c3431e = new C3431e(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            AbstractC3315g.m2237e(inputStreamOpenInputStream, null);
                            return c3431e;
                        } catch (OutOfMemoryError unused) {
                            i10 = options.inSampleSize * 2;
                            options.inSampleSize = i10;
                        }
                    } finally {
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                    }
                } while (i10 <= 512);
                AbstractC3315g.m2237e(inputStreamOpenInputStream, null);
                return new C3431e(null, 1);
            } finally {
            }
        } catch (Exception e) {
            throw new CropException.FailedToLoadBitmap(uri, e.getMessage());
        }
    }

    /* renamed from: k */
    public static void m2480k(Rect rect, int i, int i8) {
        if (i != i8 || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    /* renamed from: l */
    public static float m2481l(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: m */
    public static float m2482m(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return (m2486q(points) + m2487r(points)) / 2.0f;
    }

    /* renamed from: n */
    public static float m2483n(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return (m2488s(points) + m2481l(points)) / 2.0f;
    }

    /* renamed from: o */
    public static Rect m2484o(float[] cropPoints, int i, int i8, boolean z8, int i9, int i10) {
        AbstractC5830k.m5330g(cropPoints, "cropPoints");
        Rect rect = new Rect(AbstractC6600a.m6241q(Math.max(0.0f, m2486q(cropPoints))), AbstractC6600a.m6241q(Math.max(0.0f, m2488s(cropPoints))), AbstractC6600a.m6241q(Math.min(i, m2487r(cropPoints))), AbstractC6600a.m6241q(Math.min(i8, m2481l(cropPoints))));
        if (z8) {
            m2480k(rect, i9, i10);
        }
        return rect;
    }

    /* renamed from: p */
    public static float m2485p(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return m2481l(points) - m2488s(points);
    }

    /* renamed from: q */
    public static float m2486q(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: r */
    public static float m2487r(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    /* renamed from: s */
    public static float m2488s(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    /* renamed from: t */
    public static float m2489t(float[] points) {
        AbstractC5830k.m5330g(points, "points");
        return m2487r(points) - m2486q(points);
    }

    /* renamed from: u */
    public static Bitmap m2490u(Bitmap bitmap, int i, int i8, CropImageView.RequestSizeOptions options) {
        Bitmap bitmapCreateScaledBitmap;
        AbstractC5830k.m5330g(options, "options");
        if (i > 0 && i8 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions = CropImageView.RequestSizeOptions.RESIZE_FIT;
                if (options == requestSizeOptions || options == CropImageView.RequestSizeOptions.RESIZE_INSIDE || options == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                    if (options == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                        AbstractC5830k.m5327d(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i8, false);
                    } else {
                        AbstractC5830k.m5327d(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / i, height / i8);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == requestSizeOptions) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!bitmapCreateScaledBitmap.equals(bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e);
            }
        }
        AbstractC5830k.m5327d(bitmap);
        return bitmap;
    }

    /* renamed from: v */
    public static Uri m2491v(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, Uri uri) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(compressFormat, "compressFormat");
        if (uri == null) {
            try {
                int i8 = AbstractC3435g.f2596a[compressFormat.ordinal()];
                String str = i8 != 1 ? i8 != 2 ? ".webp" : ".png" : ".jpg";
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                        AbstractC5830k.m5327d(fileCreateTempFile);
                        uri = AbstractC0000a.m10k(context, fileCreateTempFile);
                    } catch (Exception e) {
                        Log.e("AIC", String.valueOf(e.getMessage()));
                        File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                        AbstractC5830k.m5327d(fileCreateTempFile2);
                        uri = AbstractC0000a.m10k(context, fileCreateTempFile2);
                    }
                } else {
                    uri = Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
                }
            } catch (IOException e4) {
                throw new RuntimeException("Failed to create temp file for output image", e4);
            }
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
        AbstractC5830k.m5327d(outputStreamOpenOutputStream);
        try {
            bitmap.compress(compressFormat, i, outputStreamOpenOutputStream);
            outputStreamOpenOutputStream.close();
            return uri;
        } finally {
        }
    }
}
