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
import p148f9.AbstractC9206a;

/* loaded from: classes5.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: f */
    public static final String f16801f = "MaterialProgressBar";

    /* renamed from: c */
    public boolean f16802c;

    /* renamed from: d */
    public int f16803d;

    /* renamed from: e */
    public C8208b f16804e;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C8208b {

        /* renamed from: a */
        public ColorStateList f16805a;

        /* renamed from: b */
        public PorterDuff.Mode f16806b;

        /* renamed from: c */
        public boolean f16807c;

        /* renamed from: d */
        public boolean f16808d;

        /* renamed from: e */
        public ColorStateList f16809e;

        /* renamed from: f */
        public PorterDuff.Mode f16810f;

        /* renamed from: g */
        public boolean f16811g;

        /* renamed from: h */
        public boolean f16812h;

        /* renamed from: i */
        public ColorStateList f16813i;

        /* renamed from: j */
        public PorterDuff.Mode f16814j;

        /* renamed from: k */
        public boolean f16815k;

        /* renamed from: l */
        public boolean f16816l;

        /* renamed from: m */
        public ColorStateList f16817m;

        /* renamed from: n */
        public PorterDuff.Mode f16818n;

        /* renamed from: o */
        public boolean f16819o;

        /* renamed from: p */
        public boolean f16820p;

        public C8208b() {
        }
    }

    public MaterialProgressBar(Context context) {
        super(context);
        this.f16802c = true;
        this.f16804e = new C8208b();
        m13139i(null, 0, 0);
    }

    /* renamed from: a */
    public final void m13131a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C8208b c8208b = this.f16804e;
        if (c8208b.f16819o || c8208b.f16820p) {
            indeterminateDrawable.mutate();
            C8208b c8208b2 = this.f16804e;
            m13136f(indeterminateDrawable, c8208b2.f16817m, c8208b2.f16819o, c8208b2.f16818n, c8208b2.f16820p);
        }
    }

    /* renamed from: b */
    public final void m13132b() {
        Drawable drawableM13138h;
        if (getProgressDrawable() == null) {
            return;
        }
        C8208b c8208b = this.f16804e;
        if ((c8208b.f16807c || c8208b.f16808d) && (drawableM13138h = m13138h(R.id.progress, true)) != null) {
            C8208b c8208b2 = this.f16804e;
            m13136f(drawableM13138h, c8208b2.f16805a, c8208b2.f16807c, c8208b2.f16806b, c8208b2.f16808d);
        }
    }

    /* renamed from: c */
    public final void m13133c() {
        Drawable drawableM13138h;
        if (getProgressDrawable() == null) {
            return;
        }
        C8208b c8208b = this.f16804e;
        if ((c8208b.f16815k || c8208b.f16816l) && (drawableM13138h = m13138h(R.id.background, false)) != null) {
            C8208b c8208b2 = this.f16804e;
            m13136f(drawableM13138h, c8208b2.f16813i, c8208b2.f16815k, c8208b2.f16814j, c8208b2.f16816l);
        }
    }

    /* renamed from: d */
    public final void m13134d() {
        if (getProgressDrawable() == null) {
            return;
        }
        m13132b();
        m13133c();
        m13135e();
    }

    /* renamed from: e */
    public final void m13135e() {
        Drawable drawableM13138h;
        if (getProgressDrawable() == null) {
            return;
        }
        C8208b c8208b = this.f16804e;
        if ((c8208b.f16811g || c8208b.f16812h) && (drawableM13138h = m13138h(R.id.secondaryProgress, false)) != null) {
            C8208b c8208b2 = this.f16804e;
            m13136f(drawableM13138h, c8208b2.f16809e, c8208b2.f16811g, c8208b2.f16810f, c8208b2.f16812h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m13136f(Drawable drawable, ColorStateList colorStateList, boolean z10, PorterDuff.Mode mode, boolean z11) {
        if (z10 || z11) {
            if (z10) {
                if (drawable instanceof InterfaceC8233y) {
                    ((InterfaceC8233y) drawable).setTintList(colorStateList);
                } else {
                    m13140j();
                    drawable.setTintList(colorStateList);
                }
            }
            if (z11) {
                if (drawable instanceof InterfaceC8233y) {
                    ((InterfaceC8233y) drawable).setTintMode(mode);
                } else {
                    m13140j();
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public final void m13137g() {
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m13141k();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m13141k();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m13141k();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m13141k();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f16803d;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m13141k();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m13141k();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m13141k();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m13141k();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC8230v) {
            return ((InterfaceC8230v) currentDrawable).mo13129a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f16804e.f16817m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f16804e.f16818n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f16804e.f16813i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f16804e.f16814j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f16804e.f16805a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f16804e.f16806b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f16804e.f16809e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f16804e.f16810f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC8228t) {
            return ((InterfaceC8228t) currentDrawable).mo13121d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final Drawable m13138h(int i10, boolean z10) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i10) : null;
        return (drawableFindDrawableByLayerId == null && z10) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: i */
    public final void m13139i(AttributeSet attributeSet, int i10, int i11) {
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i10, i11);
        this.f16803d = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z10 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z11 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z12 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f16803d == 1);
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTint)) {
            this.f16804e.f16805a = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressTint);
            this.f16804e.f16807c = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressTintMode)) {
            this.f16804e.f16806b = AbstractC9206a.m18115a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressTintMode, -1), null);
            this.f16804e.f16808d = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
            this.f16804e.f16809e = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_secondaryProgressTint);
            this.f16804e.f16811g = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
            this.f16804e.f16810f = AbstractC9206a.m18115a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1), null);
            this.f16804e.f16812h = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
            this.f16804e.f16813i = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_progressBackgroundTint);
            this.f16804e.f16815k = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
            this.f16804e.f16814j = AbstractC9206a.m18115a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1), null);
            this.f16804e.f16816l = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTint)) {
            this.f16804e.f16817m = tintTypedArrayObtainStyledAttributes.getColorStateList(R$styleable.MaterialProgressBar_mpb_indeterminateTint);
            this.f16804e.f16819o = true;
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
            this.f16804e.f16818n = AbstractC9206a.m18115a(tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1), null);
            this.f16804e.f16820p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i13 = this.f16803d;
        if (i13 == 0) {
            if (isIndeterminate() || z10) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || z10) {
                setProgressDrawable(new C8218j(i12, context));
            }
        } else {
            if (i13 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f16803d);
            }
            if (isIndeterminate() || z10) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || z10) {
                setProgressDrawable(new C8220l(context));
            }
        }
        setUseIntrinsicPadding(z11);
        setShowProgressBackground(z12);
    }

    /* renamed from: j */
    public final void m13140j() {
        Log.w(f16801f, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
    }

    /* renamed from: k */
    public final void m13141k() {
        if (getContext().getApplicationInfo().minSdkVersion >= 21) {
            return;
        }
        Log.w(f16801f, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m13137g();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        super.setIndeterminate(z10);
        if (this.f16802c && !(getCurrentDrawable() instanceof InterfaceC8229u)) {
            Log.w(f16801f, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f16804e != null) {
            m13131a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m13141k();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m13141k();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m13141k();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m13141k();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f16804e != null) {
            m13134d();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m13141k();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m13141k();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m13141k();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m13141k();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z10) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC8230v) {
            ((InterfaceC8230v) currentDrawable).mo13130b(z10);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC8230v) {
            ((InterfaceC8230v) indeterminateDrawable).mo13130b(z10);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C8208b c8208b = this.f16804e;
        c8208b.f16817m = colorStateList;
        c8208b.f16819o = true;
        m13131a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C8208b c8208b = this.f16804e;
        c8208b.f16818n = mode;
        c8208b.f16820p = true;
        m13131a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C8208b c8208b = this.f16804e;
        c8208b.f16813i = colorStateList;
        c8208b.f16815k = true;
        m13133c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C8208b c8208b = this.f16804e;
        c8208b.f16814j = mode;
        c8208b.f16816l = true;
        m13133c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C8208b c8208b = this.f16804e;
        c8208b.f16805a = colorStateList;
        c8208b.f16807c = true;
        m13132b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C8208b c8208b = this.f16804e;
        c8208b.f16806b = mode;
        c8208b.f16808d = true;
        m13132b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C8208b c8208b = this.f16804e;
        c8208b.f16809e = colorStateList;
        c8208b.f16811g = true;
        m13135e();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C8208b c8208b = this.f16804e;
        c8208b.f16810f = mode;
        c8208b.f16812h = true;
        m13135e();
    }

    public void setUseIntrinsicPadding(boolean z10) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC8228t) {
            ((InterfaceC8228t) currentDrawable).mo13120c(z10);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC8228t) {
            ((InterfaceC8228t) indeterminateDrawable).mo13120c(z10);
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16802c = true;
        this.f16804e = new C8208b();
        m13139i(attributeSet, 0, 0);
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16802c = true;
        this.f16804e = new C8208b();
        m13139i(attributeSet, i10, 0);
    }
}
