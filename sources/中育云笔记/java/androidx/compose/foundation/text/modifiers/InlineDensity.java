package androidx.compose.foundation.text.modifiers;

import androidx.compose.p014ui.unit.Density;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m28164constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m28174getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InlineDensity(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m28163boximpl(long j10) {
        return new InlineDensity(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m28165constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m28167equalsimpl(long j10, Object obj) {
        return (obj instanceof InlineDensity) && j10 == ((InlineDensity) obj).m28173unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m28168equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m28169getDensityimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m28170getFontScaleimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m28171hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m28172toStringimpl(long j10) {
        return "InlineDensity(density=" + m28169getDensityimpl(j10) + ", fontScale=" + m28170getFontScaleimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m28167equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m28171hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m28172toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m28173unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m28166constructorimpl(Density density) {
        return m28164constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m28164constructorimpl(float f10, float f11) {
        return m28165constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
