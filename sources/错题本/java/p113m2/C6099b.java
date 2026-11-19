package p113m2;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnectionWrapper;
import com.xuexiang.xui.widget.edittext.verify.VerifyCodeEditText;
import p129o2.C6268a;

/* renamed from: m2.b */
/* loaded from: classes3.dex */
public final class C6099b extends InputConnectionWrapper {

    /* renamed from: a */
    public InterfaceC6098a f9743a;

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i8) {
        InterfaceC6098a interfaceC6098a = this.f9743a;
        if (interfaceC6098a == null) {
            return super.deleteSurroundingText(i, i8);
        }
        VerifyCodeEditText.m3486a((VerifyCodeEditText) ((C6268a) interfaceC6098a).f10022b);
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        InterfaceC6098a interfaceC6098a;
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || (interfaceC6098a = this.f9743a) == null) {
            return super.sendKeyEvent(keyEvent);
        }
        VerifyCodeEditText.m3486a((VerifyCodeEditText) ((C6268a) interfaceC6098a).f10022b);
        return true;
    }
}
