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
import p284x3.AbstractC9845a;

/* loaded from: classes4.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: d */
    public static final String f6667d = "MaterialProgressBar";

    /* renamed from: a */
    public boolean f6668a;

    /* renamed from: b */
    public int f6669b;

    /* renamed from: c */
    public C6569b f6670c;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C6569b {

        /* renamed from: a */
        public ColorStateList f6671a;

        /* renamed from: b */
        public PorterDuff.Mode f6672b;

        /* renamed from: c */
        public boolean f6673c;

        /* renamed from: d */
        public boolean f6674d;

        /* renamed from: e */
        public ColorStateList f6675e;

        /* renamed from: f */
        public PorterDuff.Mode f6676f;

        /* renamed from: g */
        public boolean f6677g;

        /* renamed from: h */
        public boolean f6678h;

        /* renamed from: i */
        public ColorStateList f6679i;

        /* renamed from: j */
        public PorterDuff.Mode f6680j;

        /* renamed from: k */
        public boolean f6681k;

        /* renamed from: l */
        public boolean f6682l;

        /* renamed from: m */
        public ColorStateList f6683m;

        /* renamed from: n */
        public PorterDuff.Mode f6684n;

        /* renamed from: o */
        public boolean f6685o;

        /* renamed from: p */
        public boolean f6686p;

        public C6569b() {
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6668a = true;
        this.f6670c = new C6569b();
        m5924i(attributeSet, 0, 0);
    }

    /* renamed from: a */
    public final void m5916a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C6569b c6569b = this.f6670c;
        if (c6569b.f6685o || c6569b.f6686p) {
            indeterminateDrawable.mutate();
            C6569b c6569b2 = this.f6670c;
            m5921f(indeterminateDrawable, c6569b2.f6683m, c6569b2.f6685o, c6569b2.f6684n, c6569b2.f6686p);
        }
    }

    /* renamed from: b */
    public final void m5917b() {
        Drawable drawableM5923h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6569b c6569b = this.f6670c;
        if ((c6569b.f6673c || c6569b.f6674d) && (drawableM5923h = m5923h(R.id.progress, true)) != null) {
            C6569b c6569b2 = this.f6670c;
            m5921f(drawableM5923h, c6569b2.f6671a, c6569b2.f6673c, c6569b2.f6672b, c6569b2.f6674d);
        }
    }

    /* renamed from: c */
    public final void m5918c() {
        Drawable drawableM5923h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6569b c6569b = this.f6670c;
        if ((c6569b.f6681k || c6569b.f6682l) && (drawableM5923h = m5923h(R.id.background, false)) != null) {
            C6569b c6569b2 = this.f6670c;
            m5921f(drawableM5923h, c6569b2.f6679i, c6569b2.f6681k, c6569b2.f6680j, c6569b2.f6682l);
        }
    }

    /* renamed from: d */
    public final void m5919d() {
        if (getProgressDrawable() == null) {
            return;
        }
        m5917b();
        m5918c();
        m5920e();
    }

    /* renamed from: e */
    public final void m5920e() {
        Drawable drawableM5923h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6569b c6569b = this.f6670c;
        if ((c6569b.f6677g || c6569b.f6678h) && (drawableM5923h = m5923h(R.id.secondaryProgress, false)) != null) {
            C6569b c6569b2 = this.f6670c;
            m5921f(drawableM5923h, c6569b2.f6675e, c6569b2.f6677g, c6569b2.f6676f, c6569b2.f6678h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m5921f(Drawable drawable, ColorStateList colorStateList, boolean z9, PorterDuff.Mode mode, boolean z10) {
        if (z9 || z10) {
            if (z9) {
                if (drawable instanceof InterfaceC6594y) {
                    ((InterfaceC6594y) drawable).setTintList(colorStateList);
                } else {
                    m5925j();
                    drawable.setTintList(colorStateList);
                }
            }
            if (z10) {
                if (drawable instanceof InterfaceC6594y) {
                    ((InterfaceC6594y) drawable).setTintMode(mode);
                } else {
                    m5925j();
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public final void m5922g() {
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m5926k();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m5926k();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m5926k();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m5926k();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f6669b;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m5926k();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m5926k();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m5926k();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m5926k();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6591v) {
            return ((InterfaceC6591v) currentDrawable).mo5914a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f6670c.f6683m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f6670c.f6684n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f6670c.f6679i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f6670c.f6680j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f6670c.f6671a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f6670c.f6672b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f6670c.f6675e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f6670c.f6676f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6589t) {
            return ((InterfaceC6589t) currentDrawable).mo5906d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final Drawable m5923h(int i10, boolean z9) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i10) : null;
        return (drawableFindDrawableByLayerId == null && z9) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: i */
    public final void m5924i(AttributeSet attributeSet, int i10, int i11) {
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i10, i11);
        this.f6669b = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z9 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z10 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z11 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f6669b == 1);
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        int i13 = R$styleable.MaterialProgressBar_mpb_progressTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f6670c.f6671a = tintTypedArrayObtainStyledAttributes.getColorStateList(i13);
            this.f6670c.f6673c = true;
        }
        int i14 = R$styleable.MaterialProgressBar_mpb_progressTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f6670c.f6672b = AbstractC9845a.m16485a(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null);
            this.f6670c.f6674d = true;
        }
        int i15 = R$styleable.MaterialProgressBar_mpb_secondaryProgressTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f6670c.f6675e = tintTypedArrayObtainStyledAttributes.getColorStateList(i15);
            this.f6670c.f6677g = true;
        }
        int i16 = R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f6670c.f6676f = AbstractC9845a.m16485a(tintTypedArrayObtainStyledAttributes.getInt(i16, -1), null);
            this.f6670c.f6678h = true;
        }
        int i17 = R$styleable.MaterialProgressBar_mpb_progressBackgroundTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i17)) {
            this.f6670c.f6679i = tintTypedArrayObtainStyledAttributes.getColorStateList(i17);
            this.f6670c.f6681k = true;
        }
        int i18 = R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i18)) {
            this.f6670c.f6680j = AbstractC9845a.m16485a(tintTypedArrayObtainStyledAttributes.getInt(i18, -1), null);
            this.f6670c.f6682l = true;
        }
        int i19 = R$styleable.MaterialProgressBar_mpb_indeterminateTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i19)) {
            this.f6670c.f6683m = tintTypedArrayObtainStyledAttributes.getColorStateList(i19);
            this.f6670c.f6685o = true;
        }
        int i20 = R$styleable.MaterialProgressBar_mpb_indeterminateTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i20)) {
            this.f6670c.f6684n = AbstractC9845a.m16485a(tintTypedArrayObtainStyledAttributes.getInt(i20, -1), null);
            this.f6670c.f6686p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i21 = this.f6669b;
        if (i21 == 0) {
            if (isIndeterminate() || z9) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || z9) {
                setProgressDrawable(new C6579j(i12, context));
            }
        } else {
            if (i21 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f6669b);
            }
            if (isIndeterminate() || z9) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || z9) {
                setProgressDrawable(new C6581l(context));
            }
        }
        setUseIntrinsicPadding(z10);
        setShowProgressBackground(z11);
    }

    /* renamed from: j */
    public final void m5925j() {
        Log.w(f6667d, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
    }

    /* renamed from: k */
    public final void m5926k() {
        if (getContext().getApplicationInfo().minSdkVersion >= 21) {
            return;
        }
        Log.w(f6667d, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5922g();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z9) {
        super.setIndeterminate(z9);
        if (this.f6668a && !(getCurrentDrawable() instanceof InterfaceC6590u)) {
            Log.w(f6667d, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f6670c != null) {
            m5916a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m5926k();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m5926k();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m5926k();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m5926k();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f6670c != null) {
            m5919d();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m5926k();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m5926k();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m5926k();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m5926k();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z9) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6591v) {
            ((InterfaceC6591v) currentDrawable).mo5915b(z9);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC6591v) {
            ((InterfaceC6591v) indeterminateDrawable).mo5915b(z9);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C6569b c6569b = this.f6670c;
        c6569b.f6683m = colorStateList;
        c6569b.f6685o = true;
        m5916a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C6569b c6569b = this.f6670c;
        c6569b.f6684n = mode;
        c6569b.f6686p = true;
        m5916a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C6569b c6569b = this.f6670c;
        c6569b.f6679i = colorStateList;
        c6569b.f6681k = true;
        m5918c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C6569b c6569b = this.f6670c;
        c6569b.f6680j = mode;
        c6569b.f6682l = true;
        m5918c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C6569b c6569b = this.f6670c;
        c6569b.f6671a = colorStateList;
        c6569b.f6673c = true;
        m5917b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C6569b c6569b = this.f6670c;
        c6569b.f6672b = mode;
        c6569b.f6674d = true;
        m5917b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C6569b c6569b = this.f6670c;
        c6569b.f6675e = colorStateList;
        c6569b.f6677g = true;
        m5920e();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C6569b c6569b = this.f6670c;
        c6569b.f6676f = mode;
        c6569b.f6678h = true;
        m5920e();
    }

    public void setUseIntrinsicPadding(boolean z9) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6589t) {
            ((InterfaceC6589t) currentDrawable).mo5905c(z9);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC6589t) {
            ((InterfaceC6589t) indeterminateDrawable).mo5905c(z9);
        }
    }
}
