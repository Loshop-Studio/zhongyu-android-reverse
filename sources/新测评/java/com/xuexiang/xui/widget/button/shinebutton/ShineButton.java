package com.xuexiang.xui.widget.button.shinebutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class ShineButton extends PorterShapeImageView implements Checkable {

    /* renamed from: m */
    public boolean f5972m;

    /* renamed from: n */
    public int f5973n;

    /* renamed from: o */
    public int f5974o;

    /* renamed from: p */
    public ValueAnimator f5975p;

    /* renamed from: q */
    public WeakReference f5976q;

    /* renamed from: r */
    public boolean f5977r;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$a */
    public class C6498a implements ValueAnimator.AnimatorUpdateListener {
        public C6498a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$b */
    public class C6499b extends AnimatorListenerAdapter {
        public C6499b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f5973n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f5972m ? ShineButton.this.f5974o : ShineButton.this.f5973n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f5974o);
        }
    }

    /* renamed from: g */
    public final void m5543g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.f5975p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f5975p.setDuration(500L);
        this.f5975p.setStartDelay(180L);
        invalidate();
        this.f5975p.addUpdateListener(new C6498a());
        this.f5975p.addListener(new C6499b());
        this.f5975p.start();
    }

    public int getColor() {
        return this.f5974o;
    }

    public Window getWindow() {
        WeakReference weakReference = this.f5976q;
        if (weakReference != null) {
            return (Window) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public final void m5544h(boolean z9) {
    }

    /* renamed from: i */
    public void m5545i(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5972m;
    }

    /* renamed from: j */
    public void m5546j() {
        setTintColor(this.f5973n);
        ValueAnimator valueAnimator = this.f5975p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f5975p.cancel();
        }
    }

    /* renamed from: k */
    public final void m5547k(boolean z9, boolean z10, boolean z11) {
        this.f5972m = z9;
        if (z9) {
            setTintColor(this.f5974o);
            this.f5972m = true;
            if (z10) {
                m5548l();
            }
        } else {
            setTintColor(this.f5973n);
            this.f5972m = false;
            if (z10) {
                m5546j();
            }
        }
        if (z11) {
            m5544h(z9);
        }
    }

    /* renamed from: l */
    public void m5548l() {
        if (getWindow() != null) {
            C6500a c6500a = new C6500a(getContext(), this, null);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.f5977r) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(c6500a, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(c6500a, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            m5543g();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        m5547k(z9, false, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
