package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m5110d2 = {"DEBUG", "", "DEBUG_CLASS", "", "TAG", "toExtractedText", "Landroid/view/inputmethod/ExtractedText;", "Landroidx/compose/ui/text/input/TextFieldValue;", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class RecordingInputConnection_androidKt {
    public static final boolean DEBUG = false;

    @NotNull
    private static final String DEBUG_CLASS = "RecordingInputConnection";

    @NotNull
    public static final String TAG = "RecordingIC";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m12768getMinimpl(textFieldValue.getSelection());
        extractedText.selectionEnd = TextRange.m12767getMaximpl(textFieldValue.getSelection());
        extractedText.flags = !AbstractC5855p.m5373G(textFieldValue.getText(), '\n') ? 1 : 0;
        return extractedText;
    }
}
