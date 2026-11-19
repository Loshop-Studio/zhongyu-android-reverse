package com.xuexiang.xui.widget.alpha;

import androidx.appcompat.widget.AppCompatImageButton;
import p206p1.C9638c;
import p206p1.InterfaceC9636a;

/* loaded from: classes4.dex */
public class XUIAlphaImageButton extends AppCompatImageButton {

    /* renamed from: a */
    public InterfaceC9636a f7140a;

    private InterfaceC9636a getAlphaViewHelper() {
        if (this.f7140a == null) {
            this.f7140a = new C9638c(this);
        }
        return this.f7140a;
    }

    public void setChangeAlphaWhenDisable(boolean z10) {
        getAlphaViewHelper().mo18202b(z10);
    }

    public void setChangeAlphaWhenPress(boolean z10) {
        getAlphaViewHelper().mo18201a(z10);
    }

    @Override // android.view.View
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
