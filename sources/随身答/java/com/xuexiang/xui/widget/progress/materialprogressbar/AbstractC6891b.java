package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.b */
/* loaded from: classes4.dex */
public abstract class AbstractC6891b extends Drawable implements InterfaceC6914y {

    /* renamed from: b */
    public ColorFilter f7950b;

    /* renamed from: c */
    public ColorStateList f7951c;

    /* renamed from: e */
    public PorterDuffColorFilter f7953e;

    /* renamed from: a */
    public int f7949a = 255;

    /* renamed from: d */
    public PorterDuff.Mode f7952d = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    public b f7954f = new b();

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
            return AbstractC6891b.this;
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
        mo7030f(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public ColorFilter m7029e() {
        ColorFilter colorFilter = this.f7950b;
        return colorFilter != null ? colorFilter : this.f7953e;
    }

    /* renamed from: f */
    public abstract void mo7030f(Canvas canvas, int i9, int i10);

    /* renamed from: g */
    public final boolean m7031g() {
        ColorStateList colorStateList = this.f7951c;
        if (colorStateList != null && this.f7952d != null) {
            this.f7953e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f7952d);
            return true;
        }
        boolean z9 = this.f7953e != null;
        this.f7953e = null;
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f7949a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f7950b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f7954f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f7951c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m7031g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        if (this.f7949a != i9) {
            this.f7949a = i9;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7950b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public void setTintList(ColorStateList colorStateList) {
        this.f7951c = colorStateList;
        if (m7031g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6914y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f7952d = mode;
        if (m7031g()) {
            invalidateSelf();
        }
    }
}
