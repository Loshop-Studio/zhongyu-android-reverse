package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p196x1.C6742b;
import p196x1.InterfaceC6741a;

/* loaded from: classes3.dex */
public class XUIAlphaTextView extends AppCompatTextView {

    /* renamed from: b */
    public C6742b f3993b;

    public XUIAlphaTextView(Context context) {
        super(context);
    }

    private InterfaceC6741a getAlphaViewHelper() {
        if (this.f3993b == null) {
            this.f3993b = new C6742b(this);
        }
        return this.f3993b;
    }

    public void setChangeAlphaWhenDisable(boolean z8) {
        ((C6742b) getAlphaViewHelper()).m6429c(z8);
    }

    public void setChangeAlphaWhenPress(boolean z8) {
        ((C6742b) getAlphaViewHelper()).f11402b = z8;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        ((C6742b) getAlphaViewHelper()).m6427a(this, z8);
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        super.setPressed(z8);
        ((C6742b) getAlphaViewHelper()).m6428b(this, z8);
    }

    public XUIAlphaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XUIAlphaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
