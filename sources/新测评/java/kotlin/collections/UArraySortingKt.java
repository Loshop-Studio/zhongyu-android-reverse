package kotlin.collections;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m13558d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m24754partitionnroSd4(long[] jArr, int i10, int i11) {
        long jM24533getsVKNKU = ULongArray.m24533getsVKNKU(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Long.compare(ULongArray.m24533getsVKNKU(jArr, i10) ^ Long.MIN_VALUE, jM24533getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i10++;
            }
            while (Long.compare(ULongArray.m24533getsVKNKU(jArr, i11) ^ Long.MIN_VALUE, jM24533getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long jM24533getsVKNKU2 = ULongArray.m24533getsVKNKU(jArr, i10);
                ULongArray.m24538setk8EXiF4(jArr, i10, ULongArray.m24533getsVKNKU(jArr, i11));
                ULongArray.m24538setk8EXiF4(jArr, i11, jM24533getsVKNKU2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m24755partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte bM24375getw2LRezQ = UByteArray.m24375getw2LRezQ(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int iM24375getw2LRezQ = UByteArray.m24375getw2LRezQ(bArr, i10) & UByte.MAX_VALUE;
                i12 = bM24375getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM24375getw2LRezQ, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UByteArray.m24375getw2LRezQ(bArr, i11) & UByte.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte bM24375getw2LRezQ2 = UByteArray.m24375getw2LRezQ(bArr, i10);
                UByteArray.m24380setVurrAj0(bArr, i10, UByteArray.m24375getw2LRezQ(bArr, i11));
                UByteArray.m24380setVurrAj0(bArr, i11, bM24375getw2LRezQ2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m24756partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short sM24638getMh2AYeg = UShortArray.m24638getMh2AYeg(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int iM24638getMh2AYeg = UShortArray.m24638getMh2AYeg(sArr, i10) & UShort.MAX_VALUE;
                i12 = sM24638getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM24638getMh2AYeg, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UShortArray.m24638getMh2AYeg(sArr, i11) & UShort.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short sM24638getMh2AYeg2 = UShortArray.m24638getMh2AYeg(sArr, i10);
                UShortArray.m24643set01HTLdE(sArr, i10, UShortArray.m24638getMh2AYeg(sArr, i11));
                UShortArray.m24643set01HTLdE(sArr, i11, sM24638getMh2AYeg2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m24757partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int iM24454getpVg5ArA = UIntArray.m24454getpVg5ArA(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (Integer.compare(UIntArray.m24454getpVg5ArA(iArr, i10) ^ Integer.MIN_VALUE, iM24454getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i10++;
            }
            while (Integer.compare(UIntArray.m24454getpVg5ArA(iArr, i11) ^ Integer.MIN_VALUE, iM24454getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int iM24454getpVg5ArA2 = UIntArray.m24454getpVg5ArA(iArr, i10);
                UIntArray.m24459setVXSXFK8(iArr, i10, UIntArray.m24454getpVg5ArA(iArr, i11));
                UIntArray.m24459setVXSXFK8(iArr, i11, iM24454getpVg5ArA2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m24758quickSortnroSd4(long[] jArr, int i10, int i11) {
        int iM24754partitionnroSd4 = m24754partitionnroSd4(jArr, i10, i11);
        int i12 = iM24754partitionnroSd4 - 1;
        if (i10 < i12) {
            m24758quickSortnroSd4(jArr, i10, i12);
        }
        if (iM24754partitionnroSd4 < i11) {
            m24758quickSortnroSd4(jArr, iM24754partitionnroSd4, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m24759quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int iM24755partition4UcCI2c = m24755partition4UcCI2c(bArr, i10, i11);
        int i12 = iM24755partition4UcCI2c - 1;
        if (i10 < i12) {
            m24759quickSort4UcCI2c(bArr, i10, i12);
        }
        if (iM24755partition4UcCI2c < i11) {
            m24759quickSort4UcCI2c(bArr, iM24755partition4UcCI2c, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m24760quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int iM24756partitionAa5vz7o = m24756partitionAa5vz7o(sArr, i10, i11);
        int i12 = iM24756partitionAa5vz7o - 1;
        if (i10 < i12) {
            m24760quickSortAa5vz7o(sArr, i10, i12);
        }
        if (iM24756partitionAa5vz7o < i11) {
            m24760quickSortAa5vz7o(sArr, iM24756partitionAa5vz7o, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m24761quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int iM24757partitionoBK06Vg = m24757partitionoBK06Vg(iArr, i10, i11);
        int i12 = iM24757partitionoBK06Vg - 1;
        if (i10 < i12) {
            m24761quickSortoBK06Vg(iArr, i10, i12);
        }
        if (iM24757partitionoBK06Vg < i11) {
            m24761quickSortoBK06Vg(iArr, iM24757partitionoBK06Vg, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m24762sortArraynroSd4(long[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m24758quickSortnroSd4(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m24763sortArray4UcCI2c(byte[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m24759quickSort4UcCI2c(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m24764sortArrayAa5vz7o(short[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m24760quickSortAa5vz7o(array, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m24765sortArrayoBK06Vg(int[] array, int i10, int i11) {
        Intrinsics.checkNotNullParameter(array, "array");
        m24761quickSortoBK06Vg(array, i10, i11 - 1);
    }
}
