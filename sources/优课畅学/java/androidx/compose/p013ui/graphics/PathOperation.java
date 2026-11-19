package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m24562constructorimpl(0);
    private static final int Intersect = m24562constructorimpl(1);
    private static final int Union = m24562constructorimpl(2);
    private static final int Xor = m24562constructorimpl(3);
    private static final int ReverseDifference = m24562constructorimpl(4);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m24568getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m24569getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m24570getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m24571getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m24572getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathOperation(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m24561boximpl(int i10) {
        return new PathOperation(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24562constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24563equalsimpl(int i10, Object obj) {
        return (obj instanceof PathOperation) && i10 == ((PathOperation) obj).m24567unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24564equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24565hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24566toStringimpl(int i10) {
        return m24564equalsimpl0(i10, Difference) ? "Difference" : m24564equalsimpl0(i10, Intersect) ? "Intersect" : m24564equalsimpl0(i10, Union) ? "Union" : m24564equalsimpl0(i10, Xor) ? "Xor" : m24564equalsimpl0(i10, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24563equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24565hashCodeimpl(this.value);
    }

    public String toString() {
        return m24566toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24567unboximpl() {
        return this.value;
    }
}
