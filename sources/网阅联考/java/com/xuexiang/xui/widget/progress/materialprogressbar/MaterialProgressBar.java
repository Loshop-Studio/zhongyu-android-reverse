package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import com.xuexiang.xui.R$styleable;
import p073i1.AbstractC3778a;

/* loaded from: classes2.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: d */
    public static final String f3855d = "MaterialProgressBar";

    /* renamed from: a */
    public boolean f3856a;

    /* renamed from: b */
    public int f3857b;

    /* renamed from: c */
    public C3608b f3858c;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C3608b {

        /* renamed from: a */
        public ColorStateList f3859a;

        /* renamed from: b */
        public PorterDuff.Mode f3860b;

        /* renamed from: c */
        public boolean f3861c;

        /* renamed from: d */
        public boolean f3862d;

        /* renamed from: e */
        public ColorStateList f3863e;

        /* renamed from: f */
        public PorterDuff.Mode f3864f;

        /* renamed from: g */
        public boolean f3865g;

        /* renamed from: h */
        public boolean f3866h;

        /* renamed from: i */
        public ColorStateList f3867i;

        /* renamed from: j */
        public PorterDuff.Mode f3868j;

        /* renamed from: k */
        public boolean f3869k;

        /* renamed from: l */
        public boolean f3870l;

        /* renamed from: m */
        public ColorStateList f3871m;

        /* renamed from: n */
        public PorterDuff.Mode f3872n;

        /* renamed from: o */
        public boolean f3873o;

        /* renamed from: p */
        public boolean f3874p;

        public C3608b() {
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3856a = true;
        this.f3858c = new C3608b();
        m4555i(attributeSet, 0, 0);
    }

    /* renamed from: a */
    public final void m4547a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C3608b c3608b = this.f3858c;
        if (c3608b.f3873o || c3608b.f3874p) {
            indeterminateDrawable.mutate();
            C3608b c3608b2 = this.f3858c;
            m4552f(indeterminateDrawable, c3608b2.f3871m, c3608b2.f3873o, c3608b2.f3872n, c3608b2.f3874p);
        }
    }

    /* renamed from: b */
    public final void m4548b() {
        Drawable drawableM4554h;
        if (getProgressDrawable() == null) {
            return;
        }
        C3608b c3608b = this.f3858c;
        if ((c3608b.f3861c || c3608b.f3862d) && (drawableM4554h = m4554h(R.id.progress, true)) != null) {
            C3608b c3608b2 = this.f3858c;
            m4552f(drawableM4554h, c3608b2.f3859a, c3608b2.f3861c, c3608b2.f3860b, c3608b2.f3862d);
        }
    }

    /* renamed from: c */
    public final void m4549c() {
        Drawable drawableM4554h;
        if (getProgressDrawable() == null) {
            return;
        }
        C3608b c3608b = this.f3858c;
        if ((c3608b.f3869k || c3608b.f3870l) && (drawableM4554h = m4554h(R.id.background, false)) != null) {
            C3608b c3608b2 = this.f3858c;
            m4552f(drawableM4554h, c3608b2.f3867i, c3608b2.f3869k, c3608b2.f3868j, c3608b2.f3870l);
        }
    }

    /* renamed from: d */
    public final void m4550d() {
        if (getProgressDrawable() == null) {
            return;
        }
        m4548b();
        m4549c();
        m4551e();
    }

    /* renamed from: e */
    public final void m4551e() {
        Drawable drawableM4554h;
        if (getProgressDrawable() == null) {
            return;
        }
        C3608b c3608b = this.f3858c;
        if ((c3608b.f3865g || c3608b.f3866h) && (drawableM4554h = m4554h(R.id.secondaryProgress, false)) != null) {
            C3608b c3608b2 = this.f3858c;
            m4552f(drawableM4554h, c3608b2.f3863e, c3608b2.f3865g, c3608b2.f3864f, c3608b2.f3866h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m4552f(Drawable drawable, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode, boolean z4) {
        if (z3 || z4) {
            if (z3) {
                if (drawable instanceof InterfaceC3633y) {
                    ((InterfaceC3633y) drawable).setTintList(colorStateList);
                } else {
                    m4556j();
                    drawable.setTintList(colorStateList);
                }
            }
            if (z4) {
                if (drawable instanceof InterfaceC3633y) {
                    ((InterfaceC3633y) drawable).setTintMode(mode);
                } else {
                    m4556j();
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public final void m4553g() {
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m4557k();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m4557k();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m4557k();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m4557k();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f3857b;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m4557k();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m4557k();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m4557k();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m4557k();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC3630v) {
            return ((InterfaceC3630v) currentDrawable).mo4545a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f3858c.f3871m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f3858c.f3872n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f3858c.f3867i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f3858c.f3868j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f3858c.f3859a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f3858c.f3860b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f3858c.f3863e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f3858c.f3864f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC3628t) {
            return ((InterfaceC3628t) currentDrawable).mo4536c();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final Drawable m4554h(int i4, boolean z3) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i4) : null;
        return (drawableFindDrawableByLayerId == null && z3) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: i */
    public final void m4555i(AttributeSet attributeSet, int i4, int i5) {
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i4, i5);
        this.f3857b = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z3 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z4 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z5 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f3857b == 1);
        int i6 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTint)) {
            this.f3858c.f3859a = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressTint);
            this.f3858c.f3861c = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTintMode)) {
            this.f3858c.f3860b = AbstractC3778a.m4921a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressTintMode, -1), null);
            this.f3858c.f3862d = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            this.f3858c.f3863e = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint);
            this.f3858c.f3865g = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            this.f3858c.f3864f = AbstractC3778a.m4921a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1), null);
            this.f3858c.f3866h = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            this.f3858c.f3867i = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint);
            this.f3858c.f3869k = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            this.f3858c.f3868j = AbstractC3778a.m4921a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1), null);
            this.f3858c.f3870l = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            this.f3858c.f3871m = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_indeterminateTint);
            this.f3858c.f3873o = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            this.f3858c.f3872n = AbstractC3778a.m4921a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1), null);
            this.f3858c.f3874p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i7 = this.f3857b;
        if (i7 == 0) {
            if (isIndeterminate() || z3) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || z3) {
                setProgressDrawable(new C3618j(i6, context));
            }
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f3857b);
            }
            if (isIndeterminate() || z3) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || z3) {
                setProgressDrawable(new C3620l(context));
            }
        }
        setUseIntrinsicPadding(z4);
        setShowProgressBackground(z5);
    }

    /* renamed from: j */
    public final void m4556j() {
        Log.w(f3855d, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
    }

    /* renamed from: k */
    public final void m4557k() {
        if (Build.VERSION.SDK_INT < 24 || getContext().getApplicationInfo().minSdkVersion < 21) {
            Log.w(f3855d, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4553g();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z3) {
        super.setIndeterminate(z3);
        if (this.f3856a && !(getCurrentDrawable() instanceof InterfaceC3629u)) {
            Log.w(f3855d, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f3858c != null) {
            m4547a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m4557k();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m4557k();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m4557k();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m4557k();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f3858c != null) {
            m4550d();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m4557k();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m4557k();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m4557k();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m4557k();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z3) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC3630v) {
            ((InterfaceC3630v) currentDrawable).mo4546b(z3);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC3630v) {
            ((InterfaceC3630v) indeterminateDrawable).mo4546b(z3);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C3608b c3608b = this.f3858c;
        c3608b.f3871m = colorStateList;
        c3608b.f3873o = true;
        m4547a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C3608b c3608b = this.f3858c;
        c3608b.f3872n = mode;
        c3608b.f3874p = true;
        m4547a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C3608b c3608b = this.f3858c;
        c3608b.f3867i = colorStateList;
        c3608b.f3869k = true;
        m4549c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C3608b c3608b = this.f3858c;
        c3608b.f3868j = mode;
        c3608b.f3870l = true;
        m4549c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C3608b c3608b = this.f3858c;
        c3608b.f3859a = colorStateList;
        c3608b.f3861c = true;
        m4548b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C3608b c3608b = this.f3858c;
        c3608b.f3860b = mode;
        c3608b.f3862d = true;
        m4548b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C3608b c3608b = this.f3858c;
        c3608b.f3863e = colorStateList;
        c3608b.f3865g = true;
        m4551e();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C3608b c3608b = this.f3858c;
        c3608b.f3864f = mode;
        c3608b.f3866h = true;
        m4551e();
    }

    public void setUseIntrinsicPadding(boolean z3) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC3628t) {
            ((InterfaceC3628t) currentDrawable).mo4537d(z3);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC3628t) {
            ((InterfaceC3628t) indeterminateDrawable).mo4537d(z3);
        }
    }
}
