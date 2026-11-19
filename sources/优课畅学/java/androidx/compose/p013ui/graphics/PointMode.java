package androidx.compose.p013ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m24575constructorimpl(0);
    private static final int Lines = m24575constructorimpl(1);
    private static final int Polygon = m24575constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m24581getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m24582getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m24583getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m24574boximpl(int i10) {
        return new PointMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m24575constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24576equalsimpl(int i10, Object obj) {
        return (obj instanceof PointMode) && i10 == ((PointMode) obj).m24580unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24577equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24578hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24579toStringimpl(int i10) {
        return m24577equalsimpl0(i10, Points) ? "Points" : m24577equalsimpl0(i10, Lines) ? "Lines" : m24577equalsimpl0(i10, Polygon) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24576equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m24578hashCodeimpl(this.value);
    }

    public String toString() {
        return m24579toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m24580unboximpl() {
        return this.value;
    }
}
