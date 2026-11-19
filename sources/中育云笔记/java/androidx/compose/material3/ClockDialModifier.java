package androidx.compose.material3;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final boolean autoSwitchToMinute;
    private final int selection;
    private final AnalogTimePickerState state;

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(analogTimePickerState, z10, i10);
    }

    private final AnalogTimePickerState component1() {
        return this.state;
    }

    private final boolean component2() {
        return this.autoSwitchToMinute;
    }

    /* renamed from: component3-yecRtBI, reason: not valid java name */
    private final int m28461component3yecRtBI() {
        return this.selection;
    }

    /* renamed from: copy-e8ubxrI$default, reason: not valid java name */
    public static /* synthetic */ ClockDialModifier m28462copye8ubxrI$default(ClockDialModifier clockDialModifier, AnalogTimePickerState analogTimePickerState, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            analogTimePickerState = clockDialModifier.state;
        }
        if ((i11 & 2) != 0) {
            z10 = clockDialModifier.autoSwitchToMinute;
        }
        if ((i11 & 4) != 0) {
            i10 = clockDialModifier.selection;
        }
        return clockDialModifier.m28463copye8ubxrI(analogTimePickerState, z10, i10);
    }

    /* renamed from: copy-e8ubxrI, reason: not valid java name */
    public final ClockDialModifier m28463copye8ubxrI(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        return new ClockDialModifier(analogTimePickerState, z10, i10, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return AbstractC9979u.m20289b(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && TimePickerSelectionMode.m29358equalsimpl0(this.selection, clockDialModifier.selection);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + Boolean.hashCode(this.autoSwitchToMinute)) * 31) + TimePickerSelectionMode.m29359hashCodeimpl(this.selection);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) TimePickerSelectionMode.m29360toStringimpl(this.selection)) + ')';
    }

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z10;
        this.selection = i10;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ClockDialNode create() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ClockDialNode clockDialNode) {
        clockDialNode.m28464updateNodee8ubxrI(this.state, this.autoSwitchToMinute, this.selection);
    }
}
