package androidx.compose.p014ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p296pd.InterfaceC10659g;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final InterfaceC9540l info;

    public InspectorValueInfo(InterfaceC9540l interfaceC9540l) {
        this.info = interfaceC9540l;
    }

    private final InspectorInfo getValues() {
        InspectorInfo inspectorInfo = this._values;
        if (inspectorInfo == null) {
            inspectorInfo = new InspectorInfo();
            this.info.invoke(inspectorInfo);
        }
        this._values = inspectorInfo;
        return inspectorInfo;
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public InterfaceC10659g getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.p014ui.platform.InspectableValue
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
