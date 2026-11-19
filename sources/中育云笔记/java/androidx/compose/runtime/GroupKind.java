package androidx.compose.runtime;

import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m30245constructorimpl(0);
    private static final int Node = m30245constructorimpl(1);
    private static final int ReusableNode = m30245constructorimpl(2);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getGroup-ULZAiWs, reason: not valid java name */
        public final int m30253getGroupULZAiWs() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-ULZAiWs, reason: not valid java name */
        public final int m30254getNodeULZAiWs() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-ULZAiWs, reason: not valid java name */
        public final int m30255getReusableNodeULZAiWs() {
            return GroupKind.ReusableNode;
        }

        private Companion() {
        }
    }

    private /* synthetic */ GroupKind(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m30244boximpl(int i10) {
        return new GroupKind(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m30245constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30246equalsimpl(int i10, Object obj) {
        return (obj instanceof GroupKind) && i10 == ((GroupKind) obj).m30252unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30247equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30248hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m30249isNodeimpl(int i10) {
        return i10 != Companion.m30253getGroupULZAiWs();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m30250isReusableimpl(int i10) {
        return i10 != Companion.m30254getNodeULZAiWs();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30251toStringimpl(int i10) {
        return "GroupKind(value=" + i10 + ')';
    }

    public boolean equals(Object obj) {
        return m30246equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m30248hashCodeimpl(this.value);
    }

    public String toString() {
        return m30251toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30252unboximpl() {
        return this.value;
    }
}
