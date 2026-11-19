package androidx.compose.p014ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final InterfaceC9529a activeFocusTargetNodeFetcher;
    private final InterfaceC9529a invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;
    private final InterfaceC9540l onRequestApplyChangesListener;
    private final InterfaceC9529a rootFocusStateFetcher;
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();
    private final List<FocusEventModifierNode> focusEventNodesLegacy = new ArrayList();
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy = new ArrayList();
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidationLegacy$1 */
    public /* synthetic */ class C26951 extends FunctionReferenceImpl implements InterfaceC9529a {
        public C26951(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m30527invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m30527invoke() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$setUpOnRequestApplyChangesListener$1 */
    public /* synthetic */ class C26961 extends FunctionReferenceImpl implements InterfaceC9529a {
        public C26961(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m30528invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m30528invoke() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    public FocusInvalidationManager(InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3) {
        this.onRequestApplyChangesListener = interfaceC9540l;
        this.invalidateOwnerFocusState = interfaceC9529a;
        this.rootFocusStateFetcher = interfaceC9529a2;
        this.activeFocusTargetNodeFetcher = interfaceC9529a3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateNodesOptimized();
        } else {
            invalidateNodesLegacy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final void invalidateNodesLegacy() {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        FocusState focusState;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = 0;
        if (!((FocusState) this.rootFocusStateFetcher.invoke()).getHasFocus()) {
            List<FocusEventModifierNode> list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                list.get(i14).onFocusEvent(FocusStateImpl.Inactive);
            }
            List<FocusTargetNode> list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                FocusTargetNode focusTargetNode = list2.get(i15);
                if (focusTargetNode.isAttached() && !focusTargetNode.isInitialized$ui_release()) {
                    focusTargetNode.initializeFocusState$ui_release(FocusStateImpl.Inactive);
                }
            }
            this.focusTargetNodesLegacy.clear();
            this.focusEventNodesLegacy.clear();
            this.focusPropertiesNodesLegacy.clear();
            this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
            this.invalidateOwnerFocusState.invoke();
            return;
        }
        List<FocusPropertiesModifierNode> list3 = this.focusPropertiesNodesLegacy;
        int size3 = list3.size();
        int i16 = 0;
        while (true) {
            i10 = 1024;
            i11 = 16;
            i12 = 1;
            if (i16 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = list3.get(i16);
            if (focusPropertiesModifierNode.getNode().isAttached()) {
                int iM32510constructorimpl = NodeKind.m32510constructorimpl(1024);
                Modifier.Node node = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        int i17 = 0;
                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                i17++;
                                if (i17 == 1) {
                                    node = delegate$ui_release;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        mutableVector.add(node);
                                        node = null;
                                    }
                                    mutableVector.add(delegate$ui_release);
                                }
                            }
                        }
                        if (i17 == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
                if (!focusPropertiesModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusPropertiesModifierNode.getNode(), false);
                } else {
                    mutableVector2.add(child$ui_release);
                }
                while (mutableVector2.getSize() != 0) {
                    Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((nodePop.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
                    } else {
                        while (true) {
                            if (nodePop == null) {
                                break;
                            }
                            if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) nodePop);
                                    } else if ((nodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i18 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                                i18++;
                                                if (i18 == 1) {
                                                    nodePop = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector3.add(nodePop);
                                                        nodePop = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i18 == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector3);
                                }
                            } else {
                                nodePop = nodePop.getChild$ui_release();
                            }
                        }
                    }
                }
            }
            i16++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i19 = 0;
        while (i19 < size4) {
            FocusEventModifierNode focusEventModifierNode = list4.get(i19);
            if (focusEventModifierNode.getNode().isAttached()) {
                int iM32510constructorimpl2 = NodeKind.m32510constructorimpl(i10);
                Modifier.Node node2 = focusEventModifierNode.getNode();
                int i20 = z14;
                int i21 = i12;
                FocusTargetNode focusTargetNode2 = null;
                MutableVector mutableVector4 = null;
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                        if (focusTargetNode2 != null) {
                            i20 = i12;
                        }
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            i21 = z14;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node2.getKindSet$ui_release() & iM32510constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release3 = ((DelegatingNode) node2).getDelegate$ui_release();
                        int i22 = z14;
                        while (delegate$ui_release3 != null) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                                i22++;
                                if (i22 == i12) {
                                    node2 = delegate$ui_release3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[i11], z14);
                                    }
                                    if (node2 != null) {
                                        mutableVector4.add(node2);
                                        node2 = null;
                                    }
                                    mutableVector4.add(delegate$ui_release3);
                                }
                            }
                            delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                            i12 = 1;
                        }
                        int i23 = i12;
                        if (i22 == i23) {
                            i12 = i23;
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector4);
                    i12 = 1;
                }
                if (!focusEventModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i11], z14);
                Modifier.Node child$ui_release2 = focusEventModifierNode.getNode().getChild$ui_release();
                if (child$ui_release2 == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusEventModifierNode.getNode(), z14);
                } else {
                    mutableVector5.add(child$ui_release2);
                }
                while (mutableVector5.getSize() != 0) {
                    Modifier.Node nodePop2 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                    z14 = z14;
                    if ((nodePop2.getAggregateChildKindSet$ui_release() & iM32510constructorimpl2) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, nodePop2, z14);
                    } else {
                        while (nodePop2 != null) {
                            if ((nodePop2.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                                MutableVector mutableVector6 = null;
                                z14 = z14;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) nodePop2;
                                        if (focusTargetNode2 != null) {
                                            i20 = 1;
                                        }
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            i21 = z14 == true ? 1 : 0;
                                        }
                                        z11 = z14 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                    } else if ((nodePop2.getKindSet$ui_release() & iM32510constructorimpl2) == 0 || !(nodePop2 instanceof DelegatingNode)) {
                                        z11 = z14 == true ? 1 : 0;
                                    } else {
                                        Modifier.Node delegate$ui_release4 = ((DelegatingNode) nodePop2).getDelegate$ui_release();
                                        int i24 = z14 == true ? 1 : 0;
                                        boolean z15 = z14;
                                        while (delegate$ui_release4 != null) {
                                            if ((delegate$ui_release4.getKindSet$ui_release() & iM32510constructorimpl2) != 0) {
                                                i24++;
                                                if (i24 == 1) {
                                                    nodePop2 = delegate$ui_release4;
                                                    z13 = false;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        Modifier.Node[] nodeArr = new Modifier.Node[i11];
                                                        z13 = false;
                                                        mutableVector6 = new MutableVector(nodeArr, 0);
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector6.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector6.add(delegate$ui_release4);
                                                }
                                            } else {
                                                z13 = z15;
                                            }
                                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                            z15 = z13;
                                            i11 = 16;
                                        }
                                        z12 = z15;
                                        z12 = z12;
                                        if (i24 != 1) {
                                            nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                        }
                                        z14 = z12;
                                        i11 = 16;
                                    }
                                    z12 = z11;
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                    z14 = z12;
                                    i11 = 16;
                                }
                                boolean z16 = z14 == true ? 1 : 0;
                                i11 = 16;
                            } else {
                                boolean z17 = z14 == true ? 1 : 0;
                                nodePop2 = nodePop2.getChild$ui_release();
                                z14 = z17 ? 1 : 0;
                                i11 = 16;
                            }
                        }
                    }
                    z14 = z14 ? 1 : 0;
                    i11 = 16;
                }
                z10 = z14 == true ? 1 : 0;
                i13 = 1;
                if (i21 != 0) {
                    if (i20 != 0) {
                        focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                    } else if (focusTargetNode2 == null || (focusState = focusTargetNode2.getFocusState()) == null) {
                        focusState = FocusStateImpl.Inactive;
                    }
                    focusEventModifierNode.onFocusEvent(focusState);
                }
            } else {
                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                z10 = z14;
                i13 = i12;
            }
            i19++;
            i12 = i13;
            z14 = z10;
            i10 = 1024;
            i11 = 16;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
        int size5 = list5.size();
        for (int i25 = z14; i25 < size5; i25++) {
            FocusTargetNode focusTargetNode5 = list5.get(i25);
            if (focusTargetNode5.isAttached()) {
                FocusStateImpl focusState2 = focusTargetNode5.getFocusState();
                focusTargetNode5.invalidateFocus$ui_release();
                if (focusState2 != focusTargetNode5.getFocusState() || this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(focusTargetNode5)) {
                    focusTargetNode5.dispatchFocusCallbacks$ui_release();
                }
            }
        }
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodesLegacy.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodesLegacy.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodesLegacy.isEmpty()) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void invalidateNodesOptimized() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.focus.FocusInvalidationManager.invalidateNodesOptimized():void");
    }

    private final <T> void scheduleInvalidationLegacy(List<T> list, T t10) {
        if (list.add(t10) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new C26951(this));
        }
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new C26961(this));
        this.isInvalidationScheduled = true;
    }

    public final boolean hasPendingInvalidation() {
        return ComposeUiFlags.isTrackFocusEnabled ? this.isInvalidationScheduled : (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    public final void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusTargetNodes, focusTargetNode);
        } else {
            scheduleInvalidationLegacy(this.focusTargetNodesLegacy, focusTargetNode);
        }
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusEventNodes, focusEventModifierNode);
        } else {
            scheduleInvalidationLegacy(this.focusEventNodesLegacy, focusEventModifierNode);
        }
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, focusPropertiesModifierNode);
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t10) {
        if (mutableScatterSet.add(t10)) {
            setUpOnRequestApplyChangesListener();
        }
    }
}
