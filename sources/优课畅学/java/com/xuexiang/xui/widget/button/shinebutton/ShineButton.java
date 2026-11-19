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
    public boolean f7297m;

    /* renamed from: n */
    public int f7298n;

    /* renamed from: o */
    public int f7299o;

    /* renamed from: p */
    public ValueAnimator f7300p;

    /* renamed from: q */
    public WeakReference f7301q;

    /* renamed from: r */
    public boolean f7302r;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$a */
    public class C6897a implements ValueAnimator.AnimatorUpdateListener {
        public C6897a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$b */
    public class C6898b extends AnimatorListenerAdapter {
        public C6898b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f7298n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f7297m ? ShineButton.this.f7299o : ShineButton.this.f7298n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f7299o);
        }
    }

    /* renamed from: g */
    public final void m6664g() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.f7300p = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f7300p.setDuration(500L);
        this.f7300p.setStartDelay(180L);
        invalidate();
        this.f7300p.addUpdateListener(new C6897a());
        this.f7300p.addListener(new C6898b());
        this.f7300p.start();
    }

    public int getColor() {
        return this.f7299o;
    }

    public Window getWindow() {
        WeakReference weakReference = this.f7301q;
        if (weakReference != null) {
            return (Window) weakReference.get();
        }
        return null;
    }

    /* renamed from: h */
    public final void m6665h(boolean z10) {
    }

    /* renamed from: i */
    public void m6666i(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7297m;
    }

    /* renamed from: j */
    public void m6667j() {
        setTintColor(this.f7298n);
        ValueAnimator valueAnimator = this.f7300p;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f7300p.cancel();
        }
    }

    /* renamed from: k */
    public final void m6668k(boolean z10, boolean z11, boolean z12) {
        this.f7297m = z10;
        if (z10) {
            setTintColor(this.f7299o);
            this.f7297m = true;
            if (z11) {
                m6669l();
            }
        } else {
            setTintColor(this.f7298n);
            this.f7297m = false;
            if (z11) {
                m6667j();
            }
        }
        if (z12) {
            m6665h(z10);
        }
    }

    /* renamed from: l */
    public void m6669l() {
        if (getWindow() != null) {
            C6899a c6899a = new C6899a(getContext(), this, null);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.f7302r) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(c6899a, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(c6899a, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            m6664g();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        m6668k(z10, false, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
