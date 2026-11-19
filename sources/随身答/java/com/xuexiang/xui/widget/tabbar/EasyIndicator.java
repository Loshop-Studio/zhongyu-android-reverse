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
import p093e3.AbstractC7843b;

/* loaded from: classes4.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: a */
    public View f8006a;

    /* renamed from: b */
    public ViewPager f8007b;

    /* renamed from: c */
    public LinearLayout f8008c;

    /* renamed from: d */
    public TextView[] f8009d;

    /* renamed from: e */
    public int f8010e;

    /* renamed from: f */
    public int f8011f;

    /* renamed from: g */
    public int f8012g;

    /* renamed from: h */
    public int f8013h;

    /* renamed from: i */
    public boolean f8014i;

    /* renamed from: j */
    public int f8015j;

    /* renamed from: k */
    public int f8016k;

    /* renamed from: l */
    public int f8017l;

    /* renamed from: m */
    public int f8018m;

    /* renamed from: n */
    public int f8019n;

    /* renamed from: o */
    public int f8020o;

    /* renamed from: p */
    public int f8021p;

    /* renamed from: q */
    public int f8022q;

    /* renamed from: r */
    public int f8023r;

    /* renamed from: s */
    public float f8024s;

    /* renamed from: t */
    public float f8025t;

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$a */
    public class C6919a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f8026a;

        public C6919a(ViewGroup.LayoutParams layoutParams) {
            this.f8026a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8026a.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            EasyIndicator.this.f8006a.setLayoutParams(this.f8026a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$b */
    public interface InterfaceC6920b {
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f8009d) {
            textView2.setTextColor(this.f8023r);
            textView2.setTextSize(0, this.f8024s);
        }
        textView.setTextColor(this.f8022q);
        textView.setTextSize(0, this.f8025t);
    }

    /* renamed from: b */
    public final AnimatorSet m7048b(TextView textView) {
        float x9 = this.f8008c.getX();
        View view = this.f8006a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "X", view.getX(), textView.getX() + x9);
        ViewGroup.LayoutParams layoutParams = this.f8006a.getLayoutParams();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layoutParams.width, textView.getMeasuredWidth());
        valueAnimatorOfInt.addUpdateListener(new C6919a(layoutParams));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
        return animatorSet;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f8007b;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f8014i) {
            m7048b(textView).start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i9) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i9, float f10, int i10) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8006a.getLayoutParams();
        int i11 = this.f8011f;
        if (i11 == i9) {
            layoutParams.setMarginStart((int) ((i11 * this.f8006a.getMeasuredWidth()) + (f10 * this.f8006a.getMeasuredWidth())));
        } else if (i11 > i9) {
            layoutParams.setMarginStart((int) ((i11 * this.f8006a.getMeasuredWidth()) - ((1.0f - f10) * this.f8006a.getMeasuredWidth())));
        }
        this.f8006a.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i9) {
        this.f8011f = i9;
        setSelectorColor(this.f8009d[i9]);
    }

    public void setOnTabClickListener(InterfaceC6920b interfaceC6920b) {
    }

    public void setTabTitles(String[] strArr) {
        this.f8009d = new TextView[strArr.length];
        this.f8008c.removeAllViews();
        for (int i9 = 0; i9 < strArr.length; i9++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i9));
            textView.setText(strArr[i9]);
            textView.setTypeface(AbstractC7843b.m12292c());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f8012g, 1.0f));
            if (i9 != 0) {
                textView.setTextColor(this.f8023r);
                textView.setTextSize(0, this.f8024s);
            } else {
                textView.setTextColor(this.f8022q);
                textView.setTextSize(0, this.f8025t);
            }
            textView.setOnClickListener(this);
            this.f8009d[i9] = textView;
            this.f8008c.addView(textView);
            if (i9 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.f8021p);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.f8019n, this.f8020o));
                this.f8008c.addView(view);
            }
        }
        removeAllViews();
        addView(this.f8008c);
        if (this.f8014i) {
            View view2 = new View(getContext());
            this.f8006a = view2;
            int i10 = this.f8013h;
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams((i10 == 0 || i10 == -1) ? this.f8010e / this.f8009d.length : 0, this.f8015j));
            this.f8006a.setBackgroundColor(this.f8016k);
            addView(this.f8006a);
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f8017l));
        view3.setBackgroundColor(this.f8018m);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f8009d;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.f8007b = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f8007b.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f8007b.setAdapter(pagerAdapter);
        this.f8007b.setCurrentItem(0);
        this.f8007b.addOnPageChangeListener(this);
        addView(this.f8007b);
    }
}
