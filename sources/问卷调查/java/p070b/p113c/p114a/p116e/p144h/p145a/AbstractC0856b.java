package p070b.p113c.p114a.p116e.p144h.p145a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: b.c.a.e.h.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0856b extends Drawable implements InterfaceC0878x {

    /* renamed from: c */
    public ColorFilter f4646c;

    /* renamed from: d */
    public ColorStateList f4647d;

    /* renamed from: f */
    public PorterDuffColorFilter f4649f;

    /* renamed from: b */
    public int f4645b = 255;

    /* renamed from: e */
    public PorterDuff.Mode f4648e = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    public b f4650g = new b(null);

    /* renamed from: b.c.a.e.h.a.b$b */
    public class b extends Drawable.ConstantState {
        public b(a aVar) {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return AbstractC0856b.this;
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
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        AbstractC0858d abstractC0858d = (AbstractC0858d) this;
        if (abstractC0858d.f4653h == null) {
            Paint paint = new Paint();
            abstractC0858d.f4653h = paint;
            paint.setAntiAlias(true);
            abstractC0858d.f4653h.setColor(-16777216);
            abstractC0858d.mo2566g(abstractC0858d.f4653h);
        }
        abstractC0858d.f4653h.setAlpha(abstractC0858d.f4645b);
        Paint paint2 = abstractC0858d.f4653h;
        ColorFilter colorFilter = abstractC0858d.f4646c;
        if (colorFilter == null) {
            colorFilter = abstractC0858d.f4649f;
        }
        paint2.setColorFilter(colorFilter);
        abstractC0858d.mo2565f(canvas, iWidth, iHeight, abstractC0858d.f4653h);
        canvas.restoreToCount(iSave);
    }

    /* renamed from: e */
    public final boolean m2561e() {
        ColorStateList colorStateList = this.f4647d;
        if (colorStateList != null && this.f4648e != null) {
            this.f4649f = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f4648e);
            return true;
        }
        boolean z = this.f4649f != null;
        this.f4649f = null;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4645b;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f4646c;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4650g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f4647d;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return m2561e();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f4645b != i) {
            this.f4645b = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4646c = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x
    public void setTintList(ColorStateList colorStateList) {
        this.f4647d = colorStateList;
        if (m2561e()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0878x
    public void setTintMode(PorterDuff.Mode mode) {
        this.f4648e = mode;
        if (m2561e()) {
            invalidateSelf();
        }
    }
}
