package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.input.OffsetMapping;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextPreparedSelection extends BaseTextPreparedSelection<TextPreparedSelection> {
    public static final int $stable = 0;

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j10, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, AbstractC9972n abstractC9972n) {
        this(annotatedString, j10, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j10, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, int i10, AbstractC9972n abstractC9972n) {
        this(annotatedString, j10, (i10 & 4) != 0 ? null : textLayoutResult, (i10 & 8) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i10 & 16) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState, null);
    }

    private TextPreparedSelection(AnnotatedString annotatedString, long j10, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        super(annotatedString, j10, textLayoutResult, offsetMapping, textPreparedSelectionState, null);
    }
}
