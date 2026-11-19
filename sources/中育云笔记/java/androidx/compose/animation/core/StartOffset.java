package androidx.compose.animation.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    private /* synthetic */ StartOffset(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StartOffset m26878boximpl(long j10) {
        return new StartOffset(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m26880constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m26881constructorimpl$default(int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
        if ((i12 & 2) != 0) {
            i11 = StartOffsetType.Companion.m26896getDelayEo1U57Q();
        }
        return m26879constructorimpl(i10, i11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26882equalsimpl(long j10, Object obj) {
        return (obj instanceof StartOffset) && j10 == ((StartOffset) obj).m26888unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26883equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m26884getOffsetMillisimpl(long j10) {
        return Math.abs((int) j10);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m26885getOffsetTypeEo1U57Q(long j10) {
        boolean z10 = j10 > 0;
        if (z10) {
            return StartOffsetType.Companion.m26897getFastForwardEo1U57Q();
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return StartOffsetType.Companion.m26896getDelayEo1U57Q();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26886hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26887toStringimpl(long j10) {
        return "StartOffset(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m26882equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m26886hashCodeimpl(this.value);
    }

    public String toString() {
        return m26887toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m26888unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26879constructorimpl(int i10, int i11) {
        return m26880constructorimpl(i10 * i11);
    }
}
