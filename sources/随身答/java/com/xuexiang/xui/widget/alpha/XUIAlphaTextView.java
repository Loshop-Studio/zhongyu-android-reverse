package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p125h3.C8095c;
import p125h3.InterfaceC8093a;

/* loaded from: classes4.dex */
public class XUIAlphaTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC8093a f7072b;

    public XUIAlphaTextView(Context context) {
        super(context);
    }

    private InterfaceC8093a getAlphaViewHelper() {
        if (this.f7072b == null) {
            this.f7072b = new C8095c(this);
        }
        return this.f7072b;
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

    public XUIAlphaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
