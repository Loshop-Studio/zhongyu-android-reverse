package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import p000a.p005b.p014h.C0110u0;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.C0788b;
import p070b.p113c.p114a.p116e.p144h.p145a.C0863i;
import p070b.p113c.p114a.p116e.p144h.p145a.C0865k;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0873s;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0874t;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u;
import p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x;

/* loaded from: classes.dex */
public class MaterialProgressBar extends ProgressBar {

    /* renamed from: e */
    public static final String f5407e = MaterialProgressBar.class.getSimpleName();

    /* renamed from: b */
    public boolean f5408b;

    /* renamed from: c */
    public int f5409c;

    /* renamed from: d */
    public C0982b f5410d;

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.MaterialProgressBar$b */
    public static class C0982b {

        /* renamed from: a */
        public ColorStateList f5411a;

        /* renamed from: b */
        public PorterDuff.Mode f5412b;

        /* renamed from: c */
        public boolean f5413c;

        /* renamed from: d */
        public boolean f5414d;

        /* renamed from: e */
        public ColorStateList f5415e;

        /* renamed from: f */
        public PorterDuff.Mode f5416f;

        /* renamed from: g */
        public boolean f5417g;

        /* renamed from: h */
        public boolean f5418h;

        /* renamed from: i */
        public ColorStateList f5419i;

        /* renamed from: j */
        public PorterDuff.Mode f5420j;

        /* renamed from: k */
        public boolean f5421k;

        /* renamed from: l */
        public boolean f5422l;

        /* renamed from: m */
        public ColorStateList f5423m;

        /* renamed from: n */
        public PorterDuff.Mode f5424n;

        /* renamed from: o */
        public boolean f5425o;

        /* renamed from: p */
        public boolean f5426p;

