package androidx.compose.foundation.text.input;

import androidx.compose.p013ui.text.TextRange;

/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m26362getMinimpl(textFieldCharSequence.m21345getSelectiond9O1mEE()), TextRange.m26361getMaximpl(textFieldCharSequence.m21345getSelectiond9O1mEE()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i10) {
        return textFieldCharSequence.subSequence(TextRange.m26361getMaximpl(textFieldCharSequence.m21345getSelectiond9O1mEE()), Math.min(TextRange.m26361getMaximpl(textFieldCharSequence.m21345getSelectiond9O1mEE()) + i10, textFieldCharSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i10) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m26362getMinimpl(textFieldCharSequence.m21345getSelectiond9O1mEE()) - i10), TextRange.m26362getMinimpl(textFieldCharSequence.m21345getSelectiond9O1mEE()));
    }
}
