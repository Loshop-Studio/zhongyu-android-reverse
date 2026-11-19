package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.TintTypedArray;
import com.xuexiang.xui.R$styleable;
import p188n4.AbstractC9092a;

/* loaded from: classes4.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: d */
    public static final String f7925d = "MaterialProgressBar";

    /* renamed from: a */
    public boolean f7926a;

    /* renamed from: b */
    public int f7927b;

    /* renamed from: c */
    public C6889b f7928c;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C6889b {

        /* renamed from: a */
        public ColorStateList f7929a;

        /* renamed from: b */
        public PorterDuff.Mode f7930b;

        /* renamed from: c */
        public boolean f7931c;

        /* renamed from: d */
        public boolean f7932d;

        /* renamed from: e */
        public ColorStateList f7933e;

        /* renamed from: f */
        public PorterDuff.Mode f7934f;

        /* renamed from: g */
        public boolean f7935g;

        /* renamed from: h */
        public boolean f7936h;

        /* renamed from: i */
        public ColorStateList f7937i;

        /* renamed from: j */
        public PorterDuff.Mode f7938j;

        /* renamed from: k */
        public boolean f7939k;

        /* renamed from: l */
        public boolean f7940l;

        /* renamed from: m */
        public ColorStateList f7941m;

        /* renamed from: n */
        public PorterDuff.Mode f7942n;

        /* renamed from: o */
        public boolean f7943o;

        /* renamed from: p */
        public boolean f7944p;

        public C6889b() {
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7926a = true;
        this.f7928c = new C6889b();
        m7022i(attributeSet, 0, 0);
    }

    /* renamed from: a */
    public final void m7014a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C6889b c6889b = this.f7928c;
        if (c6889b.f7943o || c6889b.f7944p) {
            indeterminateDrawable.mutate();
            C6889b c6889b2 = this.f7928c;
            m7019f(indeterminateDrawable, c6889b2.f7941m, c6889b2.f7943o, c6889b2.f7942n, c6889b2.f7944p);
        }
    }

    /* renamed from: b */
    public final void m7015b() {
        Drawable drawableM7021h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6889b c6889b = this.f7928c;
        if ((c6889b.f7931c || c6889b.f7932d) && (drawableM7021h = m7021h(R.id.progress, true)) != null) {
            C6889b c6889b2 = this.f7928c;
            m7019f(drawableM7021h, c6889b2.f7929a, c6889b2.f7931c, c6889b2.f7930b, c6889b2.f7932d);
        }
    }

    /* renamed from: c */
    public final void m7016c() {
        Drawable drawableM7021h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6889b c6889b = this.f7928c;
        if ((c6889b.f7939k || c6889b.f7940l) && (drawableM7021h = m7021h(R.id.background, false)) != null) {
            C6889b c6889b2 = this.f7928c;
            m7019f(drawableM7021h, c6889b2.f7937i, c6889b2.f7939k, c6889b2.f7938j, c6889b2.f7940l);
        }
    }

    /* renamed from: d */
    public final void m7017d() {
        if (getProgressDrawable() == null) {
            return;
        }
        m7015b();
        m7016c();
        m7018e();
    }

    /* renamed from: e */
    public final void m7018e() {
        Drawable drawableM7021h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6889b c6889b = this.f7928c;
        if ((c6889b.f7935g || c6889b.f7936h) && (drawableM7021h = m7021h(R.id.secondaryProgress, false)) != null) {
            C6889b c6889b2 = this.f7928c;
            m7019f(drawableM7021h, c6889b2.f7933e, c6889b2.f7935g, c6889b2.f7934f, c6889b2.f7936h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m7019f(Drawable drawable, ColorStateList colorStateList, boolean z9, PorterDuff.Mode mode, boolean z10) {
        if (z9 || z10) {
            if (z9) {
                if (drawable instanceof InterfaceC6914y) {
                    ((InterfaceC6914y) drawable).setTintList(colorStateList);
                } else {
                    m7023j();
                    drawable.setTintList(colorStateList);
                }
            }
            if (z10) {
                if (drawable instanceof InterfaceC6914y) {
                    ((InterfaceC6914y) drawable).setTintMode(mode);
                } else {
                    m7023j();
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public final void m7020g() {
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m7024k();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m7024k();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m7024k();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m7024k();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f7927b;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m7024k();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m7024k();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m7024k();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m7024k();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6911v) {
            return ((InterfaceC6911v) currentDrawable).mo7012a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f7928c.f7941m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f7928c.f7942n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f7928c.f7937i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f7928c.f7938j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f7928c.f7929a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f7928c.f7930b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f7928c.f7933e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f7928c.f7934f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6909t) {
            return ((InterfaceC6909t) currentDrawable).mo7004d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final Drawable m7021h(int i9, boolean z9) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i9) : null;
        return (drawableFindDrawableByLayerId == null && z9) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: i */
    public final void m7022i(AttributeSet attributeSet, int i9, int i10) {
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i9, i10);
        this.f7927b = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z9 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z10 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z11 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f7927b == 1);
        int i11 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTint)) {
            this.f7928c.f7929a = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressTint);
            this.f7928c.f7931c = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTintMode)) {
            this.f7928c.f7930b = AbstractC9092a.m14624a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressTintMode, -1), null);
            this.f7928c.f7932d = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            this.f7928c.f7933e = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint);
            this.f7928c.f7935g = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            this.f7928c.f7934f = AbstractC9092a.m14624a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1), null);
            this.f7928c.f7936h = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            this.f7928c.f7937i = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint);
            this.f7928c.f7939k = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            this.f7928c.f7938j = AbstractC9092a.m14624a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1), null);
            this.f7928c.f7940l = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            this.f7928c.f7941m = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_indeterminateTint);
            this.f7928c.f7943o = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            this.f7928c.f7942n = AbstractC9092a.m14624a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1), null);
            this.f7928c.f7944p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i12 = this.f7927b;
        if (i12 == 0) {
            if (isIndeterminate() || z9) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || z9) {
                setProgressDrawable(new C6899j(i11, context));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f7927b);
            }
            if (isIndeterminate() || z9) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || z9) {
                setProgressDrawable(new C6901l(context));
            }
        }
        setUseIntrinsicPadding(z10);
        setShowProgressBackground(z11);
    }

    /* renamed from: j */
    public final void m7023j() {
        Log.w(f7925d, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
    }

    /* renamed from: k */
    public final void m7024k() {
        if (getContext().getApplicationInfo().minSdkVersion >= 21) {
            return;
        }
        Log.w(f7925d, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7020g();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z9) {
        super.setIndeterminate(z9);
        if (this.f7926a && !(getCurrentDrawable() instanceof InterfaceC6910u)) {
            Log.w(f7925d, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f7928c != null) {
            m7014a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m7024k();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m7024k();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m7024k();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m7024k();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f7928c != null) {
            m7017d();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m7024k();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m7024k();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m7024k();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m7024k();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z9) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6911v) {
            ((InterfaceC6911v) currentDrawable).mo7013b(z9);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC6911v) {
            ((InterfaceC6911v) indeterminateDrawable).mo7013b(z9);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C6889b c6889b = this.f7928c;
        c6889b.f7941m = colorStateList;
        c6889b.f7943o = true;
        m7014a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C6889b c6889b = this.f7928c;
        c6889b.f7942n = mode;
        c6889b.f7944p = true;
        m7014a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C6889b c6889b = this.f7928c;
        c6889b.f7937i = colorStateList;
        c6889b.f7939k = true;
        m7016c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C6889b c6889b = this.f7928c;
        c6889b.f7938j = mode;
        c6889b.f7940l = true;
        m7016c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C6889b c6889b = this.f7928c;
        c6889b.f7929a = colorStateList;
        c6889b.f7931c = true;
        m7015b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C6889b c6889b = this.f7928c;
        c6889b.f7930b = mode;
        c6889b.f7932d = true;
        m7015b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C6889b c6889b = this.f7928c;
        c6889b.f7933e = colorStateList;
        c6889b.f7935g = true;
        m7018e();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C6889b c6889b = this.f7928c;
        c6889b.f7934f = mode;
        c6889b.f7936h = true;
        m7018e();
    }

    public void setUseIntrinsicPadding(boolean z9) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6909t) {
            ((InterfaceC6909t) currentDrawable).mo7003c(z9);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC6909t) {
            ((InterfaceC6909t) indeterminateDrawable).mo7003c(z9);
        }
    }
}
