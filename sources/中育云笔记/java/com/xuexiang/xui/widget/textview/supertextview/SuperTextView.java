package com.xuexiang.xui.widget.textview.supertextview;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.xuexiang.xui.widget.edittext.PasswordEditText;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes5.dex */
public class SuperTextView extends RelativeLayout implements HasTypeface {

    /* renamed from: A */
    public int f17506A;

    /* renamed from: A0 */
    public int f17507A0;

    /* renamed from: A1 */
    public Drawable f17508A1;

    /* renamed from: B */
    public int f17509B;

    /* renamed from: B0 */
    public int f17510B0;

    /* renamed from: B1 */
    public CompoundButton.OnCheckedChangeListener f17511B1;

    /* renamed from: C */
    public int f17512C;

    /* renamed from: C0 */
    public int f17513C0;

    /* renamed from: C1 */
    public CompoundButton.OnCheckedChangeListener f17514C1;

    /* renamed from: D */
    public String f17515D;

    /* renamed from: D0 */
    public boolean f17516D0;

    /* renamed from: D1 */
    public boolean f17517D1;

    /* renamed from: E */
    public String f17518E;

    /* renamed from: E0 */
    public boolean f17519E0;

    /* renamed from: E1 */
    public EditText f17520E1;

    /* renamed from: F */
    public String f17521F;

    /* renamed from: F0 */
    public boolean f17522F0;

    /* renamed from: F1 */
    public int f17523F1;

    /* renamed from: G */
    public String f17524G;

    /* renamed from: G0 */
    public boolean f17525G0;

    /* renamed from: G1 */
    public int f17526G1;

    /* renamed from: H */
    public String f17527H;

    /* renamed from: H0 */
    public boolean f17528H0;

    /* renamed from: H1 */
    public Drawable f17529H1;

    /* renamed from: I */
    public String f17530I;

    /* renamed from: I0 */
    public boolean f17531I0;

    /* renamed from: I1 */
    public String f17532I1;

    /* renamed from: J */
    public String f17533J;

    /* renamed from: J0 */
    public boolean f17534J0;

    /* renamed from: J1 */
    public String f17535J1;

    /* renamed from: K */
    public String f17536K;

    /* renamed from: K0 */
    public boolean f17537K0;

    /* renamed from: K1 */
    public int f17538K1;

    /* renamed from: L */
    public String f17539L;

    /* renamed from: L0 */
    public boolean f17540L0;

    /* renamed from: L1 */
    public boolean f17541L1;

    /* renamed from: M */
    public int f17542M;

    /* renamed from: M0 */
    public Drawable f17543M0;

    /* renamed from: M1 */
    public int f17544M1;

    /* renamed from: N */
    public int f17545N;

    /* renamed from: N0 */
    public Drawable f17546N0;

    /* renamed from: N1 */
    public CheckBox f17547N1;

    /* renamed from: O */
    public int f17548O;

    /* renamed from: O0 */
    public Drawable f17549O0;

    /* renamed from: O1 */
    public Drawable f17550O1;

    /* renamed from: P */
    public int f17551P;

    /* renamed from: P0 */
    public Drawable f17552P0;

    /* renamed from: P1 */
    public int f17553P1;

    /* renamed from: Q */
    public int f17554Q;

    /* renamed from: Q0 */
    public Drawable f17555Q0;

    /* renamed from: Q1 */
    public boolean f17556Q1;

    /* renamed from: R */
    public int f17557R;

    /* renamed from: R0 */
    public Drawable f17558R0;

    /* renamed from: R1 */
    public int f17559R1;

    /* renamed from: S */
    public int f17560S;

    /* renamed from: S0 */
    public Drawable f17561S0;

    /* renamed from: S1 */
    public Switch f17562S1;

    /* renamed from: T */
    public int f17563T;

    /* renamed from: T0 */
    public Drawable f17564T0;

    /* renamed from: T1 */
    public int f17565T1;

    /* renamed from: U */
    public int f17566U;

    /* renamed from: U0 */
    public Drawable f17567U0;

    /* renamed from: U1 */
    public boolean f17568U1;

    /* renamed from: V */
    public int f17569V;

    /* renamed from: V0 */
    public int f17570V0;

    /* renamed from: V1 */
    public String f17571V1;

    /* renamed from: W */
    public int f17572W;

    /* renamed from: W0 */
    public int f17573W0;

    /* renamed from: W1 */
    public String f17574W1;

    /* renamed from: X0 */
    public int f17575X0;

    /* renamed from: X1 */
    public int f17576X1;

    /* renamed from: Y0 */
    public int f17577Y0;

    /* renamed from: Y1 */
    public int f17578Y1;

    /* renamed from: Z0 */
    public int f17579Z0;

    /* renamed from: Z1 */
    public int f17580Z1;

    /* renamed from: a1 */
    public int f17581a1;

    /* renamed from: a2 */
    public Drawable f17582a2;

    /* renamed from: b1 */
    public int f17583b1;

    /* renamed from: b2 */
    public Drawable f17584b2;

    /* renamed from: c */
    public Context f17585c;

    /* renamed from: c1 */
    public int f17586c1;

    /* renamed from: c2 */
    public int f17587c2;

    /* renamed from: d */
    public BaseTextView f17588d;

    /* renamed from: d1 */
    public int f17589d1;

    /* renamed from: d2 */
    public int f17590d2;

    /* renamed from: e */
    public BaseTextView f17591e;

    /* renamed from: e0 */
    public int f17592e0;

