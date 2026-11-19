package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class PathFillType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NonZero = m24552constructorimpl(0);
    private static final int EvenOdd = m24552constructorimpl(1);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getEvenOdd-Rg-k1Os, reason: not valid java name */
        public final int m24558getEvenOddRgk1Os() {
            return PathFillType.EvenOdd;
        }

        /* renamed from: getNonZero-Rg-k1Os, reason: not valid java name */
        public final int m24559getNonZeroRgk1Os() {
            return PathFillType.NonZero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PathFillType(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PathFillType m24551boximpl(int i10) {
        return new PathFillType(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24552constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24553equalsimpl(int i10, Object obj) {
        return (obj instanceof PathFillType) && i10 == ((PathFillType) obj).m24557unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24554equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24555hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24556toStringimpl(int i10) {
        return m24554equalsimpl0(i10, NonZero) ? "NonZero" : m24554equalsimpl0(i10, EvenOdd) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24553equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24555hashCodeimpl(this.value);
    }

    public String toString() {
        return m24556toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24557unboximpl() {
        return this.value;
    }
}
