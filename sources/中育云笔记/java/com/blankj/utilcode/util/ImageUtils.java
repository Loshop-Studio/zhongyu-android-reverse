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
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.google.android.material.color.utilities.Contrast;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public final class ImageUtils {

    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN("unknown");

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

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, boolean z10, float f11, boolean z11) {
        return addBorder(bitmap, f10, i10, z10, new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, z11);
    }

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10) {
        return addBorder(bitmap, f10, i10, true, 0.0f, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f11) {
        return addBorder(bitmap, f10, i10, false, f11, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12) {
        return addImageWatermark(bitmap, bitmap2, i10, i11, i12, false);
    }

    public static Bitmap addReflection(Bitmap bitmap, int i10) {
        return addReflection(bitmap, i10, false);
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, int i10, @ColorInt int i11, float f10, float f11) {
        return addTextWatermark(bitmap, str, i10, i11, f10, f11, false);
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

    public static int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        while (true) {
            if (i12 <= i11 && i13 <= i10) {
                return i14;
            }
            i12 >>= 1;
            i13 >>= 1;
            i14 <<= 1;
        }
    }

    public static Bitmap clip(Bitmap bitmap, int i10, int i11, int i12, int i13) {
        return clip(bitmap, i10, i11, i12, i13, false);
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, m338to = 100) int i10) {
        return compressByQuality(bitmap, i10, false);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i10) {
        return compressBySampleSize(bitmap, i10, false);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i10, int i11) {
        return scale(bitmap, i10, i11, false);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i10) {
        return drawColor(bitmap, i10, false);
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

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = Contrast.RATIO_MIN) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = 25.0d) float f11) {
        return fastBlur(bitmap, f10, f11, false, false);
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
                return Opcodes.GETFIELD;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e10) {
            e10.printStackTrace();
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
        byte b10;
        return bArr.length >= 6 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56 && ((b10 = bArr[4]) == 55 || b10 == 57) && bArr[5] == 97;
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
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = 25.0d) float f10) {
        return renderScriptBlur(bitmap, f10, false);
    }

    public static Bitmap rotate(Bitmap bitmap, int i10, float f10, float f11) {
        return rotate(bitmap, i10, f10, f11, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, str, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, "", compressFormat, 100, false);
    }

    public static Bitmap scale(Bitmap bitmap, int i10, int i11) {
        return scale(bitmap, i10, i11, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11) {
        return skew(bitmap, f10, f11, 0.0f, 0.0f, false);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i10) {
        return stackBlur(bitmap, i10, false);
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

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10) {
        return toRoundCorner(bitmap, f10, 0.0f, 0, false);
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

    public static Bitmap addCircleBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, boolean z10) {
        return addBorder(bitmap, f10, i10, true, 0.0f, z10);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, float[] fArr) {
        return addBorder(bitmap, f10, i10, false, fArr, false);
    }

    public static Bitmap addImageWatermark(Bitmap bitmap, Bitmap bitmap2, int i10, int i11, int i12, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        if (!isEmptyBitmap(bitmap2)) {
            Paint paint = new Paint(1);
            Canvas canvas = new Canvas(bitmapCopy);
            paint.setAlpha(i12);
            canvas.drawBitmap(bitmap2, i10, i11, paint);
        }
        if (z10 && !bitmap.isRecycled() && bitmapCopy != bitmap) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static Bitmap addReflection(Bitmap bitmap, int i10, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, height - i10, width, i10, matrix, false);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height + i10, bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        float f10 = height;
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, f10, (Paint) null);
        Paint paint = new Paint(1);
        paint.setShader(new LinearGradient(0.0f, height, 0.0f, bitmapCreateBitmap2.getHeight(), 1895825407, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.MIRROR));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawRect(0.0f, f10, width, bitmapCreateBitmap2.getHeight(), paint);
        if (!bitmapCreateBitmap.isRecycled()) {
            bitmapCreateBitmap.recycle();
        }
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap2 != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap2;
    }

    public static Bitmap addTextWatermark(Bitmap bitmap, String str, float f10, @ColorInt int i10, float f11, float f12, boolean z10) {
        if (isEmptyBitmap(bitmap) || str == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), true);
        Paint paint = new Paint(1);
        Canvas canvas = new Canvas(bitmapCopy);
        paint.setColor(i10);
        paint.setTextSize(f10);
        paint.getTextBounds(str, 0, str.length(), new Rect());
        canvas.drawText(str, f11, f12 + f10, paint);
        if (z10 && !bitmap.isRecycled() && bitmapCopy != bitmap) {
            bitmap.recycle();
        }
        return bitmapCopy;
    }

    public static byte[] bitmap2Bytes(@Nullable Bitmap bitmap, @NonNull Bitmap.CompressFormat compressFormat, int i10) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i10, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap clip(Bitmap bitmap, int i10, int i11, int i12, int i13, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i10, i11, i12, i13);
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, @IntRange(from = 0, m338to = 100) int i10, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return byteArray;
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i10, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    public static Bitmap compressByScale(Bitmap bitmap, int i10, int i11, boolean z10) {
        return scale(bitmap, i10, i11, z10);
    }

    public static Bitmap drawColor(@NonNull Bitmap bitmap, @ColorInt int i10, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z10) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        new Canvas(bitmap).drawColor(i10, PorterDuff.Mode.DARKEN);
        return bitmap;
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i10) {
        if (drawable == null) {
            return null;
        }
        return bitmap2Bytes(drawable2Bitmap(drawable), compressFormat, i10);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = Contrast.RATIO_MIN) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = 25.0d) float f11, boolean z10) {
        return fastBlur(bitmap, f10, f11, z10, false);
    }

    public static Bitmap getBitmap(File file, int i10, int i11) {
        if (file == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options);
    }

    public static ImageType getImageType(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            if (file == null) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    ImageType imageType = getImageType(fileInputStream);
                    if (imageType != null) {
                        try {
                            fileInputStream.close();
                            return imageType;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            return imageType;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
            try {
                fileInputStream.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
        }
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
    public static Bitmap renderScriptBlur(Bitmap bitmap, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = 25.0d) float f10, boolean z10) {
        if (!z10) {
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
            scriptIntrinsicBlurCreate.setRadius(f10);
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

    public static Bitmap rotate(Bitmap bitmap, int i10, float f10, float f11, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (i10 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i10, f10, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, file, compressFormat, 100, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, boolean z10) {
        return save2Album(bitmap, "", compressFormat, 100, z10);
    }

    public static Bitmap scale(Bitmap bitmap, int i10, int i11, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        if (z10 && !bitmap.isRecycled() && bitmapCreateScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11, boolean z10) {
        return skew(bitmap, f10, f11, 0.0f, 0.0f, z10);
    }

    public static Bitmap stackBlur(Bitmap bitmap, int i10, boolean z10) {
        int i11;
        Bitmap bitmapCopy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        int i12 = i10;
        if (i12 < 1) {
            i12 = 1;
        }
        int width = bitmapCopy.getWidth();
        int height = bitmapCopy.getHeight();
        int i13 = width * height;
        int[] iArr = new int[i13];
        bitmapCopy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i14 = width - 1;
        int i15 = height - 1;
        int i16 = i12 + i12;
        int i17 = i16 + 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[Math.max(width, height)];
        int i18 = (i16 + 2) >> 1;
        int i19 = i18 * i18;
        int i20 = i19 * 256;
        int[] iArr6 = new int[i20];
        int i21 = 0;
        for (int i22 = 0; i22 < i20; i22++) {
            iArr6[i22] = i22 / i19;
        }
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i17, 3);
        int i23 = i12 + 1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i24 < height) {
            int[] iArr8 = iArr6;
            int i27 = -i12;
            int i28 = i21;
            int i29 = i28;
            int i30 = i29;
            int i31 = i30;
            int i32 = i31;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = i35;
            while (i27 <= i12) {
                Bitmap bitmap2 = bitmapCopy;
                int[] iArr9 = iArr;
                int i37 = i21;
                int i38 = iArr9[i25 + Math.min(i14, Math.max(i27, i37))];
                int[] iArr10 = iArr7[i27 + i12];
                iArr10[i37] = (i38 & 16711680) >> 16;
                iArr10[1] = (i38 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i38 & 255;
                int iAbs = i23 - Math.abs(i27);
                int i39 = iArr10[i37];
                i36 += i39 * iAbs;
                int i40 = iArr10[1];
                i28 += i40 * iAbs;
                int i41 = iArr10[2];
                i29 += iAbs * i41;
                if (i27 > 0) {
                    i33 += i39;
                    i34 += i40;
                    i35 += i41;
                } else {
                    i30 += i39;
                    i31 += i40;
                    i32 += i41;
                }
                i27++;
                bitmapCopy = bitmap2;
                iArr = iArr9;
                i21 = 0;
            }
            Bitmap bitmap3 = bitmapCopy;
            int[] iArr11 = iArr;
            int i42 = i12;
            int i43 = 0;
            while (i43 < width) {
                iArr2[i25] = iArr8[i36];
                iArr3[i25] = iArr8[i28];
                iArr4[i25] = iArr8[i29];
                int i44 = i36 - i30;
                int i45 = i28 - i31;
                int i46 = i29 - i32;
                int[] iArr12 = iArr7[((i42 - i12) + i17) % i17];
                int i47 = i30 - iArr12[0];
                int i48 = i31 - iArr12[1];
                int i49 = i32 - iArr12[2];
                if (i24 == 0) {
                    i11 = i43;
                    iArr5[i11] = Math.min(i43 + i12 + 1, i14);
                } else {
                    i11 = i43;
                }
                int i50 = iArr11[i26 + iArr5[i11]];
                int i51 = (i50 & 16711680) >> 16;
                iArr12[0] = i51;
                int i52 = (i50 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[1] = i52;
                int i53 = i50 & 255;
                iArr12[2] = i53;
                int i54 = i33 + i51;
                int i55 = i34 + i52;
                int i56 = i35 + i53;
                i36 = i44 + i54;
                i28 = i45 + i55;
                i29 = i46 + i56;
                i42 = (i42 + 1) % i17;
                int[] iArr13 = iArr7[i42 % i17];
                int i57 = iArr13[0];
                i30 = i47 + i57;
                int i58 = iArr13[1];
                i31 = i48 + i58;
                int i59 = iArr13[2];
                i32 = i49 + i59;
                i33 = i54 - i57;
                i34 = i55 - i58;
                i35 = i56 - i59;
                i25++;
                i43 = i11 + 1;
            }
            i26 += width;
            i24++;
            iArr6 = iArr8;
            bitmapCopy = bitmap3;
            iArr = iArr11;
            i21 = 0;
        }
        int[] iArr14 = iArr6;
        Bitmap bitmap4 = bitmapCopy;
        int[] iArr15 = iArr;
        int i60 = 0;
        while (i60 < width) {
            int i61 = -i12;
            int i62 = i60;
            int i63 = i61 * width;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = 0;
            while (i61 <= i12) {
                int i73 = i12;
                int iMax = Math.max(0, i63) + i62;
                int[] iArr16 = iArr7[i61 + i73];
                iArr16[0] = iArr2[iMax];
                iArr16[1] = iArr3[iMax];
                iArr16[2] = iArr4[iMax];
                int iAbs2 = i23 - Math.abs(i61);
                i72 += iArr2[iMax] * iAbs2;
                i64 += iArr3[iMax] * iAbs2;
                i65 += iArr4[iMax] * iAbs2;
                if (i61 > 0) {
                    i69 += iArr16[0];
                    i70 += iArr16[1];
                    i71 += iArr16[2];
                } else {
                    i66 += iArr16[0];
                    i67 += iArr16[1];
                    i68 += iArr16[2];
                }
                if (i61 < i15) {
                    i63 += width;
                }
                i61++;
                i12 = i73;
            }
            int i74 = i12;
            int i75 = i72;
            int i76 = i62;
            int i77 = i74;
            for (int i78 = 0; i78 < height; i78++) {
                iArr15[i76] = (iArr15[i76] & ViewCompat.MEASURED_STATE_MASK) | (iArr14[i75] << 16) | (iArr14[i64] << 8) | iArr14[i65];
                int i79 = i75 - i66;
                int i80 = i64 - i67;
                int i81 = i65 - i68;
                int[] iArr17 = iArr7[((i77 - i74) + i17) % i17];
                int i82 = i66 - iArr17[0];
                int i83 = i67 - iArr17[1];
                int i84 = i68 - iArr17[2];
                if (i62 == 0) {
                    iArr5[i78] = Math.min(i78 + i23, i15) * width;
                }
                int i85 = i62 + iArr5[i78];
                int i86 = iArr2[i85];
                iArr17[0] = i86;
                int i87 = iArr3[i85];
                iArr17[1] = i87;
                int i88 = iArr4[i85];
                iArr17[2] = i88;
                int i89 = i69 + i86;
                int i90 = i70 + i87;
                int i91 = i71 + i88;
                i75 = i79 + i89;
                i64 = i80 + i90;
                i65 = i81 + i91;
                i77 = (i77 + 1) % i17;
                int[] iArr18 = iArr7[i77];
                int i92 = iArr18[0];
                i66 = i82 + i92;
                int i93 = iArr18[1];
                i67 = i83 + i93;
                int i94 = iArr18[2];
                i68 = i84 + i94;
                i69 = i89 - i92;
                i70 = i90 - i93;
                i71 = i91 - i94;
                i76 += width;
            }
            i60 = i62 + 1;
            i12 = i74;
        }
        bitmap4.setPixels(iArr15, 0, width, 0, 0, width, height);
        return bitmap4;
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

    public static Bitmap toGray(Bitmap bitmap, boolean z10) {
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
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, boolean z10) {
        return toRound(bitmap, 0, 0, z10);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10, boolean z10) {
        return toRoundCorner(bitmap, f10, 0.0f, 0, z10);
    }

    private static Bitmap addBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, boolean z10, float[] fArr, boolean z11) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        if (!z11) {
            bitmap = bitmap.copy(bitmap.getConfig(), true);
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(i10);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f10);
        if (z10) {
            canvas.drawCircle(width / 2.0f, height / 2.0f, (Math.min(width, height) / 2.0f) - (f10 / 2.0f), paint);
            return bitmap;
        }
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f11 = f10 / 2.0f;
        rectF.inset(f11, f11);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmap;
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, float[] fArr, boolean z10) {
        return addBorder(bitmap, f10, i10, false, fArr, z10);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f10, float f11) {
        return scale(bitmap, f10, f11, false);
    }

    public static Bitmap fastBlur(Bitmap bitmap, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = Contrast.RATIO_MIN) float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, m337to = 25.0d) float f11, boolean z10, boolean z11) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Paint paint = new Paint(3);
        Canvas canvas = new Canvas();
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.scale(f10, f10);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        Bitmap bitmapRenderScriptBlur = renderScriptBlur(bitmapCreateBitmap, f11, z10);
        if (f10 != 1.0f && !z11) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapRenderScriptBlur, width, height, true);
            if (!bitmapRenderScriptBlur.isRecycled()) {
                bitmapRenderScriptBlur.recycle();
            }
            if (z10 && !bitmap.isRecycled() && bitmapCreateScaledBitmap != bitmap) {
                bitmap.recycle();
            }
            return bitmapCreateScaledBitmap;
        }
        if (z10 && !bitmap.isRecycled() && bitmapRenderScriptBlur != bitmap) {
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
                if (options.outHeight > 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z10) {
        return save(bitmap, str, compressFormat, 100, z10);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10) {
        return save2Album(bitmap, "", compressFormat, i10, false);
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return skew(bitmap, f10, f11, f12, f13, false);
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i10, @ColorInt int i11) {
        return toRound(bitmap, i10, i11, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f11, @ColorInt int i10) {
        return toRoundCorner(bitmap, f10, f11, i10, false);
    }

    public static Bitmap addCornerBorder(Bitmap bitmap, @FloatRange(from = Contrast.RATIO_MIN) float f10, @ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f11, boolean z10) {
        return addBorder(bitmap, f10, i10, false, f11, z10);
    }

    public static Bitmap compressByScale(Bitmap bitmap, float f10, float f11, boolean z10) {
        return scale(bitmap, f10, f11, z10);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z10) {
        return save(bitmap, file, compressFormat, 100, z10);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, boolean z10) {
        return save2Album(bitmap, "", compressFormat, i10, z10);
    }

    public static Bitmap skew(Bitmap bitmap, float f10, float f11, float f12, float f13, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setSkew(f10, f11, f12, f13);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRound(Bitmap bitmap, @IntRange(from = 0) int i10, @ColorInt int i11, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Paint paint = new Paint(1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float f12 = width;
        float f13 = height;
        RectF rectF = new RectF(0.0f, 0.0f, f12, f13);
        rectF.inset((width - iMin) / 2.0f, (height - iMin) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.setTranslate(rectF.left, rectF.top);
        if (width != height) {
            matrix.preScale(f10 / f12, f10 / f13);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (i10 > 0) {
            paint.setShader(null);
            paint.setColor(i11);
            paint.setStyle(Paint.Style.STROKE);
            float f14 = i10;
            paint.setStrokeWidth(f14);
            canvas.drawCircle(f12 / 2.0f, f13 / 2.0f, f11 - (f14 / 2.0f), paint);
        }
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10, @ColorInt int i10) {
        return toRoundCorner(bitmap, fArr, f10, i10, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i10) {
        return save(bitmap, UtilsBridge.getFileByPath(str), compressFormat, i10, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save2Album(bitmap, str, compressFormat, 100, false);
    }

    public static Bitmap scale(Bitmap bitmap, float f10, float f11) {
        return scale(bitmap, f10, f11, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float f10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f11, @ColorInt int i10, boolean z10) {
        return toRoundCorner(bitmap, new float[]{f10, f10, f10, f10, f10, f10, f10, f10}, f11, i10, z10);
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i10) {
        return save(bitmap, file, compressFormat, i10, false);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, boolean z10) {
        return save2Album(bitmap, str, compressFormat, 100, z10);
    }

    public static Bitmap scale(Bitmap bitmap, float f10, float f11, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j10) {
        return compressByQuality(bitmap, j10, false);
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i10, boolean z10) {
        return save(bitmap, UtilsBridge.getFileByPath(str), compressFormat, i10, z10);
    }

    @Nullable
    public static File save2Album(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat, int i10) {
        return save2Album(bitmap, str, compressFormat, i10, false);
    }

    public static Bitmap toRoundCorner(Bitmap bitmap, float[] fArr, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10, @ColorInt int i10, boolean z10) {
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
        float f11 = f10 / 2.0f;
        rectF.inset(f11, f11);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f10 > 0.0f) {
            paint.setShader(null);
            paint.setColor(i10);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f10);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint);
        }
        if (z10 && !bitmap.isRecycled() && bitmapCreateBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static byte[] compressByQuality(Bitmap bitmap, long j10, boolean z10) {
        byte[] byteArray;
        int i10 = 0;
        if (!isEmptyBitmap(bitmap) && j10 > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
            int i11 = 100;
            bitmap.compress(compressFormat, 100, byteArrayOutputStream);
            if (byteArrayOutputStream.size() <= j10) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                byteArrayOutputStream.reset();
                bitmap.compress(compressFormat, 0, byteArrayOutputStream);
                if (byteArrayOutputStream.size() >= j10) {
                    byteArray = byteArrayOutputStream.toByteArray();
                } else {
                    int i12 = 0;
                    while (i10 < i11) {
                        i12 = (i10 + i11) / 2;
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                        long size = byteArrayOutputStream.size();
                        if (size == j10) {
                            break;
                        }
                        if (size > j10) {
                            i11 = i12 - 1;
                        } else {
                            i10 = i12 + 1;
                        }
                    }
                    if (i11 == i12 - 1) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                }
            }
            if (z10 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            return byteArray;
        }
        return new byte[0];
    }

    public static Bitmap getBitmap(String str) {
        if (UtilsBridge.isSpace(str)) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0061 -> B:48:0x0070). Please report as a decompilation issue!!! */
    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, int i10, boolean z10) throws Throwable {
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
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
        try {
            zCompress = bitmap.compress(compressFormat, i10, bufferedOutputStream);
            if (z10 && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            bufferedOutputStream.close();
        } catch (IOException e12) {
            e = e12;
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
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
            }
            throw th;
        }
        return zCompress;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File save2Album(android.graphics.Bitmap r6, java.lang.String r7, android.graphics.Bitmap.CompressFormat r8, int r9, boolean r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.ImageUtils.save2Album(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int, boolean):java.io.File");
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i10, int i11) {
        return compressBySampleSize(bitmap, i10, i11, false);
    }

    public static Bitmap getBitmap(String str, int i10, int i11) {
        if (UtilsBridge.isSpace(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap compressBySampleSize(Bitmap bitmap, int i10, int i11, boolean z10) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        if (z10 && !bitmap.isRecycled()) {
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
        } catch (IOException e10) {
            e10.printStackTrace();
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

    public static Bitmap getBitmap(InputStream inputStream, int i10, int i11) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap getBitmap(byte[] bArr, int i10) {
        if (bArr.length == 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, i10, bArr.length);
    }

    public static Bitmap getBitmap(byte[] bArr, int i10, int i11, int i12) {
        if (bArr.length == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i10, bArr.length, options);
        options.inSampleSize = calculateInSampleSize(options, i11, i12);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, i10, bArr.length, options);
    }

    public static Bitmap getBitmap(@DrawableRes int i10) {
        Drawable drawable = ContextCompat.getDrawable(Utils.getApp(), i10);
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

    public static Bitmap getBitmap(@DrawableRes int i10, int i11, int i12) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Resources resources = Utils.getApp().getResources();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i10, options);
        options.inSampleSize = calculateInSampleSize(options, i11, i12);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i10, options);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor) {
        if (fileDescriptor == null) {
            return null;
        }
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap getBitmap(FileDescriptor fileDescriptor, int i10, int i11) {
        if (fileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        options.inSampleSize = calculateInSampleSize(options, i10, i11);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }
}
