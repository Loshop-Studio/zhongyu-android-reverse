package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import p147s1.C7689c;
import p147s1.InterfaceC7687a;

/* loaded from: classes3.dex */
public class XUIAlphaButton extends AppCompatButton {

    /* renamed from: a */
    public InterfaceC7687a f4538a;

    public XUIAlphaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private InterfaceC7687a getAlphaViewHelper() {
        if (this.f4538a == null) {
            this.f4538a = new C7689c(this);
        }
        return this.f4538a;
    }

    public void setChangeAlphaWhenDisable(boolean z6) {
        getAlphaViewHelper().mo9146b(z6);
    }

    public void setChangeAlphaWhenPress(boolean z6) {
        getAlphaViewHelper().mo9145a(z6);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        getAlphaViewHelper().mo9147c(this, z6);
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        super.setPressed(z6);
        getAlphaViewHelper().mo9148d(this, z6);
    }
}
