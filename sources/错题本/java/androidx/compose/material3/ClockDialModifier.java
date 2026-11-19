package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u0007HÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010\u0010J\u001a\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\b\u0010)\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m5110d2 = {"Landroidx/compose/material3/ClockDialModifier;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/ClockDialNode;", "Landroidx/compose/material3/AnalogTimePickerState;", "state", "", "autoSwitchToMinute", "Landroidx/compose/material3/TimePickerSelectionMode;", "selection", "<init>", "(Landroidx/compose/material3/AnalogTimePickerState;ZILkotlin/jvm/internal/e;)V", "component1", "()Landroidx/compose/material3/AnalogTimePickerState;", "component2", "()Z", "component3-yecRtBI", "()I", "component3", "create", "()Landroidx/compose/material3/ClockDialNode;", "node", "Ld6/s;", "update", "(Landroidx/compose/material3/ClockDialNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy-e8ubxrI", "(Landroidx/compose/material3/AnalogTimePickerState;ZI)Landroidx/compose/material3/ClockDialModifier;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/material3/AnalogTimePickerState;", "Z", "I", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final /* data */ class ClockDialModifier extends ModifierNodeElement<ClockDialNode> {
    public static final int $stable = 0;
    private final boolean autoSwitchToMinute;
    private final int selection;

    @NotNull
    private final AnalogTimePickerState state;

    public /* synthetic */ ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z8, int i, AbstractC5824e abstractC5824e) {
        this(analogTimePickerState, z8, i);
    }

    /* renamed from: component1, reason: from getter */
    private final AnalogTimePickerState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getAutoSwitchToMinute() {
        return this.autoSwitchToMinute;
    }

    /* renamed from: component3-yecRtBI, reason: not valid java name and from getter */
    private final int getSelection() {
        return this.selection;
    }

    /* renamed from: copy-e8ubxrI$default, reason: not valid java name */
    public static /* synthetic */ ClockDialModifier m8266copye8ubxrI$default(ClockDialModifier clockDialModifier, AnalogTimePickerState analogTimePickerState, boolean z8, int i, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            analogTimePickerState = clockDialModifier.state;
        }
        if ((i8 & 2) != 0) {
            z8 = clockDialModifier.autoSwitchToMinute;
        }
        if ((i8 & 4) != 0) {
            i = clockDialModifier.selection;
        }
        return clockDialModifier.m8267copye8ubxrI(analogTimePickerState, z8, i);
    }

    @NotNull
    /* renamed from: copy-e8ubxrI, reason: not valid java name */
    public final ClockDialModifier m8267copye8ubxrI(@NotNull AnalogTimePickerState state, boolean autoSwitchToMinute, int selection) {
        return new ClockDialModifier(state, autoSwitchToMinute, selection, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) other;
        return AbstractC5830k.m5325b(this.state, clockDialModifier.state) && this.autoSwitchToMinute == clockDialModifier.autoSwitchToMinute && TimePickerSelectionMode.m9162equalsimpl0(this.selection, clockDialModifier.selection);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public int hashCode() {
        return TimePickerSelectionMode.m9163hashCodeimpl(this.selection) + AbstractC0584a.m908i(this.autoSwitchToMinute, this.state.hashCode() * 31, 31);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void inspectableProperties(@NotNull InspectorInfo inspectorInfo) {
    }

    @NotNull
    public String toString() {
        return "ClockDialModifier(state=" + this.state + ", autoSwitchToMinute=" + this.autoSwitchToMinute + ", selection=" + ((Object) TimePickerSelectionMode.m9164toStringimpl(this.selection)) + ')';
    }

    private ClockDialModifier(AnalogTimePickerState analogTimePickerState, boolean z8, int i) {
        this.state = analogTimePickerState;
        this.autoSwitchToMinute = z8;
        this.selection = i;
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    @NotNull
    /* renamed from: create */
    public ClockDialNode getNode() {
        return new ClockDialNode(this.state, this.autoSwitchToMinute, this.selection, null);
    }

    @Override // androidx.compose.p011ui.node.ModifierNodeElement
    public void update(@NotNull ClockDialNode node) {
        node.m8268updateNodee8ubxrI(this.state, this.autoSwitchToMinute, this.selection);
    }
}
