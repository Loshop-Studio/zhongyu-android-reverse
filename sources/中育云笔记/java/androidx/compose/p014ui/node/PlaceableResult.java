package androidx.compose.p014ui.node;

import androidx.compose.p014ui.layout.MeasureResult;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class PlaceableResult implements OwnerScope {
    private final LookaheadCapablePlaceable placeable;
    private final MeasureResult result;

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = measureResult;
        this.placeable = lookaheadCapablePlaceable;
    }

    public static /* synthetic */ PlaceableResult copy$default(PlaceableResult placeableResult, MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            measureResult = placeableResult.result;
        }
        if ((i10 & 2) != 0) {
            lookaheadCapablePlaceable = placeableResult.placeable;
        }
        return placeableResult.copy(measureResult, lookaheadCapablePlaceable);
    }

    public final MeasureResult component1() {
        return this.result;
    }

    public final LookaheadCapablePlaceable component2() {
        return this.placeable;
    }

    public final PlaceableResult copy(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new PlaceableResult(measureResult, lookaheadCapablePlaceable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) obj;
        return AbstractC9979u.m20289b(this.result, placeableResult.result) && AbstractC9979u.m20289b(this.placeable, placeableResult.placeable);
    }

    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    public final MeasureResult getResult() {
        return this.result;
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.placeable.hashCode();
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.placeable.getCoordinates().isAttached();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.result + ", placeable=" + this.placeable + ')';
    }
}
