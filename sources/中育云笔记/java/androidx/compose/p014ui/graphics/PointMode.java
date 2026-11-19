package androidx.compose.p014ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class PointMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Points = m31177constructorimpl(0);
    private static final int Lines = m31177constructorimpl(1);
    private static final int Polygon = m31177constructorimpl(2);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getLines-r_lszbg, reason: not valid java name */
        public final int m31183getLinesr_lszbg() {
            return PointMode.Lines;
        }

        /* renamed from: getPoints-r_lszbg, reason: not valid java name */
        public final int m31184getPointsr_lszbg() {
            return PointMode.Points;
        }

        /* renamed from: getPolygon-r_lszbg, reason: not valid java name */
        public final int m31185getPolygonr_lszbg() {
            return PointMode.Polygon;
        }

        private Companion() {
        }
    }

    private /* synthetic */ PointMode(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointMode m31176boximpl(int i10) {
        return new PointMode(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m31177constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31178equalsimpl(int i10, Object obj) {
        return (obj instanceof PointMode) && i10 == ((PointMode) obj).m31182unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31179equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31180hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31181toStringimpl(int i10) {
        return m31179equalsimpl0(i10, Points) ? "Points" : m31179equalsimpl0(i10, Lines) ? "Lines" : m31179equalsimpl0(i10, Polygon) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31178equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m31180hashCodeimpl(this.value);
    }

    public String toString() {
        return m31181toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m31182unboximpl() {
        return this.value;
    }
}
