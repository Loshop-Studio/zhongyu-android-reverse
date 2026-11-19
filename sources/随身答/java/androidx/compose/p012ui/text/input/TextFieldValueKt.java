package androidx.compose.p012ui.text.input;

import androidx.compose.p012ui.text.AnnotatedString;
import androidx.compose.p012ui.text.TextRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m13413d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        return textFieldValue.getText().m23289subSequence5zctL8(textFieldValue.getSelection());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i9) {
        return textFieldValue.getText().subSequence(TextRange.m23457getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m23457getMaximpl(textFieldValue.getSelection()) + i9, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i9) {
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m23458getMinimpl(textFieldValue.getSelection()) - i9), TextRange.m23458getMinimpl(textFieldValue.getSelection()));
    }
}
