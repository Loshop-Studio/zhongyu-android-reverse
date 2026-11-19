package p156u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: u.d */
/* loaded from: classes.dex */
class C3406d extends Drawable implements Drawable.Callback, InterfaceC3405c, InterfaceC3404b {

    /* renamed from: g */
    static final PorterDuff.Mode f11956g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    private int f11957a;

    /* renamed from: b */
    private PorterDuff.Mode f11958b;

    /* renamed from: c */
    private boolean f11959c;

    /* renamed from: d */
    C3408f f11960d;

    /* renamed from: e */
    private boolean f11961e;

    /* renamed from: f */
    Drawable f11962f;

    C3406d(C3408f c3408f, Resources resources) {
        this.f11960d = c3408f;
        m10405e(resources);
    }

    /* renamed from: d */
    private C3408f m10404d() {
        return new C3408f(this.f11960d);
    }

    /* renamed from: e */
    private void m10405e(Resources resources) {
        Drawable.ConstantState constantState;
        C3408f c3408f = this.f11960d;
        if (c3408f == null || (constantState = c3408f.f11965b) == null) {
            return;
        }
        mo10402a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    private boolean m10406f(int[] iArr) {
        if (!mo10407c()) {
            return false;
        }
        C3408f c3408f = this.f11960d;
        ColorStateList colorStateList = c3408f.f11966c;
        PorterDuff.Mode mode = c3408f.f11967d;
        if (colorStateList == null || mode == null) {
            this.f11959c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f11959c || colorForState != this.f11957a || mode != this.f11958b) {
                setColorFilter(colorForState, mode);
                this.f11957a = colorForState;
                this.f11958b = mode;
                this.f11959c = true;
                return true;
            }
        }
        return false;
    }

    @Override // p156u.InterfaceC3405c
    /* renamed from: a */
    public final void mo10402a(Drawable drawable) {
        Drawable drawable2 = this.f11962f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11962f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C3408f c3408f = this.f11960d;
            if (c3408f != null) {
                c3408f.f11965b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // p156u.InterfaceC3405c
    /* renamed from: b */
    public final Drawable mo10403b() {
        return this.f11962f;
    }

    /* renamed from: c */
    protected boolean mo10407c() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f11962f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C3408f c3408f = this.f11960d;
        return changingConfigurations | (c3408f != null ? c3408f.getChangingConfigurations() : 0) | this.f11962f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C3408f c3408f = this.f11960d;
        if (c3408f == null || !c3408f.m10409a()) {
            return null;
        }
        this.f11960d.f11964a = getChangingConfigurations();
        return this.f11960d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f11962f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11962f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11962f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C3403a.m10389f(this.f11962f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f11962f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f11962f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f11962f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f11962f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f11962f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f11962f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C3403a.m10391h(this.f11962f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C3408f c3408f;
        ColorStateList colorStateList = (!mo10407c() || (c3408f = this.f11960d) == null) ? null : c3408f.f11966c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f11962f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f11962f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f11961e && super.mutate() == this) {
            this.f11960d = m10404d();
            Drawable drawable = this.f11962f;
            if (drawable != null) {
                drawable.mutate();
            }
            C3408f c3408f = this.f11960d;
            if (c3408f != null) {
                Drawable drawable2 = this.f11962f;
                c3408f.f11965b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f11961e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11962f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i4) {
        return C3403a.m10396m(this.f11962f, i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        return this.f11962f.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f11962f.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        C3403a.m10393j(this.f11962f, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f11962f.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11962f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f11962f.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f11962f.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m10406f(iArr) || this.f11962f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f11960d.f11966c = colorStateList;
        m10406f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f11960d.f11967d = mode;
        m10406f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        return super.setVisible(z3, z4) || this.f11962f.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C3406d(Drawable drawable) {
        this.f11960d = m10404d();
        mo10402a(drawable);
    }
}
