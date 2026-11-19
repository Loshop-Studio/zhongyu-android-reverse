package androidx.compose.foundation.gestures.snapping;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class FinalSnappingItem {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ClosestItem = m27270constructorimpl(0);
    private static final int NextItem = m27270constructorimpl(1);
    private static final int PreviousItem = m27270constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m27276getClosestItembbeMdSM() {
            return FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m27277getNextItembbeMdSM() {
            return FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m27278getPreviousItembbeMdSM() {
            return FinalSnappingItem.PreviousItem;
        }

        private Companion() {
        }
    }

    private /* synthetic */ FinalSnappingItem(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FinalSnappingItem m27269boximpl(int i10) {
        return new FinalSnappingItem(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m27270constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27271equalsimpl(int i10, Object obj) {
        return (obj instanceof FinalSnappingItem) && i10 == ((FinalSnappingItem) obj).m27275unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27272equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27273hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27274toStringimpl(int i10) {
        return "FinalSnappingItem(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m27271equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m27273hashCodeimpl(this.value);
    }

    public String toString() {
        return m27274toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m27275unboximpl() {
        return this.value;
    }
}
