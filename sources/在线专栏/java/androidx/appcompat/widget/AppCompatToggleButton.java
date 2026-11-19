package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton {

    /* renamed from: a */
    private final C0207d f873a;

    /* renamed from: b */
    private final C0225m f874b;

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            c0207d.m770b();
        }
        C0225m c0225m = this.f874b;
        if (c0225m != null) {
            c0225m.m924b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            return c0207d.m771c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            return c0207d.m772d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            c0207d.m774f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            c0207d.m775g(i4);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            c0207d.m777i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207d c0207d = this.f873a;
        if (c0207d != null) {
            c0207d.m778j(mode);
        }
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0207d c0207d = new C0207d(this);
        this.f873a = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0225m c0225m = new C0225m(this);
        this.f874b = c0225m;
        c0225m.m934m(attributeSet, i4);
    }
}
