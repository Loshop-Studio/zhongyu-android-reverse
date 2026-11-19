package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
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
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import io.github.inflationx.calligraphy3.HasTypeface;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: c */
    public View f17029c;

    /* renamed from: d */
    public ViewPager f17030d;

    /* renamed from: e */
    public LinearLayout f17031e;

    /* renamed from: f */
    public TextView[] f17032f;

    /* renamed from: g */
    public int f17033g;

    /* renamed from: h */
    public int f17034h;

    /* renamed from: i */
    public int f17035i;

    /* renamed from: j */
    public int f17036j;

    /* renamed from: k */
    public int f17037k;

    /* renamed from: l */
    public boolean f17038l;

    /* renamed from: m */
    public int f17039m;

    /* renamed from: n */
    public int f17040n;

    /* renamed from: o */
    public int f17041o;

    /* renamed from: p */
    public int f17042p;

    /* renamed from: q */
    public int f17043q;

    /* renamed from: r */
    public int f17044r;

    /* renamed from: s */
    public int f17045s;

    /* renamed from: t */
    public int f17046t;

    /* renamed from: u */
    public int f17047u;

    /* renamed from: v */
    public float f17048v;

    /* renamed from: w */
    public float f17049w;

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$a */
    public class C8260a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f17050a;

        public C8260a(ViewGroup.LayoutParams layoutParams) {
            this.f17050a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f17050a.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            EasyIndicator.this.f17029c.setLayoutParams(this.f17050a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$b */
    public interface InterfaceC8261b {
    }

    public EasyIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m13269e(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EasyIndicator, i10, 0);
        if (typedArrayObtainStyledAttributes != null) {
            this.f17036j = (int) m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_height, this.f17036j);
            this.f17039m = (int) m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_line_height, this.f17039m);
            this.f17041o = (int) m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_bottom_line_height, this.f17041o);
            this.f17042p = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_bottom_line_color, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_separator_dark));
            this.f17046t = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_selected_color, AbstractC8041g.m12217d(getContext(), R$attr.colorAccent));
            this.f17047u = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_normal_color, AbstractC8040f.m12202c(R$color.xui_config_color_black));
            this.f17040n = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_line_color, AbstractC8041g.m12217d(getContext(), R$attr.colorAccent));
            this.f17048v = m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_textSize, (int) this.f17048v);
            this.f17038l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.EasyIndicator_indicator_line_show, this.f17038l);
            this.f17043q = (int) m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_vertical_line_w, this.f17043q);
            this.f17045s = typedArrayObtainStyledAttributes.getColor(R$styleable.EasyIndicator_indicator_vertical_line_color, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_separator_dark));
            this.f17044r = (int) m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_vertical_line_h, this.f17044r);
            this.f17037k = (int) m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_width, this.f17037k);
            this.f17049w = m13271c(typedArrayObtainStyledAttributes, R$styleable.EasyIndicator_indicator_select_textSize, 14);
            if (this.f17037k == 0) {
                this.f17037k = -1;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f17031e = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f17037k, -2);
        this.f17031e.setBackgroundColor(-1);
        layoutParams.gravity = 17;
        this.f17031e.setLayoutParams(layoutParams);
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f17032f) {
            textView2.setTextColor(this.f17047u);
            textView2.setTextSize(0, this.f17048v);
        }
        textView.setTextColor(this.f17046t);
        textView.setTextSize(0, this.f17049w);
    }

    /* renamed from: b */
    public final AnimatorSet m13270b(TextView textView) {
        float x10 = this.f17031e.getX();
        View view = this.f17029c;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "X", view.getX(), textView.getX() + x10);
        ViewGroup.LayoutParams layoutParams = this.f17029c.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
        valueAnimatorOfInt.addUpdateListener(new C8260a(layoutParams));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        return animatorSet;
    }

    /* renamed from: c */
    public final float m13271c(TypedArray typedArray, int i10, int i11) {
        return typedArray.getResourceId(i10, 0) > 0 ? typedArray.getResources().getDimensionPixelSize(r0) : typedArray.getDimensionPixelSize(i10, (int) m13272d(i11));
    }

    /* renamed from: d */
    public final float m13272d(int i10) {
        return i10 * getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: f */
    public final void m13273f() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f17034h = displayMetrics.heightPixels;
        this.f17033g = displayMetrics.widthPixels;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f17030d;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f17038l) {
            m13270b(textView).start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17029c.getLayoutParams();
        int i12 = this.f17035i;
        if (i12 == i10) {
            layoutParams.setMarginStart((int) ((i12 * this.f17029c.getMeasuredWidth()) + (f10 * this.f17029c.getMeasuredWidth())));
        } else if (i12 > i10) {
            layoutParams.setMarginStart((int) ((i12 * this.f17029c.getMeasuredWidth()) - ((1.0f - f10) * this.f17029c.getMeasuredWidth())));
        }
        this.f17029c.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        this.f17035i = i10;
        setSelectorColor(this.f17032f[i10]);
    }

    public void setOnTabClickListener(InterfaceC8261b interfaceC8261b) {
    }

    public void setTabTitles(String[] strArr) {
        this.f17032f = new TextView[strArr.length];
        this.f17031e.removeAllViews();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i10));
            textView.setText(strArr[i10]);
            textView.setTypeface(AbstractC11916b.m26459c());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f17036j, 1.0f));
            if (i10 != 0) {
                textView.setTextColor(this.f17047u);
                textView.setTextSize(0, this.f17048v);
            } else {
                textView.setTextColor(this.f17046t);
                textView.setTextSize(0, this.f17049w);
            }
            textView.setOnClickListener(this);
            this.f17032f[i10] = textView;
            this.f17031e.addView(textView);
            if (i10 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.f17045s);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.f17043q, this.f17044r));
                this.f17031e.addView(view);
            }
        }
        removeAllViews();
        addView(this.f17031e);
        if (this.f17038l) {
            View view2 = new View(getContext());
            this.f17029c = view2;
            int i11 = this.f17037k;
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams((i11 == 0 || i11 == -1) ? this.f17033g / this.f17032f.length : 0, this.f17039m));
            this.f17029c.setBackgroundColor(this.f17040n);
            addView(this.f17029c);
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f17041o));
        view3.setBackgroundColor(this.f17042p);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f17032f;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) {
        ViewPager viewPager = new ViewPager(getContext());
        this.f17030d = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f17030d.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f17030d.setAdapter(pagerAdapter);
        this.f17030d.setCurrentItem(0);
        this.f17030d.addOnPageChangeListener(this);
        addView(this.f17030d);
    }

    public EasyIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.EasyIndicatorStyle);
    }

    public EasyIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17036j = 45;
        this.f17037k = -1;
        this.f17038l = true;
        this.f17039m = 3;
        this.f17041o = 0;
        this.f17043q = 0;
        this.f17044r = 0;
        this.f17048v = 14.0f;
        this.f17049w = 14.0f;
        setOrientation(1);
        m13273f();
        m13269e(context, attributeSet, i10);
    }
}
