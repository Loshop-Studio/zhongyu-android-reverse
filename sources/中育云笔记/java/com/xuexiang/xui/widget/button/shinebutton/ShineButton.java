package com.xuexiang.xui.widget.button.shinebutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.Checkable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.button.shinebutton.ShineView;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class ShineButton extends PorterShapeImageView implements Checkable {

    /* renamed from: o */
    public boolean f15672o;

    /* renamed from: p */
    public int f15673p;

    /* renamed from: q */
    public int f15674q;

    /* renamed from: r */
    public ValueAnimator f15675r;

    /* renamed from: s */
    public ShineView.C8091e f15676s;

    /* renamed from: t */
    public WeakReference f15677t;

    /* renamed from: u */
    public boolean f15678u;

    /* renamed from: v */
    public ViewOnClickListenerC8086c f15679v;

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$a */
    public class C8084a implements ValueAnimator.AnimatorUpdateListener {
        public C8084a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ShineButton.this.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            ShineButton.this.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$b */
    public class C8085b extends AnimatorListenerAdapter {
        public C8085b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f15673p);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f15672o ? ShineButton.this.f15674q : ShineButton.this.f15673p);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ShineButton shineButton = ShineButton.this;
            shineButton.setTintColor(shineButton.f15674q);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.ShineButton$c */
    public class ViewOnClickListenerC8086c implements View.OnClickListener {

        /* renamed from: c */
        public View.OnClickListener f15682c;

        public ViewOnClickListenerC8086c() {
        }

        /* renamed from: a */
        public void m12500a(View.OnClickListener onClickListener) {
            this.f15682c = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ShineButton.this.f15672o) {
                ShineButton.this.f15672o = false;
                ShineButton.this.m12497q();
            } else {
                ShineButton.this.f15672o = true;
                ShineButton.this.m12499s();
            }
            ShineButton shineButton = ShineButton.this;
            shineButton.m12495o(shineButton.f15672o);
            View.OnClickListener onClickListener = this.f15682c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public ShineButton(Context context) {
        this(context, null);
    }

    public int getColor() {
        return this.f15674q;
    }

    public Window getWindow() {
        WeakReference weakReference = this.f15677t;
        if (weakReference != null) {
            return (Window) weakReference.get();
        }
        return null;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f15672o;
    }

    /* renamed from: k */
    public final void m12491k() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.4f, 1.0f, 0.9f, 1.0f);
        this.f15675r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.f15675r.setDuration(500L);
        this.f15675r.setStartDelay(180L);
        invalidate();
        this.f15675r.addUpdateListener(new C8084a());
        this.f15675r.addListener(new C8085b());
        this.f15675r.start();
    }

    /* renamed from: l */
    public final void m12492l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ShineButton);
        this.f15673p = typedArrayObtainStyledAttributes.getColor(R$styleable.ShineButton_sb_normal_color, AbstractC8040f.m12202c(R$color.default_sb_normal_color));
        this.f15674q = typedArrayObtainStyledAttributes.getColor(R$styleable.ShineButton_sb_checked_color, AbstractC8041g.m12217d(context, R$attr.colorAccent));
        this.f15676s.f15718a = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShineButton_sb_allow_random_color, false);
        this.f15676s.f15719b = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShineButton_sb_shine_animation_duration, (int) r0.f15719b);
        this.f15676s.f15721d = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShineButton_sb_click_animation_duration, (int) r0.f15721d);
        this.f15676s.f15722e = typedArrayObtainStyledAttributes.getBoolean(R$styleable.ShineButton_sb_enable_flashing, false);
        ShineView.C8091e c8091e = this.f15676s;
        c8091e.f15725h = typedArrayObtainStyledAttributes.getFloat(R$styleable.ShineButton_sb_shine_distance_multiple, c8091e.f15725h);
        ShineView.C8091e c8091e2 = this.f15676s;
        c8091e2.f15723f = typedArrayObtainStyledAttributes.getInteger(R$styleable.ShineButton_sb_shine_count, c8091e2.f15723f);
        ShineView.C8091e c8091e3 = this.f15676s;
        c8091e3.f15728k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ShineButton_sb_shine_size, c8091e3.f15728k);
        ShineView.C8091e c8091e4 = this.f15676s;
        c8091e4.f15724g = typedArrayObtainStyledAttributes.getFloat(R$styleable.ShineButton_sb_shine_turn_angle, c8091e4.f15724g);
        ShineView.C8091e c8091e5 = this.f15676s;
        c8091e5.f15726i = typedArrayObtainStyledAttributes.getFloat(R$styleable.ShineButton_sb_small_shine_offset_angle, c8091e5.f15726i);
        ShineView.C8091e c8091e6 = this.f15676s;
        c8091e6.f15727j = typedArrayObtainStyledAttributes.getColor(R$styleable.ShineButton_sb_small_shine_color, c8091e6.f15727j);
        ShineView.C8091e c8091e7 = this.f15676s;
        c8091e7.f15720c = typedArrayObtainStyledAttributes.getColor(R$styleable.ShineButton_sb_big_shine_color, c8091e7.f15720c);
        typedArrayObtainStyledAttributes.recycle();
        setTintColor(this.f15673p);
        if (context instanceof Activity) {
            m12493m((Activity) context);
        }
    }

    /* renamed from: m */
    public void m12493m(Activity activity) {
        m12494n(activity.getWindow());
        this.f15678u = false;
    }

    /* renamed from: n */
    public void m12494n(Window window) {
        this.f15677t = new WeakReference(window);
        ViewOnClickListenerC8086c viewOnClickListenerC8086c = new ViewOnClickListenerC8086c();
        this.f15679v = viewOnClickListenerC8086c;
        setOnClickListener(viewOnClickListenerC8086c);
    }

    /* renamed from: o */
    public final void m12495o(boolean z10) {
    }

    /* renamed from: p */
    public void m12496p(View view) {
        if (getWindow() != null) {
            ((ViewGroup) getWindow().findViewById(R.id.content)).removeView(view);
        }
    }

    /* renamed from: q */
    public void m12497q() {
        setTintColor(this.f15673p);
        ValueAnimator valueAnimator = this.f15675r;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f15675r.cancel();
        }
    }

    /* renamed from: r */
    public final void m12498r(boolean z10, boolean z11, boolean z12) {
        this.f15672o = z10;
        if (z10) {
            setTintColor(this.f15674q);
            this.f15672o = true;
            if (z11) {
                m12499s();
            }
        } else {
            setTintColor(this.f15673p);
            this.f15672o = false;
            if (z11) {
                m12497q();
            }
        }
        if (z12) {
            m12495o(z10);
        }
    }

    /* renamed from: s */
    public void m12499s() {
        if (getWindow() != null) {
            ShineView shineView = new ShineView(getContext(), this, this.f15676s);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            if (this.f15678u) {
                View viewFindViewById = viewGroup.findViewById(R.id.content);
                viewGroup.addView(shineView, new ViewGroup.LayoutParams(viewFindViewById.getWidth(), viewFindViewById.getHeight()));
            } else {
                viewGroup.addView(shineView, new ViewGroup.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
            }
            m12491k();
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        m12498r(z10, false, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener instanceof ViewOnClickListenerC8086c) {
            super.setOnClickListener(onClickListener);
            return;
        }
        ViewOnClickListenerC8086c viewOnClickListenerC8086c = this.f15679v;
        if (viewOnClickListenerC8086c != null) {
            viewOnClickListenerC8086c.m12500a(onClickListener);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public ShineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ShineButtonStyle);
    }

    public ShineButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f15672o = false;
        this.f15676s = new ShineView.C8091e();
        m12492l(context, attributeSet);
    }
}
