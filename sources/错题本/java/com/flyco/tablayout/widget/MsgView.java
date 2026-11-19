package com.flyco.tablayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.flyco.tablayout.R$styleable;

/* loaded from: classes2.dex */
public class MsgView extends TextView {

    /* renamed from: a */
    public final Context f2788a;

    /* renamed from: b */
    public final GradientDrawable f2789b;

    /* renamed from: c */
    public int f2790c;

    /* renamed from: d */
    public int f2791d;

    /* renamed from: e */
    public int f2792e;

    /* renamed from: f */
    public int f2793f;

    /* renamed from: g */
    public boolean f2794g;

    /* renamed from: h */
    public boolean f2795h;

    public MsgView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m2521a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i = this.f2790c;
        int i8 = this.f2793f;
        GradientDrawable gradientDrawable = this.f2789b;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(this.f2791d);
        gradientDrawable.setStroke(this.f2792e, i8);
        stateListDrawable.addState(new int[]{-16842919}, gradientDrawable);
        setBackground(stateListDrawable);
    }

    public int getBackgroundColor() {
        return this.f2790c;
    }

    public int getCornerRadius() {
        return this.f2791d;
    }

    public int getStrokeColor() {
        return this.f2793f;
    }

    public int getStrokeWidth() {
        return this.f2792e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        super.onLayout(z8, i, i8, i9, i10);
        if (this.f2794g) {
            setCornerRadius(getHeight() / 2);
        } else {
            m2521a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i8) {
        if (!this.f2795h || getWidth() <= 0 || getHeight() <= 0) {
            super.onMeasure(i, i8);
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(getWidth(), getHeight()), BasicMeasure.EXACTLY);
            super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f2790c = i;
        m2521a();
    }

    public void setCornerRadius(int i) {
        this.f2791d = (int) ((i * this.f2788a.getResources().getDisplayMetrics().density) + 0.5f);
        m2521a();
    }

    public void setIsRadiusHalfHeight(boolean z8) {
        this.f2794g = z8;
        m2521a();
    }

    public void setIsWidthHeightEqual(boolean z8) {
        this.f2795h = z8;
        m2521a();
    }

    public void setStrokeColor(int i) {
        this.f2793f = i;
        m2521a();
    }

    public void setStrokeWidth(int i) {
        this.f2792e = (int) ((i * this.f2788a.getResources().getDisplayMetrics().density) + 0.5f);
        m2521a();
    }

    public MsgView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2789b = new GradientDrawable();
        this.f2788a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MsgView);
        this.f2790c = typedArrayObtainStyledAttributes.getColor(R$styleable.MsgView_mv_backgroundColor, 0);
        this.f2791d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MsgView_mv_cornerRadius, 0);
        this.f2792e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MsgView_mv_strokeWidth, 0);
        this.f2793f = typedArrayObtainStyledAttributes.getColor(R$styleable.MsgView_mv_strokeColor, 0);
        this.f2794g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MsgView_mv_isRadiusHalfHeight, false);
        this.f2795h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MsgView_mv_isWidthHeightEqual, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
