package kotlin.internal;

import kotlin.AbstractC6703b;
import kotlin.AbstractC6704c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(m7879d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m7880d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m18388differenceModuloWZ9TVnA(int i6, int i7, int i8) {
        int iM7889a = AbstractC6703b.m7889a(i6, i8);
        int iM7889a2 = AbstractC6703b.m7889a(i7, i8);
        int iCompare = Integer.compare(iM7889a ^ Integer.MIN_VALUE, iM7889a2 ^ Integer.MIN_VALUE);
        int iM17278constructorimpl = UInt.m17278constructorimpl(iM7889a - iM7889a2);
        return iCompare >= 0 ? iM17278constructorimpl : UInt.m17278constructorimpl(iM17278constructorimpl + i8);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m18389differenceModulosambcqE(long j6, long j7, long j8) {
        long jM7890a = AbstractC6704c.m7890a(j6, j8);
        long jM7890a2 = AbstractC6704c.m7890a(j7, j8);
        int iCompare = Long.compare(jM7890a ^ Long.MIN_VALUE, jM7890a2 ^ Long.MIN_VALUE);
        long jM17357constructorimpl = ULong.m17357constructorimpl(jM7890a - jM7890a2);
        return iCompare >= 0 ? jM17357constructorimpl : ULong.m17357constructorimpl(jM17357constructorimpl + j8);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m18390getProgressionLastElement7ftBX0g(long j6, long j7, long j8) {
        if (j8 > 0) {
            return Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) >= 0 ? j7 : ULong.m17357constructorimpl(j7 - m18389differenceModulosambcqE(j7, j6, ULong.m17357constructorimpl(j8)));
        }
        if (j8 < 0) {
            return Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE) <= 0 ? j7 : ULong.m17357constructorimpl(j7 + m18389differenceModulosambcqE(j6, j7, ULong.m17357constructorimpl(-j8)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m18391getProgressionLastElementNkh28Cs(int i6, int i7, int i8) {
        if (i8 > 0) {
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m17278constructorimpl(i7 - m18388differenceModuloWZ9TVnA(i7, i6, UInt.m17278constructorimpl(i8)));
            }
        } else {
            if (i8 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m17278constructorimpl(i7 + m18388differenceModuloWZ9TVnA(i6, i7, UInt.m17278constructorimpl(-i8)));
            }
        }
        return i7;
    }
}
