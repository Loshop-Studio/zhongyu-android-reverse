package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEventType;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.input.key.KeyInputModifierKt;
import androidx.compose.p011ui.input.key.Key_androidKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m5110d2 = {"interceptDPadAndMoveFocus", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "isKeyCode", "", "Landroidx/compose/ui/input/key/KeyEvent;", "keyCode", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt {
    @NotNull
    public static final Modifier interceptDPadAndMoveFocus(@NotNull Modifier modifier, @NotNull final LegacyTextFieldState legacyTextFieldState, @NotNull final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new InterfaceC6471c() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m7707invokeZmokQxo(((KeyEvent) obj).m11752unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m7707invokeZmokQxo(android.view.KeyEvent keyEvent) {
                InputDevice device = keyEvent.getDevice();
                boolean zMo10333moveFocus3ESFkO8 = false;
                if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m11756equalsimpl0(KeyEvent_androidKt.m11764getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m11760getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                    if (TextFieldFocusModifier_androidKt.m7706isKeyCodeYhN2O0w(keyEvent, 19)) {
                        zMo10333moveFocus3ESFkO8 = focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10329getUpdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m7706isKeyCodeYhN2O0w(keyEvent, 20)) {
                        zMo10333moveFocus3ESFkO8 = focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10322getDowndhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m7706isKeyCodeYhN2O0w(keyEvent, 21)) {
                        zMo10333moveFocus3ESFkO8 = focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10325getLeftdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m7706isKeyCodeYhN2O0w(keyEvent, 22)) {
                        zMo10333moveFocus3ESFkO8 = focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10328getRightdhqQ8s());
                    } else if (TextFieldFocusModifier_androidKt.m7706isKeyCodeYhN2O0w(keyEvent, 23)) {
                        SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                        if (keyboardController != null) {
                            keyboardController.show();
                        }
                        zMo10333moveFocus3ESFkO8 = true;
                    }
                }
                return Boolean.valueOf(zMo10333moveFocus3ESFkO8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m7706isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return Key_androidKt.m11770getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m11763getKeyZmokQxo(keyEvent)) == i;
    }
}
