package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.text.TextLayoutResult;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

@InterfaceC8721a
/* loaded from: classes2.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(Rect rect) {
    }

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    default void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, InterfaceC10570l interfaceC10570l, Rect rect, Rect rect2) {
    }
}
