package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.input.key.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.KeyInputModifierKt;
import androidx.compose.p014ui.input.key.Key_androidKt;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.core.view.InputDeviceCompat;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m27903invokeZmokQxo(((KeyEvent) obj).m31948unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m27903invokeZmokQxo(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo30529moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                    if (TextFieldFocusModifier_androidKt.m27902isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo30529moveFocus3ESFkO8 = focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30525getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m27902isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo30529moveFocus3ESFkO8 = focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30518getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m27902isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo30529moveFocus3ESFkO8 = focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30521getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m27902isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo30529moveFocus3ESFkO8 = focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30524getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m27902isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zMo30529moveFocus3ESFkO8 = true;
                    }
                }
                return Boolean.valueOf(zMo30529moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m27902isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i10) {
        return Key_androidKt.m31966getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent)) == i10;
    }
}
