package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p009ui.input.key.Key;
import androidx.compose.p009ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7880d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo10930mapZmokQxo(KeyEvent event) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m14984isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m14981isAltPressedZmokQxo(event)) {
                long jM14978getKeyZmokQxo = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10969getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10970getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10971getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo, mappedKeys.m10968getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m14981isAltPressedZmokQxo(event)) {
                long jM14978getKeyZmokQxo2 = KeyEvent_androidKt.m14978getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10969getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10970getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10971getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m14670equalsimpl0(jM14978getKeyZmokQxo2, mappedKeys2.m10968getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo10930mapZmokQxo(event) : keyCommand;
        }
    };

    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
