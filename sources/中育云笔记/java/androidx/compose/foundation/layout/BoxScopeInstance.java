package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.platform.InspectableValueKt;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BoxScopeInstance implements BoxScope {
    public static final int $stable = 0;
    public static final BoxScopeInstance INSTANCE = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier align(Modifier modifier, final Alignment alignment) {
        return modifier.then(new BoxChildDataElement(alignment, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("align");
                inspectorInfo.setValue(alignment);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        return modifier.then(new BoxChildDataElement(Alignment.Companion.getCenter(), true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C10786q.f26013a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("matchParentSize");
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
