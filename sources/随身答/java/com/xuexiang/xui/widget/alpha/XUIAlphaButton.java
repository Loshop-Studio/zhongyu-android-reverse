package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p125h3.C8095c;
import p125h3.InterfaceC8093a;

/* loaded from: classes4.dex */
public class XUIAlphaButton extends AppCompatButton {

    /* renamed from: a */
    public InterfaceC8093a f7069a;

    public XUIAlphaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private InterfaceC8093a getAlphaViewHelper() {
        if (this.f7069a == null) {
            this.f7069a = new C8095c(this);
        }
        return this.f7069a;
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        getAlphaViewHelper().mo12929b(z9);
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        getAlphaViewHelper().mo12928a(z9);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        getAlphaViewHelper().mo12930c(this, z9);
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        getAlphaViewHelper().mo12931d(this, z9);
    }
}
