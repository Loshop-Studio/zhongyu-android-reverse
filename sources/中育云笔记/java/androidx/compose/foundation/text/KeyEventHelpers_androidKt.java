package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;

/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m27802cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31957getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
