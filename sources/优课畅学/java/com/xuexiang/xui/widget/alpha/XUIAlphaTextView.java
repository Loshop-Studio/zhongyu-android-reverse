package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p206p1.C9638c;
import p206p1.InterfaceC9636a;

/* loaded from: classes4.dex */
public class XUIAlphaTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC9636a f7142b;

    public XUIAlphaTextView(Context context) {
        super(context);
    }

    private InterfaceC9636a getAlphaViewHelper() {
        if (this.f7142b == null) {
            this.f7142b = new C9638c(this);
        }
        return this.f7142b;
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

    public XUIAlphaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
