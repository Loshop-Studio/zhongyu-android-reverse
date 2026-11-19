package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$id;
import io.github.inflationx.calligraphy3.HasTypeface;
import p077j0.AbstractC3799b;

/* loaded from: classes2.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: a */
    public View f3936a;

    /* renamed from: b */
    public ViewPager f3937b;

    /* renamed from: c */
    public LinearLayout f3938c;

    /* renamed from: d */
    public TextView[] f3939d;

    /* renamed from: e */
    public int f3940e;

    /* renamed from: f */
    public int f3941f;

    /* renamed from: g */
    public int f3942g;

    /* renamed from: h */
    public int f3943h;

    /* renamed from: i */
    public boolean f3944i;

    /* renamed from: j */
    public int f3945j;

    /* renamed from: k */
    public int f3946k;

    /* renamed from: l */
    public int f3947l;

    /* renamed from: m */
    public int f3948m;

    /* renamed from: n */
    public int f3949n;

    /* renamed from: o */
    public int f3950o;

    /* renamed from: p */
    public int f3951p;

    /* renamed from: q */
    public int f3952q;

    /* renamed from: r */
    public int f3953r;

    /* renamed from: s */
    public float f3954s;

    /* renamed from: t */
    public float f3955t;

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$a */
    public class C3638a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f3956a;

        public C3638a(ViewGroup.LayoutParams layoutParams) {
            this.f3956a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f3956a.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            EasyIndicator.this.f3936a.setLayoutParams(this.f3956a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$b */
    public interface InterfaceC3639b {
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f3939d) {
            textView2.setTextColor(this.f3953r);
            textView2.setTextSize(0, this.f3954s);
        }
        textView.setTextColor(this.f3952q);
        textView.setTextSize(0, this.f3955t);
    }

    /* renamed from: b */
    public final AnimatorSet m4581b(TextView textView) {
        float x3 = this.f3938c.getX();
        View view = this.f3936a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "X", view.getX(), textView.getX() + x3);
        ViewGroup.LayoutParams layoutParams = this.f3936a.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
        valueAnimatorOfInt.addUpdateListener(new C3638a(layoutParams));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        return animatorSet;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f3937b;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f3944i) {
            m4581b(textView).start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f4, int i5) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3936a.getLayoutParams();
        int i6 = this.f3941f;
        if (i6 == i4) {
            layoutParams.setMarginStart((int) ((i6 * this.f3936a.getMeasuredWidth()) + (f4 * this.f3936a.getMeasuredWidth())));
        } else if (i6 > i4) {
            layoutParams.setMarginStart((int) ((i6 * this.f3936a.getMeasuredWidth()) - ((1.0f - f4) * this.f3936a.getMeasuredWidth())));
        }
        this.f3936a.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        this.f3941f = i4;
        setSelectorColor(this.f3939d[i4]);
    }

    public void setOnTabClickListener(InterfaceC3639b interfaceC3639b) {
    }

    public void setTabTitles(String[] strArr) {
        this.f3939d = new TextView[strArr.length];
        this.f3938c.removeAllViews();
        for (int i4 = 0; i4 < strArr.length; i4++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i4));
            textView.setText(strArr[i4]);
            textView.setTypeface(AbstractC3799b.m4959b());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f3942g, 1.0f));
            if (i4 != 0) {
                textView.setTextColor(this.f3953r);
                textView.setTextSize(0, this.f3954s);
            } else {
                textView.setTextColor(this.f3952q);
                textView.setTextSize(0, this.f3955t);
            }
            textView.setOnClickListener(this);
            this.f3939d[i4] = textView;
            this.f3938c.addView(textView);
            if (i4 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.f3951p);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.f3949n, this.f3950o));
                this.f3938c.addView(view);
            }
        }
        removeAllViews();
        addView(this.f3938c);
        if (this.f3944i) {
            View view2 = new View(getContext());
            this.f3936a = view2;
            int i5 = this.f3943h;
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams((i5 == 0 || i5 == -1) ? this.f3940e / this.f3939d.length : 0, this.f3945j));
            this.f3936a.setBackgroundColor(this.f3946k);
            addView(this.f3936a);
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f3947l));
        view3.setBackgroundColor(this.f3948m);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f3939d;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.f3937b = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f3937b.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f3937b.setAdapter(pagerAdapter);
        this.f3937b.setCurrentItem(0);
        this.f3937b.addOnPageChangeListener(this);
        addView(this.f3937b);
    }
}
