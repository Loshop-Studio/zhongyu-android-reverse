package androidx.compose.p006ui.focus;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.node.DelegatableNodeKt;
import androidx.compose.p006ui.node.LayoutNode;
import androidx.compose.p006ui.node.NodeChain;
import androidx.compose.p006ui.node.NodeKind;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0001¨\u0006\u0006"}, m5175d2 = {"getFocusState", "Landroidx/compose/ui/focus/FocusState;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "refreshFocusEventNodes", "", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusEventModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,75:1\n87#2:76\n91#2:106\n87#2:107\n87#2:118\n340#3:77\n206#3,2:78\n208#3,7:83\n215#3,15:91\n78#3,9:109\n88#3,7:120\n1182#4:80\n1161#4,2:81\n48#5:90\n47#6:108\n196#7:119\n*S KotlinDebug\n*F\n+ 1 FocusEventModifierNode.kt\nandroidx/compose/ui/focus/FocusEventModifierNodeKt\n*L\n45#1:76\n65#1:106\n65#1:107\n68#1:118\n45#1:77\n45#1:78,2\n45#1:83,7\n45#1:91,15\n65#1:109,9\n65#1:120,7\n45#1:80\n45#1:81,2\n45#1:90\n65#1:108\n68#1:119\n*E\n"})
/* loaded from: classes.dex */
public final class FocusEventModifierNodeKt {

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
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0034, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p006ui.focus.FocusState getFocusState(androidx.compose.p006ui.focus.FocusEventModifierNode r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p006ui.node.NodeKind.m10773constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r5.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 == 0) goto L7e
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r5.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild()
            if (r2 != 0) goto L31
            androidx.compose.ui.Modifier$Node r5 = r5.getNode()
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L31:
            r1.add(r2)
        L34:
            boolean r5 = r1.isNotEmpty()
            if (r5 == 0) goto L7b
            int r5 = r1.getSize()
            r2 = 1
            int r5 = r5 - r2
            java.lang.Object r5 = r1.removeAt(r5)
            androidx.compose.ui.Modifier$Node r5 = (androidx.compose.ui.Modifier.Node) r5
            int r3 = r5.getAggregateChildKindSet()
            r3 = r3 & r0
            if (r3 != 0) goto L51
            androidx.compose.p006ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r5)
            goto L34
        L51:
            if (r5 == 0) goto L34
            int r3 = r5.getKindSet()
            r3 = r3 & r0
            if (r3 == 0) goto L76
            boolean r3 = r5 instanceof androidx.compose.p006ui.focus.FocusTargetModifierNode
            if (r3 == 0) goto L34
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p006ui.focus.FocusTargetModifierNode) r5
            androidx.compose.ui.focus.FocusStateImpl r5 = r5.getFocusStateImpl()
            int[] r3 = androidx.compose.ui.focus.FocusEventModifierNodeKt.WhenMappings.$EnumSwitchMapping$0
            int r4 = r5.ordinal()
            r3 = r3[r4]
            if (r3 == r2) goto L75
            r2 = 2
            if (r3 == r2) goto L75
            r2 = 3
            if (r3 == r2) goto L75
            goto L34
        L75:
            return r5
        L76:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L51
        L7b:
            androidx.compose.ui.focus.FocusStateImpl r5 = androidx.compose.p006ui.focus.FocusStateImpl.Inactive
            return r5
        L7e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.focus.FocusEventModifierNodeKt.getFocusState(androidx.compose.ui.focus.FocusEventModifierNode):androidx.compose.ui.focus.FocusState");
    }

    @ExperimentalComposeUiApi
    public static final void refreshFocusEventNodes(FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(focusTargetModifierNode, "<this>");
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(4096) | NodeKind.m10773constructorimpl(1024);
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = focusTargetModifierNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM10773constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM10773constructorimpl) != 0) {
                        if ((NodeKind.m10773constructorimpl(1024) & parent.getKindSet()) != 0) {
                            return;
                        }
                        if (!(parent instanceof FocusEventModifierNode)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        FocusEventModifierNode focusEventModifierNode = (FocusEventModifierNode) parent;
                        focusEventModifierNode.onFocusEvent(getFocusState(focusEventModifierNode));
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }
}
