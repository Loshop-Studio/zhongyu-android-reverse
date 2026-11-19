package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.platform.SoftwareKeyboardController;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.InputDeviceCompat;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-CJ9ybgU, reason: not valid java name */
    public boolean mo27973onKeyEventCJ9ybgU(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11, InterfaceC9529a interfaceC9529a) {
        if (KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.m28057isFromSoftKeyboardZmokQxo(keyEvent)) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo27973onKeyEventCJ9ybgU(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, interfaceC9540l, z10, z11, interfaceC9529a);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo27974onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (super.mo27974onPreKeyEventMyFupTE(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(InputDeviceCompat.SOURCE_DPAD) || device.isVirtual() || !KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY()) || keyEvent.getSource() == 257) {
            return false;
        }
        if (TextFieldKeyEventHandler_androidKt.m28058isKeyCodeYhN2O0w(keyEvent, 19)) {
            return focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30525getUpdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m28058isKeyCodeYhN2O0w(keyEvent, 20)) {
            return focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30518getDowndhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m28058isKeyCodeYhN2O0w(keyEvent, 21)) {
            return focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30521getLeftdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m28058isKeyCodeYhN2O0w(keyEvent, 22)) {
            return focusManager.mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30524getRightdhqQ8s());
        }
        if (!TextFieldKeyEventHandler_androidKt.m28058isKeyCodeYhN2O0w(keyEvent, 23)) {
            return false;
        }
        softwareKeyboardController.show();
        return true;
    }
}
