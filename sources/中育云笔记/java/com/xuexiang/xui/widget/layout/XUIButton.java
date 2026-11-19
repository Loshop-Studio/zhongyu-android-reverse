package com.xuexiang.xui.widget.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import com.xuexiang.xui.widget.alpha.XUIAlphaButton;
import p389w8.C11711a;

/* loaded from: classes5.dex */
public class XUIButton extends XUIAlphaButton {

    /* renamed from: d */
    public C11711a f16375d;

    public XUIButton(Context context) {
        super(context);
        m12912a(context, null, 0);
    }

    /* renamed from: a */
    public final void m12912a(Context context, AttributeSet attributeSet, int i10) {
        this.f16375d = new C11711a(context, attributeSet, i10, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f16375d.m25928k(canvas, getWidth(), getHeight());
        this.f16375d.m25927j(canvas);
    }

    public int getHideRadiusSide() {
        return this.f16375d.m25930m();
    }

    public int getRadius() {
        return this.f16375d.m25933p();
    }

    public float getShadowAlpha() {
        return this.f16375d.m25934q();
    }

    @Override // android.widget.TextView
    public int getShadowColor() {
        return this.f16375d.m25935r();
    }

    public int getShadowElevation() {
        return this.f16375d.m25936s();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int iM25932o = this.f16375d.m25932o(i10);
        int iM25931n = this.f16375d.m25931n(i11);
        super.onMeasure(iM25932o, iM25931n);
        int iM25938u = this.f16375d.m25938u(iM25932o, getMeasuredWidth());
        int iM25937t = this.f16375d.m25937t(iM25931n, getMeasuredHeight());
        if (iM25932o == iM25938u && iM25931n == iM25937t) {
            return;
        }
        super.onMeasure(iM25938u, iM25937t);
    }

    public void setBorderColor(@ColorInt int i10) {
        this.f16375d.m25941x(i10);
        invalidate();
    }

    public void setBorderWidth(int i10) {
        this.f16375d.m25942y(i10);
        invalidate();
    }

    public void setBottomDividerAlpha(int i10) {
        this.f16375d.m25943z(i10);
        invalidate();
    }

    public void setHideRadiusSide(int i10) {
        this.f16375d.m25912A(i10);
        invalidate();
    }

    public void setLeftDividerAlpha(int i10) {
        this.f16375d.m25913B(i10);
        invalidate();
    }

    public void setOuterNormalColor(int i10) {
        this.f16375d.m25914C(i10);
    }

    public void setOutlineExcludePadding(boolean z10) {
        this.f16375d.m25915D(z10);
    }

    public void setRadius(int i10) {
        this.f16375d.m25916E(i10);
    }

    public void setRightDividerAlpha(int i10) {
        this.f16375d.m25920I(i10);
        invalidate();
    }

    public void setShadowAlpha(float f10) {
        this.f16375d.m25921J(f10);
    }

    public void setShadowColor(int i10) {
        this.f16375d.m25922K(i10);
    }

    public void setShadowElevation(int i10) {
        this.f16375d.m25924M(i10);
    }

    public void setShowBorderOnlyBeforeL(boolean z10) {
        this.f16375d.m25925N(z10);
        invalidate();
    }

    public void setTopDividerAlpha(int i10) {
        this.f16375d.m25926O(i10);
        invalidate();
    }

    public XUIButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12912a(context, attributeSet, 0);
    }

    public XUIButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        m12912a(context, attributeSet, i10);
    }
}
