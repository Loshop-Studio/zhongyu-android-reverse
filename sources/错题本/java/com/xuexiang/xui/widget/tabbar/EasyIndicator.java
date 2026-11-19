package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import io.github.inflationx.calligraphy3.HasTypeface;
import kotlin.collections.AbstractC5806u;
import p136p3.C6363a;
import p136p3.InterfaceC6364b;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: a */
    public View f4901a;

    /* renamed from: b */
    public ViewPager f4902b;

    /* renamed from: c */
    public final LinearLayout f4903c;

    /* renamed from: d */
    public TextView[] f4904d;

    /* renamed from: e */
    public final int f4905e;

    /* renamed from: f */
    public int f4906f;

    /* renamed from: g */
    public final int f4907g;

    /* renamed from: h */
    public final int f4908h;

    /* renamed from: i */
    public final boolean f4909i;

    /* renamed from: j */
    public final int f4910j;

    /* renamed from: k */
    public final int f4911k;

    /* renamed from: l */
    public final int f4912l;

    /* renamed from: m */
    public final int f4913m;

    /* renamed from: n */
    public final float f4914n;

    /* renamed from: o */
    public final float f4915o;

    public EasyIndicator(Context context) {
        this(context, null);
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f4904d) {
            textView2.setTextColor(0);
            textView2.setTextSize(0, this.f4914n);
        }
        textView.setTextColor(this.f4913m);
        textView.setTextSize(0, this.f4915o);
    }

    /* renamed from: a */
    public final float m3582a(TypedArray typedArray, int i, int i8) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId > 0) {
            dimensionPixelSize = typedArray.getResources().getDimensionPixelSize(resourceId);
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, (int) (i8 * getResources().getDisplayMetrics().scaledDensity));
        }
        return dimensionPixelSize;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f4902b;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f4909i) {
            float x3 = this.f4903c.getX();
            View view2 = this.f4901a;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "X", view2.getX(), textView.getX() + x3);
            ViewGroup.LayoutParams layoutParams = this.f4901a.getLayoutParams();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
            valueAnimatorOfInt.addUpdateListener(new C6363a(this, layoutParams));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new FastOutSlowInInterpolator());
            animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
            animatorSet.start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4901a.getLayoutParams();
        int i9 = this.f4906f;
        if (i9 == i) {
            layoutParams.setMarginStart((int) ((f * this.f4901a.getMeasuredWidth()) + (this.f4901a.getMeasuredWidth() * i9)));
        } else if (i9 > i) {
            layoutParams.setMarginStart((int) ((this.f4901a.getMeasuredWidth() * i9) - ((1.0f - f) * this.f4901a.getMeasuredWidth())));
        }
        this.f4901a.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        this.f4906f = i;
        setSelectorColor(this.f4904d[i]);
    }

    public void setTabTitles(String[] strArr) {
        this.f4904d = new TextView[strArr.length];
        this.f4903c.removeAllViews();
        for (int i = 0; i < strArr.length; i++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i));
            textView.setText(strArr[i]);
            AbstractC6582a.m6218b();
            textView.setTypeface(null);
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f4907g, 1.0f));
            if (i != 0) {
                textView.setTextColor(0);
                textView.setTextSize(0, this.f4914n);
            } else {
                textView.setTextColor(this.f4913m);
                textView.setTextSize(0, this.f4915o);
            }
            textView.setOnClickListener(this);
            this.f4904d[i] = textView;
            this.f4903c.addView(textView);
            if (i != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(0);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(0, 0));
                this.f4903c.addView(view);
            }
        }
        removeAllViews();
        addView(this.f4903c);
        if (this.f4909i) {
            View view2 = new View(getContext());
            this.f4901a = view2;
            int i8 = this.f4908h;
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams((i8 == 0 || i8 == -1) ? this.f4905e / this.f4904d.length : 0, this.f4910j));
            this.f4901a.setBackgroundColor(0);
            addView(this.f4901a);
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f4911k));
        view3.setBackgroundColor(this.f4912l);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f4904d;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.f4902b = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f4902b.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f4902b.setAdapter(pagerAdapter);
        this.f4902b.setCurrentItem(0);
        this.f4902b.addOnPageChangeListener(this);
        addView(this.f4902b);
    }

    public EasyIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.EasyIndicatorStyle);
    }

    public EasyIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4907g = 45;
        this.f4908h = -1;
        this.f4909i = true;
        this.f4910j = 3;
        this.f4911k = 0;
        this.f4914n = 14.0f;
        this.f4915o = 14.0f;
        setOrientation(1);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i8 = displayMetrics.heightPixels;
        this.f4905e = displayMetrics.widthPixels;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EasyIndicator, i, 0);
        if (typedArrayObtainStyledAttributes == null) {
            this.f4903c = new LinearLayout(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f4908h, -2);
            this.f4903c.setBackgroundColor(-1);
            layoutParams.gravity = 17;
            this.f4903c.setLayoutParams(layoutParams);
            return;
        }
        this.f4907g = (int) m3582a(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_height, this.f4907g);
        this.f4910j = (int) m3582a(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_line_height, this.f4910j);
        this.f4911k = (int) m3582a(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_bottom_line_height, this.f4911k);
        this.f4912l = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_bottom_line_color, AbstractC5806u.m5252F(getContext(), R$attr.xui_config_color_separator_dark, 0));
        this.f4913m = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_selected_color, AbstractC5806u.m5252F(getContext(), R$attr.colorAccent, 0));
        AbstractC6582a.m6217a();
        throw null;
    }

    public void setOnTabClickListener(InterfaceC6364b interfaceC6364b) {
    }
}
