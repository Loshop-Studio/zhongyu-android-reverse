package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.BeyondBoundsLayout;
import androidx.compose.p006ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p006ui.modifier.AbstractC1436b;
import androidx.compose.p006ui.modifier.ModifierLocal;
import androidx.compose.p006ui.modifier.ModifierLocalMap;
import androidx.compose.p006ui.modifier.ModifierLocalNode;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.ModifierNodeElement;
import androidx.compose.p006ui.node.NodeChain;
import androidx.compose.p006ui.node.NodeKind;
import androidx.compose.p006ui.node.ObserverNode;
import androidx.compose.p006ui.node.ObserverNodeKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\r\u0010\u001b\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001cR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/node/ObserverNode;", "Landroidx/compose/ui/modifier/ModifierLocalNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "beyondBoundsLayoutParent", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "getBeyondBoundsLayoutParent$ui_release", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "focusState", "Landroidx/compose/ui/focus/FocusState;", "getFocusState", "()Landroidx/compose/ui/focus/FocusState;", "focusStateImpl", "Landroidx/compose/ui/focus/FocusStateImpl;", "getFocusStateImpl$ui_release", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusStateImpl$ui_release", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "fetchFocusProperties", "Landroidx/compose/ui/focus/FocusProperties;", "fetchFocusProperties$ui_release", "invalidateFocus", "", "invalidateFocus$ui_release", "onObservedReadsChanged", "onReset", "scheduleInvalidationForFocusEvents", "scheduleInvalidationForFocusEvents$ui_release", "FocusTargetModifierElement", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nFocusTargetModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,137:1\n89#2:138\n87#2:139\n87#2:150\n91#2:159\n87#2:160\n87#2:171\n47#3:140\n47#3:161\n78#4,9:141\n88#4,7:152\n78#4,9:162\n88#4,7:173\n196#5:151\n196#5:172\n*S KotlinDebug\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n*L\n84#1:138\n84#1:139\n87#1:150\n116#1:159\n116#1:160\n117#1:171\n84#1:140\n116#1:161\n84#1:141,9\n84#1:152,7\n116#1:162,9\n116#1:173,7\n87#1:151\n117#1:172\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTargetModifierNode extends Modifier.Node implements ObserverNode, ModifierLocalNode {
    public static final int $stable = 8;
    private FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;

    @Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016J\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0016¨\u0006\u0010"}, m5175d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode$FocusTargetModifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "()V", "create", "equals", "", "other", "", "hashCode", "", "update", "node", "inspectableProperties", "", "Landroidx/compose/ui/platform/InspectorInfo;", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FocusTargetModifierElement extends ModifierNodeElement<FocusTargetModifierNode> {
        public static final FocusTargetModifierElement INSTANCE = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        @Override // androidx.compose.p006ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            return other == this;
        }

        @Override // androidx.compose.p006ui.node.ModifierNodeElement
        public int hashCode() {
            return 1739042953;
        }

        @Override // androidx.compose.p006ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
            inspectorInfo.setName("focusTarget");
        }

        @Override // androidx.compose.p006ui.node.ModifierNodeElement
        public FocusTargetModifierNode update(FocusTargetModifierNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return node;
        }

        @Override // androidx.compose.p006ui.node.ModifierNodeElement
        public FocusTargetModifierNode create() {
            return new FocusTargetModifierNode();
        }
    }

    @ExperimentalComposeUiApi
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(2048) | NodeKind.m10773constructorimpl(1024);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM10773constructorimpl) != 0) {
                        if ((NodeKind.m10773constructorimpl(1024) & parent.getKindSet()) != 0) {
                            return focusPropertiesImpl;
                        }
                        if (!(parent instanceof FocusPropertiesModifierNode)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        ((FocusPropertiesModifierNode) parent).modifyFocusProperties(focusPropertiesImpl);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return focusPropertiesImpl;
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent$ui_release() {
        return (BeyondBoundsLayout) getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    @Override // androidx.compose.p006ui.modifier.ModifierLocalNode, androidx.compose.p006ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return AbstractC1436b.m704a(this, modifierLocal);
    }

    public final FocusState getFocusState() {
        return this.focusStateImpl;
    }

    /* renamed from: getFocusStateImpl$ui_release, reason: from getter */
    public final FocusStateImpl getFocusStateImpl() {
        return this.focusStateImpl;
    }

    @Override // androidx.compose.p006ui.modifier.ModifierLocalNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return AbstractC1436b.m705b(this);
    }

    public final void invalidateFocus$ui_release() {
        FocusProperties focusProperties;
        FocusState focusState = getFocusState();
        if (!(focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured)) {
            if (focusState == FocusStateImpl.ActiveParent) {
                return;
            }
            FocusStateImpl focusStateImpl = FocusStateImpl.Active;
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ObserverNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTargetModifierNode$invalidateFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, androidx.compose.ui.focus.FocusProperties] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                objectRef.element = this.fetchFocusProperties$ui_release();
            }
        });
        T t3 = objectRef.element;
        if (t3 == 0) {
            Intrinsics.throwUninitializedPropertyAccessException("focusProperties");
            focusProperties = null;
        } else {
            focusProperties = (FocusProperties) t3;
        }
        if (focusProperties.getCanFocus()) {
            return;
        }
        DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
    }

    @Override // androidx.compose.p006ui.node.ObserverNode
    public void onObservedReadsChanged() {
        FocusState focusState = getFocusState();
        invalidateFocus$ui_release();
        if (Intrinsics.areEqual(focusState, getFocusState())) {
            return;
        }
        FocusEventModifierNodeKt.refreshFocusEventNodes(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        FocusState focusState = getFocusState();
        if (focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            return;
        }
        if (focusState == FocusStateImpl.ActiveParent) {
            scheduleInvalidationForFocusEvents$ui_release();
            this.focusStateImpl = FocusStateImpl.Inactive;
        } else if (focusState == FocusStateImpl.Inactive) {
            scheduleInvalidationForFocusEvents$ui_release();
        }
    }

    @Override // androidx.compose.p006ui.modifier.ModifierLocalNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        AbstractC1436b.m706c(this, modifierLocal, obj);
    }

    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes;
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(4096) | NodeKind.m10773constructorimpl(1024);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM10773constructorimpl) != 0) {
                        if ((NodeKind.m10773constructorimpl(1024) & parent.getKindSet()) != 0) {
                            continue;
                        } else {
                            if (!(parent instanceof FocusEventModifierNode)) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            DelegatableNodeKt.requireOwner(this).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) parent);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    public final void setFocusStateImpl$ui_release(FocusStateImpl focusStateImpl) {
        Intrinsics.checkNotNullParameter(focusStateImpl, "<set-?>");
        this.focusStateImpl = focusStateImpl;
    }
}
