package p147s1;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: s1.b */
/* loaded from: classes3.dex */
public class C7688b extends LinearLayout {

    /* renamed from: a */
    public InterfaceC7687a f10150a;

    public C7688b(Context context) {
        super(context);
    }

    private InterfaceC7687a getAlphaViewHelper() {
        if (this.f10150a == null) {
            this.f10150a = new C7689c(this);
        }
        return this.f10150a;
    }

    public void setChangeAlphaWhenDisable(boolean z6) {
        getAlphaViewHelper().mo9146b(z6);
    }

    public void setChangeAlphaWhenPress(boolean z6) {
        getAlphaViewHelper().mo9145a(z6);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        getAlphaViewHelper().mo9147c(this, z6);
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        super.setPressed(z6);
        getAlphaViewHelper().mo9148d(this, z6);
    }

    public C7688b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
