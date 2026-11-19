package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.widget.AppCompatButton;
import p147s1.C7689c;
import p147s1.InterfaceC7687a;

/* loaded from: classes3.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public InterfaceC7687a f5523A;

    /* renamed from: a */
    public int f5524a;

    /* renamed from: b */
    public int f5525b;

    /* renamed from: c */
    public int f5526c;

    /* renamed from: d */
    public int f5527d;

    /* renamed from: e */
    public float f5528e;

    /* renamed from: f */
    public float f5529f;

    /* renamed from: g */
    public float f5530g;

    /* renamed from: h */
    public float f5531h;

    /* renamed from: i */
    public float f5532i;

    /* renamed from: j */
    public int f5533j;

    /* renamed from: k */
    public int f5534k;

    /* renamed from: l */
    public float f5535l;

    /* renamed from: m */
    public float f5536m;

    /* renamed from: n */
    public int f5537n;

    /* renamed from: o */
    public int f5538o;

    /* renamed from: p */
    public int f5539p;

    /* renamed from: q */
    public int f5540q;

    /* renamed from: r */
    public int f5541r;

    /* renamed from: s */
    public int f5542s;

    /* renamed from: t */
    public int f5543t;

    /* renamed from: u */
    public int f5544u;

    /* renamed from: v */
    public int f5545v;

    /* renamed from: w */
    public int f5546w;

    /* renamed from: x */
    public boolean f5547x;

    /* renamed from: y */
    public int f5548y;

    /* renamed from: z */
    public GradientDrawable f5549z;

    private InterfaceC7687a getAlphaViewHelper() {
        if (this.f5523A == null) {
            this.f5523A = new C7689c(this);
        }
        return this.f5523A;
    }

    private void setSelectorColor(int i6) {
        if (this.f5539p == -1) {
            if (i6 == -16842910) {
                this.f5549z.setColor(this.f5526c);
            } else if (i6 == 16842910) {
                this.f5549z.setColor(this.f5527d);
            } else {
                if (i6 != 16842919) {
                    return;
                }
                this.f5549z.setColor(this.f5525b);
            }
        }
    }

    /* renamed from: a */
    public GradientDrawable m4977a(int i6) {
        this.f5549z = new GradientDrawable();
        m4984h();
        m4982f();
        m4985i();
        m4981e();
        m4983g();
        setSelectorColor(i6);
        return this.f5549z;
    }

    /* renamed from: b */
    public final GradientDrawable.Orientation m4978b(int i6) {
        switch (i6) {
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
    public final boolean m4979c() {
        return m4980d() || this.f5527d == this.f5525b;
    }

    /* renamed from: d */
    public final boolean m4980d() {
        return this.f5539p != -1;
    }

    /* renamed from: e */
    public final void m4981e() {
        this.f5549z.setStroke(this.f5533j, this.f5534k, this.f5535l, this.f5536m);
    }

    /* renamed from: f */
    public final void m4982f() {
        int i6;
        if (!m4980d()) {
            this.f5549z.setColor(this.f5524a);
            return;
        }
        this.f5549z.setOrientation(m4978b(this.f5539p));
        int i7 = this.f5544u;
        if (i7 == -1) {
            this.f5549z.setColors(new int[]{this.f5543t, this.f5545v});
        } else {
            this.f5549z.setColors(new int[]{this.f5543t, i7, this.f5545v});
        }
        int i8 = this.f5546w;
        if (i8 == 0) {
            this.f5549z.setGradientType(0);
        } else if (i8 == 1) {
            this.f5549z.setGradientType(1);
            this.f5549z.setGradientRadius(this.f5542s);
        } else if (i8 == 2) {
            this.f5549z.setGradientType(2);
        }
        this.f5549z.setUseLevel(this.f5547x);
        int i9 = this.f5540q;
        if (i9 == 0 || (i6 = this.f5541r) == 0) {
            return;
        }
        this.f5549z.setGradientCenter(i9, i6);
    }

    /* renamed from: g */
    public final void m4983g() {
        if (this.f5548y == 0) {
            float f6 = this.f5528e;
            if (f6 != 0.0f) {
                this.f5549z.setCornerRadius(f6);
                return;
            }
            GradientDrawable gradientDrawable = this.f5549z;
            float f7 = this.f5529f;
            float f8 = this.f5530g;
            float f9 = this.f5532i;
            float f10 = this.f5531h;
            gradientDrawable.setCornerRadii(new float[]{f7, f7, f8, f8, f9, f9, f10, f10});
        }
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m4977a(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m4977a(-16842910));
        stateListDrawable.addState(new int[0], m4977a(R.attr.state_enabled));
        return stateListDrawable;
    }

    /* renamed from: h */
    public final void m4984h() {
        int i6 = this.f5548y;
        if (i6 == 0) {
            this.f5549z.setShape(0);
            return;
        }
        if (i6 == 1) {
            this.f5549z.setShape(1);
        } else if (i6 == 2) {
            this.f5549z.setShape(2);
        } else {
            if (i6 != 3) {
                return;
            }
            this.f5549z.setShape(3);
        }
    }

    /* renamed from: i */
    public final void m4985i() {
        if (this.f5548y == 0) {
            this.f5549z.setSize(this.f5537n, this.f5538o);
        }
    }

    public void setChangeAlphaWhenDisable(boolean z6) {
        if (m4979c()) {
            getAlphaViewHelper().mo9146b(z6);
        }
    }

    public void setChangeAlphaWhenPress(boolean z6) {
        if (m4979c()) {
            getAlphaViewHelper().mo9145a(z6);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        if (m4979c()) {
            getAlphaViewHelper().mo9147c(this, z6);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        super.setPressed(z6);
        if (m4979c()) {
            getAlphaViewHelper().mo9148d(this, z6);
        }
    }
}
