package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class VertexMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Triangles = m31271constructorimpl(0);
    private static final int TriangleStrip = m31271constructorimpl(1);
    private static final int TriangleFan = m31271constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getTriangleFan-c2xauaI, reason: not valid java name */
        public final int m31277getTriangleFanc2xauaI() {
            return VertexMode.TriangleFan;
        }

        /* renamed from: getTriangleStrip-c2xauaI, reason: not valid java name */
        public final int m31278getTriangleStripc2xauaI() {
            return VertexMode.TriangleStrip;
        }

        /* renamed from: getTriangles-c2xauaI, reason: not valid java name */
        public final int m31279getTrianglesc2xauaI() {
            return VertexMode.Triangles;
        }

        private Companion() {
        }
    }

    private /* synthetic */ VertexMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ VertexMode m31270boximpl(int i10) {
        return new VertexMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31271constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31272equalsimpl(int i10, Object obj) {
        return (obj instanceof VertexMode) && i10 == ((VertexMode) obj).m31276unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31273equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31274hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31275toStringimpl(int i10) {
        return m31273equalsimpl0(i10, Triangles) ? "Triangles" : m31273equalsimpl0(i10, TriangleStrip) ? "TriangleStrip" : m31273equalsimpl0(i10, TriangleFan) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31272equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31274hashCodeimpl(this.value);
    }

    public String toString() {
        return m31275toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31276unboximpl() {
        return this.value;
    }
}
