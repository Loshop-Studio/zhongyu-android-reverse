package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.widget.AppCompatButton;
import p219r2.C9002c;
import p219r2.InterfaceC9000a;

/* loaded from: classes4.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public InterfaceC9000a f6799A;

    /* renamed from: a */
    public int f6800a;

    /* renamed from: b */
    public int f6801b;

    /* renamed from: c */
    public int f6802c;

    /* renamed from: d */
    public int f6803d;

    /* renamed from: e */
    public float f6804e;

    /* renamed from: f */
    public float f6805f;

    /* renamed from: g */
    public float f6806g;

    /* renamed from: h */
    public float f6807h;

    /* renamed from: i */
    public float f6808i;

    /* renamed from: j */
    public int f6809j;

    /* renamed from: k */
    public int f6810k;

    /* renamed from: l */
    public float f6811l;

    /* renamed from: m */
    public float f6812m;

    /* renamed from: n */
    public int f6813n;

    /* renamed from: o */
    public int f6814o;

    /* renamed from: p */
    public int f6815p;

    /* renamed from: q */
    public int f6816q;

    /* renamed from: r */
    public int f6817r;

    /* renamed from: s */
    public int f6818s;

    /* renamed from: t */
    public int f6819t;

    /* renamed from: u */
    public int f6820u;

    /* renamed from: v */
    public int f6821v;

    /* renamed from: w */
    public int f6822w;

    /* renamed from: x */
    public boolean f6823x;

    /* renamed from: y */
    public int f6824y;

    /* renamed from: z */
    public GradientDrawable f6825z;

    private InterfaceC9000a getAlphaViewHelper() {
        if (this.f6799A == null) {
            this.f6799A = new C9002c(this);
        }
        return this.f6799A;
    }

    private void setSelectorColor(int i10) {
        if (this.f6815p == -1) {
            if (i10 == -16842910) {
                this.f6825z.setColor(this.f6802c);
            } else if (i10 == 16842910) {
                this.f6825z.setColor(this.f6803d);
            } else {
                if (i10 != 16842919) {
                    return;
                }
                this.f6825z.setColor(this.f6801b);
            }
        }
    }

    /* renamed from: a */
    public GradientDrawable m5962a(int i10) {
        this.f6825z = new GradientDrawable();
        m5969h();
        m5967f();
        m5970i();
        m5966e();
        m5968g();
        setSelectorColor(i10);
        return this.f6825z;
    }

    /* renamed from: b */
    public final GradientDrawable.Orientation m5963b(int i10) {
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
    public final boolean m5964c() {
        return m5965d() || this.f6803d == this.f6801b;
    }

    /* renamed from: d */
    public final boolean m5965d() {
        return this.f6815p != -1;
    }

    /* renamed from: e */
    public final void m5966e() {
        this.f6825z.setStroke(this.f6809j, this.f6810k, this.f6811l, this.f6812m);
    }

    /* renamed from: f */
    public final void m5967f() {
        int i10;
        if (!m5965d()) {
            this.f6825z.setColor(this.f6800a);
            return;
        }
        this.f6825z.setOrientation(m5963b(this.f6815p));
        int i11 = this.f6820u;
        if (i11 == -1) {
            this.f6825z.setColors(new int[]{this.f6819t, this.f6821v});
        } else {
            this.f6825z.setColors(new int[]{this.f6819t, i11, this.f6821v});
        }
        int i12 = this.f6822w;
        if (i12 == 0) {
            this.f6825z.setGradientType(0);
        } else if (i12 == 1) {
            this.f6825z.setGradientType(1);
            this.f6825z.setGradientRadius(this.f6818s);
        } else if (i12 == 2) {
            this.f6825z.setGradientType(2);
        }
        this.f6825z.setUseLevel(this.f6823x);
        int i13 = this.f6816q;
        if (i13 == 0 || (i10 = this.f6817r) == 0) {
            return;
        }
        this.f6825z.setGradientCenter(i13, i10);
    }

    /* renamed from: g */
    public final void m5968g() {
        if (this.f6824y == 0) {
            float f10 = this.f6804e;
            if (f10 != 0.0f) {
                this.f6825z.setCornerRadius(f10);
                return;
            }
            GradientDrawable gradientDrawable = this.f6825z;
            float f11 = this.f6805f;
            float f12 = this.f6806g;
            float f13 = this.f6808i;
            float f14 = this.f6807h;
            gradientDrawable.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        }
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m5962a(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m5962a(-16842910));
        stateListDrawable.addState(new int[0], m5962a(R.attr.state_enabled));
        return stateListDrawable;
    }

    /* renamed from: h */
    public final void m5969h() {
        int i10 = this.f6824y;
        if (i10 == 0) {
            this.f6825z.setShape(0);
            return;
        }
        if (i10 == 1) {
            this.f6825z.setShape(1);
        } else if (i10 == 2) {
            this.f6825z.setShape(2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f6825z.setShape(3);
        }
    }

    /* renamed from: i */
    public final void m5970i() {
        if (this.f6824y == 0) {
            this.f6825z.setSize(this.f6813n, this.f6814o);
        }
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        if (m5964c()) {
            getAlphaViewHelper().mo15146b(z9);
        }
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        if (m5964c()) {
            getAlphaViewHelper().mo15145a(z9);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (m5964c()) {
            getAlphaViewHelper().mo15147c(this, z9);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        if (m5964c()) {
            getAlphaViewHelper().mo15148d(this, z9);
        }
    }
}
