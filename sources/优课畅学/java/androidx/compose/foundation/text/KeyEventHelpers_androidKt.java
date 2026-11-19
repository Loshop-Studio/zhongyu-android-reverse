package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEventType;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;

/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m21200cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m25350equalsimpl0(KeyEvent_androidKt.m25358getTypeZmokQxo(keyEvent), KeyEventType.Companion.m25355getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
