package kotlin.collections;

import com.zykj.message.client.BuildConfig;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UArraySorting.kt */
@Metadata(m16bv = {1, 0, 3}, m17d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m18d2 = {"partition", BuildConfig.FLAVOR, "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", BuildConfig.FLAVOR, "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, m19k = 2, m20mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m463partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM114getw2LRezQ = UByteArray.m114getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM114getw2LRezQ = UByteArray.m114getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i3 = bM114getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM114getw2LRezQ, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m114getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM114getw2LRezQ2 = UByteArray.m114getw2LRezQ(bArr, i);
                UByteArray.m119setVurrAj0(bArr, i, UByteArray.m114getw2LRezQ(bArr, i2));
                UByteArray.m119setVurrAj0(bArr, i2, bM114getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m467quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM463partition4UcCI2c = m463partition4UcCI2c(bArr, i, i2);
        int i3 = iM463partition4UcCI2c - 1;
        if (i < i3) {
            m467quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM463partition4UcCI2c < i2) {
            m467quickSort4UcCI2c(bArr, iM463partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m464partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM350getMh2AYeg = UShortArray.m350getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM350getMh2AYeg = UShortArray.m350getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM350getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM350getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m350getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM350getMh2AYeg2 = UShortArray.m350getMh2AYeg(sArr, i);
                UShortArray.m355set01HTLdE(sArr, i, UShortArray.m350getMh2AYeg(sArr, i2));
                UShortArray.m355set01HTLdE(sArr, i2, sM350getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m468quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM464partitionAa5vz7o = m464partitionAa5vz7o(sArr, i, i2);
        int i3 = iM464partitionAa5vz7o - 1;
        if (i < i3) {
            m468quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM464partitionAa5vz7o < i2) {
            m468quickSortAa5vz7o(sArr, iM464partitionAa5vz7o, i2);
        }
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m465partitionoBK06Vg(int[] iArr, int i, int i2) {
        int iM184getpVg5ArA = UIntArray.m184getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (UnsignedKt.uintCompare(UIntArray.m184getpVg5ArA(iArr, i), iM184getpVg5ArA) < 0) {
                i++;
            }
            while (UnsignedKt.uintCompare(UIntArray.m184getpVg5ArA(iArr, i2), iM184getpVg5ArA) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM184getpVg5ArA2 = UIntArray.m184getpVg5ArA(iArr, i);
                UIntArray.m189setVXSXFK8(iArr, i, UIntArray.m184getpVg5ArA(iArr, i2));
                UIntArray.m189setVXSXFK8(iArr, i2, iM184getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m469quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM465partitionoBK06Vg = m465partitionoBK06Vg(iArr, i, i2);
        int i3 = iM465partitionoBK06Vg - 1;
        if (i < i3) {
            m469quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM465partitionoBK06Vg < i2) {
            m469quickSortoBK06Vg(iArr, iM465partitionoBK06Vg, i2);
        }
    }

    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m462partitionnroSd4(long[] jArr, int i, int i2) {
        long jM254getsVKNKU = ULongArray.m254getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (UnsignedKt.ulongCompare(ULongArray.m254getsVKNKU(jArr, i), jM254getsVKNKU) < 0) {
                i++;
            }
            while (UnsignedKt.ulongCompare(ULongArray.m254getsVKNKU(jArr, i2), jM254getsVKNKU) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM254getsVKNKU2 = ULongArray.m254getsVKNKU(jArr, i);
                ULongArray.m259setk8EXiF4(jArr, i, ULongArray.m254getsVKNKU(jArr, i2));
                ULongArray.m259setk8EXiF4(jArr, i2, jM254getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m466quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM462partitionnroSd4 = m462partitionnroSd4(jArr, i, i2);
        int i3 = iM462partitionnroSd4 - 1;
        if (i < i3) {
            m466quickSortnroSd4(jArr, i, i3);
        }
        if (iM462partitionnroSd4 < i2) {
            m466quickSortnroSd4(jArr, iM462partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m471sortArray4UcCI2c(byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m467quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m472sortArrayAa5vz7o(short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m468quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m473sortArrayoBK06Vg(int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m469quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m470sortArraynroSd4(long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m466quickSortnroSd4(array, i, i2 - 1);
    }
}
