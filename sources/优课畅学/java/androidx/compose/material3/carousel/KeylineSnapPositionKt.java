package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
public final class KeylineSnapPositionKt {
    public static final SnapPosition KeylineSnapPosition(final CarouselPageSize carouselPageSize) {
        return new SnapPosition() { // from class: androidx.compose.material3.carousel.KeylineSnapPositionKt.KeylineSnapPosition.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
            public int position(int i10, int i11, int i12, int i13, int i14, int i15) {
                return KeylineSnapPositionKt.getSnapPositionOffset(carouselPageSize.getStrategy(), i14, i15);
            }
        };
    }

    public static final int getSnapPositionOffset(Strategy strategy, int i10, int i11) {
        if (!strategy.isValid()) {
            return 0;
        }
        int lastFocalIndex = strategy.getDefaultKeylines().getLastFocalIndex() - strategy.getDefaultKeylines().getFirstFocalIndex();
        int size = strategy.getStartKeylineSteps().size() + lastFocalIndex;
        int size2 = strategy.getEndKeylineSteps().size() + lastFocalIndex;
        int iM20035d = AbstractC10729c.m20035d(strategy.getDefaultKeylines().getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        if (i10 < size) {
            iM20035d = AbstractC10729c.m20035d(strategy.getStartKeylineSteps().get(Math.min(strategy.getStartKeylineSteps().size() - 1, Math.max(0, (size - 1) - i10))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        }
        if (i11 <= lastFocalIndex + 1 || i10 < i11 - size2) {
            return iM20035d;
        }
        return AbstractC10729c.m20035d(strategy.getEndKeylineSteps().get(Math.min(strategy.getEndKeylineSteps().size() - 1, Math.max(0, (i10 - i11) + size2))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
    }
}
