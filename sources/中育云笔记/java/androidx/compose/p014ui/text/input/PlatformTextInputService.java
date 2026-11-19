package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.text.TextLayoutResult;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes2.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(Rect rect) {
    }

    void showSoftwareKeyboard();

    default void startInput() {
    }

    void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void stopInput();

    void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2);

    default void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, InterfaceC9540l interfaceC9540l, Rect rect, Rect rect2) {
    }
}
