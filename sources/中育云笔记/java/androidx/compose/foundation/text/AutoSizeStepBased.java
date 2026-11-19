package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.p014ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j10, long j11, long j12, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12);
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int iM32933getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m32933getOverflowgIe3tQ8();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33436getClipgIe3tQ8()) ? true : TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33440getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33439getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33438getMiddleEllipsisgIe3tQ8()) ? true : TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33437getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m33429toStringimpl(textLayoutResult.getLayoutInput().m32933getOverflowgIe3tQ8())) + " is not supported.");
    }

    private final boolean didOverflowBounds(TextLayoutResult textLayoutResult) {
        return textLayoutResult.getDidOverflowWidth() || textLayoutResult.getDidOverflowHeight();
    }

    private final boolean didOverflowByEllipsize(TextLayoutResult textLayoutResult) {
        int lineCount = textLayoutResult.getLineCount();
        if (lineCount == 0) {
            return false;
        }
        if (lineCount == 1) {
            return textLayoutResult.isLineEllipsized(0);
        }
        int iM32933getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m32933getOverflowgIe3tQ8();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33439getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33438getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m33427equalsimpl0(iM32933getOverflowgIe3tQ8, companion.m33437getEllipsisgIe3tQ8())) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) obj;
        return TextUnit.m33692equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m33692equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m33692equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo27759getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j10, AnnotatedString annotatedString) {
        float fMo27098toPxR2X_6o = textAutoSizeLayoutScope.mo27098toPxR2X_6o(this.stepSize);
        float fMo27098toPxR2X_6o2 = textAutoSizeLayoutScope.mo27098toPxR2X_6o(this.minFontSize);
        float fMo27098toPxR2X_6o3 = textAutoSizeLayoutScope.mo27098toPxR2X_6o(this.maxFontSize);
        float f10 = 2;
        float f11 = (fMo27098toPxR2X_6o2 + fMo27098toPxR2X_6o3) / f10;
        float f12 = fMo27098toPxR2X_6o2;
        float f13 = fMo27098toPxR2X_6o3;
        while (f13 - f12 >= fMo27098toPxR2X_6o) {
            if (didOverflow(textAutoSizeLayoutScope.mo28190performLayout5ZSfY2I(j10, annotatedString, textAutoSizeLayoutScope.mo27102toSpkPz2Gy4(f11)))) {
                f13 = f11;
            } else {
                f12 = f11;
            }
            f11 = (f12 + f13) / f10;
        }
        float fFloor = fMo27098toPxR2X_6o2 + (((float) Math.floor((f12 - fMo27098toPxR2X_6o2) / fMo27098toPxR2X_6o)) * fMo27098toPxR2X_6o);
        float f14 = fMo27098toPxR2X_6o + fFloor;
        if (f14 <= fMo27098toPxR2X_6o3 && !didOverflow(textAutoSizeLayoutScope.mo28190performLayout5ZSfY2I(j10, annotatedString, textAutoSizeLayoutScope.mo27102toSpkPz2Gy4(f14)))) {
            fFloor = f14;
        }
        return textAutoSizeLayoutScope.mo27102toSpkPz2Gy4(fFloor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.m33696hashCodeimpl(this.minFontSize) * 31) + TextUnit.m33696hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m33696hashCodeimpl(this.stepSize);
    }

    private AutoSizeStepBased(long j10, long j11, long j12) {
        this.minFontSize = j10;
        this.maxFontSize = j11;
        this.stepSize = j12;
        TextUnit.Companion companion = TextUnit.Companion;
        if (TextUnit.m33692equalsimpl0(j10, companion.m33706getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m33692equalsimpl0(j11, companion.m33706getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m33692equalsimpl0(j12, companion.m33706getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(this.minFontSize), TextUnit.m33694getTypeUIouoOA(j11))) {
            long j13 = this.minFontSize;
            TextUnitKt.m33709checkArithmeticNB67dxo(j13, j11);
            if (Float.compare(TextUnit.m33695getValueimpl(j13), TextUnit.m33695getValueimpl(j11)) > 0) {
                this.minFontSize = j11;
            }
        }
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j12), TextUnitType.Companion.m33728getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m33709checkArithmeticNB67dxo(j12, sp);
            if (Float.compare(TextUnit.m33695getValueimpl(j12), TextUnit.m33695getValueimpl(sp)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m33695getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m33695getValueimpl(j11) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
