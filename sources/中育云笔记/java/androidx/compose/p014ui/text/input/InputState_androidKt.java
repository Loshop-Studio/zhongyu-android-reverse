package androidx.compose.p014ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p014ui.text.TextRange;
import p310qd.AbstractC10793c0;

/* loaded from: classes2.dex */
public final class InputState_androidKt {
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m32964getMinimpl(textFieldValue.m33214getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m32963getMaximpl(textFieldValue.m33214getSelectiond9O1mEE());
        extractedText.flags = !AbstractC10793c0.m23106T(textFieldValue.getText(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
