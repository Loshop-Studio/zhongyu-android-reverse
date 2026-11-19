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
import androidx.core.content.ContextCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.edittext.ClearEditText;
import com.xuexiang.xui.widget.edittext.PasswordEditText;
import io.github.inflationx.calligraphy3.HasTypeface;
import p284w2.C10273a;

/* loaded from: classes4.dex */
public class SuperTextView extends RelativeLayout implements HasTypeface {

    /* renamed from: A */
    public int f8307A;

    /* renamed from: A0 */
    public int f8308A0;

    /* renamed from: A1 */
    public CompoundButton.OnCheckedChangeListener f8309A1;

    /* renamed from: B */
    public String f8310B;

    /* renamed from: B0 */
    public boolean f8311B0;

    /* renamed from: B1 */
    public boolean f8312B1;

    /* renamed from: C */
    public String f8313C;

    /* renamed from: C0 */
    public boolean f8314C0;

    /* renamed from: C1 */
    public EditText f8315C1;

    /* renamed from: D */
    public String f8316D;

    /* renamed from: D0 */
    public boolean f8317D0;

    /* renamed from: D1 */
    public int f8318D1;

    /* renamed from: E */
    public String f8319E;

    /* renamed from: E0 */
    public boolean f8320E0;

    /* renamed from: E1 */
    public int f8321E1;

    /* renamed from: F */
    public String f8322F;

    /* renamed from: F0 */
    public boolean f8323F0;

    /* renamed from: F1 */
    public Drawable f8324F1;

    /* renamed from: G */
    public String f8325G;

    /* renamed from: G0 */
    public boolean f8326G0;

    /* renamed from: G1 */
    public String f8327G1;

    /* renamed from: H */
    public String f8328H;

    /* renamed from: H0 */
    public boolean f8329H0;

    /* renamed from: H1 */
    public String f8330H1;

    /* renamed from: I */
    public String f8331I;

    /* renamed from: I0 */
    public boolean f8332I0;

    /* renamed from: I1 */
    public int f8333I1;

    /* renamed from: J */
    public String f8334J;

    /* renamed from: J0 */
    public boolean f8335J0;

    /* renamed from: J1 */
    public boolean f8336J1;

    /* renamed from: K */
    public int f8337K;

    /* renamed from: K0 */
    public Drawable f8338K0;

    /* renamed from: K1 */
    public int f8339K1;

    /* renamed from: L */
    public int f8340L;

    /* renamed from: L0 */
    public Drawable f8341L0;

    /* renamed from: L1 */
    public CheckBox f8342L1;

    /* renamed from: M */
    public int f8343M;

    /* renamed from: M0 */
    public Drawable f8344M0;

    /* renamed from: M1 */
    public Drawable f8345M1;

    /* renamed from: N */
    public int f8346N;

    /* renamed from: N0 */
    public Drawable f8347N0;

    /* renamed from: N1 */
    public int f8348N1;

    /* renamed from: O */
    public int f8349O;

    /* renamed from: O0 */
    public Drawable f8350O0;

    /* renamed from: O1 */
    public boolean f8351O1;

    /* renamed from: P */
    public int f8352P;

    /* renamed from: P0 */
    public Drawable f8353P0;

    /* renamed from: P1 */
    public int f8354P1;

    /* renamed from: Q */
    public int f8355Q;

    /* renamed from: Q0 */
    public Drawable f8356Q0;

    /* renamed from: Q1 */
    public Switch f8357Q1;

    /* renamed from: R */
    public int f8358R;

    /* renamed from: R0 */
    public Drawable f8359R0;

    /* renamed from: R1 */
    public int f8360R1;

    /* renamed from: S */
    public int f8361S;

    /* renamed from: S0 */
    public Drawable f8362S0;

    /* renamed from: S1 */
    public boolean f8363S1;

    /* renamed from: T */
    public int f8364T;

    /* renamed from: T0 */
    public int f8365T0;

    /* renamed from: T1 */
    public String f8366T1;

    /* renamed from: U */
    public int f8367U;

    /* renamed from: U0 */
    public int f8368U0;

    /* renamed from: U1 */
    public String f8369U1;

    /* renamed from: V */
    public int f8370V;

    /* renamed from: V0 */
    public int f8371V0;

    /* renamed from: V1 */
    public int f8372V1;

    /* renamed from: W */
    public int f8373W;

    /* renamed from: W0 */
    public int f8374W0;

    /* renamed from: W1 */
    public int f8375W1;

    /* renamed from: X0 */
    public int f8376X0;

    /* renamed from: X1 */
    public int f8377X1;

    /* renamed from: Y0 */
    public int f8378Y0;

    /* renamed from: Y1 */
    public Drawable f8379Y1;

    /* renamed from: Z0 */
    public int f8380Z0;

    /* renamed from: Z1 */
    public Drawable f8381Z1;

    /* renamed from: a */
    public Context f8382a;

    /* renamed from: a1 */
    public int f8383a1;

    /* renamed from: a2 */
    public int f8384a2;

    /* renamed from: b */
    public C10273a f8385b;

    /* renamed from: b1 */
    public int f8386b1;

    /* renamed from: b2 */
    public int f8387b2;

    /* renamed from: c */
    public C10273a f8388c;

    /* renamed from: c1 */
    public int f8389c1;

    /* renamed from: c2 */
    public int f8390c2;

    /* renamed from: d */
    public C10273a f8391d;

    /* renamed from: d1 */
    public int f8392d1;

    /* renamed from: d2 */
    public int f8393d2;

    /* renamed from: e */
    public RelativeLayout.LayoutParams f8394e;

