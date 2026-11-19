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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6872b;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.alpha.XUIAlphaImageView;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import p150k1.AbstractC9051b;
import p206p1.C9637b;

/* loaded from: classes4.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    public int f7105A;

    /* renamed from: B */
    public int f7106B;

    /* renamed from: C */
    public boolean f7107C;

    /* renamed from: a */
    public XUIAlphaTextView f7108a;

    /* renamed from: b */
    public C9637b f7109b;

    /* renamed from: c */
    public LinearLayout f7110c;

    /* renamed from: d */
    public TextView f7111d;

    /* renamed from: e */
    public TextView f7112e;

    /* renamed from: f */
    public View f7113f;

    /* renamed from: g */
    public View f7114g;

    /* renamed from: h */
    public boolean f7115h;

    /* renamed from: i */
    public int f7116i;

    /* renamed from: j */
    public int f7117j;

    /* renamed from: k */
    public int f7118k;

    /* renamed from: l */
    public int f7119l;

    /* renamed from: m */
    public int f7120m;

    /* renamed from: n */
    public int f7121n;

    /* renamed from: o */
    public int f7122o;

    /* renamed from: p */
    public int f7123p;

    /* renamed from: q */
    public int f7124q;

    /* renamed from: r */
    public int f7125r;

    /* renamed from: s */
    public int f7126s;

    /* renamed from: t */
    public int f7127t;

    /* renamed from: u */
    public int f7128u;

    /* renamed from: v */
    public int f7129v;

    /* renamed from: w */
    public Drawable f7130w;

    /* renamed from: x */
    public String f7131x;

    /* renamed from: y */
    public String f7132y;

    /* renamed from: z */
    public String f7133z;

    /* renamed from: com.xuexiang.xui.widget.actionbar.TitleBar$a */
    public interface InterfaceC6881a {
        /* renamed from: a */
        void mo6542a(View view);

        /* renamed from: b */
        int mo6543b();

        /* renamed from: c */
        int mo6544c();

        /* renamed from: d */
        int mo6545d();

        String getText();
    }

    /* renamed from: com.xuexiang.xui.widget.actionbar.TitleBar$b */
    public static abstract class AbstractC6882b implements InterfaceC6881a {

        /* renamed from: a */
        public int f7134a;

        public AbstractC6882b(int i10) {
            this.f7134a = i10;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: b */
        public int mo6543b() {
            return 0;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: c */
        public int mo6544c() {
            return -1;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: d */
        public int mo6545d() {
            return this.f7134a;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        public String getText() {
            return null;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.actionbar.TitleBar$c */
    public static abstract class AbstractC6883c implements InterfaceC6881a {

        /* renamed from: a */
        public final String f7135a;

        public AbstractC6883c(int i10) {
            this.f7135a = AbstractC6875e.m6455k(i10);
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: b */
        public int mo6543b() {
            return 0;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: c */
        public int mo6544c() {
            return -1;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: d */
        public int mo6545d() {
            return 0;
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        public String getText() {
            return this.f7135a;
        }
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    /* renamed from: c */
    public static int m6520c(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: f */
    private void m6521f(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i10, 0);
        this.f7117j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_height));
        this.f7115h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC6877g.m6477k(context, R$attr.xui_actionbar_immersive));
        this.f7119l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_action_padding));
        this.f7120m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_side_text_padding));
        this.f7121n = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        this.f7122o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextSize, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_action_text_size));
        this.f7123p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_title_text_size));
        this.f7124q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_sub_text_size));
        this.f7125r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC6877g.m6481o(context, R$attr.xui_actionbar_action_text_size));
        this.f7126s = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_sideTextColor, AbstractC6877g.m6480n(context, R$attr.xui_actionbar_text_color, -1));
        this.f7127t = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC6877g.m6480n(context, R$attr.xui_actionbar_text_color, -1));
        this.f7128u = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC6877g.m6480n(context, R$attr.xui_actionbar_text_color, -1));
        this.f7129v = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC6877g.m6480n(context, R$attr.xui_actionbar_text_color, -1));
        this.f7130w = AbstractC6875e.m6453i(getContext(), typedArrayObtainStyledAttributes, R$styleable.TitleBar_tb_leftImageResource);
        this.f7131x = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        this.f7132y = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        this.f7133z = typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        this.f7105A = typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        this.f7106B = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_dividerHeight, AbstractC6872b.m6425a(context, 1.0f));
        this.f7107C = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_useThemeColor, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int getStatusBarHeight() {
        return m6520c(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: h */
    private boolean m6522h() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: a */
    public View m6523a(InterfaceC6881a interfaceC6881a) {
        return m6524b(interfaceC6881a, this.f7110c.getChildCount());
    }

    /* renamed from: b */
    public View m6524b(InterfaceC6881a interfaceC6881a, int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        View viewM6525d = m6525d(interfaceC6881a);
        this.f7110c.addView(viewM6525d, i10, layoutParams);
        return viewM6525d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageView, com.xuexiang.xui.widget.alpha.XUIAlphaImageView] */
    /* renamed from: d */
    public View m6525d(InterfaceC6881a interfaceC6881a) {
        XUIAlphaTextView xUIAlphaTextView;
        if (TextUtils.isEmpty(interfaceC6881a.getText())) {
            ?? xUIAlphaImageView = new XUIAlphaImageView(getContext());
            xUIAlphaImageView.setImageResource(interfaceC6881a.mo6545d());
            xUIAlphaTextView = xUIAlphaImageView;
        } else {
            XUIAlphaTextView xUIAlphaTextView2 = new XUIAlphaTextView(getContext());
            xUIAlphaTextView2.setGravity(17);
            xUIAlphaTextView2.setText(interfaceC6881a.getText());
            xUIAlphaTextView2.setTextSize(0, this.f7125r);
            if (AbstractC6872b.m6427c(getContext(), this.f7125r) >= 16) {
                xUIAlphaTextView2.getPaint().setFakeBoldText(true);
            }
            xUIAlphaTextView2.setTypeface(AbstractC9051b.m15849d());
            int i10 = this.f7129v;
            xUIAlphaTextView = xUIAlphaTextView2;
            if (i10 != 0) {
                xUIAlphaTextView2.setTextColor(i10);
                xUIAlphaTextView = xUIAlphaTextView2;
            }
        }
        xUIAlphaTextView.setPaddingRelative(interfaceC6881a.mo6544c() != -1 ? interfaceC6881a.mo6544c() : this.f7119l, 0, interfaceC6881a.mo6543b() != -1 ? interfaceC6881a.mo6543b() : this.f7119l, 0);
        xUIAlphaTextView.setTag(interfaceC6881a);
        xUIAlphaTextView.setOnClickListener(this);
        return xUIAlphaTextView;
    }

    /* renamed from: e */
    public final void m6526e(Context context) {
        this.f7116i = getResources().getDisplayMetrics().widthPixels;
        if (this.f7115h) {
            this.f7118k = getStatusBarHeight();
        }
        m6527g(context);
    }

    /* renamed from: g */
    public final void m6527g(Context context) {
        this.f7108a = new XUIAlphaTextView(context);
        this.f7109b = new C9637b(context);
        this.f7110c = new LinearLayout(context);
        this.f7114g = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f7108a.setTextSize(0, this.f7122o);
        this.f7108a.setTextColor(this.f7126s);
        this.f7108a.setText(this.f7131x);
        Drawable drawable = this.f7130w;
        if (drawable != null) {
            this.f7108a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f7108a.setSingleLine();
        this.f7108a.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f7108a;
        int i10 = this.f7120m;
        xUIAlphaTextView.setPadding(i10, 0, i10, 0);
        this.f7108a.setTypeface(AbstractC9051b.m15849d());
        this.f7111d = new AutoMoveTextView(context);
        this.f7112e = new TextView(context);
        if (!TextUtils.isEmpty(this.f7133z)) {
            this.f7109b.setOrientation(1);
        }
        this.f7111d.setTextSize(0, this.f7123p);
        this.f7111d.setTextColor(this.f7127t);
        this.f7111d.setText(this.f7132y);
        this.f7111d.setSingleLine();
        this.f7111d.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f7111d.setTypeface(AbstractC9051b.m15849d());
        this.f7112e.setTextSize(0, this.f7124q);
        this.f7112e.setTextColor(this.f7128u);
        this.f7112e.setText(this.f7133z);
        this.f7112e.setSingleLine();
        this.f7112e.setPadding(0, AbstractC6872b.m6425a(getContext(), 2.0f), 0, 0);
        this.f7112e.setEllipsize(TextUtils.TruncateAt.END);
        this.f7112e.setTypeface(AbstractC9051b.m15849d());
        int i11 = this.f7121n;
        if (i11 == 1) {
            m6530k(8388627);
        } else if (i11 == 2) {
            m6530k(8388629);
        } else {
            m6530k(17);
        }
        this.f7109b.addView(this.f7111d);
        this.f7109b.addView(this.f7112e);
        LinearLayout linearLayout = this.f7110c;
        int i12 = this.f7120m;
        linearLayout.setPadding(i12, 0, i12, 0);
        this.f7114g.setBackgroundColor(this.f7105A);
        addView(this.f7108a, layoutParams);
        addView(this.f7109b);
        addView(this.f7110c, layoutParams);
        addView(this.f7114g, new ViewGroup.LayoutParams(-1, this.f7106B));
        if (this.f7107C) {
            Drawable drawableM6483q = AbstractC6877g.m6483q(getContext(), R$attr.xui_actionbar_background);
            if (drawableM6483q != null) {
                setBackground(drawableM6483q);
            } else {
                setBackgroundColor(AbstractC6877g.m6479m(context, R$attr.xui_actionbar_color));
            }
        }
    }

    public int getActionCount() {
        return this.f7110c.getChildCount();
    }

    public TextView getCenterText() {
        return this.f7111d;
    }

    public View getDividerView() {
        return this.f7114g;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f7108a;
    }

    public TextView getSubTitleText() {
        return this.f7112e;
    }

    /* renamed from: i */
    public final void m6528i(View view, View view2, View view3) {
        view.layout(0, this.f7118k, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f7118k);
        view3.layout(this.f7116i - view3.getMeasuredWidth(), this.f7118k, this.f7116i, view3.getMeasuredHeight() + this.f7118k);
        int i10 = this.f7121n;
        if (i10 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f7118k, this.f7116i - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i10 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f7118k, this.f7116i - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f7118k, this.f7116i - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f7118k, this.f7116i - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: j */
    public void m6529j() {
        this.f7110c.removeAllViews();
    }

    /* renamed from: k */
    public TitleBar m6530k(int i10) {
        this.f7109b.setGravity(i10);
        this.f7111d.setGravity(i10);
        this.f7112e.setGravity(i10);
        return this;
    }

    /* renamed from: l */
    public TitleBar m6531l(boolean z10) {
        TextView textView = this.f7111d;
        if (textView != null) {
            textView.getPaint().setFakeBoldText(z10);
        }
        return this;
    }

    /* renamed from: m */
    public TitleBar m6532m(View view) {
        if (view == null) {
            this.f7111d.setVisibility(0);
            View view2 = this.f7113f;
            if (view2 != null) {
                this.f7109b.removeView(view2);
            }
            return this;
        }
        View view3 = this.f7113f;
        if (view3 != null) {
            this.f7109b.removeView(view3);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        this.f7113f = view;
        this.f7109b.addView(view, layoutParams);
        this.f7111d.setVisibility(8);
        return this;
    }

    /* renamed from: n */
    public TitleBar m6533n(View.OnClickListener onClickListener) {
        this.f7108a.setOnClickListener(onClickListener);
        return this;
    }

    /* renamed from: o */
    public TitleBar m6534o(int i10) {
        XUIAlphaTextView xUIAlphaTextView = this.f7108a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, 0, 0, 0);
        }
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof InterfaceC6881a) {
            ((InterfaceC6881a) tag).mo6542a(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (m6522h()) {
            m6528i(this.f7110c, this.f7109b, this.f7108a);
        } else {
            m6528i(this.f7108a, this.f7109b, this.f7110c);
        }
        this.f7114g.layout(0, getMeasuredHeight() - this.f7114g.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size;
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            int i12 = this.f7117j;
            size = this.f7118k + i12;
            i11 = View.MeasureSpec.makeMeasureSpec(i12, BasicMeasure.EXACTLY);
        } else {
            size = View.MeasureSpec.getSize(i11) + this.f7118k;
        }
        measureChild(this.f7108a, i10, i11);
        measureChild(this.f7110c, i10, i11);
        if (this.f7108a.getMeasuredWidth() > this.f7110c.getMeasuredWidth()) {
            this.f7109b.measure(View.MeasureSpec.makeMeasureSpec(this.f7116i - (this.f7108a.getMeasuredWidth() * 2), BasicMeasure.EXACTLY), i11);
        } else {
            this.f7109b.measure(View.MeasureSpec.makeMeasureSpec(this.f7116i - (this.f7110c.getMeasuredWidth() * 2), BasicMeasure.EXACTLY), i11);
        }
        measureChild(this.f7114g, i10, i11);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
    }

    /* renamed from: p */
    public TitleBar m6535p(CharSequence charSequence) {
        this.f7108a.setText(charSequence);
        return this;
    }

    /* renamed from: q */
    public TitleBar m6536q(boolean z10) {
        XUIAlphaTextView xUIAlphaTextView = this.f7108a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.getPaint().setFakeBoldText(z10);
        }
        return this;
    }

    /* renamed from: r */
    public TitleBar m6537r(int i10) {
        this.f7108a.setTextColor(i10);
        return this;
    }

    /* renamed from: s */
    public TitleBar m6538s(float f10) {
        this.f7108a.setTextSize(0, f10);
        return this;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f7108a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f7111d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f7112e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    /* renamed from: t */
    public TitleBar m6539t(CharSequence charSequence) {
        int iIndexOf = charSequence.toString().indexOf(SignParameters.NEW_LINE);
        if (iIndexOf > 0) {
            m6540u(charSequence.subSequence(0, iIndexOf), charSequence.subSequence(iIndexOf + 1, charSequence.length()), 1);
            return this;
        }
        int iIndexOf2 = charSequence.toString().indexOf("\t");
        if (iIndexOf2 <= 0) {
            this.f7111d.setText(charSequence);
            this.f7112e.setVisibility(8);
            return this;
        }
        m6540u(charSequence.subSequence(0, iIndexOf2), "  " + ((Object) charSequence.subSequence(iIndexOf2 + 1, charSequence.length())), 0);
        return this;
    }

    /* renamed from: u */
    public TitleBar m6540u(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.f7109b.setOrientation(i10);
        this.f7111d.setText(charSequence);
        this.f7112e.setText(charSequence2);
        this.f7112e.setVisibility(0);
        return this;
    }

    /* renamed from: v */
    public TitleBar m6541v(float f10) {
        this.f7111d.setTextSize(0, f10);
        return this;
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m6521f(context, attributeSet, i10);
        m6526e(context);
    }
}
