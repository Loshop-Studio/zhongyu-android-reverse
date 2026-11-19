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
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.xuexiang.xui.widget.textview.AutoMoveTextView;
import io.github.inflationx.calligraphy3.C1088R;
import io.github.inflationx.calligraphy3.HasTypeface;
import java.lang.reflect.InvocationTargetException;
import p070b.p113c.p114a.C0787a;
import p070b.p113c.p114a.C0788b;
import p070b.p113c.p114a.p116e.p117a.C0792b;

/* loaded from: classes.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: b */
    public XUIAlphaTextView f5095b;

    /* renamed from: c */
    public C0792b f5096c;

    /* renamed from: d */
    public LinearLayout f5097d;

    /* renamed from: e */
    public TextView f5098e;

    /* renamed from: f */
    public TextView f5099f;

    /* renamed from: g */
    public View f5100g;

    /* renamed from: h */
    public boolean f5101h;

    /* renamed from: i */
    public int f5102i;

    /* renamed from: j */
    public int f5103j;

    /* renamed from: k */
    public int f5104k;

    /* renamed from: l */
    public int f5105l;

    /* renamed from: m */
    public int f5106m;

    /* renamed from: n */
    public int f5107n;

    /* renamed from: o */
    public int f5108o;

    /* renamed from: p */
    public int f5109p;

    /* renamed from: q */
    public int f5110q;

    /* renamed from: r */
    public int f5111r;

    /* renamed from: s */
    public int f5112s;

    /* renamed from: t */
    public Drawable f5113t;

    /* renamed from: u */
    public String f5114u;

    /* renamed from: v */
    public String f5115v;

    /* renamed from: w */
    public String f5116w;

    /* renamed from: x */
    public int f5117x;

    /* renamed from: y */
    public int f5118y;

    /* renamed from: z */
    public boolean f5119z;

    /* renamed from: com.xuexiang.xui.widget.actionbar.TitleBar$a */
    public interface InterfaceC0954a {
        /* renamed from: a */
        void m2732a(View view);
    }

    public TitleBar(Context context, AttributeSet attributeSet) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super(context, attributeSet, C1088R.attr.TitleBarStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0788b.f4455i, C1088R.attr.TitleBarStyle, 0);
        this.f5103j = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, C0787a.m2463C(context, C1088R.attr.xui_actionbar_height, -1));
        this.f5101h = typedArrayObtainStyledAttributes.getBoolean(7, C0787a.m2492z(context, C1088R.attr.xui_actionbar_immersive, false));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, C0787a.m2463C(context, C1088R.attr.xui_actionbar_action_padding, -1));
        this.f5105l = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, C0787a.m2463C(context, C1088R.attr.xui_actionbar_side_text_padding, -1));
        this.f5106m = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f5107n = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, C0787a.m2463C(context, C1088R.attr.xui_actionbar_action_text_size, -1));
        this.f5108o = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, C0787a.m2463C(context, C1088R.attr.xui_actionbar_title_text_size, -1));
        this.f5109p = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, C0787a.m2463C(context, C1088R.attr.xui_actionbar_sub_text_size, -1));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(2, C0787a.m2463C(context, C1088R.attr.xui_actionbar_action_text_size, -1));
        this.f5110q = typedArrayObtainStyledAttributes.getColor(10, C0787a.m2462B(getContext(), C1088R.attr.xui_actionbar_text_color, -1));
        int i = 17;
        this.f5111r = typedArrayObtainStyledAttributes.getColor(17, C0787a.m2462B(getContext(), C1088R.attr.xui_actionbar_text_color, -1));
        this.f5112s = typedArrayObtainStyledAttributes.getColor(14, C0787a.m2462B(getContext(), C1088R.attr.xui_actionbar_text_color, -1));
        typedArrayObtainStyledAttributes.getColor(1, C0787a.m2462B(getContext(), C1088R.attr.xui_actionbar_text_color, -1));
        getContext();
        this.f5113t = typedArrayObtainStyledAttributes.getDrawable(8);
        this.f5114u = typedArrayObtainStyledAttributes.getString(9);
        this.f5115v = typedArrayObtainStyledAttributes.getString(16);
        this.f5116w = typedArrayObtainStyledAttributes.getString(13);
        this.f5117x = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.f5118y = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) ((C0787a.m2482p().getDisplayMetrics().density * 1.0f) + 0.5f));
        this.f5119z = typedArrayObtainStyledAttributes.getBoolean(19, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f5102i = getResources().getDisplayMetrics().widthPixels;
        if (this.f5101h) {
            this.f5104k = getStatusBarHeight();
        }
        this.f5095b = new XUIAlphaTextView(context);
        this.f5096c = new C0792b(context);
        this.f5097d = new LinearLayout(context);
        this.f5100g = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f5095b.setTextSize(0, this.f5107n);
        this.f5095b.setTextColor(this.f5110q);
        this.f5095b.setText(this.f5114u);
        Drawable drawable = this.f5113t;
        if (drawable != null) {
            this.f5095b.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f5095b.setSingleLine();
        this.f5095b.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f5095b;
        int i2 = this.f5105l;
        xUIAlphaTextView.setPadding(i2, 0, i2, 0);
        this.f5095b.setTypeface(C0787a.m2480n());
        this.f5098e = new AutoMoveTextView(context);
        this.f5099f = new TextView(context);
        if (!TextUtils.isEmpty(this.f5116w)) {
            this.f5096c.setOrientation(1);
        }
        this.f5098e.setTextSize(0, this.f5108o);
        this.f5098e.setTextColor(this.f5111r);
        this.f5098e.setText(this.f5115v);
        this.f5098e.setSingleLine();
        this.f5098e.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f5098e.setTypeface(C0787a.m2480n());
        this.f5099f.setTextSize(0, this.f5109p);
        this.f5099f.setTextColor(this.f5112s);
        this.f5099f.setText(this.f5116w);
        this.f5099f.setSingleLine();
        this.f5099f.setPadding(0, C0787a.m2474h(getContext(), 2.0f), 0, 0);
        this.f5099f.setEllipsize(TextUtils.TruncateAt.END);
        this.f5099f.setTypeface(C0787a.m2480n());
        int i3 = this.f5106m;
        if (i3 == 1) {
            i = 8388627;
        } else if (i3 == 2) {
            i = 8388629;
        }
        m2731b(i);
        this.f5096c.addView(this.f5098e);
        this.f5096c.addView(this.f5099f);
        LinearLayout linearLayout = this.f5097d;
        int i4 = this.f5105l;
        linearLayout.setPadding(i4, 0, i4, 0);
        this.f5100g.setBackgroundColor(this.f5117x);
        addView(this.f5095b, layoutParams);
        addView(this.f5096c);
        addView(this.f5097d, layoutParams);
        addView(this.f5100g, new ViewGroup.LayoutParams(-1, this.f5118y));
        if (this.f5119z) {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(new int[]{C1088R.attr.xui_actionbar_background});
            try {
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(0);
                if (drawable2 != null) {
                    setBackground(drawable2);
                } else {
                    setBackgroundColor(C0787a.m2462B(context, C1088R.attr.xui_actionbar_color, 0));
                }
            } finally {
                typedArrayObtainStyledAttributes2.recycle();
            }
        }
    }

    public static int getStatusBarHeight() {
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public final void m2730a(View view, View view2, View view3) {
        view.layout(0, this.f5104k, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f5104k);
        view3.layout(this.f5102i - view3.getMeasuredWidth(), this.f5104k, this.f5102i, view3.getMeasuredHeight() + this.f5104k);
        int i = this.f5106m;
        if (i != 1 && (i == 2 || view.getMeasuredWidth() <= view3.getMeasuredWidth())) {
            view2.layout(view3.getMeasuredWidth(), this.f5104k, this.f5102i - view3.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view.getMeasuredWidth(), this.f5104k, this.f5102i - view.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: b */
    public TitleBar m2731b(int i) {
        this.f5096c.setGravity(i);
        this.f5098e.setGravity(i);
        this.f5099f.setGravity(i);
        return this;
    }

    public int getActionCount() {
        return this.f5097d.getChildCount();
    }

    public TextView getCenterText() {
        return this.f5098e;
    }

    public View getDividerView() {
        return this.f5100g;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f5095b;
    }

    public TextView getSubTitleText() {
        return this.f5099f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof InterfaceC0954a) {
            ((InterfaceC0954a) tag).m2732a(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        C0792b c0792b;
        View view2;
        if (getLayoutDirection() == 1) {
            view = this.f5097d;
            c0792b = this.f5096c;
            view2 = this.f5095b;
        } else {
            view = this.f5095b;
            c0792b = this.f5096c;
            view2 = this.f5097d;
        }
        m2730a(view, c0792b, view2);
        this.f5100g.layout(0, getMeasuredHeight() - this.f5100g.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        C0792b c0792b;
        int i3;
        int measuredWidth;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int i4 = this.f5103j;
            size = this.f5104k + i4;
            i2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i2) + this.f5104k;
        }
        measureChild(this.f5095b, i, i2);
        measureChild(this.f5097d, i, i2);
        if (this.f5095b.getMeasuredWidth() > this.f5097d.getMeasuredWidth()) {
            c0792b = this.f5096c;
            i3 = this.f5102i;
            measuredWidth = this.f5095b.getMeasuredWidth();
        } else {
            c0792b = this.f5096c;
            i3 = this.f5102i;
            measuredWidth = this.f5097d.getMeasuredWidth();
        }
        c0792b.measure(View.MeasureSpec.makeMeasureSpec(i3 - (measuredWidth * 2), 1073741824), i2);
        measureChild(this.f5100g, i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f5095b;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f5098e;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f5099f;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }
}
