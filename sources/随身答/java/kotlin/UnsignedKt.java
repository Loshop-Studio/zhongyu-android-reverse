package kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(m13412d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0001¢\u0006\u0004\b\r\u0010\u000b\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0001\u001a\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011H\u0001\u001a\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b¢\u0006\u0002\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0016\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010\u0019\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0015\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001d\u001a\u0011\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0016\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0017H\u0081\b¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0011H\u0001\u001a\u0015\u0010\"\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010#\u001a\u0011\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000fH\u0081\b\u001a\u0019\u0010$\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0081\b\u001a\u0011\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0011H\u0081\b\u001a\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u000fH\u0000¨\u0006("}, m13413d2 = {"uintRemainder", "Lkotlin/UInt;", "v1", "v2", "uintRemainder-J1ME1BU", "(II)I", "uintDivide", "uintDivide-J1ME1BU", "ulongDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "uintCompare", "", "ulongCompare", "", "uintToULong", "value", "(I)J", "uintToLong", "uintToFloat", "", "floatToUInt", "(F)I", "uintToDouble", "", "doubleToUInt", "(D)I", "ulongToFloat", "floatToULong", "(F)J", "ulongToDouble", "doubleToULong", "(D)J", "uintToString", "", "base", "ulongToString", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "UnsignedKt")
/* loaded from: classes5.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d10) {
        if (Double.isNaN(d10) || d10 <= uintToDouble(0)) {
            return 0;
        }
        if (d10 >= uintToDouble(-1)) {
            return -1;
        }
        return d10 <= 2.147483647E9d ? UInt.m24853constructorimpl((int) d10) : UInt.m24853constructorimpl(UInt.m24853constructorimpl((int) (d10 - Integer.MAX_VALUE)) + UInt.m24853constructorimpl(Integer.MAX_VALUE));
    }

    @PublishedApi
    public static final long doubleToULong(double d10) {
        if (Double.isNaN(d10) || d10 <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d10 >= ulongToDouble(-1L)) {
            return -1L;
        }
        return d10 < 9.223372036854776E18d ? ULong.m24932constructorimpl((long) d10) : ULong.m24932constructorimpl(ULong.m24932constructorimpl((long) (d10 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @PublishedApi
    @InlineOnly
    private static final int floatToUInt(float f10) {
        return doubleToUInt(f10);
    }

    @PublishedApi
    @InlineOnly
    private static final long floatToULong(float f10) {
        return doubleToULong(f10);
    }

    @PublishedApi
    public static final int uintCompare(int i9, int i10) {
        return Intrinsics.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m25109uintDivideJ1ME1BU(int i9, int i10) {
        return UInt.m24853constructorimpl((int) ((i9 & 4294967295L) / (i10 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m25110uintRemainderJ1ME1BU(int i9, int i10) {
        return UInt.m24853constructorimpl((int) ((i9 & 4294967295L) % (i10 & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i9) {
        return (Integer.MAX_VALUE & i9) + (((i9 >>> 31) << 30) * 2);
    }

    @PublishedApi
    @InlineOnly
    private static final float uintToFloat(int i9) {
        return (float) uintToDouble(i9);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToLong(int i9) {
        return i9 & 4294967295L;
    }

    @InlineOnly
    private static final String uintToString(int i9) {
        return String.valueOf(i9 & 4294967295L);
    }

    @PublishedApi
    @InlineOnly
    private static final long uintToULong(int i9) {
        return ULong.m24932constructorimpl(i9 & 4294967295L);
    }

    @PublishedApi
    public static final int ulongCompare(long j9, long j10) {
        return Intrinsics.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m25111ulongDivideeb3DHEI(long j9, long j10) {
        if (j10 < 0) {
            return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) < 0 ? ULong.m24932constructorimpl(0L) : ULong.m24932constructorimpl(1L);
        }
        if (j9 >= 0) {
            return ULong.m24932constructorimpl(j9 / j10);
        }
        long j11 = ((j9 >>> 1) / j10) << 1;
        return ULong.m24932constructorimpl(j11 + (Long.compare(ULong.m24932constructorimpl(j9 - (j11 * j10)) ^ Long.MIN_VALUE, ULong.m24932constructorimpl(j10) ^ Long.MIN_VALUE) < 0 ? 0 : 1));
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m25112ulongRemaindereb3DHEI(long j9, long j10) {
        if (j10 < 0) {
            return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) < 0 ? j9 : ULong.m24932constructorimpl(j9 - j10);
        }
        if (j9 >= 0) {
            return ULong.m24932constructorimpl(j9 % j10);
        }
        long j11 = j9 - ((((j9 >>> 1) / j10) << 1) * j10);
        if (Long.compare(ULong.m24932constructorimpl(j11) ^ Long.MIN_VALUE, ULong.m24932constructorimpl(j10) ^ Long.MIN_VALUE) < 0) {
            j10 = 0;
        }
        return ULong.m24932constructorimpl(j11 - j10);
    }

    @PublishedApi
    public static final double ulongToDouble(long j9) {
        return ((j9 >>> 11) * 2048) + (j9 & 2047);
    }

    @PublishedApi
    @InlineOnly
    private static final float ulongToFloat(long j9) {
        return (float) ulongToDouble(j9);
    }

    @InlineOnly
    private static final String ulongToString(long j9) {
        return ulongToString(j9, 10);
    }

    @InlineOnly
    private static final String uintToString(int i9, int i10) {
        return ulongToString(i9 & 4294967295L, i10);
    }

    public static final String ulongToString(long j9, int i9) {
        if (j9 >= 0) {
            String string = Long.toString(j9, CharsKt.checkRadix(i9));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j10 = i9;
        long j11 = ((j9 >>> 1) / j10) << 1;
        long j12 = j9 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j11, CharsKt.checkRadix(i9));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j12, CharsKt.checkRadix(i9));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
