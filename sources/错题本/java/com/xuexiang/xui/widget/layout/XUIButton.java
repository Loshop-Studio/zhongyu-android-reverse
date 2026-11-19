package com.xuexiang.xui.widget.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import com.xuexiang.xui.widget.alpha.XUIAlphaButton;
import p210z2.C6812c;

/* loaded from: classes3.dex */
public class XUIButton extends XUIAlphaButton {

    /* renamed from: b */
    public final C6812c f4523b;

    public XUIButton(Context context) {
        super(context);
        this.f4523b = new C6812c(context, null, 0, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f4523b.m6472b(canvas, getWidth(), getHeight());
        this.f4523b.m6471a(canvas);
    }

    public int getHideRadiusSide() {
        return this.f4523b.f11495B;
    }

    public int getRadius() {
        return this.f4523b.f11494A;
    }

    public float getShadowAlpha() {
        return this.f4523b.f11506M;
    }

    @Override // android.widget.TextView
    public int getShadowColor() {
        return this.f4523b.f11507N;
    }

    public int getShadowElevation() {
        return this.f4523b.f11505L;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i8) {
        int iM6474d = this.f4523b.m6474d(i);
        int iM6473c = this.f4523b.m6473c(i8);
        super.onMeasure(iM6474d, iM6473c);
        int iM6476f = this.f4523b.m6476f(iM6474d, getMeasuredWidth());
        int iM6475e = this.f4523b.m6475e(iM6473c, getMeasuredHeight());
        if (iM6474d == iM6476f && iM6473c == iM6475e) {
            return;
        }
        super.onMeasure(iM6476f, iM6475e);
    }

    public void setBorderColor(@ColorInt int i) {
        this.f4523b.f11498E = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f4523b.f11499F = i;
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f4523b.f11525n = i;
        invalidate();
    }

    public void setHideRadiusSide(int i) {
        this.f4523b.m6478h(i);
        invalidate();
    }

    public void setLeftDividerAlpha(int i) {
        this.f4523b.f11530s = i;
        invalidate();
    }

    public void setOuterNormalColor(int i) {
        this.f4523b.m6479i(i);
    }

    public void setOutlineExcludePadding(boolean z8) {
        this.f4523b.m6480j(z8);
    }

    public void setRadius(int i) {
        this.f4523b.m6481k(i);
    }

    public void setRightDividerAlpha(int i) {
        this.f4523b.f11535x = i;
        invalidate();
    }

    public void setShadowAlpha(float f) {
        this.f4523b.m6483m(f);
    }

    public void setShadowColor(int i) {
        View view;
        C6812c c6812c = this.f4523b;
        if (c6812c.f11507N == i) {
            return;
        }
        c6812c.f11507N = i;
        if (Build.VERSION.SDK_INT < 28 || (view = (View) c6812c.f11501H.get()) == null) {
            return;
        }
        view.setOutlineAmbientShadowColor(i);
        view.setOutlineSpotShadowColor(i);
    }

    public void setShadowElevation(int i) {
        C6812c c6812c = this.f4523b;
        if (c6812c.f11505L == i) {
            return;
        }
        c6812c.f11505L = i;
        c6812c.m6477g();
    }

    public void setShowBorderOnlyBeforeL(boolean z8) {
        C6812c c6812c = this.f4523b;
        c6812c.f11504K = z8;
        c6812c.m6477g();
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f4523b.f11520i = i;
        invalidate();
    }

    public XUIButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4523b = new C6812c(context, attributeSet, 0, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    public XUIButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4523b = new C6812c(context, attributeSet, i, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }
}
