package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class ListItemType implements Comparable<ListItemType> {
    private final int lines;
    public static final Companion Companion = new Companion(null);
    private static final int OneLine = m28802constructorimpl(1);
    private static final int TwoLine = m28802constructorimpl(2);
    private static final int ThreeLine = m28802constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m28809getOneLineAlXitO8() {
            return ListItemType.OneLine;
        }

        /* renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m28810getThreeLineAlXitO8() {
            return ListItemType.ThreeLine;
        }

        /* renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m28811getTwoLineAlXitO8() {
            return ListItemType.TwoLine;
        }

        /* renamed from: invoke-Z-LSjz4$material3_release, reason: not valid java name */
        public final int m28812invokeZLSjz4$material3_release(boolean z10, boolean z11, boolean z12) {
            return ((z10 && z11) || z12) ? m28810getThreeLineAlXitO8() : (z10 || z11) ? m28811getTwoLineAlXitO8() : m28809getOneLineAlXitO8();
        }

        private Companion() {
        }
    }

    private /* synthetic */ ListItemType(int i10) {
        this.lines = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ListItemType m28800boximpl(int i10) {
        return new ListItemType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m28802constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28803equalsimpl(int i10, Object obj) {
        return (obj instanceof ListItemType) && i10 == ((ListItemType) obj).m28808unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28804equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28805hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28806toStringimpl(int i10) {
        return "ListItemType(lines=" + i10 + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ListItemType listItemType) {
        return m28807compareToyh95HIg(listItemType.m28808unboximpl());
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public int m28807compareToyh95HIg(int i10) {
        return m28801compareToyh95HIg(this.lines, i10);
    }

    public boolean equals(Object obj) {
        return m28803equalsimpl(this.lines, obj);
    }

    public int hashCode() {
        return m28805hashCodeimpl(this.lines);
    }

    public String toString() {
        return m28806toStringimpl(this.lines);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28808unboximpl() {
        return this.lines;
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public static int m28801compareToyh95HIg(int i10, int i11) {
        return AbstractC9979u.m20296i(i10, i11);
    }
}
