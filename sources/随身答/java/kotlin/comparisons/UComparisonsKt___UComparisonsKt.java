package kotlin.comparisons;

import androidx.constraintlayout.widget.ConstraintLayout;
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
@Metadata(m13412d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000e\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b,\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b-\u0010\u0017\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010\u001b\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u001e\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, m13413d2 = {"maxOf", "Lkotlin/UInt;", "a", "b", "maxOf-J1ME1BU", "(II)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "c", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "other", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-J1ME1BU", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4", "kotlin-stdlib"}, m13414k = 5, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, m13418xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes5.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m25938maxOf5PvTz6A(short s9, short s10) {
        return Intrinsics.compare(s9 & UShort.MAX_VALUE, 65535 & s10) >= 0 ? s9 : s10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m25939maxOfJ1ME1BU(int i9, int i10) {
        return Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) >= 0 ? i9 : i10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m25940maxOfKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) >= 0 ? b10 : b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m25941maxOfMd2H83M(int i9, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24914getSizeimpl = UIntArray.m24914getSizeimpl(other);
        for (int i10 = 0; i10 < iM24914getSizeimpl; i10++) {
            i9 = m25939maxOfJ1ME1BU(i9, UIntArray.m24913getpVg5ArA(other, i10));
        }
        return i9;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m25942maxOfR03FKyM(long j9, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24993getSizeimpl = ULongArray.m24993getSizeimpl(other);
        for (int i9 = 0; i9 < iM24993getSizeimpl; i9++) {
            j9 = m25947maxOfeb3DHEI(j9, ULongArray.m24992getsVKNKU(other, i9));
        }
        return j9;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m25943maxOfVKSA0NQ(short s9, short s10, short s11) {
        return m25938maxOf5PvTz6A(s9, m25938maxOf5PvTz6A(s10, s11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m25944maxOfWZ9TVnA(int i9, int i10, int i11) {
        return m25939maxOfJ1ME1BU(i9, m25939maxOfJ1ME1BU(i10, i11));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m25945maxOfWr6uiD8(byte b10, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24835getSizeimpl = UByteArray.m24835getSizeimpl(other);
        for (int i9 = 0; i9 < iM24835getSizeimpl; i9++) {
            b10 = m25940maxOfKr8caGY(b10, UByteArray.m24834getw2LRezQ(other, i9));
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m25946maxOfb33U2AM(byte b10, byte b11, byte b12) {
        return m25940maxOfKr8caGY(b10, m25940maxOfKr8caGY(b11, b12));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m25947maxOfeb3DHEI(long j9, long j10) {
        return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) >= 0 ? j9 : j10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m25948maxOfsambcqE(long j9, long j10, long j11) {
        return m25947maxOfeb3DHEI(j9, m25947maxOfeb3DHEI(j10, j11));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m25949maxOft1qELG4(short s9, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM25098getSizeimpl = UShortArray.m25098getSizeimpl(other);
        for (int i9 = 0; i9 < iM25098getSizeimpl; i9++) {
            s9 = m25938maxOf5PvTz6A(s9, UShortArray.m25097getMh2AYeg(other, i9));
        }
        return s9;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m25950minOf5PvTz6A(short s9, short s10) {
        return Intrinsics.compare(s9 & UShort.MAX_VALUE, 65535 & s10) <= 0 ? s9 : s10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m25951minOfJ1ME1BU(int i9, int i10) {
        return Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) <= 0 ? i9 : i10;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m25952minOfKr8caGY(byte b10, byte b11) {
        return Intrinsics.compare(b10 & UByte.MAX_VALUE, b11 & UByte.MAX_VALUE) <= 0 ? b10 : b11;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m25953minOfMd2H83M(int i9, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24914getSizeimpl = UIntArray.m24914getSizeimpl(other);
        for (int i10 = 0; i10 < iM24914getSizeimpl; i10++) {
            i9 = m25951minOfJ1ME1BU(i9, UIntArray.m24913getpVg5ArA(other, i10));
        }
        return i9;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m25954minOfR03FKyM(long j9, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24993getSizeimpl = ULongArray.m24993getSizeimpl(other);
        for (int i9 = 0; i9 < iM24993getSizeimpl; i9++) {
            j9 = m25959minOfeb3DHEI(j9, ULongArray.m24992getsVKNKU(other, i9));
        }
        return j9;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m25955minOfVKSA0NQ(short s9, short s10, short s11) {
        return m25950minOf5PvTz6A(s9, m25950minOf5PvTz6A(s10, s11));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m25956minOfWZ9TVnA(int i9, int i10, int i11) {
        return m25951minOfJ1ME1BU(i9, m25951minOfJ1ME1BU(i10, i11));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m25957minOfWr6uiD8(byte b10, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM24835getSizeimpl = UByteArray.m24835getSizeimpl(other);
        for (int i9 = 0; i9 < iM24835getSizeimpl; i9++) {
            b10 = m25952minOfKr8caGY(b10, UByteArray.m24834getw2LRezQ(other, i9));
        }
        return b10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m25958minOfb33U2AM(byte b10, byte b11, byte b12) {
        return m25952minOfKr8caGY(b10, m25952minOfKr8caGY(b11, b12));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m25959minOfeb3DHEI(long j9, long j10) {
        return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) <= 0 ? j9 : j10;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m25960minOfsambcqE(long j9, long j10, long j11) {
        return m25959minOfeb3DHEI(j9, m25959minOfeb3DHEI(j10, j11));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m25961minOft1qELG4(short s9, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM25098getSizeimpl = UShortArray.m25098getSizeimpl(other);
        for (int i9 = 0; i9 < iM25098getSizeimpl; i9++) {
            s9 = m25950minOf5PvTz6A(s9, UShortArray.m25097getMh2AYeg(other, i9));
        }
        return s9;
    }
}
