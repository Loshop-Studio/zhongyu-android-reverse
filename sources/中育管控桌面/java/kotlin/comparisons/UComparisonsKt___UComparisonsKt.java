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
@Metadata(m7879d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u0000\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b(\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000e\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b+\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b,\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b-\u0010\u0017\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0018\u001a\u00020\u0019\"\u00020\u0001H\u0007¢\u0006\u0004\b.\u0010\u001b\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u0018\u001a\u00020\u001c\"\u00020\u0006H\u0007¢\u0006\u0004\b/\u0010\u001e\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\n\u0010\u0018\u001a\u00020\u001f\"\u00020\tH\u0007¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u0018\u001a\u00020\"\"\u00020\fH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, m7880d2 = {"maxOf", "Lkotlin/UInt;", "a", "b", "maxOf-J1ME1BU", "(II)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "c", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "other", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-J1ME1BU", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4", "kotlin-stdlib"}, m7881k = 5, m7882mv = {2, 2, 0}, m7884xi = 49, m7885xs = "kotlin/comparisons/UComparisonsKt")
/* loaded from: classes4.dex */
public class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m18363maxOf5PvTz6A(short s6, short s7) {
        return Intrinsics.compare(s6 & UShort.MAX_VALUE, 65535 & s7) >= 0 ? s6 : s7;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m18364maxOfJ1ME1BU(int i6, int i7) {
        return Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE) >= 0 ? i6 : i7;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m18365maxOfKr8caGY(byte b7, byte b8) {
        return Intrinsics.compare(b7 & UByte.MAX_VALUE, b8 & UByte.MAX_VALUE) >= 0 ? b7 : b8;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m18366maxOfMd2H83M(int i6, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17339getSizeimpl = UIntArray.m17339getSizeimpl(other);
        for (int i7 = 0; i7 < iM17339getSizeimpl; i7++) {
            i6 = m18364maxOfJ1ME1BU(i6, UIntArray.m17338getpVg5ArA(other, i7));
        }
        return i6;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m18367maxOfR03FKyM(long j6, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17418getSizeimpl = ULongArray.m17418getSizeimpl(other);
        for (int i6 = 0; i6 < iM17418getSizeimpl; i6++) {
            j6 = m18372maxOfeb3DHEI(j6, ULongArray.m17417getsVKNKU(other, i6));
        }
        return j6;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m18368maxOfVKSA0NQ(short s6, short s7, short s8) {
        return m18363maxOf5PvTz6A(s6, m18363maxOf5PvTz6A(s7, s8));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m18369maxOfWZ9TVnA(int i6, int i7, int i8) {
        return m18364maxOfJ1ME1BU(i6, m18364maxOfJ1ME1BU(i7, i8));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m18370maxOfWr6uiD8(byte b7, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17260getSizeimpl = UByteArray.m17260getSizeimpl(other);
        for (int i6 = 0; i6 < iM17260getSizeimpl; i6++) {
            b7 = m18365maxOfKr8caGY(b7, UByteArray.m17259getw2LRezQ(other, i6));
        }
        return b7;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m18371maxOfb33U2AM(byte b7, byte b8, byte b9) {
        return m18365maxOfKr8caGY(b7, m18365maxOfKr8caGY(b8, b9));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m18372maxOfeb3DHEI(long j6, long j7) {
        return Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) >= 0 ? j6 : j7;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m18373maxOfsambcqE(long j6, long j7, long j8) {
        return m18372maxOfeb3DHEI(j6, m18372maxOfeb3DHEI(j7, j8));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m18374maxOft1qELG4(short s6, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17523getSizeimpl = UShortArray.m17523getSizeimpl(other);
        for (int i6 = 0; i6 < iM17523getSizeimpl; i6++) {
            s6 = m18363maxOf5PvTz6A(s6, UShortArray.m17522getMh2AYeg(other, i6));
        }
        return s6;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m18375minOf5PvTz6A(short s6, short s7) {
        return Intrinsics.compare(s6 & UShort.MAX_VALUE, 65535 & s7) <= 0 ? s6 : s7;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m18376minOfJ1ME1BU(int i6, int i7) {
        return Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE) <= 0 ? i6 : i7;
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m18377minOfKr8caGY(byte b7, byte b8) {
        return Intrinsics.compare(b7 & UByte.MAX_VALUE, b8 & UByte.MAX_VALUE) <= 0 ? b7 : b8;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m18378minOfMd2H83M(int i6, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17339getSizeimpl = UIntArray.m17339getSizeimpl(other);
        for (int i7 = 0; i7 < iM17339getSizeimpl; i7++) {
            i6 = m18376minOfJ1ME1BU(i6, UIntArray.m17338getpVg5ArA(other, i7));
        }
        return i6;
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m18379minOfR03FKyM(long j6, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17418getSizeimpl = ULongArray.m17418getSizeimpl(other);
        for (int i6 = 0; i6 < iM17418getSizeimpl; i6++) {
            j6 = m18384minOfeb3DHEI(j6, ULongArray.m17417getsVKNKU(other, i6));
        }
        return j6;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m18380minOfVKSA0NQ(short s6, short s7, short s8) {
        return m18375minOf5PvTz6A(s6, m18375minOf5PvTz6A(s7, s8));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m18381minOfWZ9TVnA(int i6, int i7, int i8) {
        return m18376minOfJ1ME1BU(i6, m18376minOfJ1ME1BU(i7, i8));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m18382minOfWr6uiD8(byte b7, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17260getSizeimpl = UByteArray.m17260getSizeimpl(other);
        for (int i6 = 0; i6 < iM17260getSizeimpl; i6++) {
            b7 = m18377minOfKr8caGY(b7, UByteArray.m17259getw2LRezQ(other, i6));
        }
        return b7;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m18383minOfb33U2AM(byte b7, byte b8, byte b9) {
        return m18377minOfKr8caGY(b7, m18377minOfKr8caGY(b8, b9));
    }

    @SinceKotlin(version = "1.5")
    /* renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m18384minOfeb3DHEI(long j6, long j7) {
        return Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) <= 0 ? j6 : j7;
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m18385minOfsambcqE(long j6, long j7, long j8) {
        return m18384minOfeb3DHEI(j6, m18384minOfeb3DHEI(j7, j8));
    }

    @SinceKotlin(version = "1.4")
    @ExperimentalUnsignedTypes
    /* renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m18386minOft1qELG4(short s6, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iM17523getSizeimpl = UShortArray.m17523getSizeimpl(other);
        for (int i6 = 0; i6 < iM17523getSizeimpl; i6++) {
            s6 = m18375minOf5PvTz6A(s6, UShortArray.m17522getMh2AYeg(other, i6));
        }
        return s6;
    }
}
