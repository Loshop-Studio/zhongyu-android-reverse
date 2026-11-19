package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.xuexiang.xui.R$styleable;
import p196x1.C6742b;
import p196x1.InterfaceC6741a;

/* loaded from: classes3.dex */
public class SuperButton extends AppCompatButton {

    /* renamed from: A */
    public boolean f5071A;

    /* renamed from: B */
    public boolean f5072B;

    /* renamed from: C */
    public int f5073C;

    /* renamed from: D */
    public int f5074D;

    /* renamed from: E */
    public GradientDrawable f5075E;

    /* renamed from: F */
    public C6742b f5076F;

    /* renamed from: a */
    public Context f5077a;

    /* renamed from: b */
    public final int f5078b;

    /* renamed from: c */
    public final int f5079c;

    /* renamed from: d */
    public int f5080d;

    /* renamed from: e */
    public int f5081e;

    /* renamed from: f */
    public int f5082f;

    /* renamed from: g */
    public int f5083g;

    /* renamed from: h */
    public float f5084h;

    /* renamed from: i */
    public float f5085i;

    /* renamed from: j */
    public float f5086j;

    /* renamed from: k */
    public float f5087k;

    /* renamed from: l */
    public float f5088l;

    /* renamed from: m */
    public int f5089m;

    /* renamed from: n */
    public int f5090n;

    /* renamed from: o */
    public float f5091o;

    /* renamed from: p */
    public float f5092p;

    /* renamed from: q */
    public int f5093q;

    /* renamed from: r */
    public int f5094r;

    /* renamed from: s */
    public int f5095s;

    /* renamed from: t */
    public int f5096t;

    /* renamed from: u */
    public int f5097u;

    /* renamed from: v */
    public int f5098v;

    /* renamed from: w */
    public int f5099w;

    /* renamed from: x */
    public int f5100x;

    /* renamed from: y */
    public int f5101y;

    /* renamed from: z */
    public int f5102z;

    public SuperButton(Context context) {
        super(context);
        this.f5078b = 536870912;
        this.f5079c = 536870912;
        m3621b(context, null);
    }

    private InterfaceC6741a getAlphaViewHelper() {
        if (this.f5076F == null) {
            this.f5076F = new C6742b(this);
        }
        return this.f5076F;
    }

    private void setSelectorColor(int i) {
        if (this.f5095s == -1) {
            if (i == -16842910) {
                this.f5075E.setColor(this.f5082f);
            } else if (i == 16842910) {
                this.f5075E.setColor(this.f5083g);
            } else {
                if (i != 16842919) {
                    return;
                }
                this.f5075E.setColor(this.f5081e);
            }
        }
    }

    /* renamed from: a */
    public final GradientDrawable m3620a(int i) {
        GradientDrawable.Orientation orientation;
        int i8;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f5075E = gradientDrawable;
        int i9 = this.f5073C;
        if (i9 == 0) {
            gradientDrawable.setShape(0);
        } else if (i9 == 1) {
            gradientDrawable.setShape(1);
        } else if (i9 == 2) {
            gradientDrawable.setShape(2);
        } else if (i9 == 3) {
            gradientDrawable.setShape(3);
        }
        int i10 = this.f5095s;
        if (i10 != -1) {
            GradientDrawable gradientDrawable2 = this.f5075E;
            switch (i10) {
                case 0:
                    orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                    break;
                case 1:
                    orientation = GradientDrawable.Orientation.TR_BL;
                    break;
                case 2:
                    orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    break;
                case 3:
                    orientation = GradientDrawable.Orientation.BR_TL;
                    break;
                case 4:
                    orientation = GradientDrawable.Orientation.BOTTOM_TOP;
                    break;
                case 5:
                    orientation = GradientDrawable.Orientation.BL_TR;
                    break;
                case 6:
                    orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    break;
                case 7:
                    orientation = GradientDrawable.Orientation.TL_BR;
                    break;
                default:
                    orientation = null;
                    break;
            }
            gradientDrawable2.setOrientation(orientation);
            int i11 = this.f5100x;
            if (i11 == -1) {
                this.f5075E.setColors(new int[]{this.f5099w, this.f5101y});
            } else {
                this.f5075E.setColors(new int[]{this.f5099w, i11, this.f5101y});
            }
            int i12 = this.f5102z;
            if (i12 == 0) {
                this.f5075E.setGradientType(0);
            } else if (i12 == 1) {
                this.f5075E.setGradientType(1);
                this.f5075E.setGradientRadius(this.f5098v);
            } else if (i12 == 2) {
                this.f5075E.setGradientType(2);
            }
            this.f5075E.setUseLevel(this.f5071A);
            int i13 = this.f5096t;
            if (i13 != 0 && (i8 = this.f5097u) != 0) {
                this.f5075E.setGradientCenter(i13, i8);
            }
        } else {
            this.f5075E.setColor(this.f5080d);
        }
        if (this.f5073C == 0) {
            this.f5075E.setSize(this.f5093q, this.f5094r);
        }
        this.f5075E.setStroke(this.f5089m, this.f5090n, this.f5091o, this.f5092p);
        if (this.f5073C == 0) {
            float f = this.f5084h;
            if (f != 0.0f) {
                this.f5075E.setCornerRadius(f);
            } else {
                GradientDrawable gradientDrawable3 = this.f5075E;
                float f7 = this.f5085i;
                float f8 = this.f5086j;
                float f9 = this.f5088l;
                float f10 = this.f5087k;
                gradientDrawable3.setCornerRadii(new float[]{f7, f7, f8, f8, f9, f9, f10, f10});
            }
        }
        setSelectorColor(i);
        return this.f5075E;
    }

