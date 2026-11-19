package com.xuexiang.xui.widget.textview.supertextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import io.github.inflationx.calligraphy3.HasTypeface;

/* loaded from: classes5.dex */
public class CommonTextView extends RelativeLayout implements HasTypeface {

    /* renamed from: A */
    public CharSequence f17361A;

    /* renamed from: A0 */
    public int f17362A0;

    /* renamed from: B */
    public CharSequence f17363B;

    /* renamed from: B0 */
    public boolean f17364B0;

    /* renamed from: C */
    public CharSequence f17365C;

    /* renamed from: C0 */
    public boolean f17366C0;

    /* renamed from: D */
    public int f17367D;

    /* renamed from: D0 */
    public int f17368D0;

    /* renamed from: E */
    public int f17369E;

    /* renamed from: E0 */
    public int f17370E0;

    /* renamed from: F */
    public int f17371F;

    /* renamed from: F0 */
    public int f17372F0;

    /* renamed from: G */
    public int f17373G;

    /* renamed from: G0 */
    public int f17374G0;

    /* renamed from: H */
    public int f17375H;

    /* renamed from: H0 */
    public int f17376H0;

    /* renamed from: I */
    public int f17377I;

    /* renamed from: I0 */
    public TextView f17378I0;

    /* renamed from: J */
    public int f17379J;

    /* renamed from: J0 */
    public TextView f17380J0;

    /* renamed from: K */
    public int f17381K;

    /* renamed from: K0 */
    public TextView f17382K0;

    /* renamed from: L */
    public int f17383L;

    /* renamed from: L0 */
    public TextView f17384L0;

    /* renamed from: M */
    public int f17385M;

    /* renamed from: M0 */
    public TextView f17386M0;

    /* renamed from: N */
    public int f17387N;

    /* renamed from: N0 */
    public TextView f17388N0;

    /* renamed from: O */
    public int f17389O;

    /* renamed from: O0 */
    public TextView f17390O0;

    /* renamed from: P */
    public int f17391P;

    /* renamed from: P0 */
    public TextView f17392P0;

    /* renamed from: Q */
    public int f17393Q;

    /* renamed from: Q0 */
    public TextView f17394Q0;

    /* renamed from: R */
    public int f17395R;

    /* renamed from: R0 */
    public ImageView f17396R0;

    /* renamed from: S */
    public int f17397S;

    /* renamed from: S0 */
    public View f17398S0;

    /* renamed from: T */
    public int f17399T;

    /* renamed from: T0 */
    public View f17400T0;

    /* renamed from: U */
    public int f17401U;

    /* renamed from: U0 */
    public View f17402U0;

    /* renamed from: V */
    public int f17403V;

    /* renamed from: V0 */
    public boolean f17404V0;

    /* renamed from: W */
    public int f17405W;

    /* renamed from: W0 */
    public boolean f17406W0;

    /* renamed from: X0 */
    public boolean f17407X0;

    /* renamed from: Y0 */
    public RelativeLayout.LayoutParams f17408Y0;

    /* renamed from: Z0 */
    public RelativeLayout.LayoutParams f17409Z0;

    /* renamed from: a1 */
    public RelativeLayout.LayoutParams f17410a1;

    /* renamed from: b1 */
    public RelativeLayout.LayoutParams f17411b1;

    /* renamed from: c */
    public Context f17412c;

    /* renamed from: c1 */
    public RelativeLayout.LayoutParams f17413c1;

    /* renamed from: d */
    public int f17414d;

    /* renamed from: d1 */
    public RelativeLayout.LayoutParams f17415d1;

    /* renamed from: e */
    public int f17416e;

    /* renamed from: e0 */
    public int f17417e0;

    /* renamed from: e1 */
    public RelativeLayout.LayoutParams f17418e1;

    /* renamed from: f */
    public int f17419f;

    /* renamed from: f0 */
    public int f17420f0;

    /* renamed from: f1 */
    public RelativeLayout.LayoutParams f17421f1;

    /* renamed from: g */
    public int f17422g;

    /* renamed from: g0 */
    public int f17423g0;

