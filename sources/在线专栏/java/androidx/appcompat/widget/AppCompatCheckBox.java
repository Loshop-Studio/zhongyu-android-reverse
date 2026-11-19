package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p015c.C1038a;
import p073d.C2443a;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox {
    private final C0207d mBackgroundTintHelper;
    private final C0209e mCompoundButtonHelper;
    private final C0225m mTextHelper;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m770b();
        }
        C0225m c0225m = this.mTextHelper;
        if (c0225m != null) {
            c0225m.m924b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0209e c0209e = this.mCompoundButtonHelper;
        return c0209e != null ? c0209e.m782b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m771c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            return c0207d.m772d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0209e c0209e = this.mCompoundButtonHelper;
        if (c0209e != null) {
            return c0209e.m783c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0209e c0209e = this.mCompoundButtonHelper;
        if (c0209e != null) {
            return c0209e.m784d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m774f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m775g(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0209e c0209e = this.mCompoundButtonHelper;
        if (c0209e != null) {
            c0209e.m786f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m777i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0207d c0207d = this.mBackgroundTintHelper;
        if (c0207d != null) {
            c0207d.m778j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0209e c0209e = this.mCompoundButtonHelper;
        if (c0209e != null) {
            c0209e.m787g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0209e c0209e = this.mCompoundButtonHelper;
        if (c0209e != null) {
            c0209e.m788h(mode);
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5754r);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i4) {
        super(C0208d0.m780b(context), attributeSet, i4);
        C0204b0.m762a(this, getContext());
        C0209e c0209e = new C0209e(this);
        this.mCompoundButtonHelper = c0209e;
        c0209e.m785e(attributeSet, i4);
        C0207d c0207d = new C0207d(this);
        this.mBackgroundTintHelper = c0207d;
        c0207d.m773e(attributeSet, i4);
        C0225m c0225m = new C0225m(this);
        this.mTextHelper = c0225m;
        c0225m.m934m(attributeSet, i4);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i4) {
        setButtonDrawable(C2443a.m8169d(getContext(), i4));
    }
}
