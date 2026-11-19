package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8210b extends Drawable implements InterfaceC8233y {

    /* renamed from: d */
    public ColorFilter f16826d;

    /* renamed from: e */
    public ColorStateList f16827e;

    /* renamed from: g */
    public PorterDuffColorFilter f16829g;

    /* renamed from: c */
    public int f16825c = 255;

    /* renamed from: f */
    public PorterDuff.Mode f16828f = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public b f16830h = new b();

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
            return AbstractC8210b.this;
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
        mo13147f(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public ColorFilter m13146e() {
        ColorFilter colorFilter = this.f16826d;
        return colorFilter != null ? colorFilter : this.f16829g;
    }

    /* renamed from: f */
    public abstract void mo13147f(Canvas canvas, int i10, int i11);

    /* renamed from: g */
    public final boolean m13148g() {
        ColorStateList colorStateList = this.f16827e;
        if (colorStateList != null && this.f16828f != null) {
            this.f16829g = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f16828f);
            return true;
        }
        boolean z10 = this.f16829g != null;
        this.f16829g = null;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16825c;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f16826d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f16830h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f16827e;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m13148g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f16825c != i10) {
            this.f16825c = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f16826d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public void setTintList(ColorStateList colorStateList) {
        this.f16827e = colorStateList;
        if (m13148g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC8233y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f16828f = mode;
        if (m13148g()) {
            invalidateSelf();
        }
    }
}
