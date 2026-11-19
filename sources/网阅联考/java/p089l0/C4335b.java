package p089l0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: l0.b */
/* loaded from: classes2.dex */
public class C4335b extends LinearLayout {

    /* renamed from: a */
    public InterfaceC4334a f4842a;

    public C4335b(Context context) {
        super(context);
    }

    private InterfaceC4334a getAlphaViewHelper() {
        if (this.f4842a == null) {
            this.f4842a = new C4336c(this);
        }
        return this.f4842a;
    }

    public void setChangeAlphaWhenDisable(boolean z3) {
        getAlphaViewHelper().mo5347b(z3);
    }

    public void setChangeAlphaWhenPress(boolean z3) {
        getAlphaViewHelper().mo5346a(z3);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        getAlphaViewHelper().mo5348c(this, z3);
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        super.setPressed(z3);
        getAlphaViewHelper().mo5349d(this, z3);
    }

    public C4335b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
