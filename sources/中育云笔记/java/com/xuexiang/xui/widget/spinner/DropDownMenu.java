package com.xuexiang.xui.widget.spinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$dimen;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;

/* loaded from: classes5.dex */
public class DropDownMenu extends LinearLayout {

    /* renamed from: c */
    public LinearLayout f16955c;

    /* renamed from: d */
    public FrameLayout f16956d;

    /* renamed from: e */
    public int f16957e;

    /* renamed from: f */
    public int f16958f;

    /* renamed from: g */
    public View f16959g;

    /* renamed from: h */
    public int f16960h;

    /* renamed from: i */
    public int f16961i;

    /* renamed from: j */
    public int f16962j;

    /* renamed from: k */
    public int f16963k;

    /* renamed from: l */
    public int f16964l;

    /* renamed from: m */
    public int f16965m;

    /* renamed from: n */
    public int f16966n;

    /* renamed from: o */
    public int f16967o;

    /* renamed from: p */
    public int f16968p;

    /* renamed from: q */
    public Drawable f16969q;

    /* renamed from: r */
    public Drawable f16970r;

    /* renamed from: s */
    public float f16971s;

    public DropDownMenu(Context context) {
        super(context, null);
        this.f16957e = -1;
        this.f16971s = 0.5f;
    }

    public View getContentView() {
        return this.f16959g;
    }

    public void setTabMenuClickable(boolean z10) {
        for (int i10 = 0; i10 < this.f16955c.getChildCount(); i10 += 2) {
            this.f16955c.getChildAt(i10).setClickable(z10);
        }
    }

    public void setTabMenuText(String str) {
        int i10 = this.f16957e;
        if (i10 != -1) {
            ((TextView) this.f16955c.getChildAt(i10)).setText(str);
        }
    }

    public DropDownMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.DropDownMenuStyle);
    }

    public DropDownMenu(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16957e = -1;
        this.f16971s = 0.5f;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DropDownMenu);
        this.f16958f = typedArrayObtainStyledAttributes.getResourceId(R$styleable.DropDownMenu_ddm_contentLayoutId, -1);
        this.f16960h = typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_dividerColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_separator_dark));
        this.f16961i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DropDownMenu_ddm_dividerWidth, AbstractC8040f.m12204e(R$dimen.default_ddm_divider_width));
        this.f16962j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DropDownMenu_ddm_dividerMargin, AbstractC8040f.m12204e(R$dimen.default_ddm_divider_margin));
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_underlineColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_separator_light));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DropDownMenu_ddm_underlineHeight, AbstractC8040f.m12204e(R$dimen.default_ddm_underline_height));
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_menuBackgroundColor, -1);
        this.f16967o = typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_maskColor, AbstractC8040f.m12202c(R$color.default_ddm_mask_color));
        this.f16963k = typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_menuTextSelectedColor, AbstractC8041g.m12217d(getContext(), R$attr.colorAccent));
        this.f16964l = typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_menuTextUnselectedColor, AbstractC8041g.m12217d(getContext(), R$attr.xui_config_color_content_text));
        this.f16965m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DropDownMenu_ddm_menuTextPaddingHorizontal, AbstractC8040f.m12204e(R$dimen.default_ddm_menu_text_padding_horizontal));
        this.f16966n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DropDownMenu_ddm_menuTextPaddingVertical, AbstractC8040f.m12204e(R$dimen.default_ddm_menu_text_padding_vertical));
        this.f16968p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.DropDownMenu_ddm_menuTextSize, AbstractC8040f.m12204e(R$dimen.default_ddm_menu_text_size));
        Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.DropDownMenu_ddm_menuUnselectedIcon);
        this.f16970r = drawableM12206g;
        if (drawableM12206g == null) {
            this.f16970r = AbstractC8040f.m12211l(getContext(), R$drawable.ddm_ic_arrow_down);
        }
        Drawable drawableM12206g2 = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.DropDownMenu_ddm_menuSelectedIcon);
        this.f16969q = drawableM12206g2;
        if (drawableM12206g2 == null) {
            this.f16969q = AbstractC8040f.m12211l(getContext(), R$drawable.ddm_ic_arrow_up);
        }
        this.f16971s = typedArrayObtainStyledAttributes.getFloat(R$styleable.DropDownMenu_ddm_menuHeightPercent, this.f16971s);
        typedArrayObtainStyledAttributes.recycle();
        this.f16955c = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f16955c.setOrientation(0);
        this.f16955c.setBackgroundColor(color2);
        this.f16955c.setLayoutParams(layoutParams);
        addView(this.f16955c, 0);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, dimensionPixelSize));
        view.setBackgroundColor(color);
        addView(view, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16956d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f16956d, 2);
    }
}
