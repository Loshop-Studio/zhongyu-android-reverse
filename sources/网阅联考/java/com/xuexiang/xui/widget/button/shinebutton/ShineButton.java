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

/* loaded from: classes2.dex */
public class ShineButton extends PorterShapeImageView implements Checkable {

    /* renamed from: m */
    public boolean f3312m;

    /* renamed from: n */
    public int f3313n;

    /* renamed from: o */
    public int f3314o;

    /* renamed from: p */
    public ValueAnimator f3315p;

    /* renamed from: q */
    public WeakReference f3316q;

    /* renamed from: r */
    public boolean f3317r;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$a */
    public class C3547a implements ValueAnimator.AnimatorUpdateListener {
        public C3547a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$b */
    public class C3548b extends AnimatorListenerAdapter {
        public C3548b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f3313n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f3312m ? ShineButton.this.f3314o : ShineButton.this.f3313n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f3314o);
        }
    }

    /* renamed from: g */
    public final void m4229g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.f3315p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f3315p.setDuration(500L);
        this.f3315p.setStartDelay(180L);
        invalidate();
        this.f3315p.addUpdateListener(new C3547a());
        this.f3315p.addListener(new C3548b());
        this.f3315p.start();
    }

    public int getColor() {
        return this.f3314o;
    }

    public Window getWindow() {
        WeakReference weakReference = this.f3316q;
        if (weakReference != null) {
            return (Window) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public final void m4230h(boolean z3) {
    }

    /* renamed from: i */
    public void m4231i(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3312m;
    }

    /* renamed from: j */
    public void m4232j() {
        setTintColor(this.f3313n);
        ValueAnimator valueAnimator = this.f3315p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f3315p.cancel();
        }
    }

    /* renamed from: k */
    public final void m4233k(boolean z3, boolean z4, boolean z5) {
        this.f3312m = z3;
        if (z3) {
            setTintColor(this.f3314o);
            this.f3312m = true;
            if (z4) {
                m4234l();
            }
        } else {
            setTintColor(this.f3313n);
            this.f3312m = false;
            if (z4) {
                m4232j();
            }
        }
        if (z5) {
            m4230h(z3);
        }
    }

    /* renamed from: l */
    public void m4234l() {
        if (getWindow() != null) {
            C3549a c3549a = new C3549a(getContext(), this, null);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.f3317r) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(c3549a, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(c3549a, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            m4229g();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        m4233k(z3, false, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
