package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class VertexMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m24669constructorimpl(0);
    private static final int TriangleStrip = m24669constructorimpl(1);
    private static final int TriangleFan = m24669constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m24675getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m24676getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m24677getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        private Companion() {
        }
    }

    private /* synthetic */ VertexMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m24668boximpl(int i10) {
        return new VertexMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24669constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24670equalsimpl(int i10, Object obj) {
        return (obj instanceof VertexMode) && i10 == ((VertexMode) obj).m24674unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24671equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24672hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24673toStringimpl(int i10) {
        return m24671equalsimpl0(i10, Triangles) ? "Triangles" : m24671equalsimpl0(i10, TriangleStrip) ? "TriangleStrip" : m24671equalsimpl0(i10, TriangleFan) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24670equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24672hashCodeimpl(this.value);
    }

    public String toString() {
        return m24673toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24674unboximpl() {
        return this.value;
    }
}
