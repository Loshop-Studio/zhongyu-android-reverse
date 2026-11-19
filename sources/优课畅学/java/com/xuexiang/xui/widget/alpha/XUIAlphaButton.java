package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p206p1.C9638c;
import p206p1.InterfaceC9636a;

/* loaded from: classes4.dex */
public class XUIAlphaButton extends AppCompatButton {

    /* renamed from: a */
    public InterfaceC9636a f7139a;

    public XUIAlphaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private InterfaceC9636a getAlphaViewHelper() {
        if (this.f7139a == null) {
            this.f7139a = new C9638c(this);
        }
        return this.f7139a;
    }

    public void setChangeAlphaWhenDisable(boolean z10) {
        getAlphaViewHelper().mo18202b(z10);
    }

    public void setChangeAlphaWhenPress(boolean z10) {
        getAlphaViewHelper().mo18201a(z10);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getAlphaViewHelper().mo18203c(this, z10);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        getAlphaViewHelper().mo18204d(this, z10);
    }
}
