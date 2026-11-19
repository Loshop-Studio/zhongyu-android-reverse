package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.Iterator;
import java.util.List;
import p265nd.AbstractC10410o;

/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyListState lazyListState, final SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final int getAverageItemSize() {
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                int size = 0;
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size2 = layoutInfo.getVisibleItemsInfo().size();
                Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    size += ((LazyListItemInfo) it.next()).getSize();
                }
                return size / size2;
            }

            private final LazyListLayoutInfo getLayoutInfo() {
                return lazyListState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f10, float f11) {
                return AbstractC10410o.m21751d(Math.abs(f11) - getAverageItemSize(), 0.0f) * Math.signum(f11);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f10) {
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f11 = Float.NEGATIVE_INFINITY;
                float f12 = Float.POSITIVE_INFINITY;
                for (int i10 = 0; i10 < size; i10++) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i10);
                    LazyLayoutMeasuredItem lazyLayoutMeasuredItem = lazyListItemInfo instanceof LazyLayoutMeasuredItem ? (LazyLayoutMeasuredItem) lazyListItemInfo : null;
                    if (lazyLayoutMeasuredItem == null || !lazyLayoutMeasuredItem.getNonScrollableItem()) {
                        float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPosition2, getLayoutInfo().getTotalItemsCount());
                        if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f11) {
                            f11 = fCalculateDistanceToDesiredSnapPosition;
                        }
                        if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f12) {
                            f12 = fCalculateDistanceToDesiredSnapPosition;
                        }
                    }
                }
                return SnapFlingBehaviorKt.m27279calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyListState.getDensity$foundation_release(), f10), f11, f12);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPosition snapPosition, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyListState, snapPosition);
    }

    public static final int calculateFinalSnappingItem(Density density, float f10) {
        return Math.abs(f10) < density.mo27099toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp()) ? FinalSnappingItem.Companion.m27276getClosestItembbeMdSM() : f10 > 0.0f ? FinalSnappingItem.Companion.m27277getNextItembbeMdSM() : FinalSnappingItem.Companion.m27278getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return (int) (lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? lazyListLayoutInfo.mo27565getViewportSizeYbymL2g() & 4294967295L : lazyListLayoutInfo.mo27565getViewportSizeYbymL2g() >> 32);
    }

    @Composable
    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, SnapPosition snapPosition, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-338621290, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i10 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z10 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider(lazyListState, snapPosition);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehaviorRememberSnapFlingBehavior;
    }
}
