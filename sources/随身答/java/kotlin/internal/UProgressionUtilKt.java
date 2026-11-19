package kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC8301b;
import kotlin.AbstractC8302c;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(m13412d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m13413d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m13414k = 2, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m25963differenceModuloWZ9TVnA(int i9, int i10, int i11) {
        int iM13422a = AbstractC8301b.m13422a(i9, i11);
        int iM13422a2 = AbstractC8301b.m13422a(i10, i11);
        int iCompare = Integer.compare(iM13422a ^ Integer.MIN_VALUE, iM13422a2 ^ Integer.MIN_VALUE);
        int iM24853constructorimpl = UInt.m24853constructorimpl(iM13422a - iM13422a2);
        return iCompare >= 0 ? iM24853constructorimpl : UInt.m24853constructorimpl(iM24853constructorimpl + i11);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m25964differenceModulosambcqE(long j9, long j10, long j11) {
        long jM13423a = AbstractC8302c.m13423a(j9, j11);
        long jM13423a2 = AbstractC8302c.m13423a(j10, j11);
        int iCompare = Long.compare(jM13423a ^ Long.MIN_VALUE, jM13423a2 ^ Long.MIN_VALUE);
        long jM24932constructorimpl = ULong.m24932constructorimpl(jM13423a - jM13423a2);
        return iCompare >= 0 ? jM24932constructorimpl : ULong.m24932constructorimpl(jM24932constructorimpl + j11);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m25965getProgressionLastElement7ftBX0g(long j9, long j10, long j11) {
        if (j11 > 0) {
            return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) >= 0 ? j10 : ULong.m24932constructorimpl(j10 - m25964differenceModulosambcqE(j10, j9, ULong.m24932constructorimpl(j11)));
        }
        if (j11 < 0) {
            return Long.compare(j9 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE) <= 0 ? j10 : ULong.m24932constructorimpl(j10 + m25964differenceModulosambcqE(j9, j10, ULong.m24932constructorimpl(-j11)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m25966getProgressionLastElementNkh28Cs(int i9, int i10, int i11) {
        if (i11 > 0) {
            if (Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m24853constructorimpl(i10 - m25963differenceModuloWZ9TVnA(i10, i9, UInt.m24853constructorimpl(i11)));
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (Integer.compare(i9 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m24853constructorimpl(i10 + m25963differenceModuloWZ9TVnA(i9, i10, UInt.m24853constructorimpl(-i11)));
            }
        }
        return i10;
    }
}
