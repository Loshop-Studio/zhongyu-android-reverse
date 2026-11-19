package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p013ui.input.key.Key;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;

/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo21201mapZmokQxo(KeyEvent keyEvent) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m25363isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m25360isAltPressedZmokQxo(keyEvent)) {
                long jM25357getKeyZmokQxo = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21244getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21245getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21246getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo, mappedKeys.m21243getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m25360isAltPressedZmokQxo(keyEvent)) {
                long jM25357getKeyZmokQxo2 = KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21244getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21245getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21246getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m25049equalsimpl0(jM25357getKeyZmokQxo2, mappedKeys2.m21243getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo21201mapZmokQxo(keyEvent) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
