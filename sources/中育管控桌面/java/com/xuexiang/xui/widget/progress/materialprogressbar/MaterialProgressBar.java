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
import p148s2.AbstractC7690a;

/* loaded from: classes3.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: d */
    public static final String f5376d = "MaterialProgressBar";

    /* renamed from: a */
    public boolean f5377a;

    /* renamed from: b */
    public int f5378b;

    /* renamed from: c */
    public C5947b f5379c;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C5947b {

        /* renamed from: a */
        public ColorStateList f5380a;

        /* renamed from: b */
        public PorterDuff.Mode f5381b;

        /* renamed from: c */
        public boolean f5382c;

        /* renamed from: d */
        public boolean f5383d;

        /* renamed from: e */
        public ColorStateList f5384e;

        /* renamed from: f */
        public PorterDuff.Mode f5385f;

        /* renamed from: g */
        public boolean f5386g;

        /* renamed from: h */
        public boolean f5387h;

        /* renamed from: i */
        public ColorStateList f5388i;

        /* renamed from: j */
        public PorterDuff.Mode f5389j;

        /* renamed from: k */
        public boolean f5390k;

        /* renamed from: l */
        public boolean f5391l;

        /* renamed from: m */
        public ColorStateList f5392m;

        /* renamed from: n */
        public PorterDuff.Mode f5393n;

        /* renamed from: o */
        public boolean f5394o;

        /* renamed from: p */
        public boolean f5395p;

        public C5947b() {
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5377a = true;
        this.f5379c = new C5947b();
        m4933i(attributeSet, 0, 0);
    }

    /* renamed from: a */
    public final void m4925a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C5947b c5947b = this.f5379c;
        if (c5947b.f5394o || c5947b.f5395p) {
            indeterminateDrawable.mutate();
            C5947b c5947b2 = this.f5379c;
            m4930f(indeterminateDrawable, c5947b2.f5392m, c5947b2.f5394o, c5947b2.f5393n, c5947b2.f5395p);
        }
    }

    /* renamed from: b */
    public final void m4926b() {
        Drawable drawableM4932h;
        if (getProgressDrawable() == null) {
            return;
        }
        C5947b c5947b = this.f5379c;
        if ((c5947b.f5382c || c5947b.f5383d) && (drawableM4932h = m4932h(R.id.progress, true)) != null) {
            C5947b c5947b2 = this.f5379c;
            m4930f(drawableM4932h, c5947b2.f5380a, c5947b2.f5382c, c5947b2.f5381b, c5947b2.f5383d);
        }
    }

    /* renamed from: c */
    public final void m4927c() {
        Drawable drawableM4932h;
        if (getProgressDrawable() == null) {
            return;
        }
        C5947b c5947b = this.f5379c;
        if ((c5947b.f5390k || c5947b.f5391l) && (drawableM4932h = m4932h(R.id.background, false)) != null) {
            C5947b c5947b2 = this.f5379c;
            m4930f(drawableM4932h, c5947b2.f5388i, c5947b2.f5390k, c5947b2.f5389j, c5947b2.f5391l);
        }
    }

    /* renamed from: d */
    public final void m4928d() {
        if (getProgressDrawable() == null) {
            return;
        }
        m4926b();
        m4927c();
        m4929e();
    }

    /* renamed from: e */
    public final void m4929e() {
        Drawable drawableM4932h;
        if (getProgressDrawable() == null) {
            return;
        }
        C5947b c5947b = this.f5379c;
        if ((c5947b.f5386g || c5947b.f5387h) && (drawableM4932h = m4932h(R.id.secondaryProgress, false)) != null) {
            C5947b c5947b2 = this.f5379c;
            m4930f(drawableM4932h, c5947b2.f5384e, c5947b2.f5386g, c5947b2.f5385f, c5947b2.f5387h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final void m4930f(Drawable drawable, ColorStateList colorStateList, boolean z6, PorterDuff.Mode mode, boolean z7) {
        if (z6 || z7) {
            if (z6) {
                if (drawable instanceof InterfaceC5972y) {
                    ((InterfaceC5972y) drawable).setTintList(colorStateList);
                } else {
                    m4934j();
                    drawable.setTintList(colorStateList);
                }
            }
            if (z7) {
                if (drawable instanceof InterfaceC5972y) {
                    ((InterfaceC5972y) drawable).setTintMode(mode);
                } else {
                    m4934j();
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public final void m4931g() {
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        m4935k();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        m4935k();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        m4935k();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m4935k();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f5378b;
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        m4935k();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        m4935k();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        m4935k();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m4935k();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC5969v) {
            return ((InterfaceC5969v) currentDrawable).mo4923a();
        }
        return false;
    }

    @Nullable
    public ColorStateList getSupportIndeterminateTintList() {
        return this.f5379c.f5392m;
    }

    @Nullable
    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f5379c.f5393n;
    }

    @Nullable
    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f5379c.f5388i;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f5379c.f5389j;
    }

    @Nullable
    public ColorStateList getSupportProgressTintList() {
        return this.f5379c.f5380a;
    }

    @Nullable
    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f5379c.f5381b;
    }

    @Nullable
    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f5379c.f5384e;
    }

    @Nullable
    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f5379c.f5385f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC5967t) {
            return ((InterfaceC5967t) currentDrawable).mo4915d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    /* renamed from: h */
    public final Drawable m4932h(int i6, boolean z6) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i6) : null;
        return (drawableFindDrawableByLayerId == null && z6) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: i */
    public final void m4933i(AttributeSet attributeSet, int i6, int i7) {
        Context context = getContext();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialProgressBar, i6, i7);
        this.f5378b = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_progressStyle, 0);
        boolean z6 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_setBothDrawables, false);
        boolean z7 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
        boolean z8 = tintTypedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialProgressBar_mpb_showProgressBackground, this.f5378b == 1);
        int i8 = tintTypedArrayObtainStyledAttributes.getInt(R$styleable.MaterialProgressBar_mpb_determinateCircularProgressStyle, 0);
        int i9 = R$styleable.MaterialProgressBar_mpb_progressTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f5379c.f5380a = tintTypedArrayObtainStyledAttributes.getColorStateList(i9);
            this.f5379c.f5382c = true;
        }
        int i10 = R$styleable.MaterialProgressBar_mpb_progressTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f5379c.f5381b = AbstractC7690a.m9149a(tintTypedArrayObtainStyledAttributes.getInt(i10, -1), null);
            this.f5379c.f5383d = true;
        }
        int i11 = R$styleable.MaterialProgressBar_mpb_secondaryProgressTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f5379c.f5384e = tintTypedArrayObtainStyledAttributes.getColorStateList(i11);
            this.f5379c.f5386g = true;
        }
        int i12 = R$styleable.MaterialProgressBar_mpb_secondaryProgressTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f5379c.f5385f = AbstractC7690a.m9149a(tintTypedArrayObtainStyledAttributes.getInt(i12, -1), null);
            this.f5379c.f5387h = true;
        }
        int i13 = R$styleable.MaterialProgressBar_mpb_progressBackgroundTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
            this.f5379c.f5388i = tintTypedArrayObtainStyledAttributes.getColorStateList(i13);
            this.f5379c.f5390k = true;
        }
        int i14 = R$styleable.MaterialProgressBar_mpb_progressBackgroundTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
            this.f5379c.f5389j = AbstractC7690a.m9149a(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null);
            this.f5379c.f5391l = true;
        }
        int i15 = R$styleable.MaterialProgressBar_mpb_indeterminateTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f5379c.f5392m = tintTypedArrayObtainStyledAttributes.getColorStateList(i15);
            this.f5379c.f5394o = true;
        }
        int i16 = R$styleable.MaterialProgressBar_mpb_indeterminateTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i16)) {
            this.f5379c.f5393n = AbstractC7690a.m9149a(tintTypedArrayObtainStyledAttributes.getInt(i16, -1), null);
            this.f5379c.f5395p = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        int i17 = this.f5378b;
        if (i17 == 0) {
            if (isIndeterminate() || z6) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context));
            }
            if (!isIndeterminate() || z6) {
                setProgressDrawable(new C5957j(i8, context));
            }
        } else {
            if (i17 != 1) {
                throw new IllegalArgumentException("Unknown progress style: " + this.f5378b);
            }
            if (isIndeterminate() || z6) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context));
            }
            if (!isIndeterminate() || z6) {
                setProgressDrawable(new C5959l(context));
            }
        }
        setUseIntrinsicPadding(z7);
        setShowProgressBackground(z8);
    }

    /* renamed from: j */
    public final void m4934j() {
        Log.w(f5376d, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
    }

    /* renamed from: k */
    public final void m4935k() {
        if (getContext().getApplicationInfo().minSdkVersion >= 21) {
            return;
        }
        Log.w(f5376d, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4931g();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z6) {
        super.setIndeterminate(z6);
        if (this.f5377a && !(getCurrentDrawable() instanceof InterfaceC5968u)) {
            Log.w(f5376d, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f5379c != null) {
            m4925a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        m4935k();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        m4935k();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        m4935k();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        m4935k();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f5379c != null) {
            m4928d();
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
        m4935k();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m4935k();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        m4935k();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        m4935k();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z6) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC5969v) {
            ((InterfaceC5969v) currentDrawable).mo4924b(z6);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC5969v) {
            ((InterfaceC5969v) indeterminateDrawable).mo4924b(z6);
        }
    }

    public void setSupportIndeterminateTintList(@Nullable ColorStateList colorStateList) {
        C5947b c5947b = this.f5379c;
        c5947b.f5392m = colorStateList;
        c5947b.f5394o = true;
        m4925a();
    }

    public void setSupportIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
        C5947b c5947b = this.f5379c;
        c5947b.f5393n = mode;
        c5947b.f5395p = true;
        m4925a();
    }

    public void setSupportProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C5947b c5947b = this.f5379c;
        c5947b.f5388i = colorStateList;
        c5947b.f5390k = true;
        m4927c();
    }

    public void setSupportProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C5947b c5947b = this.f5379c;
        c5947b.f5389j = mode;
        c5947b.f5391l = true;
        m4927c();
    }

    public void setSupportProgressTintList(@Nullable ColorStateList colorStateList) {
        C5947b c5947b = this.f5379c;
        c5947b.f5380a = colorStateList;
        c5947b.f5382c = true;
        m4926b();
    }

    public void setSupportProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C5947b c5947b = this.f5379c;
        c5947b.f5381b = mode;
        c5947b.f5383d = true;
        m4926b();
    }

    public void setSupportSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
        C5947b c5947b = this.f5379c;
        c5947b.f5384e = colorStateList;
        c5947b.f5386g = true;
        m4929e();
    }

    public void setSupportSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
        C5947b c5947b = this.f5379c;
        c5947b.f5385f = mode;
        c5947b.f5387h = true;
        m4929e();
    }

    public void setUseIntrinsicPadding(boolean z6) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC5967t) {
            ((InterfaceC5967t) currentDrawable).mo4914c(z6);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC5967t) {
            ((InterfaceC5967t) indeterminateDrawable).mo4914c(z6);
        }
    }
}
