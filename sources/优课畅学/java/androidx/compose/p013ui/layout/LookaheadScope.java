package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.layout.Placeable;

/* loaded from: classes2.dex */
public interface LookaheadScope {
    /* renamed from: localLookaheadPositionOf-au-aQtc$default, reason: not valid java name */
    static /* synthetic */ long m25655localLookaheadPositionOfauaQtc$default(LookaheadScope lookaheadScope, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: localLookaheadPositionOf-au-aQtc");
        }
        if ((i10 & 2) != 0) {
            j10 = Offset.Companion.m24051getZeroF1C5BW0();
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return lookaheadScope.mo20216localLookaheadPositionOfauaQtc(layoutCoordinates, layoutCoordinates2, j11, z10);
    }

    LayoutCoordinates getLookaheadScopeCoordinates(Placeable.PlacementScope placementScope);

    /* renamed from: localLookaheadPositionOf-au-aQtc */
    default long mo20216localLookaheadPositionOfauaQtc(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, long j10, boolean z10) {
        return LookaheadScopeKt.m25656localLookaheadPositionOfFgt4K4Q(this, layoutCoordinates, layoutCoordinates2, j10, z10);
    }

    LayoutCoordinates toLookaheadCoordinates(LayoutCoordinates layoutCoordinates);
}
