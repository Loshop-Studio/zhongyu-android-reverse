package androidx.compose.foundation.text;

import androidx.compose.p014ui.input.key.KeyEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m27908invokeZmokQxo(((KeyEvent) obj).m31948unboximpl());
    }

    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
    public final Boolean m27908invokeZmokQxo(android.view.KeyEvent keyEvent) {
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).m27905processZmokQxo(keyEvent));
    }
}
