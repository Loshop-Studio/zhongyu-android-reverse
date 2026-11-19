package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p196x1.C6742b;
import p196x1.InterfaceC6741a;

/* loaded from: classes3.dex */
public class XUIAlphaLinearLayout extends LinearLayout {

    /* renamed from: a */
    public C6742b f3991a;

    public XUIAlphaLinearLayout(Context context) {
        super(context);
    }

    private InterfaceC6741a getAlphaViewHelper() {
        if (this.f3991a == null) {
            this.f3991a = new C6742b(this);
        }
        return this.f3991a;
    }

    public void setChangeAlphaWhenDisable(boolean z8) {
        ((C6742b) getAlphaViewHelper()).m6429c(z8);
    }

    public void setChangeAlphaWhenPress(boolean z8) {
        ((C6742b) getAlphaViewHelper()).f11402b = z8;
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
        ((C6742b) getAlphaViewHelper()).m6427a(this, z8);
    }

    @Override // android.view.View
    public void setPressed(boolean z8) {
        super.setPressed(z8);
        ((C6742b) getAlphaViewHelper()).m6428b(this, z8);
    }

    public XUIAlphaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XUIAlphaLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
