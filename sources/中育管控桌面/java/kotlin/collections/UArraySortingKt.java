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

@Metadata(m7879d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, m7880d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m17638partitionnroSd4(long[] jArr, int i6, int i7) {
        long jM17417getsVKNKU = ULongArray.m17417getsVKNKU(jArr, (i6 + i7) / 2);
        while (i6 <= i7) {
            while (Long.compare(ULongArray.m17417getsVKNKU(jArr, i6) ^ Long.MIN_VALUE, jM17417getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i6++;
            }
            while (Long.compare(ULongArray.m17417getsVKNKU(jArr, i7) ^ Long.MIN_VALUE, jM17417getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i7--;
            }
            if (i6 <= i7) {
                long jM17417getsVKNKU2 = ULongArray.m17417getsVKNKU(jArr, i6);
                ULongArray.m17422setk8EXiF4(jArr, i6, ULongArray.m17417getsVKNKU(jArr, i7));
                ULongArray.m17422setk8EXiF4(jArr, i7, jM17417getsVKNKU2);
                i6++;
                i7--;
            }
        }
        return i6;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m17639partition4UcCI2c(byte[] bArr, int i6, int i7) {
        int i8;
        byte bM17259getw2LRezQ = UByteArray.m17259getw2LRezQ(bArr, (i6 + i7) / 2);
        while (i6 <= i7) {
            while (true) {
                int iM17259getw2LRezQ = UByteArray.m17259getw2LRezQ(bArr, i6) & UByte.MAX_VALUE;
                i8 = bM17259getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM17259getw2LRezQ, i8) >= 0) {
                    break;
                }
                i6++;
            }
            while (Intrinsics.compare(UByteArray.m17259getw2LRezQ(bArr, i7) & UByte.MAX_VALUE, i8) > 0) {
                i7--;
            }
            if (i6 <= i7) {
                byte bM17259getw2LRezQ2 = UByteArray.m17259getw2LRezQ(bArr, i6);
                UByteArray.m17264setVurrAj0(bArr, i6, UByteArray.m17259getw2LRezQ(bArr, i7));
                UByteArray.m17264setVurrAj0(bArr, i7, bM17259getw2LRezQ2);
                i6++;
                i7--;
            }
        }
        return i6;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m17640partitionAa5vz7o(short[] sArr, int i6, int i7) {
        int i8;
        short sM17522getMh2AYeg = UShortArray.m17522getMh2AYeg(sArr, (i6 + i7) / 2);
        while (i6 <= i7) {
            while (true) {
                int iM17522getMh2AYeg = UShortArray.m17522getMh2AYeg(sArr, i6) & UShort.MAX_VALUE;
                i8 = sM17522getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM17522getMh2AYeg, i8) >= 0) {
                    break;
                }
                i6++;
            }
            while (Intrinsics.compare(UShortArray.m17522getMh2AYeg(sArr, i7) & UShort.MAX_VALUE, i8) > 0) {
                i7--;
            }
            if (i6 <= i7) {
                short sM17522getMh2AYeg2 = UShortArray.m17522getMh2AYeg(sArr, i6);
                UShortArray.m17527set01HTLdE(sArr, i6, UShortArray.m17522getMh2AYeg(sArr, i7));
                UShortArray.m17527set01HTLdE(sArr, i7, sM17522getMh2AYeg2);
                i6++;
                i7--;
            }
        }
        return i6;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m17641partitionoBK06Vg(int[] iArr, int i6, int i7) {
        int iM17338getpVg5ArA = UIntArray.m17338getpVg5ArA(iArr, (i6 + i7) / 2);
        while (i6 <= i7) {
            while (Integer.compare(UIntArray.m17338getpVg5ArA(iArr, i6) ^ Integer.MIN_VALUE, iM17338getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i6++;
            }
            while (Integer.compare(UIntArray.m17338getpVg5ArA(iArr, i7) ^ Integer.MIN_VALUE, iM17338getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i7--;
            }
            if (i6 <= i7) {
                int iM17338getpVg5ArA2 = UIntArray.m17338getpVg5ArA(iArr, i6);
                UIntArray.m17343setVXSXFK8(iArr, i6, UIntArray.m17338getpVg5ArA(iArr, i7));
                UIntArray.m17343setVXSXFK8(iArr, i7, iM17338getpVg5ArA2);
                i6++;
                i7--;
            }
        }
        return i6;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m17642quickSortnroSd4(long[] jArr, int i6, int i7) {
        int iM17638partitionnroSd4 = m17638partitionnroSd4(jArr, i6, i7);
        int i8 = iM17638partitionnroSd4 - 1;
        if (i6 < i8) {
            m17642quickSortnroSd4(jArr, i6, i8);
        }
        if (iM17638partitionnroSd4 < i7) {
            m17642quickSortnroSd4(jArr, iM17638partitionnroSd4, i7);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m17643quickSort4UcCI2c(byte[] bArr, int i6, int i7) {
        int iM17639partition4UcCI2c = m17639partition4UcCI2c(bArr, i6, i7);
        int i8 = iM17639partition4UcCI2c - 1;
        if (i6 < i8) {
            m17643quickSort4UcCI2c(bArr, i6, i8);
        }
        if (iM17639partition4UcCI2c < i7) {
            m17643quickSort4UcCI2c(bArr, iM17639partition4UcCI2c, i7);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m17644quickSortAa5vz7o(short[] sArr, int i6, int i7) {
        int iM17640partitionAa5vz7o = m17640partitionAa5vz7o(sArr, i6, i7);
        int i8 = iM17640partitionAa5vz7o - 1;
        if (i6 < i8) {
            m17644quickSortAa5vz7o(sArr, i6, i8);
        }
        if (iM17640partitionAa5vz7o < i7) {
            m17644quickSortAa5vz7o(sArr, iM17640partitionAa5vz7o, i7);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m17645quickSortoBK06Vg(int[] iArr, int i6, int i7) {
        int iM17641partitionoBK06Vg = m17641partitionoBK06Vg(iArr, i6, i7);
        int i8 = iM17641partitionoBK06Vg - 1;
        if (i6 < i8) {
            m17645quickSortoBK06Vg(iArr, i6, i8);
        }
        if (iM17641partitionoBK06Vg < i7) {
            m17645quickSortoBK06Vg(iArr, iM17641partitionoBK06Vg, i7);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m17646sortArraynroSd4(long[] array, int i6, int i7) {
        Intrinsics.checkNotNullParameter(array, "array");
        m17642quickSortnroSd4(array, i6, i7 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m17647sortArray4UcCI2c(byte[] array, int i6, int i7) {
        Intrinsics.checkNotNullParameter(array, "array");
        m17643quickSort4UcCI2c(array, i6, i7 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m17648sortArrayAa5vz7o(short[] array, int i6, int i7) {
        Intrinsics.checkNotNullParameter(array, "array");
        m17644quickSortAa5vz7o(array, i6, i7 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m17649sortArrayoBK06Vg(int[] array, int i6, int i7) {
        Intrinsics.checkNotNullParameter(array, "array");
        m17645quickSortoBK06Vg(array, i6, i7 - 1);
    }
}
