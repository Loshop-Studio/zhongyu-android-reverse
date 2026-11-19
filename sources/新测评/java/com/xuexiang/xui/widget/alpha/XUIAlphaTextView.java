package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p219r2.C9002c;
import p219r2.InterfaceC9000a;

/* loaded from: classes4.dex */
public class XUIAlphaTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC9000a f5817b;

    public XUIAlphaTextView(Context context) {
        super(context);
    }

    private InterfaceC9000a getAlphaViewHelper() {
        if (this.f5817b == null) {
            this.f5817b = new C9002c(this);
        }
        return this.f5817b;
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        getAlphaViewHelper().mo15146b(z9);
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        getAlphaViewHelper().mo15145a(z9);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        getAlphaViewHelper().mo15147c(this, z9);
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        getAlphaViewHelper().mo15148d(this, z9);
    }

    public XUIAlphaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
