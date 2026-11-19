package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class ClipOp {
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m24258constructorimpl(0);
    private static final int Intersect = m24258constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getDifference-rtfAjoo, reason: not valid java name */
        public final int m24264getDifferencertfAjoo() {
            return ClipOp.Difference;
        }

        /* renamed from: getIntersect-rtfAjoo, reason: not valid java name */
        public final int m24265getIntersectrtfAjoo() {
            return ClipOp.Intersect;
        }

        private Companion() {
        }
    }

    private /* synthetic */ ClipOp(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipOp m24257boximpl(int i10) {
        return new ClipOp(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24258constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24259equalsimpl(int i10, Object obj) {
        return (obj instanceof ClipOp) && i10 == ((ClipOp) obj).m24263unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24260equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24261hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24262toStringimpl(int i10) {
        return m24260equalsimpl0(i10, Difference) ? "Difference" : m24260equalsimpl0(i10, Intersect) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24259equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24261hashCodeimpl(this.value);
    }

    public String toString() {
        return m24262toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24263unboximpl() {
        return this.value;
    }
}
