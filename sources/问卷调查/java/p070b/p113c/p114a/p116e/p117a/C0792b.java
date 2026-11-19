package p070b.p113c.p114a.p116e.p117a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: b.c.a.e.a.b */
/* loaded from: classes.dex */
public class C0792b extends LinearLayout {

    /* renamed from: b */
    public InterfaceC0791a f4459b;

    public C0792b(Context context) {
        super(context);
    }

    public C0792b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private InterfaceC0791a getAlphaViewHelper() {
        if (this.f4459b == null) {
            this.f4459b = new C0793c(this);
        }
        return this.f4459b;
    }

    public void setChangeAlphaWhenDisable(boolean z) {
        ((C0793c) getAlphaViewHelper()).m2496c(z);
    }

    public void setChangeAlphaWhenPress(boolean z) {
        ((C0793c) getAlphaViewHelper()).f4461b = z;
    }

    @Override // android.view.View
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
