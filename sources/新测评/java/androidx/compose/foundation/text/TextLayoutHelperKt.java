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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ar\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00022\u0006\u0010\u001c\u001a\u00020\fH\u0000\u001a(\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, m13558d2 = {"canReuse", "", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "maxLines", "", "softWrap", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Z", "getLineHeight", "", TypedValues.CycleType.S_WAVE_OFFSET, "isPositionInsideSelection", RequestParameters.POSITION, "Landroidx/compose/ui/geometry/Offset;", "selectionRange", "Landroidx/compose/ui/text/TextRange;", "isPositionInsideSelection-uaM50fQ", "(Landroidx/compose/ui/text/TextLayoutResult;JLandroidx/compose/ui/text/TextRange;)Z", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutHelperKt {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m18117canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z9, int i11, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j10) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !Intrinsics.areEqual(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !Intrinsics.areEqual(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i10 || layoutInput.getSoftWrap() != z9 || !TextOverflow.m23487equalsimpl0(layoutInput.getOverflow(), i11) || !Intrinsics.areEqual(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !Intrinsics.areEqual(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m23516getMinWidthimpl(j10) != Constraints.m23516getMinWidthimpl(layoutInput.getConstraints())) {
            return false;
        }
        if (z9 || TextOverflow.m23487equalsimpl0(i11, TextOverflow.INSTANCE.m23497getEllipsisgIe3tQ8())) {
            return Constraints.m23514getMaxWidthimpl(j10) == Constraints.m23514getMaxWidthimpl(layoutInput.getConstraints()) && Constraints.m23513getMaxHeightimpl(j10) == Constraints.m23513getMaxHeightimpl(layoutInput.getConstraints());
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
    public static final boolean m18118isPositionInsideSelectionuaM50fQ(TextLayoutResult textLayoutResult, long j10, TextRange textRange) {
        if (textRange == null || TextRange.m23021getCollapsedimpl(textRange.getPackedValue())) {
            return false;
        }
        int iM22997getOffsetForPositionk4lQ0M = textLayoutResult.m22997getOffsetForPositionk4lQ0M(j10);
        return m1078xf7e51108(textRange, textLayoutResult, j10, iM22997getOffsetForPositionk4lQ0M) || m1078xf7e51108(textRange, textLayoutResult, j10, iM22997getOffsetForPositionk4lQ0M - 1);
    }

    /* renamed from: isPositionInsideSelection_uaM50fQ$isOffsetSelectedAndContainsPosition */
    private static final boolean m1078xf7e51108(TextRange textRange, TextLayoutResult textLayoutResult, long j10, int i10) {
        return TextRange.m23018containsimpl(textRange.getPackedValue(), i10) && textLayoutResult.getBoundingBox(i10).m20761containsk4lQ0M(j10);
    }
}
