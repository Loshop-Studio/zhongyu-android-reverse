package androidx.compose.foundation.lazy;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {
    private final float fraction;
    private final State<Integer> heightState;
    private final String inspectorName;
    private final State<Integer> widthState;

    public /* synthetic */ ParentSizeElement(float f10, State state, State state2, String str, int i10, AbstractC9972n abstractC9972n) {
        this(f10, (i10 & 2) != 0 ? null : state, (i10 & 4) != 0 ? null : state2, str);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.fraction == parentSizeElement.fraction && AbstractC9979u.m20289b(this.widthState, parentSizeElement.widthState) && AbstractC9979u.m20289b(this.heightState, parentSizeElement.heightState);
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final State<Integer> getHeightState() {
        return this.heightState;
    }

    public final String getInspectorName() {
        return this.inspectorName;
    }

    public final State<Integer> getWidthState() {
        return this.widthState;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        State<Integer> state = this.widthState;
        int iHashCode = (state != null ? state.hashCode() : 0) * 31;
        State<Integer> state2 = this.heightState;
        return ((iHashCode + (state2 != null ? state2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.setValue(Float.valueOf(this.fraction));
    }

    public ParentSizeElement(float f10, State<Integer> state, State<Integer> state2, String str) {
        this.fraction = f10;
        this.widthState = state;
        this.heightState = state2;
        this.inspectorName = str;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ParentSizeNode create() {
        return new ParentSizeNode(this.fraction, this.widthState, this.heightState);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ParentSizeNode parentSizeNode) {
        parentSizeNode.setFraction(this.fraction);
        parentSizeNode.setWidthState(this.widthState);
        parentSizeNode.setHeightState(this.heightState);
    }
}
