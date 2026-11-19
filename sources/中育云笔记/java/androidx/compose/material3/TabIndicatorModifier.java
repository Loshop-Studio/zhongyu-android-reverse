package androidx.compose.material3;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class TabIndicatorModifier extends ModifierNodeElement<TabIndicatorOffsetNode> {
    public static final int $stable = 0;
    private final boolean followContentSize;
    private final int selectedTabIndex;
    private final State<List<TabPosition>> tabPositionsState;

    /* JADX WARN: Multi-variable type inference failed */
    public TabIndicatorModifier(State<? extends List<TabPosition>> state, int i10, boolean z10) {
        this.tabPositionsState = state;
        this.selectedTabIndex = i10;
        this.followContentSize = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabIndicatorModifier copy$default(TabIndicatorModifier tabIndicatorModifier, State state, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            state = tabIndicatorModifier.tabPositionsState;
        }
        if ((i11 & 2) != 0) {
            i10 = tabIndicatorModifier.selectedTabIndex;
        }
        if ((i11 & 4) != 0) {
            z10 = tabIndicatorModifier.followContentSize;
        }
        return tabIndicatorModifier.copy(state, i10, z10);
    }

    public final State<List<TabPosition>> component1() {
        return this.tabPositionsState;
    }

    public final int component2() {
        return this.selectedTabIndex;
    }

    public final boolean component3() {
        return this.followContentSize;
    }

    public final TabIndicatorModifier copy(State<? extends List<TabPosition>> state, int i10, boolean z10) {
        return new TabIndicatorModifier(state, i10, z10);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        TabIndicatorModifier tabIndicatorModifier = (TabIndicatorModifier) obj;
        return AbstractC9979u.m20289b(this.tabPositionsState, tabIndicatorModifier.tabPositionsState) && this.selectedTabIndex == tabIndicatorModifier.selectedTabIndex && this.followContentSize == tabIndicatorModifier.followContentSize;
    }

    public final boolean getFollowContentSize() {
        return this.followContentSize;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final State<List<TabPosition>> getTabPositionsState() {
        return this.tabPositionsState;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.tabPositionsState.hashCode() * 31) + Integer.hashCode(this.selectedTabIndex)) * 31) + Boolean.hashCode(this.followContentSize);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    public String toString() {
        return "TabIndicatorModifier(tabPositionsState=" + this.tabPositionsState + ", selectedTabIndex=" + this.selectedTabIndex + ", followContentSize=" + this.followContentSize + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public TabIndicatorOffsetNode create() {
        return new TabIndicatorOffsetNode(this.tabPositionsState, this.selectedTabIndex, this.followContentSize);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(TabIndicatorOffsetNode tabIndicatorOffsetNode) {
        tabIndicatorOffsetNode.setTabPositionsState(this.tabPositionsState);
        tabIndicatorOffsetNode.setSelectedTabIndex(this.selectedTabIndex);
        tabIndicatorOffsetNode.setFollowContentSize(this.followContentSize);
    }
}
