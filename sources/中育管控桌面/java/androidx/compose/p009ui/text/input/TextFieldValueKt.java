package androidx.compose.p009ui.text.input;

import androidx.compose.p009ui.text.AnnotatedString;
import androidx.compose.p009ui.text.TextRange;
import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m7880d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getText().m15779subSequence5zctL8(textFieldValue.getSelection());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i6) {
        return textFieldValue.getText().subSequence(TextRange.m15947getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m15947getMaximpl(textFieldValue.getSelection()) + i6, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i6) {
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m15948getMinimpl(textFieldValue.getSelection()) - i6), TextRange.m15948getMinimpl(textFieldValue.getSelection()));
    }
}
