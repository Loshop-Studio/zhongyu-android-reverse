package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.R$styleable;
import p046c8.C5407b;
import p046c8.InterfaceC5406a;

/* loaded from: classes5.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public int f17473A;

    /* renamed from: B */
    public int f17474B;

    /* renamed from: C */
    public int f17475C;

    /* renamed from: D */
    public boolean f17476D;

    /* renamed from: E */
    public boolean f17477E;

    /* renamed from: F */
    public int f17478F;

    /* renamed from: G */
    public int f17479G;

    /* renamed from: H */
    public GradientDrawable f17480H;

    /* renamed from: I */
    public InterfaceC5406a f17481I;

    /* renamed from: c */
    public Context f17482c;

    /* renamed from: d */
    public int f17483d;

    /* renamed from: e */
    public int f17484e;

    /* renamed from: f */
    public int f17485f;

    /* renamed from: g */
    public int f17486g;

    /* renamed from: h */
    public int f17487h;

    /* renamed from: i */
    public int f17488i;

    /* renamed from: j */
    public float f17489j;

    /* renamed from: k */
    public float f17490k;

    /* renamed from: l */
    public float f17491l;

    /* renamed from: m */
    public float f17492m;

    /* renamed from: n */
    public float f17493n;

    /* renamed from: o */
    public int f17494o;

    /* renamed from: p */
    public int f17495p;

    /* renamed from: q */
    public float f17496q;

    /* renamed from: r */
    public float f17497r;

    /* renamed from: s */
    public int f17498s;

    /* renamed from: t */
    public int f17499t;

    /* renamed from: u */
    public int f17500u;

    /* renamed from: v */
    public int f17501v;

    /* renamed from: w */
    public int f17502w;

    /* renamed from: x */
    public int f17503x;

    /* renamed from: y */
    public int f17504y;

    /* renamed from: z */
    public int f17505z;

    public SuperButton(Context context) {
        super(context);
        this.f17483d = 536870912;
        this.f17484e = 536870912;
        m13625f(context, null);
    }

    /* renamed from: a */
    private int m13623a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: e */
    private void m13624e() {
        setClickable(true);
        setBackground(this.f17477E ? getSelector() : m13627c(0));
        m13634l();
    }

    /* renamed from: f */
    private void m13625f(Context context, AttributeSet attributeSet) {
        this.f17482c = context;
        m13626b(attributeSet);
        m13624e();
    }

    private InterfaceC5406a getAlphaViewHelper() {
        if (this.f17481I == null) {
            this.f17481I = new C5407b(this);
        }
        return this.f17481I;
    }

    private void setSelectorColor(int i10) {
        if (this.f17500u == -1) {
            if (i10 == -16842910) {
                this.f17480H.setColor(this.f17487h);
            } else if (i10 == 16842910) {
                this.f17480H.setColor(this.f17488i);
            } else {
                if (i10 != 16842919) {
                    return;
                }
                this.f17480H.setColor(this.f17486g);
            }
        }
    }

    /* renamed from: b */
    public final void m13626b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f17482c.obtainStyledAttributes(attributeSet, R$styleable.SuperButton);
        this.f17479G = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sGravity, 0);
        this.f17478F = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sShapeType, 0);
        this.f17485f = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sSolidColor, this.f17483d);
        this.f17486g = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sSelectorPressedColor, this.f17484e);
        this.f17487h = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sSelectorDisableColor, this.f17484e);
        this.f17488i = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sSelectorNormalColor, this.f17484e);
        this.f17489j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersRadius, 0);
        this.f17490k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersTopLeftRadius, 0);
        this.f17491l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersTopRightRadius, 0);
        this.f17492m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersBottomLeftRadius, 0);
        this.f17493n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersBottomRightRadius, 0);
        this.f17494o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sStrokeWidth, 0);
        this.f17496q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sStrokeDashWidth, 0);
        this.f17497r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sStrokeDashGap, 0);
        this.f17495p = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sStrokeColor, this.f17483d);
        this.f17498s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sSizeWidth, 0);
        this.f17499t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sSizeHeight, m13623a(this.f17482c, 48.0f));
        this.f17500u = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sGradientOrientation, -1);
        this.f17501v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientAngle, 0);
        this.f17502w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientCenterX, 0);
        this.f17503x = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientCenterY, 0);
        this.f17504y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientGradientRadius, 0);
        this.f17505z = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sGradientStartColor, -1);
        this.f17473A = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sGradientCenterColor, -1);
        this.f17474B = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sGradientEndColor, -1);
        this.f17475C = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sGradientType, 0);
        this.f17476D = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperButton_sGradientUseLevel, false);
        this.f17477E = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperButton_sUseSelector, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public GradientDrawable m13627c(int i10) {
        this.f17480H = new GradientDrawable();
        m13635m();
        m13632j();
        m13636n();
        m13631i();
        m13633k();
        setSelectorColor(i10);
        return this.f17480H;
    }

    /* renamed from: d */
    public final GradientDrawable.Orientation m13628d(int i10) {
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

    /* renamed from: g */
    public final boolean m13629g() {
        return m13630h() || this.f17488i == this.f17486g;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m13627c(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m13627c(-16842910));
        stateListDrawable.addState(new int[0], m13627c(R.attr.state_enabled));
        return stateListDrawable;
    }

    /* renamed from: h */
    public final boolean m13630h() {
        return this.f17500u != -1;
    }

    /* renamed from: i */
    public final void m13631i() {
        this.f17480H.setStroke(this.f17494o, this.f17495p, this.f17496q, this.f17497r);
    }

    /* renamed from: j */
    public final void m13632j() {
        int i10;
        if (!m13630h()) {
            this.f17480H.setColor(this.f17485f);
            return;
        }
        this.f17480H.setOrientation(m13628d(this.f17500u));
        int i11 = this.f17473A;
        if (i11 == -1) {
            this.f17480H.setColors(new int[]{this.f17505z, this.f17474B});
        } else {
            this.f17480H.setColors(new int[]{this.f17505z, i11, this.f17474B});
        }
        int i12 = this.f17475C;
        if (i12 == 0) {
            this.f17480H.setGradientType(0);
        } else if (i12 == 1) {
            this.f17480H.setGradientType(1);
            this.f17480H.setGradientRadius(this.f17504y);
        } else if (i12 == 2) {
            this.f17480H.setGradientType(2);
        }
        this.f17480H.setUseLevel(this.f17476D);
        int i13 = this.f17502w;
        if (i13 == 0 || (i10 = this.f17503x) == 0) {
            return;
        }
        this.f17480H.setGradientCenter(i13, i10);
    }

    /* renamed from: k */
    public final void m13633k() {
        if (this.f17478F == 0) {
            float f10 = this.f17489j;
            if (f10 != 0.0f) {
                this.f17480H.setCornerRadius(f10);
                return;
            }
            GradientDrawable gradientDrawable = this.f17480H;
            float f11 = this.f17490k;
            float f12 = this.f17491l;
            float f13 = this.f17493n;
            float f14 = this.f17492m;
            gradientDrawable.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
        }
    }

    /* renamed from: l */
    public final void m13634l() {
        int i10 = this.f17479G;
        if (i10 == 0) {
            setGravity(17);
            return;
        }
        if (i10 == 1) {
            setGravity(8388627);
            return;
        }
        if (i10 == 2) {
            setGravity(8388629);
        } else if (i10 == 3) {
            setGravity(49);
        } else {
            if (i10 != 4) {
                return;
            }
            setGravity(81);
        }
    }

    /* renamed from: m */
    public final void m13635m() {
        int i10 = this.f17478F;
        if (i10 == 0) {
            this.f17480H.setShape(0);
            return;
        }
        if (i10 == 1) {
            this.f17480H.setShape(1);
        } else if (i10 == 2) {
            this.f17480H.setShape(2);
        } else {
            if (i10 != 3) {
                return;
            }
            this.f17480H.setShape(3);
        }
    }

    /* renamed from: n */
    public final void m13636n() {
        if (this.f17478F == 0) {
            this.f17480H.setSize(this.f17498s, this.f17499t);
        }
    }

    public void setChangeAlphaWhenDisable(boolean z10) {
        if (m13629g()) {
            getAlphaViewHelper().mo2843b(z10);
        }
    }

    public void setChangeAlphaWhenPress(boolean z10) {
        if (m13629g()) {
            getAlphaViewHelper().mo2842a(z10);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (m13629g()) {
            getAlphaViewHelper().mo2844c(this, z10);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        if (m13629g()) {
            getAlphaViewHelper().mo2845d(this, z10);
        }
    }

    public SuperButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17483d = 536870912;
        this.f17484e = 536870912;
        m13625f(context, attributeSet);
    }

    public SuperButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17483d = 536870912;
        this.f17484e = 536870912;
        m13625f(context, attributeSet);
    }
}
