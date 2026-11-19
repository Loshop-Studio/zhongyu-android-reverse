package androidx.compose.p013ui.input.key;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m25357getKeyZmokQxo(KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m25358getTypeZmokQxo(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? KeyEventType.Companion.m25356getUnknownCS__XNY() : KeyEventType.Companion.m25355getKeyUpCS__XNY() : KeyEventType.Companion.m25354getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m25359getUtf16CodePointZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m25360isAltPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m25361isCtrlPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m25362isMetaPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m25363isShiftPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
