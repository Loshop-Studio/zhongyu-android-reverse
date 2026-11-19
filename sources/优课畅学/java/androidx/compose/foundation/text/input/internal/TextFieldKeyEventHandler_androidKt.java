package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.p013ui.input.key.Key_androidKt;

/* loaded from: classes.dex */
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m21455isFromSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m21456isKeyCodeYhN2O0w(KeyEvent keyEvent, int i10) {
        return Key_androidKt.m25364getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent)) == i10;
    }
}