    /* renamed from: e1 */
    public int f17593e1;

    /* renamed from: e2 */
    public int f17594e2;

    /* renamed from: f */
    public BaseTextView f17595f;

    /* renamed from: f0 */
    public int f17596f0;

    /* renamed from: f1 */
    public int f17597f1;

    /* renamed from: f2 */
    public int f17598f2;

    /* renamed from: g */
    public RelativeLayout.LayoutParams f17599g;

    /* renamed from: g0 */
    public int f17600g0;

    /* renamed from: g1 */
    public View f17601g1;

    /* renamed from: g2 */
    public float f17602g2;

    /* renamed from: h */
    public RelativeLayout.LayoutParams f17603h;

    /* renamed from: h0 */
    public int f17604h0;

    /* renamed from: h1 */
    public View f17605h1;

    /* renamed from: h2 */
    public float f17606h2;

    /* renamed from: i */
    public RelativeLayout.LayoutParams f17607i;

    /* renamed from: i0 */
    public int f17608i0;

    /* renamed from: i1 */
    public RelativeLayout.LayoutParams f17609i1;

    /* renamed from: i2 */
    public float f17610i2;

    /* renamed from: j */
    public ImageView f17611j;

    /* renamed from: j0 */
    public int f17612j0;

    /* renamed from: j1 */
    public RelativeLayout.LayoutParams f17613j1;

    /* renamed from: j2 */
    public float f17614j2;

    /* renamed from: k */
    public ImageView f17615k;

    /* renamed from: k0 */
    public int f17616k0;

    /* renamed from: k1 */
    public int f17617k1;

    /* renamed from: k2 */
    public float f17618k2;

    /* renamed from: l */
    public RelativeLayout.LayoutParams f17619l;

    /* renamed from: l0 */
    public int f17620l0;

    /* renamed from: l1 */
    public int f17621l1;

    /* renamed from: l2 */
    public int f17622l2;

    /* renamed from: m */
    public RelativeLayout.LayoutParams f17623m;

    /* renamed from: m0 */
    public int f17624m0;

    /* renamed from: m1 */
    public int f17625m1;

    /* renamed from: m2 */
    public int f17626m2;

    /* renamed from: n */
    public Drawable f17627n;

    /* renamed from: n0 */
    public int f17628n0;

    /* renamed from: n1 */
    public int f17629n1;

    /* renamed from: n2 */
    public float f17630n2;

    /* renamed from: o */
    public int f17631o;

    /* renamed from: o0 */
    public int f17632o0;

    /* renamed from: o1 */
    public int f17633o1;

    /* renamed from: o2 */
    public float f17634o2;

    /* renamed from: p */
    public int f17635p;

    /* renamed from: p0 */
    public int f17636p0;

    /* renamed from: p1 */
    public int f17637p1;

    /* renamed from: p2 */
    public boolean f17638p2;

    /* renamed from: q */
    public int f17639q;

    /* renamed from: q0 */
    public int f17640q0;

    /* renamed from: q1 */
    public int f17641q1;

    /* renamed from: q2 */
    public GradientDrawable f17642q2;

    /* renamed from: r */
    public ColorStateList f17643r;

    /* renamed from: r0 */
    public int f17644r0;

    /* renamed from: r1 */
    public int f17645r1;

    /* renamed from: s */
    public int f17646s;

    /* renamed from: s0 */
    public int f17647s0;

    /* renamed from: s1 */
    public int f17648s1;

    /* renamed from: t */
    public Drawable f17649t;

    /* renamed from: t0 */
    public int f17650t0;

    /* renamed from: t1 */
    public int f17651t1;

    /* renamed from: u */
    public int f17652u;

    /* renamed from: u0 */
    public int f17653u0;

    /* renamed from: u1 */
    public int f17654u1;

    /* renamed from: v */
    public int f17655v;

    /* renamed from: v0 */
    public int f17656v0;

    /* renamed from: v1 */
    public int f17657v1;

    /* renamed from: w */
    public int f17658w;

    /* renamed from: w0 */
    public int f17659w0;

    /* renamed from: w1 */
    public int f17660w1;

    /* renamed from: x */
    public ColorStateList f17661x;

    /* renamed from: x0 */
    public int f17662x0;

    /* renamed from: x1 */
    public int f17663x1;

    /* renamed from: y */
    public int f17664y;

    /* renamed from: y0 */
    public int f17665y0;

    /* renamed from: y1 */
    public int f17666y1;

    /* renamed from: z */
    public int f17667z;

    /* renamed from: z0 */
    public int f17668z0;

    /* renamed from: z1 */
    public boolean f17669z1;

    public SuperTextView(Context context) {
        super(context);
        this.f17517D1 = false;
        this.f17523F1 = -1;
        this.f17526G1 = 1;
        m13640d(context, null);
    }

    /* renamed from: E */
    private void m13637E() {
        float f10 = this.f17602g2;
        if (f10 != 0.0f) {
            this.f17642q2.setCornerRadius(f10);
            return;
        }
        GradientDrawable gradientDrawable = this.f17642q2;
        float f11 = this.f17606h2;
        float f12 = this.f17610i2;
        float f13 = this.f17618k2;
        float f14 = this.f17614j2;
        gradientDrawable.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
    }

