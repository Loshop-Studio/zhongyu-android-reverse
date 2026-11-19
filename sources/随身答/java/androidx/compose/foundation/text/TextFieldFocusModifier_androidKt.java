package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.focus.FocusDirection;
import androidx.compose.p012ui.focus.FocusManager;
import androidx.compose.p012ui.input.key.KeyEvent;
import androidx.compose.p012ui.input.key.KeyEventType;
import androidx.compose.p012ui.input.key.KeyEvent_androidKt;
import androidx.compose.p012ui.input.key.KeyInputModifierKt;
import androidx.compose.p012ui.input.key.Key_androidKt;
import androidx.compose.p012ui.platform.SoftwareKeyboardController;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13413d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isKeyCode", "", "Landroidx/compose/ui/input/key/KeyEvent;", "keyCode", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m18535invokeZmokQxo(keyEvent.m22477unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m18535invokeZmokQxo(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo21065moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m22481equalsimpl0(KeyEvent_androidKt.m22489getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m22485getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                    if (TextFieldFocusModifier_androidKt.m18534isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo21065moveFocus3ESFkO8 = focusManager.mo21065moveFocus3ESFkO8(FocusDirection.INSTANCE.m21063getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m18534isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo21065moveFocus3ESFkO8 = focusManager.mo21065moveFocus3ESFkO8(FocusDirection.INSTANCE.m21056getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m18534isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo21065moveFocus3ESFkO8 = focusManager.mo21065moveFocus3ESFkO8(FocusDirection.INSTANCE.m21059getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m18534isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo21065moveFocus3ESFkO8 = focusManager.mo21065moveFocus3ESFkO8(FocusDirection.INSTANCE.m21062getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m18534isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zMo21065moveFocus3ESFkO8 = true;
                    }
                }
                return Boolean.valueOf(zMo21065moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m18534isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i9) {
        return Key_androidKt.m22495getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m22488getKeyZmokQxo(keyEvent)) == i9;
    }
}
