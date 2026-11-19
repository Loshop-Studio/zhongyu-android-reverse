package androidx.compose.animation.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m20276boximpl(long j10) {
        return new StartOffset(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m20278constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m20279constructorimpl$default(int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
        if ((i12 & 2) != 0) {
            i11 = StartOffsetType.Companion.m20294getDelayEo1U57Q();
        }
        return m20277constructorimpl(i10, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20280equalsimpl(long j10, Object obj) {
        return (obj instanceof StartOffset) && j10 == ((StartOffset) obj).m20286unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20281equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m20282getOffsetMillisimpl(long j10) {
        return Math.abs((int) j10);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m20283getOffsetTypeEo1U57Q(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            return StartOffsetType.Companion.m20295getFastForwardEo1U57Q();
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.Companion.m20294getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20284hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20285toStringimpl(long j10) {
        return "StartOffset(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m20280equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20284hashCodeimpl(this.value);
    }

    public String toString() {
        return m20285toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20286unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20277constructorimpl(int i10, int i11) {
        return m20278constructorimpl(i10 * i11);
    }
}
