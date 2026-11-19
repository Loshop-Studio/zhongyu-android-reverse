package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.TextAutoSizeLayoutScope;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ&\u0010\u0015\u001a\u00020\u0002*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/foundation/text/AutoSizeStepBased;", "Landroidx/compose/foundation/text/TextAutoSize;", "Landroidx/compose/ui/unit/TextUnit;", "minFontSize", "maxFontSize", "stepSize", "<init>", "(JJJLkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/text/TextLayoutResult;", "", "didOverflow", "(Landroidx/compose/ui/text/TextLayoutResult;)Z", "didOverflowBounds", "didOverflowByEllipsize", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/AnnotatedString;", "text", "getFontSize-Ci0_558", "(Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;JLandroidx/compose/ui/text/AnnotatedString;)J", "getFontSize", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextAutoSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,256:1\n182#2,2:257\n182#2,2:259\n*S KotlinDebug\n*F\n+ 1 TextAutoSize.kt\nandroidx/compose/foundation/text/AutoSizeStepBased\n*L\n139#1:257,2\n144#1:259,2\n*E\n"})
/* loaded from: classes.dex */
final class AutoSizeStepBased implements TextAutoSize {
    private final long maxFontSize;
    private long minFontSize;
    private final long stepSize;

    public /* synthetic */ AutoSizeStepBased(long j7, long j8, long j9, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9);
    }

    private final boolean didOverflow(TextLayoutResult textLayoutResult) {
        int overflow = textLayoutResult.getLayoutInput().getOverflow();
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        if (TextOverflow.m13231equalsimpl0(overflow, companion.m13240getClipgIe3tQ8()) ? true : TextOverflow.m13231equalsimpl0(overflow, companion.m13244getVisiblegIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m13231equalsimpl0(overflow, companion.m13243getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m13231equalsimpl0(overflow, companion.m13242getMiddleEllipsisgIe3tQ8()) ? true : TextOverflow.m13231equalsimpl0(overflow, companion.m13241getEllipsisgIe3tQ8())) {
            return didOverflowByEllipsize(textLayoutResult);
        }
        throw new IllegalArgumentException("TextOverflow type " + ((Object) TextOverflow.m13233toStringimpl(textLayoutResult.getLayoutInput().getOverflow())) + " is not supported.");
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
        if (TextOverflow.m13231equalsimpl0(overflow, companion.m13243getStartEllipsisgIe3tQ8()) ? true : TextOverflow.m13231equalsimpl0(overflow, companion.m13242getMiddleEllipsisgIe3tQ8())) {
            return didOverflowBounds(textLayoutResult);
        }
        if (TextOverflow.m13231equalsimpl0(overflow, companion.m13241getEllipsisgIe3tQ8())) {
            return textLayoutResult.isLineEllipsized(textLayoutResult.getLineCount() - 1);
        }
        return false;
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || !(other instanceof AutoSizeStepBased)) {
            return false;
        }
        AutoSizeStepBased autoSizeStepBased = (AutoSizeStepBased) other;
        return TextUnit.m13496equalsimpl0(autoSizeStepBased.minFontSize, this.minFontSize) && TextUnit.m13496equalsimpl0(autoSizeStepBased.maxFontSize, this.maxFontSize) && TextUnit.m13496equalsimpl0(autoSizeStepBased.stepSize, this.stepSize);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    /* renamed from: getFontSize-Ci0_558, reason: not valid java name */
    public long mo7563getFontSizeCi0_558(@NotNull TextAutoSizeLayoutScope textAutoSizeLayoutScope, long j7, @NotNull AnnotatedString annotatedString) {
        float fMo6902toPxR2X_6o = textAutoSizeLayoutScope.mo6902toPxR2X_6o(this.stepSize);
        float fMo6902toPxR2X_6o2 = textAutoSizeLayoutScope.mo6902toPxR2X_6o(this.minFontSize);
        float fMo6902toPxR2X_6o3 = textAutoSizeLayoutScope.mo6902toPxR2X_6o(this.maxFontSize);
        float f = 2;
        float f7 = (fMo6902toPxR2X_6o2 + fMo6902toPxR2X_6o3) / f;
        float f8 = fMo6902toPxR2X_6o2;
        float f9 = fMo6902toPxR2X_6o3;
        while (f9 - f8 >= fMo6902toPxR2X_6o) {
            if (didOverflow(textAutoSizeLayoutScope.mo7994performLayout5ZSfY2I(j7, annotatedString, textAutoSizeLayoutScope.mo6906toSpkPz2Gy4(f7)))) {
                f9 = f7;
            } else {
                f8 = f7;
            }
            f7 = (f8 + f9) / f;
        }
        float fFloor = fMo6902toPxR2X_6o2 + (((float) Math.floor((f8 - fMo6902toPxR2X_6o2) / fMo6902toPxR2X_6o)) * fMo6902toPxR2X_6o);
        float f10 = fMo6902toPxR2X_6o + fFloor;
        if (f10 <= fMo6902toPxR2X_6o3 && !didOverflow(textAutoSizeLayoutScope.mo7994performLayout5ZSfY2I(j7, annotatedString, textAutoSizeLayoutScope.mo6906toSpkPz2Gy4(f10)))) {
            fFloor = f10;
        }
        return textAutoSizeLayoutScope.mo6906toSpkPz2Gy4(fFloor);
    }

    @Override // androidx.compose.foundation.text.TextAutoSize
    public int hashCode() {
        return TextUnit.m13500hashCodeimpl(this.stepSize) + ((TextUnit.m13500hashCodeimpl(this.maxFontSize) + (TextUnit.m13500hashCodeimpl(this.minFontSize) * 31)) * 31);
    }

    private AutoSizeStepBased(long j7, long j8, long j9) {
        this.minFontSize = j7;
        this.maxFontSize = j8;
        this.stepSize = j9;
        TextUnit.Companion companion = TextUnit.INSTANCE;
        if (TextUnit.m13496equalsimpl0(j7, companion.m13510getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
        }
        if (TextUnit.m13496equalsimpl0(j8, companion.m13510getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
        }
        if (TextUnit.m13496equalsimpl0(j9, companion.m13510getUnspecifiedXSAIIZE())) {
            throw new IllegalArgumentException("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
        }
        if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(this.minFontSize), TextUnit.m13498getTypeUIouoOA(j8))) {
            long j10 = this.minFontSize;
            TextUnitKt.m13513checkArithmeticNB67dxo(j10, j8);
            if (Float.compare(TextUnit.m13499getValueimpl(j10), TextUnit.m13499getValueimpl(j8)) > 0) {
                this.minFontSize = j8;
            }
        }
        if (TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(j9), TextUnitType.INSTANCE.m13532getSpUIouoOA())) {
            long sp = TextUnitKt.getSp(1.0E-4f);
            TextUnitKt.m13513checkArithmeticNB67dxo(j9, sp);
            if (Float.compare(TextUnit.m13499getValueimpl(j9), TextUnit.m13499getValueimpl(sp)) < 0) {
                throw new IllegalArgumentException("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
            }
        }
        if (TextUnit.m13499getValueimpl(this.minFontSize) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: minFontSize must not be negative");
        }
        if (TextUnit.m13499getValueimpl(j8) < 0.0f) {
            throw new IllegalArgumentException("AutoSize.StepBased: maxFontSize must not be negative");
        }
    }
}
