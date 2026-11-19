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
public abstract class AbstractC6571b extends Drawable implements InterfaceC6594y {

    /* renamed from: b */
    public ColorFilter f6692b;

    /* renamed from: c */
    public ColorStateList f6693c;

    /* renamed from: e */
    public ColorFilter f6695e;

    /* renamed from: a */
    public int f6691a = 255;

    /* renamed from: d */
    public PorterDuff.Mode f6694d = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    public b f6696f = new b();

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
            return AbstractC6571b.this;
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
        mo5932f(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public ColorFilter m5931e() {
        ColorFilter colorFilter = this.f6692b;
        return colorFilter != null ? colorFilter : this.f6695e;
    }

    /* renamed from: f */
    public abstract void mo5932f(Canvas canvas, int i10, int i11);

    /* renamed from: g */
    public final boolean m5933g() {
        ColorStateList colorStateList = this.f6693c;
        if (colorStateList != null && this.f6694d != null) {
            this.f6695e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f6694d);
            return true;
        }
        boolean z9 = this.f6695e != null;
        this.f6695e = null;
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6691a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f6692b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f6696f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f6693c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m5933g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f6691a != i10) {
            this.f6691a = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6692b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public void setTintList(ColorStateList colorStateList) {
        this.f6693c = colorStateList;
        if (m5933g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC6594y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f6694d = mode;
        if (m5933g()) {
            invalidateSelf();
        }
    }
}
