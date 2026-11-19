package androidx.compose.material3;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.LayoutModifierKt;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import java.util.List;
import p181hd.InterfaceC9545q;
import p181hd.InterfaceC9546r;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class TabRowKt$ScrollableTabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {
    private final MutableState<List<TabPosition>> tabPositions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AbstractC10978w.m24136n(), null, 2, null);

    public final MutableState<List<TabPosition>> getTabPositions() {
        return this.tabPositions;
    }

    @Override // androidx.compose.material3.TabPositionsHolder
    public void setTabPositions(List<TabPosition> list) {
        this.tabPositions.setValue(list);
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier tabIndicatorLayout(Modifier modifier, final InterfaceC9546r interfaceC9546r) {
        return LayoutModifierKt.layout(modifier, new InterfaceC9545q() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1$tabIndicatorLayout$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m29213invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m33460unboximpl());
            }

            /* renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m29213invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                return (MeasureResult) interfaceC9546r.invoke(measureScope, measurable, Constraints.m33441boximpl(j10), this.getTabPositions().getValue());
            }
        });
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public Modifier tabIndicatorOffset(Modifier modifier, int i10, boolean z10) {
        return modifier.then(new TabIndicatorModifier(this.tabPositions, i10, z10));
    }
}
