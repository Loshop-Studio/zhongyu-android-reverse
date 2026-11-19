package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m31139constructorimpl(0);
    private static final int Stroke = m31139constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m31145getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m31146getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PaintingStyle(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m31138boximpl(int i10) {
        return new PaintingStyle(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31139constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31140equalsimpl(int i10, Object obj) {
        return (obj instanceof PaintingStyle) && i10 == ((PaintingStyle) obj).m31144unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31141equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31142hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31143toStringimpl(int i10) {
        return m31141equalsimpl0(i10, Fill) ? "Fill" : m31141equalsimpl0(i10, Stroke) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31140equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31142hashCodeimpl(this.value);
    }

    public String toString() {
        return m31143toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31144unboximpl() {
        return this.value;
    }
}
