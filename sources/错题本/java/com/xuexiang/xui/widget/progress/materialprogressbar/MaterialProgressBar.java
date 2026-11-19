package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.motion.widget.Key;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;

/* loaded from: classes3.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: a */
    public final boolean f4725a;

    /* renamed from: b */
    public int f4726b;

    /* renamed from: c */
    public final C4202s f4727c;

    public MaterialProgressBar(Context context) {
        super(context);
        this.f4725a = true;
        this.f4727c = new C4202s();
        m3551g(null, 0);
    }

    /* renamed from: a */
    public final void m3545a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C4202s c4202s = this.f4727c;
        if (c4202s.f4796o || c4202s.f4797p) {
            indeterminateDrawable.mutate();
            m3549e(indeterminateDrawable, c4202s.f4794m, c4202s.f4796o, c4202s.f4795n, c4202s.f4797p);
        }
    }

    /* renamed from: b */
    public final void m3546b() {
        Drawable drawableM3550f;
        if (getProgressDrawable() == null) {
            return;
        }
        C4202s c4202s = this.f4727c;
        if ((c4202s.f4784c || c4202s.f4785d) && (drawableM3550f = m3550f(R.id.progress, true)) != null) {
            m3549e(drawableM3550f, c4202s.f4782a, c4202s.f4784c, c4202s.f4783b, c4202s.f4785d);
        }
    }

    /* renamed from: c */
    public final void m3547c() {
        Drawable drawableM3550f;
        if (getProgressDrawable() == null) {
            return;
        }
        C4202s c4202s = this.f4727c;
        if ((c4202s.f4792k || c4202s.f4793l) && (drawableM3550f = m3550f(R.id.background, false)) != null) {
            m3549e(drawableM3550f, c4202s.f4790i, c4202s.f4792k, c4202s.f4791j, c4202s.f4793l);
        }
    }

    /* renamed from: d */
    public final void m3548d() {
        Drawable drawableM3550f;
        if (getProgressDrawable() == null) {
            return;
        }
        C4202s c4202s = this.f4727c;
        if ((c4202s.f4788g || c4202s.f4789h) && (drawableM3550f = m3550f(R.id.secondaryProgress, false)) != null) {
            m3549e(drawableM3550f, c4202s.f4786e, c4202s.f4788g, c4202s.f4787f, c4202s.f4789h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m3549e(Drawable drawable, ColorStateList colorStateList, boolean z8, PorterDuff.Mode mode, boolean z9) {
        if (z8 || z9) {
            if (z8) {
                if (drawable instanceof InterfaceC4206w) {
                    ((InterfaceC4206w) drawable).setTintList(colorStateList);
                } else {
                    Log.w("MaterialProgressBar", "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable.setTintList(colorStateList);
                }
            }
            if (z9) {
                if (drawable instanceof InterfaceC4206w) {
                    ((InterfaceC4206w) drawable).setTintMode(mode);
                } else {
                    Log.w("MaterialProgressBar", "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: f */
    public final Drawable m3550f(int i, boolean z8) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i) : null;
        return (drawableFindDrawableByLayerId == null && z8) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: g */
    public final void m3551g(AttributeSet attributeSet, int i) {
        boolean z8;
        boolean z9;
        int i8;
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i, 0);
        this.f4726b = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z10 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z11 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z12 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f4726b == 1);
        int i9 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        boolean zHasValue = tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTint);
        C4202s c4202s = this.f4727c;
        if (zHasValue) {
            c4202s.f4782a = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressTint);
            c4202s.f4784c = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTintMode)) {
            c4202s.f4783b = AbstractC5806u.m5249C(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressTintMode, -1));
            c4202s.f4785d = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            c4202s.f4786e = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint);
            c4202s.f4788g = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            c4202s.f4787f = AbstractC5806u.m5249C(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1));
            c4202s.f4789h = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            c4202s.f4790i = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint);
            c4202s.f4792k = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            c4202s.f4791j = AbstractC5806u.m5249C(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1));
            c4202s.f4793l = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            c4202s.f4794m = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_indeterminateTint);
            c4202s.f4796o = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            c4202s.f4795n = AbstractC5806u.m5249C(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1));
            c4202s.f4797p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i10 = this.f4726b;
        if (i10 == 0) {
            z8 = z12;
            if (isIndeterminate() || z10) {
                C4192i c4192i = new C4192i(context);
                IndeterminateCircularProgressDrawable$RingPathTransform indeterminateCircularProgressDrawable$RingPathTransform = new IndeterminateCircularProgressDrawable$RingPathTransform();
                c4192i.f4762l = indeterminateCircularProgressDrawable$RingPathTransform;
                IndeterminateCircularProgressDrawable$RingRotation indeterminateCircularProgressDrawable$RingRotation = new IndeterminateCircularProgressDrawable$RingRotation();
                c4192i.f4763m = indeterminateCircularProgressDrawable$RingRotation;
                float f = context.getResources().getDisplayMetrics().density;
                c4192i.f4760j = Math.round(42.0f * f);
                c4192i.f4761k = Math.round(f * 48.0f);
                Path path = AbstractC4184a.f4728a;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(indeterminateCircularProgressDrawable$RingPathTransform, "trimPathStart", 0.0f, 0.75f);
                objectAnimatorOfFloat.setDuration(1333L);
                objectAnimatorOfFloat.setInterpolator(AbstractC4200q.f4781a);
                objectAnimatorOfFloat.setRepeatCount(-1);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(indeterminateCircularProgressDrawable$RingPathTransform, "trimPathEnd", 0.0f, 0.75f);
                objectAnimatorOfFloat2.setDuration(1333L);
                objectAnimatorOfFloat2.setInterpolator(AbstractC4199p.f4780a);
                objectAnimatorOfFloat2.setRepeatCount(-1);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(indeterminateCircularProgressDrawable$RingPathTransform, "trimPathOffset", 0.0f, 0.25f);
                objectAnimatorOfFloat3.setDuration(1333L);
                LinearInterpolator linearInterpolator = AbstractC4198o.f4779a;
                objectAnimatorOfFloat3.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat3.setRepeatCount(-1);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(indeterminateCircularProgressDrawable$RingRotation, Key.ROTATION, 0.0f, 720.0f);
                objectAnimatorOfFloat4.setDuration(6665L);
                objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
                objectAnimatorOfFloat4.setRepeatCount(-1);
                c4192i.f4734i = new Animator[]{animatorSet, objectAnimatorOfFloat4};
                setIndeterminateDrawable(c4192i);
            }
            if (!isIndeterminate() || z10) {
                C4189f c4189f = new C4189f();
                c4189f.f4746l = true;
                setProgressDrawable(new C4190g(new Drawable[]{c4189f, new C4205v(i9), new C4205v(i9)}, context));
            }
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f4726b);
            }
            if (isIndeterminate() || z10) {
                C4193j c4193j = new C4193j(context);
                c4193j.f4771l = true;
                IndeterminateHorizontalProgressDrawable$RectTransformX indeterminateHorizontalProgressDrawable$RectTransformX = new IndeterminateHorizontalProgressDrawable$RectTransformX(C4193j.f4767s);
                c4193j.f4773n = indeterminateHorizontalProgressDrawable$RectTransformX;
                IndeterminateHorizontalProgressDrawable$RectTransformX indeterminateHorizontalProgressDrawable$RectTransformX2 = new IndeterminateHorizontalProgressDrawable$RectTransformX(C4193j.f4768t);
                c4193j.f4774o = indeterminateHorizontalProgressDrawable$RectTransformX2;
                float f7 = context.getResources().getDisplayMetrics().density;
                c4193j.f4769j = Math.round(4.0f * f7);
                c4193j.f4770k = Math.round(f7 * 16.0f);
                c4193j.f4772m = AbstractC5806u.m5254H(context, R.attr.disabledAlpha, 0.0f);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(indeterminateHorizontalProgressDrawable$RectTransformX, "translateX", (String) null, AbstractC4184a.f4728a);
                z9 = true;
                z8 = z12;
                objectAnimatorOfFloat5.setDuration(2000L);
                objectAnimatorOfFloat5.setInterpolator(AbstractC4195l.f4776a);
                objectAnimatorOfFloat5.setRepeatCount(-1);
                i8 = 0;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(indeterminateHorizontalProgressDrawable$RectTransformX, (String) null, "scaleX", AbstractC4184a.f4729b);
                objectAnimatorOfFloat6.setDuration(2000L);
                objectAnimatorOfFloat6.setInterpolator(AbstractC4194k.f4775a);
                objectAnimatorOfFloat6.setRepeatCount(-1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6);
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(indeterminateHorizontalProgressDrawable$RectTransformX2, "translateX", (String) null, AbstractC4184a.f4730c);
                objectAnimatorOfFloat7.setDuration(2000L);
                objectAnimatorOfFloat7.setInterpolator(AbstractC4197n.f4778a);
                objectAnimatorOfFloat7.setRepeatCount(-1);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(indeterminateHorizontalProgressDrawable$RectTransformX2, (String) null, "scaleX", AbstractC4184a.f4731d);
                objectAnimatorOfFloat8.setDuration(2000L);
                objectAnimatorOfFloat8.setInterpolator(AbstractC4196m.f4777a);
                objectAnimatorOfFloat8.setRepeatCount(-1);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8);
                c4193j.f4734i = new Animator[]{animatorSet2, animatorSet3};
                setIndeterminateDrawable(c4193j);
            } else {
                i8 = 0;
                z9 = true;
                z8 = z12;
            }
            if (!isIndeterminate() || z10) {
                int i11 = i8;
                C4191h c4191h = new C4191h(context, i11);
                boolean z13 = z9;
                c4191h.f4756l = z13;
                C4191h c4191h2 = new C4191h(context, z13 ? 1 : 0);
                C4191h c4191h3 = new C4191h(context, z13 ? 1 : 0);
                Drawable[] drawableArr = new Drawable[3];
                drawableArr[i11] = c4191h;
                drawableArr[z13 ? 1 : 0] = c4191h2;
                drawableArr[2] = c4191h3;
                setProgressDrawable(new C4190g(drawableArr, context));
            }
        }
        setUseIntrinsicPadding(z11);
        setShowProgressBackground(z8);
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m3552h();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m3552h();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m3552h();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m3552h();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f4726b;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m3552h();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m3552h();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m3552h();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m3552h();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC4204u) {
            return ((InterfaceC4204u) currentDrawable).mo3559a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f4727c.f4794m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f4727c.f4795n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f4727c.f4790i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f4727c.f4791j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f4727c.f4782a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f4727c.f4783b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f4727c.f4786e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f4727c.f4787f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC4201r) {
            return ((InterfaceC4201r) currentDrawable).mo3554d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final void m3552h() {
        if (getContext().getApplicationInfo().minSdkVersion >= 21) {
            return;
        }
        Log.w("MaterialProgressBar", "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z8) {
        super.setIndeterminate(z8);
        if (this.f4725a && !(getCurrentDrawable() instanceof InterfaceC4203t)) {
            Log.w("MaterialProgressBar", "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f4727c != null) {
            m3545a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m3552h();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m3552h();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m3552h();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m3552h();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f4727c == null || getProgressDrawable() == null) {
            return;
        }
        m3546b();
        m3547c();
        m3548d();
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m3552h();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m3552h();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m3552h();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m3552h();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z8) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC4204u) {
            ((InterfaceC4204u) currentDrawable).mo3560b(z8);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC4204u) {
            ((InterfaceC4204u) indeterminateDrawable).mo3560b(z8);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C4202s c4202s = this.f4727c;
        c4202s.f4794m = colorStateList;
        c4202s.f4796o = true;
        m3545a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C4202s c4202s = this.f4727c;
        c4202s.f4795n = mode;
        c4202s.f4797p = true;
        m3545a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C4202s c4202s = this.f4727c;
        c4202s.f4790i = colorStateList;
        c4202s.f4792k = true;
        m3547c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C4202s c4202s = this.f4727c;
        c4202s.f4791j = mode;
        c4202s.f4793l = true;
        m3547c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C4202s c4202s = this.f4727c;
        c4202s.f4782a = colorStateList;
        c4202s.f4784c = true;
        m3546b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C4202s c4202s = this.f4727c;
        c4202s.f4783b = mode;
        c4202s.f4785d = true;
        m3546b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C4202s c4202s = this.f4727c;
        c4202s.f4786e = colorStateList;
        c4202s.f4788g = true;
        m3548d();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C4202s c4202s = this.f4727c;
        c4202s.f4787f = mode;
        c4202s.f4789h = true;
        m3548d();
    }

    public void setUseIntrinsicPadding(boolean z8) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC4201r) {
            ((InterfaceC4201r) currentDrawable).mo3553c(z8);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC4201r) {
            ((InterfaceC4201r) indeterminateDrawable).mo3553c(z8);
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4725a = true;
        this.f4727c = new C4202s();
        m3551g(attributeSet, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4725a = true;
        this.f4727c = new C4202s();
        m3551g(attributeSet, i);
    }
}
