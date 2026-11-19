package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0011J=\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "()V", "ops", "Landroidx/compose/foundation/text/input/internal/OpArray;", "[I", "opsSize", "", "map", "Landroidx/compose/ui/text/TextRange;", TypedValues.CycleType.S_WAVE_OFFSET, "fromSource", "", "map-fzxv0v0", "(IZ)J", "mapFromDest", "mapFromDest--jx7JFs", "(I)J", "mapFromSource", "mapFromSource--jx7JFs", "mapStep", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "recordEditOperation", "", "sourceStart", "sourceEnd", "newLength", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,419:1\n96#2,5:420\n395#3,21:425\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n266#1:420,5\n302#1:425,21\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m18220constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m18215mapfzxv0v0(int offset, boolean fromSource) {
        int i10;
        int iMin;
        int[] iArr = this.ops;
        int i11 = this.opsSize;
        if (i11 >= 0) {
            if (fromSource) {
                int i12 = 0;
                iMin = offset;
                while (i12 < i11) {
                    int i13 = i12 * 3;
                    int i14 = iArr[i13];
                    int i15 = iArr[i13 + 1];
                    int i16 = iArr[i13 + 2];
                    long jM18216mapStepC6uMEY = m18216mapStepC6uMEY(iMin, i14, i15, i16, fromSource);
                    long jM18216mapStepC6uMEY2 = m18216mapStepC6uMEY(offset, i14, i15, i16, fromSource);
                    int iMin2 = Math.min(TextRange.m23027getStartimpl(jM18216mapStepC6uMEY), TextRange.m23027getStartimpl(jM18216mapStepC6uMEY2));
                    int iMax = Math.max(TextRange.m23022getEndimpl(jM18216mapStepC6uMEY), TextRange.m23022getEndimpl(jM18216mapStepC6uMEY2));
                    i12++;
                    iMin = iMin2;
                    offset = iMax;
                }
            } else {
                int i17 = i11 - 1;
                iMin = offset;
                while (-1 < i17) {
                    int i18 = i17 * 3;
                    int i19 = iArr[i18];
                    int i20 = iArr[i18 + 1];
                    int i21 = iArr[i18 + 2];
                    boolean z9 = fromSource;
                    long jM18216mapStepC6uMEY3 = m18216mapStepC6uMEY(iMin, i19, i20, i21, z9);
                    long jM18216mapStepC6uMEY4 = m18216mapStepC6uMEY(offset, i19, i20, i21, z9);
                    iMin = Math.min(TextRange.m23027getStartimpl(jM18216mapStepC6uMEY3), TextRange.m23027getStartimpl(jM18216mapStepC6uMEY4));
                    offset = Math.max(TextRange.m23022getEndimpl(jM18216mapStepC6uMEY3), TextRange.m23022getEndimpl(jM18216mapStepC6uMEY4));
                    i17--;
                    fromSource = z9;
                }
            }
            i10 = offset;
            offset = iMin;
        } else {
            i10 = offset;
        }
        return TextRangeKt.TextRange(offset, i10);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m18216mapStepC6uMEY(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i10 = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        return offset < opOffset ? TextRangeKt.TextRange(offset) : offset == opOffset ? i10 == 0 ? TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange(opOffset) : offset < opOffset + i10 ? untransformedLen == 0 ? TextRangeKt.TextRange(opOffset) : TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange((offset - i10) + untransformedLen);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m18217mapFromDestjx7JFs(int offset) {
        return m18215mapfzxv0v0(offset, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m18218mapFromSourcejx7JFs(int offset) {
        return m18215mapfzxv0v0(offset, true);
    }

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (!(newLength >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + newLength);
        }
        int iMin = Math.min(sourceStart, sourceEnd);
        int iMax = Math.max(iMin, sourceEnd) - iMin;
        if (iMax >= 2 || iMax != newLength) {
            int i10 = this.opsSize + 1;
            if (i10 > OpArray.m18227getSizeimpl(this.ops)) {
                this.ops = OpArray.m18222copyOfpSmdads(this.ops, Math.max(i10 * 2, OpArray.m18227getSizeimpl(this.ops) * 2));
            }
            OpArray.m18229setimpl(this.ops, this.opsSize, iMin, iMax, newLength);
            this.opsSize = i10;
        }
    }
}
