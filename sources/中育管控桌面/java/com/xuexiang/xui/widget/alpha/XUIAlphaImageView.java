package com.xuexiang.xui.widget.alpha;

import androidx.appcompat.widget.AppCompatImageView;
import p147s1.C7689c;
import p147s1.InterfaceC7687a;

/* loaded from: classes3.dex */
public class XUIAlphaImageView extends AppCompatImageView {

    /* renamed from: a */
    public InterfaceC7687a f4540a;

    private InterfaceC7687a getAlphaViewHelper() {
        if (this.f4540a == null) {
            this.f4540a = new C7689c(this);
        }
        return this.f4540a;
    }

    public void setChangeAlphaWhenDisable(boolean z6) {
        getAlphaViewHelper().mo9146b(z6);
    }

    public void setChangeAlphaWhenPress(boolean z6) {
        getAlphaViewHelper().mo9145a(z6);
    }

    @Override // android.view.View
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
