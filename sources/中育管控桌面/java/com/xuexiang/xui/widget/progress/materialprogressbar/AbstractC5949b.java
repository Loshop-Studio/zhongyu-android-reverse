package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5949b extends Drawable implements InterfaceC5972y {

    /* renamed from: b */
    public ColorFilter f5401b;

    /* renamed from: c */
    public ColorStateList f5402c;

    /* renamed from: e */
    public ColorFilter f5404e;

    /* renamed from: a */
    public int f5400a = 255;

    /* renamed from: d */
    public PorterDuff.Mode f5403d = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    public b f5405f = new b();

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
            return AbstractC5949b.this;
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
        mo4941f(canvas, bounds.width(), bounds.height());
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public ColorFilter m4940e() {
        ColorFilter colorFilter = this.f5401b;
        return colorFilter != null ? colorFilter : this.f5404e;
    }

    /* renamed from: f */
    public abstract void mo4941f(Canvas canvas, int i6, int i7);

    /* renamed from: g */
    public final boolean m4942g() {
        ColorStateList colorStateList = this.f5402c;
        if (colorStateList != null && this.f5403d != null) {
            this.f5404e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f5403d);
            return true;
        }
        boolean z6 = this.f5404e != null;
        this.f5404e = null;
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5400a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5401b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5405f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f5402c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m4942g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        if (this.f5400a != i6) {
            this.f5400a = i6;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5401b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public void setTintList(ColorStateList colorStateList) {
        this.f5402c = colorStateList;
        if (m4942g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC5972y
    public void setTintMode(PorterDuff.Mode mode) {
        this.f5403d = mode;
        if (m4942g()) {
            invalidateSelf();
        }
    }
}
