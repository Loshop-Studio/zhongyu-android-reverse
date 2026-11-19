package androidx.compose.foundation.text.input;

import androidx.compose.p014ui.text.TextRange;

/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m32964getMinimpl(textFieldCharSequence.m27947getSelectiond9O1mEE()), TextRange.m32963getMaximpl(textFieldCharSequence.m27947getSelectiond9O1mEE()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i10) {
        return textFieldCharSequence.subSequence(TextRange.m32963getMaximpl(textFieldCharSequence.m27947getSelectiond9O1mEE()), Math.min(TextRange.m32963getMaximpl(textFieldCharSequence.m27947getSelectiond9O1mEE()) + i10, textFieldCharSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i10) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m32964getMinimpl(textFieldCharSequence.m27947getSelectiond9O1mEE()) - i10), TextRange.m32964getMinimpl(textFieldCharSequence.m27947getSelectiond9O1mEE()));
    }
}
