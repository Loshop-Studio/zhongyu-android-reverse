package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\f\u0010\u001d\u001a\u00020\u001b*\u00020\u001eH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierNode;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)V", "getBeyondBoundsInfo", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getReverseLayout", "()Z", "getState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "create", "equals", "other", "", "hashCode", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends ModifierNodeElement<LazyLayoutBeyondBoundsModifierNode> {
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final Orientation orientation;
    private final boolean reverseLayout;
    private final LazyLayoutBeyondBoundsState state;

    public LazyLayoutBeyondBoundsModifierElement(LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z9, Orientation orientation) {
        this.state = lazyLayoutBeyondBoundsState;
        this.beyondBoundsInfo = lazyLayoutBeyondBoundsInfo;
        this.reverseLayout = z9;
        this.orientation = orientation;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) other;
        return Intrinsics.areEqual(this.state, lazyLayoutBeyondBoundsModifierElement.state) && Intrinsics.areEqual(this.beyondBoundsInfo, lazyLayoutBeyondBoundsModifierElement.beyondBoundsInfo) && this.reverseLayout == lazyLayoutBeyondBoundsModifierElement.reverseLayout && this.orientation == lazyLayoutBeyondBoundsModifierElement.orientation;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    public final LazyLayoutBeyondBoundsState getState() {
        return this.state;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.state.hashCode() * 31) + this.beyondBoundsInfo.hashCode()) * 31) + Boolean.hashCode(this.reverseLayout)) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public LazyLayoutBeyondBoundsModifierNode create() {
        return new LazyLayoutBeyondBoundsModifierNode(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(LazyLayoutBeyondBoundsModifierNode node) {
        node.update(this.state, this.beyondBoundsInfo, this.reverseLayout, this.orientation);
    }
}
