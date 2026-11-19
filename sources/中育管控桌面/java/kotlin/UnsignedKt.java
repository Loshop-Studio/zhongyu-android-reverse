package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(m7879d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H\u0001\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0016\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0001\u001a\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010#\u001a\u0011\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0019\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fH\u0000¨\u0006("}, m7880d2 = {"uintRemainder", "Lkotlin/UInt;", "v1", "v2", "uintRemainder-J1ME1BU", "(II)I", "uintDivide", "uintDivide-J1ME1BU", "ulongDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "uintCompare", "", "ulongCompare", "", "uintToULong", "value", "(I)J", "uintToLong", "uintToFloat", "", "floatToUInt", "(F)I", "uintToDouble", "", "doubleToUInt", "(D)I", "ulongToFloat", "floatToULong", "(F)J", "ulongToDouble", "doubleToULong", "(D)J", "uintToString", "", "base", "ulongToString", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
@JvmName(name = "UnsignedKt")
/* loaded from: classes4.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d6) {
        if (Double.isNaN(d6) || d6 <= uintToDouble(0)) {
            return 0;
        }
        if (d6 >= uintToDouble(-1)) {
            return -1;
        }
        return d6 <= 2.147483647E9d ? UInt.m17278constructorimpl((int) d6) : UInt.m17278constructorimpl(UInt.m17278constructorimpl((int) (d6 - Integer.MAX_VALUE)) + UInt.m17278constructorimpl(Integer.MAX_VALUE));
    }

    @PublishedApi
    public static final long doubleToULong(double d6) {
        if (Double.isNaN(d6) || d6 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d6 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d6 < 9.223372036854776E18d ? ULong.m17357constructorimpl((long) d6) : ULong.m17357constructorimpl(ULong.m17357constructorimpl((long) (d6 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float f6) {
        return doubleToUInt(f6);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float f6) {
        return doubleToULong(f6);
    }

    @PublishedApi
    public static final int uintCompare(int i6, int i7) {
        return Intrinsics.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m17534uintDivideJ1ME1BU(int i6, int i7) {
        return UInt.m17278constructorimpl((int) ((i6 & 4294967295L) / (i7 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m17535uintRemainderJ1ME1BU(int i6, int i7) {
        return UInt.m17278constructorimpl((int) ((i6 & 4294967295L) % (i7 & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i6) {
        return (Integer.MAX_VALUE & i6) + (((i6 >>> 31) << 30) * 2);
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int i6) {
        return (float) uintToDouble(i6);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int i6) {
        return i6 & 4294967295L;
    }

    @InlineOnly
    private static final String uintToString(int i6) {
        return String.valueOf(i6 & 4294967295L);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int i6) {
        return ULong.m17357constructorimpl(i6 & 4294967295L);
    }

    @PublishedApi
    public static final int ulongCompare(long j6, long j7) {
        return Intrinsics.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m17536ulongDivideeb3DHEI(long j6, long j7) {
        if (j7 < 0) {
            return Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0 ? ULong.m17357constructorimpl(0L) : ULong.m17357constructorimpl(1L);
        }
        if (j6 >= 0) {
            return ULong.m17357constructorimpl(j6 / j7);
        }
        long j8 = ((j6 >>> 1) / j7) << 1;
        return ULong.m17357constructorimpl(j8 + (Long.compare(ULong.m17357constructorimpl(j6 - (j8 * j7)) ^ Long.MIN_VALUE, ULong.m17357constructorimpl(j7) ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m17537ulongRemaindereb3DHEI(long j6, long j7) {
        if (j7 < 0) {
            return Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) < 0 ? j6 : ULong.m17357constructorimpl(j6 - j7);
        }
        if (j6 >= 0) {
            return ULong.m17357constructorimpl(j6 % j7);
        }
        long j8 = j6 - ((((j6 >>> 1) / j7) << 1) * j7);
        if (Long.compare(ULong.m17357constructorimpl(j8) ^ Long.MIN_VALUE, ULong.m17357constructorimpl(j7) ^ Long.MIN_VALUE) < 0) {
            j7 = 0;
        }
        return ULong.m17357constructorimpl(j8 - j7);
    }

    @PublishedApi
    public static final double ulongToDouble(long j6) {
        return ((j6 >>> 11) * 2048) + (j6 & 2047);
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long j6) {
        return (float) ulongToDouble(j6);
    }

    @InlineOnly
    private static final String ulongToString(long j6) {
        return ulongToString(j6, 10);
    }

    @InlineOnly
    private static final String uintToString(int i6, int i7) {
        return ulongToString(i6 & 4294967295L, i7);
    }

    public static final String ulongToString(long j6, int i6) {
        if (j6 >= 0) {
            String string = Long.toString(j6, CharsKt.checkRadix(i6));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j7 = i6;
        long j8 = ((j6 >>> 1) / j7) << 1;
        long j9 = j6 - (j8 * j7);
        if (j9 >= j7) {
            j9 -= j7;
            j8++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j8, CharsKt.checkRadix(i6));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j9, CharsKt.checkRadix(i6));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
