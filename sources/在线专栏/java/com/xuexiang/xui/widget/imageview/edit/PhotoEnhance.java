package com.xuexiang.xui.widget.imageview.edit;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.xuexiang.xui.utils.DrawableUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class PhotoEnhance {
    public static final int ENHANCE_BRIGHTNESS = 1;
    public static final int ENHANCE_CONTRAST = 2;
    public static final int ENHANCE_SATURATION = 0;
    private Bitmap mBitmap;
    private float mSaturationNum = 1.0f;
    private float mBrightNum = IGoodView.DEFAULT_TO_ALPHA;
    private float mContrastNum = 1.0f;
    private ColorMatrix mAllMatrix = null;
    private ColorMatrix mSaturationMatrix = null;
    private ColorMatrix mContrastMatrix = null;
    private ColorMatrix mBrightnessMatrix = null;

    public PhotoEnhance() {
    }

    public float getBrightness() {
        return this.mBrightNum;
    }

    public float getContrast() {
        return this.mContrastNum;
    }

    public float getSaturation() {
        return this.mSaturationNum;
    }

    public Bitmap handleImage(int i4) {
        Bitmap bitmapCreateBitmapSafely;
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || (bitmapCreateBitmapSafely = DrawableUtils.createBitmapSafely(bitmap.getWidth(), this.mBitmap.getHeight(), Bitmap.Config.ARGB_8888, 1)) == null) {
            return null;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmapSafely);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (this.mAllMatrix == null) {
            this.mAllMatrix = new ColorMatrix();
        }
        if (this.mSaturationMatrix == null) {
            this.mSaturationMatrix = new ColorMatrix();
        }
        if (this.mContrastMatrix == null) {
            this.mContrastMatrix = new ColorMatrix();
        }
        if (this.mBrightnessMatrix == null) {
            this.mBrightnessMatrix = new ColorMatrix();
        }
        if (i4 == 0) {
            this.mSaturationMatrix.reset();
            this.mSaturationMatrix.setSaturation(this.mSaturationNum);
        } else if (i4 == 1) {
            this.mBrightnessMatrix.reset();
            ColorMatrix colorMatrix = this.mBrightnessMatrix;
            float f4 = this.mBrightNum;
            colorMatrix.set(new float[]{1.0f, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f4, IGoodView.DEFAULT_TO_ALPHA, 1.0f, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f4, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f, IGoodView.DEFAULT_TO_ALPHA, f4, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f, IGoodView.DEFAULT_TO_ALPHA});
        } else if (i4 == 2) {
            float f5 = (1.0f - this.mContrastNum) * 128.0f;
            this.mContrastMatrix.reset();
            ColorMatrix colorMatrix2 = this.mContrastMatrix;
            float f6 = this.mContrastNum;
            colorMatrix2.set(new float[]{f6, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f5, IGoodView.DEFAULT_TO_ALPHA, f6, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f5, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f6, IGoodView.DEFAULT_TO_ALPHA, f5, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 1.0f, IGoodView.DEFAULT_TO_ALPHA});
        }
        this.mAllMatrix.reset();
        this.mAllMatrix.postConcat(this.mSaturationMatrix);
        this.mAllMatrix.postConcat(this.mBrightnessMatrix);
        this.mAllMatrix.postConcat(this.mContrastMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(this.mAllMatrix));
        canvas.drawBitmap(this.mBitmap, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, paint);
        return bitmapCreateBitmapSafely;
    }

    public boolean hasSetBitmap() {
        return this.mBitmap != null;
    }

    public PhotoEnhance setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
        return this;
    }

    public PhotoEnhance setBrightness(int i4) {
        this.mBrightNum = i4 - 128;
        return this;
    }

    public PhotoEnhance setContrast(int i4) {
        this.mContrastNum = (float) (((i4 / 2) + 64) / 128.0d);
        return this;
    }

    public PhotoEnhance setSaturation(int i4) {
        this.mSaturationNum = (i4 * 1.0f) / 128.0f;
        return this;
    }

    public PhotoEnhance(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }
}
