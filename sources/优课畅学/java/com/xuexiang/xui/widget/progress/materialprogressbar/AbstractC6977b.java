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
public abstract class AbstractC6977b extends Drawable implements InterfaceC7000y {

    /* renamed from: b */
    public ColorFilter f8114b;

    /* renamed from: c */
    public ColorStateList f8115c;

    /* renamed from: e */
    public ColorFilter f8117e;

    /* renamed from: a */
    public int f8113a = 255;

    /* renamed from: d */
    public PorterDuff.Mode f8116d = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    public b f8118f = new b();

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
            return AbstractC6977b.this;
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
        mo7122f(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public ColorFilter m7121e() {
        ColorFilter colorFilter = this.f8114b;
        return colorFilter != null ? colorFilter : this.f8117e;
    }

    /* renamed from: f */
    public abstract void mo7122f(Canvas canvas, int i10, int i11);

    /* renamed from: g */
    public final boolean m7123g() {
        ColorStateList colorStateList = this.f8115c;
        if (colorStateList != null && this.f8116d != null) {
            this.f8117e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f8116d);
            return true;
        }
        boolean z10 = this.f8117e != null;
        this.f8117e = null;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8113a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f8114b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8118f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f8115c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m7123g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f8113a != i10) {
            this.f8113a = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8114b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public void setTintList(ColorStateList colorStateList) {
        this.f8115c = colorStateList;
        if (m7123g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC7000y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f8116d = mode;
        if (m7123g()) {
            invalidateSelf();
        }
    }
}