    /* renamed from: b */
    public final void m3621b(Context context, AttributeSet attributeSet) {
        this.f5077a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SuperButton);
        this.f5074D = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sGravity, 0);
        this.f5073C = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sShapeType, 0);
        int i = R$styleable.SuperButton_sSolidColor;
        int i8 = this.f5078b;
        this.f5080d = typedArrayObtainStyledAttributes.getColor(i, i8);
        int i9 = R$styleable.SuperButton_sSelectorPressedColor;
        int i10 = this.f5079c;
        this.f5081e = typedArrayObtainStyledAttributes.getColor(i9, i10);
        this.f5082f = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sSelectorDisableColor, i10);
        this.f5083g = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sSelectorNormalColor, i10);
        this.f5084h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersRadius, 0);
        this.f5085i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersTopLeftRadius, 0);
        this.f5086j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersTopRightRadius, 0);
        this.f5087k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersBottomLeftRadius, 0);
        this.f5088l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sCornersBottomRightRadius, 0);
        this.f5089m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sStrokeWidth, 0);
        this.f5091o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sStrokeDashWidth, 0);
        this.f5092p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sStrokeDashGap, 0);
        this.f5090n = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sStrokeColor, i8);
        this.f5093q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sSizeWidth, 0);
        this.f5094r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sSizeHeight, (int) ((48.0f * this.f5077a.getResources().getDisplayMetrics().density) + 0.5f));
        this.f5095s = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sGradientOrientation, -1);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientAngle, 0);
        this.f5096t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientCenterX, 0);
        this.f5097u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientCenterY, 0);
        this.f5098v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperButton_sGradientGradientRadius, 0);
        this.f5099w = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sGradientStartColor, -1);
        this.f5100x = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sGradientCenterColor, -1);
        this.f5101y = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperButton_sGradientEndColor, -1);
        this.f5102z = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperButton_sGradientType, 0);
        this.f5071A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperButton_sGradientUseLevel, false);
        this.f5072B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperButton_sUseSelector, false);
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
        setBackground(this.f5072B ? getSelector() : m3620a(0));
        int i11 = this.f5074D;
        if (i11 == 0) {
            setGravity(17);
            return;
        }
        if (i11 == 1) {
            setGravity(8388627);
            return;
        }
        if (i11 == 2) {
            setGravity(8388629);
        } else if (i11 == 3) {
            setGravity(49);
        } else {
            if (i11 != 4) {
                return;
            }
            setGravity(81);
        }
    }

    /* renamed from: c */
    public final boolean m3622c() {
        return this.f5095s != -1 || this.f5083g == this.f5081e;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m3620a(R.attr.state_pressed));
        stateListDrawable.addState(new int[]{-16842910}, m3620a(-16842910));
        stateListDrawable.addState(new int[0], m3620a(R.attr.state_enabled));
        return stateListDrawable;
    }

    public void setChangeAlphaWhenDisable(boolean z8) {
        if (m3622c()) {
            ((C6742b) getAlphaViewHelper()).m6429c(z8);
        }
    }

    public void setChangeAlphaWhenPress(boolean z8) {
        if (m3622c()) {
            ((C6742b) getAlphaViewHelper()).f11402b = z8;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        if (m3622c()) {
            ((C6742b) getAlphaViewHelper()).m6427a(this, z8);
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        super.setPressed(z8);
        if (m3622c()) {
            ((C6742b) getAlphaViewHelper()).m6428b(this, z8);
        }
    }

    public SuperButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5078b = 536870912;
        this.f5079c = 536870912;
        m3621b(context, attributeSet);
    }

    public SuperButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5078b = 536870912;
        this.f5079c = 536870912;
        m3621b(context, attributeSet);
    }
}
