package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m13557d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000e\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b,\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b-\u0010\u0017\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010\u001b\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u001e\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, m13558d2 = {"maxOf", "Lkotlin/UInt;", "a", "b", "maxOf-J1ME1BU", "(II)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "c", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "other", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-J1ME1BU", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4", "kotlin-stdlib"}, m13559k = 5, m13560mv = {2, 2, 0}, m13562xi = 49, m13563xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes5.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m25479maxOf5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 65535 & s11) >= 0 ? s10 : s11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m25480maxOfJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) >= 0 ? i10 : i11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m25481maxOfKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) >= 0 ? b10 : b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m25482maxOfMd2H83M(int i10, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24455getSizeimpl = UIntArray.m24455getSizeimpl(other);
        for (int i11 = 0; i11 < iM24455getSizeimpl; i11++) {
            i10 = m25480maxOfJ1ME1BU(i10, UIntArray.m24454getpVg5ArA(other, i11));
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m25483maxOfR03FKyM(long j10, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24534getSizeimpl = ULongArray.m24534getSizeimpl(other);
        for (int i10 = 0; i10 < iM24534getSizeimpl; i10++) {
            j10 = m25488maxOfeb3DHEI(j10, ULongArray.m24533getsVKNKU(other, i10));
        }
        return j10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m25484maxOfVKSA0NQ(short s10, short s11, short s12) {
        return m25479maxOf5PvTz6A(s10, m25479maxOf5PvTz6A(s11, s12));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m25485maxOfWZ9TVnA(int i10, int i11, int i12) {
        return m25480maxOfJ1ME1BU(i10, m25480maxOfJ1ME1BU(i11, i12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m25486maxOfWr6uiD8(byte b10, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24376getSizeimpl = UByteArray.m24376getSizeimpl(other);
        for (int i10 = 0; i10 < iM24376getSizeimpl; i10++) {
            b10 = m25481maxOfKr8caGY(b10, UByteArray.m24375getw2LRezQ(other, i10));
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m25487maxOfb33U2AM(byte b10, byte b11, byte b12) {
        return m25481maxOfKr8caGY(b10, m25481maxOfKr8caGY(b11, b12));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m25488maxOfeb3DHEI(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j10 : j11;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m25489maxOfsambcqE(long j10, long j11, long j12) {
        return m25488maxOfeb3DHEI(j10, m25488maxOfeb3DHEI(j11, j12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m25490maxOft1qELG4(short s10, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24639getSizeimpl = UShortArray.m24639getSizeimpl(other);
        for (int i10 = 0; i10 < iM24639getSizeimpl; i10++) {
            s10 = m25479maxOf5PvTz6A(s10, UShortArray.m24638getMh2AYeg(other, i10));
        }
        return s10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m25491minOf5PvTz6A(short s10, short s11) {
        return Intrinsics.compare(s10 & UShort.MAX_VALUE, 65535 & s11) <= 0 ? s10 : s11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m25492minOfJ1ME1BU(int i10, int i11) {
        return Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) <= 0 ? i10 : i11;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m25493minOfKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) <= 0 ? b10 : b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m25494minOfMd2H83M(int i10, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24455getSizeimpl = UIntArray.m24455getSizeimpl(other);
        for (int i11 = 0; i11 < iM24455getSizeimpl; i11++) {
            i10 = m25492minOfJ1ME1BU(i10, UIntArray.m24454getpVg5ArA(other, i11));
        }
        return i10;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m25495minOfR03FKyM(long j10, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24534getSizeimpl = ULongArray.m24534getSizeimpl(other);
        for (int i10 = 0; i10 < iM24534getSizeimpl; i10++) {
            j10 = m25500minOfeb3DHEI(j10, ULongArray.m24533getsVKNKU(other, i10));
        }
        return j10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m25496minOfVKSA0NQ(short s10, short s11, short s12) {
        return m25491minOf5PvTz6A(s10, m25491minOf5PvTz6A(s11, s12));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m25497minOfWZ9TVnA(int i10, int i11, int i12) {
        return m25492minOfJ1ME1BU(i10, m25492minOfJ1ME1BU(i11, i12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m25498minOfWr6uiD8(byte b10, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24376getSizeimpl = UByteArray.m24376getSizeimpl(other);
        for (int i10 = 0; i10 < iM24376getSizeimpl; i10++) {
            b10 = m25493minOfKr8caGY(b10, UByteArray.m24375getw2LRezQ(other, i10));
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m25499minOfb33U2AM(byte b10, byte b11, byte b12) {
        return m25493minOfKr8caGY(b10, m25493minOfKr8caGY(b11, b12));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m25500minOfeb3DHEI(long j10, long j11) {
        return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j10 : j11;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m25501minOfsambcqE(long j10, long j11, long j12) {
        return m25500minOfeb3DHEI(j10, m25500minOfeb3DHEI(j11, j12));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m25502minOft1qELG4(short s10, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24639getSizeimpl = UShortArray.m24639getSizeimpl(other);
        for (int i10 = 0; i10 < iM24639getSizeimpl; i10++) {
            s10 = m25491minOf5PvTz6A(s10, UShortArray.m24638getMh2AYeg(other, i10));
        }
        return s10;
    }
}
