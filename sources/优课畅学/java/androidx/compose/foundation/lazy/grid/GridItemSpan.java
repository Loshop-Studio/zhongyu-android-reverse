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
    public static final /* synthetic */ GridItemSpan m20977boximpl(long j10) {
        return new GridItemSpan(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20978constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20979equalsimpl(long j10, Object obj) {
        return (obj instanceof GridItemSpan) && j10 == ((GridItemSpan) obj).m20984unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20980equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCurrentLineSpan-impl, reason: not valid java name */
    public static final int m20981getCurrentLineSpanimpl(long j10) {
        return (int) j10;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20982hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20983toStringimpl(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m20979equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m20982hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m20983toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20984unboximpl() {
        return this.packedValue;
    }
}
