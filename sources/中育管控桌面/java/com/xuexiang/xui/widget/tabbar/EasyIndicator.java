package com.xuexiang.xui.widget.tabbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
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
import p126p1.AbstractC7591b;

/* loaded from: classes3.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: a */
    public LinearLayout f5472a;

    /* renamed from: b */
    public ViewPager f5473b;

    /* renamed from: c */
    public LinearLayout f5474c;

    /* renamed from: d */
    public TextView[] f5475d;

    /* renamed from: e */
    public int f5476e;

    /* renamed from: f */
    public int f5477f;

    /* renamed from: g */
    public int f5478g;

    /* renamed from: h */
    public int f5479h;

    /* renamed from: i */
    public boolean f5480i;

    /* renamed from: j */
    public int f5481j;

    /* renamed from: k */
    public int f5482k;

    /* renamed from: l */
    public int f5483l;

    /* renamed from: m */
    public Drawable f5484m;

    /* renamed from: n */
    public int f5485n;

    /* renamed from: o */
    public int f5486o;

    /* renamed from: p */
    public int f5487p;

    /* renamed from: q */
    public int f5488q;

    /* renamed from: r */
    public int f5489r;

    /* renamed from: s */
    public int f5490s;

    /* renamed from: t */
    public int f5491t;

    /* renamed from: u */
    public float f5492u;

    /* renamed from: v */
    public float f5493v;

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$a */
    public class C5977a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f5494a;

        public C5977a(ViewGroup.LayoutParams layoutParams) {
            this.f5494a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f5494a.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            EasyIndicator.this.f5472a.setLayoutParams(this.f5494a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$b */
    public interface InterfaceC5978b {
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f5475d) {
            textView2.setTextColor(this.f5491t);
            textView2.setTextSize(0, this.f5492u);
        }
        textView.setTextColor(this.f5490s);
        textView.setTextSize(0, this.f5493v);
    }

    /* renamed from: b */
    public final AnimatorSet m4965b(TextView textView) {
        float x6 = this.f5474c.getX();
        LinearLayout linearLayout = this.f5472a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, "X", linearLayout.getX(), textView.getX() + x6);
        ViewGroup.LayoutParams layoutParams = this.f5472a.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
        valueAnimatorOfInt.addUpdateListener(new C5977a(layoutParams));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        return animatorSet;
    }

    public LinearLayout getTabContent() {
        return this.f5474c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f5473b;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f5480i) {
            m4965b(textView).start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i6) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i6, float f6, int i7) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5472a.getLayoutParams();
        int i8 = this.f5477f;
        if (i8 == i6) {
            layoutParams.setMarginStart((int) ((i8 * this.f5472a.getMeasuredWidth()) + (f6 * this.f5472a.getMeasuredWidth())));
        } else if (i8 > i6) {
            layoutParams.setMarginStart((int) ((i8 * this.f5472a.getMeasuredWidth()) - ((1.0f - f6) * this.f5472a.getMeasuredWidth())));
        }
        this.f5472a.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i6) {
        this.f5477f = i6;
        setSelectorColor(this.f5475d[i6]);
    }

    public void setOnTabClickListener(InterfaceC5978b interfaceC5978b) {
    }

    public void setTabTitles(String[] strArr) {
        int length;
        this.f5475d = new TextView[strArr.length];
        this.f5474c.removeAllViews();
        for (int i6 = 0; i6 < strArr.length; i6++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i6));
            textView.setText(strArr[i6]);
            textView.setTypeface(AbstractC7591b.m9000c());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f5478g, 1.0f));
            if (i6 == 0) {
                textView.setTextColor(this.f5490s);
                textView.setTextSize(0, this.f5493v);
            } else {
                textView.setTextColor(this.f5491t);
                textView.setTextSize(0, this.f5492u);
            }
            textView.setOnClickListener(this);
            this.f5475d[i6] = textView;
            this.f5474c.addView(textView);
            if (i6 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.f5489r);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.f5487p, this.f5488q));
                this.f5474c.addView(view);
            }
        }
        removeAllViews();
        addView(this.f5474c);
        if (this.f5480i) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f5472a = linearLayout;
            linearLayout.setGravity(17);
            int i7 = this.f5479h;
            if (i7 > 0) {
                length = this.f5475d.length;
            } else {
                i7 = this.f5476e;
                length = this.f5475d.length;
            }
            this.f5472a.setLayoutParams(new LinearLayoutCompat.LayoutParams(i7 / length, this.f5481j));
            View view2 = new View(getContext());
            int i8 = this.f5482k;
            if (i8 <= 0) {
                i8 = -1;
            }
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams(i8, -1));
            Drawable drawable = this.f5484m;
            if (drawable != null) {
                view2.setBackground(drawable);
            } else {
                view2.setBackgroundColor(this.f5483l);
            }
            this.f5472a.addView(view2);
            addView(this.f5472a);
            if (this.f5479h > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5472a.getLayoutParams();
                layoutParams.setMarginStart((this.f5476e - this.f5479h) / 2);
                this.f5472a.setLayoutParams(layoutParams);
            }
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f5485n));
        view3.setBackgroundColor(this.f5486o);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f5475d;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.f5473b = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f5473b.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f5473b.setAdapter(pagerAdapter);
        this.f5473b.setCurrentItem(0);
        this.f5473b.addOnPageChangeListener(this);
        addView(this.f5473b);
    }
}
