package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.input.TextFieldValue;
import p310qd.AbstractC10793c0;

/* loaded from: classes.dex */
public final class RecordingInputConnection_androidKt {
    public static final boolean DEBUG = false;
    private static final String DEBUG_CLASS = "RecordingInputConnection";
    public static final String TAG = "RecordingIC";

    /* JADX INFO: Access modifiers changed from: private */
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
