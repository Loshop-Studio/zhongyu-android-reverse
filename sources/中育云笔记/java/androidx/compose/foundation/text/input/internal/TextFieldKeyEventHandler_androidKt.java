package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.Key_androidKt;

/* loaded from: classes.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m28057isFromSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m28058isKeyCodeYhN2O0w(KeyEvent keyEvent, int i10) {
        return Key_androidKt.m31966getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent)) == i10;
    }
}
