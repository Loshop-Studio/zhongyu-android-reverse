package androidx.compose.p011ui.semantics;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.SemanticsModifierNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a*\u0010\f\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010\"\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0015*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "mergingEnabled", "Landroidx/compose/ui/semantics/SemanticsNode;", "SemanticsNode", "(Landroidx/compose/ui/node/LayoutNode;Z)Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "outerSemanticsNode", "(Landroidx/compose/ui/node/SemanticsModifierNode;ZLandroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Function1;", "selector", "findClosestParentNode", "(Landroidx/compose/ui/node/LayoutNode;Lr6/c;)Landroidx/compose/ui/node/LayoutNode;", "", "contentDescriptionFakeNodeId", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "roleFakeNodeId", "getOuterMergingSemantics", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/node/SemanticsModifierNode;", "outerMergingSemantics", "Landroidx/compose/ui/semantics/Role;", "getRole", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/semantics/Role;", "role", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,502:1\n91#2:503\n91#2:568\n727#3:504\n662#3,6:505\n683#3,3:511\n668#3,2:514\n728#3:521\n671#3,2:560\n686#3,3:562\n673#3:565\n663#3:566\n730#3:567\n657#3,11:569\n683#3,3:580\n668#3,2:583\n671#3,2:628\n686#3,3:630\n673#3:633\n663#3:634\n658#3:635\n437#4,5:516\n442#4:522\n447#4,2:524\n449#4,8:529\n457#4,9:540\n466#4,8:552\n437#4,6:585\n447#4,2:592\n449#4,8:597\n457#4,9:608\n466#4,8:620\n246#5:523\n246#5:591\n240#6,3:526\n243#6,3:549\n240#6,3:594\n243#6,3:617\n1101#7:537\n1083#7,2:538\n1101#7:605\n1083#7,2:606\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNodeKt\n*L\n45#1:503\n475#1:568\n45#1:504\n45#1:505,6\n45#1:511,3\n45#1:514,2\n45#1:521\n45#1:560,2\n45#1:562,3\n45#1:565\n45#1:566\n45#1:567\n475#1:569,11\n475#1:580,3\n475#1:583,2\n475#1:628,2\n475#1:630,3\n475#1:633\n475#1:634\n475#1:635\n45#1:516,5\n45#1:522\n45#1:524,2\n45#1:529,8\n45#1:540,9\n45#1:552,8\n475#1:585,6\n475#1:592,2\n475#1:597,8\n475#1:608,9\n475#1:620,8\n45#1:523\n475#1:591\n45#1:526,3\n45#1:549,3\n475#1:594,3\n475#1:617,3\n45#1:537\n45#1:538,2\n475#1:605\n475#1:606,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsNodeKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[EDGE_INSN: B:44:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p011ui.semantics.SemanticsNode SemanticsNode(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.node.LayoutNode r10, boolean r11) {
        /*
            androidx.compose.ui.node.NodeChain r0 = r10.getNodes()
            r1 = 8
            int r1 = androidx.compose.p011ui.node.NodeKind.m12314constructorimpl(r1)
            int r2 = androidx.compose.p011ui.node.NodeChain.access$getAggregateChildKindSet(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            androidx.compose.ui.Modifier$Node r0 = r0.getHead()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.getKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof androidx.compose.p011ui.node.SemanticsModifierNode
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.getKindSet()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof androidx.compose.p011ui.node.DelegatingNode
            if (r5 == 0) goto L69
            r5 = r2
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.p011ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.getDelegate()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.getKindSet()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            androidx.compose.runtime.collection.MutableVector r4 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.add(r2)
            r2 = r3
        L5e:
            r4.add(r5)
        L61:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            androidx.compose.ui.Modifier$Node r2 = androidx.compose.p011ui.node.DelegatableNodeKt.access$pop(r4)
            goto L21
        L6e:
            int r2 = r0.getAggregateChildKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            androidx.compose.ui.Modifier$Node r0 = r0.getChild()
            goto L16
        L7a:
            kotlin.jvm.internal.AbstractC5830k.m5327d(r3)
            androidx.compose.ui.node.SemanticsModifierNode r3 = (androidx.compose.p011ui.node.SemanticsModifierNode) r3
            androidx.compose.ui.Modifier$Node r0 = r3.getNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r10.getSemanticsConfiguration()
            if (r1 != 0) goto L8e
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
        L8e:
            androidx.compose.ui.semantics.SemanticsNode r2 = new androidx.compose.ui.semantics.SemanticsNode
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.semantics.SemanticsNodeKt.SemanticsNode(androidx.compose.ui.node.LayoutNode, boolean):androidx.compose.ui.semantics.SemanticsNode");
    }

    public static /* synthetic */ SemanticsNode SemanticsNode$default(SemanticsModifierNode semanticsModifierNode, boolean z8, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutNode = DelegatableNodeKt.requireLayoutNode(semanticsModifierNode);
        }
        return SemanticsNode(semanticsModifierNode, z8, layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int contentDescriptionFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 2000000000;
    }

    @Nullable
    public static final LayoutNode findClosestParentNode(@NotNull LayoutNode layoutNode, @NotNull InterfaceC6471c interfaceC6471c) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) interfaceC6471c.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p011ui.node.SemanticsModifierNode getOuterMergingSemantics(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.node.LayoutNode r9) {
        /*
            androidx.compose.ui.node.NodeChain r9 = r9.getNodes()
            r0 = 8
            int r0 = androidx.compose.p011ui.node.NodeKind.m12314constructorimpl(r0)
            int r1 = androidx.compose.p011ui.node.NodeChain.access$getAggregateChildKindSet(r9)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L83
            androidx.compose.ui.Modifier$Node r9 = r9.getHead()
        L16:
            if (r9 == 0) goto L83
            int r1 = r9.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r1 = r9
            r3 = r2
        L21:
            if (r1 == 0) goto L77
            boolean r4 = r1 instanceof androidx.compose.p011ui.node.SemanticsModifierNode
            if (r4 == 0) goto L32
            r4 = r1
            androidx.compose.ui.node.SemanticsModifierNode r4 = (androidx.compose.p011ui.node.SemanticsModifierNode) r4
            boolean r4 = r4.getShouldMergeDescendantSemantics()
            if (r4 == 0) goto L72
            r2 = r1
            goto L83
        L32:
            int r4 = r1.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L72
            boolean r4 = r1 instanceof androidx.compose.p011ui.node.DelegatingNode
            if (r4 == 0) goto L72
            r4 = r1
            androidx.compose.ui.node.DelegatingNode r4 = (androidx.compose.p011ui.node.DelegatingNode) r4
            androidx.compose.ui.Modifier$Node r4 = r4.getDelegate()
            r5 = 0
            r6 = r5
        L46:
            r7 = 1
            if (r4 == 0) goto L6f
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L6a
            int r6 = r6 + 1
            if (r6 != r7) goto L56
            r1 = r4
            goto L6a
        L56:
            if (r3 != 0) goto L61
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            r7 = 16
            androidx.compose.ui.Modifier$Node[] r7 = new androidx.compose.ui.Modifier.Node[r7]
            r3.<init>(r7, r5)
        L61:
            if (r1 == 0) goto L67
            r3.add(r1)
            r1 = r2
        L67:
            r3.add(r4)
        L6a:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild()
            goto L46
        L6f:
            if (r6 != r7) goto L72
            goto L21
        L72:
            androidx.compose.ui.Modifier$Node r1 = androidx.compose.p011ui.node.DelegatableNodeKt.access$pop(r3)
            goto L21
        L77:
            int r1 = r9.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto L83
            androidx.compose.ui.Modifier$Node r9 = r9.getChild()
            goto L16
        L83:
            androidx.compose.ui.node.SemanticsModifierNode r2 = (androidx.compose.p011ui.node.SemanticsModifierNode) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.semantics.SemanticsNodeKt.getOuterMergingSemantics(androidx.compose.ui.node.LayoutNode):androidx.compose.ui.node.SemanticsModifierNode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Role getRole(SemanticsNode semanticsNode) {
        return (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int roleFakeNodeId(SemanticsNode semanticsNode) {
        return semanticsNode.getId() + 1000000000;
    }

    @NotNull
    public static final SemanticsNode SemanticsNode(@NotNull SemanticsModifierNode semanticsModifierNode, boolean z8, @NotNull LayoutNode layoutNode) {
        Modifier.Node node = semanticsModifierNode.getNode();
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new SemanticsConfiguration();
        }
        return new SemanticsNode(node, z8, layoutNode, semanticsConfiguration);
    }
}
