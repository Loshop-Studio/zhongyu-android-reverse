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
import anet.channel.strategy.dispatch.DispatchConstants;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8037c;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    public String f15328A;

    /* renamed from: B */
    public int f15329B;

    /* renamed from: C */
    public int f15330C;

    /* renamed from: D */
    public boolean f15331D;

    /* renamed from: c */
    public XUIAlphaTextView f15332c;

    /* renamed from: d */
    public XUIAlphaLinearLayout f15333d;

    /* renamed from: e */
    public LinearLayout f15334e;

    /* renamed from: f */
    public TextView f15335f;

    /* renamed from: g */
    public TextView f15336g;

    /* renamed from: h */
    public View f15337h;

    /* renamed from: i */
    public boolean f15338i;

    /* renamed from: j */
    public int f15339j;

    /* renamed from: k */
    public int f15340k;

    /* renamed from: l */
    public int f15341l;

    /* renamed from: m */
    public int f15342m;

    /* renamed from: n */
    public int f15343n;

    /* renamed from: o */
    public int f15344o;

    /* renamed from: p */
    public int f15345p;

    /* renamed from: q */
    public int f15346q;

    /* renamed from: r */
    public int f15347r;

    /* renamed from: s */
    public int f15348s;

    /* renamed from: t */
    public int f15349t;

    /* renamed from: u */
    public int f15350u;

    /* renamed from: v */
    public int f15351v;

    /* renamed from: w */
    public int f15352w;

    /* renamed from: x */
    public Drawable f15353x;

    /* renamed from: y */
    public String f15354y;

    /* renamed from: z */
    public String f15355z;

    public TitleBar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static int m12265a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    private void m12266c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i10, 0);
        this.f15340k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_height));
        this.f15338i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC8041g.m12215b(context, R$attr.xui_actionbar_immersive));
        this.f15342m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_action_padding));
        this.f15343n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_side_text_padding));
        this.f15344o = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        this.f15345p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextSize, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_action_text_size));
        this.f15346q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_title_text_size));
        this.f15347r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_sub_text_size));
        this.f15348s = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC8041g.m12219f(context, R$attr.xui_actionbar_action_text_size));
        this.f15349t = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_sideTextColor, AbstractC8041g.m12218e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f15350u = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC8041g.m12218e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f15351v = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC8041g.m12218e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f15352w = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC8041g.m12218e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f15353x = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.TitleBar_tb_leftImageResource);
        this.f15354y = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        this.f15355z = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        this.f15328A = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        this.f15329B = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        this.f15330C = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_dividerHeight, AbstractC8037c.m12187a(1.0f));
        this.f15331D = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    private boolean m12267e() {
        return getLayoutDirection() == 1;
    }

    public static int getStatusBarHeight() {
        return m12265a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: b */
    public final void m12268b(Context context) {
        this.f15339j = getResources().getDisplayMetrics().widthPixels;
        if (this.f15338i) {
            this.f15341l = getStatusBarHeight();
        }
        m12269d(context);
    }

    /* renamed from: d */
    public final void m12269d(Context context) {
        this.f15332c = new XUIAlphaTextView(context);
        this.f15333d = new XUIAlphaLinearLayout(context);
        this.f15334e = new LinearLayout(context);
        this.f15337h = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f15332c.setTextSize(0, this.f15345p);
        this.f15332c.setTextColor(this.f15349t);
        this.f15332c.setText(this.f15354y);
        Drawable drawable = this.f15353x;
        if (drawable != null) {
            this.f15332c.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f15332c.setSingleLine();
        this.f15332c.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f15332c;
        int i10 = this.f15343n;
        xUIAlphaTextView.setPadding(i10, 0, i10, 0);
        this.f15332c.setTypeface(AbstractC11916b.m26459c());
        this.f15335f = new AutoMoveTextView(context);
        this.f15336g = new TextView(context);
        if (!TextUtils.isEmpty(this.f15328A)) {
            this.f15333d.setOrientation(1);
        }
        this.f15335f.setTextSize(0, this.f15346q);
        this.f15335f.setTextColor(this.f15350u);
        this.f15335f.setText(this.f15355z);
        this.f15335f.setSingleLine();
        this.f15335f.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f15335f.setTypeface(AbstractC11916b.m26459c());
        this.f15336g.setTextSize(0, this.f15347r);
        this.f15336g.setTextColor(this.f15351v);
        this.f15336g.setText(this.f15328A);
        this.f15336g.setSingleLine();
        this.f15336g.setPadding(0, AbstractC8037c.m12188b(getContext(), 2.0f), 0, 0);
        this.f15336g.setEllipsize(TextUtils.TruncateAt.END);
        this.f15336g.setTypeface(AbstractC11916b.m26459c());
        int i11 = this.f15344o;
        if (i11 == 1) {
            m12271g(8388627);
        } else if (i11 == 2) {
            m12271g(8388629);
        } else {
            m12271g(17);
        }
        this.f15333d.addView(this.f15335f);
        this.f15333d.addView(this.f15336g);
        LinearLayout linearLayout = this.f15334e;
        int i12 = this.f15343n;
        linearLayout.setPadding(i12, 0, i12, 0);
        this.f15337h.setBackgroundColor(this.f15329B);
        addView(this.f15332c, layoutParams);
        addView(this.f15333d);
        addView(this.f15334e, layoutParams);
        addView(this.f15337h, new ViewGroup.LayoutParams(-1, this.f15330C));
        if (this.f15331D) {
            Drawable drawableM12221h = AbstractC8041g.m12221h(getContext(), R$attr.xui_actionbar_background);
            if (drawableM12221h != null) {
                setBackground(drawableM12221h);
            } else {
                setBackgroundColor(AbstractC8041g.m12217d(context, R$attr.xui_actionbar_color));
            }
        }
    }

    /* renamed from: f */
    public final void m12270f(View view, View view2, View view3) {
        view.layout(0, this.f15341l, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f15341l);
        view3.layout(this.f15339j - view3.getMeasuredWidth(), this.f15341l, this.f15339j, view3.getMeasuredHeight() + this.f15341l);
        int i10 = this.f15344o;
        if (i10 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f15341l, this.f15339j - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i10 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f15341l, this.f15339j - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f15341l, this.f15339j - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f15341l, this.f15339j - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: g */
    public TitleBar m12271g(int i10) {
        this.f15333d.setGravity(i10);
        this.f15335f.setGravity(i10);
        this.f15336g.setGravity(i10);
        return this;
    }

    public int getActionCount() {
        return this.f15334e.getChildCount();
    }

    public TextView getCenterText() {
        return this.f15335f;
    }

    public View getDividerView() {
        return this.f15337h;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f15332c;
    }

    public TextView getSubTitleText() {
        return this.f15336g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (m12267e()) {
            m12270f(this.f15334e, this.f15333d, this.f15332c);
        } else {
            m12270f(this.f15332c, this.f15333d, this.f15334e);
        }
        this.f15337h.layout(0, getMeasuredHeight() - this.f15337h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size;
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            int i12 = this.f15340k;
            size = this.f15341l + i12;
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i11) + this.f15341l;
        }
        measureChild(this.f15332c, i10, i11);
        measureChild(this.f15334e, i10, i11);
        if (this.f15332c.getMeasuredWidth() > this.f15334e.getMeasuredWidth()) {
            this.f15333d.measure(View.MeasureSpec.makeMeasureSpec(this.f15339j - (this.f15332c.getMeasuredWidth() * 2), 1073741824), i11);
        } else {
            this.f15333d.measure(View.MeasureSpec.makeMeasureSpec(this.f15339j - (this.f15334e.getMeasuredWidth() * 2), 1073741824), i11);
        }
        measureChild(this.f15337h, i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f15332c;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f15335f;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f15336g;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12266c(context, attributeSet, i10);
        m12268b(context);
    }
}
