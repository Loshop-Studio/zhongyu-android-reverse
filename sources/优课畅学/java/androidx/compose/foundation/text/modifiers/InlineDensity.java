package androidx.compose.foundation.text.modifiers;

import androidx.compose.p013ui.unit.Density;
import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes.dex */
public final class InlineDensity {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified = m21562constructorimpl(Float.NaN, Float.NaN);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getUnspecified-L26CHvs, reason: not valid java name */
        public final long m21572getUnspecifiedL26CHvs() {
            return InlineDensity.Unspecified;
        }

        private Companion() {
        }
    }

    private /* synthetic */ InlineDensity(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ InlineDensity m21561boximpl(long j10) {
        return new InlineDensity(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m21563constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m21565equalsimpl(long j10, Object obj) {
        return (obj instanceof InlineDensity) && j10 == ((InlineDensity) obj).m21571unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m21566equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getDensity-impl, reason: not valid java name */
    public static final float m21567getDensityimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getFontScale-impl, reason: not valid java name */
    public static final float m21568getFontScaleimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m21569hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m21570toStringimpl(long j10) {
        return "InlineDensity(density=" + m21567getDensityimpl(j10) + ", fontScale=" + m21568getFontScaleimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m21565equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m21569hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m21570toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m21571unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m21564constructorimpl(Density density) {
        return m21562constructorimpl(density.getDensity(), density.getFontScale());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m21562constructorimpl(float f10, float f11) {
        return m21563constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
