package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3610b extends Drawable implements InterfaceC3633y {

    /* renamed from: b */
    public ColorFilter f3880b;

    /* renamed from: c */
    public ColorStateList f3881c;

    /* renamed from: e */
    public PorterDuffColorFilter f3883e;

    /* renamed from: a */
    public int f3879a = 255;

    /* renamed from: d */
    public PorterDuff.Mode f3882d = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    public b f3884f = new b();

    /* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.b$b */
    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return AbstractC3610b.this;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        mo4563f(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public ColorFilter m4562e() {
        ColorFilter colorFilter = this.f3880b;
        return colorFilter != null ? colorFilter : this.f3883e;
    }

    /* renamed from: f */
    public abstract void mo4563f(Canvas canvas, int i4, int i5);

    /* renamed from: g */
    public final boolean m4564g() {
        ColorStateList colorStateList = this.f3881c;
        if (colorStateList != null && this.f3882d != null) {
            this.f3883e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f3882d);
            return true;
        }
        boolean z3 = this.f3883e != null;
        this.f3883e = null;
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3879a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f3880b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3884f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f3881c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m4564g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (this.f3879a != i4) {
            this.f3879a = i4;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3880b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public void setTintList(ColorStateList colorStateList) {
        this.f3881c = colorStateList;
        if (m4564g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC3633y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3882d = mode;
        if (m4564g()) {
            invalidateSelf();
        }
    }
}
