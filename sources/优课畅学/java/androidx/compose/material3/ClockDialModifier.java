package androidx.compose.material3;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final boolean autoSwitchToMinute;
    private final int selection;
    private final AnalogTimePickerState state;

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this(analogTimePickerState, z10, i10);
    }

    private final AnalogTimePickerState component1() {
        return this.state;
    }

    private final boolean component2() {
        return this.autoSwitchToMinute;
    }

    /* renamed from: component3-yecRtBI, reason: not valid java name */
    private final int m21859component3yecRtBI() {
        return this.selection;
    }

    /* renamed from: copy-e8ubxrI$default, reason: not valid java name */
    public static /* synthetic */ ClockDialModifier m21860copye8ubxrI$default(ClockDialModifier clockDialModifier, AnalogTimePickerState analogTimePickerState, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            analogTimePickerState = clockDialModifier.state;
        }
        if ((i11 & 2) != 0) {
            z10 = clockDialModifier.autoSwitchToMinute;
        }
        if ((i11 & 4) != 0) {
            i10 = clockDialModifier.selection;
        }
        return clockDialModifier.m21861copye8ubxrI(analogTimePickerState, z10, i10);
    }

    /* renamed from: copy-e8ubxrI, reason: not valid java name */
    public final ClockDialModifier m21861copye8ubxrI(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        return new ClockDialModifier(analogTimePickerState, z10, i10, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return AbstractC9133u.m16128b(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && TimePickerSelectionMode.m22756equalsimpl0(this.selection, clockDialModifier.selection);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + Boolean.hashCode(this.autoSwitchToMinute)) * 31) + TimePickerSelectionMode.m22757hashCodeimpl(this.selection);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) TimePickerSelectionMode.m22758toStringimpl(this.selection)) + ')';
    }

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z10, int i10) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z10;
        this.selection = i10;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public ClockDialNode create() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(ClockDialNode clockDialNode) {
        clockDialNode.m21862updateNodee8ubxrI(this.state, this.autoSwitchToMinute, this.selection);
    }
}
