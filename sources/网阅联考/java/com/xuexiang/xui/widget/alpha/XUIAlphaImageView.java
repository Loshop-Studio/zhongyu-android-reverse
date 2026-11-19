package com.xuexiang.xui.widget.alpha;

import androidx.appcompat.widget.AppCompatImageView;
import p089l0.C4336c;
import p089l0.InterfaceC4334a;

/* loaded from: classes2.dex */
public class XUIAlphaImageView extends AppCompatImageView {

    /* renamed from: a */
    public InterfaceC4334a f3156a;

    private InterfaceC4334a getAlphaViewHelper() {
        if (this.f3156a == null) {
            this.f3156a = new C4336c(this);
        }
        return this.f3156a;
    }

    public void setChangeAlphaWhenDisable(boolean z3) {
        getAlphaViewHelper().mo5347b(z3);
    }

    public void setChangeAlphaWhenPress(boolean z3) {
        getAlphaViewHelper().mo5346a(z3);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        getAlphaViewHelper().mo5348c(this, z3);
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        super.setPressed(z3);
        getAlphaViewHelper().mo5349d(this, z3);
    }
}
