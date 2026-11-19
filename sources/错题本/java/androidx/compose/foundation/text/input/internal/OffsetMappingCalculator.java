package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "", "<init>", "()V", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "fromSource", "Landroidx/compose/ui/text/TextRange;", "map-fzxv0v0", "(IZ)J", "map", "opOffset", "untransformedLen", "transformedLen", "mapStep-C6u-MEY", "(IIIIZ)J", "mapStep", "sourceStart", "sourceEnd", "newLength", "Ld6/s;", "recordEditOperation", "(III)V", "mapFromSource--jx7JFs", "(I)J", "mapFromSource", "mapFromDest--jx7JFs", "mapFromDest", "Landroidx/compose/foundation/text/input/internal/OpArray;", "ops", "[I", "opsSize", "I", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOffsetMappingCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OpArray\n*L\n1#1,419:1\n96#2,5:420\n395#3,21:425\n*S KotlinDebug\n*F\n+ 1 OffsetMappingCalculator.kt\nandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator\n*L\n266#1:420,5\n302#1:425,21\n*E\n"})
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;

    @NotNull
    private int[] ops = OpArray.m7829constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m7824mapfzxv0v0(int offset, boolean fromSource) {
        int i;
        int iMin;
        int[] iArr = this.ops;
        int i8 = this.opsSize;
        if (i8 >= 0) {
            if (fromSource) {
                int i9 = 0;
                iMin = offset;
                while (i9 < i8) {
                    int i10 = i9 * 3;
                    int i11 = iArr[i10];
                    int i12 = iArr[i10 + 1];
                    int i13 = iArr[i10 + 2];
                    long jM7825mapStepC6uMEY = m7825mapStepC6uMEY(iMin, i11, i12, i13, fromSource);
                    long jM7825mapStepC6uMEY2 = m7825mapStepC6uMEY(offset, i11, i12, i13, fromSource);
                    int iMin2 = Math.min(TextRange.m12770getStartimpl(jM7825mapStepC6uMEY), TextRange.m12770getStartimpl(jM7825mapStepC6uMEY2));
                    int iMax = Math.max(TextRange.m12765getEndimpl(jM7825mapStepC6uMEY), TextRange.m12765getEndimpl(jM7825mapStepC6uMEY2));
                    i9++;
                    iMin = iMin2;
                    offset = iMax;
                }
            } else {
                int i14 = i8 - 1;
                iMin = offset;
                while (-1 < i14) {
                    int i15 = i14 * 3;
                    int i16 = iArr[i15];
                    int i17 = iArr[i15 + 1];
                    int i18 = iArr[i15 + 2];
                    boolean z8 = fromSource;
                    long jM7825mapStepC6uMEY3 = m7825mapStepC6uMEY(iMin, i16, i17, i18, z8);
                    long jM7825mapStepC6uMEY4 = m7825mapStepC6uMEY(offset, i16, i17, i18, z8);
                    iMin = Math.min(TextRange.m12770getStartimpl(jM7825mapStepC6uMEY3), TextRange.m12770getStartimpl(jM7825mapStepC6uMEY4));
                    offset = Math.max(TextRange.m12765getEndimpl(jM7825mapStepC6uMEY3), TextRange.m12765getEndimpl(jM7825mapStepC6uMEY4));
                    i14--;
                    fromSource = z8;
                }
            }
            i = offset;
            offset = iMin;
        } else {
            i = offset;
        }
        return TextRangeKt.TextRange(offset, i);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m7825mapStepC6uMEY(int offset, int opOffset, int untransformedLen, int transformedLen, boolean fromSource) {
        int i = fromSource ? untransformedLen : transformedLen;
        if (fromSource) {
            untransformedLen = transformedLen;
        }
        return offset < opOffset ? TextRangeKt.TextRange(offset) : offset == opOffset ? i == 0 ? TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange(opOffset) : offset < opOffset + i ? untransformedLen == 0 ? TextRangeKt.TextRange(opOffset) : TextRangeKt.TextRange(opOffset, untransformedLen + opOffset) : TextRangeKt.TextRange((offset - i) + untransformedLen);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m7826mapFromDestjx7JFs(int offset) {
        return m7824mapfzxv0v0(offset, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m7827mapFromSourcejx7JFs(int offset) {
        return m7824mapfzxv0v0(offset, true);
    }

    public final void recordEditOperation(int sourceStart, int sourceEnd, int newLength) {
        if (!(newLength >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + newLength);
        }
        int iMin = Math.min(sourceStart, sourceEnd);
        int iMax = Math.max(iMin, sourceEnd) - iMin;
        if (iMax >= 2 || iMax != newLength) {
            int i = this.opsSize + 1;
            if (i > OpArray.m7836getSizeimpl(this.ops)) {
                this.ops = OpArray.m7831copyOfpSmdads(this.ops, Math.max(i * 2, OpArray.m7836getSizeimpl(this.ops) * 2));
            }
            OpArray.m7838setimpl(this.ops, this.opsSize, iMin, iMax, newLength);
            this.opsSize = i;
        }
    }
}
