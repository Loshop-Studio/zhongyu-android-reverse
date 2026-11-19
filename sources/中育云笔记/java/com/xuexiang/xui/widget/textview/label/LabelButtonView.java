package com.xuexiang.xui.widget.textview.label;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p263n9.C10337a;

/* loaded from: classes5.dex */
public class LabelButtonView extends AppCompatButton {

    /* renamed from: c */
    public C10337a f17336c;

    public LabelButtonView(Context context) {
        this(context, null);
    }

    public int getLabelBackgroundColor() {
        return this.f17336c.m21594c();
    }

    public int getLabelDistance() {
        return this.f17336c.m21595d();
    }

    public int getLabelHeight() {
        return this.f17336c.m21596e();
    }

    public int getLabelOrientation() {
        return this.f17336c.m21597f();
    }

    public String getLabelText() {
        return this.f17336c.m21598g();
    }

    public int getLabelTextColor() {
        return this.f17336c.m21599h();
    }

    public String getLabelTextFont() {
        return this.f17336c.m21600i();
    }

    public int getLabelTextSize() {
        return this.f17336c.m21601j();
    }

    public int getLabelTextStyle() {
        return this.f17336c.m21602k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f17336c.m21605n(canvas, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setLabelBackgroundColor(int i10) {
        this.f17336c.m21608q(this, i10);
    }

    public void setLabelDistance(int i10) {
        this.f17336c.m21609r(this, i10);
    }

    public void setLabelHeight(int i10) {
        this.f17336c.m21610s(this, i10);
    }

    public void setLabelOrientation(int i10) {
        this.f17336c.m21611t(this, i10);
    }

    public void setLabelText(String str) {
        this.f17336c.m21612u(this, str);
    }

    public void setLabelTextColor(int i10) {
        this.f17336c.m21613v(this, i10);
    }

    public void setLabelTextFont(String str) {
        this.f17336c.m21614w(this, str);
    }

    public void setLabelTextSize(int i10) {
        this.f17336c.m21615x(this, i10);
    }

    public void setLabelTextStyle(int i10) {
        this.f17336c.m21616y(this, i10);
    }

    public void setLabelVisual(boolean z10) {
        this.f17336c.m21617z(this, z10);
    }

    public LabelButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LabelButtonView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17336c = new C10337a(context, attributeSet, i10);
    }
}
