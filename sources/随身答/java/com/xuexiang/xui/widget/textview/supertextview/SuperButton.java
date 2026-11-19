package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.widget.AppCompatButton;
import p125h3.C8095c;
import p125h3.InterfaceC8093a;

/* loaded from: classes4.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public InterfaceC8093a f8041A;

    /* renamed from: a */
    public int f8042a;

    /* renamed from: b */
    public int f8043b;

    /* renamed from: c */
    public int f8044c;

    /* renamed from: d */
    public int f8045d;

    /* renamed from: e */
    public float f8046e;

    /* renamed from: f */
    public float f8047f;

    /* renamed from: g */
    public float f8048g;

    /* renamed from: h */
    public float f8049h;

    /* renamed from: i */
    public float f8050i;

    /* renamed from: j */
    public int f8051j;

    /* renamed from: k */
    public int f8052k;

    /* renamed from: l */
    public float f8053l;

    /* renamed from: m */
    public float f8054m;

    /* renamed from: n */
    public int f8055n;

    /* renamed from: o */
    public int f8056o;

    /* renamed from: p */
    public int f8057p;

    /* renamed from: q */
    public int f8058q;

    /* renamed from: r */
    public int f8059r;

    /* renamed from: s */
    public int f8060s;

    /* renamed from: t */
    public int f8061t;

    /* renamed from: u */
    public int f8062u;

    /* renamed from: v */
    public int f8063v;

    /* renamed from: w */
    public int f8064w;

    /* renamed from: x */
    public boolean f8065x;

    /* renamed from: y */
    public int f8066y;

    /* renamed from: z */
    public GradientDrawable f8067z;

    private InterfaceC8093a getAlphaViewHelper() {
        if (this.f8041A == null) {
            this.f8041A = new C8095c(this);
        }
        return this.f8041A;
    }

    private void setSelectorColor(int i9) {
        if (this.f8057p == -1) {
            if (i9 == -16842910) {
                this.f8067z.setColor(this.f8044c);
            } else if (i9 == 16842910) {
                this.f8067z.setColor(this.f8045d);
            } else {
                if (i9 != 16842919) {
                    return;
                }
                this.f8067z.setColor(this.f8043b);
            }
        }
    }

    /* renamed from: a */
    public GradientDrawable m7055a(int i9) {
        this.f8067z = new GradientDrawable();
        m7062h();
        m7060f();
        m7063i();
        m7059e();
        m7061g();
        setSelectorColor(i9);
        return this.f8067z;
    }

    /* renamed from: b */
    public final GradientDrawable.Orientation m7056b(int i9) {
        switch (i9) {
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
    public final boolean m7057c() {
        return m7058d() || this.f8045d == this.f8043b;
    }

    /* renamed from: d */
    public final boolean m7058d() {
        return this.f8057p != -1;
    }

    /* renamed from: e */
    public final void m7059e() {
        this.f8067z.setStroke(this.f8051j, this.f8052k, this.f8053l, this.f8054m);
    }

    /* renamed from: f */
    public final void m7060f() {
        int i9;
        if (!m7058d()) {
            this.f8067z.setColor(this.f8042a);
            return;
        }
        this.f8067z.setOrientation(m7056b(this.f8057p));
        int i10 = this.f8062u;
        if (i10 == -1) {
            this.f8067z.setColors(new int[]{this.f8061t, this.f8063v});
        } else {
            this.f8067z.setColors(new int[]{this.f8061t, i10, this.f8063v});
        }
        int i11 = this.f8064w;
        if (i11 == 0) {
            this.f8067z.setGradientType(0);
        } else if (i11 == 1) {
            this.f8067z.setGradientType(1);
            this.f8067z.setGradientRadius(this.f8060s);
        } else if (i11 == 2) {
            this.f8067z.setGradientType(2);
        }
        this.f8067z.setUseLevel(this.f8065x);
        int i12 = this.f8058q;
        if (i12 == 0 || (i9 = this.f8059r) == 0) {
            return;
        }
        this.f8067z.setGradientCenter(i12, i9);
    }

    /* renamed from: g */
    public final void m7061g() {
        if (this.f8066y == 0) {
            float f10 = this.f8046e;
            if (f10 != 0.0f) {
                this.f8067z.setCornerRadius(f10);
                return;
            }
            GradientDrawable gradientDrawable = this.f8067z;
            float f11 = this.f8047f;
            float f12 = this.f8048g;
            float f13 = this.f8050i;
            float f14 = this.f8049h;
            gradientDrawable.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        }
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m7055a(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m7055a(-16842910));
        stateListDrawable.addState(new int[0], m7055a(R.attr.state_enabled));
        return stateListDrawable;
    }

    /* renamed from: h */
    public final void m7062h() {
        int i9 = this.f8066y;
        if (i9 == 0) {
            this.f8067z.setShape(0);
            return;
        }
        if (i9 == 1) {
            this.f8067z.setShape(1);
        } else if (i9 == 2) {
            this.f8067z.setShape(2);
        } else {
            if (i9 != 3) {
                return;
            }
            this.f8067z.setShape(3);
        }
    }

    /* renamed from: i */
    public final void m7063i() {
        if (this.f8066y == 0) {
            this.f8067z.setSize(this.f8055n, this.f8056o);
        }
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        if (m7057c()) {
            getAlphaViewHelper().mo12929b(z9);
        }
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        if (m7057c()) {
            getAlphaViewHelper().mo12928a(z9);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (m7057c()) {
            getAlphaViewHelper().mo12930c(this, z9);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        if (m7057c()) {
            getAlphaViewHelper().mo12931d(this, z9);
        }
    }
}
