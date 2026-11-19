package com.xuexiang.xui.widget.statelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$styleable;
import kotlin.collections.AbstractC5806u;

/* loaded from: classes3.dex */
public class StatefulLayout extends LinearLayout {

    /* renamed from: a */
    public View f4900a;

    public StatefulLayout(Context context) {
        this(context, null);
    }

    public Animation getInAnimation() {
        return null;
    }

    public Animation getOutAnimation() {
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) {
            throw new IllegalStateException("StatefulLayout must have one child!");
        }
        setOrientation(1);
        this.f4900a = getChildAt(0);
        LayoutInflater.from(getContext()).inflate(R$layout.xui_layout_stateful_template, (ViewGroup) this, true);
    }

    public StatefulLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.StatefulLayoutStyle);
    }

    public StatefulLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.obtainStyledAttributes(attributeSet, R$styleable.StatefulLayout, i, 0);
        AbstractC5806u.m5281t();
        throw null;
    }
}
