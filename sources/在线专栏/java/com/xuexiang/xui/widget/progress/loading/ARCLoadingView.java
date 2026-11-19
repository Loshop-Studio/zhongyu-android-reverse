package com.xuexiang.xui.widget.progress.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.UIConfig;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.utils.Utils;

/* loaded from: classes.dex */
public class ARCLoadingView extends View {
    private static final int DEFAULT_ARC_DEGREE = 315;
    private static final int DEFAULT_ARC_WIDTH = 6;
    private static final int DEFAULT_SPEED_OF_DEGREE = 5;
    private int mArcColor;
    private float mArcDegree;
    private Paint mArcPaint;
    private RectF mArcRectF;
    private int mArcWidth;
    private int[] mGradientColors;
    private Bitmap mIconBitmap;
    private Paint mIconPaint;
    private float mIconScale;
    private boolean mIsAutoMode;
    private boolean mIsDraw;
    private int mSpeedOfDegree;
    private int mStartDegree;

    public ARCLoadingView(Context context) {
        super(context);
        this.mIsAutoMode = true;
        this.mStartDegree = 10;
        initAttrs(context, null);
    }

    private void drawArc(Canvas canvas) {
        Bitmap bitmap = this.mIconBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, getIconBitmapRectF(bitmap), this.mIconPaint);
        }
        this.mArcPaint.setShader(getSweepGradient(canvas));
        canvas.drawArc(this.mArcRectF, this.mStartDegree, this.mArcDegree, false, this.mArcPaint);
        int i4 = this.mStartDegree + this.mSpeedOfDegree;
        this.mStartDegree = i4;
        if (i4 > 360) {
            this.mStartDegree = i4 - 360;
        }
    }

    private SweepGradient getSweepGradient(Canvas canvas) {
        SweepGradient sweepGradient = new SweepGradient(canvas.getWidth() >> 1, canvas.getHeight() >> 1, this.mGradientColors, (float[]) null);
        Matrix matrix = new Matrix();
        matrix.setRotate(this.mStartDegree, canvas.getWidth() >> 1, canvas.getHeight() >> 1);
        sweepGradient.setLocalMatrix(matrix);
        return sweepGradient;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.LoadingView);
        this.mArcColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.LoadingView_lv_color, ThemeUtils.getMainThemeColor(context));
        this.mArcDegree = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.LoadingView_lv_arc_degree, DEFAULT_ARC_DEGREE);
        this.mGradientColors = new int[]{0, this.mArcColor};
        this.mArcWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.LoadingView_lv_width, DensityUtils.dp2px(getContext(), 6.0f));
        this.mSpeedOfDegree = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.LoadingView_lv_speed, 5);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.LoadingView_lv_auto, true);
        this.mIsAutoMode = z3;
        this.mIsDraw = z3;
        if (typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.LoadingView_lv_has_icon, true)) {
            Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.LoadingView_lv_icon);
            if (drawableAttrRes != null) {
                this.mIconBitmap = Utils.getBitmapFromDrawable(drawableAttrRes);
            } else {
                Drawable appIcon = UIConfig.getInstance().getAppIcon();
                if (appIcon != null) {
                    this.mIconBitmap = Utils.getBitmapFromDrawable(appIcon);
                }
            }
            this.mIconScale = typedArrayObtainStyledAttributes.getFloat(C2042R.styleable.LoadingView_lv_icon_scale, 0.5f);
        }
        typedArrayObtainStyledAttributes.recycle();
        initPaint();
    }

    private void initPaint() {
        Paint paint = new Paint();
        this.mArcPaint = paint;
        paint.setColor(this.mArcColor);
        this.mArcPaint.setAntiAlias(true);
        this.mArcPaint.setStyle(Paint.Style.STROKE);
        this.mArcPaint.setStrokeWidth(this.mArcWidth);
        Paint paint2 = new Paint();
        this.mIconPaint = paint2;
        paint2.setColor(this.mArcColor);
        this.mIconPaint.setAntiAlias(true);
        this.mIconPaint.setFilterBitmap(true);
        this.mIconPaint.setStyle(Paint.Style.STROKE);
        this.mIconPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    private void pause() {
        this.mIsDraw = false;
        invalidate();
    }

    public RectF getIconBitmapRectF(Bitmap bitmap) {
        float height;
        float height2;
        float width = bitmap.getWidth();
        float height3 = bitmap.getHeight();
        if (width >= height3) {
            height2 = (getWidth() / width) * height3;
            height = getWidth();
        } else {
            height = (getHeight() / height3) * width;
            height2 = getHeight();
        }
        float width2 = (getWidth() - (height * this.mIconScale)) / 2.0f;
        float height4 = (getHeight() - (height2 * this.mIconScale)) / 2.0f;
        return new RectF(width2, height4, getWidth() - width2, getHeight() - height4);
    }

    public float getIconScale() {
        return this.mIconScale;
    }

    public int getLoadingColor() {
        return this.mArcColor;
    }

    public boolean isStart() {
        return this.mIsDraw;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mIsDraw) {
            drawArc(canvas);
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        int i8 = this.mArcWidth;
        this.mArcRectF = new RectF(i8 * 2, i8 * 2, i4 - (i8 * 2), i5 - (i8 * 2));
    }

    public void recycle() {
        pause();
        Bitmap bitmap = this.mIconBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mIconBitmap = null;
        }
        this.mArcRectF = null;
        this.mArcPaint = null;
        this.mIconPaint = null;
        this.mGradientColors = null;
    }

    public ARCLoadingView setIconScale(float f4) {
        this.mIconScale = f4;
        return this;
    }

    public ARCLoadingView setLoadingColor(int i4) {
        this.mArcColor = i4;
        return this;
    }

    public ARCLoadingView setLoadingIcon(Drawable drawable) {
        if (drawable != null) {
            this.mIconBitmap = Utils.getBitmapFromDrawable(drawable);
        }
        return this;
    }

    public ARCLoadingView setSpeedOfDegree(int i4) {
        this.mSpeedOfDegree = i4;
        return this;
    }

    public void start() {
        if (this.mIsAutoMode) {
            return;
        }
        this.mIsDraw = true;
        invalidate();
    }

    public void stop() {
        if (this.mIsAutoMode) {
            return;
        }
        pause();
    }

    public ARCLoadingView setLoadingIcon(Bitmap bitmap) {
        this.mIconBitmap = bitmap;
        return this;
    }

    public ARCLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsAutoMode = true;
        this.mStartDegree = 10;
        initAttrs(context, attributeSet);
    }

    public ARCLoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIsAutoMode = true;
        this.mStartDegree = 10;
        initAttrs(context, attributeSet);
    }
}
