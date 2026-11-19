package androidx.compose.foundation.text;

import androidx.compose.p013ui.input.key.KeyEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m21306invokeZmokQxo(((KeyEvent) obj).m25346unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m21306invokeZmokQxo(android.view.KeyEvent keyEvent) {
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m21303processZmokQxo(keyEvent));
    }
}
