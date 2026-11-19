package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.NodeCoordinator;
import androidx.compose.p006ui.node.NodeKind;
import androidx.compose.p006ui.node.ObserverNodeKt;
import androidx.compose.p006ui.node.Owner;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0003\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\f\u0010\f\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\r"}, m5175d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,242:1\n87#2:243\n87#2:245\n87#2:247\n324#3:244\n324#3:246\n324#3:248\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n55#1:243\n185#1:245\n209#1:247\n55#1:244\n185#1:246\n209#1:248\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTransactionsKt {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean captureFocus(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i4 == 2) {
            return true;
        }
        if (i4 == 3 || i4 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @ExperimentalComposeUiApi
    private static final boolean clearChildFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z3, boolean z4) {
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z3, z4);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return clearChildFocus(focusTargetModifierNode, z3, z4);
    }

    @ExperimentalComposeUiApi
    public static final boolean clearFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
            if (z4) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
        } else {
            if (i4 == 2) {
                if (!z3) {
                    return z3;
                }
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
                if (!z4) {
                    return z3;
                }
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                return z3;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (!clearChildFocus(focusTargetModifierNode, z3, z4)) {
                    return false;
                }
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
                if (z4) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                }
            }
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z3, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        return clearFocus(focusTargetModifierNode, z3, z4);
    }

    @ExperimentalComposeUiApi
    public static final boolean freeFocus(FocusTargetModifierNode focusTargetModifierNode) {
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 == 1) {
            return true;
        }
        if (i4 == 2) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i4 == 3 || i4 == 4) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean grantFocus(final FocusTargetModifierNode focusTargetModifierNode) {
        ObserverNodeKt.observeReads(focusTargetModifierNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                focusTargetModifierNode.fetchFocusProperties$ui_release();
            }
        });
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 != 3 && i4 != 4) {
            return true;
        }
        focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        return true;
    }

    @ExperimentalComposeUiApi
    public static final boolean requestFocus(FocusTargetModifierNode focusTargetModifierNode) {
        boolean z3;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
            return TwoDimensionalFocusSearchKt.m8906findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, FocusDirection.INSTANCE.m8880getEnterdhqQ8s(), new Function1<FocusTargetModifierNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.requestFocus.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(FocusTargetModifierNode it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
                }
            });
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 == 1 || i4 == 2) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        }
        if (i4 == 3) {
            z3 = clearChildFocus$default(focusTargetModifierNode, false, false, 3, null) && grantFocus(focusTargetModifierNode);
            if (z3) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
            return z3;
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m10773constructorimpl(1024));
        FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) (nodeNearestAncestor instanceof FocusTargetModifierNode ? nodeNearestAncestor : null);
        if (focusTargetModifierNode2 != null) {
            return requestFocusForChild(focusTargetModifierNode2, focusTargetModifierNode);
        }
        z3 = requestFocusForOwner(focusTargetModifierNode) && grantFocus(focusTargetModifierNode);
        if (z3) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
        }
        return z3;
    }

    private static final boolean requestFocusForChild(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        Modifier.Node nodeNearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode2, NodeKind.m10773constructorimpl(1024));
        if (!(nodeNearestAncestor instanceof FocusTargetModifierNode)) {
            nodeNearestAncestor = null;
        }
        if (!Intrinsics.areEqual((FocusTargetModifierNode) nodeNearestAncestor, focusTargetModifierNode)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl().ordinal()];
        if (i4 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetModifierNode2);
            if (!zGrantFocus) {
                return zGrantFocus;
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.ActiveParent);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return zGrantFocus;
        }
        if (i4 == 2) {
            return false;
        }
        if (i4 == 3) {
            if (FocusTraversalKt.getActiveChild(focusTargetModifierNode) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            boolean z3 = clearChildFocus$default(focusTargetModifierNode, false, false, 3, null) && grantFocus(focusTargetModifierNode2);
            if (z3) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
            }
            return z3;
        }
        if (i4 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Modifier.Node nodeNearestAncestor2 = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m10773constructorimpl(1024));
        FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) (nodeNearestAncestor2 instanceof FocusTargetModifierNode ? nodeNearestAncestor2 : null);
        if (focusTargetModifierNode3 == null && requestFocusForOwner(focusTargetModifierNode)) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
        }
        if (focusTargetModifierNode3 == null || !requestFocusForChild(focusTargetModifierNode3, focusTargetModifierNode)) {
            return false;
        }
        boolean zRequestFocusForChild = requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
        if (focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent) {
            return zRequestFocusForChild;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final boolean requestFocusForOwner(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        Owner owner;
        NodeCoordinator coordinator = focusTargetModifierNode.getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null) {
            throw new IllegalStateException("Owner not initialized.".toString());
        }
        return owner.requestFocus();
    }
}
