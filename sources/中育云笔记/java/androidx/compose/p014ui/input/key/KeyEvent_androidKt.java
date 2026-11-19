package androidx.compose.p014ui.input.key;

import android.view.KeyEvent;

/* loaded from: classes2.dex */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m31959getKeyZmokQxo(KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m31960getTypeZmokQxo(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? KeyEventType.Companion.m31958getUnknownCS__XNY() : KeyEventType.Companion.m31957getKeyUpCS__XNY() : KeyEventType.Companion.m31956getKeyDownCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m31961getUtf16CodePointZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31962isAltPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31963isCtrlPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31964isMetaPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31965isShiftPressedZmokQxo(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