        public C0982b(C0981a c0981a) {
        }
    }

    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
        Drawable c0863i;
        super(context, attributeSet);
        this.f5408b = true;
        this.f5410d = new C0982b(null);
        Context context2 = getContext();
        C0110u0 c0110u0M414q = C0110u0.m414q(context2, attributeSet, C0788b.f4453g, 0, 0);
        this.f5409c = c0110u0M414q.m424j(5, 0);
        boolean zM415a = c0110u0M414q.m415a(10, false);
        boolean zM415a2 = c0110u0M414q.m415a(12, true);
        boolean zM415a3 = c0110u0M414q.m415a(11, this.f5409c == 1);
        int iM424j = c0110u0M414q.m424j(0, 0);
        if (c0110u0M414q.m429o(6)) {
            this.f5410d.f5411a = c0110u0M414q.m417c(6);
            this.f5410d.f5413c = true;
        }
        if (c0110u0M414q.m429o(7)) {
            this.f5410d.f5412b = C0787a.m2491y(c0110u0M414q.m424j(7, -1), null);
            this.f5410d.f5414d = true;
        }
        if (c0110u0M414q.m429o(8)) {
            this.f5410d.f5415e = c0110u0M414q.m417c(8);
            this.f5410d.f5417g = true;
        }
        if (c0110u0M414q.m429o(9)) {
            this.f5410d.f5416f = C0787a.m2491y(c0110u0M414q.m424j(9, -1), null);
            this.f5410d.f5418h = true;
        }
        if (c0110u0M414q.m429o(3)) {
            this.f5410d.f5419i = c0110u0M414q.m417c(3);
            this.f5410d.f5421k = true;
        }
        if (c0110u0M414q.m429o(4)) {
            this.f5410d.f5420j = C0787a.m2491y(c0110u0M414q.m424j(4, -1), null);
            this.f5410d.f5422l = true;
        }
        if (c0110u0M414q.m429o(1)) {
            this.f5410d.f5423m = c0110u0M414q.m417c(1);
            this.f5410d.f5425o = true;
        }
        if (c0110u0M414q.m429o(2)) {
            this.f5410d.f5424n = C0787a.m2491y(c0110u0M414q.m424j(2, -1), null);
            this.f5410d.f5426p = true;
        }
        c0110u0M414q.f810b.recycle();
        int i = this.f5409c;
        if (i == 0) {
            if (isIndeterminate() || zM415a) {
                setIndeterminateDrawable(new IndeterminateCircularProgressDrawable(context2));
            }
            if (!isIndeterminate() || zM415a) {
                c0863i = new C0863i(iM424j, context2);
                setProgressDrawable(c0863i);
            }
        } else {
            if (i != 1) {
                StringBuilder sbM2079g = C0561a.m2079g("Unknown progress style: ");
                sbM2079g.append(this.f5409c);
                throw new IllegalArgumentException(sbM2079g.toString());
            }
            if (isIndeterminate() || zM415a) {
                setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context2));
            }
            if (!isIndeterminate() || zM415a) {
                c0863i = new C0865k(context2);
                setProgressDrawable(c0863i);
            }
        }
        setUseIntrinsicPadding(zM415a2);
        setShowProgressBackground(zM415a3);
    }

    /* renamed from: a */
    public final void m2783a() {
        Drawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        C0982b c0982b = this.f5410d;
        if (c0982b.f5425o || c0982b.f5426p) {
            indeterminateDrawable.mutate();
            C0982b c0982b2 = this.f5410d;
            m2787e(indeterminateDrawable, c0982b2.f5423m, c0982b2.f5425o, c0982b2.f5424n, c0982b2.f5426p);
        }
    }

    /* renamed from: b */
    public final void m2784b() {
        Drawable drawableM2788f;
        if (getProgressDrawable() == null) {
            return;
        }
        C0982b c0982b = this.f5410d;
        if ((c0982b.f5413c || c0982b.f5414d) && (drawableM2788f = m2788f(R.id.progress, true)) != null) {
            C0982b c0982b2 = this.f5410d;
            m2787e(drawableM2788f, c0982b2.f5411a, c0982b2.f5413c, c0982b2.f5412b, c0982b2.f5414d);
        }
    }

    /* renamed from: c */
    public final void m2785c() {
        Drawable drawableM2788f;
        if (getProgressDrawable() == null) {
            return;
        }
        C0982b c0982b = this.f5410d;
        if ((c0982b.f5421k || c0982b.f5422l) && (drawableM2788f = m2788f(R.id.background, false)) != null) {
            C0982b c0982b2 = this.f5410d;
            m2787e(drawableM2788f, c0982b2.f5419i, c0982b2.f5421k, c0982b2.f5420j, c0982b2.f5422l);
        }
    }

    /* renamed from: d */
    public final void m2786d() {
        Drawable drawableM2788f;
        if (getProgressDrawable() == null) {
            return;
        }
        C0982b c0982b = this.f5410d;
        if ((c0982b.f5417g || c0982b.f5418h) && (drawableM2788f = m2788f(R.id.secondaryProgress, false)) != null) {
            C0982b c0982b2 = this.f5410d;
            m2787e(drawableM2788f, c0982b2.f5415e, c0982b2.f5417g, c0982b2.f5416f, c0982b2.f5418h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public final void m2787e(Drawable drawable, ColorStateList colorStateList, boolean z, PorterDuff.Mode mode, boolean z2) {
        String str = f5407e;
        if (z || z2) {
            if (z) {
                if (drawable instanceof InterfaceC0878x) {
                    ((InterfaceC0878x) drawable).setTintList(colorStateList);
                } else {
                    Log.w(str, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable.setTintList(colorStateList);
                }
            }
            if (z2) {
                if (drawable instanceof InterfaceC0878x) {
                    ((InterfaceC0878x) drawable).setTintMode(mode);
                } else {
                    Log.w(str, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
                    drawable.setTintMode(mode);
                }
            }
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        }
    }

    /* renamed from: f */
    public final Drawable m2788f(int i, boolean z) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable == null) {
            return null;
        }
        progressDrawable.mutate();
        Drawable drawableFindDrawableByLayerId = progressDrawable instanceof LayerDrawable ? ((LayerDrawable) progressDrawable).findDrawableByLayerId(i) : null;
        return (drawableFindDrawableByLayerId == null && z) ? progressDrawable : drawableFindDrawableByLayerId;
    }

    /* renamed from: g */
    public final void m2789g() {
        if (Build.VERSION.SDK_INT < 24 || getContext().getApplicationInfo().minSdkVersion < 21) {
            Log.w(f5407e, "Non-support version of tint method called, this is error-prone and will crash below Lollipop if you are calling it as a method of ProgressBar instead of MaterialProgressBar");
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getIndeterminateTintList() {
        m2789g();
        return getSupportIndeterminateTintList();
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getIndeterminateTintMode() {
        m2789g();
        return getSupportIndeterminateTintMode();
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getProgressBackgroundTintList() {
        m2789g();
        return getSupportProgressBackgroundTintList();
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        m2789g();
        return getSupportProgressBackgroundTintMode();
    }

    public int getProgressStyle() {
        return this.f5409c;
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getProgressTintList() {
        m2789g();
        return getSupportProgressTintList();
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getProgressTintMode() {
        m2789g();
        return getSupportProgressTintMode();
    }

    @Override // android.widget.ProgressBar
    public ColorStateList getSecondaryProgressTintList() {
        m2789g();
        return getSupportSecondaryProgressTintList();
    }

    @Override // android.widget.ProgressBar
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        m2789g();
        return getSupportSecondaryProgressTintMode();
    }

    public boolean getShowProgressBackground() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC0875u) {
            return ((InterfaceC0875u) currentDrawable).mo2567a();
        }
        return false;
    }

    public ColorStateList getSupportIndeterminateTintList() {
        return this.f5410d.f5423m;
    }

    public PorterDuff.Mode getSupportIndeterminateTintMode() {
        return this.f5410d.f5424n;
    }

    public ColorStateList getSupportProgressBackgroundTintList() {
        return this.f5410d.f5419i;
    }

    public PorterDuff.Mode getSupportProgressBackgroundTintMode() {
        return this.f5410d.f5420j;
    }

    public ColorStateList getSupportProgressTintList() {
        return this.f5410d.f5411a;
    }

    public PorterDuff.Mode getSupportProgressTintMode() {
        return this.f5410d.f5412b;
    }

    public ColorStateList getSupportSecondaryProgressTintList() {
        return this.f5410d.f5415e;
    }

    public PorterDuff.Mode getSupportSecondaryProgressTintMode() {
        return this.f5410d.f5416f;
    }

    public boolean getUseIntrinsicPadding() {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC0873s) {
            return ((InterfaceC0873s) currentDrawable).mo2564d();
        }
        throw new IllegalStateException("Drawable does not implement IntrinsicPaddingDrawable");
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        super.setIndeterminate(z);
        if (this.f5408b && !(getCurrentDrawable() instanceof InterfaceC0874t)) {
            Log.w(f5407e, "Current drawable is not a MaterialProgressDrawable, you may want to set app:mpb_setBothDrawables");
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f5410d != null) {
            m2783a();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(ColorStateList colorStateList) {
        m2789g();
        setSupportIndeterminateTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(PorterDuff.Mode mode) {
        m2789g();
        setSupportIndeterminateTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(ColorStateList colorStateList) {
        m2789g();
        setSupportProgressBackgroundTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(PorterDuff.Mode mode) {
        m2789g();
        setSupportProgressBackgroundTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        if (this.f5410d == null || getProgressDrawable() == null) {
            return;
        }
        m2784b();
        m2785c();
        m2786d();
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintList(ColorStateList colorStateList) {
        m2789g();
        setSupportProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setProgressTintMode(PorterDuff.Mode mode) {
        m2789g();
        setSupportProgressTintMode(mode);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(ColorStateList colorStateList) {
        m2789g();
        setSupportSecondaryProgressTintList(colorStateList);
    }

    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(PorterDuff.Mode mode) {
        m2789g();
        setSupportSecondaryProgressTintMode(mode);
    }

    public void setShowProgressBackground(boolean z) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC0875u) {
            ((InterfaceC0875u) currentDrawable).mo2568b(z);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC0875u) {
            ((InterfaceC0875u) indeterminateDrawable).mo2568b(z);
        }
    }

    public void setSupportIndeterminateTintList(ColorStateList colorStateList) {
        C0982b c0982b = this.f5410d;
        c0982b.f5423m = colorStateList;
        c0982b.f5425o = true;
        m2783a();
    }

    public void setSupportIndeterminateTintMode(PorterDuff.Mode mode) {
        C0982b c0982b = this.f5410d;
        c0982b.f5424n = mode;
        c0982b.f5426p = true;
        m2783a();
    }

    public void setSupportProgressBackgroundTintList(ColorStateList colorStateList) {
        C0982b c0982b = this.f5410d;
        c0982b.f5419i = colorStateList;
        c0982b.f5421k = true;
        m2785c();
    }

    public void setSupportProgressBackgroundTintMode(PorterDuff.Mode mode) {
        C0982b c0982b = this.f5410d;
        c0982b.f5420j = mode;
        c0982b.f5422l = true;
        m2785c();
    }

    public void setSupportProgressTintList(ColorStateList colorStateList) {
        C0982b c0982b = this.f5410d;
        c0982b.f5411a = colorStateList;
        c0982b.f5413c = true;
        m2784b();
    }

    public void setSupportProgressTintMode(PorterDuff.Mode mode) {
        C0982b c0982b = this.f5410d;
        c0982b.f5412b = mode;
        c0982b.f5414d = true;
        m2784b();
    }

    public void setSupportSecondaryProgressTintList(ColorStateList colorStateList) {
        C0982b c0982b = this.f5410d;
        c0982b.f5415e = colorStateList;
        c0982b.f5417g = true;
        m2786d();
    }

    public void setSupportSecondaryProgressTintMode(PorterDuff.Mode mode) {
        C0982b c0982b = this.f5410d;
        c0982b.f5416f = mode;
        c0982b.f5418h = true;
        m2786d();
    }

    public void setUseIntrinsicPadding(boolean z) {
        Object currentDrawable = getCurrentDrawable();
        if (currentDrawable instanceof InterfaceC0873s) {
            ((InterfaceC0873s) currentDrawable).mo2563c(z);
        }
        Object indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable instanceof InterfaceC0873s) {
            ((InterfaceC0873s) indeterminateDrawable).mo2563c(z);
        }
    }
}
