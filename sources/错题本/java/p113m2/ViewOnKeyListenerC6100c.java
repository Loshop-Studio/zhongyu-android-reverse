package p113m2;

import android.view.KeyEvent;
import android.view.View;
import com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText;

/* renamed from: m2.c */
/* loaded from: classes3.dex */
public final class ViewOnKeyListenerC6100c implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ VerifyCodeEditText f9744a;

    public ViewOnKeyListenerC6100c(VerifyCodeEditText verifyCodeEditText) {
        this.f9744a = verifyCodeEditText;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        VerifyCodeEditText.m3486a(this.f9744a);
        return true;
    }
}
