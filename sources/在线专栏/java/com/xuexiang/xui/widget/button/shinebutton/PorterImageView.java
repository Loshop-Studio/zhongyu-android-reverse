package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public abstract class PorterImageView extends AppCompatImageView {
    private static final PorterDuffXfermode PORTER_DUFF_XFERMODE = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    private Bitmap mDrawableBitmap;
    private Canvas mDrawableCanvas;
    private Paint mDrawablePaint;
    private boolean mInvalidated;
    private Bitmap mMaskBitmap;
    private Canvas mMaskCanvas;
    private Paint mMaskPaint;
    private int mPaintColor;

    public PorterImageView(Context context) {
        super(context);
        this.mPaintColor = -7829368;
        this.mInvalidated = true;
        init();
    }

    private void createMaskCanvas(int i4, int i5, int i6, int i7) {
        boolean z3 = (i4 == i6 && i5 == i7) ? false : true;
        if (i4 <= 0 || i5 <= 0) {
            return;
        }
        if (this.mMaskCanvas == null || z3) {
            this.mMaskCanvas = new Canvas();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            this.mMaskBitmap = bitmapCreateBitmap;
            this.mMaskCanvas.setBitmap(bitmapCreateBitmap);
            this.mMaskPaint.reset();
            paintMaskCanvas(this.mMaskCanvas, this.mMaskPaint, i4, i5);
            this.mDrawableCanvas = new Canvas();
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            this.mDrawableBitmap = bitmapCreateBitmap2;
            this.mDrawableCanvas.setBitmap(bitmapCreateBitmap2);
            Paint paint = new Paint(1);
            this.mDrawablePaint = paint;
            paint.setColor(this.mPaintColor);
            this.mInvalidated = true;
        }
    }

    private void init() {
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        Paint paint = new Paint(1);
        this.mMaskPaint = paint;
        paint.setColor(IGoodView.DEFAULT_TEXT_COLOR);
    }

    @Override // android.view.View
    public void invalidate() {
        this.mInvalidated = true;
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawable;
        int iSaveLayer = canvas.saveLayer(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, getWidth(), getHeight(), null, 31);
        try {
            try {
                if (this.mInvalidated && (drawable = getDrawable()) != null) {
                    this.mInvalidated = false;
                    Matrix imageMatrix = getImageMatrix();
                    if (imageMatrix == null) {
                        drawable.draw(this.mDrawableCanvas);
                    } else {
                        int saveCount = this.mDrawableCanvas.getSaveCount();
                        this.mDrawableCanvas.save();
                        this.mDrawableCanvas.concat(imageMatrix);
                        drawable.draw(this.mDrawableCanvas);
                        this.mDrawableCanvas.restoreToCount(saveCount);
                    }
                    this.mDrawablePaint.reset();
                    this.mDrawablePaint.setFilterBitmap(false);
                    this.mDrawablePaint.setXfermode(PORTER_DUFF_XFERMODE);
                    this.mDrawableCanvas.drawBitmap(this.mMaskBitmap, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mDrawablePaint);
                }
                if (!this.mInvalidated) {
                    this.mDrawablePaint.setXfermode(null);
                    canvas.drawBitmap(this.mDrawableBitmap, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.mDrawablePaint);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (i4 == 0) {
            i4 = 50;
        }
        if (i5 == 0) {
            i5 = 50;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        createMaskCanvas(i4, i5, i6, i7);
    }

    protected abstract void paintMaskCanvas(Canvas canvas, Paint paint, int i4, int i5);

    public void setTintColor(int i4) {
        this.mPaintColor = i4;
        setImageDrawable(new ColorDrawable(i4));
        Paint paint = this.mDrawablePaint;
        if (paint != null) {
            paint.setColor(i4);
            invalidate();
        }
    }

    public PorterImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaintColor = -7829368;
        this.mInvalidated = true;
        init();
    }

    public PorterImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mPaintColor = -7829368;
        this.mInvalidated = true;
        init();
    }
}
