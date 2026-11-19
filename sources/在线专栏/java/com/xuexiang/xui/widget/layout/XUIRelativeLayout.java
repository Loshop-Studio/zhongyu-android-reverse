package com.xuexiang.xui.widget.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.xuexiang.xui.widget.alpha.XUIAlphaRelativeLayout;

/* loaded from: classes.dex */
public class XUIRelativeLayout extends XUIAlphaRelativeLayout implements IXUILayout {
    private XUILayoutHelper mLayoutHelper;

    public XUIRelativeLayout(Context context) {
        super(context);
        init(context, null, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i4) {
        this.mLayoutHelper = new XUILayoutHelper(context, attributeSet, i4, this);
        setChangeAlphaWhenDisable(false);
        setChangeAlphaWhenPress(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.mLayoutHelper.drawDividers(canvas, getWidth(), getHeight());
        this.mLayoutHelper.dispatchRoundBorderDraw(canvas);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getHideRadiusSide() {
        return this.mLayoutHelper.getHideRadiusSide();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getRadius() {
        return this.mLayoutHelper.getRadius();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public float getShadowAlpha() {
        return this.mLayoutHelper.getShadowAlpha();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getShadowColor() {
        return this.mLayoutHelper.getShadowColor();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public int getShadowElevation() {
        return this.mLayoutHelper.getShadowElevation();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int measuredWidthSpec = this.mLayoutHelper.getMeasuredWidthSpec(i4);
        int measuredHeightSpec = this.mLayoutHelper.getMeasuredHeightSpec(i5);
        super.onMeasure(measuredWidthSpec, measuredHeightSpec);
        int iHandleMiniWidth = this.mLayoutHelper.handleMiniWidth(measuredWidthSpec, getMeasuredWidth());
        int iHandleMiniHeight = this.mLayoutHelper.handleMiniHeight(measuredHeightSpec, getMeasuredHeight());
        if (measuredWidthSpec == iHandleMiniWidth && measuredHeightSpec == iHandleMiniHeight) {
            return;
        }
        super.onMeasure(iHandleMiniWidth, iHandleMiniHeight);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowBottomDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.onlyShowBottomDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowLeftDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.onlyShowLeftDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowRightDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.onlyShowRightDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void onlyShowTopDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.onlyShowTopDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setBorderColor(int i4) {
        this.mLayoutHelper.setBorderColor(i4);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setBorderWidth(int i4) {
        this.mLayoutHelper.setBorderWidth(i4);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setBottomDividerAlpha(int i4) {
        this.mLayoutHelper.setBottomDividerAlpha(i4);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public boolean setHeightLimit(int i4) {
        if (!this.mLayoutHelper.setHeightLimit(i4)) {
            return true;
        }
        requestLayout();
        invalidate();
        return true;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setHideRadiusSide(int i4) {
        this.mLayoutHelper.setHideRadiusSide(i4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setLeftDividerAlpha(int i4) {
        this.mLayoutHelper.setLeftDividerAlpha(i4);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setOuterNormalColor(int i4) {
        this.mLayoutHelper.setOuterNormalColor(i4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setOutlineExcludePadding(boolean z3) {
        this.mLayoutHelper.setOutlineExcludePadding(z3);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setOutlineInset(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.setOutlineInset(i4, i5, i6, i7);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadius(int i4) {
        this.mLayoutHelper.setRadius(i4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadiusAndShadow(int i4, int i5, float f4) {
        this.mLayoutHelper.setRadiusAndShadow(i4, i5, f4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRightDividerAlpha(int i4) {
        this.mLayoutHelper.setRightDividerAlpha(i4);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShadowAlpha(float f4) {
        this.mLayoutHelper.setShadowAlpha(f4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShadowColor(int i4) {
        this.mLayoutHelper.setShadowColor(i4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShadowElevation(int i4) {
        this.mLayoutHelper.setShadowElevation(i4);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setShowBorderOnlyBeforeL(boolean z3) {
        this.mLayoutHelper.setShowBorderOnlyBeforeL(z3);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setTopDividerAlpha(int i4) {
        this.mLayoutHelper.setTopDividerAlpha(i4);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setUseThemeGeneralShadowElevation() {
        this.mLayoutHelper.setUseThemeGeneralShadowElevation();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public boolean setWidthLimit(int i4) {
        if (!this.mLayoutHelper.setWidthLimit(i4)) {
            return true;
        }
        requestLayout();
        invalidate();
        return true;
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateBottomDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.updateBottomDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateLeftDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.updateLeftDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateRightDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.updateRightDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void updateTopDivider(int i4, int i5, int i6, int i7) {
        this.mLayoutHelper.updateTopDivider(i4, i5, i6, i7);
        invalidate();
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadius(int i4, int i5) {
        this.mLayoutHelper.setRadius(i4, i5);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadiusAndShadow(int i4, int i5, int i6, float f4) {
        this.mLayoutHelper.setRadiusAndShadow(i4, i5, i6, f4);
    }

    public XUIRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    @Override // com.xuexiang.xui.widget.layout.IXUILayout
    public void setRadiusAndShadow(int i4, int i5, int i6, int i7, float f4) {
        this.mLayoutHelper.setRadiusAndShadow(i4, i5, i6, i7, f4);
    }

    public XUIRelativeLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context, attributeSet, i4);
    }
}
