package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"platformDefaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getPlatformDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeyMapping_androidKt {

    @NotNull
    private static final KeyMapping platformDefaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMapping_androidKt$platformDefaultKeyMapping$1
        @Override // androidx.compose.foundation.text.KeyMapping
        /* renamed from: map-ZmokQxo */
        public KeyCommand mo7607mapZmokQxo(KeyEvent event) {
            KeyCommand keyCommand = null;
            if (KeyEvent_androidKt.m11769isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m11766isAltPressedZmokQxo(event)) {
                long jM11763getKeyZmokQxo = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7650getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_LEFT;
                } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7651getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_LINE_RIGHT;
                } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7652getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_HOME;
                } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo, mappedKeys.m7649getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.SELECT_END;
                }
            } else if (KeyEvent_androidKt.m11766isAltPressedZmokQxo(event)) {
                long jM11763getKeyZmokQxo2 = KeyEvent_androidKt.m11763getKeyZmokQxo(event);
                MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7650getDirectionLeftEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7651getDirectionRightEK5gGoQ())) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7652getDirectionUpEK5gGoQ())) {
                    keyCommand = KeyCommand.HOME;
                } else if (Key.m11455equalsimpl0(jM11763getKeyZmokQxo2, mappedKeys2.m7649getDirectionDownEK5gGoQ())) {
                    keyCommand = KeyCommand.END;
                }
            }
            return keyCommand == null ? KeyMappingKt.getDefaultKeyMapping().mo7607mapZmokQxo(event) : keyCommand;
        }
    };

    @NotNull
    public static final KeyMapping getPlatformDefaultKeyMapping() {
        return platformDefaultKeyMapping;
    }
}
