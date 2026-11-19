package androidx.compose.material3;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class MenuAnchorType {
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final String PrimaryNotEditable = m22212constructorimpl("PrimaryNotEditable");
    private static final String PrimaryEditable = m22212constructorimpl("PrimaryEditable");
    private static final String SecondaryEditable = m22212constructorimpl("SecondaryEditable");

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getPrimaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m22218getPrimaryEditableMg6Rgbw() {
            return MenuAnchorType.PrimaryEditable;
        }

        /* renamed from: getPrimaryNotEditable-Mg6Rgbw, reason: not valid java name */
        public final String m22219getPrimaryNotEditableMg6Rgbw() {
            return MenuAnchorType.PrimaryNotEditable;
        }

        /* renamed from: getSecondaryEditable-Mg6Rgbw, reason: not valid java name */
        public final String m22220getSecondaryEditableMg6Rgbw() {
            return MenuAnchorType.SecondaryEditable;
        }

        private Companion() {
        }
    }

    private /* synthetic */ MenuAnchorType(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MenuAnchorType m22211boximpl(String str) {
        return new MenuAnchorType(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m22212constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m22213equalsimpl(String str, Object obj) {
        return (obj instanceof MenuAnchorType) && AbstractC9133u.m16128b(str, ((MenuAnchorType) obj).m22217unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m22214equalsimpl0(String str, String str2) {
        return AbstractC9133u.m16128b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m22215hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m22216toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m22213equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m22215hashCodeimpl(this.name);
    }

    public String toString() {
        return m22216toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m22217unboximpl() {
        return this.name;
    }
}
