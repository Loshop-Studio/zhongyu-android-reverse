package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextRange;

/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getAnnotatedString().m32795subSequence5zctL8(textFieldValue.m33214getSelectiond9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE()), Math.min(TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE()) + i10, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m32964getMinimpl(textFieldValue.m33214getSelectiond9O1mEE()) - i10), TextRange.m32964getMinimpl(textFieldValue.m33214getSelectiond9O1mEE()));
    }
}
