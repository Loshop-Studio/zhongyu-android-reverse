package androidx.compose.foundation.text;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    private static final int NONE = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m27864constructorimpl(0);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m27876getNoneJKCFgKw() {
            return MenuItemsAvailability.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MenuItemsAvailability(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m27863boximpl(int i10) {
        return new MenuItemsAvailability(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m27864constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27866equalsimpl(int i10, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i10 == ((MenuItemsAvailability) obj).m27875unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27867equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m27868getCanAutofillimpl(int i10) {
        return (i10 & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m27869getCanCopyimpl(int i10) {
        return (i10 & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m27870getCanCutimpl(int i10) {
        return (i10 & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m27871getCanPasteimpl(int i10) {
        return (i10 & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m27872getCanSelectAllimpl(int i10) {
        return (i10 & 8) == 8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27873hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27874toStringimpl(int i10) {
        return "MenuItemsAvailability(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m27866equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m27873hashCodeimpl(this.value);
    }

    public String toString() {
        return m27874toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m27875unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m27865constructorimpl(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m27864constructorimpl((z10 ? 1 : 0) | (z11 ? 2 : 0) | (z12 ? 4 : 0) | (z13 ? 8 : 0) | (z14 ? 16 : 0));
    }
}
