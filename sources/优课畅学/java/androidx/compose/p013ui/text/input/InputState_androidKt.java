package androidx.compose.p013ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p013ui.text.TextRange;
import p113g8.AbstractC8661c0;

/* loaded from: classes2.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m26362getMinimpl(textFieldValue.m26612getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m26361getMaximpl(textFieldValue.m26612getSelectiond9O1mEE());
        extractedText.flags = !AbstractC8661c0.m13971R(textFieldValue.getText(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
