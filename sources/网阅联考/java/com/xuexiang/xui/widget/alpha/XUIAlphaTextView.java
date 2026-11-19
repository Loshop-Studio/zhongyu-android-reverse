package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p089l0.C4336c;
import p089l0.InterfaceC4334a;

/* loaded from: classes2.dex */
public class XUIAlphaTextView extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC4334a f3157b;

    public XUIAlphaTextView(Context context) {
        super(context);
    }

    private InterfaceC4334a getAlphaViewHelper() {
        if (this.f3157b == null) {
            this.f3157b = new C4336c(this);
        }
        return this.f3157b;
    }

    public void setChangeAlphaWhenDisable(boolean z3) {
        getAlphaViewHelper().mo5347b(z3);
    }

    public void setChangeAlphaWhenPress(boolean z3) {
        getAlphaViewHelper().mo5346a(z3);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        getAlphaViewHelper().mo5348c(this, z3);
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        super.setPressed(z3);
        getAlphaViewHelper().mo5349d(this, z3);
    }

    public XUIAlphaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
