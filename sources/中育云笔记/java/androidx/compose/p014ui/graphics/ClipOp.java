package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m30860constructorimpl(0);
    private static final int Intersect = m30860constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m30866getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m30867getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ClipOp(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m30859boximpl(int i10) {
        return new ClipOp(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m30860constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m30861equalsimpl(int i10, Object obj) {
        return (obj instanceof ClipOp) && i10 == ((ClipOp) obj).m30865unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30862equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m30863hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m30864toStringimpl(int i10) {
        return m30862equalsimpl0(i10, Difference) ? "Difference" : m30862equalsimpl0(i10, Intersect) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m30861equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m30863hashCodeimpl(this.value);
    }

    public String toString() {
        return m30864toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m30865unboximpl() {
        return this.value;
    }
}
