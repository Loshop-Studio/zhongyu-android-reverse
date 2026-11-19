package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Actual_jvmKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.internal.AbstractC9137y;
import p101f8.InterfaceC8469g;

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(AbstractC9137y.m16154b(getClass()).mo13672g());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    public abstract N create();

    public abstract boolean equals(Object obj);

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public final InterfaceC8469g getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract void update(N n10);
}
