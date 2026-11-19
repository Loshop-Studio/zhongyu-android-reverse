package com.xuexiang.xui.widget.tabbar;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$id;
import io.github.inflationx.calligraphy3.HasTypeface;
import p150k1.AbstractC9051b;

/* loaded from: classes4.dex */
public class EasyIndicator extends LinearLayout implements View.OnClickListener, ViewPager.OnPageChangeListener, HasTypeface {

    /* renamed from: a */
    public LinearLayout f8189a;

    /* renamed from: b */
    public ViewPager f8190b;

    /* renamed from: c */
    public LinearLayout f8191c;

    /* renamed from: d */
    public TextView[] f8192d;

    /* renamed from: e */
    public int f8193e;

    /* renamed from: f */
    public int f8194f;

    /* renamed from: g */
    public int f8195g;

    /* renamed from: h */
    public int f8196h;

    /* renamed from: i */
    public boolean f8197i;

    /* renamed from: j */
    public int f8198j;

    /* renamed from: k */
    public int f8199k;

    /* renamed from: l */
    public int f8200l;

    /* renamed from: m */
    public Drawable f8201m;

    /* renamed from: n */
    public int f8202n;

    /* renamed from: o */
    public int f8203o;

    /* renamed from: p */
    public int f8204p;

    /* renamed from: q */
    public int f8205q;

    /* renamed from: r */
    public int f8206r;

    /* renamed from: s */
    public int f8207s;

    /* renamed from: t */
    public int f8208t;

    /* renamed from: u */
    public float f8209u;

    /* renamed from: v */
    public float f8210v;

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$a */
    public class C7009a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup.LayoutParams f8211a;

