package com.xuexiang.xui.widget.alpha;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import p046c8.C5407b;
import p046c8.InterfaceC5406a;

/* loaded from: classes5.dex */
public class XUIAlphaImageButton extends AppCompatImageButton {

    /* renamed from: c */
    public InterfaceC5406a f15361c;

    public XUIAlphaImageButton(Context context) {
        super(context);
    }

    private InterfaceC5406a getAlphaViewHelper() {
        if (this.f15361c == null) {
            this.f15361c = new C5407b(this);
        }
        return this.f15361c;
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

    public XUIAlphaImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public XUIAlphaImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
