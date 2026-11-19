package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class PathOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Difference = m31164constructorimpl(0);
    private static final int Intersect = m31164constructorimpl(1);
    private static final int Union = m31164constructorimpl(2);
    private static final int Xor = m31164constructorimpl(3);
    private static final int ReverseDifference = m31164constructorimpl(4);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getDifference-b3I0S0c, reason: not valid java name */
        public final int m31170getDifferenceb3I0S0c() {
            return PathOperation.Difference;
        }

        /* renamed from: getIntersect-b3I0S0c, reason: not valid java name */
        public final int m31171getIntersectb3I0S0c() {
            return PathOperation.Intersect;
        }

        /* renamed from: getReverseDifference-b3I0S0c, reason: not valid java name */
        public final int m31172getReverseDifferenceb3I0S0c() {
            return PathOperation.ReverseDifference;
        }

        /* renamed from: getUnion-b3I0S0c, reason: not valid java name */
        public final int m31173getUnionb3I0S0c() {
            return PathOperation.Union;
        }

        /* renamed from: getXor-b3I0S0c, reason: not valid java name */
        public final int m31174getXorb3I0S0c() {
            return PathOperation.Xor;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathOperation(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathOperation m31163boximpl(int i10) {
        return new PathOperation(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31164constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31165equalsimpl(int i10, Object obj) {
        return (obj instanceof PathOperation) && i10 == ((PathOperation) obj).m31169unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31166equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31167hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31168toStringimpl(int i10) {
        return m31166equalsimpl0(i10, Difference) ? "Difference" : m31166equalsimpl0(i10, Intersect) ? "Intersect" : m31166equalsimpl0(i10, Union) ? "Union" : m31166equalsimpl0(i10, Xor) ? "Xor" : m31166equalsimpl0(i10, ReverseDifference) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31165equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31167hashCodeimpl(this.value);
    }

    public String toString() {
        return m31168toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31169unboximpl() {
        return this.value;
    }
}
