package com.xuexiang.xui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class RadiusImageView extends AppCompatImageView {
    private static final Bitmap.Config BITMAP_CONFIG = Bitmap.Config.ARGB_8888;
    private static final int COLOR_DRAWABLE_DIMEN = 2;
    private static final int DEFAULT_BORDER_COLOR = -7829368;
    private Bitmap mBitmap;
    private Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBorderColor;
    private Paint mBorderPaint;
    private int mBorderWidth;
    private ColorFilter mColorFilter;
    private int mCornerRadius;
    private int mHeight;
    private boolean mIsCircle;
    private boolean mIsOval;
    private boolean mIsSelected;
    private boolean mIsTouchSelectModeEnabled;
    private Matrix mMatrix;
    private boolean mNeedResetShader;
    private RectF mRectF;
    private int mSelectedBorderColor;
    private int mSelectedBorderWidth;
    private ColorFilter mSelectedColorFilter;
    private int mSelectedMaskColor;
    private int mWidth;

    public RadiusImageView(Context context) {
        this(context, null, C2042R.attr.RadiusImageViewStyle);
    }

    private void drawBitmap(Canvas canvas, int i4) {
        float f4 = (i4 * 1.0f) / 2.0f;
        this.mBitmapPaint.setColorFilter(this.mIsSelected ? this.mSelectedColorFilter : this.mColorFilter);
        if (this.mIsCircle) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f4, this.mBitmapPaint);
            return;
        }
        RectF rectF = this.mRectF;
        rectF.left = f4;
        rectF.top = f4;
        rectF.right = getWidth() - f4;
        this.mRectF.bottom = getHeight() - f4;
        if (this.mIsOval) {
            canvas.drawOval(this.mRectF, this.mBitmapPaint);
            return;
        }
        RectF rectF2 = this.mRectF;
        int i5 = this.mCornerRadius;
        canvas.drawRoundRect(rectF2, i5, i5, this.mBitmapPaint);
    }

    private void drawBorder(Canvas canvas, int i4) {
        if (i4 <= 0) {
            return;
        }
        float f4 = i4;
        float f5 = (1.0f * f4) / 2.0f;
        this.mBorderPaint.setColor(this.mIsSelected ? this.mSelectedBorderColor : this.mBorderColor);
        this.mBorderPaint.setStrokeWidth(f4);
        if (this.mIsCircle) {
            float width = getWidth() / 2;
            canvas.drawCircle(width, width, width - f5, this.mBorderPaint);
            return;
        }
        RectF rectF = this.mRectF;
        rectF.left = f5;
        rectF.top = f5;
        rectF.right = getWidth() - f5;
        this.mRectF.bottom = getHeight() - f5;
        if (this.mIsOval) {
            canvas.drawOval(this.mRectF, this.mBorderPaint);
            return;
        }
        RectF rectF2 = this.mRectF;
        int i5 = this.mCornerRadius;
        canvas.drawRoundRect(rectF2, i5, i5, this.mBorderPaint);
    }

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                Bitmap bitmapCreateBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, BITMAP_CONFIG) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Exception e4) {
                e4.printStackTrace();
                return null;
            }
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width == IGoodView.DEFAULT_TO_ALPHA || height == IGoodView.DEFAULT_TO_ALPHA) {
            return null;
        }
        float minimumWidth = getMinimumWidth() / width;
        float minimumHeight = getMinimumHeight() / height;
        if (minimumWidth <= 1.0f && minimumHeight <= 1.0f) {
            return bitmap;
        }
        float fMax = Math.max(minimumWidth, minimumHeight);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, false);
    }

    private void initAttrs(Context context, AttributeSet attributeSet, int i4) {
        Paint paint = new Paint();
        this.mBorderPaint = paint;
        paint.setAntiAlias(true);
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mMatrix = new Matrix();
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.RadiusImageView, i4, 0);
        this.mBorderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RadiusImageView_riv_border_width, 0);
        this.mBorderColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RadiusImageView_riv_border_color, DEFAULT_BORDER_COLOR);
        this.mSelectedBorderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RadiusImageView_riv_selected_border_width, this.mBorderWidth);
        this.mSelectedBorderColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RadiusImageView_riv_selected_border_color, this.mBorderColor);
        int color = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.RadiusImageView_riv_selected_mask_color, 0);
        this.mSelectedMaskColor = color;
        if (color != 0) {
            this.mSelectedColorFilter = new PorterDuffColorFilter(this.mSelectedMaskColor, PorterDuff.Mode.DARKEN);
        }
        this.mIsTouchSelectModeEnabled = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RadiusImageView_riv_is_touch_select_mode_enabled, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RadiusImageView_riv_is_circle, false);
        this.mIsCircle = z3;
        if (!z3) {
            this.mIsOval = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.RadiusImageView_riv_is_oval, false);
        }
        if (!this.mIsOval) {
            this.mCornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.RadiusImageView_riv_corner_radius, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void updateBitmapShader() {
        Bitmap bitmap;
        this.mMatrix.reset();
        this.mNeedResetShader = false;
        if (this.mBitmapShader == null || (bitmap = this.mBitmap) == null) {
            return;
        }
        float width = bitmap.getWidth();
        float height = this.mBitmap.getHeight();
        float fMax = Math.max(this.mWidth / width, this.mHeight / height);
        this.mMatrix.setScale(fMax, fMax);
        this.mMatrix.postTranslate((-((width * fMax) - this.mWidth)) / 2.0f, (-((fMax * height) - this.mHeight)) / 2.0f);
        this.mBitmapShader.setLocalMatrix(this.mMatrix);
        this.mBitmapPaint.setShader(this.mBitmapShader);
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    public int getCornerRadius() {
        return this.mCornerRadius;
    }

    public int getSelectedBorderColor() {
        return this.mSelectedBorderColor;
    }

    public int getSelectedBorderWidth() {
        return this.mSelectedBorderWidth;
    }

    public int getSelectedMaskColor() {
        return this.mSelectedMaskColor;
    }

    public boolean isCircle() {
        return this.mIsCircle;
    }

    public boolean isOval() {
        return !this.mIsCircle && this.mIsOval;
    }

    @Override // android.view.View
    public boolean isSelected() {
        return this.mIsSelected;
    }

    public boolean isTouchSelectModeEnabled() {
        return this.mIsTouchSelectModeEnabled;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        int i4 = this.mIsSelected ? this.mSelectedBorderWidth : this.mBorderWidth;
        if (this.mBitmap == null || this.mBitmapShader == null) {
            drawBorder(canvas, i4);
            return;
        }
        if (this.mWidth != width || this.mHeight != height || this.mNeedResetShader) {
            this.mWidth = width;
            this.mHeight = height;
            updateBitmapShader();
        }
        drawBitmap(canvas, i4);
        drawBorder(canvas, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.mIsCircle) {
            int iMin = Math.min(measuredWidth, measuredHeight);
            setMeasuredDimension(iMin, iMin);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            return;
        }
        boolean z3 = mode == Integer.MIN_VALUE || mode == 0;
        boolean z4 = mode2 == Integer.MIN_VALUE || mode2 == 0;
        float width = bitmap.getWidth();
        float height = this.mBitmap.getHeight();
        float f4 = measuredWidth / width;
        float f5 = measuredHeight / height;
        if (!z3 || !z4) {
            if (z3) {
                setMeasuredDimension((int) (width * f5), measuredHeight);
                return;
            } else {
                if (z4) {
                    setMeasuredDimension(measuredWidth, (int) (height * f4));
                    return;
                }
                return;
            }
        }
        if (f4 >= 1.0f && f5 >= 1.0f) {
            setMeasuredDimension((int) width, (int) height);
            return;
        }
        if (f4 >= 1.0f) {
            setMeasuredDimension((int) (height * f5), measuredHeight);
            return;
        }
        if (f5 >= 1.0f) {
            setMeasuredDimension(measuredWidth, (int) (height * f4));
        } else if (f4 < f5) {
            setMeasuredDimension(measuredWidth, (int) (height * f4));
        } else {
            setMeasuredDimension((int) (width * f5), measuredHeight);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        }
        if (!this.mIsTouchSelectModeEnabled) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setSelected(true);
        } else if (action == 1 || action == 3 || action == 4 || action == 8) {
            setSelected(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z3) {
        if (z3) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(int i4) {
        if (this.mBorderColor != i4) {
            this.mBorderColor = i4;
            invalidate();
        }
    }

    public void setBorderWidth(int i4) {
        if (this.mBorderWidth != i4) {
            this.mBorderWidth = i4;
            invalidate();
        }
    }

    public void setCircle(boolean z3) {
        if (this.mIsCircle != z3) {
            this.mIsCircle = z3;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mColorFilter == colorFilter) {
            return;
        }
        this.mColorFilter = colorFilter;
        if (this.mIsSelected) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i4) {
        if (this.mCornerRadius != i4) {
            this.mCornerRadius = i4;
            if (this.mIsCircle || this.mIsOval) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setupBitmap();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setupBitmap();
    }

    public void setOval(boolean z3) {
        boolean z4 = false;
        if (z3 && this.mIsCircle) {
            this.mIsCircle = false;
            z4 = true;
        }
        if (this.mIsOval != z3 || z4) {
            this.mIsOval = z3;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != ImageView.ScaleType.CENTER_CROP) {
            throw new IllegalArgumentException(String.format("不支持ScaleType %s", scaleType));
        }
        super.setScaleType(scaleType);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z3) {
        if (this.mIsSelected != z3) {
            this.mIsSelected = z3;
            invalidate();
        }
    }

    public void setSelectedBorderColor(int i4) {
        if (this.mSelectedBorderColor != i4) {
            this.mSelectedBorderColor = i4;
            if (this.mIsSelected) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i4) {
        if (this.mSelectedBorderWidth != i4) {
            this.mSelectedBorderWidth = i4;
            if (this.mIsSelected) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.mSelectedColorFilter == colorFilter) {
            return;
        }
        this.mSelectedColorFilter = colorFilter;
        if (this.mIsSelected) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(int i4) {
        if (this.mSelectedMaskColor != i4) {
            this.mSelectedMaskColor = i4;
            if (i4 != 0) {
                this.mSelectedColorFilter = new PorterDuffColorFilter(this.mSelectedMaskColor, PorterDuff.Mode.DARKEN);
            } else {
                this.mSelectedColorFilter = null;
            }
            if (this.mIsSelected) {
                invalidate();
            }
        }
        this.mSelectedMaskColor = i4;
    }

    public void setTouchSelectModeEnabled(boolean z3) {
        this.mIsTouchSelectModeEnabled = z3;
    }

    public void setupBitmap() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.mBitmap) {
            return;
        }
        this.mBitmap = bitmap;
        if (bitmap == null) {
            this.mBitmapShader = null;
            invalidate();
            return;
        }
        this.mNeedResetShader = true;
        Bitmap bitmap2 = this.mBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mBitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
        if (this.mBitmapPaint == null) {
            Paint paint = new Paint();
            this.mBitmapPaint = paint;
            paint.setAntiAlias(true);
        }
        this.mBitmapPaint.setShader(this.mBitmapShader);
        requestLayout();
        invalidate();
    }

    public RadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.RadiusImageViewStyle);
    }

    public RadiusImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIsSelected = false;
        this.mIsOval = false;
        this.mIsCircle = false;
        this.mIsTouchSelectModeEnabled = true;
        this.mNeedResetShader = false;
        this.mRectF = new RectF();
        initAttrs(context, attributeSet, i4);
    }
}
