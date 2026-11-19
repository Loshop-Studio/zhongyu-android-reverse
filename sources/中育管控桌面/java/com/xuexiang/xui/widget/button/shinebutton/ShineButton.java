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

/* loaded from: classes3.dex */
public class ShineButton extends PorterShapeImageView implements Checkable {

    /* renamed from: m */
    public boolean f4696m;

    /* renamed from: n */
    public int f4697n;

    /* renamed from: o */
    public int f4698o;

    /* renamed from: p */
    public ValueAnimator f4699p;

    /* renamed from: q */
    public WeakReference f4700q;

    /* renamed from: r */
    public boolean f4701r;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$a */
    public class C5876a implements ValueAnimator.AnimatorUpdateListener {
        public C5876a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$b */
    public class C5877b extends AnimatorListenerAdapter {
        public C5877b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f4697n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f4696m ? ShineButton.this.f4698o : ShineButton.this.f4697n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f4698o);
        }
    }

    /* renamed from: g */
    public final void m4553g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.f4699p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f4699p.setDuration(500L);
        this.f4699p.setStartDelay(180L);
        invalidate();
        this.f4699p.addUpdateListener(new C5876a());
        this.f4699p.addListener(new C5877b());
        this.f4699p.start();
    }

    public int getColor() {
        return this.f4698o;
    }

    public Window getWindow() {
        WeakReference weakReference = this.f4700q;
        if (weakReference != null) {
            return (Window) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public final void m4554h(boolean z6) {
    }

    /* renamed from: i */
    public void m4555i(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4696m;
    }

    /* renamed from: j */
    public void m4556j() {
        setTintColor(this.f4697n);
        ValueAnimator valueAnimator = this.f4699p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f4699p.cancel();
        }
    }

    /* renamed from: k */
    public final void m4557k(boolean z6, boolean z7, boolean z8) {
        this.f4696m = z6;
        if (z6) {
            setTintColor(this.f4698o);
            this.f4696m = true;
            if (z7) {
                m4558l();
            }
        } else {
            setTintColor(this.f4697n);
            this.f4696m = false;
            if (z7) {
                m4556j();
            }
        }
        if (z8) {
            m4554h(z6);
        }
    }

    /* renamed from: l */
    public void m4558l() {
        if (getWindow() != null) {
            C5878a c5878a = new C5878a(getContext(), this, null);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.f4701r) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(c5878a, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(c5878a, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            m4553g();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        m4557k(z6, false, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