    /* renamed from: e0 */
    public int f8395e0;

    /* renamed from: e1 */
    public View f8396e1;

    /* renamed from: e2 */
    public float f8397e2;

    /* renamed from: f */
    public RelativeLayout.LayoutParams f8398f;

    /* renamed from: f0 */
    public int f8399f0;

    /* renamed from: f1 */
    public View f8400f1;

    /* renamed from: f2 */
    public float f8401f2;

    /* renamed from: g */
    public RelativeLayout.LayoutParams f8402g;

    /* renamed from: g0 */
    public int f8403g0;

    /* renamed from: g1 */
    public RelativeLayout.LayoutParams f8404g1;

    /* renamed from: g2 */
    public float f8405g2;

    /* renamed from: h */
    public ImageView f8406h;

    /* renamed from: h0 */
    public int f8407h0;

    /* renamed from: h1 */
    public RelativeLayout.LayoutParams f8408h1;

    /* renamed from: h2 */
    public float f8409h2;

    /* renamed from: i */
    public ImageView f8410i;

    /* renamed from: i0 */
    public int f8411i0;

    /* renamed from: i1 */
    public int f8412i1;

    /* renamed from: i2 */
    public float f8413i2;

    /* renamed from: j */
    public RelativeLayout.LayoutParams f8414j;

    /* renamed from: j0 */
    public int f8415j0;

    /* renamed from: j1 */
    public int f8416j1;

    /* renamed from: j2 */
    public int f8417j2;

    /* renamed from: k */
    public RelativeLayout.LayoutParams f8418k;

    /* renamed from: k0 */
    public int f8419k0;

    /* renamed from: k1 */
    public int f8420k1;

    /* renamed from: k2 */
    public int f8421k2;

    /* renamed from: l */
    public Drawable f8422l;

    /* renamed from: l0 */
    public int f8423l0;

    /* renamed from: l1 */
    public int f8424l1;

    /* renamed from: l2 */
    public float f8425l2;

    /* renamed from: m */
    public int f8426m;

    /* renamed from: m0 */
    public int f8427m0;

    /* renamed from: m1 */
    public int f8428m1;

    /* renamed from: m2 */
    public float f8429m2;

    /* renamed from: n */
    public int f8430n;

    /* renamed from: n0 */
    public int f8431n0;

    /* renamed from: n1 */
    public int f8432n1;

    /* renamed from: n2 */
    public boolean f8433n2;

    /* renamed from: o */
    public int f8434o;

    /* renamed from: o0 */
    public int f8435o0;

    /* renamed from: o1 */
    public int f8436o1;

    /* renamed from: o2 */
    public GradientDrawable f8437o2;

    /* renamed from: p */
    public ColorStateList f8438p;

    /* renamed from: p0 */
    public int f8439p0;

    /* renamed from: p1 */
    public int f8440p1;

    /* renamed from: q */
    public int f8441q;

    /* renamed from: q0 */
    public int f8442q0;

    /* renamed from: q1 */
    public int f8443q1;

    /* renamed from: r */
    public Drawable f8444r;

    /* renamed from: r0 */
    public int f8445r0;

    /* renamed from: r1 */
    public int f8446r1;

    /* renamed from: s */
    public int f8447s;

    /* renamed from: s0 */
    public int f8448s0;

    /* renamed from: s1 */
    public int f8449s1;

    /* renamed from: t */
    public int f8450t;

    /* renamed from: t0 */
    public int f8451t0;

    /* renamed from: t1 */
    public int f8452t1;

    /* renamed from: u */
    public int f8453u;

    /* renamed from: u0 */
    public int f8454u0;

    /* renamed from: u1 */
    public int f8455u1;

    /* renamed from: v */
    public ColorStateList f8456v;

    /* renamed from: v0 */
    public int f8457v0;

    /* renamed from: v1 */
    public int f8458v1;

    /* renamed from: w */
    public int f8459w;

    /* renamed from: w0 */
    public int f8460w0;

    /* renamed from: w1 */
    public int f8461w1;

    /* renamed from: x */
    public int f8462x;

    /* renamed from: x0 */
    public int f8463x0;

    /* renamed from: x1 */
    public boolean f8464x1;

    /* renamed from: y */
    public int f8465y;

    /* renamed from: y0 */
    public int f8466y0;

    /* renamed from: y1 */
    public Drawable f8467y1;

    /* renamed from: z */
    public int f8468z;

    /* renamed from: z0 */
    public int f8469z0;

    /* renamed from: z1 */
    public CompoundButton.OnCheckedChangeListener f8470z1;

