package com.xuexiang.xui.widget.textview.label;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public class LabelImageView extends AppCompatImageView {
    LabelViewHelper utils;

    public LabelImageView(Context context) {
        this(context, null);
    }

    public int getLabelBackgroundColor() {
        return this.utils.getLabelBackgroundColor();
    }

    public int getLabelDistance() {
        return this.utils.getLabelDistance();
    }

    public int getLabelHeight() {
        return this.utils.getLabelHeight();
    }

    public int getLabelOrientation() {
        return this.utils.getLabelOrientation();
    }

    public String getLabelText() {
        return this.utils.getLabelText();
    }

    public int getLabelTextColor() {
        return this.utils.getLabelTextColor();
    }

    public String getLabelTextFont() {
        return this.utils.getLabelTextFont();
    }

    public int getLabelTextSize() {
        return this.utils.getLabelTextSize();
    }

    public int getLabelTextStyle() {
        return this.utils.getLabelTextStyle();
    }

    public boolean isLabelVisual() {
        return this.utils.isLabelVisual();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.utils.onDraw(canvas, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setLabelBackgroundAlpha(int i4) {
        this.utils.setLabelBackgroundAlpha(this, i4);
    }

    public void setLabelBackgroundColor(int i4) {
        this.utils.setLabelBackgroundColor(this, i4);
    }

    public void setLabelDistance(int i4) {
        this.utils.setLabelDistance(this, i4);
    }

    public void setLabelHeight(int i4) {
        this.utils.setLabelHeight(this, i4);
    }

    public void setLabelOrientation(int i4) {
        this.utils.setLabelOrientation(this, i4);
    }

    public void setLabelText(String str) {
        this.utils.setLabelText(this, str);
    }

    public void setLabelTextColor(int i4) {
        this.utils.setLabelTextColor(this, i4);
    }

    public void setLabelTextFont(String str) {
        this.utils.setLabelTextFont(this, str);
    }

    public void setLabelTextSize(int i4) {
        this.utils.setLabelTextSize(this, i4);
    }

    public void setLabelTextStyle(int i4) {
        this.utils.setLabelTextStyle(this, i4);
    }

    public void setLabelVisual(boolean z3) {
        this.utils.setLabelVisual(this, z3);
    }

    public LabelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LabelImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.utils = new LabelViewHelper(context, attributeSet, i4);
    }
}
