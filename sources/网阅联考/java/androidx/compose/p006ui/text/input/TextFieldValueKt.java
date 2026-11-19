package androidx.compose.p006ui.text.input;

import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.TextRange;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m5175d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getText().m10957subSequence5zctL8(textFieldValue.getSelection());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue, int i4) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getText().subSequence(TextRange.m11074getMaximpl(textFieldValue.getSelection()), Math.min(TextRange.m11074getMaximpl(textFieldValue.getSelection()) + i4, textFieldValue.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue, int i4) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getText().subSequence(Math.max(0, TextRange.m11075getMinimpl(textFieldValue.getSelection()) - i4), TextRange.m11075getMinimpl(textFieldValue.getSelection()));
    }
}