    public SuperTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8312B1 = false;
        this.f8318D1 = -1;
        this.f8321E1 = 1;
        m7221d(context, attributeSet);
    }

    /* renamed from: E */
    private void m7220E() {
        float f10 = this.f8397e2;
        if (f10 != 0.0f) {
            this.f8437o2.setCornerRadius(f10);
            return;
        }
        GradientDrawable gradientDrawable = this.f8437o2;
        float f11 = this.f8401f2;
        float f12 = this.f8405g2;
        float f13 = this.f8413i2;
        float f14 = this.f8409h2;
        gradientDrawable.setCornerRadii(new float[]{f11, f11, f12, f12, f13, f13, f14, f14});
    }

    /* renamed from: d */
    private void m7221d(Context context, AttributeSet attributeSet) {
        this.f8382a = context;
        this.f8462x = AbstractC6877g.m6480n(context, R$attr.stv_color_common_text, ContextCompat.getColor(context, R$color.stv_color_common_text));
        this.f8465y = AbstractC6877g.m6482p(context, R$attr.stv_text_size, AbstractC6875e.m6450f(context, R$dimen.default_stv_text_size));
        this.f8468z = AbstractC6877g.m6487u(context, R$attr.stv_max_ems, 20);
        this.f8307A = AbstractC6877g.m6482p(context, R$attr.stv_margin, AbstractC6875e.m6450f(context, R$dimen.default_stv_margin));
        this.f8384a2 = AbstractC6877g.m6480n(context, R$attr.stv_color_shape, ContextCompat.getColor(context, R$color.xui_config_color_white));
        m7233a(attributeSet);
        m7222r();
    }

    /* renamed from: r */
    private void m7222r() {
        m7247p();
        m7241j();
        m7240i();
        m7244m();
        m7242k();
        m7238g();
        m7246o();
        m7239h();
    }

    /* renamed from: s */
    private void m7223s() {
        this.f8437o2.setStroke(this.f8417j2, this.f8421k2, this.f8425l2, this.f8429m2);
    }

    /* renamed from: A */
    public final void m7224A(C10273a c10273a, int i10, int i11, int i12) {
        if (c10273a != null) {
            c10273a.getTopTextView().setTextSize(0, i10);
            c10273a.getCenterTextView().setTextSize(0, i11);
            c10273a.getBottomTextView().setTextSize(0, i12);
        }
    }

    /* renamed from: B */
    public final void m7225B(C10273a c10273a, String str, String str2, String str3) {
        if (c10273a != null) {
            c10273a.setTopTextString(str);
            c10273a.setCenterTextString(str2);
            c10273a.setBottomTextString(str3);
        }
    }

    /* renamed from: C */
    public final void m7226C(C10273a c10273a, boolean z10, boolean z11, boolean z12) {
        if (c10273a != null) {
            c10273a.getTopTextView().getPaint().setFakeBoldText(z10);
            c10273a.getCenterTextView().getPaint().setFakeBoldText(z11);
            c10273a.getBottomTextView().getPaint().setFakeBoldText(z12);
        }
    }

    /* renamed from: D */
    public final void m7227D(C10273a c10273a, int i10) {
        if (i10 == 0) {
            c10273a.setGravity(8388627);
        } else if (i10 == 1) {
            c10273a.setGravity(17);
        } else {
            if (i10 != 2) {
                return;
            }
            c10273a.setGravity(8388629);
        }
    }

    /* renamed from: F */
    public SuperTextView m7228F(CharSequence charSequence) {
        C10273a c10273a = this.f8391d;
        if (c10273a != null) {
            c10273a.setCenterTextString(charSequence);
        }
        return this;
    }

    /* renamed from: G */
    public SuperTextView m7229G(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f8470z1 = onCheckedChangeListener;
        Switch r02 = this.f8357Q1;
        if (r02 != null) {
            r02.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        return this;
    }

    /* renamed from: H */
    public SuperTextView m7230H(boolean z10) {
        m7231I(z10, true);
        return this;
    }

    /* renamed from: I */
    public SuperTextView m7231I(boolean z10, boolean z11) {
        this.f8363S1 = z10;
        Switch r02 = this.f8357Q1;
        if (r02 != null) {
            if (z11) {
                r02.setOnCheckedChangeListener(null);
                this.f8357Q1.setChecked(z10);
                this.f8357Q1.setOnCheckedChangeListener(this.f8470z1);
                return this;
            }
            r02.setChecked(z10);
        }
        return this;
    }

    /* renamed from: J */
    public final void m7232J() {
        int i10 = this.f8412i1;
        if (i10 != 0) {
            m7248q(i10, i10);
        } else {
            m7248q(this.f8416j1, this.f8420k1);
        }
    }

    /* renamed from: a */
    public final void m7233a(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f8382a.obtainStyledAttributes(attributeSet, R$styleable.SuperTextView);
        this.f8310B = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sLeftTextString);
        this.f8313C = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sLeftTopTextString);
        this.f8316D = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sLeftBottomTextString);
        this.f8328H = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sCenterTextString);
        this.f8331I = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sCenterTopTextString);
        this.f8334J = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sCenterBottomTextString);
        this.f8319E = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sRightTextString);
        this.f8322F = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sRightTopTextString);
        this.f8325G = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sRightBottomTextString);
        this.f8337K = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sLeftTextColor, this.f8462x);
        this.f8340L = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sLeftTopTextColor, this.f8462x);
        this.f8343M = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sLeftBottomTextColor, this.f8462x);
        this.f8346N = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sCenterTextColor, this.f8462x);
        this.f8349O = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sCenterTopTextColor, this.f8462x);
        this.f8352P = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sCenterBottomTextColor, this.f8462x);
        this.f8355Q = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sRightTextColor, this.f8462x);
        this.f8358R = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sRightTopTextColor, this.f8462x);
        this.f8361S = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sRightBottomTextColor, this.f8462x);
        this.f8364T = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTextSize, this.f8465y);
        this.f8367U = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTopTextSize, this.f8465y);
        this.f8370V = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftBottomTextSize, this.f8465y);
        this.f8403g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTextSize, this.f8465y);
        this.f8407h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTopTextSize, this.f8465y);
        this.f8411i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterBottomTextSize, this.f8465y);
        this.f8373W = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTextSize, this.f8465y);
        this.f8395e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTopTextSize, this.f8465y);
        this.f8399f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightBottomTextSize, this.f8465y);
        this.f8415j0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftTopLines, 1);
        this.f8419k0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftLines, 1);
        this.f8423l0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftBottomLines, 1);
        this.f8427m0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterTopLines, 1);
        this.f8431n0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterLines, 1);
        this.f8435o0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterBottomLines, 1);
        this.f8439p0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightTopLines, 1);
        this.f8442q0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightLines, 1);
        this.f8445r0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightBottomLines, 1);
        this.f8448s0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftTopMaxEms, this.f8468z);
        this.f8451t0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftMaxEms, this.f8468z);
        this.f8454u0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftBottomMaxEms, this.f8468z);
        this.f8457v0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterTopMaxEms, this.f8468z);
        this.f8460w0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterMaxEms, this.f8468z);
        this.f8463x0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterBottomMaxEms, this.f8468z);
        this.f8466y0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightTopMaxEms, this.f8468z);
        this.f8469z0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightMaxEms, this.f8468z);
        this.f8308A0 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightBottomMaxEms, this.f8468z);
        this.f8383a1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sLeftViewGravity, 1);
        this.f8386b1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sCenterViewGravity, 1);
        this.f8389c1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightViewGravity, 1);
        this.f8347N0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftTvDrawableLeft);
        this.f8350O0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftTvDrawableRight);
        this.f8353P0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sCenterTvDrawableLeft);
        this.f8356Q0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sCenterTvDrawableRight);
        this.f8359R0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightTvDrawableLeft);
        this.f8362S0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightTvDrawableRight);
        this.f8380Z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTextViewDrawablePadding, this.f8307A);
        this.f8365T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTvDrawableWidth, -1);
        this.f8368U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftTvDrawableHeight, -1);
        this.f8371V0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTvDrawableWidth, -1);
        this.f8374W0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterTvDrawableHeight, -1);
        this.f8376X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTvDrawableWidth, -1);
        this.f8378Y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightTvDrawableHeight, -1);
        this.f8392d1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftViewWidth, 0);
        this.f8412i1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTopDividerLineMarginLR, 0);
        this.f8416j1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTopDividerLineMarginLeft, 0);
        this.f8420k1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sTopDividerLineMarginRight, 0);
        this.f8424l1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sBottomDividerLineMarginLR, 0);
        this.f8428m1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sBottomDividerLineMarginLeft, 0);
        this.f8432n1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sBottomDividerLineMarginRight, 0);
        this.f8436o1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sDividerLineType, 2);
        this.f8440p1 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sDividerLineColor, AbstractC6877g.m6479m(getContext(), R$attr.xui_config_color_separator_light));
        this.f8443q1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sDividerLineHeight, AbstractC6872b.m6425a(this.f8382a, 0.5f));
        this.f8446r1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftViewMarginLeft, this.f8307A);
        this.f8449s1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftViewMarginRight, this.f8307A);
        this.f8452t1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterViewMarginLeft, 0);
        this.f8455u1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterViewMarginRight, 0);
        this.f8458v1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightViewMarginLeft, this.f8307A);
        this.f8461w1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightViewMarginRight, this.f8307A);
        this.f8422l = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftIconRes);
        this.f8426m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconWidth, 0);
        this.f8430n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconHeight, 0);
        this.f8434o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconMarginLeft, this.f8307A);
        this.f8438p = AbstractC6875e.m6448d(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftIconTint);
        this.f8441q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconPadding, 0);
        this.f8444r = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightIconRes);
        this.f8447s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightIconWidth, 0);
        this.f8450t = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightIconHeight, 0);
        this.f8453u = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightIconMarginRight, this.f8307A);
        this.f8456v = AbstractC6875e.m6448d(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftIconTint);
        this.f8459w = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sLeftIconPadding, 0);
        this.f8311B0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sLeftTopTextIsBold, false);
        this.f8314C0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sLeftTextIsBold, false);
        this.f8317D0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sLeftBottomTextIsBold, false);
        this.f8320E0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sCenterTopTextIsBold, false);
        this.f8323F0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sCenterTextIsBold, false);
        this.f8326G0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sCenterBottomTextIsBold, false);
        this.f8329H0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sRightTopTextIsBold, false);
        this.f8332I0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sRightTextIsBold, false);
        this.f8335J0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sRightBottomTextIsBold, false);
        this.f8338K0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sLeftTextBackground);
        this.f8341L0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sCenterTextBackground);
        this.f8344M0 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightTextBackground);
        this.f8312B1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sEnableEdit, this.f8312B1);
        this.f8324F1 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sEditBackGround);
        this.f8318D1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sEditTextWidth, this.f8318D1);
        this.f8330H1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sEditTextString);
        this.f8327G1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sEditTextHint);
        this.f8333I1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_android_inputType, -1);
        this.f8321E1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sEditTextButtonType, this.f8321E1);
        this.f8336J1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sEditTextIsAsteriskStyle, this.f8336J1);
        this.f8464x1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sUseRipple, true);
        this.f8467y1 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sBackgroundDrawableRes);
        this.f8339K1 = typedArrayObtainStyledAttributes.getInt(R$styleable.SuperTextView_sRightViewType, -1);
        this.f8351O1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sIsChecked, false);
        this.f8348N1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightCheckBoxMarginRight, this.f8307A);
        this.f8345M1 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sRightCheckBoxRes);
        this.f8360R1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sRightSwitchMarginRight, this.f8307A);
        this.f8363S1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sSwitchIsChecked, false);
        this.f8366T1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sTextOff);
        this.f8369U1 = typedArrayObtainStyledAttributes.getString(R$styleable.SuperTextView_sTextOn);
        this.f8372V1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sSwitchMinWidth, 0);
        this.f8375W1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sSwitchPadding, 0);
        this.f8377X1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sThumbTextPadding, 0);
        this.f8379Y1 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sThumbResource);
        this.f8381Z1 = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.SuperTextView_sTrackResource);
        this.f8354P1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sCenterSpaceHeight, AbstractC6872b.m6425a(this.f8382a, 5.0f));
        this.f8387b2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeSelectorPressedColor, this.f8384a2);
        this.f8390c2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeSelectorNormalColor, this.f8384a2);
        this.f8393d2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeSolidColor, this.f8384a2);
        this.f8397e2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersRadius, 0);
        this.f8401f2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersTopLeftRadius, 0);
        this.f8405g2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersTopRightRadius, 0);
        this.f8409h2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersBottomLeftRadius, 0);
        this.f8413i2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeCornersBottomRightRadius, 0);
        this.f8417j2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeStrokeWidth, 0);
        this.f8425l2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeStrokeDashWidth, 0);
        this.f8429m2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SuperTextView_sShapeStrokeDashGap, 0);
        this.f8421k2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SuperTextView_sShapeStrokeColor, this.f8384a2);
        this.f8433n2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SuperTextView_sUseShape, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public GradientDrawable m7234b(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f8437o2 = gradientDrawable;
        gradientDrawable.setShape(0);
        if (i10 == 16842910) {
            this.f8437o2.setColor(this.f8390c2);
        } else if (i10 != 16842919) {
            this.f8437o2.setColor(this.f8393d2);
        } else {
            this.f8437o2.setColor(this.f8387b2);
        }
        m7223s();
        m7220E();
        return this.f8437o2;
    }

    /* renamed from: c */
    public final RelativeLayout.LayoutParams m7235c(RelativeLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new RelativeLayout.LayoutParams(-2, -2) : layoutParams;
    }

    /* renamed from: e */
    public final C10273a m7236e(int i10) {
        C10273a c10273a = new C10273a(this.f8382a);
        c10273a.setId(i10);
        return c10273a;
    }

    /* renamed from: f */
    public final void m7237f(int i10, int i11) {
        if (this.f8400f1 == null) {
            if (this.f8408h1 == null) {
                this.f8408h1 = new RelativeLayout.LayoutParams(-1, this.f8443q1);
            }
            this.f8408h1.addRule(12, -1);
            this.f8408h1.setMarginStart(i10);
            this.f8408h1.setMarginEnd(i11);
            View view = new View(this.f8382a);
            this.f8400f1 = view;
            view.setLayoutParams(this.f8408h1);
            this.f8400f1.setBackgroundColor(this.f8440p1);
        }
        addView(this.f8400f1);
    }

    /* renamed from: g */
    public final void m7238g() {
        if (!this.f8312B1) {
            if (this.f8388c == null) {
                this.f8388c = m7236e(R$id.sCenterViewId);
            }
            RelativeLayout.LayoutParams layoutParamsM7235c = m7235c(this.f8398f);
            this.f8398f = layoutParamsM7235c;
            layoutParamsM7235c.addRule(13, -1);
            this.f8398f.addRule(15, -1);
            if (this.f8386b1 != 1) {
                this.f8398f.addRule(17, R$id.sLeftViewId);
                this.f8398f.addRule(16, R$id.sRightViewId);
            }
            this.f8398f.setMargins(this.f8452t1, 0, this.f8455u1, 0);
            this.f8398f.setMarginStart(this.f8452t1);
            this.f8398f.setMarginEnd(this.f8455u1);
            this.f8388c.setLayoutParams(this.f8398f);
            this.f8388c.setCenterSpaceHeight(this.f8354P1);
            m7251v(this.f8388c, this.f8349O, this.f8346N, this.f8352P);
            m7224A(this.f8388c, this.f8407h0, this.f8403g0, this.f8411i0);
            m7254y(this.f8388c, this.f8427m0, this.f8431n0, this.f8435o0);
            m7255z(this.f8388c, this.f8457v0, this.f8460w0, this.f8463x0);
            m7226C(this.f8388c, this.f8320E0, this.f8323F0, this.f8326G0);
            m7253x(this.f8388c, this.f8386b1);
            m7252w(this.f8388c.getCenterTextView(), this.f8353P0, this.f8356Q0, this.f8380Z0, this.f8371V0, this.f8374W0);
            m7250u(this.f8388c.getCenterTextView(), this.f8341L0);
            m7225B(this.f8388c, this.f8331I, this.f8328H, this.f8334J);
            addView(this.f8388c);
            return;
        }
        if (this.f8315C1 == null) {
            int i10 = this.f8321E1;
            if (i10 == 0) {
                this.f8315C1 = new AppCompatEditText(this.f8382a);
            } else if (i10 == 1) {
                this.f8315C1 = new ClearEditText(this.f8382a);
            } else if (i10 == 2) {
                PasswordEditText passwordEditText = new PasswordEditText(this.f8382a);
                this.f8315C1 = passwordEditText;
                passwordEditText.m6834k(this.f8336J1);
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f8318D1, -2);
        layoutParams.addRule(13, -1);
        layoutParams.addRule(15, -1);
        if (this.f8386b1 != 1) {
            layoutParams.addRule(17, R$id.sLeftViewId);
            layoutParams.addRule(16, R$id.sRightViewId);
        }
        layoutParams.setMargins(this.f8452t1, 0, this.f8455u1, 0);
        layoutParams.setMarginStart(this.f8452t1);
        layoutParams.setMarginEnd(this.f8455u1);
        this.f8315C1.setId(R$id.sCenterEditTextId);
        this.f8315C1.setLayoutParams(layoutParams);
        Drawable drawable = this.f8324F1;
        if (drawable != null) {
            this.f8315C1.setBackground(drawable);
        } else {
            this.f8315C1.setBackgroundColor(AbstractC6875e.m6447c(getContext(), R$color.xui_config_color_transparent));
        }
        this.f8315C1.setTextColor(this.f8346N);
        this.f8315C1.setTextSize(0, this.f8403g0);
        this.f8315C1.setMaxLines(this.f8431n0);
        this.f8315C1.setText(this.f8330H1);
        this.f8315C1.setHint(this.f8327G1);
        int i11 = this.f8333I1;
        if (i11 != -1) {
            this.f8315C1.setInputType(i11);
        }
        addView(this.f8315C1);
    }

    public String getCenterBottomString() {
        C10273a c10273a = this.f8388c;
        return c10273a != null ? c10273a.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getCenterBottomTextView() {
        C10273a c10273a = this.f8388c;
        if (c10273a != null) {
            return c10273a.getBottomTextView();
        }
        return null;
    }

    @Nullable
    public EditText getCenterEditText() {
        return this.f8315C1;
    }

    public String getCenterEditValue() {
        EditText editText = this.f8315C1;
        return editText != null ? editText.getText().toString() : "";
    }

    public String getCenterString() {
        C10273a c10273a = this.f8388c;
        return c10273a != null ? c10273a.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getCenterTextView() {
        C10273a c10273a = this.f8388c;
        if (c10273a != null) {
            return c10273a.getCenterTextView();
        }
        return null;
    }

    public String getCenterTopString() {
        C10273a c10273a = this.f8388c;
        return c10273a != null ? c10273a.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getCenterTopTextView() {
        C10273a c10273a = this.f8388c;
        if (c10273a != null) {
            return c10273a.getTopTextView();
        }
        return null;
    }

    public boolean getCheckBoxIsChecked() {
        CheckBox checkBox = this.f8342L1;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return false;
    }

    public String getLeftBottomString() {
        C10273a c10273a = this.f8385b;
        return c10273a != null ? c10273a.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getLeftBottomTextView() {
        C10273a c10273a = this.f8385b;
        if (c10273a != null) {
            return c10273a.getBottomTextView();
        }
        return null;
    }

    public ImageView getLeftIconIV() {
        this.f8414j.setMargins(this.f8434o, 0, 0, 0);
        this.f8414j.setMarginStart(this.f8434o);
        return this.f8406h;
    }

    public String getLeftString() {
        C10273a c10273a = this.f8385b;
        return c10273a != null ? c10273a.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getLeftTextView() {
        C10273a c10273a = this.f8385b;
        if (c10273a != null) {
            return c10273a.getCenterTextView();
        }
        return null;
    }

    public String getLeftTopString() {
        C10273a c10273a = this.f8385b;
        return c10273a != null ? c10273a.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getLeftTopTextView() {
        C10273a c10273a = this.f8385b;
        if (c10273a != null) {
            return c10273a.getTopTextView();
        }
        return null;
    }

    public String getRightBottomString() {
        C10273a c10273a = this.f8391d;
        return c10273a != null ? c10273a.getBottomTextView().getText().toString().trim() : "";
    }

    public TextView getRightBottomTextView() {
        C10273a c10273a = this.f8391d;
        if (c10273a != null) {
            return c10273a.getBottomTextView();
        }
        return null;
    }

    public ImageView getRightIconIV() {
        this.f8418k.setMargins(0, 0, this.f8453u, 0);
        this.f8414j.setMarginEnd(this.f8453u);
        return this.f8410i;
    }

    public String getRightString() {
        C10273a c10273a = this.f8391d;
        return c10273a != null ? c10273a.getCenterTextView().getText().toString().trim() : "";
    }

    public TextView getRightTextView() {
        C10273a c10273a = this.f8391d;
        if (c10273a != null) {
            return c10273a.getCenterTextView();
        }
        return null;
    }

    public String getRightTopString() {
        C10273a c10273a = this.f8391d;
        return c10273a != null ? c10273a.getTopTextView().getText().toString().trim() : "";
    }

    public TextView getRightTopTextView() {
        C10273a c10273a = this.f8391d;
        if (c10273a != null) {
            return c10273a.getTopTextView();
        }
        return null;
    }

    public StateListDrawable getSelector() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, m7234b(R.attr.state_pressed));
        stateListDrawable.addState(new int[0], m7234b(R.attr.state_enabled));
        return stateListDrawable;
    }

    public boolean getSwitchIsChecked() {
        Switch r02 = this.f8357Q1;
        if (r02 != null) {
            return r02.isChecked();
        }
        return false;
    }

    /* renamed from: h */
    public final void m7239h() {
        if (this.f8433n2) {
            return;
        }
        int i10 = this.f8436o1;
        if (i10 == 1) {
            m7232J();
            return;
        }
        if (i10 == 2) {
            m7249t();
        } else {
            if (i10 != 3) {
                return;
            }
            m7232J();
            m7249t();
        }
    }

    /* renamed from: i */
    public final void m7240i() {
        int i10 = this.f8339K1;
        if (i10 == 0) {
            m7243l();
        } else {
            if (i10 != 1) {
                return;
            }
            m7245n();
        }
    }

    /* renamed from: j */
    public final void m7241j() {
        int i10;
        if (this.f8406h == null) {
            this.f8406h = new AppCompatImageView(this.f8382a);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.f8414j = layoutParams;
        layoutParams.addRule(20, -1);
        this.f8414j.addRule(15, -1);
        int i11 = this.f8430n;
        if (i11 != 0 && (i10 = this.f8426m) != 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.f8414j;
            layoutParams2.width = i10;
            layoutParams2.height = i11;
        }
        this.f8406h.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f8406h.setId(R$id.sLeftImgId);
        this.f8406h.setLayoutParams(this.f8414j);
        ImageView imageView = this.f8406h;
        int i12 = this.f8441q;
        imageView.setPadding(i12, i12, i12, i12);
        if (this.f8422l != null) {
            this.f8414j.setMargins(this.f8434o, 0, 0, 0);
            this.f8414j.setMarginStart(this.f8434o);
            this.f8406h.setImageDrawable(this.f8422l);
        }
        ColorStateList colorStateList = this.f8438p;
        if (colorStateList != null) {
            this.f8406h.setImageTintList(colorStateList);
        }
        addView(this.f8406h);
    }

    /* renamed from: k */
    public final void m7242k() {
        if (this.f8385b == null) {
            this.f8385b = m7236e(R$id.sLeftViewId);
        }
        RelativeLayout.LayoutParams layoutParamsM7235c = m7235c(this.f8394e);
        this.f8394e = layoutParamsM7235c;
        layoutParamsM7235c.addRule(17, R$id.sLeftImgId);
        this.f8394e.addRule(15, -1);
        int i10 = this.f8392d1;
        if (i10 != 0) {
            this.f8394e.width = i10;
        }
        this.f8394e.setMargins(this.f8446r1, 0, this.f8449s1, 0);
        this.f8385b.setLayoutParams(this.f8394e);
        this.f8385b.setCenterSpaceHeight(this.f8354P1);
        m7251v(this.f8385b, this.f8340L, this.f8337K, this.f8343M);
        m7224A(this.f8385b, this.f8367U, this.f8364T, this.f8370V);
        m7254y(this.f8385b, this.f8415j0, this.f8419k0, this.f8423l0);
        m7255z(this.f8385b, this.f8448s0, this.f8451t0, this.f8454u0);
        m7226C(this.f8385b, this.f8311B0, this.f8314C0, this.f8317D0);
        m7253x(this.f8385b, this.f8383a1);
        m7252w(this.f8385b.getCenterTextView(), this.f8347N0, this.f8350O0, this.f8380Z0, this.f8365T0, this.f8368U0);
        m7250u(this.f8385b.getCenterTextView(), this.f8338K0);
        m7225B(this.f8385b, this.f8313C, this.f8310B, this.f8316D);
        addView(this.f8385b);
    }

    /* renamed from: l */
    public final void m7243l() {
        if (this.f8342L1 == null) {
            this.f8342L1 = new CheckBox(this.f8382a);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(0, 0, this.f8348N1, 0);
        layoutParams.setMarginEnd(this.f8348N1);
        this.f8342L1.setId(R$id.sRightCheckBoxId);
        this.f8342L1.setLayoutParams(layoutParams);
        if (this.f8345M1 != null) {
            this.f8342L1.setGravity(13);
            this.f8342L1.setButtonDrawable(this.f8345M1);
        }
        this.f8342L1.setChecked(this.f8351O1);
        this.f8342L1.setOnCheckedChangeListener(this.f8309A1);
        addView(this.f8342L1);
    }

    /* renamed from: m */
    public final void m7244m() {
        int i10;
        if (this.f8410i == null) {
            this.f8410i = new AppCompatImageView(this.f8382a);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.f8418k = layoutParams;
        layoutParams.addRule(15, -1);
        int i11 = this.f8339K1;
        if (i11 == 0) {
            this.f8418k.addRule(16, R$id.sRightCheckBoxId);
        } else if (i11 != 1) {
            this.f8418k.addRule(21, -1);
        } else {
            this.f8418k.addRule(16, R$id.sRightSwitchId);
        }
        int i12 = this.f8450t;
        if (i12 != 0 && (i10 = this.f8447s) != 0) {
            RelativeLayout.LayoutParams layoutParams2 = this.f8418k;
            layoutParams2.width = i10;
            layoutParams2.height = i12;
        }
        this.f8410i.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f8410i.setId(R$id.sRightImgId);
        this.f8410i.setLayoutParams(this.f8418k);
        ImageView imageView = this.f8410i;
        int i13 = this.f8459w;
        imageView.setPadding(i13, i13, i13, i13);
        if (this.f8444r != null) {
            this.f8418k.setMargins(0, 0, this.f8453u, 0);
            this.f8418k.setMarginEnd(this.f8453u);
            this.f8410i.setImageDrawable(this.f8444r);
        }
        ColorStateList colorStateList = this.f8456v;
        if (colorStateList != null) {
            this.f8410i.setImageTintList(colorStateList);
        }
        addView(this.f8410i);
    }

    /* renamed from: n */
    public final void m7245n() {
        if (this.f8357Q1 == null) {
            this.f8357Q1 = new Switch(this.f8382a);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(21, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(0, 0, this.f8360R1, 0);
        layoutParams.setMarginEnd(this.f8360R1);
        this.f8357Q1.setId(R$id.sRightSwitchId);
        this.f8357Q1.setLayoutParams(layoutParams);
        this.f8357Q1.setChecked(this.f8363S1);
        if (!TextUtils.isEmpty(this.f8366T1)) {
            this.f8357Q1.setTextOff(this.f8366T1);
        }
        if (!TextUtils.isEmpty(this.f8369U1)) {
            this.f8357Q1.setTextOn(this.f8369U1);
        }
        int i10 = this.f8372V1;
        if (i10 != 0) {
            this.f8357Q1.setSwitchMinWidth(i10);
        }
        int i11 = this.f8375W1;
        if (i11 != 0) {
            this.f8357Q1.setSwitchPadding(i11);
        }
        Drawable drawable = this.f8379Y1;
        if (drawable != null) {
            this.f8357Q1.setThumbDrawable(drawable);
        }
        if (this.f8379Y1 != null) {
            this.f8357Q1.setTrackDrawable(this.f8381Z1);
        }
        int i12 = this.f8377X1;
        if (i12 != 0) {
            this.f8357Q1.setThumbTextPadding(i12);
        }
        this.f8357Q1.setOnCheckedChangeListener(this.f8470z1);
        addView(this.f8357Q1);
    }

    /* renamed from: o */
    public final void m7246o() {
        if (this.f8391d == null) {
            this.f8391d = m7236e(R$id.sRightViewId);
        }
        RelativeLayout.LayoutParams layoutParamsM7235c = m7235c(this.f8402g);
        this.f8402g = layoutParamsM7235c;
        layoutParamsM7235c.addRule(15, -1);
        this.f8402g.addRule(16, R$id.sRightImgId);
        this.f8402g.setMargins(this.f8458v1, 0, this.f8461w1, 0);
        this.f8402g.setMarginStart(this.f8458v1);
        this.f8402g.setMarginEnd(this.f8461w1);
        this.f8391d.setLayoutParams(this.f8402g);
        this.f8391d.setCenterSpaceHeight(this.f8354P1);
        m7251v(this.f8391d, this.f8358R, this.f8355Q, this.f8361S);
        m7224A(this.f8391d, this.f8395e0, this.f8373W, this.f8399f0);
        m7254y(this.f8391d, this.f8439p0, this.f8442q0, this.f8445r0);
        m7255z(this.f8391d, this.f8466y0, this.f8469z0, this.f8308A0);
        m7226C(this.f8391d, this.f8329H0, this.f8332I0, this.f8335J0);
        m7253x(this.f8391d, this.f8389c1);
        m7252w(this.f8391d.getCenterTextView(), this.f8359R0, this.f8362S0, this.f8380Z0, this.f8376X0, this.f8378Y0);
        m7250u(this.f8391d.getCenterTextView(), this.f8344M0);
        m7225B(this.f8391d, this.f8322F, this.f8319E, this.f8325G);
        addView(this.f8391d);
    }

    /* renamed from: p */
    public final void m7247p() {
        if (this.f8464x1) {
            setBackgroundResource(R$drawable.stv_btn_selector_white);
            setClickable(true);
        }
        Drawable drawable = this.f8467y1;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        if (this.f8433n2) {
            setBackground(getSelector());
        }
    }

    /* renamed from: q */
    public final void m7248q(int i10, int i11) {
        if (this.f8396e1 == null) {
            if (this.f8404g1 == null) {
                this.f8404g1 = new RelativeLayout.LayoutParams(-1, this.f8443q1);
            }
            this.f8404g1.addRule(10, -1);
            this.f8404g1.setMarginStart(i10);
            this.f8404g1.setMarginEnd(i11);
            View view = new View(this.f8382a);
            this.f8396e1 = view;
            view.setLayoutParams(this.f8404g1);
            this.f8396e1.setBackgroundColor(this.f8440p1);
        }
        addView(this.f8396e1);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        C10273a c10273a = this.f8385b;
        if (c10273a != null) {
            c10273a.setTypeface(typeface);
        }
        C10273a c10273a2 = this.f8388c;
        if (c10273a2 != null) {
            c10273a2.setTypeface(typeface);
        }
        EditText editText = this.f8315C1;
        if (editText != null) {
            editText.setTypeface(typeface);
        }
        C10273a c10273a3 = this.f8391d;
        if (c10273a3 != null) {
            c10273a3.setTypeface(typeface);
        }
        C10273a c10273a4 = this.f8388c;
        if (c10273a4 != null) {
            c10273a4.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public final void m7249t() {
        int i10 = this.f8424l1;
        if (i10 != 0) {
            m7237f(i10, i10);
        } else {
            m7237f(this.f8428m1, this.f8432n1);
        }
    }

    /* renamed from: u */
    public final void m7250u(TextView textView, Drawable drawable) {
        if (drawable != null) {
            textView.setVisibility(0);
            textView.setBackground(drawable);
        }
    }

    /* renamed from: v */
    public final void m7251v(C10273a c10273a, int i10, int i11, int i12) {
        if (c10273a != null) {
            c10273a.getTopTextView().setTextColor(i10);
            c10273a.getCenterTextView().setTextColor(i11);
            c10273a.getBottomTextView().setTextColor(i12);
        }
    }

    /* renamed from: w */
    public void m7252w(TextView textView, Drawable drawable, Drawable drawable2, int i10, int i11, int i12) {
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
    public final void m7253x(C10273a c10273a, int i10) {
        if (c10273a != null) {
            m7227D(c10273a, i10);
        }
    }

    /* renamed from: y */
    public final void m7254y(C10273a c10273a, int i10, int i11, int i12) {
        if (c10273a != null) {
            c10273a.getTopTextView().setMaxLines(i10);
            c10273a.getCenterTextView().setMaxLines(i11);
            c10273a.getBottomTextView().setMaxLines(i12);
        }
    }

    /* renamed from: z */
    public final void m7255z(C10273a c10273a, int i10, int i11, int i12) {
        if (c10273a != null) {
            c10273a.m19261i(i10, i11, i12);
        }
    }

    private void setDefaultCenterViewClickListener(C10273a c10273a) {
    }

    private void setDefaultLeftViewClickListener(C10273a c10273a) {
    }

    private void setDefaultRightViewClickListener(C10273a c10273a) {
    }
}
