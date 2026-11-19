package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p012ui.text.TextRange;
import androidx.compose.p012ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J=\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m13413d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "()V", "ops", "Landroidx/compose/foundation/text/input/internal/OpArray;", "[I", "opsSize", "", "map", "Landroidx/compose/ui/text/TextRange;", TypedValues.CycleType.S_WAVE_OFFSET, "fromSource", "", "map-fzxv0v0", "(IZ)J", "mapFromDest", "mapFromDest--jx7JFs", "(I)J", "mapFromSource", "mapFromSource--jx7JFs", "mapStep", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "recordEditOperation", "", "sourceStart", "sourceEnd", "newLength", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,419:1\n96#2,5:420\n395#3,21:425\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n266#1:420,5\n302#1:425,21\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m18653constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m18648mapfzxv0v0(int offset, boolean fromSource) {
        int i9;
        int iMin;
        int[] iArr = this.ops;
        int i10 = this.opsSize;
        if (i10 >= 0) {
            if (fromSource) {
                int i11 = 0;
                iMin = offset;
                while (i11 < i10) {
                    int i12 = i11 * 3;
                    int i13 = iArr[i12];
                    int i14 = iArr[i12 + 1];
                    int i15 = iArr[i12 + 2];
                    long jM18649mapStepC6uMEY = m18649mapStepC6uMEY(iMin, i13, i14, i15, fromSource);
                    long jM18649mapStepC6uMEY2 = m18649mapStepC6uMEY(offset, i13, i14, i15, fromSource);
                    int iMin2 = Math.min(TextRange.m23460getStartimpl(jM18649mapStepC6uMEY), TextRange.m23460getStartimpl(jM18649mapStepC6uMEY2));
                    int iMax = Math.max(TextRange.m23455getEndimpl(jM18649mapStepC6uMEY), TextRange.m23455getEndimpl(jM18649mapStepC6uMEY2));
                    i11++;
                    iMin = iMin2;
                    offset = iMax;
                }
            } else {
                int i16 = i10 - 1;
                iMin = offset;
                while (-1 < i16) {
                    int i17 = i16 * 3;
                    int i18 = iArr[i17];
                    int i19 = iArr[i17 + 1];
                    int i20 = iArr[i17 + 2];
                    boolean z9 = fromSource;
                    long jM18649mapStepC6uMEY3 = m18649mapStepC6uMEY(iMin, i18, i19, i20, z9);
                    long jM18649mapStepC6uMEY4 = m18649mapStepC6uMEY(offset, i18, i19, i20, z9);
                    iMin = Math.min(TextRange.m23460getStartimpl(jM18649mapStepC6uMEY3), TextRange.m23460getStartimpl(jM18649mapStepC6uMEY4));
                    offset = Math.max(TextRange.m23455getEndimpl(jM18649mapStepC6uMEY3), TextRange.m23455getEndimpl(jM18649mapStepC6uMEY4));
                    i16--;
                    fromSource = z9;
                }
            }
            i9 = offset;
            offset = iMin;
        } else {
            i9 = offset;
        }
        return TextRangeKt.TextRange(offset, i9);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m18649mapStepC6uMEY(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i9 = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        return offset < opOffset ? TextRangeKt.TextRange(offset) : offset == opOffset ? i9 == 0 ? TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange(opOffset) : offset < opOffset + i9 ? untransformedLen == 0 ? TextRangeKt.TextRange(opOffset) : TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange((offset - i9) + untransformedLen);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m18650mapFromDestjx7JFs(int offset) {
        return m18648mapfzxv0v0(offset, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m18651mapFromSourcejx7JFs(int offset) {
        return m18648mapfzxv0v0(offset, true);
    }

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (!(newLength >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + newLength);
        }
        int iMin = Math.min(sourceStart, sourceEnd);
        int iMax = Math.max(iMin, sourceEnd) - iMin;
        if (iMax >= 2 || iMax != newLength) {
            int i9 = this.opsSize + 1;
            if (i9 > OpArray.m18660getSizeimpl(this.ops)) {
                this.ops = OpArray.m18655copyOfpSmdads(this.ops, Math.max(i9 * 2, OpArray.m18660getSizeimpl(this.ops) * 2));
            }
            OpArray.m18662setimpl(this.ops, this.opsSize, iMin, iMax, newLength);
            this.opsSize = i9;
        }
    }
}