        public C7009a(ViewGroup.LayoutParams layoutParams) {
            this.f8211a = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8211a.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            EasyIndicator.this.f8189a.setLayoutParams(this.f8211a);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.tabbar.EasyIndicator$b */
    public interface InterfaceC7010b {
    }

    private void setSelectorColor(TextView textView) {
        for (TextView textView2 : this.f8192d) {
            textView2.setTextColor(this.f8208t);
            textView2.setTextSize(0, this.f8209u);
        }
        textView.setTextColor(this.f8207s);
        textView.setTextSize(0, this.f8210v);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 ??, still in use, count: 4, list:
          (r3v5 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener) from 0x003e: INVOKE (r3v5 ?? I:com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener), true DIRECT call: com.tencent.smtt.audio.core.db.ApnHelper.PlayListApnTypeListener.onResult(boolean):void A[MD:(boolean):void (s)] (LINE:63)
          (r3v5 ?? I:android.animation.AnimatorSet) from 0x0046: INVOKE (r3v5 ?? I:android.animation.AnimatorSet), (r4v3 androidx.interpolator.view.animation.FastOutSlowInInterpolator) VIRTUAL call: android.animation.AnimatorSet.setInterpolator(android.animation.TimeInterpolator):void A[MD:(android.animation.TimeInterpolator):void (c)] (LINE:71)
          (r3v5 ?? I:android.animation.AnimatorSet) from 0x004f: INVOKE (r3v5 ?? I:android.animation.AnimatorSet), (r0v3 android.animation.Animator[]) VIRTUAL call: android.animation.AnimatorSet.playTogether(android.animation.Animator[]):void A[MD:(android.animation.Animator[]):void VARARG (c)] (LINE:80)
          (r3v5 ?? I:android.animation.AnimatorSet) from 0x0052: RETURN (r3v5 ?? I:android.animation.AnimatorSet) (LINE:183)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.animation.AnimatorSet, com.tencent.smtt.audio.core.db.ApnHelper$PlayListApnTypeListener] */
    /* renamed from: b */
    public final android.animation.AnimatorSet m7173b(android.widget.TextView r7) {
        /*
            r6 = this;
            android.widget.LinearLayout r0 = r6.f8191c
            float r0 = r0.getX()
            android.widget.LinearLayout r1 = r6.f8189a
            float r2 = r1.getX()
            float r3 = r7.getX()
            float r3 = r3 + r0
            r0 = 2
            float[] r4 = new float[r0]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r3 = "X"
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r1, r3, r4)
            android.widget.LinearLayout r3 = r6.f8189a
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            int r4 = r3.width
            int r7 = r7.getMeasuredWidth()
            int[] r7 = new int[]{r4, r7}
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofInt(r7)
            com.xuexiang.xui.widget.tabbar.EasyIndicator$a r4 = new com.xuexiang.xui.widget.tabbar.EasyIndicator$a
            r4.<init>(r3)
            r7.addUpdateListener(r4)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.onResult(r0)
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r4 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r4.<init>()
            r3.setInterpolator(r4)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r5] = r1
            r0[r2] = r7
            r3.playTogether(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.tabbar.EasyIndicator.m7173b(android.widget.TextView):android.animation.AnimatorSet");
    }

    public LinearLayout getTabContent() {
        return this.f8191c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        TextView textView = (TextView) view;
        int iIntValue = ((Integer) view.getTag()).intValue();
        ViewPager viewPager = this.f8190b;
        if (viewPager != null) {
            viewPager.setCurrentItem(iIntValue);
            return;
        }
        setSelectorColor(textView);
        if (this.f8197i) {
            m7173b(textView).start();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8189a.getLayoutParams();
        int i12 = this.f8194f;
        if (i12 == i10) {
            layoutParams.setMarginStart((int) ((i12 * this.f8189a.getMeasuredWidth()) + (f10 * this.f8189a.getMeasuredWidth())));
        } else if (i12 > i10) {
            layoutParams.setMarginStart((int) ((i12 * this.f8189a.getMeasuredWidth()) - ((1.0f - f10) * this.f8189a.getMeasuredWidth())));
        }
        this.f8189a.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        this.f8194f = i10;
        setSelectorColor(this.f8192d[i10]);
    }

    public void setOnTabClickListener(InterfaceC7010b interfaceC7010b) {
    }

    public void setTabTitles(String[] strArr) {
        int length;
        this.f8192d = new TextView[strArr.length];
        this.f8191c.removeAllViews();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            TextView textView = new TextView(getContext());
            textView.setTag(Integer.valueOf(i10));
            textView.setText(strArr[i10]);
            textView.setTypeface(AbstractC9051b.m15849d());
            textView.setGravity(17);
            textView.setLayoutParams(new LinearLayout.LayoutParams(0, this.f8195g, 1.0f));
            if (i10 == 0) {
                textView.setTextColor(this.f8207s);
                textView.setTextSize(0, this.f8210v);
            } else {
                textView.setTextColor(this.f8208t);
                textView.setTextSize(0, this.f8209u);
            }
            textView.setOnClickListener(this);
            this.f8192d[i10] = textView;
            this.f8191c.addView(textView);
            if (i10 != strArr.length - 1) {
                View view = new View(getContext());
                view.setBackgroundColor(this.f8206r);
                view.setLayoutParams(new LinearLayoutCompat.LayoutParams(this.f8204p, this.f8205q));
                this.f8191c.addView(view);
            }
        }
        removeAllViews();
        addView(this.f8191c);
        if (this.f8197i) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f8189a = linearLayout;
            linearLayout.setGravity(17);
            int i11 = this.f8196h;
            if (i11 > 0) {
                length = this.f8192d.length;
            } else {
                i11 = this.f8193e;
                length = this.f8192d.length;
            }
            this.f8189a.setLayoutParams(new LinearLayoutCompat.LayoutParams(i11 / length, this.f8198j));
            View view2 = new View(getContext());
            int i12 = this.f8199k;
            if (i12 <= 0) {
                i12 = -1;
            }
            view2.setLayoutParams(new LinearLayoutCompat.LayoutParams(i12, -1));
            Drawable drawable = this.f8201m;
            if (drawable != null) {
                view2.setBackground(drawable);
            } else {
                view2.setBackgroundColor(this.f8200l);
            }
            this.f8189a.addView(view2);
            addView(this.f8189a);
            if (this.f8196h > 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8189a.getLayoutParams();
                layoutParams.setMarginStart((this.f8193e - this.f8196h) / 2);
                this.f8189a.setLayoutParams(layoutParams);
            }
        }
        View view3 = new View(getContext());
        view3.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, this.f8202n));
        view3.setBackgroundColor(this.f8203o);
        addView(view3);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView[] textViewArr = this.f8192d;
        if (textViewArr != null) {
            for (TextView textView : textViewArr) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void setViewPager(PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ViewPager viewPager = new ViewPager(getContext());
        this.f8190b = viewPager;
        viewPager.setId(R$id.view_pager);
        this.f8190b.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -1));
        this.f8190b.setAdapter(pagerAdapter);
        this.f8190b.setCurrentItem(0);
        this.f8190b.addOnPageChangeListener(this);
        addView(this.f8190b);
    }
}
