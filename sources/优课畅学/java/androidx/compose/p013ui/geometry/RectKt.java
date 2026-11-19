package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class RectKt {
    @Stable
    /* renamed from: Rect-0a9Yr6o, reason: not valid java name */
    public static final Rect m24073Rect0a9Yr6o(long j10, long j11) {
        return new Rect(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @Stable
    /* renamed from: Rect-3MmeM6k, reason: not valid java name */
    public static final Rect m24074Rect3MmeM6k(long j10, float f10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i10) - f10, Float.intBitsToFloat(i11) - f10, Float.intBitsToFloat(i10) + f10, Float.intBitsToFloat(i11) + f10);
    }

    @Stable
    /* renamed from: Rect-tz77jQw, reason: not valid java name */
    public static final Rect m24075Recttz77jQw(long j10, long j11) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return new Rect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    @Stable
    public static final Rect lerp(Rect rect, Rect rect2, float f10) {
        return new Rect(MathHelpersKt.lerp(rect.getLeft(), rect2.getLeft(), f10), MathHelpersKt.lerp(rect.getTop(), rect2.getTop(), f10), MathHelpersKt.lerp(rect.getRight(), rect2.getRight(), f10), MathHelpersKt.lerp(rect.getBottom(), rect2.getBottom(), f10));
    }
}
