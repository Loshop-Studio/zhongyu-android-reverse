package com.xuexiang.xui.widget.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6796b;
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import p093e3.AbstractC7843b;
import p125h3.C8094b;

/* loaded from: classes4.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    public int f7038A;

    /* renamed from: B */
    public boolean f7039B;

    /* renamed from: a */
    public XUIAlphaTextView f7040a;

    /* renamed from: b */
    public C8094b f7041b;

    /* renamed from: c */
    public LinearLayout f7042c;

    /* renamed from: d */
    public TextView f7043d;

    /* renamed from: e */
    public TextView f7044e;

    /* renamed from: f */
    public View f7045f;

    /* renamed from: g */
    public boolean f7046g;

    /* renamed from: h */
    public int f7047h;

    /* renamed from: i */
    public int f7048i;

    /* renamed from: j */
    public int f7049j;

    /* renamed from: k */
    public int f7050k;

    /* renamed from: l */
    public int f7051l;

    /* renamed from: m */
    public int f7052m;

    /* renamed from: n */
    public int f7053n;

    /* renamed from: o */
    public int f7054o;

    /* renamed from: p */
    public int f7055p;

    /* renamed from: q */
    public int f7056q;

    /* renamed from: r */
    public int f7057r;

    /* renamed from: s */
    public int f7058s;

    /* renamed from: t */
    public int f7059t;

    /* renamed from: u */
    public int f7060u;

    /* renamed from: v */
    public Drawable f7061v;

    /* renamed from: w */
    public String f7062w;

    /* renamed from: x */
    public String f7063x;

    /* renamed from: y */
    public String f7064y;

    /* renamed from: z */
    public int f7065z;

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    /* renamed from: a */
    public static int m6514a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    private boolean m6515e() {
        return getLayoutDirection() == 1;
    }

    public static int getStatusBarHeight() {
        return m6514a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: b */
    public final void m6516b(Context context) {
        this.f7047h = getResources().getDisplayMetrics().widthPixels;
        if (this.f7046g) {
            this.f7049j = getStatusBarHeight();
        }
        m6518d(context);
    }

    /* renamed from: c */
    public final void m6517c(Context context, AttributeSet attributeSet, int i9) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i9, 0);
        this.f7048i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_height));
        this.f7046g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC6801g.m6477j(context, R$attr.xui_actionbar_immersive));
        this.f7050k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_action_padding));
        this.f7051l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_side_text_padding));
        this.f7052m = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        this.f7053n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextSize, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_action_text_size));
        this.f7054o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_title_text_size));
        this.f7055p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_sub_text_size));
        this.f7056q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC6801g.m6481n(context, R$attr.xui_actionbar_action_text_size));
        this.f7057r = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_sideTextColor, AbstractC6801g.m6480m(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f7058s = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC6801g.m6480m(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f7059t = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC6801g.m6480m(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f7060u = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC6801g.m6480m(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f7061v = AbstractC6799e.m6461f(getContext(), typedArrayObtainStyledAttributes, R$styleable.TitleBar_tb_leftImageResource);
        this.f7062w = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        this.f7063x = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        this.f7064y = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        this.f7065z = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        this.f7038A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_dividerHeight, AbstractC6796b.m6441a(1.0f));
        this.f7039B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m6518d(Context context) {
        this.f7040a = new XUIAlphaTextView(context);
        this.f7041b = new C8094b(context);
        this.f7042c = new LinearLayout(context);
        this.f7045f = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f7040a.setTextSize(0, this.f7053n);
        this.f7040a.setTextColor(this.f7057r);
        this.f7040a.setText(this.f7062w);
        Drawable drawable = this.f7061v;
        if (drawable != null) {
            this.f7040a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f7040a.setSingleLine();
        this.f7040a.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f7040a;
        int i9 = this.f7051l;
        xUIAlphaTextView.setPadding(i9, 0, i9, 0);
        this.f7040a.setTypeface(AbstractC7843b.m12292c());
        this.f7043d = new AutoMoveTextView(context);
        this.f7044e = new TextView(context);
        if (!TextUtils.isEmpty(this.f7064y)) {
            this.f7041b.setOrientation(1);
        }
        this.f7043d.setTextSize(0, this.f7054o);
        this.f7043d.setTextColor(this.f7058s);
        this.f7043d.setText(this.f7063x);
        this.f7043d.setSingleLine();
        this.f7043d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f7043d.setTypeface(AbstractC7843b.m12292c());
        this.f7044e.setTextSize(0, this.f7055p);
        this.f7044e.setTextColor(this.f7059t);
        this.f7044e.setText(this.f7064y);
        this.f7044e.setSingleLine();
        this.f7044e.setPadding(0, AbstractC6796b.m6442b(getContext(), 2.0f), 0, 0);
        this.f7044e.setEllipsize(TextUtils.TruncateAt.END);
        this.f7044e.setTypeface(AbstractC7843b.m12292c());
        int i10 = this.f7052m;
        if (i10 == 1) {
            m6520g(8388627);
        } else if (i10 == 2) {
            m6520g(8388629);
        } else {
            m6520g(17);
        }
        this.f7041b.addView(this.f7043d);
        this.f7041b.addView(this.f7044e);
        LinearLayout linearLayout = this.f7042c;
        int i11 = this.f7051l;
        linearLayout.setPadding(i11, 0, i11, 0);
        this.f7045f.setBackgroundColor(this.f7065z);
        addView(this.f7040a, layoutParams);
        addView(this.f7041b);
        addView(this.f7042c, layoutParams);
        addView(this.f7045f, new ViewGroup.LayoutParams(-1, this.f7038A));
        if (this.f7039B) {
            Drawable drawableM6483p = AbstractC6801g.m6483p(getContext(), R$attr.xui_actionbar_background);
            if (drawableM6483p != null) {
                setBackground(drawableM6483p);
            } else {
                setBackgroundColor(AbstractC6801g.m6479l(context, R$attr.xui_actionbar_color));
            }
        }
    }

    /* renamed from: f */
    public final void m6519f(View view, View view2, View view3) {
        view.layout(0, this.f7049j, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f7049j);
        view3.layout(this.f7047h - view3.getMeasuredWidth(), this.f7049j, this.f7047h, view3.getMeasuredHeight() + this.f7049j);
        int i9 = this.f7052m;
        if (i9 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f7049j, this.f7047h - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i9 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f7049j, this.f7047h - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f7049j, this.f7047h - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f7049j, this.f7047h - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: g */
    public TitleBar m6520g(int i9) {
        this.f7041b.setGravity(i9);
        this.f7043d.setGravity(i9);
        this.f7044e.setGravity(i9);
        return this;
    }

    public int getActionCount() {
        return this.f7042c.getChildCount();
    }

    public TextView getCenterText() {
        return this.f7043d;
    }

    public View getDividerView() {
        return this.f7045f;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f7040a;
    }

    public TextView getSubTitleText() {
        return this.f7044e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        if (m6515e()) {
            m6519f(this.f7042c, this.f7041b, this.f7040a);
        } else {
            m6519f(this.f7040a, this.f7041b, this.f7042c);
        }
        this.f7045f.layout(0, getMeasuredHeight() - this.f7045f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int size;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            int i11 = this.f7048i;
            size = this.f7049j + i11;
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i10) + this.f7049j;
        }
        measureChild(this.f7040a, i9, i10);
        measureChild(this.f7042c, i9, i10);
        if (this.f7040a.getMeasuredWidth() > this.f7042c.getMeasuredWidth()) {
            this.f7041b.measure(View.MeasureSpec.makeMeasureSpec(this.f7047h - (this.f7040a.getMeasuredWidth() * 2), 1073741824), i10);
        } else {
            this.f7041b.measure(View.MeasureSpec.makeMeasureSpec(this.f7047h - (this.f7042c.getMeasuredWidth() * 2), 1073741824), i10);
        }
        measureChild(this.f7045f, i9, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i9), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f7040a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f7043d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f7044e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        m6517c(context, attributeSet, i9);
        m6516b(context);
    }
}
