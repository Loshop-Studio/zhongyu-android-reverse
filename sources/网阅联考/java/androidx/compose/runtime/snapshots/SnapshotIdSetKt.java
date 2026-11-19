package androidx.compose.runtime.snapshots;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\u0007"}, m5175d2 = {"lowestBitOf", "", "bits", "", "binarySearch", "", "value", "runtime_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SnapshotIdSetKt {
    public static final int binarySearch(int[] iArr, int i4) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        int i5 = 0;
        while (i5 <= length) {
            int i6 = (i5 + length) >>> 1;
            int i7 = iArr[i6];
            if (i4 > i7) {
                i5 = i6 + 1;
            } else {
                if (i4 >= i7) {
                    return i6;
                }
                length = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int lowestBitOf(long j4) {
        int i4;
        if ((4294967295L & j4) == 0) {
            i4 = 32;
            j4 >>= 32;
        } else {
            i4 = 0;
        }
        if ((65535 & j4) == 0) {
            i4 += 16;
            j4 >>= 16;
        }
        if ((255 & j4) == 0) {
            i4 += 8;
            j4 >>= 8;
        }
        if ((15 & j4) == 0) {
            i4 += 4;
            j4 >>= 4;
        }
        if ((1 & j4) != 0) {
            return i4;
        }
        if ((2 & j4) != 0) {
            return i4 + 1;
        }
        if ((4 & j4) != 0) {
            return i4 + 2;
        }
        if ((j4 & 8) != 0) {
            return i4 + 3;
        }
        return -1;
    }
}
