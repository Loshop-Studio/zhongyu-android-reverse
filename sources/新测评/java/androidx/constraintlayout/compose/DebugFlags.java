package androidx.constraintlayout.compose;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u000f\u0010\u0015\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0088\u0001\b\u0092\u0001\u00020\t¨\u0006\u001a"}, m13558d2 = {"Landroidx/constraintlayout/compose/DebugFlags;", "", "showBounds", "", "showPaths", "showKeyPositions", "constructor-impl", "(ZZZ)I", "flags", "", "(I)I", "getShowBounds-impl", "(I)Z", "getShowKeyPositions-impl", "getShowPaths-impl", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class DebugFlags {
    private static final int BOUNDS_FLAG = 1;
    private static final int KEY_POSITIONS_FLAG = 4;
    private static final int PATHS_FLAG = 2;
    private final int flags;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m23905constructorimpl(0);
    private static final int All = m23905constructorimpl(-1);

    @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m13558d2 = {"Landroidx/constraintlayout/compose/DebugFlags$Companion;", "", "()V", "All", "Landroidx/constraintlayout/compose/DebugFlags;", "getAll-bfy_xzQ", "()I", "I", "BOUNDS_FLAG", "", "KEY_POSITIONS_FLAG", "None", "getNone-bfy_xzQ", "PATHS_FLAG", "constraintlayout-compose_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAll-bfy_xzQ, reason: not valid java name */
        public final int m23916getAllbfy_xzQ() {
            return DebugFlags.All;
        }

        /* renamed from: getNone-bfy_xzQ, reason: not valid java name */
        public final int m23917getNonebfy_xzQ() {
            return DebugFlags.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ DebugFlags(int i10) {
        this.flags = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DebugFlags m23904boximpl(int i10) {
        return new DebugFlags(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m23905constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m23907constructorimpl$default(boolean z9, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return m23906constructorimpl(z9, z10, z11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23908equalsimpl(int i10, Object obj) {
        return (obj instanceof DebugFlags) && i10 == ((DebugFlags) obj).getFlags();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23909equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getShowBounds-impl, reason: not valid java name */
    public static final boolean m23910getShowBoundsimpl(int i10) {
        return (i10 & 1) > 0;
    }

    /* renamed from: getShowKeyPositions-impl, reason: not valid java name */
    public static final boolean m23911getShowKeyPositionsimpl(int i10) {
        return (i10 & 4) > 0;
    }

    /* renamed from: getShowPaths-impl, reason: not valid java name */
    public static final boolean m23912getShowPathsimpl(int i10) {
        return (i10 & 2) > 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23913hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23914toStringimpl(int i10) {
        return "DebugFlags(showBounds = " + m23910getShowBoundsimpl(i10) + ", showPaths = " + m23912getShowPathsimpl(i10) + ", showKeyPositions = " + m23911getShowKeyPositionsimpl(i10) + ')';
    }

    public boolean equals(Object obj) {
        return m23908equalsimpl(this.flags, obj);
    }

    public int hashCode() {
        return m23913hashCodeimpl(this.flags);
    }

    public String toString() {
        return m23914toStringimpl(this.flags);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getFlags() {
        return this.flags;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m23906constructorimpl(boolean z9, boolean z10, boolean z11) {
        return m23905constructorimpl((z9 ? 1 : 0) | (z10 ? 2 : 0) | (z11 ? 4 : 0));
    }
}
