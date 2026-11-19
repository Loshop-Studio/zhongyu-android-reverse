package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.Pair;
import p077d8.AbstractC8323h;
import p123h7.AbstractC8726f;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final InterfaceC10575q interfaceC10575q) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final Pair<Float, Float> searchForSnappingBounds(SnapPosition snapPosition, float f10) {
                float f11;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = pagerState;
                int size = visiblePagesInfo.size();
                int i10 = 0;
                float f12 = Float.NEGATIVE_INFINITY;
                float f13 = Float.POSITIVE_INFINITY;
                while (true) {
                    f11 = 0.0f;
                    if (i10 >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i10);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f12) {
                        f12 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f13) {
                        f13 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i10++;
                }
                if (f12 == Float.NEGATIVE_INFINITY) {
                    f12 = f13;
                }
                if (f13 == Float.POSITIVE_INFINITY) {
                    f13 = f12;
                }
                if (!pagerState.getCanScrollForward()) {
                    if (PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState, f10)) {
                        f12 = 0.0f;
                        f13 = 0.0f;
                    } else {
                        f13 = 0.0f;
                    }
                }
                if (pagerState.getCanScrollBackward()) {
                    f11 = f12;
                } else if (!PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState, f10)) {
                    f13 = 0.0f;
                }
                return AbstractC8726f.m14230a(Float.valueOf(f11), Float.valueOf(f13));
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f10, float f11) {
                int pageSize$foundation_release = pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
                if (pageSize$foundation_release == 0) {
                    return 0.0f;
                }
                int firstVisiblePage$foundation_release = f10 < 0.0f ? pagerState.getFirstVisiblePage$foundation_release() + 1 : pagerState.getFirstVisiblePage$foundation_release();
                int iM13510e = AbstractC8323h.m13510e(Math.abs((AbstractC8323h.m13518m(pagerSnapDistance.calculateTargetPage(firstVisiblePage$foundation_release, AbstractC8323h.m13518m(((int) (f11 / pageSize$foundation_release)) + firstVisiblePage$foundation_release, 0, pagerState.getPageCount()), f10, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount()) - firstVisiblePage$foundation_release) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                return iM13510e == 0 ? iM13510e : iM13510e * Math.signum(f10);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f10) {
                Pair<Float, Float> pairSearchForSnappingBounds = searchForSnappingBounds(pagerState.getLayoutInfo().getSnapPosition(), f10);
                float fFloatValue = ((Number) pairSearchForSnappingBounds.m15903a()).floatValue();
                float fFloatValue2 = ((Number) pairSearchForSnappingBounds.m15904b()).floatValue();
                float fFloatValue3 = ((Number) interfaceC10575q.invoke(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
                if (!(fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f)) {
                    InlineClassHelperKt.throwIllegalStateException("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (isValidDistance(fFloatValue3)) {
                    return fFloatValue3;
                }
                return 0.0f;
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo();
            }

            public final boolean isValidDistance(float f10) {
                return (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) ? false : true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState r5, androidx.compose.p013ui.unit.LayoutDirection r6, float r7, float r8, float r9, float r10) {
        /*
            boolean r0 = isScrollingForward(r5, r8)
            androidx.compose.foundation.pager.PagerLayoutInfo r1 = r5.getLayoutInfo()
            androidx.compose.foundation.gestures.Orientation r1 = r1.getOrientation()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r1 != r2) goto L11
            goto L1b
        L11:
            androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p013ui.unit.LayoutDirection.Ltr
            if (r6 != r1) goto L16
            goto L1b
        L16:
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            androidx.compose.foundation.pager.PagerLayoutInfo r6 = r5.getLayoutInfo()
            int r6 = r6.getPageSize()
            r1 = 0
            if (r6 != 0) goto L28
            r2 = r1
            goto L2e
        L28:
            float r2 = dragGestureDelta(r5)
            float r6 = (float) r6
            float r2 = r2 / r6
        L2e:
            int r6 = (int) r2
            float r6 = (float) r6
            float r6 = r2 - r6
            androidx.compose.ui.unit.Density r3 = r5.getDensity$foundation_release()
            int r8 = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(r3, r8)
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.Companion
            int r4 = r3.m20674getClosestItembbeMdSM()
            boolean r4 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m20670equalsimpl0(r8, r4)
            if (r4 == 0) goto L71
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L51
            if (r0 == 0) goto L86
            goto L7b
        L51:
            float r6 = java.lang.Math.abs(r2)
            float r5 = r5.getPositionThresholdFraction$foundation_release()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 < 0) goto L64
            if (r0 == 0) goto L7b
            goto L86
        L64:
            float r5 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L7b
            goto L86
        L71:
            int r5 = r3.m20675getNextItembbeMdSM()
            boolean r5 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m20670equalsimpl0(r8, r5)
            if (r5 == 0) goto L7c
        L7b:
            return r10
        L7c:
            int r5 = r3.m20676getPreviousItembbeMdSM()
            boolean r5 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m20670equalsimpl0(r8, r5)
            if (r5 == 0) goto L87
        L86:
            return r9
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.unit.LayoutDirection, float, float, float, float):float");
    }

    private static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Float.intBitsToFloat((int) (pagerState.m21115getUpDownDifferenceF1C5BW0$foundation_release() >> 32)) : Float.intBitsToFloat((int) (pagerState.m21115getUpDownDifferenceF1C5BW0$foundation_release() & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState, float f10) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        boolean z10 = (pagerState.isNotGestureAction$foundation_release() ? -f10 : dragGestureDelta(pagerState)) > 0.0f;
        return (z10 && reverseLayout) || !(z10 || reverseLayout);
    }

    private static final void debugLog(InterfaceC10559a interfaceC10559a) {
    }
}
