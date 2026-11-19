package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

/* loaded from: classes.dex */
public class XUIAlphaButton extends AppCompatButton {
    private IAlphaViewHelper mAlphaViewHelper;

    public XUIAlphaButton(Context context) {
        super(context);
    }

    private IAlphaViewHelper getAlphaViewHelper() {
        if (this.mAlphaViewHelper == null) {
            this.mAlphaViewHelper = new XUIAlphaViewHelper(this);
        }
        return this.mAlphaViewHelper;
    }

    public void setChangeAlphaWhenDisable(boolean z3) {
        getAlphaViewHelper().setChangeAlphaWhenDisable(z3);
    }

    public void setChangeAlphaWhenPress(boolean z3) {
        getAlphaViewHelper().setChangeAlphaWhenPress(z3);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        getAlphaViewHelper().onEnabledChanged(this, z3);
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        super.setPressed(z3);
        getAlphaViewHelper().onPressedChanged(this, z3);
    }

    public XUIAlphaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XUIAlphaButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
