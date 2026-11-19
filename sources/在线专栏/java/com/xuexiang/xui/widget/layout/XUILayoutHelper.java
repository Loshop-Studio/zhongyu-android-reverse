package com.xuexiang.xui.widget.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class XUILayoutHelper implements IXUILayout {
    private int mBorderColor;
    private RectF mBorderRect;
    private int mBorderWidth;
    private int mBottomDividerColor;
    private int mBottomDividerHeight;
    private int mBottomDividerInsetLeft;
    private int mBottomDividerInsetRight;
    private Paint mClipPaint;
    private Context mContext;
    private Paint mDividerPaint;
    private int mHeightLimit;
    private int mHeightMini;
    private int mHideRadiusSide;
    private boolean mIsOutlineExcludePadding;
    private boolean mIsShowBorderOnlyBeforeL;
    private int mLeftDividerColor;
    private int mLeftDividerInsetBottom;
    private int mLeftDividerInsetTop;
    private int mLeftDividerWidth;
    private PorterDuffXfermode mMode;
    private int mOuterNormalColor;
    private int mOutlineInsetBottom;
    private int mOutlineInsetLeft;
    private int mOutlineInsetRight;
    private int mOutlineInsetTop;
    private WeakReference<View> mOwner;
    private int mRadius;
    private float[] mRadiusArray;
    private int mRightDividerColor;
    private int mRightDividerInsetBottom;
    private int mRightDividerInsetTop;
    private int mRightDividerWidth;
    private float mShadowAlpha;
    private int mTopDividerColor;
    private int mTopDividerHeight;
    private int mTopDividerInsetLeft;
    private int mTopDividerInsetRight;
    private int mWidthLimit;
    private int mWidthMini;
    private int mTopDividerAlpha = 255;
    private int mBottomDividerAlpha = 255;
    private int mLeftDividerAlpha = 255;
    private int mRightDividerAlpha = 255;
    private Path mPath = new Path();
    private int mShadowElevation = 0;
    private int mShadowColor = IGoodView.DEFAULT_TEXT_COLOR;

    public XUILayoutHelper(Context context, AttributeSet attributeSet, int i4, View view) {
        boolean z3;
        int dimensionPixelSize;
        int iResolveDimension = 0;
        this.mWidthLimit = 0;
        this.mHeightLimit = 0;
        this.mWidthMini = 0;
        this.mHeightMini = 0;
        this.mTopDividerHeight = 0;
        this.mTopDividerInsetLeft = 0;
        this.mTopDividerInsetRight = 0;
        this.mBottomDividerHeight = 0;
        this.mBottomDividerInsetLeft = 0;
        this.mBottomDividerInsetRight = 0;
        this.mLeftDividerWidth = 0;
        this.mLeftDividerInsetTop = 0;
        this.mLeftDividerInsetBottom = 0;
        this.mRightDividerWidth = 0;
        this.mRightDividerInsetTop = 0;
        this.mRightDividerInsetBottom = 0;
        this.mHideRadiusSide = 0;
        this.mBorderColor = 0;
        this.mBorderWidth = 1;
        this.mOuterNormalColor = 0;
        this.mIsOutlineExcludePadding = false;
        this.mIsShowBorderOnlyBeforeL = true;
        this.mOutlineInsetLeft = 0;
        this.mOutlineInsetRight = 0;
        this.mOutlineInsetTop = 0;
        this.mOutlineInsetBottom = 0;
        this.mContext = context;
        this.mOwner = new WeakReference<>(view);
        int iResolveColor = ThemeUtils.resolveColor(context, C2042R.attr.xui_config_color_separator_light);
        this.mTopDividerColor = iResolveColor;
        this.mBottomDividerColor = iResolveColor;
        this.mMode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        this.mClipPaint = paint;
        paint.setAntiAlias(true);
        this.mShadowAlpha = ThemeUtils.resolveFloat(context, C2042R.attr.xui_general_shadow_alpha);
        this.mBorderRect = new RectF();
        if (attributeSet == null && i4 == 0) {
            z3 = false;
            dimensionPixelSize = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.XUILayout, i4, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int dimensionPixelSize2 = 0;
            z3 = false;
            dimensionPixelSize = 0;
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == C2042R.styleable.XUILayout_android_maxWidth) {
                    this.mWidthLimit = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mWidthLimit);
                } else if (index == C2042R.styleable.XUILayout_android_maxHeight) {
                    this.mHeightLimit = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mHeightLimit);
                } else if (index == C2042R.styleable.XUILayout_android_minWidth) {
                    this.mWidthMini = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mWidthMini);
                } else if (index == C2042R.styleable.XUILayout_android_minHeight) {
                    this.mHeightMini = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mHeightMini);
                } else if (index == C2042R.styleable.XUILayout_xui_topDividerColor) {
                    this.mTopDividerColor = typedArrayObtainStyledAttributes.getColor(index, this.mTopDividerColor);
                } else if (index == C2042R.styleable.XUILayout_xui_topDividerHeight) {
                    this.mTopDividerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mTopDividerHeight);
                } else if (index == C2042R.styleable.XUILayout_xui_topDividerInsetLeft) {
                    this.mTopDividerInsetLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mTopDividerInsetLeft);
                } else if (index == C2042R.styleable.XUILayout_xui_topDividerInsetRight) {
                    this.mTopDividerInsetRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mTopDividerInsetRight);
                } else if (index == C2042R.styleable.XUILayout_xui_bottomDividerColor) {
                    this.mBottomDividerColor = typedArrayObtainStyledAttributes.getColor(index, this.mBottomDividerColor);
                } else if (index == C2042R.styleable.XUILayout_xui_bottomDividerHeight) {
                    this.mBottomDividerHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBottomDividerHeight);
                } else if (index == C2042R.styleable.XUILayout_xui_bottomDividerInsetLeft) {
                    this.mBottomDividerInsetLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBottomDividerInsetLeft);
                } else if (index == C2042R.styleable.XUILayout_xui_bottomDividerInsetRight) {
                    this.mBottomDividerInsetRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBottomDividerInsetRight);
                } else if (index == C2042R.styleable.XUILayout_xui_leftDividerColor) {
                    this.mLeftDividerColor = typedArrayObtainStyledAttributes.getColor(index, this.mLeftDividerColor);
                } else if (index == C2042R.styleable.XUILayout_xui_leftDividerWidth) {
                    this.mLeftDividerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBottomDividerHeight);
                } else if (index == C2042R.styleable.XUILayout_xui_leftDividerInsetTop) {
                    this.mLeftDividerInsetTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mLeftDividerInsetTop);
                } else if (index == C2042R.styleable.XUILayout_xui_leftDividerInsetBottom) {
                    this.mLeftDividerInsetBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mLeftDividerInsetBottom);
                } else if (index == C2042R.styleable.XUILayout_xui_rightDividerColor) {
                    this.mRightDividerColor = typedArrayObtainStyledAttributes.getColor(index, this.mRightDividerColor);
                } else if (index == C2042R.styleable.XUILayout_xui_rightDividerWidth) {
                    this.mRightDividerWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mRightDividerWidth);
                } else if (index == C2042R.styleable.XUILayout_xui_rightDividerInsetTop) {
                    this.mRightDividerInsetTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mRightDividerInsetTop);
                } else if (index == C2042R.styleable.XUILayout_xui_rightDividerInsetBottom) {
                    this.mRightDividerInsetBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mRightDividerInsetBottom);
                } else if (index == C2042R.styleable.XUILayout_xui_borderColor) {
                    this.mBorderColor = typedArrayObtainStyledAttributes.getColor(index, this.mBorderColor);
                } else if (index == C2042R.styleable.XUILayout_xui_borderWidth) {
                    this.mBorderWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBorderWidth);
                } else if (index == C2042R.styleable.XUILayout_xui_radius) {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C2042R.styleable.XUILayout_xui_outerNormalColor) {
                    this.mOuterNormalColor = typedArrayObtainStyledAttributes.getColor(index, this.mOuterNormalColor);
                } else if (index == C2042R.styleable.XUILayout_xui_hideRadiusSide) {
                    this.mHideRadiusSide = typedArrayObtainStyledAttributes.getColor(index, this.mHideRadiusSide);
                } else if (index == C2042R.styleable.XUILayout_xui_showBorderOnlyBeforeL) {
                    this.mIsShowBorderOnlyBeforeL = typedArrayObtainStyledAttributes.getBoolean(index, this.mIsShowBorderOnlyBeforeL);
                } else if (index == C2042R.styleable.XUILayout_xui_shadowElevation) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize2);
                } else if (index == C2042R.styleable.XUILayout_xui_shadowAlpha) {
                    this.mShadowAlpha = typedArrayObtainStyledAttributes.getFloat(index, this.mShadowAlpha);
                } else if (index == C2042R.styleable.XUILayout_xui_useThemeGeneralShadowElevation) {
                    z3 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == C2042R.styleable.XUILayout_xui_outlineInsetLeft) {
                    this.mOutlineInsetLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C2042R.styleable.XUILayout_xui_outlineInsetRight) {
                    this.mOutlineInsetRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C2042R.styleable.XUILayout_xui_outlineInsetTop) {
                    this.mOutlineInsetTop = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C2042R.styleable.XUILayout_xui_outlineInsetBottom) {
                    this.mOutlineInsetBottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == C2042R.styleable.XUILayout_xui_outlineExcludePadding) {
                    this.mIsOutlineExcludePadding = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            iResolveDimension = dimensionPixelSize2;
        }
        if (iResolveDimension == 0 && z3) {
            iResolveDimension = ThemeUtils.resolveDimension(context, C2042R.attr.xui_general_shadow_elevation);
        }
        setRadiusAndShadow(dimensionPixelSize, this.mHideRadiusSide, iResolveDimension, this.mShadowAlpha);
    }

    private void drawRoundRect(Canvas canvas, RectF rectF, float[] fArr, Paint paint) {
        this.mPath.reset();
        this.mPath.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.mPath, paint);
    }

    private void invalidate() {
        View view;
        if (!useFeature() || (view = this.mOwner.get()) == null) {
            return;
        }
        int i4 = this.mShadowElevation;
        if (i4 == 0) {
            view.setElevation(IGoodView.DEFAULT_TO_ALPHA);
        } else {
            view.setElevation(i4);
        }
        view.invalidateOutline();
    }

    private void setShadowColorInner(int i4) {
        View view;
        if (Build.VERSION.SDK_INT < 28 || (view = this.mOwner.get()) == null) {
            return;
        }
        view.setOutlineAmbientShadowColor(i4);
        view.setOutlineSpotShadowColor(i4);
    }

    public static boolean useFeature() {
        return true;
    }

    public void dispatchRoundBorderDraw(Canvas canvas) {
        if (this.mOwner.get() == null) {
            return;
        }
        if (this.mBorderColor == 0 && (this.mRadius == 0 || this.mOuterNormalColor == 0)) {
            return;
        }
        if (this.mIsShowBorderOnlyBeforeL && useFeature() && this.mShadowElevation != 0) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.mIsOutlineExcludePadding) {
            this.mBorderRect.set(r0.getPaddingLeft() + 1, r0.getPaddingTop() + 1, (width - 1) - r0.getPaddingRight(), (height - 1) - r0.getPaddingBottom());
        } else {
            this.mBorderRect.set(1.0f, 1.0f, width - 1, height - 1);
        }
        if (this.mRadius == 0 || (!useFeature() && this.mOuterNormalColor == 0)) {
            this.mClipPaint.setStyle(Paint.Style.STROKE);
            this.mClipPaint.setColor(this.mBorderColor);
            canvas.drawRect(this.mBorderRect, this.mClipPaint);
            return;
        }
        if (!useFeature()) {
            int iSaveLayer = canvas.saveLayer(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, width, height, null, 31);
            canvas.drawColor(this.mOuterNormalColor);
            this.mClipPaint.setColor(this.mOuterNormalColor);
            this.mClipPaint.setStyle(Paint.Style.FILL);
            this.mClipPaint.setXfermode(this.mMode);
            float[] fArr = this.mRadiusArray;
            if (fArr == null) {
                RectF rectF = this.mBorderRect;
                int i4 = this.mRadius;
                canvas.drawRoundRect(rectF, i4, i4, this.mClipPaint);
            } else {
                drawRoundRect(canvas, this.mBorderRect, fArr, this.mClipPaint);
            }
            this.mClipPaint.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
        }
        this.mClipPaint.setColor(this.mBorderColor);
        this.mClipPaint.setStrokeWidth(this.mBorderWidth);
        this.mClipPaint.setStyle(Paint.Style.STROKE);
        float[] fArr2 = this.mRadiusArray;
        if (fArr2 != null) {
            drawRoundRect(canvas, this.mBorderRect, fArr2, this.mClipPaint);
            return;
        }
        RectF rectF2 = this.mBorderRect;
        int i5 = this.mRadius;
        canvas.drawRoundRect(rectF2, i5, i5, this.mClipPaint);
    }

    public void drawDividers(Canvas canvas, int i4, int i5) {
        if (this.mDividerPaint == null && (this.mTopDividerHeight > 0 || this.mBottomDividerHeight > 0 || this.mLeftDividerWidth > 0 || this.mRightDividerWidth > 0)) {
            this.mDividerPaint = new Paint();
        }
        int i6 = this.mTopDividerHeight;
        if (i6 > 0) {
            this.mDividerPaint.setStrokeWidth(i6);
            this.mDividerPaint.setColor(this.mTopDividerColor);
            int i7 = this.mTopDividerAlpha;
            if (i7 < 255) {
                this.mDividerPaint.setAlpha(i7);
            }
            float f4 = (this.mTopDividerHeight * 1.0f) / 2.0f;
            canvas.drawLine(this.mTopDividerInsetLeft, f4, i4 - this.mTopDividerInsetRight, f4, this.mDividerPaint);
        }
        int i8 = this.mBottomDividerHeight;
        if (i8 > 0) {
            this.mDividerPaint.setStrokeWidth(i8);
            this.mDividerPaint.setColor(this.mBottomDividerColor);
            int i9 = this.mBottomDividerAlpha;
            if (i9 < 255) {
                this.mDividerPaint.setAlpha(i9);
            }
            float fFloor = (float) Math.floor(i5 - ((this.mBottomDividerHeight * 1.0f) / 2.0f));
            canvas.drawLine(this.mBottomDividerInsetLeft, fFloor, i4 - this.mBottomDividerInsetRight, fFloor, this.mDividerPaint);
        }
        int i10 = this.mLeftDividerWidth;
        if (i10 > 0) {
            this.mDividerPaint.setStrokeWidth(i10);
            this.mDividerPaint.setColor(this.mLeftDividerColor);
            int i11 = this.mLeftDividerAlpha;
            if (i11 < 255) {
                this.mDividerPaint.setAlpha(i11);
            }
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, this.mLeftDividerInsetTop, IGoodView.DEFAULT_TO_ALPHA, i5 - this.mLeftDividerInsetBottom, this.mDividerPaint);
        }
        int i12 = this.mRightDividerWidth;
        if (i12 > 0) {
            this.mDividerPaint.setStrokeWidth(i12);
            this.mDividerPaint.setColor(this.mRightDividerColor);
            int i13 = this.mRightDividerAlpha;
            if (i13 < 255) {
                this.mDividerPaint.setAlpha(i13);
            }
            float f5 = i4;
            canvas.drawLine(f5, this.mRightDividerInsetTop, f5, i5 - this.mRightDividerInsetBottom, this.mDividerPaint);
        }
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getHideRadiusSide() {
        return this.mHideRadiusSide;
    }

    public int getMeasuredHeightSpec(int i4) {
        return (this.mHeightLimit <= 0 || View.MeasureSpec.getSize(i4) <= this.mHeightLimit) ? i4 : View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(this.mWidthLimit, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(this.mWidthLimit, 1073741824);
    }

    public int getMeasuredWidthSpec(int i4) {
        return (this.mWidthLimit <= 0 || View.MeasureSpec.getSize(i4) <= this.mWidthLimit) ? i4 : View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(this.mWidthLimit, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(this.mWidthLimit, 1073741824);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getRadius() {
        return this.mRadius;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public float getShadowAlpha() {
        return this.mShadowAlpha;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getShadowColor() {
        return this.mShadowColor;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getShadowElevation() {
        return this.mShadowElevation;
    }

    public int handleMiniHeight(int i4, int i5) {
        int i6;
        return (View.MeasureSpec.getMode(i4) == 1073741824 || i5 >= (i6 = this.mHeightMini)) ? i4 : View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
    }

    public int handleMiniWidth(int i4, int i5) {
        int i6;
        return (View.MeasureSpec.getMode(i4) == 1073741824 || i5 >= (i6 = this.mWidthMini)) ? i4 : View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
    }

    public boolean isRadiusWithSideHidden() {
        return this.mRadius > 0 && this.mHideRadiusSide != 0;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowBottomDivider(int i4, int i5, int i6, int i7) {
        updateBottomDivider(i4, i5, i6, i7);
        this.mLeftDividerWidth = 0;
        this.mRightDividerWidth = 0;
        this.mTopDividerHeight = 0;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowLeftDivider(int i4, int i5, int i6, int i7) {
        updateLeftDivider(i4, i5, i6, i7);
        this.mRightDividerWidth = 0;
        this.mTopDividerHeight = 0;
        this.mBottomDividerHeight = 0;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowRightDivider(int i4, int i5, int i6, int i7) {
        updateRightDivider(i4, i5, i6, i7);
        this.mLeftDividerWidth = 0;
        this.mTopDividerHeight = 0;
        this.mBottomDividerHeight = 0;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowTopDivider(int i4, int i5, int i6, int i7) {
        updateTopDivider(i4, i5, i6, i7);
        this.mLeftDividerWidth = 0;
        this.mRightDividerWidth = 0;
        this.mBottomDividerHeight = 0;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setBorderColor(int i4) {
        this.mBorderColor = i4;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setBorderWidth(int i4) {
        this.mBorderWidth = i4;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setBottomDividerAlpha(int i4) {
        this.mBottomDividerAlpha = i4;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public boolean setHeightLimit(int i4) {
        if (this.mHeightLimit == i4) {
            return false;
        }
        this.mHeightLimit = i4;
        return true;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setHideRadiusSide(int i4) {
        if (this.mHideRadiusSide == i4) {
            return;
        }
        setRadiusAndShadow(this.mRadius, i4, this.mShadowElevation, this.mShadowAlpha);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setLeftDividerAlpha(int i4) {
        this.mLeftDividerAlpha = i4;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setOuterNormalColor(int i4) {
        this.mOuterNormalColor = i4;
        View view = this.mOwner.get();
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setOutlineExcludePadding(boolean z3) {
        View view;
        if (!useFeature() || (view = this.mOwner.get()) == null) {
            return;
        }
        this.mIsOutlineExcludePadding = z3;
        view.invalidateOutline();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setOutlineInset(int i4, int i5, int i6, int i7) {
        View view;
        if (!useFeature() || (view = this.mOwner.get()) == null) {
            return;
        }
        this.mOutlineInsetLeft = i4;
        this.mOutlineInsetRight = i6;
        this.mOutlineInsetTop = i5;
        this.mOutlineInsetBottom = i7;
        view.invalidateOutline();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadius(int i4) {
        if (this.mRadius != i4) {
            setRadiusAndShadow(i4, this.mShadowElevation, this.mShadowAlpha);
        }
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadiusAndShadow(int i4, int i5, float f4) {
        setRadiusAndShadow(i4, this.mHideRadiusSide, i5, f4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRightDividerAlpha(int i4) {
        this.mRightDividerAlpha = i4;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShadowAlpha(float f4) {
        if (this.mShadowAlpha == f4) {
            return;
        }
        this.mShadowAlpha = f4;
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShadowColor(int i4) {
        if (this.mShadowColor == i4) {
            return;
        }
        this.mShadowColor = i4;
        setShadowColorInner(i4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShadowElevation(int i4) {
        if (this.mShadowElevation == i4) {
            return;
        }
        this.mShadowElevation = i4;
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShowBorderOnlyBeforeL(boolean z3) {
        this.mIsShowBorderOnlyBeforeL = z3;
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setTopDividerAlpha(int i4) {
        this.mTopDividerAlpha = i4;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setUseThemeGeneralShadowElevation() {
        int iResolveDimension = ThemeUtils.resolveDimension(this.mContext, C2042R.attr.xui_general_shadow_elevation);
        this.mShadowElevation = iResolveDimension;
        setRadiusAndShadow(this.mRadius, this.mHideRadiusSide, iResolveDimension, this.mShadowAlpha);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public boolean setWidthLimit(int i4) {
        if (this.mWidthLimit == i4) {
            return false;
        }
        this.mWidthLimit = i4;
        return true;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateBottomDivider(int i4, int i5, int i6, int i7) {
        this.mBottomDividerInsetLeft = i4;
        this.mBottomDividerInsetRight = i5;
        this.mBottomDividerColor = i7;
        this.mBottomDividerHeight = i6;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateLeftDivider(int i4, int i5, int i6, int i7) {
        this.mLeftDividerInsetTop = i4;
        this.mLeftDividerInsetBottom = i5;
        this.mLeftDividerWidth = i6;
        this.mLeftDividerColor = i7;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateRightDivider(int i4, int i5, int i6, int i7) {
        this.mRightDividerInsetTop = i4;
        this.mRightDividerInsetBottom = i5;
        this.mRightDividerWidth = i6;
        this.mRightDividerColor = i7;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateTopDivider(int i4, int i5, int i6, int i7) {
        this.mTopDividerInsetLeft = i4;
        this.mTopDividerInsetRight = i5;
        this.mTopDividerHeight = i6;
        this.mTopDividerColor = i7;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadiusAndShadow(int i4, int i5, int i6, float f4) {
        setRadiusAndShadow(i4, i5, i6, this.mShadowColor, f4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadius(int i4, int i5) {
        if (this.mRadius == i4 && i5 == this.mHideRadiusSide) {
            return;
        }
        setRadiusAndShadow(i4, i5, this.mShadowElevation, this.mShadowAlpha);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadiusAndShadow(int i4, int i5, int i6, int i7, float f4) {
        View view = this.mOwner.get();
        if (view == null) {
            return;
        }
        this.mRadius = i4;
        this.mHideRadiusSide = i5;
        if (i4 > 0) {
            if (i5 == 1) {
                this.mRadiusArray = new float[]{IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, i4, i4, i4, i4};
            } else if (i5 == 2) {
                this.mRadiusArray = new float[]{i4, i4, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, i4, i4};
            } else if (i5 == 3) {
                this.mRadiusArray = new float[]{i4, i4, i4, i4, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};
            } else if (i5 == 4) {
                this.mRadiusArray = new float[]{IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, i4, i4, i4, i4, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA};
            } else {
                this.mRadiusArray = null;
            }
        }
        this.mShadowElevation = i6;
        this.mShadowAlpha = f4;
        this.mShadowColor = i7;
        if (useFeature()) {
            if (this.mShadowElevation != 0 && !isRadiusWithSideHidden()) {
                view.setElevation(this.mShadowElevation);
            } else {
                view.setElevation(IGoodView.DEFAULT_TO_ALPHA);
            }
            setShadowColorInner(this.mShadowColor);
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.xuexiang.xui.widget.layout.XUILayoutHelper.1
                @Override // android.view.ViewOutlineProvider
                @TargetApi(21)
                public void getOutline(View view2, Outline outline) {
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    if (width == 0 || height == 0) {
                        return;
                    }
                    if (XUILayoutHelper.this.isRadiusWithSideHidden()) {
                        if (XUILayoutHelper.this.mHideRadiusSide == 4) {
                            i10 = 0 - XUILayoutHelper.this.mRadius;
                            i8 = width;
                            i9 = height;
                        } else {
                            if (XUILayoutHelper.this.mHideRadiusSide == 1) {
                                i11 = 0 - XUILayoutHelper.this.mRadius;
                                i8 = width;
                                i9 = height;
                                i10 = 0;
                                outline.setRoundRect(i10, i11, i8, i9, XUILayoutHelper.this.mRadius);
                                return;
                            }
                            if (XUILayoutHelper.this.mHideRadiusSide == 2) {
                                width += XUILayoutHelper.this.mRadius;
                            } else if (XUILayoutHelper.this.mHideRadiusSide == 3) {
                                height += XUILayoutHelper.this.mRadius;
                            }
                            i8 = width;
                            i9 = height;
                            i10 = 0;
                        }
                        i11 = 0;
                        outline.setRoundRect(i10, i11, i8, i9, XUILayoutHelper.this.mRadius);
                        return;
                    }
                    int paddingTop = XUILayoutHelper.this.mOutlineInsetTop;
                    int iMax = Math.max(paddingTop + 1, height - XUILayoutHelper.this.mOutlineInsetBottom);
                    int paddingLeft = XUILayoutHelper.this.mOutlineInsetLeft;
                    int iMax2 = width - XUILayoutHelper.this.mOutlineInsetRight;
                    if (XUILayoutHelper.this.mIsOutlineExcludePadding) {
                        paddingLeft += view2.getPaddingLeft();
                        paddingTop += view2.getPaddingTop();
                        iMax2 = Math.max(paddingLeft + 1, iMax2 - view2.getPaddingRight());
                        iMax = Math.max(paddingTop + 1, iMax - view2.getPaddingBottom());
                    }
                    int i12 = iMax2;
                    int i13 = iMax;
                    int i14 = paddingTop;
                    int i15 = paddingLeft;
                    float f5 = XUILayoutHelper.this.mShadowAlpha;
                    if (XUILayoutHelper.this.mShadowElevation == 0) {
                        f5 = 1.0f;
                    }
                    outline.setAlpha(f5);
                    if (XUILayoutHelper.this.mRadius <= 0) {
                        outline.setRect(i15, i14, i12, i13);
                    } else {
                        outline.setRoundRect(i15, i14, i12, i13, XUILayoutHelper.this.mRadius);
                    }
                }
            });
            view.setClipToOutline(this.mRadius > 0);
        }
        view.invalidate();
    }
}
