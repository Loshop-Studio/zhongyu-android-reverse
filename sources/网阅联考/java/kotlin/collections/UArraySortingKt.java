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

@Metadata(m5174d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m5175d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m12244partitionnroSd4(long[] jArr, int i4, int i5) {
        long jM12022getsVKNKU = ULongArray.m12022getsVKNKU(jArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (Long.compare(ULongArray.m12022getsVKNKU(jArr, i4) ^ Long.MIN_VALUE, jM12022getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i4++;
            }
            while (Long.compare(ULongArray.m12022getsVKNKU(jArr, i5) ^ Long.MIN_VALUE, jM12022getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                long jM12022getsVKNKU2 = ULongArray.m12022getsVKNKU(jArr, i4);
                ULongArray.m12027setk8EXiF4(jArr, i4, ULongArray.m12022getsVKNKU(jArr, i5));
                ULongArray.m12027setk8EXiF4(jArr, i5, jM12022getsVKNKU2);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m12245partition4UcCI2c(byte[] bArr, int i4, int i5) {
        int i6;
        byte bM11864getw2LRezQ = UByteArray.m11864getw2LRezQ(bArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (true) {
                int iM11864getw2LRezQ = UByteArray.m11864getw2LRezQ(bArr, i4) & UByte.MAX_VALUE;
                i6 = bM11864getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM11864getw2LRezQ, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (Intrinsics.compare(UByteArray.m11864getw2LRezQ(bArr, i5) & UByte.MAX_VALUE, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                byte bM11864getw2LRezQ2 = UByteArray.m11864getw2LRezQ(bArr, i4);
                UByteArray.m11869setVurrAj0(bArr, i4, UByteArray.m11864getw2LRezQ(bArr, i5));
                UByteArray.m11869setVurrAj0(bArr, i5, bM11864getw2LRezQ2);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m12246partitionAa5vz7o(short[] sArr, int i4, int i5) {
        int i6;
        short sM12127getMh2AYeg = UShortArray.m12127getMh2AYeg(sArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (true) {
                int iM12127getMh2AYeg = UShortArray.m12127getMh2AYeg(sArr, i4) & UShort.MAX_VALUE;
                i6 = sM12127getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM12127getMh2AYeg, i6) >= 0) {
                    break;
                }
                i4++;
            }
            while (Intrinsics.compare(UShortArray.m12127getMh2AYeg(sArr, i5) & UShort.MAX_VALUE, i6) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                short sM12127getMh2AYeg2 = UShortArray.m12127getMh2AYeg(sArr, i4);
                UShortArray.m12132set01HTLdE(sArr, i4, UShortArray.m12127getMh2AYeg(sArr, i5));
                UShortArray.m12132set01HTLdE(sArr, i5, sM12127getMh2AYeg2);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m12247partitionoBK06Vg(int[] iArr, int i4, int i5) {
        int iM11943getpVg5ArA = UIntArray.m11943getpVg5ArA(iArr, (i4 + i5) / 2);
        while (i4 <= i5) {
            while (Integer.compare(UIntArray.m11943getpVg5ArA(iArr, i4) ^ Integer.MIN_VALUE, iM11943getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i4++;
            }
            while (Integer.compare(UIntArray.m11943getpVg5ArA(iArr, i5) ^ Integer.MIN_VALUE, iM11943getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i5--;
            }
            if (i4 <= i5) {
                int iM11943getpVg5ArA2 = UIntArray.m11943getpVg5ArA(iArr, i4);
                UIntArray.m11948setVXSXFK8(iArr, i4, UIntArray.m11943getpVg5ArA(iArr, i5));
                UIntArray.m11948setVXSXFK8(iArr, i5, iM11943getpVg5ArA2);
                i4++;
                i5--;
            }
        }
        return i4;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m12248quickSortnroSd4(long[] jArr, int i4, int i5) {
        int iM12244partitionnroSd4 = m12244partitionnroSd4(jArr, i4, i5);
        int i6 = iM12244partitionnroSd4 - 1;
        if (i4 < i6) {
            m12248quickSortnroSd4(jArr, i4, i6);
        }
        if (iM12244partitionnroSd4 < i5) {
            m12248quickSortnroSd4(jArr, iM12244partitionnroSd4, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m12249quickSort4UcCI2c(byte[] bArr, int i4, int i5) {
        int iM12245partition4UcCI2c = m12245partition4UcCI2c(bArr, i4, i5);
        int i6 = iM12245partition4UcCI2c - 1;
        if (i4 < i6) {
            m12249quickSort4UcCI2c(bArr, i4, i6);
        }
        if (iM12245partition4UcCI2c < i5) {
            m12249quickSort4UcCI2c(bArr, iM12245partition4UcCI2c, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m12250quickSortAa5vz7o(short[] sArr, int i4, int i5) {
        int iM12246partitionAa5vz7o = m12246partitionAa5vz7o(sArr, i4, i5);
        int i6 = iM12246partitionAa5vz7o - 1;
        if (i4 < i6) {
            m12250quickSortAa5vz7o(sArr, i4, i6);
        }
        if (iM12246partitionAa5vz7o < i5) {
            m12250quickSortAa5vz7o(sArr, iM12246partitionAa5vz7o, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m12251quickSortoBK06Vg(int[] iArr, int i4, int i5) {
        int iM12247partitionoBK06Vg = m12247partitionoBK06Vg(iArr, i4, i5);
        int i6 = iM12247partitionoBK06Vg - 1;
        if (i4 < i6) {
            m12251quickSortoBK06Vg(iArr, i4, i6);
        }
        if (iM12247partitionoBK06Vg < i5) {
            m12251quickSortoBK06Vg(iArr, iM12247partitionoBK06Vg, i5);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m12252sortArraynroSd4(long[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m12248quickSortnroSd4(array, i4, i5 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m12253sortArray4UcCI2c(byte[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m12249quickSort4UcCI2c(array, i4, i5 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m12254sortArrayAa5vz7o(short[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m12250quickSortAa5vz7o(array, i4, i5 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m12255sortArrayoBK06Vg(int[] array, int i4, int i5) {
        Intrinsics.checkNotNullParameter(array, "array");
        m12251quickSortoBK06Vg(array, i4, i5 - 1);
    }
}
