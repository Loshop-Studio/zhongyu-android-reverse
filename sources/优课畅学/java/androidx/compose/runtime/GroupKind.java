package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes2.dex */
final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m23643constructorimpl(0);
    private static final int Node = m23643constructorimpl(1);
    private static final int ReusableNode = m23643constructorimpl(2);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m23651getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m23652getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m23653getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }

        private Companion() {
        }
    }

    private /* synthetic */ GroupKind(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m23642boximpl(int i10) {
        return new GroupKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m23643constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23644equalsimpl(int i10, Object obj) {
        return (obj instanceof GroupKind) && i10 == ((GroupKind) obj).m23650unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23645equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23646hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m23647isNodeimpl(int i10) {
        return i10 != Companion.m23651getGroupULZAiWs();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m23648isReusableimpl(int i10) {
        return i10 != Companion.m23652getNodeULZAiWs();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23649toStringimpl(int i10) {
        return "GroupKind(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m23644equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m23646hashCodeimpl(this.value);
    }

    public String toString() {
        return m23649toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m23650unboximpl() {
        return this.value;
    }
}
