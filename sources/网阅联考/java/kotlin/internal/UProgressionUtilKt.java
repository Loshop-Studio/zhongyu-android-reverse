package kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.AbstractC3865a;
import kotlin.AbstractC3922d;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m5175d2 = {"differenceModulo", "Lkotlin/UInt;", C3335ai.f1705at, "b", C3335ai.f1663aD, "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m13017differenceModuloWZ9TVnA(int i4, int i5, int i6) {
        int iM5183a = AbstractC3865a.m5183a(i4, i6);
        int iM5183a2 = AbstractC3865a.m5183a(i5, i6);
        int iCompare = Integer.compare(iM5183a ^ Integer.MIN_VALUE, iM5183a2 ^ Integer.MIN_VALUE);
        int iM11883constructorimpl = UInt.m11883constructorimpl(iM5183a - iM5183a2);
        return iCompare >= 0 ? iM11883constructorimpl : UInt.m11883constructorimpl(iM11883constructorimpl + i6);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m13018differenceModulosambcqE(long j4, long j5, long j6) {
        long jM5199a = AbstractC3922d.m5199a(j4, j6);
        long jM5199a2 = AbstractC3922d.m5199a(j5, j6);
        int iCompare = Long.compare(jM5199a ^ Long.MIN_VALUE, jM5199a2 ^ Long.MIN_VALUE);
        long jM11962constructorimpl = ULong.m11962constructorimpl(jM5199a - jM5199a2);
        return iCompare >= 0 ? jM11962constructorimpl : ULong.m11962constructorimpl(jM11962constructorimpl + j6);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m13019getProgressionLastElement7ftBX0g(long j4, long j5, long j6) {
        if (j6 > 0) {
            return Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) >= 0 ? j5 : ULong.m11962constructorimpl(j5 - m13018differenceModulosambcqE(j5, j4, ULong.m11962constructorimpl(j6)));
        }
        if (j6 < 0) {
            return Long.compare(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE) <= 0 ? j5 : ULong.m11962constructorimpl(j5 + m13018differenceModulosambcqE(j4, j5, ULong.m11962constructorimpl(-j6)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m13020getProgressionLastElementNkh28Cs(int i4, int i5, int i6) {
        if (i6 > 0) {
            return Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) >= 0 ? i5 : UInt.m11883constructorimpl(i5 - m13017differenceModuloWZ9TVnA(i5, i4, UInt.m11883constructorimpl(i6)));
        }
        if (i6 < 0) {
            return Integer.compare(i4 ^ Integer.MIN_VALUE, i5 ^ Integer.MIN_VALUE) <= 0 ? i5 : UInt.m11883constructorimpl(i5 + m13017differenceModuloWZ9TVnA(i4, i5, UInt.m11883constructorimpl(-i6)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
