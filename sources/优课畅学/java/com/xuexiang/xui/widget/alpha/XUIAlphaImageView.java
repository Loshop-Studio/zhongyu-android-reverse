package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import p206p1.C9638c;
import p206p1.InterfaceC9636a;

/* loaded from: classes4.dex */
public class XUIAlphaImageView extends AppCompatImageView {

    /* renamed from: a */
    public InterfaceC9636a f7141a;

    public XUIAlphaImageView(Context context) {
        super(context);
    }

    private InterfaceC9636a getAlphaViewHelper() {
        if (this.f7141a == null) {
            this.f7141a = new C9638c(this);
        }
        return this.f7141a;
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
