package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager.widget.AbstractC0783a;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import io.github.inflationx.calligraphy3.HasTypeface;
import p104j0.C2687b;

/* loaded from: classes.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.InterfaceC0779i, HasTypeface {
    private int indicatorBottomLineColor;
    private int indicatorBottomLineHeight;
    private int indicatorHeight;
    private int indicatorLineColor;
    private Drawable indicatorLineDrawable;
    private int indicatorLineHeight;
    private boolean indicatorLineShow;
    private int indicatorLineWidth;
    private int indicatorNormalColor;
    private float indicatorSelectTextSize;
    private int indicatorSelectedColor;
    private float indicatorTextSize;
    private int indicatorVerticalLineColor;
    private int indicatorVerticalLineHeight;
    private int indicatorVerticalLineWidth;
    private int indicatorWidth;
    private int mCurrIndex;
    private LinearLayout mIndicatorContainer;
    public OnTabClickListener mOnTabClickListener;
    private ViewPager mViewPager;
    public int screenHeight;
    public int screenWidth;
    private LinearLayout tabContent;
    private TextView[] tvs;

    public interface OnTabClickListener {
        void onTabClick(String str, int i4);
    }

    public EasyIndicator(Context context) {
        this(context, null);
    }

    private AnimatorSet buildIndicatorAnimatorTowards(TextView textView) {
        float x3 = this.tabContent.getX();
        LinearLayout linearLayout = this.mIndicatorContainer;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, "X", linearLayout.getX(), textView.getX() + x3);
        final ViewGroup.LayoutParams layoutParams = this.mIndicatorContainer.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.xuexiang.xui.widget.tabbar.EasyIndicator.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                EasyIndicator.this.mIndicatorContainer.setLayoutParams(layoutParams);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new C2687b());
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        return animatorSet;
    }

    private float getDimensionPixelSize(TypedArray typedArray, int i4, int i5) {
        return typedArray.getResourceId(i4, 0) > 0 ? typedArray.getResources().getDimensionPixelSize(r0) : typedArray.getDimensionPixelSize(i4, (int) getPixelSizeBySp(i5));
    }

    private float getPixelSizeBySp(int i4) {
        return i4 * getResources().getDisplayMetrics().scaledDensity;
    }

    private void init(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.EasyIndicator, i4, 0);
        this.indicatorWidth = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_width, this.indicatorWidth);
        this.indicatorHeight = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_height, this.indicatorHeight);
        Drawable drawableAttrRes = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_background);
        this.indicatorLineShow = typedArrayObtainStyledAttributes.getBoolean(C2042R.styleable.EasyIndicator_indicator_line_show, this.indicatorLineShow);
        this.indicatorLineWidth = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_line_width, this.indicatorLineWidth);
        this.indicatorLineHeight = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_line_height, this.indicatorLineHeight);
        this.indicatorLineColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.EasyIndicator_indicator_line_color, ThemeUtils.getMainThemeColor(getContext()));
        this.indicatorLineDrawable = ResUtils.getDrawableAttrRes(context, typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_line_res);
        this.indicatorBottomLineHeight = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_bottom_line_height, this.indicatorBottomLineHeight);
        int i5 = C2042R.styleable.EasyIndicator_indicator_bottom_line_color;
        Context context2 = getContext();
        int i6 = C2042R.attr.xui_config_color_separator_dark;
        this.indicatorBottomLineColor = typedArrayObtainStyledAttributes.getColor(i5, ThemeUtils.resolveColor(context2, i6));
        this.indicatorSelectedColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.EasyIndicator_indicator_selected_color, ThemeUtils.getMainThemeColor(getContext()));
        this.indicatorNormalColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.EasyIndicator_indicator_normal_color, ResUtils.getColor(C2042R.color.xui_config_color_black));
        this.indicatorTextSize = getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_textSize, (int) this.indicatorTextSize);
        this.indicatorVerticalLineWidth = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_vertical_line_w, this.indicatorVerticalLineWidth);
        this.indicatorVerticalLineColor = typedArrayObtainStyledAttributes.getColor(C2042R.styleable.EasyIndicator_indicator_vertical_line_color, ThemeUtils.resolveColor(getContext(), i6));
        this.indicatorVerticalLineHeight = (int) getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_vertical_line_h, this.indicatorVerticalLineHeight);
        this.indicatorSelectTextSize = getDimensionPixelSize(typedArrayObtainStyledAttributes, C2042R.styleable.EasyIndicator_indicator_select_textSize, 14);
        typedArrayObtainStyledAttributes.recycle();
        int iMin = Math.min(this.indicatorWidth, this.screenWidth);
        this.indicatorWidth = iMin;
        if (iMin == 0) {
            this.indicatorWidth = -1;
        }
        this.tabContent = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.indicatorWidth, -2);
        if (drawableAttrRes != null) {
            this.tabContent.setBackground(drawableAttrRes);
        } else {
            this.tabContent.setBackgroundColor(-1);
        }
        layoutParams.gravity = 17;
        this.tabContent.setLayoutParams(layoutParams);
        this.tabContent.setGravity(17);
    }

    private void initScreenWidth() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.screenHeight = displayMetrics.heightPixels;
        this.screenWidth = displayMetrics.widthPixels;
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.tvs) {
            textView2.setTextColor(this.indicatorNormalColor);
            textView2.setTextSize(0, this.indicatorTextSize);
        }
        textView.setTextColor(this.indicatorSelectedColor);
        textView.setTextSize(0, this.indicatorSelectTextSize);
    }

    public LinearLayout getTabContent() {
        return this.tabContent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
        } else {
            setSelectorColor(textView);
            if (this.indicatorLineShow) {
                buildIndicatorAnimatorTowards(textView).start();
            }
        }
        OnTabClickListener onTabClickListener = this.mOnTabClickListener;
        if (onTabClickListener != null) {
            onTabClickListener.onTabClick(((TextView) view).getText().toString(), iIntValue);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
    public void onPageScrolled(int i4, float f4, int i5) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mIndicatorContainer.getLayoutParams();
        int i6 = this.mCurrIndex;
        if (i6 == i4) {
            layoutParams.setMarginStart((int) ((i6 * this.mIndicatorContainer.getMeasuredWidth()) + (f4 * this.mIndicatorContainer.getMeasuredWidth())));
        } else if (i6 > i4) {
            layoutParams.setMarginStart((int) ((i6 * this.mIndicatorContainer.getMeasuredWidth()) - ((1.0f - f4) * this.mIndicatorContainer.getMeasuredWidth())));
        }
        this.mIndicatorContainer.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
    public void onPageSelected(int i4) {
        this.mCurrIndex = i4;
        setSelectorColor(this.tvs[i4]);
    }

    public void setOnTabClickListener(OnTabClickListener onTabClickListener) {
        this.mOnTabClickListener = onTabClickListener;
    }

    public void setTabTitles(String[] strArr) {
        int length;
        this.tvs = new TextView[strArr.length];
        this.tabContent.removeAllViews();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i4));
            textView.setText(strArr[i4]);
            textView.setTypeface(XUI.getDefaultTypeface());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.indicatorHeight, 1.0f));
            if (i4 == 0) {
                textView.setTextColor(this.indicatorSelectedColor);
                textView.setTextSize(0, this.indicatorSelectTextSize);
            } else {
                textView.setTextColor(this.indicatorNormalColor);
                textView.setTextSize(0, this.indicatorTextSize);
            }
            textView.setOnClickListener(this);
            this.tvs[i4] = textView;
            this.tabContent.addView(textView);
            if (i4 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.indicatorVerticalLineColor);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.indicatorVerticalLineWidth, this.indicatorVerticalLineHeight));
                this.tabContent.addView(view);
            }
        }
        removeAllViews();
        addView(this.tabContent);
        if (this.indicatorLineShow) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.mIndicatorContainer = linearLayout;
            linearLayout.setGravity(17);
            int i5 = this.indicatorWidth;
            if (i5 > 0) {
                length = this.tvs.length;
            } else {
                i5 = this.screenWidth;
                length = this.tvs.length;
            }
            this.mIndicatorContainer.setLayoutParams(new LinearLayoutCompat.LayoutParams(i5 / length, this.indicatorLineHeight));
            View view2 = new View(getContext());
            int i6 = this.indicatorLineWidth;
            if (i6 <= 0) {
                i6 = -1;
            }
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams(i6, -1));
            Drawable drawable = this.indicatorLineDrawable;
            if (drawable != null) {
                view2.setBackground(drawable);
            } else {
                view2.setBackgroundColor(this.indicatorLineColor);
            }
            this.mIndicatorContainer.addView(view2);
            addView(this.mIndicatorContainer);
            if (this.indicatorWidth > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mIndicatorContainer.getLayoutParams();
                layoutParams.setMarginStart((this.screenWidth - this.indicatorWidth) / 2);
                this.mIndicatorContainer.setLayoutParams(layoutParams);
            }
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.indicatorBottomLineHeight));
        view3.setBackgroundColor(this.indicatorBottomLineColor);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.tvs;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(AbstractC0783a abstractC0783a) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.mViewPager = viewPager;
        viewPager.setId(C2042R.id.view_pager);
        this.mViewPager.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.mViewPager.setAdapter(abstractC0783a);
        this.mViewPager.setCurrentItem(0);
        this.mViewPager.addOnPageChangeListener(this);
        addView(this.mViewPager);
    }

    public EasyIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2042R.attr.EasyIndicatorStyle);
    }

    public EasyIndicator(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.indicatorHeight = 45;
        this.indicatorWidth = -1;
        this.indicatorLineShow = true;
        this.indicatorLineHeight = 3;
        this.indicatorLineWidth = -1;
        this.indicatorBottomLineHeight = 0;
        this.indicatorVerticalLineWidth = 0;
        this.indicatorVerticalLineHeight = 0;
        this.indicatorTextSize = 14.0f;
        this.indicatorSelectTextSize = 14.0f;
        setOrientation(1);
        initScreenWidth();
        init(context, attributeSet, i4);
    }

    public void setViewPager(ViewPager viewPager, AbstractC0783a abstractC0783a) throws Resources.NotFoundException {
        this.mViewPager = viewPager;
        viewPager.setAdapter(abstractC0783a);
        this.mViewPager.setCurrentItem(0);
        this.mViewPager.addOnPageChangeListener(this);
    }
}
