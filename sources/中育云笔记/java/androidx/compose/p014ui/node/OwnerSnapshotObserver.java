package androidx.compose.p014ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;
    private final SnapshotStateObserver observer;
    private final InterfaceC9540l onCommitAffectingLookaheadMeasure = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    };
    private final InterfaceC9540l onCommitAffectingMeasure = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    };
    private final InterfaceC9540l onCommitAffectingSemantics = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                layoutNode.invalidateSemantics$ui_release();
            }
        }
    };
    private final InterfaceC9540l onCommitAffectingLayout = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final InterfaceC9540l onCommitAffectingLayoutModifier = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final InterfaceC9540l onCommitAffectingLayoutModifierInLookahead = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };
    private final InterfaceC9540l onCommitAffectingLookahead = new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LayoutNode) obj);
            return C10786q.f26013a;
        }

        public final void invoke(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    public OwnerSnapshotObserver(InterfaceC9540l interfaceC9540l) {
        this.observer = new SnapshotStateObserver(interfaceC9540l);
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z10, interfaceC9529a);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z10, interfaceC9529a);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z10, interfaceC9529a);
    }

    public final void clear$ui_release(Object obj) {
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new InterfaceC9540l() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(Object obj) {
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
            }
        });
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(LayoutNode layoutNode, boolean z10, InterfaceC9529a interfaceC9529a) {
        if (!z10 || layoutNode.getLookaheadRoot$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, interfaceC9529a);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, interfaceC9529a);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(LayoutNode layoutNode, boolean z10, InterfaceC9529a interfaceC9529a) {
        if (!z10 || layoutNode.getLookaheadRoot$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, interfaceC9529a);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookahead, interfaceC9529a);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(LayoutNode layoutNode, boolean z10, InterfaceC9529a interfaceC9529a) {
        if (!z10 || layoutNode.getLookaheadRoot$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, interfaceC9529a);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, interfaceC9529a);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(T t10, InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a) {
        this.observer.observeReads(t10, interfaceC9540l, interfaceC9529a);
    }

    public final void observeSemanticsReads$ui_release(LayoutNode layoutNode, InterfaceC9529a interfaceC9529a) {
        observeReads$ui_release(layoutNode, this.onCommitAffectingSemantics, interfaceC9529a);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
