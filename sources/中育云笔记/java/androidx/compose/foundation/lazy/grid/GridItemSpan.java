package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class GridItemSpan {
    private final long packedValue;

    private /* synthetic */ GridItemSpan(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridItemSpan m27579boximpl(long j10) {
        return new GridItemSpan(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27580constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27581equalsimpl(long j10, Object obj) {
        return (obj instanceof GridItemSpan) && j10 == ((GridItemSpan) obj).m27586unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27582equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m27583getCurrentLineSpanimpl(long j10) {
        return (int) j10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27584hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27585toStringimpl(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m27581equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m27584hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m27585toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27586unboximpl() {
        return this.packedValue;
    }
}
