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
import p229r2.AbstractC9903a;

/* loaded from: classes4.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: d */
    public static final String f8089d = "MaterialProgressBar";

    /* renamed from: a */
    public boolean f8090a;

    /* renamed from: b */
    public int f8091b;

    /* renamed from: c */
    public C6975b f8092c;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C6975b {

        /* renamed from: a */
        public ColorStateList f8093a;

        /* renamed from: b */
        public PorterDuff.Mode f8094b;

        /* renamed from: c */
        public boolean f8095c;

        /* renamed from: d */
        public boolean f8096d;

        /* renamed from: e */
        public ColorStateList f8097e;

        /* renamed from: f */
        public PorterDuff.Mode f8098f;

        /* renamed from: g */
        public boolean f8099g;

        /* renamed from: h */
        public boolean f8100h;

        /* renamed from: i */
        public ColorStateList f8101i;

        /* renamed from: j */
        public PorterDuff.Mode f8102j;

        /* renamed from: k */
        public boolean f8103k;

        /* renamed from: l */
        public boolean f8104l;

        /* renamed from: m */
        public ColorStateList f8105m;

        /* renamed from: n */
        public PorterDuff.Mode f8106n;

        /* renamed from: o */
        public boolean f8107o;

        /* renamed from: p */
        public boolean f8108p;

        public C6975b() {
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8090a = true;
        this.f8092c = new C6975b();
        m7114i(attributeSet, 0, 0);
    }

    /* renamed from: a */
    public final void m7106a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C6975b c6975b = this.f8092c;
        if (c6975b.f8107o || c6975b.f8108p) {
            indeterminateDrawable.mutate();
            C6975b c6975b2 = this.f8092c;
            m7111f(indeterminateDrawable, c6975b2.f8105m, c6975b2.f8107o, c6975b2.f8106n, c6975b2.f8108p);
        }
    }

    /* renamed from: b */
    public final void m7107b() {
        Drawable drawableM7113h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6975b c6975b = this.f8092c;
        if ((c6975b.f8095c || c6975b.f8096d) && (drawableM7113h = m7113h(R.id.progress, true)) != null) {
            C6975b c6975b2 = this.f8092c;
            m7111f(drawableM7113h, c6975b2.f8093a, c6975b2.f8095c, c6975b2.f8094b, c6975b2.f8096d);
        }
    }

    /* renamed from: c */
    public final void m7108c() {
        Drawable drawableM7113h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6975b c6975b = this.f8092c;
        if ((c6975b.f8103k || c6975b.f8104l) && (drawableM7113h = m7113h(R.id.background, false)) != null) {
            C6975b c6975b2 = this.f8092c;
            m7111f(drawableM7113h, c6975b2.f8101i, c6975b2.f8103k, c6975b2.f8102j, c6975b2.f8104l);
        }
    }

    /* renamed from: d */
    public final void m7109d() {
        if (getProgressDrawable() == null) {
            return;
        }
        m7107b();
        m7108c();
        m7110e();
    }

    /* renamed from: e */
    public final void m7110e() {
        Drawable drawableM7113h;
        if (getProgressDrawable() == null) {
            return;
        }
        C6975b c6975b = this.f8092c;
        if ((c6975b.f8099g || c6975b.f8100h) && (drawableM7113h = m7113h(R.id.secondaryProgress, false)) != null) {
            C6975b c6975b2 = this.f8092c;
            m7111f(drawableM7113h, c6975b2.f8097e, c6975b2.f8099g, c6975b2.f8098f, c6975b2.f8100h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m7111f(Drawable drawable, ColorStateList colorStateList, boolean z10, PorterDuff.Mode mode, boolean z11) {
        if (z10 || z11) {
            if (z10) {
                if (drawable instanceof InterfaceC7000y) {
                    ((InterfaceC7000y) drawable).setTintList(colorStateList);
                } else {
                    m7115j();
                    drawable.setTintList(colorStateList);
                }
            }
            if (z11) {
                if (drawable instanceof InterfaceC7000y) {
                    ((InterfaceC7000y) drawable).setTintMode(mode);
                } else {
                    m7115j();
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public final void m7112g() {
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m7116k();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m7116k();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m7116k();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m7116k();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f8091b;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m7116k();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m7116k();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m7116k();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m7116k();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6997v) {
            return ((InterfaceC6997v) currentDrawable).mo7104a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f8092c.f8105m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f8092c.f8106n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f8092c.f8101i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f8092c.f8102j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f8092c.f8093a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f8092c.f8094b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f8092c.f8097e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f8092c.f8098f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6995t) {
            return ((InterfaceC6995t) currentDrawable).mo7096d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final Drawable m7113h(int i10, boolean z10) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i10) : null;
        return (drawableFindDrawableByLayerId == null && z10) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: i */
    public final void m7114i(AttributeSet attributeSet, int i10, int i11) {
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i10, i11);
        this.f8091b = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z10 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z11 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z12 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f8091b == 1);
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTint)) {
            this.f8092c.f8093a = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressTint);
            this.f8092c.f8095c = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTintMode)) {
            this.f8092c.f8094b = AbstractC9903a.m18547a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressTintMode, -1), null);
            this.f8092c.f8096d = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            this.f8092c.f8097e = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint);
            this.f8092c.f8099g = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            this.f8092c.f8098f = AbstractC9903a.m18547a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1), null);
            this.f8092c.f8100h = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            this.f8092c.f8101i = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint);
            this.f8092c.f8103k = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            this.f8092c.f8102j = AbstractC9903a.m18547a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1), null);
            this.f8092c.f8104l = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            this.f8092c.f8105m = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_indeterminateTint);
            this.f8092c.f8107o = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            this.f8092c.f8106n = AbstractC9903a.m18547a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1), null);
            this.f8092c.f8108p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i13 = this.f8091b;
        if (i13 == 0) {
            if (isIndeterminate() || z10) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || z10) {
                setProgressDrawable(new C6985j(i12, context));
            }
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f8091b);
            }
            if (isIndeterminate() || z10) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || z10) {
                setProgressDrawable(new C6987l(context));
            }
        }
        setUseIntrinsicPadding(z11);
        setShowProgressBackground(z12);
    }

    /* renamed from: j */
    public final void m7115j() {
        Log.w(f8089d, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
    }

    /* renamed from: k */
    public final void m7116k() {
        if (getContext().getApplicationInfo().minSdkVersion >= 21) {
            return;
        }
        Log.w(f8089d, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7112g();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        super.setIndeterminate(z10);
        if (this.f8090a && !(getCurrentDrawable() instanceof InterfaceC6996u)) {
            Log.w(f8089d, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f8092c != null) {
            m7106a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m7116k();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m7116k();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m7116k();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m7116k();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f8092c != null) {
            m7109d();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m7116k();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m7116k();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m7116k();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m7116k();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z10) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6997v) {
            ((InterfaceC6997v) currentDrawable).mo7105b(z10);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC6997v) {
            ((InterfaceC6997v) indeterminateDrawable).mo7105b(z10);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C6975b c6975b = this.f8092c;
        c6975b.f8105m = colorStateList;
        c6975b.f8107o = true;
        m7106a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C6975b c6975b = this.f8092c;
        c6975b.f8106n = mode;
        c6975b.f8108p = true;
        m7106a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C6975b c6975b = this.f8092c;
        c6975b.f8101i = colorStateList;
        c6975b.f8103k = true;
        m7108c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C6975b c6975b = this.f8092c;
        c6975b.f8102j = mode;
        c6975b.f8104l = true;
        m7108c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C6975b c6975b = this.f8092c;
        c6975b.f8093a = colorStateList;
        c6975b.f8095c = true;
        m7107b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C6975b c6975b = this.f8092c;
        c6975b.f8094b = mode;
        c6975b.f8096d = true;
        m7107b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C6975b c6975b = this.f8092c;
        c6975b.f8097e = colorStateList;
        c6975b.f8099g = true;
        m7110e();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C6975b c6975b = this.f8092c;
        c6975b.f8098f = mode;
        c6975b.f8100h = true;
        m7110e();
    }

    public void setUseIntrinsicPadding(boolean z10) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC6995t) {
            ((InterfaceC6995t) currentDrawable).mo7095c(z10);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC6995t) {
            ((InterfaceC6995t) indeterminateDrawable).mo7095c(z10);
        }
    }
}
