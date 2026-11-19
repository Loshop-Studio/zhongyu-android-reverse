package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p046c8.C5407b;
import p046c8.InterfaceC5406a;

/* loaded from: classes5.dex */
public class XUIAlphaRelativeLayout extends RelativeLayout {

    /* renamed from: c */
    public InterfaceC5406a f15364c;

    public XUIAlphaRelativeLayout(Context context) {
        super(context);
    }

    private InterfaceC5406a getAlphaViewHelper() {
        if (this.f15364c == null) {
            this.f15364c = new C5407b(this);
        }
        return this.f15364c;
    }

    public void setChangeAlphaWhenDisable(boolean z10) {
        getAlphaViewHelper().mo2843b(z10);
    }

    public void setChangeAlphaWhenPress(boolean z10) {
        getAlphaViewHelper().mo2842a(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getAlphaViewHelper().mo2844c(this, z10);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        getAlphaViewHelper().mo2845d(this, z10);
    }

    public XUIAlphaRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XUIAlphaRelativeLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
