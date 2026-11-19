package com.xuexiang.xui.widget.textview.badge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.xuexiang.xui.widget.textview.badge.Badge;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class BadgeView extends View implements Badge {
    public static final int DEFAULT_BADGE_PADDING = 5;
    public static final int DEFAULT_COLOR_BACKGROUND = -1552832;
    public static final int DEFAULT_COLOR_BADGE_TEXT = -1;
    public static final int DEFAULT_GRAVITY_OFFSET = 1;
    public static final int DEFAULT_TEXT_SIZE = 11;
    protected ViewGroup mActivityRoot;
    protected BadgeAnimator mAnimator;
    protected float mBackgroundBorderWidth;
    protected Paint mBadgeBackgroundBorderPaint;
    protected Paint mBadgeBackgroundPaint;
    protected RectF mBadgeBackgroundRect;
    protected PointF mBadgeCenter;
    protected int mBadgeGravity;
    protected int mBadgeNumber;
    protected float mBadgePadding;
    protected String mBadgeText;
    protected Paint.FontMetrics mBadgeTextFontMetrics;
    protected TextPaint mBadgeTextPaint;
    protected RectF mBadgeTextRect;
    protected float mBadgeTextSize;
    protected Bitmap mBitmapClip;
    protected int mColorBackground;
    protected int mColorBackgroundBorder;
    protected int mColorBadgeText;
    protected PointF mControlPoint;
    protected float mDefaultRadius;
    protected PointF mDragCenter;
    protected boolean mDragOutOfRange;
    protected Path mDragPath;
    protected int mDragQuadrant;
    protected Badge.OnDragStateChangedListener mDragStateChangedListener;
    protected boolean mDraggable;
    protected boolean mDragging;
    protected Drawable mDrawableBackground;
    protected boolean mDrawableBackgroundClip;
    protected boolean mExact;
    protected float mFinalDragDistance;
    protected float mGravityOffsetX;
    protected float mGravityOffsetY;
    protected int mHeight;
    protected List<PointF> mInnerTangentPoints;
    protected PointF mRowBadgeCenter;
    protected boolean mShowShadow;
    protected View mTargetView;
    protected int mWidth;

    private static class BadgeContainer extends ViewGroup {
        public BadgeContainer(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
            if (getParent() instanceof RelativeLayout) {
                return;
            }
            super.dispatchRestoreInstanceState(sparseArray);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i4, int i5) {
            View view = null;
            View view2 = null;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt instanceof BadgeView) {
                    view2 = childAt;
                } else {
                    view = childAt;
                }
            }
            if (view == null) {
                super.onMeasure(i4, i5);
                return;
            }
            view.measure(i4, i5);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    private void createClipLayer() {
        if (this.mBadgeText != null && this.mDrawableBackgroundClip) {
            Bitmap bitmap = this.mBitmapClip;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.mBitmapClip.recycle();
            }
            float badgeCircleRadius = getBadgeCircleRadius();
            if (!this.mBadgeText.isEmpty() && this.mBadgeText.length() != 1) {
                this.mBitmapClip = Bitmap.createBitmap((int) (this.mBadgeTextRect.width() + (this.mBadgePadding * 2.0f)), (int) (this.mBadgeTextRect.height() + this.mBadgePadding), Bitmap.Config.ARGB_4444);
                new Canvas(this.mBitmapClip).drawRoundRect(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, r3.getWidth(), r3.getHeight(), r3.getHeight() / 2.0f, r3.getHeight() / 2.0f, this.mBadgeBackgroundPaint);
            } else {
                int i4 = ((int) badgeCircleRadius) * 2;
                this.mBitmapClip = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_4444);
                new Canvas(this.mBitmapClip).drawCircle(r0.getWidth() / 2.0f, r0.getHeight() / 2.0f, r0.getWidth() / 2.0f, this.mBadgeBackgroundPaint);
            }
        }
    }

    private void drawBadge(Canvas canvas, PointF pointF, float f4) {
        if (pointF.x == -1000.0f && pointF.y == -1000.0f) {
            return;
        }
        if (this.mBadgeText.isEmpty() || this.mBadgeText.length() == 1) {
            RectF rectF = this.mBadgeBackgroundRect;
            float f5 = pointF.x;
            float f6 = (int) f4;
            rectF.left = f5 - f6;
            float f7 = pointF.y;
            rectF.top = f7 - f6;
            rectF.right = f5 + f6;
            rectF.bottom = f6 + f7;
            if (this.mDrawableBackground != null) {
                drawBadgeBackground(canvas);
            } else {
                canvas.drawCircle(f5, f7, f4, this.mBadgeBackgroundPaint);
                if (this.mColorBackgroundBorder != 0 && this.mBackgroundBorderWidth > IGoodView.DEFAULT_TO_ALPHA) {
                    canvas.drawCircle(pointF.x, pointF.y, f4, this.mBadgeBackgroundBorderPaint);
                }
            }
        } else {
            this.mBadgeBackgroundRect.left = pointF.x - ((this.mBadgeTextRect.width() / 2.0f) + this.mBadgePadding);
            this.mBadgeBackgroundRect.top = pointF.y - ((this.mBadgeTextRect.height() / 2.0f) + (this.mBadgePadding * 0.5f));
            this.mBadgeBackgroundRect.right = pointF.x + (this.mBadgeTextRect.width() / 2.0f) + this.mBadgePadding;
            this.mBadgeBackgroundRect.bottom = pointF.y + (this.mBadgeTextRect.height() / 2.0f) + (this.mBadgePadding * 0.5f);
            float fHeight = this.mBadgeBackgroundRect.height() / 2.0f;
            if (this.mDrawableBackground != null) {
                drawBadgeBackground(canvas);
            } else {
                canvas.drawRoundRect(this.mBadgeBackgroundRect, fHeight, fHeight, this.mBadgeBackgroundPaint);
                if (this.mColorBackgroundBorder != 0 && this.mBackgroundBorderWidth > IGoodView.DEFAULT_TO_ALPHA) {
                    canvas.drawRoundRect(this.mBadgeBackgroundRect, fHeight, fHeight, this.mBadgeBackgroundBorderPaint);
                }
            }
        }
        if (this.mBadgeText.isEmpty()) {
            return;
        }
        String str = this.mBadgeText;
        float f8 = pointF.x;
        RectF rectF2 = this.mBadgeBackgroundRect;
        float f9 = rectF2.bottom + rectF2.top;
        Paint.FontMetrics fontMetrics = this.mBadgeTextFontMetrics;
        canvas.drawText(str, f8, ((f9 - fontMetrics.bottom) - fontMetrics.top) / 2.0f, this.mBadgeTextPaint);
    }

    private void drawBadgeBackground(Canvas canvas) {
        this.mBadgeBackgroundPaint.setShadowLayer(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, 0);
        RectF rectF = this.mBadgeBackgroundRect;
        int i4 = (int) rectF.left;
        int i5 = (int) rectF.top;
        int width = (int) rectF.right;
        int height = (int) rectF.bottom;
        if (this.mDrawableBackgroundClip) {
            width = i4 + this.mBitmapClip.getWidth();
            height = this.mBitmapClip.getHeight() + i5;
            canvas.saveLayer(i4, i5, width, height, null, 31);
        }
        this.mDrawableBackground.setBounds(i4, i5, width, height);
        this.mDrawableBackground.draw(canvas);
        if (!this.mDrawableBackgroundClip) {
            canvas.drawRect(this.mBadgeBackgroundRect, this.mBadgeBackgroundBorderPaint);
            return;
        }
        this.mBadgeBackgroundPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(this.mBitmapClip, i4, i5, this.mBadgeBackgroundPaint);
        canvas.restore();
        this.mBadgeBackgroundPaint.setXfermode(null);
        if (this.mBadgeText.isEmpty() || this.mBadgeText.length() == 1) {
            canvas.drawCircle(this.mBadgeBackgroundRect.centerX(), this.mBadgeBackgroundRect.centerY(), this.mBadgeBackgroundRect.width() / 2.0f, this.mBadgeBackgroundBorderPaint);
        } else {
            RectF rectF2 = this.mBadgeBackgroundRect;
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.mBadgeBackgroundRect.height() / 2.0f, this.mBadgeBackgroundBorderPaint);
        }
    }

    private void drawDragging(Canvas canvas, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        PointF pointF = this.mDragCenter;
        float f9 = pointF.y;
        PointF pointF2 = this.mRowBadgeCenter;
        float f10 = f9 - pointF2.y;
        float f11 = pointF.x - pointF2.x;
        this.mInnerTangentPoints.clear();
        if (f11 != IGoodView.DEFAULT_TO_ALPHA) {
            double d4 = (-1.0d) / (f10 / f11);
            MathUtils.getInnerTangentPoints(this.mDragCenter, f5, Double.valueOf(d4), this.mInnerTangentPoints);
            MathUtils.getInnerTangentPoints(this.mRowBadgeCenter, f4, Double.valueOf(d4), this.mInnerTangentPoints);
        } else {
            MathUtils.getInnerTangentPoints(this.mDragCenter, f5, Double.valueOf(0.0d), this.mInnerTangentPoints);
            MathUtils.getInnerTangentPoints(this.mRowBadgeCenter, f4, Double.valueOf(0.0d), this.mInnerTangentPoints);
        }
        this.mDragPath.reset();
        Path path = this.mDragPath;
        PointF pointF3 = this.mRowBadgeCenter;
        float f12 = pointF3.x;
        float f13 = pointF3.y;
        int i4 = this.mDragQuadrant;
        path.addCircle(f12, f13, f4, (i4 == 1 || i4 == 2) ? Path.Direction.CCW : Path.Direction.CW);
        PointF pointF4 = this.mControlPoint;
        PointF pointF5 = this.mRowBadgeCenter;
        float f14 = pointF5.x;
        PointF pointF6 = this.mDragCenter;
        pointF4.x = (f14 + pointF6.x) / 2.0f;
        pointF4.y = (pointF5.y + pointF6.y) / 2.0f;
        this.mDragPath.moveTo(this.mInnerTangentPoints.get(2).x, this.mInnerTangentPoints.get(2).y);
        Path path2 = this.mDragPath;
        PointF pointF7 = this.mControlPoint;
        path2.quadTo(pointF7.x, pointF7.y, this.mInnerTangentPoints.get(0).x, this.mInnerTangentPoints.get(0).y);
        this.mDragPath.lineTo(this.mInnerTangentPoints.get(1).x, this.mInnerTangentPoints.get(1).y);
        Path path3 = this.mDragPath;
        PointF pointF8 = this.mControlPoint;
        path3.quadTo(pointF8.x, pointF8.y, this.mInnerTangentPoints.get(3).x, this.mInnerTangentPoints.get(3).y);
        this.mDragPath.lineTo(this.mInnerTangentPoints.get(2).x, this.mInnerTangentPoints.get(2).y);
        this.mDragPath.close();
        canvas.drawPath(this.mDragPath, this.mBadgeBackgroundPaint);
        if (this.mColorBackgroundBorder == 0 || this.mBackgroundBorderWidth <= IGoodView.DEFAULT_TO_ALPHA) {
            return;
        }
        this.mDragPath.reset();
        this.mDragPath.moveTo(this.mInnerTangentPoints.get(2).x, this.mInnerTangentPoints.get(2).y);
        Path path4 = this.mDragPath;
        PointF pointF9 = this.mControlPoint;
        path4.quadTo(pointF9.x, pointF9.y, this.mInnerTangentPoints.get(0).x, this.mInnerTangentPoints.get(0).y);
        this.mDragPath.moveTo(this.mInnerTangentPoints.get(1).x, this.mInnerTangentPoints.get(1).y);
        Path path5 = this.mDragPath;
        PointF pointF10 = this.mControlPoint;
        path5.quadTo(pointF10.x, pointF10.y, this.mInnerTangentPoints.get(3).x, this.mInnerTangentPoints.get(3).y);
        int i5 = this.mDragQuadrant;
        if (i5 == 1 || i5 == 2) {
            float f15 = this.mInnerTangentPoints.get(2).x;
            PointF pointF11 = this.mRowBadgeCenter;
            f6 = f15 - pointF11.x;
            f7 = pointF11.y;
            f8 = this.mInnerTangentPoints.get(2).y;
        } else {
            float f16 = this.mInnerTangentPoints.get(3).x;
            PointF pointF12 = this.mRowBadgeCenter;
            f6 = f16 - pointF12.x;
            f7 = pointF12.y;
            f8 = this.mInnerTangentPoints.get(3).y;
        }
        double dAtan = Math.atan((f7 - f8) / f6);
        int i6 = this.mDragQuadrant;
        float fRadianToAngle = 360.0f - ((float) MathUtils.radianToAngle(MathUtils.getTanRadian(dAtan, i6 + (-1) == 0 ? 4 : i6 - 1)));
        Path path6 = this.mDragPath;
        PointF pointF13 = this.mRowBadgeCenter;
        float f17 = pointF13.x;
        float f18 = pointF13.y;
        path6.addArc(f17 - f4, f18 - f4, f17 + f4, f18 + f4, fRadianToAngle, 180.0f);
        canvas.drawPath(this.mDragPath, this.mBadgeBackgroundBorderPaint);
    }

    private void findActivityRoot(View view) {
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            findActivityRoot((View) view.getParent());
        } else if (view instanceof ViewGroup) {
            this.mActivityRoot = (ViewGroup) view;
        }
    }

    private void findBadgeCenter() {
        float fMax = Math.max(this.mBadgeTextRect.height(), this.mBadgeTextRect.width());
        switch (this.mBadgeGravity) {
            case 17:
                PointF pointF = this.mBadgeCenter;
                pointF.x = this.mWidth / 2.0f;
                pointF.y = this.mHeight / 2.0f;
                break;
            case 49:
                PointF pointF2 = this.mBadgeCenter;
                pointF2.x = this.mWidth / 2.0f;
                pointF2.y = this.mGravityOffsetY + this.mBadgePadding + (this.mBadgeTextRect.height() / 2.0f);
                break;
            case 81:
                PointF pointF3 = this.mBadgeCenter;
                pointF3.x = this.mWidth / 2.0f;
                pointF3.y = this.mHeight - ((this.mGravityOffsetY + this.mBadgePadding) + (this.mBadgeTextRect.height() / 2.0f));
                break;
            case 8388627:
                PointF pointF4 = this.mBadgeCenter;
                pointF4.x = this.mGravityOffsetX + this.mBadgePadding + (fMax / 2.0f);
                pointF4.y = this.mHeight / 2.0f;
                break;
            case 8388629:
                PointF pointF5 = this.mBadgeCenter;
                pointF5.x = this.mWidth - ((this.mGravityOffsetX + this.mBadgePadding) + (fMax / 2.0f));
                pointF5.y = this.mHeight / 2.0f;
                break;
            case BadgeDrawable.TOP_START /* 8388659 */:
                PointF pointF6 = this.mBadgeCenter;
                float f4 = this.mGravityOffsetX;
                float f5 = this.mBadgePadding;
                pointF6.x = f4 + f5 + (fMax / 2.0f);
                pointF6.y = this.mGravityOffsetY + f5 + (this.mBadgeTextRect.height() / 2.0f);
                break;
            case BadgeDrawable.TOP_END /* 8388661 */:
                PointF pointF7 = this.mBadgeCenter;
                float f6 = this.mWidth;
                float f7 = this.mGravityOffsetX;
                float f8 = this.mBadgePadding;
                pointF7.x = f6 - ((f7 + f8) + (fMax / 2.0f));
                pointF7.y = this.mGravityOffsetY + f8 + (this.mBadgeTextRect.height() / 2.0f);
                break;
            case BadgeDrawable.BOTTOM_START /* 8388691 */:
                PointF pointF8 = this.mBadgeCenter;
                float f9 = this.mGravityOffsetX;
                float f10 = this.mBadgePadding;
                pointF8.x = f9 + f10 + (fMax / 2.0f);
                pointF8.y = this.mHeight - ((this.mGravityOffsetY + f10) + (this.mBadgeTextRect.height() / 2.0f));
                break;
            case BadgeDrawable.BOTTOM_END /* 8388693 */:
                PointF pointF9 = this.mBadgeCenter;
                float f11 = this.mWidth;
                float f12 = this.mGravityOffsetX;
                float f13 = this.mBadgePadding;
                pointF9.x = f11 - ((f12 + f13) + (fMax / 2.0f));
                pointF9.y = this.mHeight - ((this.mGravityOffsetY + f13) + (this.mBadgeTextRect.height() / 2.0f));
                break;
        }
        initRowBadgeCenter();
    }

    private void findViewRoot(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        this.mActivityRoot = viewGroup;
        if (viewGroup == null) {
            findActivityRoot(view);
        }
    }

    private float getBadgeCircleRadius() {
        float fWidth;
        float f4;
        if (this.mBadgeText.isEmpty()) {
            return this.mBadgePadding;
        }
        if (this.mBadgeText.length() != 1) {
            return this.mBadgeBackgroundRect.height() / 2.0f;
        }
        if (this.mBadgeTextRect.height() > this.mBadgeTextRect.width()) {
            fWidth = this.mBadgeTextRect.height() / 2.0f;
            f4 = this.mBadgePadding;
        } else {
            fWidth = this.mBadgeTextRect.width() / 2.0f;
            f4 = this.mBadgePadding;
        }
        return fWidth + (f4 * 0.5f);
    }

    private void init() {
        setLayerType(1, null);
        this.mBadgeTextRect = new RectF();
        this.mBadgeBackgroundRect = new RectF();
        this.mDragPath = new Path();
        this.mBadgeCenter = new PointF();
        this.mDragCenter = new PointF();
        this.mRowBadgeCenter = new PointF();
        this.mControlPoint = new PointF();
        this.mInnerTangentPoints = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.mBadgeTextPaint = textPaint;
        textPaint.setAntiAlias(true);
        this.mBadgeTextPaint.setSubpixelText(true);
        this.mBadgeTextPaint.setFakeBoldText(true);
        this.mBadgeTextPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint = new Paint();
        this.mBadgeBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.mBadgeBackgroundPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.mBadgeBackgroundBorderPaint = paint2;
        paint2.setAntiAlias(true);
        this.mBadgeBackgroundBorderPaint.setStyle(Paint.Style.STROKE);
        this.mColorBackground = DEFAULT_COLOR_BACKGROUND;
        this.mColorBadgeText = -1;
        this.mBadgeTextSize = DensityUtils.sp2px(getContext(), 11.0f);
        this.mBadgePadding = DensityUtils.dp2px(getContext(), 5.0f);
        this.mBadgeNumber = 0;
        this.mBadgeGravity = BadgeDrawable.TOP_END;
        this.mGravityOffsetX = DensityUtils.dp2px(getContext(), 1.0f);
        this.mGravityOffsetY = DensityUtils.dp2px(getContext(), 1.0f);
        this.mFinalDragDistance = DensityUtils.dp2px(getContext(), 90.0f);
        this.mShowShadow = true;
        this.mDrawableBackgroundClip = false;
        setTranslationZ(1000.0f);
    }

    private void initPaints() {
        showShadowImpl(this.mShowShadow);
        this.mBadgeBackgroundPaint.setColor(this.mColorBackground);
        this.mBadgeBackgroundBorderPaint.setColor(this.mColorBackgroundBorder);
        this.mBadgeBackgroundBorderPaint.setStrokeWidth(this.mBackgroundBorderWidth);
        this.mBadgeTextPaint.setColor(this.mColorBadgeText);
        this.mBadgeTextPaint.setTextAlign(Paint.Align.CENTER);
    }

    private void initRowBadgeCenter() {
        getLocationOnScreen(new int[2]);
        PointF pointF = this.mRowBadgeCenter;
        PointF pointF2 = this.mBadgeCenter;
        pointF.x = pointF2.x + r0[0];
        pointF.y = pointF2.y + r0[1];
    }

    private void measureText() {
        RectF rectF = this.mBadgeTextRect;
        rectF.left = IGoodView.DEFAULT_TO_ALPHA;
        rectF.top = IGoodView.DEFAULT_TO_ALPHA;
        if (TextUtils.isEmpty(this.mBadgeText)) {
            RectF rectF2 = this.mBadgeTextRect;
            rectF2.right = IGoodView.DEFAULT_TO_ALPHA;
            rectF2.bottom = IGoodView.DEFAULT_TO_ALPHA;
        } else {
            this.mBadgeTextPaint.setTextSize(this.mBadgeTextSize);
            this.mBadgeTextRect.right = this.mBadgeTextPaint.measureText(this.mBadgeText);
            Paint.FontMetrics fontMetrics = this.mBadgeTextPaint.getFontMetrics();
            this.mBadgeTextFontMetrics = fontMetrics;
            this.mBadgeTextRect.bottom = fontMetrics.descent - fontMetrics.ascent;
        }
        createClipLayer();
    }

    private void onPointerUp() {
        if (this.mDragOutOfRange) {
            animateHide(this.mDragCenter);
            updateListener(5);
        } else {
            reset();
            updateListener(4);
        }
    }

    private void showShadowImpl(boolean z3) {
        int iDp2px = DensityUtils.dp2px(getContext(), 1.0f);
        int iDp2px2 = DensityUtils.dp2px(getContext(), 1.5f);
        int i4 = this.mDragQuadrant;
        if (i4 == 1) {
            iDp2px = DensityUtils.dp2px(getContext(), 1.0f);
            iDp2px2 = DensityUtils.dp2px(getContext(), -1.5f);
        } else if (i4 == 2) {
            iDp2px = DensityUtils.dp2px(getContext(), -1.0f);
            iDp2px2 = DensityUtils.dp2px(getContext(), -1.5f);
        } else if (i4 == 3) {
            iDp2px = DensityUtils.dp2px(getContext(), -1.0f);
            iDp2px2 = DensityUtils.dp2px(getContext(), 1.5f);
        } else if (i4 == 4) {
            iDp2px = DensityUtils.dp2px(getContext(), 1.0f);
            iDp2px2 = DensityUtils.dp2px(getContext(), 1.5f);
        }
        this.mBadgeBackgroundPaint.setShadowLayer(z3 ? DensityUtils.dp2px(getContext(), 2.0f) : IGoodView.DEFAULT_TO_ALPHA, iDp2px, iDp2px2, 855638016);
    }

    private void updateListener(int i4) {
        Badge.OnDragStateChangedListener onDragStateChangedListener = this.mDragStateChangedListener;
        if (onDragStateChangedListener != null) {
            onDragStateChangedListener.onDragStateChanged(i4, this, this.mTargetView);
        }
    }

    protected void animateHide(PointF pointF) {
        if (this.mBadgeText == null) {
            return;
        }
        BadgeAnimator badgeAnimator = this.mAnimator;
        if (badgeAnimator == null || !badgeAnimator.isRunning()) {
            screenFromWindow(true);
            BadgeAnimator badgeAnimator2 = new BadgeAnimator(createBadgeBitmap(), pointF, this);
            this.mAnimator = badgeAnimator2;
            badgeAnimator2.start();
            setBadgeNumber(0);
        }
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge bindTarget(View view) {
        if (view == null) {
            throw new IllegalStateException("targetView can not be null");
        }
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("targetView must have a parent");
        }
        this.mTargetView = view;
        if (parent instanceof BadgeContainer) {
            ((BadgeContainer) parent).addView(this);
        } else {
            ViewGroup viewGroup = (ViewGroup) parent;
            int iIndexOfChild = viewGroup.indexOfChild(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            viewGroup.removeView(view);
            BadgeContainer badgeContainer = new BadgeContainer(getContext());
            if (viewGroup instanceof RelativeLayout) {
                badgeContainer.setId(view.getId());
            }
            viewGroup.addView(badgeContainer, iIndexOfChild, layoutParams);
            badgeContainer.addView(view);
            badgeContainer.addView(this);
        }
        return this;
    }

    protected Bitmap createBadgeBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.mBadgeBackgroundRect.width()) + DensityUtils.dp2px(getContext(), 3.0f), ((int) this.mBadgeBackgroundRect.height()) + DensityUtils.dp2px(getContext(), 3.0f), Bitmap.Config.ARGB_8888);
        drawBadge(new Canvas(bitmapCreateBitmap), new PointF(r1.getWidth() / 2.0f, r1.getHeight() / 2.0f), getBadgeCircleRadius());
        return bitmapCreateBitmap;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Drawable getBadgeBackground() {
        return this.mDrawableBackground;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public int getBadgeBackgroundColor() {
        return this.mColorBackground;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public int getBadgeGravity() {
        return this.mBadgeGravity;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public int getBadgeNumber() {
        return this.mBadgeNumber;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public float getBadgePadding(boolean z3) {
        return z3 ? DensityUtils.px2dp(getContext(), this.mBadgePadding) : this.mBadgePadding;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public String getBadgeText() {
        return this.mBadgeText;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public int getBadgeTextColor() {
        return this.mColorBadgeText;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public float getBadgeTextSize(boolean z3) {
        return z3 ? DensityUtils.px2dp(getContext(), this.mBadgeTextSize) : this.mBadgeTextSize;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public PointF getDragCenter() {
        if (this.mDraggable && this.mDragging) {
            return this.mDragCenter;
        }
        return null;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public float getGravityOffsetX(boolean z3) {
        return z3 ? DensityUtils.px2dp(getContext(), this.mGravityOffsetX) : this.mGravityOffsetX;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public float getGravityOffsetY(boolean z3) {
        return z3 ? DensityUtils.px2dp(getContext(), this.mGravityOffsetY) : this.mGravityOffsetY;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public View getTargetView() {
        return this.mTargetView;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public void hide(boolean z3) {
        if (!z3 || this.mActivityRoot == null) {
            setBadgeNumber(0);
        } else {
            initRowBadgeCenter();
            animateHide(this.mRowBadgeCenter);
        }
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public boolean isDraggable() {
        return this.mDraggable;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public boolean isExactMode() {
        return this.mExact;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public boolean isShowShadow() {
        return this.mShowShadow;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mActivityRoot == null) {
            findViewRoot(this.mTargetView);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        BadgeAnimator badgeAnimator = this.mAnimator;
        if (badgeAnimator != null && badgeAnimator.isRunning()) {
            this.mAnimator.draw(canvas);
            return;
        }
        if (this.mBadgeText != null) {
            initPaints();
            float badgeCircleRadius = getBadgeCircleRadius();
            float pointDistance = this.mDefaultRadius * (1.0f - (MathUtils.getPointDistance(this.mRowBadgeCenter, this.mDragCenter) / this.mFinalDragDistance));
            if (!this.mDraggable || !this.mDragging) {
                findBadgeCenter();
                drawBadge(canvas, this.mBadgeCenter, badgeCircleRadius);
                return;
            }
            this.mDragQuadrant = MathUtils.getQuadrant(this.mDragCenter, this.mRowBadgeCenter);
            showShadowImpl(this.mShowShadow);
            boolean z3 = pointDistance < ((float) DensityUtils.dp2px(getContext(), 1.5f));
            this.mDragOutOfRange = z3;
            if (z3) {
                updateListener(3);
                drawBadge(canvas, this.mDragCenter, badgeCircleRadius);
            } else {
                updateListener(2);
                drawDragging(canvas, pointDistance, badgeCircleRadius);
                drawBadge(canvas, this.mDragCenter, badgeCircleRadius);
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mWidth = i4;
        this.mHeight = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L31
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L31
            r3 = 5
            if (r0 == r3) goto L45
            r3 = 6
            if (r0 == r3) goto L31
            goto La8
        L18:
            boolean r0 = r6.mDragging
            if (r0 == 0) goto La8
            android.graphics.PointF r0 = r6.mDragCenter
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.mDragCenter
            float r3 = r7.getRawY()
            r0.y = r3
            r6.invalidate()
            goto La8
        L31:
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            if (r0 != 0) goto La8
            boolean r0 = r6.mDragging
            if (r0 == 0) goto La8
            r6.mDragging = r1
            r6.onPointerUp()
            goto La8
        L45:
            float r0 = r7.getX()
            float r3 = r7.getY()
            boolean r4 = r6.mDraggable
            if (r4 == 0) goto La8
            int r4 = r7.getActionIndex()
            int r4 = r7.getPointerId(r4)
            if (r4 != 0) goto La8
            android.graphics.RectF r4 = r6.mBadgeBackgroundRect
            float r5 = r4.left
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto La8
            float r5 = r4.right
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto La8
            float r0 = r4.top
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto La8
            float r0 = r4.bottom
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La8
            java.lang.String r0 = r6.mBadgeText
            if (r0 == 0) goto La8
            r6.initRowBadgeCenter()
            r6.mDragging = r2
            r6.updateListener(r2)
            android.content.Context r0 = r6.getContext()
            r3 = 1088421888(0x40e00000, float:7.0)
            int r0 = com.xuexiang.xui.utils.DensityUtils.dp2px(r0, r3)
            float r0 = (float) r0
            r6.mDefaultRadius = r0
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r6.screenFromWindow(r2)
            android.graphics.PointF r0 = r6.mDragCenter
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.mDragCenter
            float r3 = r7.getRawY()
            r0.y = r3
        La8:
            boolean r0 = r6.mDragging
            if (r0 != 0) goto Lb2
            boolean r7 = super.onTouchEvent(r7)
            if (r7 == 0) goto Lb3
        Lb2:
            r1 = 1
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.textview.badge.BadgeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void reset() {
        PointF pointF = this.mDragCenter;
        pointF.x = -1000.0f;
        pointF.y = -1000.0f;
        this.mDragQuadrant = 4;
        screenFromWindow(false);
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
    }

    protected void screenFromWindow(boolean z3) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z3) {
            this.mActivityRoot.addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            bindTarget(this.mTargetView);
        }
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeBackground(Drawable drawable) {
        return setBadgeBackground(drawable, false);
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeBackgroundColor(int i4) {
        this.mColorBackground = i4;
        if (i4 == 0) {
            this.mBadgeTextPaint.setXfermode(null);
        } else {
            this.mBadgeTextPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeGravity(int i4) {
        if (i4 != 8388659 && i4 != 8388661 && i4 != 8388691 && i4 != 8388693 && i4 != 17 && i4 != 49 && i4 != 81 && i4 != 8388627 && i4 != 8388629) {
            throw new IllegalStateException("only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END");
        }
        this.mBadgeGravity = i4;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeNumber(int i4) {
        this.mBadgeNumber = i4;
        if (i4 < 0) {
            this.mBadgeText = "";
        } else if (i4 > 99) {
            this.mBadgeText = this.mExact ? String.valueOf(i4) : "99+";
        } else if (i4 > 0) {
            this.mBadgeText = String.valueOf(i4);
        } else {
            this.mBadgeText = null;
        }
        measureText();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgePadding(float f4, boolean z3) {
        if (z3) {
            f4 = DensityUtils.dp2px(getContext(), f4);
        }
        this.mBadgePadding = f4;
        createClipLayer();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeText(String str) {
        this.mBadgeText = str;
        this.mBadgeNumber = 1;
        measureText();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeTextColor(int i4) {
        this.mColorBadgeText = i4;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeTextSize(float f4, boolean z3) {
        if (z3) {
            f4 = DensityUtils.dp2px(getContext(), f4);
        }
        this.mBadgeTextSize = f4;
        measureText();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setExactMode(boolean z3) {
        this.mExact = z3;
        int i4 = this.mBadgeNumber;
        if (i4 > 99) {
            setBadgeNumber(i4);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setGravityOffset(float f4, boolean z3) {
        return setGravityOffset(f4, f4, z3);
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setOnDragStateChangedListener(Badge.OnDragStateChangedListener onDragStateChangedListener) {
        this.mDraggable = onDragStateChangedListener != null;
        this.mDragStateChangedListener = onDragStateChangedListener;
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setShowShadow(boolean z3) {
        this.mShowShadow = z3;
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge stroke(int i4, float f4, boolean z3) {
        this.mColorBackgroundBorder = i4;
        if (z3) {
            f4 = DensityUtils.dp2px(getContext(), f4);
        }
        this.mBackgroundBorderWidth = f4;
        invalidate();
        return this;
    }

    private BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setBadgeBackground(Drawable drawable, boolean z3) {
        this.mDrawableBackgroundClip = z3;
        this.mDrawableBackground = drawable;
        createClipLayer();
        invalidate();
        return this;
    }

    @Override // com.xuexiang.xui.widget.textview.badge.Badge
    public Badge setGravityOffset(float f4, float f5, boolean z3) {
        if (z3) {
            f4 = DensityUtils.dp2px(getContext(), f4);
        }
        this.mGravityOffsetX = f4;
        if (z3) {
            f5 = DensityUtils.dp2px(getContext(), f5);
        }
        this.mGravityOffsetY = f5;
        invalidate();
        return this;
    }

    private BadgeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
