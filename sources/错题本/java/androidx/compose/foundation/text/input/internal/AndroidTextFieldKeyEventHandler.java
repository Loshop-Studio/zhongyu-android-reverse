package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.input.key.KeyEventType;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;", "clipboardKeyCommandsHandler", "editable", "singleLine", "Lkotlin/Function0;", "Ld6/s;", "onSubmit", "onKeyEvent-CJ9ybgU", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lr6/c;ZZLr6/a;)Z", "onKeyEvent", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onKeyEvent-CJ9ybgU, reason: not valid java name */
    public boolean mo7777onKeyEventCJ9ybgU(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextLayoutState textLayoutState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull InterfaceC6471c clipboardKeyCommandsHandler, boolean editable, boolean singleLine, @NotNull InterfaceC6469a onSubmit) {
        if (KeyEventType.m11756equalsimpl0(KeyEvent_androidKt.m11764getTypeZmokQxo(event), KeyEventType.INSTANCE.m11760getKeyDownCS__XNY()) && event.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.m7861isFromSoftKeyboardZmokQxo(event)) {
            textFieldSelectionState.setInTouchMode(false);
        }
        return super.mo7777onKeyEventCJ9ybgU(event, textFieldState, textLayoutState, textFieldSelectionState, clipboardKeyCommandsHandler, editable, singleLine, onSubmit);
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo7778onPreKeyEventMyFupTE(@NotNull KeyEvent event, @NotNull TransformedTextFieldState textFieldState, @NotNull TextFieldSelectionState textFieldSelectionState, @NotNull FocusManager focusManager, @NotNull SoftwareKeyboardController keyboardController) {
        if (super.mo7778onPreKeyEventMyFupTE(event, textFieldState, textFieldSelectionState, focusManager, keyboardController)) {
            return true;
        }
        InputDevice device = event.getDevice();
        if (device == null || !device.supportsSource(InputDeviceCompat.SOURCE_DPAD) || device.isVirtual() || !KeyEventType.m11756equalsimpl0(KeyEvent_androidKt.m11764getTypeZmokQxo(event), KeyEventType.INSTANCE.m11760getKeyDownCS__XNY()) || event.getSource() == 257) {
            return false;
        }
        if (TextFieldKeyEventHandler_androidKt.m7862isKeyCodeYhN2O0w(event, 19)) {
            return focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10329getUpdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m7862isKeyCodeYhN2O0w(event, 20)) {
            return focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10322getDowndhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m7862isKeyCodeYhN2O0w(event, 21)) {
            return focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10325getLeftdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m7862isKeyCodeYhN2O0w(event, 22)) {
            return focusManager.mo10333moveFocus3ESFkO8(FocusDirection.INSTANCE.m10328getRightdhqQ8s());
        }
        if (!TextFieldKeyEventHandler_androidKt.m7862isKeyCodeYhN2O0w(event, 23)) {
            return false;
        }
        keyboardController.show();
        return true;
    }
}
