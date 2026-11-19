package androidx.compose.foundation.gestures.snapping;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class FinalSnappingItem {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ClosestItem = m20668constructorimpl(0);
    private static final int NextItem = m20668constructorimpl(1);
    private static final int PreviousItem = m20668constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m20674getClosestItembbeMdSM() {
            return FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m20675getNextItembbeMdSM() {
            return FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m20676getPreviousItembbeMdSM() {
            return FinalSnappingItem.PreviousItem;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FinalSnappingItem(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FinalSnappingItem m20667boximpl(int i10) {
        return new FinalSnappingItem(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m20668constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20669equalsimpl(int i10, Object obj) {
        return (obj instanceof FinalSnappingItem) && i10 == ((FinalSnappingItem) obj).m20673unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20670equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20671hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20672toStringimpl(int i10) {
        return "FinalSnappingItem(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m20669equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20671hashCodeimpl(this.value);
    }

    public String toString() {
        return m20672toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m20673unboximpl() {
        return this.value;
    }
}
