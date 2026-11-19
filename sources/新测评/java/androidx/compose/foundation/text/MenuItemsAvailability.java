package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fJ\u001a\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\fJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\n¨\u0006 "}, m13558d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability;", "", "canCopy", "", "canPaste", "canCut", "canSelectAll", "canAutofill", "constructor-impl", "(ZZZZZ)I", "value", "", "(I)I", "getCanAutofill-impl", "(I)Z", "getCanCopy-impl", "getCanCut-impl", "getCanPaste-impl", "getCanSelectAll-impl", "getValue", "()I", "equals", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class MenuItemsAvailability {
    private static final int AUTO_FILL = 16;
    private static final int COPY = 1;
    private static final int CUT = 4;
    private static final int NONE = 0;
    private static final int PASTE = 2;
    private static final int SELECT_ALL = 8;
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int None = m18064constructorimpl(0);

    @Metadata(m13557d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m13558d2 = {"Landroidx/compose/foundation/text/MenuItemsAvailability$Companion;", "", "()V", "AUTO_FILL", "", "COPY", "CUT", "NONE", "None", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "getNone-JKCFgKw", "()I", "I", "PASTE", "SELECT_ALL", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNone-JKCFgKw, reason: not valid java name */
        public final int m18076getNoneJKCFgKw() {
            return MenuItemsAvailability.None;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MenuItemsAvailability(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuItemsAvailability m18063boximpl(int i10) {
        return new MenuItemsAvailability(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m18064constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18066equalsimpl(int i10, Object obj) {
        return (obj instanceof MenuItemsAvailability) && i10 == ((MenuItemsAvailability) obj).m18075unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18067equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getCanAutofill-impl, reason: not valid java name */
    public static final boolean m18068getCanAutofillimpl(int i10) {
        return (i10 & 16) == 16;
    }

    /* renamed from: getCanCopy-impl, reason: not valid java name */
    public static final boolean m18069getCanCopyimpl(int i10) {
        return (i10 & 1) == 1;
    }

    /* renamed from: getCanCut-impl, reason: not valid java name */
    public static final boolean m18070getCanCutimpl(int i10) {
        return (i10 & 4) == 4;
    }

    /* renamed from: getCanPaste-impl, reason: not valid java name */
    public static final boolean m18071getCanPasteimpl(int i10) {
        return (i10 & 2) == 2;
    }

    /* renamed from: getCanSelectAll-impl, reason: not valid java name */
    public static final boolean m18072getCanSelectAllimpl(int i10) {
        return (i10 & 8) == 8;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18073hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18074toStringimpl(int i10) {
        return "MenuItemsAvailability(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m18066equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m18073hashCodeimpl(this.value);
    }

    public String toString() {
        return m18074toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m18075unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m18065constructorimpl(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        return m18064constructorimpl((z9 ? 1 : 0) | (z10 ? 2 : 0) | (z11 ? 4 : 0) | (z12 ? 8 : 0) | (z13 ? 16 : 0));
    }
}
