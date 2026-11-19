package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
final class ListItemType implements Comparable<ListItemType> {
    private final int lines;
    public static final Companion Companion = new Companion(null);
    private static final int OneLine = m22200constructorimpl(1);
    private static final int TwoLine = m22200constructorimpl(2);
    private static final int ThreeLine = m22200constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m22207getOneLineAlXitO8() {
            return ListItemType.OneLine;
        }

        /* renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m22208getThreeLineAlXitO8() {
            return ListItemType.ThreeLine;
        }

        /* renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m22209getTwoLineAlXitO8() {
            return ListItemType.TwoLine;
        }

        /* renamed from: invoke-Z-LSjz4$material3_release, reason: not valid java name */
        public final int m22210invokeZLSjz4$material3_release(boolean z10, boolean z11, boolean z12) {
            return ((z10 && z11) || z12) ? m22208getThreeLineAlXitO8() : (z10 || z11) ? m22209getTwoLineAlXitO8() : m22207getOneLineAlXitO8();
        }

        private Companion() {
        }
    }

    private /* synthetic */ ListItemType(int i10) {
        this.lines = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ListItemType m22198boximpl(int i10) {
        return new ListItemType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m22200constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22201equalsimpl(int i10, Object obj) {
        return (obj instanceof ListItemType) && i10 == ((ListItemType) obj).m22206unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22202equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22203hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22204toStringimpl(int i10) {
        return "ListItemType(lines=" + i10 + ')';
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ListItemType listItemType) {
        return m22205compareToyh95HIg(listItemType.m22206unboximpl());
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public int m22205compareToyh95HIg(int i10) {
        return m22199compareToyh95HIg(this.lines, i10);
    }

    public boolean equals(Object obj) {
        return m22201equalsimpl(this.lines, obj);
    }

    public int hashCode() {
        return m22203hashCodeimpl(this.lines);
    }

    public String toString() {
        return m22204toStringimpl(this.lines);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22206unboximpl() {
        return this.lines;
    }

    /* renamed from: compareTo-yh95HIg, reason: not valid java name */
    public static int m22199compareToyh95HIg(int i10, int i11) {
        return AbstractC9133u.m16135i(i10, i11);
    }
}
