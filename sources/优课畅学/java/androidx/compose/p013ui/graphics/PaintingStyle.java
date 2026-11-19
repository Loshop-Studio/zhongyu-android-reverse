package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class PaintingStyle {
    public static final Companion Companion = new Companion(null);
    private static final int Fill = m24537constructorimpl(0);
    private static final int Stroke = m24537constructorimpl(1);
    private final int value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getFill-TiuSbCo, reason: not valid java name */
        public final int m24543getFillTiuSbCo() {
            return PaintingStyle.Fill;
        }

        /* renamed from: getStroke-TiuSbCo, reason: not valid java name */
        public final int m24544getStrokeTiuSbCo() {
            return PaintingStyle.Stroke;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PaintingStyle(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PaintingStyle m24536boximpl(int i10) {
        return new PaintingStyle(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24537constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24538equalsimpl(int i10, Object obj) {
        return (obj instanceof PaintingStyle) && i10 == ((PaintingStyle) obj).m24542unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24539equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24540hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24541toStringimpl(int i10) {
        return m24539equalsimpl0(i10, Fill) ? "Fill" : m24539equalsimpl0(i10, Stroke) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24538equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24540hashCodeimpl(this.value);
    }

    public String toString() {
        return m24541toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24542unboximpl() {
        return this.value;
    }
}
