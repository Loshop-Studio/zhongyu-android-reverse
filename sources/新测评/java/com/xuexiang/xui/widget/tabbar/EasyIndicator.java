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
import p186o2.AbstractC8697b;

/* loaded from: classes4.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: a */
    public LinearLayout f6748a;

    /* renamed from: b */
    public ViewPager f6749b;

    /* renamed from: c */
    public LinearLayout f6750c;

    /* renamed from: d */
    public TextView[] f6751d;

    /* renamed from: e */
    public int f6752e;

    /* renamed from: f */
    public int f6753f;

    /* renamed from: g */
    public int f6754g;

    /* renamed from: h */
    public int f6755h;

    /* renamed from: i */
    public boolean f6756i;

    /* renamed from: j */
    public int f6757j;

    /* renamed from: k */
    public int f6758k;

    /* renamed from: l */
    public int f6759l;

    /* renamed from: m */
    public Drawable f6760m;

    /* renamed from: n */
    public int f6761n;

    /* renamed from: o */
    public int f6762o;

    /* renamed from: p */
    public int f6763p;

    /* renamed from: q */
    public int f6764q;

    /* renamed from: r */
    public int f6765r;

    /* renamed from: s */
    public int f6766s;

    /* renamed from: t */
    public int f6767t;

    /* renamed from: u */
    public float f6768u;

    /* renamed from: v */
    public float f6769v;

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$a */
    public class C6599a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f6770a;

        public C6599a(ViewGroup.LayoutParams layoutParams) {
            this.f6770a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f6770a.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            EasyIndicator.this.f6748a.setLayoutParams(this.f6770a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$b */
    public interface InterfaceC6600b {
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f6751d) {
            textView2.setTextColor(this.f6767t);
            textView2.setTextSize(0, this.f6768u);
        }
        textView.setTextColor(this.f6766s);
        textView.setTextSize(0, this.f6769v);
    }

    /* renamed from: b */
    public final AnimatorSet m5950b(TextView textView) {
        float x9 = this.f6750c.getX();
        LinearLayout linearLayout = this.f6748a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, "X", linearLayout.getX(), textView.getX() + x9);
        ViewGroup.LayoutParams layoutParams = this.f6748a.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
        valueAnimatorOfInt.addUpdateListener(new C6599a(layoutParams));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        return animatorSet;
    }

    public LinearLayout getTabContent() {
        return this.f6750c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f6749b;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f6756i) {
            m5950b(textView).start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6748a.getLayoutParams();
        int i12 = this.f6753f;
        if (i12 == i10) {
            layoutParams.setMarginStart((int) ((i12 * this.f6748a.getMeasuredWidth()) + (f10 * this.f6748a.getMeasuredWidth())));
        } else if (i12 > i10) {
            layoutParams.setMarginStart((int) ((i12 * this.f6748a.getMeasuredWidth()) - ((1.0f - f10) * this.f6748a.getMeasuredWidth())));
        }
        this.f6748a.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        this.f6753f = i10;
        setSelectorColor(this.f6751d[i10]);
    }

    public void setOnTabClickListener(InterfaceC6600b interfaceC6600b) {
    }

    public void setTabTitles(String[] strArr) {
        int length;
        this.f6751d = new TextView[strArr.length];
        this.f6750c.removeAllViews();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i10));
            textView.setText(strArr[i10]);
            textView.setTypeface(AbstractC8697b.m14301c());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f6754g, 1.0f));
            if (i10 == 0) {
                textView.setTextColor(this.f6766s);
                textView.setTextSize(0, this.f6769v);
            } else {
                textView.setTextColor(this.f6767t);
                textView.setTextSize(0, this.f6768u);
            }
            textView.setOnClickListener(this);
            this.f6751d[i10] = textView;
            this.f6750c.addView(textView);
            if (i10 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.f6765r);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.f6763p, this.f6764q));
                this.f6750c.addView(view);
            }
        }
        removeAllViews();
        addView(this.f6750c);
        if (this.f6756i) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f6748a = linearLayout;
            linearLayout.setGravity(17);
            int i11 = this.f6755h;
            if (i11 > 0) {
                length = this.f6751d.length;
            } else {
                i11 = this.f6752e;
                length = this.f6751d.length;
            }
            this.f6748a.setLayoutParams(new LinearLayoutCompat.LayoutParams(i11 / length, this.f6757j));
            View view2 = new View(getContext());
            int i12 = this.f6758k;
            if (i12 <= 0) {
                i12 = -1;
            }
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams(i12, -1));
            Drawable drawable = this.f6760m;
            if (drawable != null) {
                view2.setBackground(drawable);
            } else {
                view2.setBackgroundColor(this.f6759l);
            }
            this.f6748a.addView(view2);
            addView(this.f6748a);
            if (this.f6755h > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6748a.getLayoutParams();
                layoutParams.setMarginStart((this.f6752e - this.f6755h) / 2);
                this.f6748a.setLayoutParams(layoutParams);
            }
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f6761n));
        view3.setBackgroundColor(this.f6762o);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f6751d;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.f6749b = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f6749b.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f6749b.setAdapter(pagerAdapter);
        this.f6749b.setCurrentItem(0);
        this.f6749b.addOnPageChangeListener(this);
        addView(this.f6749b);
    }
}
