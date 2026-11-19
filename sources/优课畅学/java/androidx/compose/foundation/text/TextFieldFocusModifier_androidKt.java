package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.input.key.KeyEvent;
import androidx.compose.p013ui.input.key.KeyEventType;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.p013ui.input.key.KeyInputModifierKt;
import androidx.compose.p013ui.input.key.Key_androidKt;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.core.view.InputDeviceCompat;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m21301invokeZmokQxo(((KeyEvent) obj).m25346unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m21301invokeZmokQxo(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo23927moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m25350equalsimpl0(KeyEvent_androidKt.m25358getTypeZmokQxo(keyEvent), KeyEventType.Companion.m25354getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                    if (TextFieldFocusModifier_androidKt.m21300isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo23927moveFocus3ESFkO8 = focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23923getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m21300isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo23927moveFocus3ESFkO8 = focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23916getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m21300isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo23927moveFocus3ESFkO8 = focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23919getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m21300isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo23927moveFocus3ESFkO8 = focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23922getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m21300isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zMo23927moveFocus3ESFkO8 = true;
                    }
                }
                return Boolean.valueOf(zMo23927moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m21300isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i10) {
        return Key_androidKt.m25364getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m25357getKeyZmokQxo(keyEvent)) == i10;
    }
}
