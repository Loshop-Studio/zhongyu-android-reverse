package kotlin.internal;

import kotlin.AbstractC7919b;
import kotlin.AbstractC7920c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(m13557d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m13558d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m25504differenceModuloWZ9TVnA(int i10, int i11, int i12) {
        int iM13567a = AbstractC7919b.m13567a(i10, i12);
        int iM13567a2 = AbstractC7919b.m13567a(i11, i12);
        int iCompare = Integer.compare(iM13567a ^ Integer.MIN_VALUE, iM13567a2 ^ Integer.MIN_VALUE);
        int iM24394constructorimpl = UInt.m24394constructorimpl(iM13567a - iM13567a2);
        return iCompare >= 0 ? iM24394constructorimpl : UInt.m24394constructorimpl(iM24394constructorimpl + i12);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m25505differenceModulosambcqE(long j10, long j11, long j12) {
        long jM13568a = AbstractC7920c.m13568a(j10, j12);
        long jM13568a2 = AbstractC7920c.m13568a(j11, j12);
        int iCompare = Long.compare(jM13568a ^ Long.MIN_VALUE, jM13568a2 ^ Long.MIN_VALUE);
        long jM24473constructorimpl = ULong.m24473constructorimpl(jM13568a - jM13568a2);
        return iCompare >= 0 ? jM24473constructorimpl : ULong.m24473constructorimpl(jM24473constructorimpl + j12);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m25506getProgressionLastElement7ftBX0g(long j10, long j11, long j12) {
        if (j12 > 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) >= 0 ? j11 : ULong.m24473constructorimpl(j11 - m25505differenceModulosambcqE(j11, j10, ULong.m24473constructorimpl(j12)));
        }
        if (j12 < 0) {
            return Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) <= 0 ? j11 : ULong.m24473constructorimpl(j11 + m25505differenceModulosambcqE(j10, j11, ULong.m24473constructorimpl(-j12)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m25507getProgressionLastElementNkh28Cs(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m24394constructorimpl(i11 - m25504differenceModuloWZ9TVnA(i11, i10, UInt.m24394constructorimpl(i12)));
            }
        } else {
            if (i12 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m24394constructorimpl(i11 + m25504differenceModuloWZ9TVnA(i10, i11, UInt.m24394constructorimpl(-i12)));
            }
        }
        return i11;
    }
}
