package androidx.compose.p013ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getCmyk-xdoWZVw, reason: not valid java name */
        public final long m24688getCmykxdoWZVw() {
            return ColorModel.Cmyk;
        }

        /* renamed from: getLab-xdoWZVw, reason: not valid java name */
        public final long m24689getLabxdoWZVw() {
            return ColorModel.Lab;
        }

        /* renamed from: getRgb-xdoWZVw, reason: not valid java name */
        public final long m24690getRgbxdoWZVw() {
            return ColorModel.Rgb;
        }

        /* renamed from: getXyz-xdoWZVw, reason: not valid java name */
        public final long m24691getXyzxdoWZVw() {
            return ColorModel.Xyz;
        }

        private Companion() {
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        Rgb = m24681constructorimpl((0 & 4294967295L) | j11);
        Xyz = m24681constructorimpl((1 & 4294967295L) | j11);
        Lab = m24681constructorimpl(j11 | (2 & 4294967295L));
        Cmyk = m24681constructorimpl((j10 & 4294967295L) | (4 << 32));
    }

    private /* synthetic */ ColorModel(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorModel m24680boximpl(long j10) {
        return new ColorModel(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m24681constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m24682equalsimpl(long j10, Object obj) {
        return (obj instanceof ColorModel) && j10 == ((ColorModel) obj).m24687unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24683equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getComponentCount$annotations() {
    }

    @IntRange(from = 1, m244to = 4)
    /* renamed from: getComponentCount-impl, reason: not valid java name */
    public static final int m24684getComponentCountimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m24685hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m24686toStringimpl(long j10) {
        return m24683equalsimpl0(j10, Rgb) ? "Rgb" : m24683equalsimpl0(j10, Xyz) ? "Xyz" : m24683equalsimpl0(j10, Lab) ? "Lab" : m24683equalsimpl0(j10, Cmyk) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m24682equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m24685hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m24686toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m24687unboximpl() {
        return this.packedValue;
    }
}
