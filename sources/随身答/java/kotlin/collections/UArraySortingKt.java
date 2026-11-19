package kotlin.collections;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m13413d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m25213partitionnroSd4(long[] jArr, int i9, int i10) {
        long jM24992getsVKNKU = ULongArray.m24992getsVKNKU(jArr, (i9 + i10) / 2);
        while (i9 <= i10) {
            while (Long.compare(ULongArray.m24992getsVKNKU(jArr, i9) ^ Long.MIN_VALUE, jM24992getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i9++;
            }
            while (Long.compare(ULongArray.m24992getsVKNKU(jArr, i10) ^ Long.MIN_VALUE, jM24992getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i10--;
            }
            if (i9 <= i10) {
                long jM24992getsVKNKU2 = ULongArray.m24992getsVKNKU(jArr, i9);
                ULongArray.m24997setk8EXiF4(jArr, i9, ULongArray.m24992getsVKNKU(jArr, i10));
                ULongArray.m24997setk8EXiF4(jArr, i10, jM24992getsVKNKU2);
                i9++;
                i10--;
            }
        }
        return i9;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m25214partition4UcCI2c(byte[] bArr, int i9, int i10) {
        int i11;
        byte bM24834getw2LRezQ = UByteArray.m24834getw2LRezQ(bArr, (i9 + i10) / 2);
        while (i9 <= i10) {
            while (true) {
                int iM24834getw2LRezQ = UByteArray.m24834getw2LRezQ(bArr, i9) & UByte.MAX_VALUE;
                i11 = bM24834getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM24834getw2LRezQ, i11) >= 0) {
                    break;
                }
                i9++;
            }
            while (Intrinsics.compare(UByteArray.m24834getw2LRezQ(bArr, i10) & UByte.MAX_VALUE, i11) > 0) {
                i10--;
            }
            if (i9 <= i10) {
                byte bM24834getw2LRezQ2 = UByteArray.m24834getw2LRezQ(bArr, i9);
                UByteArray.m24839setVurrAj0(bArr, i9, UByteArray.m24834getw2LRezQ(bArr, i10));
                UByteArray.m24839setVurrAj0(bArr, i10, bM24834getw2LRezQ2);
                i9++;
                i10--;
            }
        }
        return i9;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m25215partitionAa5vz7o(short[] sArr, int i9, int i10) {
        int i11;
        short sM25097getMh2AYeg = UShortArray.m25097getMh2AYeg(sArr, (i9 + i10) / 2);
        while (i9 <= i10) {
            while (true) {
                int iM25097getMh2AYeg = UShortArray.m25097getMh2AYeg(sArr, i9) & UShort.MAX_VALUE;
                i11 = sM25097getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM25097getMh2AYeg, i11) >= 0) {
                    break;
                }
                i9++;
            }
            while (Intrinsics.compare(UShortArray.m25097getMh2AYeg(sArr, i10) & UShort.MAX_VALUE, i11) > 0) {
                i10--;
            }
            if (i9 <= i10) {
                short sM25097getMh2AYeg2 = UShortArray.m25097getMh2AYeg(sArr, i9);
                UShortArray.m25102set01HTLdE(sArr, i9, UShortArray.m25097getMh2AYeg(sArr, i10));
                UShortArray.m25102set01HTLdE(sArr, i10, sM25097getMh2AYeg2);
                i9++;
                i10--;
            }
        }
        return i9;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m25216partitionoBK06Vg(int[] iArr, int i9, int i10) {
        int iM24913getpVg5ArA = UIntArray.m24913getpVg5ArA(iArr, (i9 + i10) / 2);
        while (i9 <= i10) {
            while (Integer.compare(UIntArray.m24913getpVg5ArA(iArr, i9) ^ Integer.MIN_VALUE, iM24913getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i9++;
            }
            while (Integer.compare(UIntArray.m24913getpVg5ArA(iArr, i10) ^ Integer.MIN_VALUE, iM24913getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i10--;
            }
            if (i9 <= i10) {
                int iM24913getpVg5ArA2 = UIntArray.m24913getpVg5ArA(iArr, i9);
                UIntArray.m24918setVXSXFK8(iArr, i9, UIntArray.m24913getpVg5ArA(iArr, i10));
                UIntArray.m24918setVXSXFK8(iArr, i10, iM24913getpVg5ArA2);
                i9++;
                i10--;
            }
        }
        return i9;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m25217quickSortnroSd4(long[] jArr, int i9, int i10) {
        int iM25213partitionnroSd4 = m25213partitionnroSd4(jArr, i9, i10);
        int i11 = iM25213partitionnroSd4 - 1;
        if (i9 < i11) {
            m25217quickSortnroSd4(jArr, i9, i11);
        }
        if (iM25213partitionnroSd4 < i10) {
            m25217quickSortnroSd4(jArr, iM25213partitionnroSd4, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m25218quickSort4UcCI2c(byte[] bArr, int i9, int i10) {
        int iM25214partition4UcCI2c = m25214partition4UcCI2c(bArr, i9, i10);
        int i11 = iM25214partition4UcCI2c - 1;
        if (i9 < i11) {
            m25218quickSort4UcCI2c(bArr, i9, i11);
        }
        if (iM25214partition4UcCI2c < i10) {
            m25218quickSort4UcCI2c(bArr, iM25214partition4UcCI2c, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m25219quickSortAa5vz7o(short[] sArr, int i9, int i10) {
        int iM25215partitionAa5vz7o = m25215partitionAa5vz7o(sArr, i9, i10);
        int i11 = iM25215partitionAa5vz7o - 1;
        if (i9 < i11) {
            m25219quickSortAa5vz7o(sArr, i9, i11);
        }
        if (iM25215partitionAa5vz7o < i10) {
            m25219quickSortAa5vz7o(sArr, iM25215partitionAa5vz7o, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m25220quickSortoBK06Vg(int[] iArr, int i9, int i10) {
        int iM25216partitionoBK06Vg = m25216partitionoBK06Vg(iArr, i9, i10);
        int i11 = iM25216partitionoBK06Vg - 1;
        if (i9 < i11) {
            m25220quickSortoBK06Vg(iArr, i9, i11);
        }
        if (iM25216partitionoBK06Vg < i10) {
            m25220quickSortoBK06Vg(iArr, iM25216partitionoBK06Vg, i10);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m25221sortArraynroSd4(long[] array, int i9, int i10) {
        Intrinsics.checkNotNullParameter(array, "array");
        m25217quickSortnroSd4(array, i9, i10 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m25222sortArray4UcCI2c(byte[] array, int i9, int i10) {
        Intrinsics.checkNotNullParameter(array, "array");
        m25218quickSort4UcCI2c(array, i9, i10 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m25223sortArrayAa5vz7o(short[] array, int i9, int i10) {
        Intrinsics.checkNotNullParameter(array, "array");
        m25219quickSortAa5vz7o(array, i9, i10 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m25224sortArrayoBK06Vg(int[] array, int i9, int i10) {
        Intrinsics.checkNotNullParameter(array, "array");
        m25220quickSortoBK06Vg(array, i9, i10 - 1);
    }
}
