package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.widget.AppCompatButton;
import p206p1.C9638c;
import p206p1.InterfaceC9636a;

/* loaded from: classes4.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public InterfaceC9636a f8280A;

    /* renamed from: a */
    public int f8281a;

    /* renamed from: b */
    public int f8282b;

    /* renamed from: c */
    public int f8283c;

    /* renamed from: d */
    public int f8284d;

    /* renamed from: e */
    public float f8285e;

    /* renamed from: f */
    public float f8286f;

    /* renamed from: g */
    public float f8287g;

    /* renamed from: h */
    public float f8288h;

    /* renamed from: i */
    public float f8289i;

    /* renamed from: j */
    public int f8290j;

    /* renamed from: k */
    public int f8291k;

    /* renamed from: l */
    public float f8292l;

    /* renamed from: m */
    public float f8293m;

    /* renamed from: n */
    public int f8294n;

    /* renamed from: o */
    public int f8295o;

    /* renamed from: p */
    public int f8296p;

    /* renamed from: q */
    public int f8297q;

    /* renamed from: r */
    public int f8298r;

    /* renamed from: s */
    public int f8299s;

    /* renamed from: t */
    public int f8300t;

    /* renamed from: u */
    public int f8301u;

    /* renamed from: v */
    public int f8302v;

    /* renamed from: w */
    public int f8303w;

    /* renamed from: x */
    public boolean f8304x;

    /* renamed from: y */
    public int f8305y;

    /* renamed from: z */
    public GradientDrawable f8306z;

    private InterfaceC9636a getAlphaViewHelper() {
        if (this.f8280A == null) {
            this.f8280A = new C9638c(this);
        }
        return this.f8280A;
    }

    private void setSelectorColor(int i10) {
        if (this.f8296p == -1) {
            if (i10 == -16842910) {
                this.f8306z.setColor(this.f8283c);
            } else if (i10 == 16842910) {
                this.f8306z.setColor(this.f8284d);
            } else {
                if (i10 != 16842919) {
                    return;
                }
                this.f8306z.setColor(this.f8282b);
            }
        }
    }

    /* renamed from: a */
    public GradientDrawable m7211a(int i10) {
        this.f8306z = new GradientDrawable();
        m7218h();
        m7216f();
        m7219i();
        m7215e();
        m7217g();
        setSelectorColor(i10);
        return this.f8306z;
    }

    /* renamed from: b */
    public final GradientDrawable.Orientation m7212b(int i10) {
        switch (i10) {
            case 0:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 1:
                return GradientDrawable.Orientation.TR_BL;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.BR_TL;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.BL_TR;
            case 6:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 7:
                return GradientDrawable.Orientation.TL_BR;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final boolean m7213c() {
        return m7214d() || this.f8284d == this.f8282b;
    }

    /* renamed from: d */
    public final boolean m7214d() {
        return this.f8296p != -1;
    }

    /* renamed from: e */
    public final void m7215e() {
        this.f8306z.setStroke(this.f8290j, this.f8291k, this.f8292l, this.f8293m);
    }

    /* renamed from: f */
    public final void m7216f() {
        int i10;
        if (!m7214d()) {
            this.f8306z.setColor(this.f8281a);
            return;
        }
        this.f8306z.setOrientation(m7212b(this.f8296p));
        int i11 = this.f8301u;
        if (i11 == -1) {
            this.f8306z.setColors(new int[]{this.f8300t, this.f8302v});
        } else {
            this.f8306z.setColors(new int[]{this.f8300t, i11, this.f8302v});
        }
        int i12 = this.f8303w;
        if (i12 == 0) {
            this.f8306z.setGradientType(0);
        } else if (i12 == 1) {
            this.f8306z.setGradientType(1);
            this.f8306z.setGradientRadius(this.f8299s);
        } else if (i12 == 2) {
            this.f8306z.setGradientType(2);
        }
        this.f8306z.setUseLevel(this.f8304x);
        int i13 = this.f8297q;
        if (i13 == 0 || (i10 = this.f8298r) == 0) {
            return;
        }
        this.f8306z.setGradientCenter(i13, i10);
    }

    /* renamed from: g */
    public final void m7217g() {
        if (this.f8305y == 0) {
            float f10 = this.f8285e;
            if (f10 != 0.0f) {
                this.f8306z.setCornerRadius(f10);
                return;
            }
            GradientDrawable gradientDrawable = this.f8306z;
            float f11 = this.f8286f;
            float f12 = this.f8287g;
            float f13 = this.f8289i;
            float f14 = this.f8288h;
            gradientDrawable.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        }
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m7211a(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m7211a(-16842910));
        stateListDrawable.addState(new int[0], m7211a(R.attr.state_enabled));
        return stateListDrawable;
    }

    /* renamed from: h */
    public final void m7218h() {
        int i10 = this.f8305y;
        if (i10 == 0) {
            this.f8306z.setShape(0);
            return;
        }
        if (i10 == 1) {
            this.f8306z.setShape(1);
        } else if (i10 == 2) {
            this.f8306z.setShape(2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f8306z.setShape(3);
        }
    }

    /* renamed from: i */
    public final void m7219i() {
        if (this.f8305y == 0) {
            this.f8306z.setSize(this.f8294n, this.f8295o);
        }
    }

    public void setChangeAlphaWhenDisable(boolean z10) {
        if (m7213c()) {
            getAlphaViewHelper().mo18202b(z10);
        }
    }

    public void setChangeAlphaWhenPress(boolean z10) {
        if (m7213c()) {
            getAlphaViewHelper().mo18201a(z10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (m7213c()) {
            getAlphaViewHelper().mo18203c(this, z10);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        if (m7213c()) {
            getAlphaViewHelper().mo18204d(this, z10);
        }
    }
}
