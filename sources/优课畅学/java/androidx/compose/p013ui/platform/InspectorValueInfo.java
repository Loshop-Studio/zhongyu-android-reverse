package androidx.compose.p013ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import p101f8.InterfaceC8469g;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class InspectorValueInfo implements InspectableValue {
    public static final int $stable = 8;
    private InspectorInfo _values;
    private final InterfaceC10570l info;

    public InspectorValueInfo(InterfaceC10570l interfaceC10570l) {
        this.info = interfaceC10570l;
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

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public InterfaceC8469g getInspectableElements() {
        return getValues().getProperties();
    }

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public String getNameFallback() {
        return getValues().getName();
    }

    @Override // androidx.compose.p013ui.platform.InspectableValue
    public Object getValueOverride() {
        return getValues().getValue();
    }
}
