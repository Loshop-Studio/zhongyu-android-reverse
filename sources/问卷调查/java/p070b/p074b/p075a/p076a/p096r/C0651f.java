package p070b.p074b.p075a.p076a.p096r;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p000a.p005b.p014h.C0080f0;
import p070b.p074b.p075a.p076a.C0564b;

/* renamed from: b.b.a.a.r.f */
/* loaded from: classes.dex */
public class C0651f extends C0080f0 {

    /* renamed from: q */
    public Drawable f3927q;

    /* renamed from: r */
    public final Rect f3928r;

    /* renamed from: s */
    public final Rect f3929s;

    /* renamed from: t */
    public int f3930t;

    /* renamed from: u */
    public boolean f3931u;

    /* renamed from: v */
    public boolean f3932v;

    public C0651f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0651f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3928r = new Rect();
        this.f3929s = new Rect();
        this.f3930t = 119;
        this.f3931u = true;
        this.f3932v = false;
        int[] iArr = C0564b.f3513h;
        C0655j.m2266a(context, attributeSet, i, 0);
        C0655j.m2267b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f3930t = typedArrayObtainStyledAttributes.getInt(1, this.f3930t);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3931u = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3927q;
        if (drawable != null) {
            if (this.f3932v) {
                this.f3932v = false;
                Rect rect = this.f3928r;
                Rect rect2 = this.f3929s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f3931u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f3930t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f3927q;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3927q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3927q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3927q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3930t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3927q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p000a.p005b.p014h.C0080f0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3932v = z | this.f3932v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f3932v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3927q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3927q);
            }
            this.f3927q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3930t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f3930t != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f3930t = i;
            if (i == 119 && this.f3927q != null) {
                this.f3927q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3927q;
    }
}
