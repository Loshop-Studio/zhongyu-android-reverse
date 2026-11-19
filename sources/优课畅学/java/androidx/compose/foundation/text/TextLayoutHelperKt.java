package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.MultiParagraph;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextLayoutInput;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m21316canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z10, int i11, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !AbstractC9133u.m16128b(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !AbstractC9133u.m16128b(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i10 || layoutInput.getSoftWrap() != z10 || !TextOverflow.m26825equalsimpl0(layoutInput.m26331getOverflowgIe3tQ8(), i11) || !AbstractC9133u.m16128b(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !AbstractC9133u.m16128b(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m26854getMinWidthimpl(j10) != Constraints.m26854getMinWidthimpl(layoutInput.m26330getConstraintsmsEJaDk())) {
            return false;
        }
        if (z10 || TextOverflow.m26825equalsimpl0(i11, TextOverflow.Companion.m26835getEllipsisgIe3tQ8())) {
            return Constraints.m26852getMaxWidthimpl(j10) == Constraints.m26852getMaxWidthimpl(layoutInput.m26330getConstraintsmsEJaDk()) && Constraints.m26851getMaxHeightimpl(j10) == Constraints.m26851getMaxHeightimpl(layoutInput.m26330getConstraintsmsEJaDk());
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
    public static final boolean m21317isPositionInsideSelectionuaM50fQ(TextLayoutResult textLayoutResult, long j10, TextRange textRange) {
        if (textRange == null || TextRange.m26358getCollapsedimpl(textRange.m26368unboximpl())) {
            return false;
        }
        int iM26334getOffsetForPositionk4lQ0M = textLayoutResult.m26334getOffsetForPositionk4lQ0M(j10);
        return m851xf7e51108(textRange, textLayoutResult, j10, iM26334getOffsetForPositionk4lQ0M) || m851xf7e51108(textRange, textLayoutResult, j10, iM26334getOffsetForPositionk4lQ0M - 1);
    }

    /* renamed from: isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition */
    private static final boolean m851xf7e51108(TextRange textRange, TextLayoutResult textLayoutResult, long j10, int i10) {
        return TextRange.m26355containsimpl(textRange.m26368unboximpl(), i10) && textLayoutResult.getBoundingBox(i10).m24061containsk4lQ0M(j10);
    }
}
