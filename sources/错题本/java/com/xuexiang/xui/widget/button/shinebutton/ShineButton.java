package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.Checkable;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import p064g2.AbstractViewOnClickListenerC5599a;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class ShineButton extends PorterShapeImageView implements Checkable {

    /* renamed from: l */
    public boolean f4180l;

    public ShineButton(Context context) {
        this(context, null);
    }

    public int getColor() {
        return 0;
    }

    public Window getWindow() {
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f4180l;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z8) {
        this.f4180l = z8;
        if (z8) {
            setTintColor(0);
            this.f4180l = true;
        } else {
            setTintColor(0);
            this.f4180l = false;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (onClickListener instanceof AbstractViewOnClickListenerC5599a) {
            super.setOnClickListener(onClickListener);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f4180l);
    }

    public ShineButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.ShineButtonStyle);
    }

    public ShineButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4180l = false;
        int color = Color.parseColor("#FFFF99");
        int[] iArr = ShineView.f4181k;
        iArr[0] = color;
        iArr[1] = Color.parseColor("#FFCCCC");
        iArr[2] = Color.parseColor("#996699");
        iArr[3] = Color.parseColor("#FF6666");
        iArr[4] = Color.parseColor("#FFFF66");
        iArr[5] = Color.parseColor("#F44336");
        iArr[6] = Color.parseColor("#666666");
        iArr[7] = Color.parseColor("#CCCC00");
        iArr[8] = Color.parseColor("#666666");
        iArr[9] = Color.parseColor("#999933");
        context.obtainStyledAttributes(attributeSet, R$styleable.ShineButton);
        AbstractC6582a.m6217a();
        throw null;
    }
}
