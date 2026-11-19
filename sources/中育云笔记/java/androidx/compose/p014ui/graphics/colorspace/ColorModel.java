package androidx.compose.p014ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class ColorModel {
    private static final long Cmyk;
    public static final Companion Companion = new Companion(null);
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m31290getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m31291getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m31292getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m31293getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        private Companion() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        Rgb = m31283constructorimpl((0 & 4294967295L) | j11);
        Xyz = m31283constructorimpl((1 & 4294967295L) | j11);
        Lab = m31283constructorimpl(j11 | (2 & 4294967295L));
        Cmyk = m31283constructorimpl((j10 & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m31282boximpl(long j10) {
        return new ColorModel(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m31283constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m31284equalsimpl(long j10, Object obj) {
        return (obj instanceof ColorModel) && j10 == ((ColorModel) obj).m31289unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31285equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    @IntRange(from = 1, m338to = 4)
    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m31286getComponentCountimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m31287hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m31288toStringimpl(long j10) {
        return m31285equalsimpl0(j10, Rgb) ? "Rgb" : m31285equalsimpl0(j10, Xyz) ? "Xyz" : m31285equalsimpl0(j10, Lab) ? "Lab" : m31285equalsimpl0(j10, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m31284equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m31287hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m31288toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31289unboximpl() {
        return this.packedValue;
    }
}
