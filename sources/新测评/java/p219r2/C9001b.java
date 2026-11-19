package p219r2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: r2.b */
/* loaded from: classes4.dex */
public class C9001b extends LinearLayout {

    /* renamed from: a */
    public InterfaceC9000a f15405a;

    public C9001b(Context context) {
        super(context);
    }

    private InterfaceC9000a getAlphaViewHelper() {
        if (this.f15405a == null) {
            this.f15405a = new C9002c(this);
        }
        return this.f15405a;
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        getAlphaViewHelper().mo15146b(z9);
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        getAlphaViewHelper().mo15145a(z9);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        getAlphaViewHelper().mo15147c(this, z9);
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        getAlphaViewHelper().mo15148d(this, z9);
    }

    public C9001b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
