package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j10, long j11, long j12, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12);
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int iM26331getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m26331getOverflowgIe3tQ8();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26834getClipgIe3tQ8()) ? true : TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26838getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26837getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26836getMiddleEllipsisgIe3tQ8()) ? true : TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26835getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m26827toStringimpl(textLayoutResult.getLayoutInput().m26331getOverflowgIe3tQ8())) + " is not supported.");
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
        int iM26331getOverflowgIe3tQ8 = textLayoutResult.getLayoutInput().m26331getOverflowgIe3tQ8();
        TextOverflow.Companion companion = TextOverflow.Companion;
        if (TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26837getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26836getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m26825equalsimpl0(iM26331getOverflowgIe3tQ8, companion.m26835getEllipsisgIe3tQ8())) {
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
        return TextUnit.m27090equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m27090equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m27090equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo21157getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j10, AnnotatedString annotatedString) {
        float fMo20496toPxR2X_6o = textAutoSizeLayoutScope.mo20496toPxR2X_6o(this.stepSize);
        float fMo20496toPxR2X_6o2 = textAutoSizeLayoutScope.mo20496toPxR2X_6o(this.minFontSize);
        float fMo20496toPxR2X_6o3 = textAutoSizeLayoutScope.mo20496toPxR2X_6o(this.maxFontSize);
        float f10 = 2;
        float f11 = (fMo20496toPxR2X_6o2 + fMo20496toPxR2X_6o3) / f10;
        float f12 = fMo20496toPxR2X_6o2;
        float f13 = fMo20496toPxR2X_6o3;
        while (f13 - f12 >= fMo20496toPxR2X_6o) {
            if (didOverflow(textAutoSizeLayoutScope.mo21588performLayout5ZSfY2I(j10, annotatedString, textAutoSizeLayoutScope.mo20500toSpkPz2Gy4(f11)))) {
                f13 = f11;
            } else {
                f12 = f11;
            }
            f11 = (f12 + f13) / f10;
        }
        float fFloor = fMo20496toPxR2X_6o2 + (((float) Math.floor((f12 - fMo20496toPxR2X_6o2) / fMo20496toPxR2X_6o)) * fMo20496toPxR2X_6o);
        float f14 = fMo20496toPxR2X_6o + fFloor;
        if (f14 <= fMo20496toPxR2X_6o3 && !didOverflow(textAutoSizeLayoutScope.mo21588performLayout5ZSfY2I(j10, annotatedString, textAutoSizeLayoutScope.mo20500toSpkPz2Gy4(f14)))) {
            fFloor = f14;
        }
        return textAutoSizeLayoutScope.mo20500toSpkPz2Gy4(fFloor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.m27094hashCodeimpl(this.minFontSize) * 31) + TextUnit.m27094hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m27094hashCodeimpl(this.stepSize);
    }

    private AutoSizeStepBased(long j10, long j11, long j12) {
        this.minFontSize = j10;
        this.maxFontSize = j11;
        this.stepSize = j12;
        TextUnit.Companion companion = TextUnit.Companion;
        if (TextUnit.m27090equalsimpl0(j10, companion.m27104getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m27090equalsimpl0(j11, companion.m27104getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m27090equalsimpl0(j12, companion.m27104getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(this.minFontSize), TextUnit.m27092getTypeUIouoOA(j11))) {
            long j13 = this.minFontSize;
            TextUnitKt.m27107checkArithmeticNB67dxo(j13, j11);
            if (Float.compare(TextUnit.m27093getValueimpl(j13), TextUnit.m27093getValueimpl(j11)) > 0) {
                this.minFontSize = j11;
            }
        }
        if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j12), TextUnitType.Companion.m27126getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m27107checkArithmeticNB67dxo(j12, sp);
            if (Float.compare(TextUnit.m27093getValueimpl(j12), TextUnit.m27093getValueimpl(sp)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m27093getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m27093getValueimpl(j11) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
