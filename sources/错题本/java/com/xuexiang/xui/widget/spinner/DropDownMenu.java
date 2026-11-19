package com.xuexiang.xui.widget.spinner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class DropDownMenu extends LinearLayout {

    /* renamed from: a */
    public final int f4881a;

    public DropDownMenu(Context context) {
        super(context, null);
        this.f4881a = -1;
    }

    public View getContentView() {
        return null;
    }

    public void setTabMenuClickable(boolean z8) {
        throw null;
    }

    public void setTabMenuText(String str) {
        if (this.f4881a != -1) {
            throw null;
        }
    }

    public DropDownMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.DropDownMenuStyle);
    }

    public DropDownMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4881a = -1;
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DropDownMenu);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.DropDownMenu_ddm_contentLayoutId, -1);
        typedArrayObtainStyledAttributes.getColor(R$styleable.DropDownMenu_ddm_dividerColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_config_color_separator_dark, 0));
        AbstractC6582a.m6217a();
        throw null;
    }
}
