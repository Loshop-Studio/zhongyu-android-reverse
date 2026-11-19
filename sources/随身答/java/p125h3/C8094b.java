package p125h3;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: h3.b */
/* loaded from: classes4.dex */
public class C8094b extends LinearLayout {

    /* renamed from: a */
    public InterfaceC8093a f13797a;

    public C8094b(Context context) {
        super(context);
    }

    private InterfaceC8093a getAlphaViewHelper() {
        if (this.f13797a == null) {
            this.f13797a = new C8095c(this);
        }
        return this.f13797a;
    }

    public void setChangeAlphaWhenDisable(boolean z9) {
        getAlphaViewHelper().mo12929b(z9);
    }

    public void setChangeAlphaWhenPress(boolean z9) {
        getAlphaViewHelper().mo12928a(z9);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        getAlphaViewHelper().mo12930c(this, z9);
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        super.setPressed(z9);
        getAlphaViewHelper().mo12931d(this, z9);
    }

    public C8094b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