    /* renamed from: a */
    private void m13638a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f17585c.obtainStyledAttributes(attributeSet, R$styleable.SuperTextView);
        this.f17515D = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sLeftTextString);
        this.f17518E = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sLeftTopTextString);
        this.f17521F = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sLeftBottomTextString);
        this.f17533J = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sCenterTextString);
        this.f17536K = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sCenterTopTextString);
        this.f17539L = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sCenterBottomTextString);
        this.f17524G = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sRightTextString);
        this.f17527H = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sRightTopTextString);
        this.f17530I = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sRightBottomTextString);
        this.f17542M = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sLeftTextColor, this.f17667z);
        this.f17545N = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sLeftTopTextColor, this.f17667z);
        this.f17548O = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sLeftBottomTextColor, this.f17667z);
        this.f17551P = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sCenterTextColor, this.f17667z);
        this.f17554Q = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sCenterTopTextColor, this.f17667z);
        this.f17557R = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sCenterBottomTextColor, this.f17667z);
        this.f17560S = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sRightTextColor, this.f17667z);
        this.f17563T = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sRightTopTextColor, this.f17667z);
        this.f17566U = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sRightBottomTextColor, this.f17667z);
        this.f17569V = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTextSize, this.f17506A);
        this.f17572W = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTopTextSize, this.f17506A);
        this.f17592e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftBottomTextSize, this.f17506A);
        this.f17608i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTextSize, this.f17506A);
        this.f17612j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTopTextSize, this.f17506A);
        this.f17616k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterBottomTextSize, this.f17506A);
        this.f17596f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTextSize, this.f17506A);
        this.f17600g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTopTextSize, this.f17506A);
        this.f17604h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightBottomTextSize, this.f17506A);
        this.f17620l0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftTopLines, 1);
        this.f17624m0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftLines, 1);
        this.f17628n0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftBottomLines, 1);
        this.f17632o0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterTopLines, 1);
        this.f17636p0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterLines, 1);
        this.f17640q0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterBottomLines, 1);
        this.f17644r0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightTopLines, 1);
        this.f17647s0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightLines, 1);
        this.f17650t0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightBottomLines, 1);
        this.f17653u0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftTopMaxEms, this.f17509B);
        this.f17656v0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftMaxEms, this.f17509B);
        this.f17659w0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftBottomMaxEms, this.f17509B);
        this.f17662x0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterTopMaxEms, this.f17509B);
        this.f17665y0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterMaxEms, this.f17509B);
        this.f17668z0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterBottomMaxEms, this.f17509B);
        this.f17507A0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightTopMaxEms, this.f17509B);
        this.f17510B0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightMaxEms, this.f17509B);
        this.f17513C0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightBottomMaxEms, this.f17509B);
        this.f17586c1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftViewGravity, 1);
        this.f17589d1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterViewGravity, 1);
        this.f17593e1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightViewGravity, 1);
        this.f17552P0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftTvDrawableLeft);
        this.f17555Q0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftTvDrawableRight);
        this.f17558R0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sCenterTvDrawableLeft);
        this.f17561S0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sCenterTvDrawableRight);
        this.f17564T0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightTvDrawableLeft);
        this.f17567U0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightTvDrawableRight);
        this.f17583b1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTextViewDrawablePadding, this.f17512C);
        this.f17570V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTvDrawableWidth, -1);
        this.f17573W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTvDrawableHeight, -1);
        this.f17575X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTvDrawableWidth, -1);
        this.f17577Y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTvDrawableHeight, -1);
        this.f17579Z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTvDrawableWidth, -1);
        this.f17581a1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTvDrawableHeight, -1);
        this.f17597f1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftViewWidth, 0);
        this.f17617k1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTopDividerLineMarginLR, 0);
        this.f17621l1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTopDividerLineMarginLeft, 0);
        this.f17625m1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTopDividerLineMarginRight, 0);
        this.f17629n1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sBottomDividerLineMarginLR, 0);
        this.f17633o1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sBottomDividerLineMarginLeft, 0);
        this.f17637p1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sBottomDividerLineMarginRight, 0);
        this.f17641q1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sDividerLineType, 2);
        this.f17645r1 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sDividerLineColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_separator_light));
        this.f17648s1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sDividerLineHeight, AbstractC8037c.m12188b(this.f17585c, 0.5f));
        this.f17651t1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftViewMarginLeft, this.f17512C);
        this.f17654u1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftViewMarginRight, this.f17512C);
        this.f17657v1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterViewMarginLeft, 0);
        this.f17660w1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterViewMarginRight, 0);
        this.f17663x1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightViewMarginLeft, this.f17512C);
        this.f17666y1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightViewMarginRight, this.f17512C);
        this.f17627n = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftIconRes);
        this.f17631o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconWidth, 0);
        this.f17635p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconHeight, 0);
        this.f17639q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconMarginLeft, this.f17512C);
        this.f17643r = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SuperTextView_sLeftIconTint);
        this.f17646s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconPadding, 0);
        this.f17649t = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightIconRes);
        this.f17652u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightIconWidth, 0);
        this.f17655v = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightIconHeight, 0);
        this.f17658w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightIconMarginRight, this.f17512C);
        this.f17661x = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.SuperTextView_sLeftIconTint);
        this.f17664y = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconPadding, 0);
        this.f17516D0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sLeftTopTextIsBold, false);
        this.f17519E0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sLeftTextIsBold, false);
        this.f17522F0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sLeftBottomTextIsBold, false);
        this.f17525G0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sCenterTopTextIsBold, false);
        this.f17528H0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sCenterTextIsBold, false);
        this.f17531I0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sCenterBottomTextIsBold, false);
        this.f17534J0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sRightTopTextIsBold, false);
        this.f17537K0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sRightTextIsBold, false);
        this.f17540L0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sRightBottomTextIsBold, false);
        this.f17543M0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftTextBackground);
        this.f17546N0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sCenterTextBackground);
        this.f17549O0 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightTextBackground);
        this.f17517D1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sEnableEdit, this.f17517D1);
        this.f17529H1 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sEditBackGround);
        this.f17523F1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sEditTextWidth, this.f17523F1);
        this.f17535J1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sEditTextString);
        this.f17532I1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sEditTextHint);
        this.f17538K1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_android_inputType, -1);
        this.f17526G1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sEditTextButtonType, this.f17526G1);
        this.f17541L1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sEditTextIsAsteriskStyle, this.f17541L1);
        this.f17669z1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sUseRipple, true);
        this.f17508A1 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sBackgroundDrawableRes);
        this.f17544M1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightViewType, -1);
        this.f17556Q1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sIsChecked, false);
        this.f17553P1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightCheckBoxMarginRight, this.f17512C);
        this.f17550O1 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightCheckBoxRes);
        this.f17565T1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightSwitchMarginRight, this.f17512C);
        this.f17568U1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sSwitchIsChecked, false);
        this.f17571V1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sTextOff);
        this.f17574W1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sTextOn);
        this.f17576X1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sSwitchMinWidth, 0);
        this.f17578Y1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sSwitchPadding, 0);
        this.f17580Z1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sThumbTextPadding, 0);
        this.f17582a2 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sThumbResource);
        this.f17584b2 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sTrackResource);
        this.f17559R1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterSpaceHeight, AbstractC8037c.m12188b(this.f17585c, 5.0f));
        this.f17590d2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeSelectorPressedColor, this.f17587c2);
        this.f17594e2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeSelectorNormalColor, this.f17587c2);
        this.f17598f2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeSolidColor, this.f17587c2);
        this.f17602g2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersRadius, 0);
        this.f17606h2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersTopLeftRadius, 0);
        this.f17610i2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersTopRightRadius, 0);
        this.f17614j2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersBottomLeftRadius, 0);
        this.f17618k2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersBottomRightRadius, 0);
        this.f17622l2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeStrokeWidth, 0);
        this.f17630n2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeStrokeDashWidth, 0);
        this.f17634o2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeStrokeDashGap, 0);
        this.f17626m2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeStrokeColor, this.f17587c2);
        this.f17638p2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sUseShape, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private RelativeLayout.LayoutParams m13639c(RelativeLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new RelativeLayout.LayoutParams(-2, -2) : layoutParams;
    }

    /* renamed from: d */
    private void m13640d(Context context, AttributeSet attributeSet) {
        this.f17585c = context;
        this.f17667z = AbstractC8041g.m12218e(context, R$attr.stv_color_common_text, AbstractC8040f.m12202c(R$color.stv_color_common_text));
        this.f17506A = AbstractC8041g.m12220g(context, R$attr.stv_text_size, AbstractC8040f.m12204e(R$dimen.default_stv_text_size));
        this.f17509B = AbstractC8041g.m12225l(context, R$attr.stv_max_ems, 20);
        this.f17512C = AbstractC8041g.m12220g(context, R$attr.stv_margin, AbstractC8040f.m12204e(R$dimen.default_stv_margin));
        this.f17587c2 = AbstractC8041g.m12218e(context, R$attr.stv_color_shape, AbstractC8040f.m12202c(R$color.xui_config_color_white));
        m13638a(attributeSet);
        m13641r();
    }

    /* renamed from: r */
    private void m13641r() {
        m13660p();
        m13654j();
        m13653i();
        m13657m();
        m13655k();
        m13651g();
        m13659o();
        m13652h();
    }

    /* renamed from: s */
    private void m13642s() {
        this.f17642q2.setStroke(this.f17622l2, this.f17626m2, this.f17630n2, this.f17634o2);
    }

    private void setDefaultCenterViewClickListener(BaseTextView baseTextView) {
    }

    private void setDefaultLeftViewClickListener(BaseTextView baseTextView) {
    }

    private void setDefaultRightViewClickListener(BaseTextView baseTextView) {
    }

    /* renamed from: A */
    public final void m13643A(BaseTextView baseTextView, int i10, int i11, int i12) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextSize(0, i10);
            baseTextView.getCenterTextView().setTextSize(0, i11);
            baseTextView.getBottomTextView().setTextSize(0, i12);
        }
    }

    /* renamed from: B */
    public final void m13644B(BaseTextView baseTextView, String str, String str2, String str3) {
        if (baseTextView != null) {
            baseTextView.setTopTextString(str);
            baseTextView.setCenterTextString(str2);
            baseTextView.setBottomTextString(str3);
        }
    }

    /* renamed from: C */
    public final void m13645C(BaseTextView baseTextView, boolean z10, boolean z11, boolean z12) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().getPaint().setFakeBoldText(z10);
            baseTextView.getCenterTextView().getPaint().setFakeBoldText(z11);
            baseTextView.getBottomTextView().getPaint().setFakeBoldText(z12);
        }
    }

    /* renamed from: D */
    public final void m13646D(BaseTextView baseTextView, int i10) {
        if (i10 == 0) {
            baseTextView.setGravity(8388627);
        } else if (i10 == 1) {
            baseTextView.setGravity(17);
        } else {
            if (i10 != 2) {
                return;
            }
            baseTextView.setGravity(8388629);
        }
    }

    /* renamed from: F */
    public final void m13647F() {
        int i10 = this.f17617k1;
        if (i10 != 0) {
            m13661q(i10, i10);
        } else {
            m13661q(this.f17621l1, this.f17625m1);
        }
    }

    /* renamed from: b */
    public GradientDrawable m13648b(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f17642q2 = gradientDrawable;
        gradientDrawable.setShape(0);
        if (i10 == 16842910) {
            this.f17642q2.setColor(this.f17594e2);
        } else if (i10 != 16842919) {
            this.f17642q2.setColor(this.f17598f2);
        } else {
            this.f17642q2.setColor(this.f17590d2);
        }
        m13642s();
        m13637E();
        return this.f17642q2;
    }

    /* renamed from: e */
    public final BaseTextView m13649e(int i10) {
        BaseTextView baseTextView = new BaseTextView(this.f17585c);
        baseTextView.setId(i10);
        return baseTextView;
    }

    /* renamed from: f */
    public final void m13650f(int i10, int i11) {
        if (this.f17605h1 == null) {
            if (this.f17613j1 == null) {
                this.f17613j1 = new RelativeLayout.LayoutParams(-1, this.f17648s1);
            }
            this.f17613j1.addRule(12, -1);
            this.f17613j1.setMarginStart(i10);
            this.f17613j1.setMarginEnd(i11);
            View view = new View(this.f17585c);
            this.f17605h1 = view;
            view.setLayoutParams(this.f17613j1);
            this.f17605h1.setBackgroundColor(this.f17645r1);
        }
        addView(this.f17605h1);
    }

    /* renamed from: g */
    public final void m13651g() {
        if (!this.f17517D1) {
            if (this.f17591e == null) {
                this.f17591e = m13649e(R$id.sCenterViewId);
            }
            RelativeLayout.LayoutParams layoutParamsM13639c = m13639c(this.f17603h);
            this.f17603h = layoutParamsM13639c;
            layoutParamsM13639c.addRule(13, -1);
            this.f17603h.addRule(15, -1);
            if (this.f17589d1 != 1) {
                this.f17603h.addRule(17, R$id.sLeftViewId);
                this.f17603h.addRule(16, R$id.sRightViewId);
            }
            this.f17603h.setMargins(this.f17657v1, 0, this.f17660w1, 0);
            this.f17603h.setMarginStart(this.f17657v1);
            this.f17603h.setMarginEnd(this.f17660w1);
            this.f17591e.setLayoutParams(this.f17603h);
            this.f17591e.setCenterSpaceHeight(this.f17559R1);
            m13664v(this.f17591e, this.f17554Q, this.f17551P, this.f17557R);
            m13643A(this.f17591e, this.f17612j0, this.f17608i0, this.f17616k0);
            m13667y(this.f17591e, this.f17632o0, this.f17636p0, this.f17640q0);
            m13668z(this.f17591e, this.f17662x0, this.f17665y0, this.f17668z0);
            m13645C(this.f17591e, this.f17525G0, this.f17528H0, this.f17531I0);
            m13666x(this.f17591e, this.f17589d1);
            m13665w(this.f17591e.getCenterTextView(), this.f17558R0, this.f17561S0, this.f17583b1, this.f17575X0, this.f17577Y0);
            m13663u(this.f17591e.getCenterTextView(), this.f17546N0);
            m13644B(this.f17591e, this.f17536K, this.f17533J, this.f17539L);
            addView(this.f17591e);
            return;
        }
        if (this.f17520E1 == null) {
            int i10 = this.f17526G1;
            if (i10 == 0) {
                this.f17520E1 = new AppCompatEditText(this.f17585c);
            } else if (i10 == 1) {
                this.f17520E1 = new ClearEditText(this.f17585c);
            } else if (i10 == 2) {
                PasswordEditText passwordEditText = new PasswordEditText(this.f17585c);
                this.f17520E1 = passwordEditText;
                passwordEditText.m12591k(this.f17541L1);
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f17523F1, -2);
        layoutParams.addRule(13, -1);
        layoutParams.addRule(15, -1);
        if (this.f17589d1 != 1) {
            layoutParams.addRule(17, R$id.sLeftViewId);
            layoutParams.addRule(16, R$id.sRightViewId);
        }
        layoutParams.setMargins(this.f17657v1, 0, this.f17660w1, 0);
        layoutParams.setMarginStart(this.f17657v1);
        layoutParams.setMarginEnd(this.f17660w1);
        this.f17520E1.setId(R$id.sCenterEditTextId);
        this.f17520E1.setLayoutParams(layoutParams);
        Drawable drawable = this.f17529H1;
        if (drawable != null) {
            this.f17520E1.setBackground(drawable);
        } else {
            this.f17520E1.setBackgroundColor(AbstractC8040f.m12202c(R$color.xui_config_color_transparent));
        }
        this.f17520E1.setTextColor(this.f17551P);
        this.f17520E1.setTextSize(0, this.f17608i0);
        this.f17520E1.setMaxLines(this.f17636p0);
        this.f17520E1.setText(this.f17535J1);
        this.f17520E1.setHint(this.f17532I1);
        int i11 = this.f17538K1;
        if (i11 != -1) {
            this.f17520E1.setInputType(i11);
        }
        addView(this.f17520E1);
    }

    public String getCenterBottomString() {
        BaseTextView baseTextView = this.f17591e;
        return baseTextView != null ? baseTextView.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getCenterBottomTextView() {
        BaseTextView baseTextView = this.f17591e;
        if (baseTextView != null) {
            return baseTextView.getBottomTextView();
        }
        return null;
    }

    @Nullable
    public EditText getCenterEditText() {
        return this.f17520E1;
    }

    public String getCenterEditValue() {
        EditText editText = this.f17520E1;
        return editText != null ? editText.getText().toString() : "";
    }

    public String getCenterString() {
        BaseTextView baseTextView = this.f17591e;
        return baseTextView != null ? baseTextView.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getCenterTextView() {
        BaseTextView baseTextView = this.f17591e;
        if (baseTextView != null) {
            return baseTextView.getCenterTextView();
        }
        return null;
    }

    public String getCenterTopString() {
        BaseTextView baseTextView = this.f17591e;
        return baseTextView != null ? baseTextView.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getCenterTopTextView() {
        BaseTextView baseTextView = this.f17591e;
        if (baseTextView != null) {
            return baseTextView.getTopTextView();
        }
        return null;
    }

    public boolean getCheckBoxIsChecked() {
        CheckBox checkBox = this.f17547N1;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    public String getLeftBottomString() {
        BaseTextView baseTextView = this.f17588d;
        return baseTextView != null ? baseTextView.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getLeftBottomTextView() {
        BaseTextView baseTextView = this.f17588d;
        if (baseTextView != null) {
            return baseTextView.getBottomTextView();
        }
        return null;
    }

    public ImageView getLeftIconIV() {
        this.f17619l.setMargins(this.f17639q, 0, 0, 0);
        this.f17619l.setMarginStart(this.f17639q);
        return this.f17611j;
    }

    public String getLeftString() {
        BaseTextView baseTextView = this.f17588d;
        return baseTextView != null ? baseTextView.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getLeftTextView() {
        BaseTextView baseTextView = this.f17588d;
        if (baseTextView != null) {
            return baseTextView.getCenterTextView();
        }
        return null;
    }

    public String getLeftTopString() {
        BaseTextView baseTextView = this.f17588d;
        return baseTextView != null ? baseTextView.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getLeftTopTextView() {
        BaseTextView baseTextView = this.f17588d;
        if (baseTextView != null) {
            return baseTextView.getTopTextView();
        }
        return null;
    }

    public String getRightBottomString() {
        BaseTextView baseTextView = this.f17595f;
        return baseTextView != null ? baseTextView.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getRightBottomTextView() {
        BaseTextView baseTextView = this.f17595f;
        if (baseTextView != null) {
            return baseTextView.getBottomTextView();
        }
        return null;
    }

    public ImageView getRightIconIV() {
        this.f17623m.setMargins(0, 0, this.f17658w, 0);
        this.f17619l.setMarginEnd(this.f17658w);
        return this.f17615k;
    }

    public String getRightString() {
        BaseTextView baseTextView = this.f17595f;
        return baseTextView != null ? baseTextView.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getRightTextView() {
        BaseTextView baseTextView = this.f17595f;
        if (baseTextView != null) {
            return baseTextView.getCenterTextView();
        }
        return null;
    }

    public String getRightTopString() {
        BaseTextView baseTextView = this.f17595f;
        return baseTextView != null ? baseTextView.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getRightTopTextView() {
        BaseTextView baseTextView = this.f17595f;
        if (baseTextView != null) {
            return baseTextView.getTopTextView();
        }
        return null;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m13648b(R.attr.state_pressed));
        stateListDrawable.addState(new int[0], m13648b(R.attr.state_enabled));
        return stateListDrawable;
    }

    public boolean getSwitchIsChecked() {
        Switch r02 = this.f17562S1;
        if (r02 != null) {
            return r02.isChecked();
        }
        return false;
    }

    /* renamed from: h */
    public final void m13652h() {
        if (this.f17638p2) {
            return;
        }
        int i10 = this.f17641q1;
        if (i10 == 1) {
            m13647F();
            return;
        }
        if (i10 == 2) {
            m13662t();
        } else {
            if (i10 != 3) {
                return;
            }
            m13647F();
            m13662t();
        }
    }

    /* renamed from: i */
    public final void m13653i() {
        int i10 = this.f17544M1;
        if (i10 == 0) {
            m13656l();
        } else {
            if (i10 != 1) {
                return;
            }
            m13658n();
        }
    }

    /* renamed from: j */
    public final void m13654j() {
        int i10;
        if (this.f17611j == null) {
            this.f17611j = new AppCompatImageView(this.f17585c);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.f17619l = layoutParams;
        layoutParams.addRule(20, -1);
        this.f17619l.addRule(15, -1);
        int i11 = this.f17635p;
        if (i11 != 0 && (i10 = this.f17631o) != 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.f17619l;
            layoutParams2.width = i10;
            layoutParams2.height = i11;
        }
        this.f17611j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f17611j.setId(R$id.sLeftImgId);
        this.f17611j.setLayoutParams(this.f17619l);
        ImageView imageView = this.f17611j;
        int i12 = this.f17646s;
        imageView.setPadding(i12, i12, i12, i12);
        if (this.f17627n != null) {
            this.f17619l.setMargins(this.f17639q, 0, 0, 0);
            this.f17619l.setMarginStart(this.f17639q);
            this.f17611j.setImageDrawable(this.f17627n);
        }
        ColorStateList colorStateList = this.f17643r;
        if (colorStateList != null) {
            this.f17611j.setImageTintList(colorStateList);
        }
        addView(this.f17611j);
    }

    /* renamed from: k */
    public final void m13655k() {
        if (this.f17588d == null) {
            this.f17588d = m13649e(R$id.sLeftViewId);
        }
        RelativeLayout.LayoutParams layoutParamsM13639c = m13639c(this.f17599g);
        this.f17599g = layoutParamsM13639c;
        layoutParamsM13639c.addRule(17, R$id.sLeftImgId);
        this.f17599g.addRule(15, -1);
        int i10 = this.f17597f1;
        if (i10 != 0) {
            this.f17599g.width = i10;
        }
        this.f17599g.setMargins(this.f17651t1, 0, this.f17654u1, 0);
        this.f17588d.setLayoutParams(this.f17599g);
        this.f17588d.setCenterSpaceHeight(this.f17559R1);
        m13664v(this.f17588d, this.f17545N, this.f17542M, this.f17548O);
        m13643A(this.f17588d, this.f17572W, this.f17569V, this.f17592e0);
        m13667y(this.f17588d, this.f17620l0, this.f17624m0, this.f17628n0);
        m13668z(this.f17588d, this.f17653u0, this.f17656v0, this.f17659w0);
        m13645C(this.f17588d, this.f17516D0, this.f17519E0, this.f17522F0);
        m13666x(this.f17588d, this.f17586c1);
        m13665w(this.f17588d.getCenterTextView(), this.f17552P0, this.f17555Q0, this.f17583b1, this.f17570V0, this.f17573W0);
        m13663u(this.f17588d.getCenterTextView(), this.f17543M0);
        m13644B(this.f17588d, this.f17518E, this.f17515D, this.f17521F);
        addView(this.f17588d);
    }

    /* renamed from: l */
    public final void m13656l() {
        if (this.f17547N1 == null) {
            this.f17547N1 = new CheckBox(this.f17585c);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(0, 0, this.f17553P1, 0);
        layoutParams.setMarginEnd(this.f17553P1);
        this.f17547N1.setId(R$id.sRightCheckBoxId);
        this.f17547N1.setLayoutParams(layoutParams);
        if (this.f17550O1 != null) {
            this.f17547N1.setGravity(13);
            this.f17547N1.setButtonDrawable(this.f17550O1);
        }
        this.f17547N1.setChecked(this.f17556Q1);
        this.f17547N1.setOnCheckedChangeListener(this.f17514C1);
        addView(this.f17547N1);
    }

    /* renamed from: m */
    public final void m13657m() {
        int i10;
        if (this.f17615k == null) {
            this.f17615k = new AppCompatImageView(this.f17585c);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.f17623m = layoutParams;
        layoutParams.addRule(15, -1);
        int i11 = this.f17544M1;
        if (i11 == 0) {
            this.f17623m.addRule(16, R$id.sRightCheckBoxId);
        } else if (i11 != 1) {
            this.f17623m.addRule(21, -1);
        } else {
            this.f17623m.addRule(16, R$id.sRightSwitchId);
        }
        int i12 = this.f17655v;
        if (i12 != 0 && (i10 = this.f17652u) != 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.f17623m;
            layoutParams2.width = i10;
            layoutParams2.height = i12;
        }
        this.f17615k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f17615k.setId(R$id.sRightImgId);
        this.f17615k.setLayoutParams(this.f17623m);
        ImageView imageView = this.f17615k;
        int i13 = this.f17664y;
        imageView.setPadding(i13, i13, i13, i13);
        if (this.f17649t != null) {
            this.f17623m.setMargins(0, 0, this.f17658w, 0);
            this.f17623m.setMarginEnd(this.f17658w);
            this.f17615k.setImageDrawable(this.f17649t);
        }
        ColorStateList colorStateList = this.f17661x;
        if (colorStateList != null) {
            this.f17615k.setImageTintList(colorStateList);
        }
        addView(this.f17615k);
    }

    /* renamed from: n */
    public final void m13658n() {
        if (this.f17562S1 == null) {
            this.f17562S1 = new Switch(this.f17585c);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(0, 0, this.f17565T1, 0);
        layoutParams.setMarginEnd(this.f17565T1);
        this.f17562S1.setId(R$id.sRightSwitchId);
        this.f17562S1.setLayoutParams(layoutParams);
        this.f17562S1.setChecked(this.f17568U1);
        if (!TextUtils.isEmpty(this.f17571V1)) {
            this.f17562S1.setTextOff(this.f17571V1);
        }
        if (!TextUtils.isEmpty(this.f17574W1)) {
            this.f17562S1.setTextOn(this.f17574W1);
        }
        int i10 = this.f17576X1;
        if (i10 != 0) {
            this.f17562S1.setSwitchMinWidth(i10);
        }
        int i11 = this.f17578Y1;
        if (i11 != 0) {
            this.f17562S1.setSwitchPadding(i11);
        }
        Drawable drawable = this.f17582a2;
        if (drawable != null) {
            this.f17562S1.setThumbDrawable(drawable);
        }
        if (this.f17582a2 != null) {
            this.f17562S1.setTrackDrawable(this.f17584b2);
        }
        int i12 = this.f17580Z1;
        if (i12 != 0) {
            this.f17562S1.setThumbTextPadding(i12);
        }
        this.f17562S1.setOnCheckedChangeListener(this.f17511B1);
        addView(this.f17562S1);
    }

    /* renamed from: o */
    public final void m13659o() {
        if (this.f17595f == null) {
            this.f17595f = m13649e(R$id.sRightViewId);
        }
        RelativeLayout.LayoutParams layoutParamsM13639c = m13639c(this.f17607i);
        this.f17607i = layoutParamsM13639c;
        layoutParamsM13639c.addRule(15, -1);
        this.f17607i.addRule(16, R$id.sRightImgId);
        this.f17607i.setMargins(this.f17663x1, 0, this.f17666y1, 0);
        this.f17607i.setMarginStart(this.f17663x1);
        this.f17607i.setMarginEnd(this.f17666y1);
        this.f17595f.setLayoutParams(this.f17607i);
        this.f17595f.setCenterSpaceHeight(this.f17559R1);
        m13664v(this.f17595f, this.f17563T, this.f17560S, this.f17566U);
        m13643A(this.f17595f, this.f17600g0, this.f17596f0, this.f17604h0);
        m13667y(this.f17595f, this.f17644r0, this.f17647s0, this.f17650t0);
        m13668z(this.f17595f, this.f17507A0, this.f17510B0, this.f17513C0);
        m13645C(this.f17595f, this.f17534J0, this.f17537K0, this.f17540L0);
        m13666x(this.f17595f, this.f17593e1);
        m13665w(this.f17595f.getCenterTextView(), this.f17564T0, this.f17567U0, this.f17583b1, this.f17579Z0, this.f17581a1);
        m13663u(this.f17595f.getCenterTextView(), this.f17549O0);
        m13644B(this.f17595f, this.f17527H, this.f17524G, this.f17530I);
        addView(this.f17595f);
    }

    /* renamed from: p */
    public final void m13660p() {
        if (this.f17669z1) {
            setBackgroundResource(R$drawable.stv_btn_selector_white);
            setClickable(true);
        }
        Drawable drawable = this.f17508A1;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        if (this.f17638p2) {
            setBackground(getSelector());
        }
    }

    /* renamed from: q */
    public final void m13661q(int i10, int i11) {
        if (this.f17601g1 == null) {
            if (this.f17609i1 == null) {
                this.f17609i1 = new RelativeLayout.LayoutParams(-1, this.f17648s1);
            }
            this.f17609i1.addRule(10, -1);
            this.f17609i1.setMarginStart(i10);
            this.f17609i1.setMarginEnd(i11);
            View view = new View(this.f17585c);
            this.f17601g1 = view;
            view.setLayoutParams(this.f17609i1);
            this.f17601g1.setBackgroundColor(this.f17645r1);
        }
        addView(this.f17601g1);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        BaseTextView baseTextView = this.f17588d;
        if (baseTextView != null) {
            baseTextView.setTypeface(typeface);
        }
        BaseTextView baseTextView2 = this.f17591e;
        if (baseTextView2 != null) {
            baseTextView2.setTypeface(typeface);
        }
        EditText editText = this.f17520E1;
        if (editText != null) {
            editText.setTypeface(typeface);
        }
        BaseTextView baseTextView3 = this.f17595f;
        if (baseTextView3 != null) {
            baseTextView3.setTypeface(typeface);
        }
        BaseTextView baseTextView4 = this.f17591e;
        if (baseTextView4 != null) {
            baseTextView4.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public final void m13662t() {
        int i10 = this.f17629n1;
        if (i10 != 0) {
            m13650f(i10, i10);
        } else {
            m13650f(this.f17633o1, this.f17637p1);
        }
    }

    /* renamed from: u */
    public final void m13663u(TextView textView, Drawable drawable) {
        if (drawable != null) {
            textView.setVisibility(0);
            textView.setBackground(drawable);
        }
    }

    /* renamed from: v */
    public final void m13664v(BaseTextView baseTextView, int i10, int i11, int i12) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().setTextColor(i10);
            baseTextView.getCenterTextView().setTextColor(i11);
            baseTextView.getBottomTextView().setTextColor(i12);
        }
    }

    /* renamed from: w */
    public void m13665w(TextView textView, Drawable drawable, Drawable drawable2, int i10, int i11, int i12) {
        if (drawable != null || drawable2 != null) {
            textView.setVisibility(0);
        }
        if (i11 == -1 || i12 == -1) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        } else {
            if (drawable != null) {
                drawable.setBounds(0, 0, i11, i12);
            }
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i11, i12);
            }
            textView.setCompoundDrawables(drawable, null, drawable2, null);
        }
        textView.setCompoundDrawablePadding(i10);
    }

    /* renamed from: x */
    public final void m13666x(BaseTextView baseTextView, int i10) {
        if (baseTextView != null) {
            m13646D(baseTextView, i10);
        }
    }

    /* renamed from: y */
    public final void m13667y(BaseTextView baseTextView, int i10, int i11, int i12) {
        if (baseTextView != null) {
            baseTextView.getTopTextView().setMaxLines(i10);
            baseTextView.getCenterTextView().setMaxLines(i11);
            baseTextView.getBottomTextView().setMaxLines(i12);
        }
    }

    /* renamed from: z */
    public final void m13668z(BaseTextView baseTextView, int i10, int i11, int i12) {
        if (baseTextView != null) {
            baseTextView.m13595i(i10, i11, i12);
        }
    }

    public SuperTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17517D1 = false;
        this.f17523F1 = -1;
        this.f17526G1 = 1;
        m13640d(context, attributeSet);
    }

    public SuperTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17517D1 = false;
        this.f17523F1 = -1;
        this.f17526G1 = 1;
        m13640d(context, attributeSet);
    }
}
