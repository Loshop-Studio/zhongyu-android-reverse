package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m13558d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getText().m22856subSequence5zctL8(textFieldValue.getSelection());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getText().subSequence(TextRange.m23024getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m23024getMaximpl(textFieldValue.getSelection()) + i10, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m23025getMinimpl(textFieldValue.getSelection()) - i10), TextRange.m23025getMinimpl(textFieldValue.getSelection()));
    }
}
