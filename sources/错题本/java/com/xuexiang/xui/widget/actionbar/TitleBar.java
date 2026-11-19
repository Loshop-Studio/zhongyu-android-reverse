package com.xuexiang.xui.widget.actionbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.widget.alpha.XUIAlphaLinearLayout;
import com.xuexiang.xui.widget.alpha.XUIAlphaTextView;
import io.github.inflationx.calligraphy3.HasTypeface;
import kotlin.collections.AbstractC5806u;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class TitleBar extends ViewGroup implements View.OnClickListener, HasTypeface {

    /* renamed from: a */
    public final int f3984a;

    /* renamed from: b */
    public final int f3985b;

    public TitleBar(Context context) {
        this(context, null);
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
    public final void m3441a(View view, XUIAlphaLinearLayout xUIAlphaLinearLayout, View view2) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view2.layout(0 - view2.getMeasuredWidth(), 0, 0, view2.getMeasuredHeight());
        int i = this.f3985b;
        if (i == 1) {
            xUIAlphaLinearLayout.layout(view.getMeasuredWidth(), 0, 0 - view.getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (i == 2) {
            xUIAlphaLinearLayout.layout(view2.getMeasuredWidth(), 0, 0 - view2.getMeasuredWidth(), getMeasuredHeight());
        } else if (view.getMeasuredWidth() > view2.getMeasuredWidth()) {
            xUIAlphaLinearLayout.layout(view.getMeasuredWidth(), 0, 0 - view.getMeasuredWidth(), getMeasuredHeight());
        } else {
            xUIAlphaLinearLayout.layout(view2.getMeasuredWidth(), 0, 0 - view2.getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public int getActionCount() {
        throw null;
    }

    public TextView getCenterText() {
        return null;
    }

    public View getDividerView() {
        return null;
    }

    public XUIAlphaTextView getLeftText() {
        return null;
    }

    public TextView getSubTitleText() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        if (getLayoutDirection() == 1) {
            m3441a(null, null, null);
            throw null;
        }
        m3441a(null, null, null);
        throw null;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(this.f3984a, BasicMeasure.EXACTLY);
        } else {
            View.MeasureSpec.getSize(i8);
        }
        measureChild(null, i, i8);
        measureChild(null, i, i8);
        throw null;
    }

    @Override // io.github.inflationx.calligraphy3.HasTypeface
    public void setTypeface(Typeface typeface) {
    }

    public TitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.TitleBarStyle);
    }

    public TitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleBar, i, 0);
        this.f3984a = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_barHeight, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_height, -1));
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.TitleBar_tb_immersive, AbstractC5806u.m5251E(context, R$attr.xui_actionbar_immersive, false));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionPadding, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_action_padding, -1));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextPadding, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_side_text_padding, -1));
        this.f3985b = typedArrayObtainStyledAttributes.getInt(R$styleable.TitleBar_tb_centerGravity, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_sideTextSize, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_action_text_size, -1));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_titleTextSize, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_title_text_size, -1));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_subTitleTextSize, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_sub_text_size, -1));
        typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TitleBar_tb_actionTextSize, AbstractC5806u.m5253G(context, R$attr.xui_actionbar_action_text_size, -1));
        typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_sideTextColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_actionbar_text_color, -1));
        typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_titleTextColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_actionbar_text_color, -1));
        typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_subTitleTextColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_actionbar_text_color, -1));
        typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_actionTextColor, AbstractC5806u.m5252F(getContext(), R$attr.xui_actionbar_text_color, -1));
        getContext();
        typedArrayObtainStyledAttributes.getDrawable(R$styleable.TitleBar_tb_leftImageResource);
        typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_leftText);
        typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_titleText);
        typedArrayObtainStyledAttributes.getString(R$styleable.TitleBar_tb_subTitleText);
        typedArrayObtainStyledAttributes.getColor(R$styleable.TitleBar_tb_dividerColor, 0);
        AbstractC6582a.m6217a();
        throw null;
    }
}
