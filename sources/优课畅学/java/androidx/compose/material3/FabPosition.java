package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = m22092constructorimpl(0);
    private static final int Center = m22092constructorimpl(1);
    private static final int End = m22092constructorimpl(2);
    private static final int EndOverlay = m22092constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m22098getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m22099getEndERTFSPs() {
            return FabPosition.End;
        }

        /* renamed from: getEndOverlay-ERTFSPs, reason: not valid java name */
        public final int m22100getEndOverlayERTFSPs() {
            return FabPosition.EndOverlay;
        }

        /* renamed from: getStart-ERTFSPs, reason: not valid java name */
        public final int m22101getStartERTFSPs() {
            return FabPosition.Start;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FabPosition(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m22091boximpl(int i10) {
        return new FabPosition(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m22092constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22093equalsimpl(int i10, Object obj) {
        return (obj instanceof FabPosition) && i10 == ((FabPosition) obj).m22097unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22094equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22095hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22096toStringimpl(int i10) {
        return m22094equalsimpl0(i10, Start) ? "FabPosition.Start" : m22094equalsimpl0(i10, Center) ? "FabPosition.Center" : m22094equalsimpl0(i10, End) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return m22093equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m22095hashCodeimpl(this.value);
    }

    public String toString() {
        return m22096toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m22097unboximpl() {
        return this.value;
    }
}
