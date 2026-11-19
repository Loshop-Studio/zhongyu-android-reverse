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
    public boolean f7227m;

    /* renamed from: n */
    public int f7228n;

    /* renamed from: o */
    public int f7229o;

    /* renamed from: p */
    public ValueAnimator f7230p;

    /* renamed from: q */
    public WeakReference f7231q;

    /* renamed from: r */
    public boolean f7232r;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$a */
    public class C6817a implements ValueAnimator.AnimatorUpdateListener {
        public C6817a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$b */
    public class C6818b extends AnimatorListenerAdapter {
        public C6818b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f7228n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f7227m ? ShineButton.this.f7229o : ShineButton.this.f7228n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f7229o);
        }
    }

    /* renamed from: g */
    public final void m6639g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.f7230p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f7230p.setDuration(500L);
        this.f7230p.setStartDelay(180L);
        invalidate();
        this.f7230p.addUpdateListener(new C6817a());
        this.f7230p.addListener(new C6818b());
        this.f7230p.start();
    }

    public int getColor() {
        return this.f7229o;
    }

    public Window getWindow() {
        WeakReference weakReference = this.f7231q;
        if (weakReference != null) {
            return (Window) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public final void m6640h(boolean z9) {
    }

    /* renamed from: i */
    public void m6641i(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7227m;
    }

    /* renamed from: j */
    public void m6642j() {
        setTintColor(this.f7228n);
        ValueAnimator valueAnimator = this.f7230p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f7230p.cancel();
        }
    }

    /* renamed from: k */
    public final void m6643k(boolean z9, boolean z10, boolean z11) {
        this.f7227m = z9;
        if (z9) {
            setTintColor(this.f7229o);
            this.f7227m = true;
            if (z10) {
                m6644l();
            }
        } else {
            setTintColor(this.f7228n);
            this.f7227m = false;
            if (z10) {
                m6642j();
            }
        }
        if (z11) {
            m6640h(z9);
        }
    }

    /* renamed from: l */
    public void m6644l() {
        if (getWindow() != null) {
            C6819a c6819a = new C6819a(getContext(), this, null);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.f7232r) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(c6819a, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(c6819a, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            m6639g();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        m6643k(z9, false, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
