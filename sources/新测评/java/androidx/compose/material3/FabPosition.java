package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, m13558d2 = {"Landroidx/compose/material3/FabPosition;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class FabPosition {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Start = m18835constructorimpl(0);
    private static final int Center = m18835constructorimpl(1);
    private static final int End = m18835constructorimpl(2);
    private static final int EndOverlay = m18835constructorimpl(3);

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, m13558d2 = {"Landroidx/compose/material3/FabPosition$Companion;", "", "()V", "Center", "Landroidx/compose/material3/FabPosition;", "getCenter-ERTFSPs", "()I", "I", "End", "getEnd-ERTFSPs", "EndOverlay", "getEndOverlay-ERTFSPs", "Start", "getStart-ERTFSPs", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m18841getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m18842getEndERTFSPs() {
            return FabPosition.End;
        }

        /* renamed from: getEndOverlay-ERTFSPs, reason: not valid java name */
        public final int m18843getEndOverlayERTFSPs() {
            return FabPosition.EndOverlay;
        }

        /* renamed from: getStart-ERTFSPs, reason: not valid java name */
        public final int m18844getStartERTFSPs() {
            return FabPosition.Start;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FabPosition(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m18834boximpl(int i10) {
        return new FabPosition(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m18835constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18836equalsimpl(int i10, Object obj) {
        return (obj instanceof FabPosition) && i10 == ((FabPosition) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18837equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18838hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18839toStringimpl(int i10) {
        return m18837equalsimpl0(i10, Start) ? "FabPosition.Start" : m18837equalsimpl0(i10, Center) ? "FabPosition.Center" : m18837equalsimpl0(i10, End) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return m18836equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m18838hashCodeimpl(this.value);
    }

    public String toString() {
        return m18839toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
