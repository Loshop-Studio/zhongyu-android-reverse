package com.xuexiang.xui.widget.banner.widget.banner.base;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.banner.anim.BaseAnimator;
import com.xuexiang.xui.widget.banner.widget.banner.base.BaseIndicatorBanner;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseIndicatorBanner<E, T extends BaseIndicatorBanner<E, T>> extends BaseBanner<E, T> {
    public static final int STYLE_CORNER_RECTANGLE = 1;
    public static final int STYLE_DRAWABLE_RESOURCE = 0;
    private int mIndicatorCornerRadius;
    private int mIndicatorGap;
    private int mIndicatorHeight;
    private int mIndicatorStyle;
    private List<ImageView> mIndicatorViews;
    private int mIndicatorWidth;
    private LinearLayout mLlIndicators;
    private Class<? extends BaseAnimator> mSelectAnimClass;
    private int mSelectColor;
    private Drawable mSelectDrawable;
    private Drawable mUnSelectDrawable;
    private Class<? extends BaseAnimator> mUnselectAnimClass;
    private int mUnselectColor;

    private static class ReverseInterpolator implements Interpolator {
        private ReverseInterpolator() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return Math.abs(1.0f - f4);
        }
    }

    public BaseIndicatorBanner(Context context) {
        super(context);
        this.mIndicatorViews = new ArrayList();
        initAttrs(context, null);
    }

    private GradientDrawable getDrawable(int i4, float f4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f4);
        gradientDrawable.setColor(i4);
        return gradientDrawable;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.BaseIndicatorBanner);
        this.mIndicatorStyle = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.BaseIndicatorBanner_bb_indicatorStyle, 1);
        this.mIndicatorWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BaseIndicatorBanner_bb_indicatorWidth, dp2px(6.0f));
        this.mIndicatorHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BaseIndicatorBanner_bb_indicatorHeight, dp2px(6.0f));
        this.mIndicatorGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BaseIndicatorBanner_bb_indicatorGap, dp2px(6.0f));
        this.mIndicatorCornerRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.BaseIndicatorBanner_bb_indicatorCornerRadius, dp2px(3.0f));
        this.mSelectColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BaseIndicatorBanner_bb_indicatorSelectColor, Color.parseColor("#ffffff"));
        this.mUnselectColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.BaseIndicatorBanner_bb_indicatorUnselectColor, Color.parseColor("#88ffffff"));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.BaseIndicatorBanner_bb_indicatorSelectRes, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C2042R.styleable.BaseIndicatorBanner_bb_indicatorUnselectRes, 0);
        typedArrayObtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context);
        this.mLlIndicators = linearLayout;
        linearLayout.setGravity(17);
        setIndicatorSelectorRes(resourceId2, resourceId);
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public View onCreateIndicator() {
        if (this.mIndicatorStyle == 1) {
            this.mUnSelectDrawable = getDrawable(this.mUnselectColor, this.mIndicatorCornerRadius);
            this.mSelectDrawable = getDrawable(this.mSelectColor, this.mIndicatorCornerRadius);
        }
        int size = this.mDatas.size();
        this.mIndicatorViews.clear();
        this.mLlIndicators.removeAllViews();
        int i4 = 0;
        while (i4 < size) {
            ImageView imageView = new ImageView(this.mContext);
            imageView.setImageDrawable(i4 == this.mCurrentPosition ? this.mSelectDrawable : this.mUnSelectDrawable);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.mIndicatorWidth, this.mIndicatorHeight);
            layoutParams.setMarginStart(i4 == 0 ? 0 : this.mIndicatorGap);
            this.mLlIndicators.addView(imageView, layoutParams);
            this.mIndicatorViews.add(imageView);
            i4++;
        }
        setCurrentIndicator(this.mCurrentPosition);
        return this.mLlIndicators;
    }

    @Override // com.xuexiang.xui.widget.banner.widget.banner.base.BaseBanner
    public void setCurrentIndicator(int i4) {
        int i5 = 0;
        while (i5 < this.mIndicatorViews.size()) {
            this.mIndicatorViews.get(i5).setImageDrawable(i5 == i4 ? this.mSelectDrawable : this.mUnSelectDrawable);
            i5++;
        }
        try {
            Class<? extends BaseAnimator> cls = this.mSelectAnimClass;
            if (cls != null) {
                if (i4 == this.mLastPosition) {
                    cls.newInstance().playOn(this.mIndicatorViews.get(i4));
                } else {
                    cls.newInstance().playOn(this.mIndicatorViews.get(i4));
                    Class<? extends BaseAnimator> cls2 = this.mUnselectAnimClass;
                    if (cls2 == null) {
                        this.mSelectAnimClass.newInstance().interpolator(new ReverseInterpolator()).playOn(this.mIndicatorViews.get(this.mLastPosition));
                    } else {
                        cls2.newInstance().playOn(this.mIndicatorViews.get(this.mLastPosition));
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public T setIndicatorCornerRadius(float f4) {
        this.mIndicatorCornerRadius = dp2px(f4);
        return this;
    }

    public T setIndicatorGap(float f4) {
        this.mIndicatorGap = dp2px(f4);
        return this;
    }

    public T setIndicatorHeight(float f4) {
        this.mIndicatorHeight = dp2px(f4);
        return this;
    }

    public T setIndicatorSelectColor(int i4) {
        this.mSelectColor = i4;
        return this;
    }

    public T setIndicatorSelectorRes(int i4, int i5) {
        try {
            if (this.mIndicatorStyle == 0) {
                if (i5 != 0) {
                    this.mSelectDrawable = getResources().getDrawable(i5);
                }
                if (i4 != 0) {
                    this.mUnSelectDrawable = getResources().getDrawable(i4);
                }
            }
        } catch (Resources.NotFoundException e4) {
            e4.printStackTrace();
        }
        return this;
    }

    public T setIndicatorStyle(int i4) {
        this.mIndicatorStyle = i4;
        return this;
    }

    public T setIndicatorUnselectColor(int i4) {
        this.mUnselectColor = i4;
        return this;
    }

    public T setIndicatorWidth(float f4) {
        this.mIndicatorWidth = dp2px(f4);
        return this;
    }

    public T setSelectAnimClass(Class<? extends BaseAnimator> cls) {
        this.mSelectAnimClass = cls;
        return this;
    }

    public T setUnselectAnimClass(Class<? extends BaseAnimator> cls) {
        this.mUnselectAnimClass = cls;
        return this;
    }

    public BaseIndicatorBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIndicatorViews = new ArrayList();
        initAttrs(context, attributeSet);
    }

    public BaseIndicatorBanner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIndicatorViews = new ArrayList();
        initAttrs(context, attributeSet);
    }
}