    /* renamed from: g1 */
    public RelativeLayout.LayoutParams f17424g1;

    /* renamed from: h */
    public Drawable f17425h;

    /* renamed from: h0 */
    public int f17426h0;

    /* renamed from: h1 */
    public RelativeLayout.LayoutParams f17427h1;

    /* renamed from: i */
    public Drawable f17428i;

    /* renamed from: i0 */
    public int f17429i0;

    /* renamed from: i1 */
    public RelativeLayout.LayoutParams f17430i1;

    /* renamed from: j */
    public Drawable f17431j;

    /* renamed from: j0 */
    public int f17432j0;

    /* renamed from: j1 */
    public RelativeLayout.LayoutParams f17433j1;

    /* renamed from: k */
    public Drawable f17434k;

    /* renamed from: k0 */
    public int f17435k0;

    /* renamed from: k1 */
    public Drawable f17436k1;

    /* renamed from: l */
    public Drawable f17437l;

    /* renamed from: l0 */
    public int f17438l0;

    /* renamed from: l1 */
    public boolean f17439l1;

    /* renamed from: m */
    public Drawable f17440m;

    /* renamed from: m0 */
    public int f17441m0;

    /* renamed from: m1 */
    public int f17442m1;

    /* renamed from: n */
    public Drawable f17443n;

    /* renamed from: n0 */
    public int f17444n0;

    /* renamed from: o */
    public Drawable f17445o;

    /* renamed from: o0 */
    public int f17446o0;

    /* renamed from: p */
    public Drawable f17447p;

    /* renamed from: p0 */
    public int f17448p0;

    /* renamed from: q */
    public Drawable f17449q;

    /* renamed from: q0 */
    public int f17450q0;

    /* renamed from: r */
    public Drawable f17451r;

    /* renamed from: r0 */
    public int f17452r0;

    /* renamed from: s */
    public Drawable f17453s;

    /* renamed from: s0 */
    public int f17454s0;

    /* renamed from: t */
    public Drawable f17455t;

    /* renamed from: t0 */
    public int f17456t0;

    /* renamed from: u */
    public CharSequence f17457u;

    /* renamed from: u0 */
    public int f17458u0;

    /* renamed from: v */
    public CharSequence f17459v;

    /* renamed from: v0 */
    public int f17460v0;

    /* renamed from: w */
    public CharSequence f17461w;

    /* renamed from: w0 */
    public int f17462w0;

    /* renamed from: x */
    public CharSequence f17463x;

    /* renamed from: x0 */
    public int f17464x0;

    /* renamed from: y */
    public CharSequence f17465y;

    /* renamed from: y0 */
    public int f17466y0;

    /* renamed from: z */
    public CharSequence f17467z;

    /* renamed from: z0 */
    public int f17468z0;

