package com.xuexiang.xui.widget.progress.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* renamed from: com.xuexiang.xui.widget.progress.materialprogressbar.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4187d extends Drawable implements InterfaceC4201r, InterfaceC4206w {

    /* renamed from: b */
    public ColorFilter f4736b;

    /* renamed from: c */
    public ColorStateList f4737c;

    /* renamed from: e */
    public PorterDuffColorFilter f4739e;

    /* renamed from: g */
    public Paint f4741g;

    /* renamed from: a */
    public int f4735a = 255;

    /* renamed from: d */
    public PorterDuff.Mode f4738d = PorterDuff.Mode.SRC_IN;

    /* renamed from: f */
    public C4185b f4740f = new C4185b(this);

    /* renamed from: h */
    public boolean f4742h = true;

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4201r
    /* renamed from: c */
    public final void mo3553c(boolean z8) {
        if (this.f4742h != z8) {
            this.f4742h = z8;
            invalidateSelf();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4201r
    /* renamed from: d */
    public final boolean mo3554d() {
        return this.f4742h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.f4741g == null) {
            Paint paint = new Paint();
            this.f4741g = paint;
            paint.setAntiAlias(true);
            this.f4741g.setColor(ViewCompat.MEASURED_STATE_MASK);
            mo3556f(this.f4741g);
        }
        this.f4741g.setAlpha(this.f4735a);
        Paint paint2 = this.f4741g;
        ColorFilter colorFilter = this.f4736b;
        if (colorFilter == null) {
            colorFilter = this.f4739e;
        }
        paint2.setColorFilter(colorFilter);
        mo3555e(canvas, this.f4741g, iWidth, iHeight);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public abstract void mo3555e(Canvas canvas, Paint paint, int i, int i8);

    /* renamed from: f */
    public abstract void mo3556f(Paint paint);

    /* renamed from: g */
    public final boolean m3557g() {
        ColorStateList colorStateList = this.f4737c;
        if (colorStateList != null && this.f4738d != null) {
            this.f4739e = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f4738d);
            return true;
        }
        boolean z8 = this.f4739e != null;
        this.f4739e = null;
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4735a;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4736b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4740f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f4737c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        return m3557g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4735a != i) {
            this.f4735a = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4736b = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4206w
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4206w
    public final void setTintList(ColorStateList colorStateList) {
        this.f4737c = colorStateList;
        if (m3557g()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.xuexiang.xui.widget.progress.materialprogressbar.InterfaceC4206w
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f4738d = mode;
        if (m3557g()) {
            invalidateSelf();
        }
    }
}
