package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance = Float.NaN;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    public AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void dragTo(float f10, float f11) {
        float offset = this.this$0.getOffset();
        this.this$0.setOffset(f10);
        this.this$0.setLastVelocity(f11);
        if (Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(f10 >= offset);
    }

    public final float getDistance() {
        return this.distance;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setDistance(float f10) {
        this.distance = f10;
    }

    public final void setLeftBound(T t10) {
        this.leftBound = t10;
    }

    public final void setRightBound(T t10) {
        this.rightBound = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [T, java.lang.Object] */
    public final void updateBounds(boolean z10) {
        if (this.this$0.getOffset() == this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) {
            Object objClosestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset() + (z10 ? 1.0f : -1.0f), z10);
            T currentValue = objClosestAnchor;
            if (objClosestAnchor == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (z10) {
                this.leftBound = this.this$0.getCurrentValue();
                this.rightBound = currentValue;
            } else {
                this.leftBound = currentValue;
                this.rightBound = this.this$0.getCurrentValue();
            }
        } else {
            Object objClosestAnchor2 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), false);
            T currentValue2 = objClosestAnchor2;
            if (objClosestAnchor2 == null) {
                currentValue2 = this.this$0.getCurrentValue();
            }
            Object objClosestAnchor3 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), true);
            T currentValue3 = objClosestAnchor3;
            if (objClosestAnchor3 == null) {
                currentValue3 = this.this$0.getCurrentValue();
            }
            this.leftBound = currentValue2;
            this.rightBound = currentValue3;
        }
        DraggableAnchors anchors = this.this$0.getAnchors();
        T t10 = this.leftBound;
        AbstractC9133u.m16130d(t10);
        float fPositionOf = anchors.positionOf(t10);
        DraggableAnchors anchors2 = this.this$0.getAnchors();
        T t11 = this.rightBound;
        AbstractC9133u.m16130d(t11);
        this.distance = Math.abs(fPositionOf - anchors2.positionOf(t11));
    }

    public final void updateIfNeeded(boolean z10) {
        updateBounds(z10);
        if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) >= this.distance / 2.0f) {
            Object currentValue = z10 ? this.rightBound : this.leftBound;
            if (currentValue == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(currentValue)).booleanValue()) {
                this.this$0.setCurrentValue(currentValue);
            }
        }
    }
}
