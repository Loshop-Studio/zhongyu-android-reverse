package com.xuexiang.xui.widget.alpha;

import androidx.appcompat.widget.AppCompatImageButton;
import p219r2.C9002c;
import p219r2.InterfaceC9000a;

/* loaded from: classes4.dex */
public class XUIAlphaImageButton extends AppCompatImageButton {

    /* renamed from: a */
    public InterfaceC9000a f5815a;

    private InterfaceC9000a getAlphaViewHelper() {
        if (this.f5815a == null) {
            this.f5815a = new C9002c(this);
        }
        return this.f5815a;
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        getAlphaViewHelper().mo15146b(z9);
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        getAlphaViewHelper().mo15145a(z9);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        getAlphaViewHelper().mo15147c(this, z9);
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        getAlphaViewHelper().mo15148d(this, z9);
    }
}