    /* renamed from: com.xuexiang.xui.widget.textview.supertextview.CommonTextView$a */
    public class ViewOnClickListenerC8302a implements View.OnClickListener {
        public ViewOnClickListenerC8302a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonTextView.m13597a(CommonTextView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.supertextview.CommonTextView$b */
    public class ViewOnClickListenerC8303b implements View.OnClickListener {
        public ViewOnClickListenerC8303b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonTextView.m13597a(CommonTextView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.supertextview.CommonTextView$c */
    public class ViewOnClickListenerC8304c implements View.OnClickListener {
        public ViewOnClickListenerC8304c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonTextView.m13597a(CommonTextView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.supertextview.CommonTextView$d */
    public class ViewOnClickListenerC8305d implements View.OnClickListener {
        public ViewOnClickListenerC8305d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonTextView.m13597a(CommonTextView.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.textview.supertextview.CommonTextView$e */
    public static class C8306e {
    }

    public CommonTextView(Context context) {
        super(context);
        this.f17422g = -1;
        this.f17366C0 = true;
        this.f17368D0 = 10;
        this.f17370E0 = 1;
        m13600f(context, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C8306e m13597a(CommonTextView commonTextView) {
        commonTextView.getClass();
        return null;
    }

    /* renamed from: c */
    private void m13598c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f17412c.obtainStyledAttributes(attributeSet, R$styleable.CommonTextView);
        this.f17425h = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cLeftIconResForDrawableLeft);
        this.f17428i = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cLeftIconResForDrawableTop);
        this.f17431j = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cLeftIconResForDrawableRight);
        this.f17434k = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cLeftIconResForDrawableBottom);
        this.f17437l = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cCenterIconResForDrawableLeft);
        this.f17440m = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cCenterIconResForDrawableTop);
        this.f17443n = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cCenterIconResForDrawableRight);
        this.f17445o = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cCenterIconResForDrawableBottom);
        this.f17447p = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cRightIconResForDrawableLeft);
        this.f17449q = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cRightIconResForDrawableTop);
        this.f17451r = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cRightIconResForDrawableRight);
        this.f17453s = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cRightIconResForDrawableBottom);
        this.f17455t = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cLeftImageViewDrawableRes);
        this.f17457u = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cLeftTextString);
        this.f17459v = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cLeftTopTextString);
        this.f17461w = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cLeftBottomTextString);
        this.f17361A = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cCenterTextString);
        this.f17363B = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cCenterTopTextString);
        this.f17365C = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cCenterBottomTextString);
        this.f17463x = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cRightTextString);
        this.f17465y = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cRightTopTextString);
        this.f17467z = typedArrayObtainStyledAttributes.getString(R$styleable.CommonTextView_cRightBottomTextString);
        this.f17385M = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cLeftTextColor, this.f17414d);
        this.f17387N = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cLeftTopTextColor, this.f17414d);
        this.f17389O = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cLeftBottomTextColor, this.f17414d);
        this.f17391P = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cCenterTextColor, this.f17414d);
        this.f17393Q = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cCenterTopTextColor, this.f17414d);
        this.f17395R = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cCenterBottomTextColor, this.f17414d);
        this.f17397S = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cRightTextColor, this.f17414d);
        this.f17399T = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cRightTopTextColor, this.f17414d);
        this.f17401U = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cRightBottomTextColor, this.f17414d);
        this.f17367D = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftTextSize, this.f17416e);
        this.f17369E = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftTopTextSize, this.f17416e);
        this.f17371F = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftBottomTextSize, this.f17416e);
        this.f17379J = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterTextSize, this.f17416e);
        this.f17381K = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterTopTextSize, this.f17416e);
        this.f17383L = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterBottomTextSize, this.f17416e);
        this.f17373G = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightTextSize, this.f17416e);
        this.f17375H = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightTopTextSize, this.f17416e);
        this.f17377I = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightBottomTextSize, this.f17416e);
        this.f17403V = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftIconDrawablePadding, this.f17419f);
        this.f17405W = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterIconDrawablePadding, this.f17419f);
        this.f17417e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightIconDrawablePadding, this.f17419f);
        this.f17420f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftViewPaddingLeft, this.f17419f);
        this.f17423g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftViewPaddingRight, this.f17419f);
        this.f17426h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterViewPaddingLeft, this.f17419f);
        this.f17429i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterViewPaddingRight, this.f17419f);
        this.f17432j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightViewPaddingLeft, this.f17419f);
        this.f17435k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightViewPaddingRight, this.f17419f);
        this.f17452r0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cBothDividerLineMarginLeft, 0);
        this.f17454s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cBothDividerLineMarginRight, 0);
        this.f17438l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cTopDividerLineMarginLR, 0);
        this.f17441m0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cTopDividerLineMarginLeft, 0);
        this.f17444n0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cTopDividerLineMarginRight, 0);
        this.f17446o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cBottomDividerLineMarginLR, 0);
        this.f17448p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cBottomDividerLineMarginLeft, 0);
        this.f17450q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cBottomDividerLineMarginRight, 0);
        this.f17458u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftImageViewMarginLeft, this.f17419f);
        this.f17456t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterSpaceHeight, this.f17456t0);
        this.f17466y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cLeftTextViewLineSpacingExtra, 0);
        this.f17468z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterTextViewLineSpacingExtra, 0);
        this.f17362A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cRightTextViewLineSpacingExtra, 0);
        this.f17460v0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTextView_cShowDividerLineType, 2);
        this.f17462w0 = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cDividerLineColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_separator_light));
        this.f17464x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cDividerLineHeight, m13601b(this.f17412c, 0.5f));
        this.f17364B0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTextView_cUseRipple, false);
        this.f17422g = typedArrayObtainStyledAttributes.getColor(R$styleable.CommonTextView_cBackgroundColor, this.f17422g);
        this.f17366C0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTextView_cSetSingleLine, true);
        this.f17368D0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTextView_cSetMaxEms, this.f17368D0);
        this.f17370E0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTextView_cSetLines, 1);
        this.f17372F0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTextView_cLeftTextViewGravity, 1);
        this.f17374G0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTextView_cCenterTextViewGravity, 1);
        this.f17376H0 = typedArrayObtainStyledAttributes.getInt(R$styleable.CommonTextView_cRightTextViewGravity, 1);
        this.f17404V0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTextView_cLeftViewIsClickable, false);
        this.f17406W0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTextView_cCenterViewIsClickable, false);
        this.f17407X0 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTextView_cRightViewIsClickable, false);
        this.f17436k1 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.CommonTextView_cBackgroundDrawableRes);
        this.f17439l1 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CommonTextView_cIsCenterAlignLeft, false);
        this.f17442m1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CommonTextView_cCenterViewMarginLeft, m13601b(this.f17412c, 200.0f));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    private void m13599e() {
        m13608l();
        m13613q();
        m13604h();
        if (this.f17455t != null) {
            m13610n();
        }
        if (this.f17457u != null || this.f17425h != null || this.f17431j != null) {
            m13611o();
        }
        if (this.f17361A != null) {
            m13606j();
        }
        if (this.f17463x != null || this.f17447p != null || this.f17451r != null) {
            m13615s();
        }
        if (this.f17459v != null) {
            m13612p();
        }
        if (this.f17461w != null) {
            m13609m();
        }
        if (this.f17363B != null) {
            m13607k();
        }
        if (this.f17365C != null) {
            m13605i();
        }
        if (this.f17465y != null) {
            m13616t();
        }
        if (this.f17467z != null) {
            m13614r();
        }
    }

    /* renamed from: f */
    private void m13600f(Context context, AttributeSet attributeSet) {
        this.f17412c = context;
        this.f17414d = AbstractC8041g.m12218e(context, R$attr.stv_color_common_text, AbstractC8040f.m12202c(R$color.stv_color_common_text));
        this.f17416e = AbstractC8041g.m12220g(context, R$attr.stv_text_size, AbstractC8040f.m12204e(R$dimen.default_stv_text_size));
        this.f17419f = AbstractC8041g.m12220g(context, R$attr.stv_margin, AbstractC8040f.m12204e(R$dimen.default_stv_margin));
        this.f17456t0 = m13601b(context, 5.0f);
        m13598c(attributeSet);
        m13599e();
    }

    /* renamed from: b */
    public int m13601b(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: d */
    public RelativeLayout.LayoutParams m13602d(RelativeLayout.LayoutParams layoutParams) {
        return layoutParams == null ? new RelativeLayout.LayoutParams(-2, -2) : layoutParams;
    }

    /* renamed from: g */
    public final void m13603g(int i10, int i11) {
        if (this.f17400T0 == null) {
            if (this.f17413c1 == null) {
                this.f17413c1 = new RelativeLayout.LayoutParams(-1, this.f17464x0);
            }
            this.f17413c1.addRule(12, -1);
            this.f17413c1.setMarginStart(i10);
            this.f17413c1.setMarginEnd(i11);
            View view = new View(this.f17412c);
            this.f17400T0 = view;
            view.setLayoutParams(this.f17413c1);
            this.f17400T0.setBackgroundColor(this.f17462w0);
        }
        addView(this.f17400T0);
    }

    public CharSequence getCenterBottomTextString() {
        TextView textView = this.f17392P0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getCenterTextString() {
        TextView textView = this.f17380J0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getCenterTopTextString() {
        TextView textView = this.f17386M0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getLeftBottomTextString() {
        TextView textView = this.f17390O0;
        return textView != null ? textView.getText() : "";
    }

    public ImageView getLeftImageView() {
        if (this.f17396R0 == null) {
            m13610n();
        }
        return this.f17396R0;
    }

    public CharSequence getLeftTextString() {
        TextView textView = this.f17378I0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getLeftTopTextString() {
        TextView textView = this.f17384L0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getRightBottomTextString() {
        TextView textView = this.f17394Q0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getRightTextString() {
        TextView textView = this.f17382K0;
        return textView != null ? textView.getText() : "";
    }

    public CharSequence getRightTopTextString() {
        TextView textView = this.f17388N0;
        return textView != null ? textView.getText() : "";
    }

    /* renamed from: h */
    public final void m13604h() {
        if (this.f17402U0 == null) {
            if (this.f17433j1 == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f17456t0);
                this.f17433j1 = layoutParams;
                layoutParams.addRule(15, -1);
            }
            View view = new View(this.f17412c);
            this.f17402U0 = view;
            view.setId(R$id.cCenterBaseLineId);
            this.f17402U0.setLayoutParams(this.f17433j1);
        }
        addView(this.f17402U0);
    }

    /* renamed from: i */
    public final void m13605i() {
        if (this.f17392P0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17427h1;
            if (layoutParams == null) {
                this.f17427h1 = m13602d(layoutParams);
            }
            this.f17427h1.addRule(15, -1);
            this.f17427h1.addRule(13, -1);
            this.f17427h1.addRule(3, R$id.cCenterBaseLineId);
            this.f17427h1.setMargins(this.f17426h0, 0, this.f17429i0, 0);
            TextView textViewM13617u = m13617u(this.f17392P0, this.f17427h1, R$id.cCenterBottomTextId, this.f17395R, this.f17383L);
            this.f17392P0 = textViewM13617u;
            textViewM13617u.setText(this.f17365C);
            this.f17392P0.setLineSpacing(this.f17468z0, 1.0f);
            m13621y(this.f17392P0, this.f17374G0);
        }
    }

    /* renamed from: j */
    public final void m13606j() {
        CommonTextView commonTextView;
        if (this.f17380J0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17409Z0;
            if (layoutParams == null) {
                if (this.f17439l1) {
                    this.f17409Z0 = new RelativeLayout.LayoutParams(-1, -2);
                } else {
                    this.f17409Z0 = m13602d(layoutParams);
                }
            }
            this.f17409Z0.addRule(15, -1);
            this.f17409Z0.addRule(13, -1);
            if (this.f17439l1) {
                commonTextView = this;
                commonTextView.f17380J0 = commonTextView.m13617u(this.f17380J0, this.f17409Z0, R$id.cCenterTextId, this.f17391P, this.f17379J);
                commonTextView.f17409Z0.setMargins(commonTextView.f17442m1, 0, commonTextView.f17429i0, 0);
                m13621y(commonTextView.f17380J0, 0);
            } else {
                commonTextView = this;
                commonTextView.f17380J0 = commonTextView.m13617u(commonTextView.f17380J0, commonTextView.f17409Z0, R$id.cCenterTextId, commonTextView.f17391P, commonTextView.f17379J);
                commonTextView.f17409Z0.setMargins(commonTextView.f17426h0, 0, commonTextView.f17429i0, 0);
                m13621y(commonTextView.f17380J0, commonTextView.f17374G0);
            }
            commonTextView.f17380J0.setText(commonTextView.f17361A);
            commonTextView.f17380J0.setLineSpacing(commonTextView.f17468z0, 1.0f);
            if (commonTextView.f17406W0) {
                commonTextView.f17380J0.setOnClickListener(new ViewOnClickListenerC8304c());
            }
        } else {
            commonTextView = this;
        }
        commonTextView.m13620x(commonTextView.f17380J0, commonTextView.f17437l, commonTextView.f17440m, commonTextView.f17443n, commonTextView.f17445o, commonTextView.f17405W);
    }

    /* renamed from: k */
    public final void m13607k() {
        if (this.f17386M0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17418e1;
            if (layoutParams == null) {
                this.f17418e1 = m13602d(layoutParams);
            }
            this.f17418e1.addRule(15, -1);
            this.f17418e1.addRule(13, -1);
            this.f17418e1.addRule(2, R$id.cCenterBaseLineId);
            this.f17418e1.setMargins(this.f17426h0, 0, this.f17429i0, 0);
            TextView textViewM13617u = m13617u(this.f17386M0, this.f17418e1, R$id.cCenterTopTextId, this.f17393Q, this.f17381K);
            this.f17386M0 = textViewM13617u;
            textViewM13617u.setText(this.f17363B);
            this.f17386M0.setLineSpacing(this.f17468z0, 1.0f);
            m13621y(this.f17386M0, this.f17374G0);
        }
    }

    /* renamed from: l */
    public final void m13608l() {
        setBackgroundColor(this.f17422g);
        if (this.f17364B0) {
            setBackgroundResource(R$drawable.stv_btn_selector_white);
        }
        setOnClickListener(new ViewOnClickListenerC8302a());
        Drawable drawable = this.f17436k1;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: m */
    public final void m13609m() {
        if (this.f17390O0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17424g1;
            if (layoutParams == null) {
                this.f17424g1 = m13602d(layoutParams);
            }
            this.f17424g1.addRule(15, -1);
            this.f17424g1.addRule(3, R$id.cCenterBaseLineId);
            this.f17424g1.addRule(1, R$id.cLeftImageViewId);
            this.f17424g1.setMargins(this.f17420f0, 0, this.f17423g0, 0);
            TextView textViewM13617u = m13617u(this.f17390O0, this.f17424g1, R$id.cLeftBottomTextId, this.f17389O, this.f17371F);
            this.f17390O0 = textViewM13617u;
            textViewM13617u.setText(this.f17461w);
            m13621y(this.f17390O0, this.f17372F0);
        }
    }

    /* renamed from: n */
    public final void m13610n() {
        this.f17396R0 = new ImageView(this.f17412c);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(this.f17458u0, 0, 0, 0);
        this.f17396R0.setScaleType(ImageView.ScaleType.CENTER);
        this.f17396R0.setId(R$id.cLeftImageViewId);
        this.f17396R0.setLayoutParams(layoutParams);
        Drawable drawable = this.f17455t;
        if (drawable != null) {
            this.f17396R0.setImageDrawable(drawable);
        }
        addView(this.f17396R0);
    }

    /* renamed from: o */
    public final void m13611o() {
        CommonTextView commonTextView;
        if (this.f17378I0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17408Y0;
            if (layoutParams == null) {
                this.f17408Y0 = m13602d(layoutParams);
            }
            this.f17408Y0.addRule(15, -1);
            this.f17408Y0.addRule(1, R$id.cLeftImageViewId);
            this.f17408Y0.setMargins(this.f17420f0, 0, this.f17423g0, 0);
            TextView textViewM13617u = m13617u(this.f17378I0, this.f17408Y0, R$id.cLeftTextId, this.f17385M, this.f17367D);
            commonTextView = this;
            commonTextView.f17378I0 = textViewM13617u;
            textViewM13617u.setText(commonTextView.f17457u);
            commonTextView.f17378I0.setLineSpacing(commonTextView.f17466y0, 1.0f);
            m13621y(commonTextView.f17378I0, commonTextView.f17372F0);
            if (commonTextView.f17404V0) {
                commonTextView.f17378I0.setOnClickListener(new ViewOnClickListenerC8303b());
            }
        } else {
            commonTextView = this;
        }
        commonTextView.m13620x(commonTextView.f17378I0, commonTextView.f17425h, commonTextView.f17428i, commonTextView.f17431j, commonTextView.f17434k, commonTextView.f17403V);
    }

    /* renamed from: p */
    public final void m13612p() {
        if (this.f17384L0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17415d1;
            if (layoutParams == null) {
                this.f17415d1 = m13602d(layoutParams);
            }
            this.f17415d1.addRule(15, -1);
            this.f17415d1.addRule(2, R$id.cCenterBaseLineId);
            this.f17415d1.addRule(1, R$id.cLeftImageViewId);
            this.f17415d1.setMargins(this.f17420f0, 0, this.f17423g0, 0);
            TextView textViewM13617u = m13617u(this.f17384L0, this.f17415d1, R$id.cLeftTopTextId, this.f17387N, this.f17369E);
            this.f17384L0 = textViewM13617u;
            textViewM13617u.setText(this.f17459v);
            m13621y(this.f17384L0, this.f17372F0);
        }
    }

    /* renamed from: q */
    public final void m13613q() {
        int i10 = this.f17460v0;
        if (i10 == 1) {
            m13622z();
            return;
        }
        if (i10 == 2) {
            m13619w();
        } else {
            if (i10 != 3) {
                return;
            }
            m13622z();
            m13619w();
        }
    }

    /* renamed from: r */
    public final void m13614r() {
        if (this.f17394Q0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17430i1;
            if (layoutParams == null) {
                this.f17430i1 = m13602d(layoutParams);
            }
            this.f17430i1.addRule(15, -1);
            this.f17430i1.addRule(11, -1);
            this.f17430i1.addRule(3, R$id.cCenterBaseLineId);
            this.f17430i1.addRule(0, R$id.cRightImageViewId);
            this.f17430i1.setMargins(this.f17432j0, 0, this.f17435k0, 0);
            TextView textViewM13617u = m13617u(this.f17394Q0, this.f17430i1, R$id.cRightBottomTextId, this.f17401U, this.f17377I);
            this.f17394Q0 = textViewM13617u;
            textViewM13617u.setText(this.f17467z);
            this.f17394Q0.setLineSpacing(this.f17362A0, 1.0f);
            m13621y(this.f17394Q0, this.f17376H0);
        }
    }

    /* renamed from: s */
    public final void m13615s() {
        CommonTextView commonTextView;
        if (this.f17382K0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17410a1;
            if (layoutParams == null) {
                this.f17410a1 = m13602d(layoutParams);
            }
            this.f17410a1.addRule(15, -1);
            this.f17410a1.addRule(11, -1);
            this.f17410a1.addRule(0, R$id.cRightImageViewId);
            this.f17410a1.setMargins(this.f17432j0, 0, this.f17435k0, 0);
            TextView textViewM13617u = m13617u(this.f17382K0, this.f17410a1, R$id.cRightTextId, this.f17397S, this.f17373G);
            commonTextView = this;
            commonTextView.f17382K0 = textViewM13617u;
            textViewM13617u.setText(commonTextView.f17463x);
            commonTextView.f17382K0.setLineSpacing(commonTextView.f17362A0, 1.0f);
            m13621y(commonTextView.f17382K0, commonTextView.f17376H0);
            if (commonTextView.f17407X0) {
                commonTextView.f17382K0.setOnClickListener(new ViewOnClickListenerC8305d());
            }
        } else {
            commonTextView = this;
        }
        commonTextView.m13620x(commonTextView.f17382K0, commonTextView.f17447p, commonTextView.f17449q, commonTextView.f17451r, commonTextView.f17453s, commonTextView.f17417e0);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        TextView textView = this.f17378I0;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f17380J0;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
        TextView textView3 = this.f17382K0;
        if (textView3 != null) {
            textView3.setTypeface(typeface);
        }
        TextView textView4 = this.f17384L0;
        if (textView4 != null) {
            textView4.setTypeface(typeface);
        }
        TextView textView5 = this.f17386M0;
        if (textView5 != null) {
            textView5.setTypeface(typeface);
        }
        TextView textView6 = this.f17388N0;
        if (textView6 != null) {
            textView6.setTypeface(typeface);
        }
        TextView textView7 = this.f17390O0;
        if (textView7 != null) {
            textView7.setTypeface(typeface);
        }
        TextView textView8 = this.f17392P0;
        if (textView8 != null) {
            textView8.setTypeface(typeface);
        }
        TextView textView9 = this.f17394Q0;
        if (textView9 != null) {
            textView9.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public final void m13616t() {
        if (this.f17388N0 == null) {
            RelativeLayout.LayoutParams layoutParams = this.f17421f1;
            if (layoutParams == null) {
                this.f17421f1 = m13602d(layoutParams);
            }
            this.f17421f1.addRule(15, -1);
            this.f17421f1.addRule(11, -1);
            this.f17421f1.addRule(2, R$id.cCenterBaseLineId);
            this.f17421f1.addRule(0, R$id.cRightImageViewId);
            this.f17421f1.setMargins(this.f17432j0, 0, this.f17435k0, 0);
            TextView textViewM13617u = m13617u(this.f17388N0, this.f17421f1, R$id.cRightTopTextId, this.f17399T, this.f17375H);
            this.f17388N0 = textViewM13617u;
            textViewM13617u.setText(this.f17465y);
            this.f17388N0.setLineSpacing(this.f17362A0, 1.0f);
            m13621y(this.f17388N0, this.f17376H0);
        }
    }

    /* renamed from: u */
    public TextView m13617u(TextView textView, RelativeLayout.LayoutParams layoutParams, int i10, int i11, int i12) {
        if (textView != null) {
            return textView;
        }
        TextView textView2 = new TextView(this.f17412c);
        textView2.setId(i10);
        textView2.setLayoutParams(layoutParams);
        textView2.setTextColor(i11);
        textView2.setTextSize(0, i12);
        textView2.setLines(this.f17370E0);
        textView2.setSingleLine(this.f17366C0);
        textView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f17368D0)});
        addView(textView2);
        return textView2;
    }

    /* renamed from: v */
    public final void m13618v(int i10, int i11) {
        if (this.f17398S0 == null) {
            if (this.f17411b1 == null) {
                this.f17411b1 = new RelativeLayout.LayoutParams(-1, this.f17464x0);
            }
            this.f17411b1.addRule(10, -1);
            this.f17411b1.setMarginStart(i10);
            this.f17411b1.setMarginEnd(i11);
            View view = new View(this.f17412c);
            this.f17398S0 = view;
            view.setLayoutParams(this.f17411b1);
            this.f17398S0.setBackgroundColor(this.f17462w0);
        }
        addView(this.f17398S0);
    }

    /* renamed from: w */
    public final void m13619w() {
        int i10 = this.f17446o0;
        if (i10 != 0) {
            m13603g(i10, i10);
            return;
        }
        int i11 = this.f17454s0;
        if ((i11 != 0) || (i11 != 0)) {
            m13603g(this.f17452r0, i11);
        } else {
            m13603g(this.f17448p0, this.f17450q0);
        }
    }

    /* renamed from: x */
    public void m13620x(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i10) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        textView.setCompoundDrawablePadding(i10);
    }

    /* renamed from: y */
    public final void m13621y(TextView textView, int i10) {
        if (i10 == 0) {
            textView.setGravity(19);
        } else if (i10 == 1) {
            textView.setGravity(17);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setGravity(21);
        }
    }

    /* renamed from: z */
    public final void m13622z() {
        int i10 = this.f17438l0;
        if (i10 != 0) {
            m13618v(i10, i10);
            return;
        }
        int i11 = this.f17452r0;
        boolean z10 = i11 != 0;
        int i12 = this.f17454s0;
        if ((i12 != 0) || z10) {
            m13618v(i11, i12);
        } else {
            m13618v(this.f17441m0, this.f17444n0);
        }
    }

    public CommonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17422g = -1;
        this.f17366C0 = true;
        this.f17368D0 = 10;
        this.f17370E0 = 1;
        m13600f(context, attributeSet);
    }

    public CommonTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17422g = -1;
        this.f17366C0 = true;
        this.f17368D0 = 10;
        this.f17370E0 = 1;
        m13600f(context, attributeSet);
    }
}
