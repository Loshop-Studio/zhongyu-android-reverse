package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import p000a.p005b.p014h.C0079f;
import p070b.p113c.p114a.p116e.p117a.C0793c;
import p070b.p113c.p114a.p116e.p117a.InterfaceC0791a;

/* loaded from: classes.dex */
public class XUIAlphaButton extends C0079f {

    /* renamed from: d */
    public InterfaceC0791a f5120d;

    public XUIAlphaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private InterfaceC0791a getAlphaViewHelper() {
        if (this.f5120d == null) {
            this.f5120d = new C0793c(this);
        }
        return this.f5120d;
    }

    public void setChangeAlphaWhenDisable(boolean z) {
        ((C0793c) getAlphaViewHelper()).m2496c(z);
    }

    public void setChangeAlphaWhenPress(boolean z) {
        ((C0793c) getAlphaViewHelper()).f4461b = z;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ((C0793c) getAlphaViewHelper()).m2494a(this, z);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        ((C0793c) getAlphaViewHelper()).m2495b(this, z);
    }
}
