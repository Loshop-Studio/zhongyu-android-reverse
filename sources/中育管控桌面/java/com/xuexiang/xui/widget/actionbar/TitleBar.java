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
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC5854b;
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import p126p1.AbstractC7591b;
import p147s1.C7688b;

/* loaded from: classes3.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    public int f4507A;

    /* renamed from: B */
    public boolean f4508B;

    /* renamed from: a */
    public XUIAlphaTextView f4509a;

    /* renamed from: b */
    public C7688b f4510b;

    /* renamed from: c */
    public LinearLayout f4511c;

    /* renamed from: d */
    public TextView f4512d;

    /* renamed from: e */
    public TextView f4513e;

    /* renamed from: f */
    public View f4514f;

    /* renamed from: g */
    public boolean f4515g;

    /* renamed from: h */
    public int f4516h;

    /* renamed from: i */
    public int f4517i;

    /* renamed from: j */
    public int f4518j;

    /* renamed from: k */
    public int f4519k;

    /* renamed from: l */
    public int f4520l;

    /* renamed from: m */
    public int f4521m;

    /* renamed from: n */
    public int f4522n;

    /* renamed from: o */
    public int f4523o;

    /* renamed from: p */
    public int f4524p;

    /* renamed from: q */
    public int f4525q;

    /* renamed from: r */
    public int f4526r;

    /* renamed from: s */
    public int f4527s;

    /* renamed from: t */
    public int f4528t;

    /* renamed from: u */
    public int f4529u;

    /* renamed from: v */
    public Drawable f4530v;

    /* renamed from: w */
    public String f4531w;

    /* renamed from: x */
    public String f4532x;

    /* renamed from: y */
    public String f4533y;

    /* renamed from: z */
    public int f4534z;

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    /* renamed from: a */
    public static int m4427a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: e */
    private boolean m4428e() {
        return getLayoutDirection() == 1;
    }

    public static int getStatusBarHeight() {
        return m4427a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: b */
    public final void m4429b(Context context) {
        this.f4516h = getResources().getDisplayMetrics().widthPixels;
        if (this.f4515g) {
            this.f4518j = getStatusBarHeight();
        }
        m4431d(context);
    }

    /* renamed from: c */
    public final void m4430c(Context context, AttributeSet attributeSet, int i6) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i6, 0);
        this.f4517i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC5859g.m4389o(context, R$attr.xui_actionbar_height));
        this.f4515g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC5859g.m4385k(context, R$attr.xui_actionbar_immersive));
        this.f4519k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC5859g.m4389o(context, R$attr.xui_actionbar_action_padding));
        this.f4520l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC5859g.m4389o(context, R$attr.xui_actionbar_side_text_padding));
        this.f4521m = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        int i7 = R$styleable.TitleBar_tb_sideTextSize;
        int i8 = R$attr.xui_actionbar_action_text_size;
        this.f4522n = typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, AbstractC5859g.m4389o(context, i8));
        this.f4523o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC5859g.m4389o(context, R$attr.xui_actionbar_title_text_size));
        this.f4524p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC5859g.m4389o(context, R$attr.xui_actionbar_sub_text_size));
        this.f4525q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC5859g.m4389o(context, i8));
        int i9 = R$styleable.TitleBar_tb_sideTextColor;
        int i10 = R$attr.xui_actionbar_text_color;
        this.f4526r = typedArrayObtainStyledAttributes.getColor(i9, AbstractC5859g.m4388n(context, i10, -1));
        this.f4527s = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC5859g.m4388n(context, i10, -1));
        this.f4528t = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC5859g.m4388n(context, i10, -1));
        this.f4529u = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC5859g.m4388n(context, i10, -1));
        this.f4530v = AbstractC5857e.m4366g(getContext(), typedArrayObtainStyledAttributes, R$styleable.TitleBar_tb_leftImageResource);
        this.f4531w = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        this.f4532x = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        this.f4533y = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        this.f4534z = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        this.f4507A = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_dividerHeight, AbstractC5854b.m4346a(context, 1.0f));
        this.f4508B = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    public final void m4431d(Context context) {
        this.f4509a = new XUIAlphaTextView(context);
        this.f4510b = new C7688b(context);
        this.f4511c = new LinearLayout(context);
        this.f4514f = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f4509a.setTextSize(0, this.f4522n);
        this.f4509a.setTextColor(this.f4526r);
        this.f4509a.setText(this.f4531w);
        Drawable drawable = this.f4530v;
        if (drawable != null) {
            this.f4509a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f4509a.setSingleLine();
        this.f4509a.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f4509a;
        int i6 = this.f4520l;
        xUIAlphaTextView.setPadding(i6, 0, i6, 0);
        this.f4509a.setTypeface(AbstractC7591b.m9000c());
        this.f4512d = new AutoMoveTextView(context);
        this.f4513e = new TextView(context);
        if (!TextUtils.isEmpty(this.f4533y)) {
            this.f4510b.setOrientation(1);
        }
        this.f4512d.setTextSize(0, this.f4523o);
        this.f4512d.setTextColor(this.f4527s);
        this.f4512d.setText(this.f4532x);
        this.f4512d.setSingleLine();
        this.f4512d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f4512d.setTypeface(AbstractC7591b.m9000c());
        this.f4513e.setTextSize(0, this.f4524p);
        this.f4513e.setTextColor(this.f4528t);
        this.f4513e.setText(this.f4533y);
        this.f4513e.setSingleLine();
        this.f4513e.setPadding(0, AbstractC5854b.m4346a(getContext(), 2.0f), 0, 0);
        this.f4513e.setEllipsize(TextUtils.TruncateAt.END);
        this.f4513e.setTypeface(AbstractC7591b.m9000c());
        int i7 = this.f4521m;
        if (i7 == 1) {
            m4433g(8388627);
        } else if (i7 == 2) {
            m4433g(8388629);
        } else {
            m4433g(17);
        }
        this.f4510b.addView(this.f4512d);
        this.f4510b.addView(this.f4513e);
        LinearLayout linearLayout = this.f4511c;
        int i8 = this.f4520l;
        linearLayout.setPadding(i8, 0, i8, 0);
        this.f4514f.setBackgroundColor(this.f4534z);
        addView(this.f4509a, layoutParams);
        addView(this.f4510b);
        addView(this.f4511c, layoutParams);
        addView(this.f4514f, new ViewGroup.LayoutParams(-1, this.f4507A));
        if (this.f4508B) {
            Drawable drawableM4391q = AbstractC5859g.m4391q(getContext(), R$attr.xui_actionbar_background);
            if (drawableM4391q != null) {
                setBackground(drawableM4391q);
            } else {
                setBackgroundColor(AbstractC5859g.m4387m(context, R$attr.xui_actionbar_color));
            }
        }
    }

    /* renamed from: f */
    public final void m4432f(View view, View view2, View view3) {
        view.layout(0, this.f4518j, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f4518j);
        view3.layout(this.f4516h - view3.getMeasuredWidth(), this.f4518j, this.f4516h, view3.getMeasuredHeight() + this.f4518j);
        int i6 = this.f4521m;
        if (i6 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f4518j, this.f4516h - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i6 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f4518j, this.f4516h - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f4518j, this.f4516h - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f4518j, this.f4516h - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: g */
    public TitleBar m4433g(int i6) {
        this.f4510b.setGravity(i6);
        this.f4512d.setGravity(i6);
        this.f4513e.setGravity(i6);
        return this;
    }

    public int getActionCount() {
        return this.f4511c.getChildCount();
    }

    public TextView getCenterText() {
        return this.f4512d;
    }

    public View getDividerView() {
        return this.f4514f;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f4509a;
    }

    public TextView getSubTitleText() {
        return this.f4513e;
    }

    /* renamed from: h */
    public TitleBar m4434h(View.OnClickListener onClickListener) {
        this.f4509a.setOnClickListener(onClickListener);
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i6, int i7, int i8, int i9) {
        if (m4428e()) {
            m4432f(this.f4511c, this.f4510b, this.f4509a);
        } else {
            m4432f(this.f4509a, this.f4510b, this.f4511c);
        }
        this.f4514f.layout(0, getMeasuredHeight() - this.f4514f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        int size;
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            int i8 = this.f4517i;
            size = this.f4518j + i8;
            i7 = View.MeasureSpec.makeMeasureSpec(i8, BasicMeasure.EXACTLY);
        } else {
            size = View.MeasureSpec.getSize(i7) + this.f4518j;
        }
        measureChild(this.f4509a, i6, i7);
        measureChild(this.f4511c, i6, i7);
        if (this.f4509a.getMeasuredWidth() > this.f4511c.getMeasuredWidth()) {
            this.f4510b.measure(View.MeasureSpec.makeMeasureSpec(this.f4516h - (this.f4509a.getMeasuredWidth() * 2), BasicMeasure.EXACTLY), i7);
        } else {
            this.f4510b.measure(View.MeasureSpec.makeMeasureSpec(this.f4516h - (this.f4511c.getMeasuredWidth() * 2), BasicMeasure.EXACTLY), i7);
        }
        measureChild(this.f4514f, i6, i7);
        setMeasuredDimension(View.MeasureSpec.getSize(i6), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f4509a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f4512d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f4513e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        m4430c(context, attributeSet, i6);
        m4429b(context);
    }
}
