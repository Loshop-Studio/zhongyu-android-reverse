package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\b\u0012\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\tJ\u001b\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0004ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0007\u0092\u0001\u00020\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m13558d2 = {"Landroidx/constraintlayout/compose/GridFlag;", "", "isPlaceLayoutsOnSpansFirst", "", "isSubGridByColRow", "constructor-impl", "(ZZ)I", "value", "", "(I)I", "isPlaceLayoutsOnSpansFirst-impl", "(I)Z", "isSubGridByColRow-impl$constraintlayout_compose_release", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "or", "or-90j8xCw", "(II)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class GridFlag {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m23924constructorimpl$default(false, false, 3, null);
    private static final int PlaceLayoutsOnSpansFirst = m23924constructorimpl$default(true, false, 2, null);
    private static final int SubGridByColRow = m23924constructorimpl$default(false, true, 1, null);
    private final int value;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u00020\u00048\u0000X\u0081\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, m13558d2 = {"Landroidx/constraintlayout/compose/GridFlag$Companion;", "", "()V", "None", "Landroidx/constraintlayout/compose/GridFlag;", "getNone-dTRCCdc", "()I", "I", "PlaceLayoutsOnSpansFirst", "getPlaceLayoutsOnSpansFirst-dTRCCdc", "SubGridByColRow", "getSubGridByColRow-dTRCCdc$constraintlayout_compose_release", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNone-dTRCCdc, reason: not valid java name */
        public final int m23933getNonedTRCCdc() {
            return GridFlag.None;
        }

        /* renamed from: getPlaceLayoutsOnSpansFirst-dTRCCdc, reason: not valid java name */
        public final int m23934getPlaceLayoutsOnSpansFirstdTRCCdc() {
            return GridFlag.PlaceLayoutsOnSpansFirst;
        }

        /* renamed from: getSubGridByColRow-dTRCCdc$constraintlayout_compose_release, reason: not valid java name */
        public final int m23935getSubGridByColRowdTRCCdc$constraintlayout_compose_release() {
            return GridFlag.SubGridByColRow;
        }

        private Companion() {
        }
    }

    private /* synthetic */ GridFlag(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GridFlag m23921boximpl(int i10) {
        return new GridFlag(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m23922constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m23924constructorimpl$default(boolean z9, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m23923constructorimpl(z9, z10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23925equalsimpl(int i10, Object obj) {
        return (obj instanceof GridFlag) && i10 == ((GridFlag) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23926equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23927hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isPlaceLayoutsOnSpansFirst-impl, reason: not valid java name */
    public static final boolean m23928isPlaceLayoutsOnSpansFirstimpl(int i10) {
        return (i10 & 2) == 0;
    }

    /* renamed from: isSubGridByColRow-impl$constraintlayout_compose_release, reason: not valid java name */
    public static final boolean m23929isSubGridByColRowimpl$constraintlayout_compose_release(int i10) {
        return (i10 & 1) > 0;
    }

    /* renamed from: or-90j8xCw, reason: not valid java name */
    public static final int m23930or90j8xCw(int i10, int i11) {
        return m23923constructorimpl(m23928isPlaceLayoutsOnSpansFirstimpl(i10) | m23928isPlaceLayoutsOnSpansFirstimpl(i11), m23929isSubGridByColRowimpl$constraintlayout_compose_release(i10) | m23929isSubGridByColRowimpl$constraintlayout_compose_release(i11));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23931toStringimpl(int i10) {
        return "GridFlag(isPlaceLayoutsOnSpansFirst = " + m23928isPlaceLayoutsOnSpansFirstimpl(i10) + ')';
    }

    public boolean equals(Object obj) {
        return m23925equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m23927hashCodeimpl(this.value);
    }

    public String toString() {
        return m23931toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m23923constructorimpl(boolean z9, boolean z10) {
        return m23922constructorimpl((z9 ? 0 : 2) | (z10 ? 1 : 0));
    }
}
