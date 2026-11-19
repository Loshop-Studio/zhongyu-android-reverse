package p000a.p005b.p014h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: a.b.h.y */
/* loaded from: classes.dex */
public class C0117y extends ToggleButton {

    /* renamed from: b */
    public final C0077e f868b;

    /* renamed from: c */
    public final C0109u f869c;

    public C0117y(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        C0100p0.m376a(this, getContext());
        C0077e c0077e = new C0077e(this);
        this.f868b = c0077e;
        c0077e.m303d(attributeSet, R.attr.buttonStyleToggle);
        C0109u c0109u = new C0109u(this);
        this.f869c = c0109u;
        c0109u.m402e(attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.f869c;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f868b;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }
}
