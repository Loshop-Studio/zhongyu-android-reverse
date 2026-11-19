package androidx.compose.p013ui.unit;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class IntSizeKt {
    @Stable
    public static final long IntSize(int i10, int i11) {
        return IntSize.m27065constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }

    /* renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m27076getCenterozmzZPI(long j10) {
        return IntOffset.m27021constructorimpl((((j10 << 32) >> 33) & 4294967295L) | ((j10 >> 33) << 32));
    }

    @Stable
    /* renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m27077getCenterozmzZPI$annotations(long j10) {
    }

    @Stable
    /* renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m27078roundToIntSizeuvyYCjk(long j10) {
        return IntSize.m27065constructorimpl((Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32));
    }

    @Stable
    /* renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m27079timesO0kMr_c(int i10, long j10) {
        return IntSize.m27072timesYEO4UFw(j10, i10);
    }

    @Stable
    /* renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m27080toIntRectozmzZPI(long j10) {
        return IntRectKt.m27060IntRectVbeCjmY(IntOffset.Companion.m27038getZeronOccac(), j10);
    }

    @Stable
    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m27081toIntSizeuvyYCjk(long j10) {
        return IntSize.m27065constructorimpl((((int) Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (j10 >> 32))) << 32));
    }

    @Stable
    /* renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m27082toSizeozmzZPI(long j10) {
        return Size.m24095constructorimpl((Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32));
    }
}
