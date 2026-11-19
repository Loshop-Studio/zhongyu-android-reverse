package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p014ui.input.key.Key;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo27803mapZmokQxo(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m31965isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m31962isAltPressedZmokQxo(keyEvent)) {
                long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27846getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27847getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27848getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, mappedKeys.m27845getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m31962isAltPressedZmokQxo(keyEvent)) {
                long jM31959getKeyZmokQxo2 = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27846getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27847getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27848getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo2, mappedKeys2.m27845getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo27803mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
