package androidx.compose.foundation.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.MultiParagraph;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.TextLayoutInput;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m27918canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !AbstractC9979u.m20289b(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !AbstractC9979u.m20289b(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i10 || layoutInput.getSoftWrap() != z10 || !TextOverflow.m33427equalsimpl0(layoutInput.m32933getOverflowgIe3tQ8(), i11) || !AbstractC9979u.m20289b(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !AbstractC9979u.m20289b(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m33456getMinWidthimpl(j10) != Constraints.m33456getMinWidthimpl(layoutInput.m32932getConstraintsmsEJaDk())) {
            return false;
        }
        if (z10 || TextOverflow.m33427equalsimpl0(i11, TextOverflow.Companion.m33437getEllipsisgIe3tQ8())) {
            return Constraints.m33454getMaxWidthimpl(j10) == Constraints.m33454getMaxWidthimpl(layoutInput.m32932getConstraintsmsEJaDk()) && Constraints.m33453getMaxHeightimpl(j10) == Constraints.m33453getMaxHeightimpl(layoutInput.m32932getConstraintsmsEJaDk());
        }
        return true;
    }

    public static final float getLineHeight(TextLayoutResult textLayoutResult, int i10) {
        if (i10 < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(i10), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i10 > MultiParagraph.getLineEnd$default(textLayoutResult.getMultiParagraph(), iMin, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().getLineHeight(iMin);
    }

    /* renamed from: isPositionInsideSelection-uaM50fQ, reason: not valid java name */
    public static final boolean m27919isPositionInsideSelectionuaM50fQ(TextLayoutResult textLayoutResult, long j10, TextRange textRange) {
        if (textRange == null || TextRange.m32960getCollapsedimpl(textRange.m32970unboximpl())) {
            return false;
        }
        int iM32936getOffsetForPositionk4lQ0M = textLayoutResult.m32936getOffsetForPositionk4lQ0M(j10);
        return m928xf7e51108(textRange, textLayoutResult, j10, iM32936getOffsetForPositionk4lQ0M) || m928xf7e51108(textRange, textLayoutResult, j10, iM32936getOffsetForPositionk4lQ0M - 1);
    }

    /* renamed from: isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition */
    private static final boolean m928xf7e51108(TextRange textRange, TextLayoutResult textLayoutResult, long j10, int i10) {
        return TextRange.m32957containsimpl(textRange.m32970unboximpl(), i10) && textLayoutResult.getBoundingBox(i10).m30663containsk4lQ0M(j10);
    }
}
