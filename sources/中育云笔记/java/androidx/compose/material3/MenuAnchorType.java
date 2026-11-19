package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class MenuAnchorType {
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final String PrimaryNotEditable = m28814constructorimpl("PrimaryNotEditable");
    private static final String PrimaryEditable = m28814constructorimpl("PrimaryEditable");
    private static final String SecondaryEditable = m28814constructorimpl("SecondaryEditable");

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getPrimaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m28820getPrimaryEditableMg6Rgbw() {
            return MenuAnchorType.PrimaryEditable;
        }

        /* renamed from: getPrimaryNotEditable-Mg6Rgbw, reason: not valid java name */
        public final String m28821getPrimaryNotEditableMg6Rgbw() {
            return MenuAnchorType.PrimaryNotEditable;
        }

        /* renamed from: getSecondaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m28822getSecondaryEditableMg6Rgbw() {
            return MenuAnchorType.SecondaryEditable;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MenuAnchorType(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuAnchorType m28813boximpl(String str) {
        return new MenuAnchorType(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m28814constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28815equalsimpl(String str, Object obj) {
        return (obj instanceof MenuAnchorType) && AbstractC9979u.m20289b(str, ((MenuAnchorType) obj).m28819unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28816equalsimpl0(String str, String str2) {
        return AbstractC9979u.m20289b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28817hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28818toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m28815equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m28817hashCodeimpl(this.name);
    }

    public String toString() {
        return m28818toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m28819unboximpl() {
        return this.name;
    }
}
