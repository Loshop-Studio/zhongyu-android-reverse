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
import com.xuexiang.xui.utils.AbstractC6477b;
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import p186o2.AbstractC8697b;
import p219r2.C9001b;

/* loaded from: classes4.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    public int f5783A;

    /* renamed from: B */
    public boolean f5784B;

    /* renamed from: a */
    public XUIAlphaTextView f5785a;

    /* renamed from: b */
    public C9001b f5786b;

    /* renamed from: c */
    public LinearLayout f5787c;

    /* renamed from: d */
    public TextView f5788d;

    /* renamed from: e */
    public TextView f5789e;

    /* renamed from: f */
    public View f5790f;

    /* renamed from: g */
    public boolean f5791g;

    /* renamed from: h */
    public int f5792h;

    /* renamed from: i */
    public int f5793i;

    /* renamed from: j */
    public int f5794j;

    /* renamed from: k */
    public int f5795k;

    /* renamed from: l */
    public int f5796l;

    /* renamed from: m */
    public int f5797m;

    /* renamed from: n */
    public int f5798n;

    /* renamed from: o */
    public int f5799o;

    /* renamed from: p */
    public int f5800p;

    /* renamed from: q */
    public int f5801q;

    /* renamed from: r */
    public int f5802r;

    /* renamed from: s */
    public int f5803s;

    /* renamed from: t */
    public int f5804t;

    /* renamed from: u */
    public int f5805u;

    /* renamed from: v */
    public Drawable f5806v;

    /* renamed from: w */
    public String f5807w;

    /* renamed from: x */
    public String f5808x;

    /* renamed from: y */
    public String f5809y;

    /* renamed from: z */
    public int f5810z;

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    /* renamed from: a */
    public static int m5418a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    private boolean m5419e() {
        return getLayoutDirection() == 1;
    }

    public static int getStatusBarHeight() {
        return m5418a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: b */
    public final void m5420b(Context context) {
        this.f5792h = getResources().getDisplayMetrics().widthPixels;
        if (this.f5791g) {
            this.f5794j = getStatusBarHeight();
        }
        m5422d(context);
    }

    /* renamed from: c */
    public final void m5421c(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i10, 0);
        this.f5793i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC6482g.m5384o(context, R$attr.xui_actionbar_height));
        this.f5791g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC6482g.m5380k(context, R$attr.xui_actionbar_immersive));
        this.f5795k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC6482g.m5384o(context, R$attr.xui_actionbar_action_padding));
        this.f5796l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC6482g.m5384o(context, R$attr.xui_actionbar_side_text_padding));
        this.f5797m = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        int i11 = R$styleable.TitleBar_tb_sideTextSize;
        int i12 = R$attr.xui_actionbar_action_text_size;
        this.f5798n = typedArrayObtainStyledAttributes.getDimensionPixelSize(i11, AbstractC6482g.m5384o(context, i12));
        this.f5799o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC6482g.m5384o(context, R$attr.xui_actionbar_title_text_size));
        this.f5800p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC6482g.m5384o(context, R$attr.xui_actionbar_sub_text_size));
        this.f5801q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC6482g.m5384o(context, i12));
        int i13 = R$styleable.TitleBar_tb_sideTextColor;
        int i14 = R$attr.xui_actionbar_text_color;
        this.f5802r = typedArrayObtainStyledAttributes.getColor(i13, AbstractC6482g.m5383n(context, i14, -1));
        this.f5803s = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC6482g.m5383n(context, i14, -1));
        this.f5804t = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC6482g.m5383n(context, i14, -1));
        this.f5805u = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC6482g.m5383n(context, i14, -1));
        this.f5806v = AbstractC6480e.m5361g(getContext(), typedArrayObtainStyledAttributes, R$styleable.TitleBar_tb_leftImageResource);
        this.f5807w = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        this.f5808x = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        this.f5809y = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        this.f5810z = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        this.f5783A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_dividerHeight, AbstractC6477b.m5341a(context, 1.0f));
        this.f5784B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m5422d(Context context) {
        this.f5785a = new XUIAlphaTextView(context);
        this.f5786b = new C9001b(context);
        this.f5787c = new LinearLayout(context);
        this.f5790f = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f5785a.setTextSize(0, this.f5798n);
        this.f5785a.setTextColor(this.f5802r);
        this.f5785a.setText(this.f5807w);
        Drawable drawable = this.f5806v;
        if (drawable != null) {
            this.f5785a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f5785a.setSingleLine();
        this.f5785a.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f5785a;
        int i10 = this.f5796l;
        xUIAlphaTextView.setPadding(i10, 0, i10, 0);
        this.f5785a.setTypeface(AbstractC8697b.m14301c());
        this.f5788d = new AutoMoveTextView(context);
        this.f5789e = new TextView(context);
        if (!TextUtils.isEmpty(this.f5809y)) {
            this.f5786b.setOrientation(1);
        }
        this.f5788d.setTextSize(0, this.f5799o);
        this.f5788d.setTextColor(this.f5803s);
        this.f5788d.setText(this.f5808x);
        this.f5788d.setSingleLine();
        this.f5788d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f5788d.setTypeface(AbstractC8697b.m14301c());
        this.f5789e.setTextSize(0, this.f5800p);
        this.f5789e.setTextColor(this.f5804t);
        this.f5789e.setText(this.f5809y);
        this.f5789e.setSingleLine();
        this.f5789e.setPadding(0, AbstractC6477b.m5341a(getContext(), 2.0f), 0, 0);
        this.f5789e.setEllipsize(TextUtils.TruncateAt.END);
        this.f5789e.setTypeface(AbstractC8697b.m14301c());
        int i11 = this.f5797m;
        if (i11 == 1) {
            m5424g(8388627);
        } else if (i11 == 2) {
            m5424g(8388629);
        } else {
            m5424g(17);
        }
        this.f5786b.addView(this.f5788d);
        this.f5786b.addView(this.f5789e);
        LinearLayout linearLayout = this.f5787c;
        int i12 = this.f5796l;
        linearLayout.setPadding(i12, 0, i12, 0);
        this.f5790f.setBackgroundColor(this.f5810z);
        addView(this.f5785a, layoutParams);
        addView(this.f5786b);
        addView(this.f5787c, layoutParams);
        addView(this.f5790f, new ViewGroup.LayoutParams(-1, this.f5783A));
        if (this.f5784B) {
            Drawable drawableM5386q = AbstractC6482g.m5386q(getContext(), R$attr.xui_actionbar_background);
            if (drawableM5386q != null) {
                setBackground(drawableM5386q);
            } else {
                setBackgroundColor(AbstractC6482g.m5382m(context, R$attr.xui_actionbar_color));
            }
        }
    }

    /* renamed from: f */
    public final void m5423f(View view, View view2, View view3) {
        view.layout(0, this.f5794j, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f5794j);
        view3.layout(this.f5792h - view3.getMeasuredWidth(), this.f5794j, this.f5792h, view3.getMeasuredHeight() + this.f5794j);
        int i10 = this.f5797m;
        if (i10 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f5794j, this.f5792h - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i10 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f5794j, this.f5792h - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f5794j, this.f5792h - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f5794j, this.f5792h - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: g */
    public TitleBar m5424g(int i10) {
        this.f5786b.setGravity(i10);
        this.f5788d.setGravity(i10);
        this.f5789e.setGravity(i10);
        return this;
    }

    public int getActionCount() {
        return this.f5787c.getChildCount();
    }

    public TextView getCenterText() {
        return this.f5788d;
    }

    public View getDividerView() {
        return this.f5790f;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f5785a;
    }

    public TextView getSubTitleText() {
        return this.f5789e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        if (m5419e()) {
            m5423f(this.f5787c, this.f5786b, this.f5785a);
        } else {
            m5423f(this.f5785a, this.f5786b, this.f5787c);
        }
        this.f5790f.layout(0, getMeasuredHeight() - this.f5790f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size;
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            int i12 = this.f5793i;
            size = this.f5794j + i12;
            i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i11) + this.f5794j;
        }
        measureChild(this.f5785a, i10, i11);
        measureChild(this.f5787c, i10, i11);
        if (this.f5785a.getMeasuredWidth() > this.f5787c.getMeasuredWidth()) {
            this.f5786b.measure(View.MeasureSpec.makeMeasureSpec(this.f5792h - (this.f5785a.getMeasuredWidth() * 2), 1073741824), i11);
        } else {
            this.f5786b.measure(View.MeasureSpec.makeMeasureSpec(this.f5792h - (this.f5787c.getMeasuredWidth() * 2), 1073741824), i11);
        }
        measureChild(this.f5790f, i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f5785a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f5788d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f5789e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m5421c(context, attributeSet, i10);
        m5420b(context);
    }
}
