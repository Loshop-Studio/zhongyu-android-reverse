package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p147s1.C7689c;
import p147s1.InterfaceC7687a;

/* loaded from: classes3.dex */
public class XUIAlphaTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC7687a f4541b;

    public XUIAlphaTextView(Context context) {
        super(context);
    }

    private InterfaceC7687a getAlphaViewHelper() {
        if (this.f4541b == null) {
            this.f4541b = new C7689c(this);
        }
        return this.f4541b;
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

    public XUIAlphaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
