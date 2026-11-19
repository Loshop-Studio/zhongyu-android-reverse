package com.zykj.subscriber.view;

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
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.utils.DensityUtils;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import com.zykj.subscriber.R;
import io.github.inflationx.calligraphy3.HasTypeface;
import p018c2.C1083v;

/* loaded from: classes.dex */
public class CommonTitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: A */
    private int f9972A;

    /* renamed from: B */
    private boolean f9973B;

    /* renamed from: a */
    private XUIAlphaTextView f9974a;

    /* renamed from: b */
    private XUIAlphaLinearLayout f9975b;

    /* renamed from: c */
    private LinearLayout f9976c;

    /* renamed from: d */
    private TextView f9977d;

    /* renamed from: e */
    private TextView f9978e;

    /* renamed from: f */
    private View f9979f;

    /* renamed from: g */
    private boolean f9980g;

    /* renamed from: h */
    private int f9981h;

    /* renamed from: i */
    private int f9982i;

    /* renamed from: j */
    private int f9983j;

    /* renamed from: k */
    private int f9984k;

    /* renamed from: l */
    private int f9985l;

    /* renamed from: m */
    private int f9986m;

    /* renamed from: n */
    private int f9987n;

    /* renamed from: o */
    private int f9988o;

    /* renamed from: p */
    private int f9989p;

    /* renamed from: q */
    private int f9990q;

    /* renamed from: r */
    private int f9991r;

    /* renamed from: s */
    private int f9992s;

    /* renamed from: t */
    private int f9993t;

    /* renamed from: u */
    private int f9994u;

    /* renamed from: v */
    private Drawable f9995v;

    /* renamed from: w */
    private String f9996w;

    /* renamed from: x */
    private String f9997x;

    /* renamed from: y */
    private String f9998y;

    /* renamed from: z */
    private int f9999z;

    /* renamed from: com.zykj.subscriber.view.CommonTitleBar$a */
    public interface InterfaceC2442a {
        void performAction(View view);
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.TitleBarStyle);
    }

    /* renamed from: a */
    private static int m8158a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", DispatchConstants.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    private void m8159b(Context context) throws Resources.NotFoundException {
        this.f9981h = getResources().getDisplayMetrics().widthPixels;
        if (this.f9980g) {
            this.f9983j = getStatusBarHeight();
        }
        m8161d(context);
    }

    /* renamed from: c */
    private void m8160c(Context context, AttributeSet attributeSet, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1083v.f6354N, i4, 0);
        this.f9982i = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, ThemeUtils.resolveDimension(context, R.attr.xui_actionbar_height));
        this.f9980g = typedArrayObtainStyledAttributes.getBoolean(7, ThemeUtils.resolveBoolean(context, R.attr.xui_actionbar_immersive));
        this.f9984k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, ThemeUtils.resolveDimension(context, R.attr.xui_actionbar_action_padding));
        this.f9985l = context.getResources().getDimensionPixelSize(R.dimen.view_9);
        this.f9986m = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f9987n = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, ThemeUtils.resolveDimension(context, R.attr.xui_actionbar_action_text_size));
        this.f9988o = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, ThemeUtils.resolveDimension(context, R.attr.xui_actionbar_title_text_size));
        this.f9989p = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, ThemeUtils.resolveDimension(context, R.attr.xui_actionbar_sub_text_size));
        this.f9990q = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, ThemeUtils.resolveDimension(context, R.attr.xui_actionbar_action_text_size));
        this.f9991r = typedArrayObtainStyledAttributes.getColor(10, ThemeUtils.resolveColor(getContext(), R.attr.xui_actionbar_text_color, -1));
        this.f9992s = typedArrayObtainStyledAttributes.getColor(17, ThemeUtils.resolveColor(getContext(), R.attr.xui_actionbar_text_color, -1));
        this.f9993t = typedArrayObtainStyledAttributes.getColor(14, ThemeUtils.resolveColor(getContext(), R.attr.xui_actionbar_text_color, -1));
        this.f9994u = typedArrayObtainStyledAttributes.getColor(1, ThemeUtils.resolveColor(getContext(), R.attr.xui_actionbar_text_color, -1));
        this.f9995v = ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, 8);
        this.f9996w = typedArrayObtainStyledAttributes.getString(9);
        this.f9997x = typedArrayObtainStyledAttributes.getString(16);
        this.f9998y = typedArrayObtainStyledAttributes.getString(13);
        this.f9999z = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.f9972A = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, DensityUtils.dp2px(0.5f));
        this.f9973B = typedArrayObtainStyledAttributes.getBoolean(19, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m8161d(Context context) throws Resources.NotFoundException {
        this.f9974a = new XUIAlphaTextView(context);
        this.f9975b = new XUIAlphaLinearLayout(context);
        this.f9976c = new LinearLayout(context);
        this.f9979f = new View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        this.f9974a.setTextSize(0, this.f9987n);
        this.f9974a.setTextColor(this.f9991r);
        this.f9974a.setText(this.f9996w);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.view_11);
        this.f9995v.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        Drawable drawable = this.f9995v;
        if (drawable != null) {
            this.f9974a.setCompoundDrawables(drawable, null, null, null);
        }
        this.f9974a.setSingleLine();
        this.f9974a.setGravity(16);
        XUIAlphaTextView xUIAlphaTextView = this.f9974a;
        int i4 = this.f9985l;
        xUIAlphaTextView.setPadding(i4, 0, i4, 0);
        this.f9974a.setTypeface(XUI.getDefaultTypeface());
        this.f9977d = new TextView(context);
        this.f9978e = new TextView(context);
        if (!TextUtils.isEmpty(this.f9998y)) {
            this.f9975b.setOrientation(1);
        }
        this.f9977d.setTextSize(0, this.f9988o);
        this.f9977d.setTextColor(this.f9992s);
        this.f9977d.setText(this.f9997x);
        this.f9977d.setSingleLine();
        this.f9977d.setEllipsize(TextUtils.TruncateAt.END);
        this.f9977d.setTypeface(XUI.getDefaultTypeface());
        this.f9978e.setTextSize(0, this.f9989p);
        this.f9978e.setTextColor(this.f9993t);
        this.f9978e.setText(this.f9998y);
        this.f9978e.setSingleLine();
        this.f9978e.setPadding(0, DensityUtils.dp2px(getContext(), 2.0f), 0, 0);
        this.f9978e.setEllipsize(TextUtils.TruncateAt.END);
        this.f9978e.setTypeface(XUI.getDefaultTypeface());
        int i5 = this.f9986m;
        if (i5 == 1) {
            m8164g(8388627);
        } else if (i5 == 2) {
            m8164g(8388629);
        } else {
            m8164g(17);
        }
        this.f9975b.addView(this.f9977d);
        this.f9975b.addView(this.f9978e);
        LinearLayout linearLayout = this.f9976c;
        int i6 = this.f9985l;
        linearLayout.setPadding(i6, 0, i6, 0);
        this.f9979f.setBackgroundColor(this.f9999z);
        addView(this.f9974a, layoutParams);
        addView(this.f9975b);
        addView(this.f9976c, layoutParams);
        addView(this.f9979f, new ViewGroup.LayoutParams(-1, this.f9972A));
        if (this.f9973B) {
            Drawable drawableResolveDrawable = ThemeUtils.resolveDrawable(getContext(), R.attr.xui_actionbar_background);
            if (drawableResolveDrawable != null) {
                setBackground(drawableResolveDrawable);
            } else {
                setBackgroundColor(ThemeUtils.resolveColor(context, R.attr.xui_actionbar_color));
            }
        }
    }

    /* renamed from: e */
    private boolean m8162e() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: f */
    private void m8163f(View view, View view2, View view3) {
        view.layout(0, this.f9983j, view.getMeasuredWidth(), view.getMeasuredHeight() + this.f9983j);
        view3.layout(this.f9981h - view3.getMeasuredWidth(), this.f9983j, this.f9981h, view3.getMeasuredHeight() + this.f9983j);
        int i4 = this.f9986m;
        if (i4 == 1) {
            view2.layout(view.getMeasuredWidth(), this.f9983j, this.f9981h - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i4 == 2) {
            view2.layout(view3.getMeasuredWidth(), this.f9983j, this.f9981h - view3.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view3.getMeasuredWidth()) {
            view2.layout(view.getMeasuredWidth(), this.f9983j, this.f9981h - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            view2.layout(view3.getMeasuredWidth(), this.f9983j, this.f9981h - view3.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public static int getStatusBarHeight() {
        return m8158a(Resources.getSystem(), "status_bar_height");
    }

    /* renamed from: g */
    public CommonTitleBar m8164g(int i4) {
        this.f9975b.setGravity(i4);
        this.f9977d.setGravity(i4);
        this.f9978e.setGravity(i4);
        return this;
    }

    public int getActionCount() {
        return this.f9976c.getChildCount();
    }

    public TextView getCenterText() {
        return this.f9977d;
    }

    public View getDividerView() {
        return this.f9979f;
    }

    public XUIAlphaTextView getLeftText() {
        return this.f9974a;
    }

    public TextView getSubTitleText() {
        return this.f9978e;
    }

    /* renamed from: h */
    public CommonTitleBar m8165h(View.OnClickListener onClickListener) {
        this.f9974a.setOnClickListener(onClickListener);
        return this;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof InterfaceC2442a) {
            ((InterfaceC2442a) tag).performAction(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        if (m8162e()) {
            m8163f(this.f9976c, this.f9975b, this.f9974a);
        } else {
            m8163f(this.f9974a, this.f9975b, this.f9976c);
        }
        this.f9979f.layout(0, getMeasuredHeight() - this.f9979f.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int size;
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            int i6 = this.f9982i;
            size = this.f9983j + i6;
            i5 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            size = View.MeasureSpec.getSize(i5) + this.f9983j;
        }
        measureChild(this.f9974a, i4, i5);
        measureChild(this.f9976c, i4, i5);
        if (this.f9974a.getMeasuredWidth() > this.f9976c.getMeasuredWidth()) {
            this.f9975b.measure(View.MeasureSpec.makeMeasureSpec(this.f9981h - (this.f9974a.getMeasuredWidth() * 2), 1073741824), i5);
        } else {
            this.f9975b.measure(View.MeasureSpec.makeMeasureSpec(this.f9981h - (this.f9976c.getMeasuredWidth() * 2), 1073741824), i5);
        }
        measureChild(this.f9979f, i4, i5);
        setMeasuredDimension(View.MeasureSpec.getSize(i4), size);
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
        XUIAlphaTextView xUIAlphaTextView = this.f9974a;
        if (xUIAlphaTextView != null) {
            xUIAlphaTextView.setTypeface(typeface);
        }
        TextView textView = this.f9977d;
        if (textView != null) {
            textView.setTypeface(typeface);
        }
        TextView textView2 = this.f9978e;
        if (textView2 != null) {
            textView2.setTypeface(typeface);
        }
    }

    public CommonTitleBar(Context context, AttributeSet attributeSet, int i4) throws Resources.NotFoundException {
        super(context, attributeSet, i4);
        m8160c(context, attributeSet, i4);
        m8159b(context);
    }
}
