package androidx.compose.p014ui.unit;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class IntRectKt {
    @Stable
    /* renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m33661IntRectE1MhUcY(long j10, long j11) {
        return new IntRect(IntOffset.m33629getXimpl(j10), IntOffset.m33630getYimpl(j10), IntOffset.m33629getXimpl(j11), IntOffset.m33630getYimpl(j11));
    }

    @Stable
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m33662IntRectVbeCjmY(long j10, long j11) {
        return new IntRect(IntOffset.m33629getXimpl(j10), IntOffset.m33630getYimpl(j10), IntOffset.m33629getXimpl(j10) + ((int) (j11 >> 32)), IntOffset.m33630getYimpl(j10) + ((int) (j11 & 4294967295L)));
    }

    @Stable
    /* renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m33663IntRectar5cAso(long j10, int i10) {
        return new IntRect(IntOffset.m33629getXimpl(j10) - i10, IntOffset.m33630getYimpl(j10) - i10, IntOffset.m33629getXimpl(j10) + i10, IntOffset.m33630getYimpl(j10) + i10);
    }

    @Stable
    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f10) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f10), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f10), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f10), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f10));
    }

    @Stable
    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    @Stable
    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }
}
