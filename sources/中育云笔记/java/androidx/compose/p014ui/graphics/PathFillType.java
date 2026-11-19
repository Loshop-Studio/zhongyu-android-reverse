package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class PathFillType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m31154constructorimpl(0);
    private static final int EvenOdd = m31154constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m31160getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m31161getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathFillType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathFillType m31153boximpl(int i10) {
        return new PathFillType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31154constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31155equalsimpl(int i10, Object obj) {
        return (obj instanceof PathFillType) && i10 == ((PathFillType) obj).m31159unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31156equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31157hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31158toStringimpl(int i10) {
        return m31156equalsimpl0(i10, NonZero) ? "NonZero" : m31156equalsimpl0(i10, EvenOdd) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31155equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31157hashCodeimpl(this.value);
    }

    public String toString() {
        return m31158toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31159unboximpl() {
        return this.value;
    }
}
