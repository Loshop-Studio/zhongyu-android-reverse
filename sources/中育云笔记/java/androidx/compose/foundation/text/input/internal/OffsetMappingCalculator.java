package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class OffsetMappingCalculator {
    public static final int $stable = 8;
    private int[] ops = OpArray.m28025constructorimpl(10);
    private int opsSize;

    /* renamed from: map-fzxv0v0, reason: not valid java name */
    private final long m28020mapfzxv0v0(int i10, boolean z10) {
        int i11;
        int iMin;
        int[] iArr = this.ops;
        int i12 = this.opsSize;
        if (i12 >= 0) {
            if (z10) {
                int i13 = 0;
                iMin = i10;
                while (i13 < i12) {
                    int i14 = i13 * 3;
                    int i15 = iArr[i14];
                    int i16 = iArr[i14 + 1];
                    int i17 = iArr[i14 + 2];
                    long jM28021mapStepC6uMEY = m28021mapStepC6uMEY(iMin, i15, i16, i17, z10);
                    long jM28021mapStepC6uMEY2 = m28021mapStepC6uMEY(i10, i15, i16, i17, z10);
                    int iMin2 = Math.min(TextRange.m32966getStartimpl(jM28021mapStepC6uMEY), TextRange.m32966getStartimpl(jM28021mapStepC6uMEY2));
                    int iMax = Math.max(TextRange.m32961getEndimpl(jM28021mapStepC6uMEY), TextRange.m32961getEndimpl(jM28021mapStepC6uMEY2));
                    i13++;
                    iMin = iMin2;
                    i10 = iMax;
                }
            } else {
                int i18 = i12 - 1;
                iMin = i10;
                while (-1 < i18) {
                    int i19 = i18 * 3;
                    int i20 = iArr[i19];
                    int i21 = iArr[i19 + 1];
                    int i22 = iArr[i19 + 2];
                    boolean z11 = z10;
                    long jM28021mapStepC6uMEY3 = m28021mapStepC6uMEY(iMin, i20, i21, i22, z11);
                    long jM28021mapStepC6uMEY4 = m28021mapStepC6uMEY(i10, i20, i21, i22, z11);
                    iMin = Math.min(TextRange.m32966getStartimpl(jM28021mapStepC6uMEY3), TextRange.m32966getStartimpl(jM28021mapStepC6uMEY4));
                    i10 = Math.max(TextRange.m32961getEndimpl(jM28021mapStepC6uMEY3), TextRange.m32961getEndimpl(jM28021mapStepC6uMEY4));
                    i18--;
                    z10 = z11;
                }
            }
            i11 = i10;
            i10 = iMin;
        } else {
            i11 = i10;
        }
        return TextRangeKt.TextRange(i10, i11);
    }

    /* renamed from: mapStep-C6u-MEY, reason: not valid java name */
    private final long m28021mapStepC6uMEY(int i10, int i11, int i12, int i13, boolean z10) {
        int i14 = z10 ? i12 : i13;
        if (z10) {
            i12 = i13;
        }
        return i10 < i11 ? TextRangeKt.TextRange(i10) : i10 == i11 ? i14 == 0 ? TextRangeKt.TextRange(i11, i12 + i11) : TextRangeKt.TextRange(i11) : i10 < i11 + i14 ? i12 == 0 ? TextRangeKt.TextRange(i11) : TextRangeKt.TextRange(i11, i12 + i11) : TextRangeKt.TextRange((i10 - i14) + i12);
    }

    /* renamed from: mapFromDest--jx7JFs, reason: not valid java name */
    public final long m28022mapFromDestjx7JFs(int i10) {
        return m28020mapfzxv0v0(i10, false);
    }

    /* renamed from: mapFromSource--jx7JFs, reason: not valid java name */
    public final long m28023mapFromSourcejx7JFs(int i10) {
        return m28020mapfzxv0v0(i10, true);
    }

    public final void recordEditOperation(int i10, int i11, int i12) {
        if (!(i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Expected newLen to be ≥ 0, was " + i12);
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(iMin, i11) - iMin;
        if (iMax >= 2 || iMax != i12) {
            int i13 = this.opsSize + 1;
            if (i13 > OpArray.m28032getSizeimpl(this.ops)) {
                this.ops = OpArray.m28027copyOfpSmdads(this.ops, Math.max(i13 * 2, OpArray.m28032getSizeimpl(this.ops) * 2));
            }
            OpArray.m28034setimpl(this.ops, this.opsSize, iMin, iMax, i12);
            this.opsSize = i13;
        }
    }
}
