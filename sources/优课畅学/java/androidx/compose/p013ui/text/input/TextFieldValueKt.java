package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;

/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m26193subSequence5zctL8(textFieldValue.m26612getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m26361getMaximpl(textFieldValue.m26612getSelectiond9O1mEE()), Math.min(TextRange.m26361getMaximpl(textFieldValue.m26612getSelectiond9O1mEE()) + i10, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m26362getMinimpl(textFieldValue.m26612getSelectiond9O1mEE()) - i10), TextRange.m26362getMinimpl(textFieldValue.m26612getSelectiond9O1mEE()));
    }
}
