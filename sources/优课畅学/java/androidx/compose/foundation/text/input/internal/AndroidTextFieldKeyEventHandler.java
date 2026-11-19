package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.input.key.KeyEventType;
import androidx.compose.p013ui.input.key.KeyEvent_androidKt;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.InputDeviceCompat;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-CJ9ybgU, reason: not valid java name */
    public boolean mo21371onKeyEventCJ9ybgU(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11, InterfaceC10559a interfaceC10559a) {
        if (KeyEventType.m25350equalsimpl0(KeyEvent_androidKt.m25358getTypeZmokQxo(keyEvent), KeyEventType.Companion.m25354getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.m21455isFromSoftKeyboardZmokQxo(keyEvent)) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo21371onKeyEventCJ9ybgU(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, interfaceC10570l, z10, z11, interfaceC10559a);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo21372onPreKeyEventMyFupTE(KeyEvent keyEvent, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
        if (super.mo21372onPreKeyEventMyFupTE(keyEvent, transformedTextFieldState, textFieldSelectionState, focusManager, softwareKeyboardController)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(InputDeviceCompat.SOURCE_DPAD) || device.isVirtual() || !KeyEventType.m25350equalsimpl0(KeyEvent_androidKt.m25358getTypeZmokQxo(keyEvent), KeyEventType.Companion.m25354getKeyDownCS__XNY()) || keyEvent.getSource() == 257) {
            return false;
        }
        if (TextFieldKeyEventHandler_androidKt.m21456isKeyCodeYhN2O0w(keyEvent, 19)) {
            return focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23923getUpdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m21456isKeyCodeYhN2O0w(keyEvent, 20)) {
            return focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23916getDowndhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m21456isKeyCodeYhN2O0w(keyEvent, 21)) {
            return focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23919getLeftdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m21456isKeyCodeYhN2O0w(keyEvent, 22)) {
            return focusManager.mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23922getRightdhqQ8s());
        }
        if (!TextFieldKeyEventHandler_androidKt.m21456isKeyCodeYhN2O0w(keyEvent, 23)) {
            return false;
        }
        softwareKeyboardController.show();
        return true;
    }
}
