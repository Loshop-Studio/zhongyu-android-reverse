package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class FabPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = m28694constructorimpl(0);
    private static final int Center = m28694constructorimpl(1);
    private static final int End = m28694constructorimpl(2);
    private static final int EndOverlay = m28694constructorimpl(3);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m28700getCenterERTFSPs() {
            return FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m28701getEndERTFSPs() {
            return FabPosition.End;
        }

        /* renamed from: getEndOverlay-ERTFSPs, reason: not valid java name */
        public final int m28702getEndOverlayERTFSPs() {
            return FabPosition.EndOverlay;
        }

        /* renamed from: getStart-ERTFSPs, reason: not valid java name */
        public final int m28703getStartERTFSPs() {
            return FabPosition.Start;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FabPosition(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FabPosition m28693boximpl(int i10) {
        return new FabPosition(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m28694constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28695equalsimpl(int i10, Object obj) {
        return (obj instanceof FabPosition) && i10 == ((FabPosition) obj).m28699unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28696equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28697hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28698toStringimpl(int i10) {
        return m28696equalsimpl0(i10, Start) ? "FabPosition.Start" : m28696equalsimpl0(i10, Center) ? "FabPosition.Center" : m28696equalsimpl0(i10, End) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    public boolean equals(Object obj) {
        return m28695equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m28697hashCodeimpl(this.value);
    }

    public String toString() {
        return m28698toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m28699unboximpl() {
        return this.value;
    }
}
