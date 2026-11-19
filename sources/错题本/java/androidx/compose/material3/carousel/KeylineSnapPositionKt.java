package androidx.compose.material3.carousel;

import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0000¨\u0006\n"}, m5110d2 = {"KeylineSnapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageSize", "Landroidx/compose/material3/carousel/CarouselPageSize;", "getSnapPositionOffset", "", "strategy", "Landroidx/compose/material3/carousel/Strategy;", "itemIndex", "itemCount", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeylineSnapPositionKt {
    @NotNull
    public static final SnapPosition KeylineSnapPosition(@NotNull final CarouselPageSize carouselPageSize) {
        return new SnapPosition() { // from class: androidx.compose.material3.carousel.KeylineSnapPositionKt.KeylineSnapPosition.1
            @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
            public int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount) {
                return KeylineSnapPositionKt.getSnapPositionOffset(carouselPageSize.getStrategy(), itemIndex, itemCount);
            }
        };
    }

    public static final int getSnapPositionOffset(@NotNull Strategy strategy, int i, int i8) {
        if (!strategy.getIsValid()) {
            return 0;
        }
        int lastFocalIndex = strategy.getDefaultKeylines().getLastFocalIndex() - strategy.getDefaultKeylines().getFirstFocalIndex();
        int size = strategy.getStartKeylineSteps().size() + lastFocalIndex;
        int size2 = strategy.getEndKeylineSteps().size() + lastFocalIndex;
        int iM6241q = AbstractC6600a.m6241q(strategy.getDefaultKeylines().getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        if (i < size) {
            iM6241q = AbstractC6600a.m6241q(strategy.getStartKeylineSteps().get(Math.min(strategy.getStartKeylineSteps().size() - 1, Math.max(0, (size - 1) - i))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
        }
        if (i8 <= lastFocalIndex + 1 || i < i8 - size2) {
            return iM6241q;
        }
        return AbstractC6600a.m6241q(strategy.getEndKeylineSteps().get(Math.min(strategy.getEndKeylineSteps().size() - 1, Math.max(0, (i - i8) + size2))).getFirstFocal().getUnadjustedOffset() - (strategy.getItemMainAxisSize() / 2.0f));
    }
}
