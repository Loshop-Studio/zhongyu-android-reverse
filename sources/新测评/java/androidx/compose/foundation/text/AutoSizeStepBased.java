package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\t*\u00020\u000fH\u0002J&\u0010\u0012\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m13558d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "maxFontSize", "stepSize", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "didOverflow", "Landroidx/compose/ui/text/TextLayoutResult;", "didOverflowBounds", "didOverflowByEllipsize", "getFontSize", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nTextAutoSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,256:1\n182#2,2:257\n182#2,2:259\n*S KotlinDebug\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n*L\n139#1:257,2\n144#1:259,2\n*E\n"})
/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        if (TextOverflow.m23487equalsimpl0(overflow, companion.m23496getClipgIe3tQ8()) ? true : TextOverflow.m23487equalsimpl0(overflow, companion.m23500getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m23487equalsimpl0(overflow, companion.m23499getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m23487equalsimpl0(overflow, companion.m23498getMiddleEllipsisgIe3tQ8()) ? true : TextOverflow.m23487equalsimpl0(overflow, companion.m23497getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m23489toStringimpl(textLayoutResult.getLayoutInput().getOverflow())) + " is not supported.");
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
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        if (TextOverflow.m23487equalsimpl0(overflow, companion.m23499getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m23487equalsimpl0(overflow, companion.m23498getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m23487equalsimpl0(overflow, companion.m23497getEllipsisgIe3tQ8())) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || !(other instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) other;
        return TextUnit.m23752equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m23752equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m23752equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo17978getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j10, AnnotatedString annotatedString) {
        float fMo17331toPxR2X_6o = textAutoSizeLayoutScope.mo17331toPxR2X_6o(this.stepSize);
        float fMo17331toPxR2X_6o2 = textAutoSizeLayoutScope.mo17331toPxR2X_6o(this.minFontSize);
        float fMo17331toPxR2X_6o3 = textAutoSizeLayoutScope.mo17331toPxR2X_6o(this.maxFontSize);
        float f10 = 2;
        float f11 = (fMo17331toPxR2X_6o2 + fMo17331toPxR2X_6o3) / f10;
        float f12 = fMo17331toPxR2X_6o2;
        float f13 = fMo17331toPxR2X_6o3;
        while (f13 - f12 >= fMo17331toPxR2X_6o) {
            if (didOverflow(textAutoSizeLayoutScope.mo18366performLayout5ZSfY2I(j10, annotatedString, textAutoSizeLayoutScope.mo17335toSpkPz2Gy4(f11)))) {
                f13 = f11;
            } else {
                f12 = f11;
            }
            f11 = (f12 + f13) / f10;
        }
        float fFloor = fMo17331toPxR2X_6o2 + (((float) Math.floor((f12 - fMo17331toPxR2X_6o2) / fMo17331toPxR2X_6o)) * fMo17331toPxR2X_6o);
        float f14 = fMo17331toPxR2X_6o + fFloor;
        if (f14 <= fMo17331toPxR2X_6o3 && !didOverflow(textAutoSizeLayoutScope.mo18366performLayout5ZSfY2I(j10, annotatedString, textAutoSizeLayoutScope.mo17335toSpkPz2Gy4(f14)))) {
            fFloor = f14;
        }
        return textAutoSizeLayoutScope.mo17335toSpkPz2Gy4(fFloor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.m23756hashCodeimpl(this.minFontSize) * 31) + TextUnit.m23756hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m23756hashCodeimpl(this.stepSize);
    }

    private AutoSizeStepBased(long j10, long j11, long j12) {
        this.minFontSize = j10;
        this.maxFontSize = j11;
        this.stepSize = j12;
        TextUnit.Companion companion = TextUnit.INSTANCE;
        if (TextUnit.m23752equalsimpl0(j10, companion.m23766getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m23752equalsimpl0(j11, companion.m23766getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m23752equalsimpl0(j12, companion.m23766getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(this.minFontSize), TextUnit.m23754getTypeUIouoOA(j11))) {
            long j13 = this.minFontSize;
            TextUnitKt.m23769checkArithmeticNB67dxo(j13, j11);
            if (Float.compare(TextUnit.m23755getValueimpl(j13), TextUnit.m23755getValueimpl(j11)) > 0) {
                this.minFontSize = j11;
            }
        }
        if (TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(j12), TextUnitType.INSTANCE.m23788getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m23769checkArithmeticNB67dxo(j12, sp);
            if (Float.compare(TextUnit.m23755getValueimpl(j12), TextUnit.m23755getValueimpl(sp)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m23755getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m23755getValueimpl(j11) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
