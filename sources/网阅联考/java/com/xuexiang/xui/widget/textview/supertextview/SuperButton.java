package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.appcompat.widget.AppCompatButton;
import p089l0.C4336c;
import p089l0.InterfaceC4334a;

/* loaded from: classes2.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public InterfaceC4334a f3971A;

    /* renamed from: a */
    public int f3972a;

    /* renamed from: b */
    public int f3973b;

    /* renamed from: c */
    public int f3974c;

    /* renamed from: d */
    public int f3975d;

    /* renamed from: e */
    public float f3976e;

    /* renamed from: f */
    public float f3977f;

    /* renamed from: g */
    public float f3978g;

    /* renamed from: h */
    public float f3979h;

    /* renamed from: i */
    public float f3980i;

    /* renamed from: j */
    public int f3981j;

    /* renamed from: k */
    public int f3982k;

    /* renamed from: l */
    public float f3983l;

    /* renamed from: m */
    public float f3984m;

    /* renamed from: n */
    public int f3985n;

    /* renamed from: o */
    public int f3986o;

    /* renamed from: p */
    public int f3987p;

    /* renamed from: q */
    public int f3988q;

    /* renamed from: r */
    public int f3989r;

    /* renamed from: s */
    public int f3990s;

    /* renamed from: t */
    public int f3991t;

    /* renamed from: u */
    public int f3992u;

    /* renamed from: v */
    public int f3993v;

    /* renamed from: w */
    public int f3994w;

    /* renamed from: x */
    public boolean f3995x;

    /* renamed from: y */
    public int f3996y;

    /* renamed from: z */
    public GradientDrawable f3997z;

    private InterfaceC4334a getAlphaViewHelper() {
        if (this.f3971A == null) {
            this.f3971A = new C4336c(this);
        }
        return this.f3971A;
    }

    private void setSelectorColor(int i4) {
        if (this.f3987p == -1) {
            if (i4 == -16842910) {
                this.f3997z.setColor(this.f3974c);
            } else if (i4 == 16842910) {
                this.f3997z.setColor(this.f3975d);
            } else {
                if (i4 != 16842919) {
                    return;
                }
                this.f3997z.setColor(this.f3973b);
            }
        }
    }

    /* renamed from: a */
    public GradientDrawable m4588a(int i4) {
        this.f3997z = new GradientDrawable();
        m4595h();
        m4593f();
        m4596i();
        m4592e();
        m4594g();
        setSelectorColor(i4);
        return this.f3997z;
    }

    /* renamed from: b */
    public final GradientDrawable.Orientation m4589b(int i4) {
        switch (i4) {
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
    public final boolean m4590c() {
        return m4591d() || this.f3975d == this.f3973b;
    }

    /* renamed from: d */
    public final boolean m4591d() {
        return this.f3987p != -1;
    }

    /* renamed from: e */
    public final void m4592e() {
        this.f3997z.setStroke(this.f3981j, this.f3982k, this.f3983l, this.f3984m);
    }

    /* renamed from: f */
    public final void m4593f() {
        int i4;
        if (!m4591d()) {
            this.f3997z.setColor(this.f3972a);
            return;
        }
        this.f3997z.setOrientation(m4589b(this.f3987p));
        int i5 = this.f3992u;
        if (i5 == -1) {
            this.f3997z.setColors(new int[]{this.f3991t, this.f3993v});
        } else {
            this.f3997z.setColors(new int[]{this.f3991t, i5, this.f3993v});
        }
        int i6 = this.f3994w;
        if (i6 == 0) {
            this.f3997z.setGradientType(0);
        } else if (i6 == 1) {
            this.f3997z.setGradientType(1);
            this.f3997z.setGradientRadius(this.f3990s);
        } else if (i6 == 2) {
            this.f3997z.setGradientType(2);
        }
        this.f3997z.setUseLevel(this.f3995x);
        int i7 = this.f3988q;
        if (i7 == 0 || (i4 = this.f3989r) == 0) {
            return;
        }
        this.f3997z.setGradientCenter(i7, i4);
    }

    /* renamed from: g */
    public final void m4594g() {
        if (this.f3996y == 0) {
            float f4 = this.f3976e;
            if (f4 != 0.0f) {
                this.f3997z.setCornerRadius(f4);
                return;
            }
            GradientDrawable gradientDrawable = this.f3997z;
            float f5 = this.f3977f;
            float f6 = this.f3978g;
            float f7 = this.f3980i;
            float f8 = this.f3979h;
            gradientDrawable.setCornerRadii(new float[]{f5, f5, f6, f6, f7, f7, f8, f8});
        }
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m4588a(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m4588a(-16842910));
        stateListDrawable.addState(new int[0], m4588a(R.attr.state_enabled));
        return stateListDrawable;
    }

    /* renamed from: h */
    public final void m4595h() {
        int i4 = this.f3996y;
        if (i4 == 0) {
            this.f3997z.setShape(0);
            return;
        }
        if (i4 == 1) {
            this.f3997z.setShape(1);
        } else if (i4 == 2) {
            this.f3997z.setShape(2);
        } else {
            if (i4 != 3) {
                return;
            }
            this.f3997z.setShape(3);
        }
    }

    /* renamed from: i */
    public final void m4596i() {
        if (this.f3996y == 0) {
            this.f3997z.setSize(this.f3985n, this.f3986o);
        }
    }

    public void setChangeAlphaWhenDisable(boolean z3) {
        if (m4590c()) {
            getAlphaViewHelper().mo5347b(z3);
        }
    }

    public void setChangeAlphaWhenPress(boolean z3) {
        if (m4590c()) {
            getAlphaViewHelper().mo5346a(z3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (m4590c()) {
            getAlphaViewHelper().mo5348c(this, z3);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        super.setPressed(z3);
        if (m4590c()) {
            getAlphaViewHelper().mo5349d(this, z3);
        }
    }
}
