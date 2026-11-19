package androidx.compose.foundation.text.input;

import androidx.compose.p013ui.text.TextRange;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000*\u0018\b\u0000\u0010\u0007\"\b\u0012\u0004\u0012\u00020\t0\b2\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m13558d2 = {"getSelectedText", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "PlacedAnnotation", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class TextFieldCharSequenceKt {
    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m23025getMinimpl(textFieldCharSequence.getSelection()), TextRange.m23024getMaximpl(textFieldCharSequence.getSelection()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i10) {
        return textFieldCharSequence.subSequence(TextRange.m23024getMaximpl(textFieldCharSequence.getSelection()), Math.min(TextRange.m23024getMaximpl(textFieldCharSequence.getSelection()) + i10, textFieldCharSequence.length()));
    }

    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i10) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m23025getMinimpl(textFieldCharSequence.getSelection()) - i10), TextRange.m23025getMinimpl(textFieldCharSequence.getSelection()));
    }
}
