package androidx.compose.p014ui.node;

import androidx.compose.p014ui.Actual_jvmKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValue;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.internal.AbstractC9983y;
import p296pd.InterfaceC10659g;

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
        inspectorInfo2.setName(AbstractC9983y.m20315b(getClass()).mo20277f());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    public abstract N create();

    public abstract boolean equals(Object obj);

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public final InterfaceC10659g getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Actual_jvmKt.tryPopulateReflectively(inspectorInfo, this);
    }

    public abstract void update(N n10);
}
