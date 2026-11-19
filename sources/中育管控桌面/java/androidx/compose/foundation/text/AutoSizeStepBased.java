package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p009ui.text.AnnotatedString;
import androidx.compose.p009ui.text.TextLayoutResult;
import androidx.compose.p009ui.text.style.TextOverflow;
import androidx.compose.p009ui.unit.TextUnit;
import androidx.compose.p009ui.unit.TextUnitKt;
import androidx.compose.p009ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\t*\u00020\u000fH\u0002J&\u0010\u0012\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u0003X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m7880d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "minFontSize", "Landroidx/compose/ui/unit/TextUnit;", "maxFontSize", "stepSize", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "didOverflow", "Landroidx/compose/ui/text/TextLayoutResult;", "didOverflowBounds", "didOverflowByEllipsize", "getFontSize", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "foundation_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTextAutoSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,256:1\n182#2,2:257\n182#2,2:259\n*S KotlinDebug\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n*L\n139#1:257,2\n144#1:259,2\n*E\n"})
/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j6, j7, j8);
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        if (TextOverflow.m16410equalsimpl0(overflow, companion.m16419getClipgIe3tQ8()) ? true : TextOverflow.m16410equalsimpl0(overflow, companion.m16423getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m16410equalsimpl0(overflow, companion.m16422getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m16410equalsimpl0(overflow, companion.m16421getMiddleEllipsisgIe3tQ8()) ? true : TextOverflow.m16410equalsimpl0(overflow, companion.m16420getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m16412toStringimpl(textLayoutResult.getLayoutInput().getOverflow())) + " is not supported.");
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
        if (TextOverflow.m16410equalsimpl0(overflow, companion.m16422getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m16410equalsimpl0(overflow, companion.m16421getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m16410equalsimpl0(overflow, companion.m16420getEllipsisgIe3tQ8())) {
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
        return TextUnit.m16675equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m16675equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m16675equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo10901getFontSizeCi0_558(TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j6, AnnotatedString annotatedString) {
        float fMo10254toPxR2X_6o = textAutoSizeLayoutScope.mo10254toPxR2X_6o(this.stepSize);
        float fMo10254toPxR2X_6o2 = textAutoSizeLayoutScope.mo10254toPxR2X_6o(this.minFontSize);
        float fMo10254toPxR2X_6o3 = textAutoSizeLayoutScope.mo10254toPxR2X_6o(this.maxFontSize);
        float f6 = 2;
        float f7 = (fMo10254toPxR2X_6o2 + fMo10254toPxR2X_6o3) / f6;
        float f8 = fMo10254toPxR2X_6o2;
        float f9 = fMo10254toPxR2X_6o3;
        while (f9 - f8 >= fMo10254toPxR2X_6o) {
            if (didOverflow(textAutoSizeLayoutScope.mo11289performLayout5ZSfY2I(j6, annotatedString, textAutoSizeLayoutScope.mo10258toSpkPz2Gy4(f7)))) {
                f9 = f7;
            } else {
                f8 = f7;
            }
            f7 = (f8 + f9) / f6;
        }
        float fFloor = fMo10254toPxR2X_6o2 + (((float) Math.floor((f8 - fMo10254toPxR2X_6o2) / fMo10254toPxR2X_6o)) * fMo10254toPxR2X_6o);
        float f10 = fMo10254toPxR2X_6o + fFloor;
        if (f10 <= fMo10254toPxR2X_6o3 && !didOverflow(textAutoSizeLayoutScope.mo11289performLayout5ZSfY2I(j6, annotatedString, textAutoSizeLayoutScope.mo10258toSpkPz2Gy4(f10)))) {
            fFloor = f10;
        }
        return textAutoSizeLayoutScope.mo10258toSpkPz2Gy4(fFloor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return (((TextUnit.m16679hashCodeimpl(this.minFontSize) * 31) + TextUnit.m16679hashCodeimpl(this.maxFontSize)) * 31) + TextUnit.m16679hashCodeimpl(this.stepSize);
    }

    private AutoSizeStepBased(long j6, long j7, long j8) {
        this.minFontSize = j6;
        this.maxFontSize = j7;
        this.stepSize = j8;
        TextUnit.Companion companion = TextUnit.INSTANCE;
        if (TextUnit.m16675equalsimpl0(j6, companion.m16689getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m16675equalsimpl0(j7, companion.m16689getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m16675equalsimpl0(j8, companion.m16689getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m16706equalsimpl0(TextUnit.m16677getTypeUIouoOA(this.minFontSize), TextUnit.m16677getTypeUIouoOA(j7))) {
            long j9 = this.minFontSize;
            TextUnitKt.m16692checkArithmeticNB67dxo(j9, j7);
            if (Float.compare(TextUnit.m16678getValueimpl(j9), TextUnit.m16678getValueimpl(j7)) > 0) {
                this.minFontSize = j7;
            }
        }
        if (TextUnitType.m16706equalsimpl0(TextUnit.m16677getTypeUIouoOA(j8), TextUnitType.INSTANCE.m16711getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m16692checkArithmeticNB67dxo(j8, sp);
            if (Float.compare(TextUnit.m16678getValueimpl(j8), TextUnit.m16678getValueimpl(sp)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m16678getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m16678getValueimpl(j7) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
