package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p005b.p014h.C0077e;
import p000a.p005b.p014h.C0083h;
import p000a.p005b.p014h.C0100p0;
import p000a.p005b.p014h.C0104r0;
import p000a.p005b.p014h.C0109u;

/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton {

    /* renamed from: b */
    public final C0083h f2854b;

    /* renamed from: c */
    public final C0077e f2855c;

    /* renamed from: d */
    public final C0109u f2856d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1088R.attr.radioButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        C0104r0.m382a(context);
        C0100p0.m376a(this, getContext());
        C0083h c0083h = new C0083h(this);
        this.f2854b = c0083h;
        c0083h.m322b(attributeSet, i);
        C0077e c0077e = new C0077e(this);
        this.f2855c = c0077e;
        c0077e.m303d(attributeSet, i);
        C0109u c0109u = new C0109u(this);
        this.f2856d = c0109u;
        c0109u.m402e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            c0077e.m300a();
        }
        C0109u c0109u = this.f2856d;
        if (c0109u != null) {
            c0109u.m400b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0083h c0083h = this.f2854b;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            return c0077e.m301b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            return c0077e.m302c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0083h c0083h = this.f2854b;
        if (c0083h != null) {
            return c0083h.f636b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0083h c0083h = this.f2854b;
        if (c0083h != null) {
            return c0083h.f637c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            c0077e.m304e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            c0077e.m305f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0034a.m129a(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0083h c0083h = this.f2854b;
        if (c0083h != null) {
            if (c0083h.f640f) {
                c0083h.f640f = false;
            } else {
                c0083h.f640f = true;
                c0083h.m321a();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            c0077e.m307h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0077e c0077e = this.f2855c;
        if (c0077e != null) {
            c0077e.m308i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0083h c0083h = this.f2854b;
        if (c0083h != null) {
            c0083h.f636b = colorStateList;
            c0083h.f638d = true;
            c0083h.m321a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0083h c0083h = this.f2854b;
        if (c0083h != null) {
            c0083h.f637c = mode;
            c0083h.f639e = true;
            c0083h.m321a();
        }
    }
}
