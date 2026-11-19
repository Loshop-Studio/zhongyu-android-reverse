package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.focus.FocusDirection;
import androidx.compose.p006ui.focus.FocusManager;
import androidx.compose.p006ui.input.key.KeyEvent;
import androidx.compose.p006ui.input.key.KeyEventType;
import androidx.compose.p006ui.input.key.KeyEvent_androidKt;
import androidx.compose.p006ui.input.key.KeyInputModifierKt;
import androidx.compose.p006ui.input.key.Key_androidKt;
import androidx.compose.p006ui.text.input.TextInputSession;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m5175d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/TextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final TextFieldState state, final FocusManager focusManager) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m7671invokeZmokQxo(keyEvent.m10355unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m7671invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean zMo8889moveFocus3ESFkO8;
                Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
                InputDevice device = keyEvent.getDevice();
                if (device == null) {
                    return Boolean.FALSE;
                }
                if (device.getKeyboardType() == 2 && device.isVirtual()) {
                    return Boolean.FALSE;
                }
                if (!KeyEventType.m10359equalsimpl0(KeyEvent_androidKt.m10367getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m10363getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                switch (Key_androidKt.m10375getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m10366getKeyZmokQxo(keyEvent))) {
                    case 19:
                        zMo8889moveFocus3ESFkO8 = focusManager.mo8889moveFocus3ESFkO8(FocusDirection.INSTANCE.m8888getUpdhqQ8s());
                        break;
                    case 20:
                        zMo8889moveFocus3ESFkO8 = focusManager.mo8889moveFocus3ESFkO8(FocusDirection.INSTANCE.m8879getDowndhqQ8s());
                        break;
                    case 21:
                        zMo8889moveFocus3ESFkO8 = focusManager.mo8889moveFocus3ESFkO8(FocusDirection.INSTANCE.m8883getLeftdhqQ8s());
                        break;
                    case 22:
                        zMo8889moveFocus3ESFkO8 = focusManager.mo8889moveFocus3ESFkO8(FocusDirection.INSTANCE.m8887getRightdhqQ8s());
                        break;
                    case 23:
                        TextInputSession inputSession = state.getInputSession();
                        if (inputSession != null) {
                            inputSession.showSoftwareKeyboard();
                        }
                        zMo8889moveFocus3ESFkO8 = true;
                        break;
                    default:
                        zMo8889moveFocus3ESFkO8 = false;
                        break;
                }
                return Boolean.valueOf(zMo8889moveFocus3ESFkO8);
            }
        });
    }
}
