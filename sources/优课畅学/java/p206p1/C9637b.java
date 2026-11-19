package p206p1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: p1.b */
/* loaded from: classes4.dex */
public class C9637b extends LinearLayout {

    /* renamed from: a */
    public InterfaceC9636a f19294a;

    public C9637b(Context context) {
        super(context);
    }

    private InterfaceC9636a getAlphaViewHelper() {
        if (this.f19294a == null) {
            this.f19294a = new C9638c(this);
        }
        return this.f19294a;
    }

    public void setChangeAlphaWhenDisable(boolean z10) {
        getAlphaViewHelper().mo18202b(z10);
    }

    public void setChangeAlphaWhenPress(boolean z10) {
        getAlphaViewHelper().mo18201a(z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        getAlphaViewHelper().mo18203c(this, z10);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        getAlphaViewHelper().mo18204d(this, z10);
    }

    public C9637b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
