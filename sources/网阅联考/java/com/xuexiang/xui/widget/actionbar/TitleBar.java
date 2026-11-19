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
import com.xuexiang.xui.utils.AbstractC3527b;
import com.xuexiang.xui.utils.AbstractC3530e;
import com.xuexiang.xui.utils.AbstractC3531f;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import p077j0.AbstractC3799b;
import p089l0.C4335b;

/* loaded from: classes2.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    public int f3123A;

    /* renamed from: B */
    public boolean f3124B;

    /* renamed from: a */
    public XUIAlphaTextView f3125a;

    /* renamed from: b */
    public C4335b f3126b;

    /* renamed from: c */
    public LinearLayout f3127c;

    /* renamed from: d */
    public TextView f3128d;

    /* renamed from: e */
    public TextView f3129e;

    /* renamed from: f */
    public View f3130f;

    /* renamed from: g */
    public boolean f3131g;

    /* renamed from: h */
    public int f3132h;

    /* renamed from: i */
    public int f3133i;

    /* renamed from: j */
    public int f3134j;

    /* renamed from: k */
    public int f3135k;

    /* renamed from: l */
    public int f3136l;

    /* renamed from: m */
    public int f3137m;

    /* renamed from: n */
    public int f3138n;

    /* renamed from: o */
    public int f3139o;

    /* renamed from: p */
    public int f3140p;

    /* renamed from: q */
    public int f3141q;

    /* renamed from: r */
    public int f3142r;

    /* renamed from: s */
    public int f3143s;

    /* renamed from: t */
    public int f3144t;

    /* renamed from: u */
    public int f3145u;

    /* renamed from: v */
    public Drawable f3146v;

    /* renamed from: w */
    public String f3147w;

    /* renamed from: x */
    public String f3148x;

    /* renamed from: y */
    public String f3149y;

    /* renamed from: z */
    public int f3150z;

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    /* renamed from: a */
    public static int m4104a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int getStatusBarHeight() {
        return m4104a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: b */
    public final void m4105b(Context context) {
        this.f3132h = getResources().getDisplayMetrics().widthPixels;
        if (this.f3131g) {
            this.f3134j = getStatusBarHeight();
        }
        m4107d(context);
    }

    /* renamed from: c */
    public final void m4106c(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i4, 0);
        this.f3133i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_height));
        this.f3131g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC3531f.m4069b(context, R$attr.xui_actionbar_immersive));
        this.f3135k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_action_padding));
        this.f3136l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_side_text_padding));
        this.f3137m = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        this.f3138n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextSize, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_action_text_size));
        this.f3139o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_title_text_size));
        this.f3140p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_sub_text_size));
        this.f3141q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC3531f.m4073f(context, R$attr.xui_actionbar_action_text_size));
        this.f3142r = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_sideTextColor, AbstractC3531f.m4072e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f3143s = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC3531f.m4072e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f3144t = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC3531f.m4072e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f3145u = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC3531f.m4072e(getContext(), R$attr.xui_actionbar_text_color, -1));
        this.f3146v = AbstractC3530e.m4064e(getContext(), typedArrayObtainStyledAttributes, R$styleable.TitleBar_tb_leftImageResource);
        this.f3147w = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        this.f3148x = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        this.f3149y = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        this.f3150z = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        this.f3123A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_dividerHeight, AbstractC3527b.m4047a(1.0f));
        this.f3124B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m4107d(Context context) {
        this.f3125a = new XUIAlphaTextView(context);
        this.f3126b = new C4335b(context);
        this.f3127c = new LinearLayout(context);
        this.f3130f = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f3125a.setTextSize(0, this.f3138n);
        this.f3125a.setTextColor(this.f3142r);
        this.f3125a.setText(this.f3147w);
        Drawable drawable = this.f3146v;
        if (drawable != null) {
            this.f3125a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f3125a.setSingleLine();
        this.f3125a.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f3125a;
        int i4 = this.f3136l;
        xUIAlphaTextView.setPadding(i4, 0, i4, 0);
        this.f3125a.setTypeface(AbstractC3799b.m4959b());
        this.f3128d = new AutoMoveTextView(context);
        this.f3129e = new TextView(context);
        if (!TextUtils.isEmpty(this.f3149y)) {
            this.f3126b.setOrientation(1);
        }
        this.f3128d.setTextSize(0, this.f3139o);
        this.f3128d.setTextColor(this.f3143s);
        this.f3128d.setText(this.f3148x);
        this.f3128d.setSingleLine();
        this.f3128d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f3128d.setTypeface(AbstractC3799b.m4959b());
        this.f3129e.setTextSize(0, this.f3140p);
        this.f3129e.setTextColor(this.f3144t);
        this.f3129e.setText(this.f3149y);
        this.f3129e.setSingleLine();
        this.f3129e.setPadding(0, AbstractC3527b.m4048b(getContext(), 2.0f), 0, 0);
        this.f3129e.setEllipsize(TextUtils.TruncateAt.END);
        this.f3129e.setTypeface(AbstractC3799b.m4959b());
        int i5 = this.f3137m;
        if (i5 == 1) {
            m4110g(8388627);
        } else if (i5 == 2) {
            m4110g(8388629);
        } else {
            m4110g(17);
        }
        this.f3126b.addView(this.f3128d);
        this.f3126b.addView(this.f3129e);
        LinearLayout linearLayout = this.f3127c;
        int i6 = this.f3136l;
        linearLayout.setPadding(i6, 0, i6, 0);
        this.f3130f.setBackgroundColor(this.f3150z);
        addView(this.f3125a, layoutParams);
        addView(this.f3126b);
        addView(this.f3127c, layoutParams);
        addView(this.f3130f, new ViewGroup.LayoutParams(-1, this.f3123A));
        if (this.f3124B) {
            Drawable drawableM4075h = AbstractC3531f.m4075h(getContext(), R$attr.xui_actionbar_background);
            if (drawableM4075h != null) {
                setBackground(drawableM4075h);
            } else {
                setBackgroundColor(AbstractC3531f.m4071d(context, R$attr.xui_actionbar_color));
            }
        }
    }

    /* renamed from: e */
    public final boolean m4108e() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: f */
    public final void m4109f(View view, View view2, View view3) {
        view.layout(0, this.f3134j, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f3134j);
        view3.layout(this.f3132h - view3.getMeasuredWidth(), this.f3134j, this.f3132h, view3.getMeasuredHeight() + this.f3134j);
        int i4 = this.f3137m;
        if (i4 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f3134j, this.f3132h - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i4 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f3134j, this.f3132h - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f3134j, this.f3132h - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f3134j, this.f3132h - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: g */
    public TitleBar m4110g(int i4) {
        this.f3126b.setGravity(i4);
        this.f3128d.setGravity(i4);
        this.f3129e.setGravity(i4);
        return this;
    }

    public int getActionCount() {
        return this.f3127c.getChildCount();
    }

    public TextView getCenterText() {
        return this.f3128d;
    }

    public View getDividerView() {
        return this.f3130f;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f3125a;
    }

    public TextView getSubTitleText() {
        return this.f3129e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (m4108e()) {
            m4109f(this.f3127c, this.f3126b, this.f3125a);
        } else {
            m4109f(this.f3125a, this.f3126b, this.f3127c);
        }
        this.f3130f.layout(0, getMeasuredHeight() - this.f3130f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int size;
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            int i6 = this.f3133i;
            size = this.f3134j + i6;
            i5 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i5) + this.f3134j;
        }
        measureChild(this.f3125a, i4, i5);
        measureChild(this.f3127c, i4, i5);
        if (this.f3125a.getMeasuredWidth() > this.f3127c.getMeasuredWidth()) {
            this.f3126b.measure(View.MeasureSpec.makeMeasureSpec(this.f3132h - (this.f3125a.getMeasuredWidth() * 2), 1073741824), i5);
        } else {
            this.f3126b.measure(View.MeasureSpec.makeMeasureSpec(this.f3132h - (this.f3127c.getMeasuredWidth() * 2), 1073741824), i5);
        }
        measureChild(this.f3130f, i4, i5);
        setMeasuredDimension(View.MeasureSpec.getSize(i4), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f3125a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f3128d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f3129e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        m4106c(context, attributeSet, i4);
        m4105b(context);
    }
}
