package androidx.compose.p014ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    private final ObserverModifierNode observerNode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC9540l OnObserveReadsChanged = new InterfaceC9540l() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ObserverNodeOwnerScope) obj);
            return C10786q.f26013a;
        }

        public final void invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.isValidOwnerScope()) {
                observerNodeOwnerScope.getObserverNode$ui_release().onObservedReadsChanged();
            }
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final InterfaceC9540l getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }

        private Companion() {
        }
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.observerNode;
    }

    @Override // androidx.compose.p014ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }
}
