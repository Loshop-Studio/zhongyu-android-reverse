package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.compose.p006ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public final class ImageUtils {

    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN(EnvironmentCompat.MEDIA_UNKNOWN);

        String value;

        ImageType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    private ImageUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, boolean z3, float f5, boolean z4) {
        return addBorder(bitmap, f4, i4, z3, new float[]{f5, f5, f5, f5, f5, f5, f5, f5}, z4);
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4) {
        return addBorder(bitmap, f4, i4, true, 0.0f, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, @FloatRange(from = 0.0d) float f5) {
        return addBorder(bitmap, f4, i4, false, f5, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i4, int i5, int i6) {
        return addImageWatermark(bitmap, bitmap2, i4, i5, i6, false);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i4) {
        return addReflection(bitmap, i4, false);
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, int i4, @ColorInt int i5, float f4, float f5) {
        return addTextWatermark(bitmap, str, i4, i5, f4, f5, false);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return bitmap2Bytes(bitmap, Bitmap.CompressFormat.PNG, 100);
    }

    public static Drawable bitmap2Drawable(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Utils.getApp().getResources(), bitmap);
    }

    public static Bitmap bytes2Bitmap(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return bitmap2Drawable(bytes2Bitmap(bArr));
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i4, int i5) {
        int i6 = options.outHeight;
        int i7 = options.outWidth;
        int i8 = 1;
        while (true) {
            if (i6 <= i5 && i7 <= i4) {
                return i8;
            }
            i6 >>= 1;
            i7 >>= 1;
            i8 <<= 1;
        }
    }

    public static Bitmap clip(Bitmap bitmap, int i4, int i5, int i6, int i7) {
        return clip(bitmap, i4, i5, i6, i7, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, m96to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i4) {
        return compressByQuality(bitmap, i4, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i4) {
        return compressBySampleSize(bitmap, i4, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i4, int i5) {
        return scale(bitmap, i4, i5, false);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i4) {
        return drawColor(bitmap, i4, false);
    }

    public static Bitmap drawable2Bitmap(@Nullable Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static byte[] drawable2Bytes(@Nullable Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable));
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 1.0d) float f4, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 25.0d) float f5) {
        return fastBlur(bitmap, f4, f5, false, false);
    }

    public static Bitmap getBitmap(File file) {
        if (file == null) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getAbsolutePath());
    }

    public static ImageType getImageType(String str) {
        return getImageType(UtilsBridge.getFileByPath(str));
    }

    public static int getRotateDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static int[] getSize(String str) {
        return getSize(UtilsBridge.getFileByPath(str));
    }

    private static boolean isBMP(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 66 && bArr[1] == 77;
    }

    private static boolean isEmptyBitmap(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    private static boolean isGIF(byte[] bArr) {
        if (bArr.length < 6 || bArr[0] != 71 || bArr[1] != 73 || bArr[2] != 70 || bArr[3] != 56) {
            return false;
        }
        byte b4 = bArr[4];
        return (b4 == 55 || b4 == 57) && bArr[5] == 97;
    }

    public static boolean isImage(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return isImage(file.getPath());
    }

    private static boolean isJPEG(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == -1 && bArr[1] == -40;
    }

    private static boolean isPNG(byte[] bArr) {
        return bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10;
    }

    @RequiresApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 25.0d) float f4) {
        return renderScriptBlur(bitmap, f4, false);
    }

    public static Bitmap rotate(Bitmap bitmap, int i4, float f4, float f5) {
        return rotate(bitmap, i4, f4, f5, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, str, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, "", compressFormat, 100, false);
    }

    public static Bitmap scale(Bitmap bitmap, int i4, int i5) {
        return scale(bitmap, i4, i5, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f4, float f5) {
        return skew(bitmap, f4, f5, 0.0f, 0.0f, false);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i4) {
        return stackBlur(bitmap, i4, false);
    }

    public static Bitmap toAlpha(Bitmap bitmap) {
        return toAlpha(bitmap, Boolean.FALSE);
    }

    public static Bitmap toGray(Bitmap bitmap) {
        return toGray(bitmap, false);
    }

    public static Bitmap toRound(Bitmap bitmap) {
        return toRound(bitmap, 0, 0, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f4) {
        return toRoundCorner(bitmap, f4, 0.0f, 0, false);
    }

    public static Bitmap view2Bitmap(View view) {
        Bitmap bitmapCreateBitmap;
        if (view == null) {
            return null;
        }
        boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
        boolean zWillNotCacheDrawing = view.willNotCacheDrawing();
        view.setDrawingCacheEnabled(true);
        view.setWillNotCacheDrawing(false);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null || drawingCache.isRecycled()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            Bitmap drawingCache2 = view.getDrawingCache();
            if (drawingCache2 == null || drawingCache2.isRecycled()) {
                bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(bitmapCreateBitmap));
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawingCache2);
            }
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setWillNotCacheDrawing(zWillNotCacheDrawing);
        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
        return bitmapCreateBitmap;
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, boolean z3, float[] fArr, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z4) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i4);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f4);
        if (z3) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f4 / 2.0f), paint);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            float f5 = f4 / 2.0f;
            rectF.inset(f5, f5);
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
        return bitmap;
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, boolean z3) {
        return addBorder(bitmap, f4, i4, true, 0.0f, z3);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, float[] fArr) {
        return addBorder(bitmap, f4, i4, false, fArr, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i4, int i5, int i6, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (!isEmptyBitmap(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(bitmapCopy);
            paint.setAlpha(i6);
            canvas.drawBitmap(bitmap2, i4, i5, paint);
        }
        if (z3 && !bitmap.isRecycled() && bitmapCopy != bitmap) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static Bitmap addReflection(Bitmap bitmap, int i4, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, height - i4, width, i4, matrix, false);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height + i4, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f4 = height + 0;
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, f4, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, bitmapCreateBitmap2.getHeight() + 0, 1895825407, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f4, width, bitmapCreateBitmap2.getHeight(), paint);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap2 != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap2;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, float f4, @ColorInt int i4, float f5, float f6, boolean z3) {
        if (isEmptyBitmap(bitmap) || str == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(bitmapCopy);
        paint.setColor(i4);
        paint.setTextSize(f4);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f5, f6 + f4, paint);
        if (z3 && !bitmap.isRecycled() && bitmapCopy != bitmap) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static byte[] bitmap2Bytes(@Nullable Bitmap bitmap, @NonNull Bitmap.CompressFormat compressFormat, int i4) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i4, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap clip(Bitmap bitmap, int i4, int i5, int i6, int i7, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i4, i5, i6, i7);
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, m96to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis) int i4, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i4, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i4, int i5, boolean z3) {
        return scale(bitmap, i4, i5, z3);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i4, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z3) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i4, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i4) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat, i4);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 1.0d) float f4, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 25.0d) float f5, boolean z3) {
        return fastBlur(bitmap, f4, f5, z3, false);
    }

    public static Bitmap getBitmap(File file, int i4, int i5) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x002c -> B:36:0x002f). Please report as a decompilation issue!!! */
    public static ImageType getImageType(File file) throws Throwable {
        FileInputStream fileInputStream;
        ImageType imageType;
        FileInputStream fileInputStream2 = null;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                imageType = getImageType(fileInputStream);
            } catch (IOException e5) {
                e = e5;
                e.printStackTrace();
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return null;
            }
        } catch (IOException e6) {
            e = e6;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
        if (imageType == null) {
            fileInputStream.close();
            return null;
        }
        try {
            fileInputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
        return imageType;
    }

    public static int[] getSize(File file) {
        if (file == null) {
            return new int[]{0, 0};
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return new int[]{options.outWidth, options.outHeight};
    }

    @RequiresApi(17)
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 25.0d) float f4, boolean z3) {
        if (!z3) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        RenderScript renderScriptCreate = null;
        try {
            renderScriptCreate = RenderScript.create(Utils.getApp());
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(f4);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            renderScriptCreate.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            throw th;
        }
    }

    public static Bitmap rotate(Bitmap bitmap, int i4, float f4, float f5, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (i4 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i4, f4, f5);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, file, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z3) {
        return save2Album(bitmap, "", compressFormat, 100, z3);
    }

    public static Bitmap scale(Bitmap bitmap, int i4, int i5, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
        if (z3 && !bitmap.isRecycled() && bitmapCreateScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f4, float f5, boolean z3) {
        return skew(bitmap, f4, f5, 0.0f, 0.0f, z3);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i4, boolean z3) {
        int[] iArr;
        Bitmap bitmapCopy = z3 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i5 = i4 < 1 ? 1 : i4;
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i6 = width * height;
        int[] iArr2 = new int[i6];
        bitmapCopy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i7 = width - 1;
        int i8 = height - 1;
        int i9 = i5 + i5 + 1;
        int[] iArr3 = new int[i6];
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[Math.max(width, height)];
        int i10 = (i9 + 1) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr7 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr7[i13] = i13 / i11;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, 3);
        int i14 = i5 + 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < height) {
            Bitmap bitmap2 = bitmapCopy;
            int i18 = height;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = -i5;
            int i28 = 0;
            while (i27 <= i5) {
                int i29 = i8;
                int[] iArr9 = iArr6;
                int i30 = iArr2[i16 + Math.min(i7, Math.max(i27, 0))];
                int[] iArr10 = iArr8[i27 + i5];
                iArr10[0] = (i30 & 16711680) >> 16;
                iArr10[1] = (i30 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i30 & 255;
                int iAbs = i14 - Math.abs(i27);
                int i31 = iArr10[0];
                i28 += i31 * iAbs;
                int i32 = iArr10[1];
                i19 += i32 * iAbs;
                int i33 = iArr10[2];
                i20 += iAbs * i33;
                if (i27 > 0) {
                    i24 += i31;
                    i25 += i32;
                    i26 += i33;
                } else {
                    i21 += i31;
                    i22 += i32;
                    i23 += i33;
                }
                i27++;
                i8 = i29;
                iArr6 = iArr9;
            }
            int i34 = i8;
            int[] iArr11 = iArr6;
            int i35 = i28;
            int i36 = i5;
            int i37 = 0;
            while (i37 < width) {
                iArr3[i16] = iArr7[i35];
                iArr4[i16] = iArr7[i19];
                iArr5[i16] = iArr7[i20];
                int i38 = i35 - i21;
                int i39 = i19 - i22;
                int i40 = i20 - i23;
                int[] iArr12 = iArr8[((i36 - i5) + i9) % i9];
                int i41 = i21 - iArr12[0];
                int i42 = i22 - iArr12[1];
                int i43 = i23 - iArr12[2];
                if (i15 == 0) {
                    iArr = iArr7;
                    iArr11[i37] = Math.min(i37 + i5 + 1, i7);
                } else {
                    iArr = iArr7;
                }
                int i44 = iArr2[i17 + iArr11[i37]];
                int i45 = (i44 & 16711680) >> 16;
                iArr12[0] = i45;
                int i46 = (i44 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[1] = i46;
                int i47 = i44 & 255;
                iArr12[2] = i47;
                int i48 = i24 + i45;
                int i49 = i25 + i46;
                int i50 = i26 + i47;
                i35 = i38 + i48;
                i19 = i39 + i49;
                i20 = i40 + i50;
                i36 = (i36 + 1) % i9;
                int[] iArr13 = iArr8[i36 % i9];
                int i51 = iArr13[0];
                i21 = i41 + i51;
                int i52 = iArr13[1];
                i22 = i42 + i52;
                int i53 = iArr13[2];
                i23 = i43 + i53;
                i24 = i48 - i51;
                i25 = i49 - i52;
                i26 = i50 - i53;
                i16++;
                i37++;
                iArr7 = iArr;
            }
            i17 += width;
            i15++;
            height = i18;
            bitmapCopy = bitmap2;
            i8 = i34;
            iArr6 = iArr11;
        }
        Bitmap bitmap3 = bitmapCopy;
        int i54 = i8;
        int[] iArr14 = iArr6;
        int i55 = height;
        int[] iArr15 = iArr7;
        int i56 = 0;
        while (i56 < width) {
            int i57 = -i5;
            int i58 = i9;
            int[] iArr16 = iArr2;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = 0;
            int i65 = 0;
            int i66 = i57;
            int i67 = i57 * width;
            int i68 = 0;
            int i69 = 0;
            while (i66 <= i5) {
                int i70 = width;
                int iMax = Math.max(0, i67) + i56;
                int[] iArr17 = iArr8[i66 + i5];
                iArr17[0] = iArr3[iMax];
                iArr17[1] = iArr4[iMax];
                iArr17[2] = iArr5[iMax];
                int iAbs2 = i14 - Math.abs(i66);
                i68 += iArr3[iMax] * iAbs2;
                i69 += iArr4[iMax] * iAbs2;
                i59 += iArr5[iMax] * iAbs2;
                if (i66 > 0) {
                    i63 += iArr17[0];
                    i64 += iArr17[1];
                    i65 += iArr17[2];
                } else {
                    i60 += iArr17[0];
                    i61 += iArr17[1];
                    i62 += iArr17[2];
                }
                int i71 = i54;
                if (i66 < i71) {
                    i67 += i70;
                }
                i66++;
                i54 = i71;
                width = i70;
            }
            int i72 = width;
            int i73 = i54;
            int i74 = i55;
            int i75 = i56;
            int i76 = i5;
            int i77 = 0;
            while (i77 < i74) {
                iArr16[i75] = (iArr16[i75] & ViewCompat.MEASURED_STATE_MASK) | (iArr15[i68] << 16) | (iArr15[i69] << 8) | iArr15[i59];
                int i78 = i68 - i60;
                int i79 = i69 - i61;
                int i80 = i59 - i62;
                int[] iArr18 = iArr8[((i76 - i5) + i58) % i58];
                int i81 = i60 - iArr18[0];
                int i82 = i61 - iArr18[1];
                int i83 = i62 - iArr18[2];
                int i84 = i5;
                if (i56 == 0) {
                    iArr14[i77] = Math.min(i77 + i14, i73) * i72;
                }
                int i85 = iArr14[i77] + i56;
                int i86 = iArr3[i85];
                iArr18[0] = i86;
                int i87 = iArr4[i85];
                iArr18[1] = i87;
                int i88 = iArr5[i85];
                iArr18[2] = i88;
                int i89 = i63 + i86;
                int i90 = i64 + i87;
                int i91 = i65 + i88;
                i68 = i78 + i89;
                i69 = i79 + i90;
                i59 = i80 + i91;
                i76 = (i76 + 1) % i58;
                int[] iArr19 = iArr8[i76];
                int i92 = iArr19[0];
                i60 = i81 + i92;
                int i93 = iArr19[1];
                i61 = i82 + i93;
                int i94 = iArr19[2];
                i62 = i83 + i94;
                i63 = i89 - i92;
                i64 = i90 - i93;
                i65 = i91 - i94;
                i75 += i72;
                i77++;
                i5 = i84;
            }
            i56++;
            i54 = i73;
            i55 = i74;
            i9 = i58;
            iArr2 = iArr16;
            width = i72;
        }
        int i95 = width;
        bitmap3.setPixels(iArr2, 0, i95, 0, 0, i95, i55);
        return bitmap3;
    }

    public static Bitmap toAlpha(Bitmap bitmap, Boolean bool) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapExtractAlpha = bitmap.extractAlpha();
        if (bool.booleanValue() && !bitmap.isRecycled() && bitmapExtractAlpha != bitmap) {
            bitmap.recycle();
        }
        return bitmapExtractAlpha;
    }

    public static Bitmap toGray(Bitmap bitmap, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, boolean z3) {
        return toRound(bitmap, 0, 0, z3);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f4, boolean z3) {
        return toRoundCorner(bitmap, f4, 0.0f, 0, z3);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, float[] fArr, boolean z3) {
        return addBorder(bitmap, f4, i4, false, fArr, z3);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f4, float f5) {
        return scale(bitmap, f4, f5, false);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 1.0d) float f4, @FloatRange(from = 0.0d, fromInclusive = false, m95to = 25.0d) float f5, boolean z3, boolean z4) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f4);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f4, f4);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        Bitmap bitmapRenderScriptBlur = renderScriptBlur(bitmapCreateBitmap, f5, z3);
        if (f4 != 1.0f && !z4) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapRenderScriptBlur, width, height, true);
            if (!bitmapRenderScriptBlur.isRecycled()) {
                bitmapRenderScriptBlur.recycle();
            }
            if (z3 && !bitmap.isRecycled() && bitmapCreateScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        }
        if (z3 && !bitmap.isRecycled() && bitmapRenderScriptBlur != bitmap) {
            bitmap.recycle();
        }
        return bitmapRenderScriptBlur;
    }

    public static boolean isImage(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            if (options.outWidth > 0) {
                return options.outHeight > 0;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z3) {
        return save(bitmap, str, compressFormat, 100, z3);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4) {
        return save2Album(bitmap, "", compressFormat, i4, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f4, float f5, float f6, float f7) {
        return skew(bitmap, f4, f5, f6, f7, false);
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i4, @ColorInt int i5) {
        return toRound(bitmap, i4, i5, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f4, @FloatRange(from = 0.0d) float f5, @ColorInt int i4) {
        return toRoundCorner(bitmap, f4, f5, i4, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = 1.0d) float f4, @ColorInt int i4, @FloatRange(from = 0.0d) float f5, boolean z3) {
        return addBorder(bitmap, f4, i4, false, f5, z3);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f4, float f5, boolean z3) {
        return scale(bitmap, f4, f5, z3);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z3) {
        return save(bitmap, file, compressFormat, 100, z3);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i4, boolean z3) {
        return save2Album(bitmap, "", compressFormat, i4, z3);
    }

    public static Bitmap skew(Bitmap bitmap, float f4, float f5, float f6, float f7, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f4, f5, f6, f7);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i4, @ColorInt int i5, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f4 = iMin;
        float f5 = f4 / 2.0f;
        float f6 = width;
        float f7 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f6, f7);
        rectF.inset((width - iMin) / 2.0f, (height - iMin) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        if (width != height) {
            matrix.preScale(f4 / f6, f4 / f7);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (i4 > 0) {
            paint.setShader(null);
            paint.setColor(i5);
            paint.setStyle(Paint.Style.STROKE);
            float f8 = i4;
            paint.setStrokeWidth(f8);
            canvas.drawCircle(f6 / 2.0f, f7 / 2.0f, f5 - (f8 / 2.0f), paint);
        }
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = 0.0d) float f4, @ColorInt int i4) {
        return toRoundCorner(bitmap, fArr, f4, i4, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i4) {
        return save(bitmap, UtilsBridge.getFileByPath(str), compressFormat, i4, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, str, compressFormat, 100, false);
    }

    public static Bitmap scale(Bitmap bitmap, float f4, float f5) {
        return scale(bitmap, f4, f5, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f4, @FloatRange(from = 0.0d) float f5, @ColorInt int i4, boolean z3) {
        return toRoundCorner(bitmap, new float[]{f4, f4, f4, f4, f4, f4, f4, f4}, f5, i4, z3);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i4) {
        return save(bitmap, file, compressFormat, i4, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z3) {
        return save2Album(bitmap, str, compressFormat, 100, z3);
    }

    public static Bitmap scale(Bitmap bitmap, float f4, float f5, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f4, f5);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = 0.0d) float f4, @ColorInt int i4, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f5 = f4 / 2.0f;
        rectF.inset(f5, f5);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f4 > 0.0f) {
            paint.setShader(null);
            paint.setColor(i4);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f4);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint);
        }
        if (z3 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j4) {
        return compressByQuality(bitmap, j4, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i4, boolean z3) {
        return save(bitmap, UtilsBridge.getFileByPath(str), compressFormat, i4, z3);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i4) {
        return save2Album(bitmap, str, compressFormat, i4, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j4, boolean z3) {
        byte[] byteArray;
        int i4 = 0;
        if (isEmptyBitmap(bitmap) || j4 <= 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= j4) {
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() >= j4) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                int i6 = 0;
                while (i4 < i5) {
                    i6 = (i4 + i5) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i6, byteArrayOutputStream);
                    long size = byteArrayOutputStream.size();
                    if (size == j4) {
                        break;
                    }
                    if (size > j4) {
                        i5 = i6 - 1;
                    } else {
                        i4 = i6 + 1;
                    }
                }
                if (i5 == i6 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static Bitmap getBitmap(String str) {
        if (UtilsBridge.isSpace(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:42:0x006f). Please report as a decompilation issue!!! */
    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i4, boolean z3) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        boolean zCompress = false;
        if (isEmptyBitmap(bitmap)) {
            Log.e("ImageUtils", "bitmap is empty.");
            return false;
        }
        if (bitmap.isRecycled()) {
            Log.e("ImageUtils", "bitmap is recycled.");
            return false;
        }
        if (!UtilsBridge.createFileByDeleteOldFile(file)) {
            Log.e("ImageUtils", "create or delete file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            zCompress = bitmap.compress(compressFormat, i4, bufferedOutputStream);
            if (z3 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bufferedOutputStream.close();
        } catch (IOException e6) {
            e = e6;
            bufferedOutputStream2 = bufferedOutputStream;
            e.printStackTrace();
            if (bufferedOutputStream2 != null) {
                bufferedOutputStream2.close();
            }
            return zCompress;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            throw th;
        }
        return zCompress;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File save2Album(android.graphics.Bitmap r6, java.lang.String r7, android.graphics.Bitmap.CompressFormat r8, int r9, boolean r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ImageUtils.save2Album(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int, boolean):java.io.File");
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i4, int i5) {
        return compressBySampleSize(bitmap, i4, i5, false);
    }

    public static Bitmap getBitmap(String str, int i4, int i5) {
        if (UtilsBridge.isSpace(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i4, int i5, boolean z3) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = calculateInSampleSize(options, i4, i5);
        options.inJustDecodeBounds = false;
        if (z3 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    private static ImageType getImageType(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[12];
            if (inputStream.read(bArr) != -1) {
                return getImageType(bArr);
            }
            return null;
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    private static ImageType getImageType(byte[] bArr) {
        String upperCase = UtilsBridge.bytes2HexString(bArr).toUpperCase();
        if (upperCase.contains("FFD8FF")) {
            return ImageType.TYPE_JPG;
        }
        if (upperCase.contains("89504E47")) {
            return ImageType.TYPE_PNG;
        }
        if (upperCase.contains("47494638")) {
            return ImageType.TYPE_GIF;
        }
        if (!upperCase.contains("49492A00") && !upperCase.contains("4D4D002A")) {
            if (upperCase.contains("424D")) {
                return ImageType.TYPE_BMP;
            }
            if (upperCase.startsWith("52494646") && upperCase.endsWith("57454250")) {
                return ImageType.TYPE_WEBP;
            }
            if (!upperCase.contains("00000100") && !upperCase.contains("00000200")) {
                return ImageType.TYPE_UNKNOWN;
            }
            return ImageType.TYPE_ICO;
        }
        return ImageType.TYPE_TIFF;
    }

    public static Bitmap getBitmap(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap getBitmap(InputStream inputStream, int i4, int i5) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap getBitmap(byte[] bArr, int i4) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i4, bArr.length);
    }

    public static Bitmap getBitmap(byte[] bArr, int i4, int i5, int i6) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i4, bArr.length, options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i4, bArr.length, options);
    }

    public static Bitmap getBitmap(@DrawableRes int i4) {
        Drawable drawable = ContextCompat.getDrawable(Utils.getApp(), i4);
        if (drawable == null) {
            return null;
        }
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Bitmap getBitmap(@DrawableRes int i4, int i5, int i6) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = Utils.getApp().getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i4, options);
        options.inSampleSize = calculateInSampleSize(options, i5, i6);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i4, options);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor, int i4, int i5) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = calculateInSampleSize(options, i4, i5);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }
}
