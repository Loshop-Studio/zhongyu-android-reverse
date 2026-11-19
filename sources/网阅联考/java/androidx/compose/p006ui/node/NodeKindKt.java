package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.DrawModifier;
import androidx.compose.p006ui.focus.FocusEventModifier;
import androidx.compose.p006ui.focus.FocusEventModifierNode;
import androidx.compose.p006ui.focus.FocusOrderModifier;
import androidx.compose.p006ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p006ui.focus.FocusTargetModifierNode;
import androidx.compose.p006ui.input.key.KeyInputModifierNode;
import androidx.compose.p006ui.input.pointer.PointerInputModifier;
import androidx.compose.p006ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p006ui.layout.IntermediateLayoutModifier;
import androidx.compose.p006ui.layout.LayoutModifier;
import androidx.compose.p006ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.p006ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p006ui.layout.OnPlacedModifier;
import androidx.compose.p006ui.layout.OnRemeasuredModifier;
import androidx.compose.p006ui.layout.ParentDataModifier;
import androidx.compose.p006ui.modifier.ModifierLocalConsumer;
import androidx.compose.p006ui.modifier.ModifierLocalNode;
import androidx.compose.p006ui.modifier.ModifierLocalProvider;
import androidx.compose.p006ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a&\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0080\fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\f*\u00020\u001bH\u0003\u001a\f\u0010\u001c\u001a\u00020\u0005*\u00020\u001bH\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"%\u0010\u0004\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00068@X\u0080\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m5175d2 = {"Inserted", "", "Removed", "Updated", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI$annotations", "(I)V", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNode", "phase", "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,283:1\n51#1:287\n51#1:289\n51#1:291\n51#1:293\n51#1:295\n51#1:297\n51#1:299\n51#1:301\n51#1:303\n51#1:305\n51#1:307\n51#1:310\n51#1:312\n51#1:314\n51#1:316\n51#1:318\n51#1:320\n51#1:322\n51#1:324\n51#1:326\n51#1:328\n51#1:330\n51#1:332\n51#1:334\n51#1:336\n81#2:284\n67#2:285\n69#2:286\n85#2:288\n71#2:290\n73#2:292\n75#2:294\n77#2:296\n91#2:298\n89#2:300\n83#2:302\n79#2:304\n81#2:306\n67#2:308\n69#2:309\n71#2:311\n73#2:313\n75#2:315\n77#2:317\n79#2:319\n81#2:321\n83#2:323\n85#2:325\n87#2:327\n89#2:329\n91#2:331\n93#2:333\n95#2:335\n69#2:337\n69#2:339\n83#2:340\n71#2:342\n73#2:344\n79#2:346\n87#2:348\n89#2:350\n91#2:352\n87#2:354\n196#3:338\n196#3:341\n196#3:343\n196#3:345\n196#3:347\n196#3:349\n196#3:351\n196#3:353\n340#4:355\n206#4,2:356\n208#4,7:361\n215#4,15:369\n1182#5:358\n1161#5,2:359\n48#6:368\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n103#1:287\n106#1:289\n109#1:291\n112#1:293\n115#1:295\n121#1:297\n124#1:299\n127#1:301\n130#1:303\n133#1:305\n140#1:307\n149#1:310\n152#1:312\n155#1:314\n158#1:316\n161#1:318\n164#1:320\n167#1:322\n170#1:324\n173#1:326\n176#1:328\n179#1:330\n182#1:332\n185#1:334\n188#1:336\n59#1:284\n101#1:285\n103#1:286\n106#1:288\n109#1:290\n112#1:292\n115#1:294\n121#1:296\n124#1:298\n127#1:300\n130#1:302\n133#1:304\n140#1:306\n147#1:308\n149#1:309\n152#1:311\n155#1:313\n158#1:315\n161#1:317\n164#1:319\n167#1:321\n170#1:323\n173#1:325\n176#1:327\n179#1:329\n182#1:331\n185#1:333\n188#1:335\n209#1:337\n212#1:339\n216#1:340\n219#1:342\n222#1:344\n225#1:346\n228#1:348\n237#1:350\n246#1:352\n253#1:354\n209#1:338\n216#1:341\n219#1:343\n222#1:345\n225#1:347\n228#1:349\n237#1:351\n246#1:353\n253#1:355\n253#1:356,2\n253#1:361,7\n253#1:369,15\n253#1:358\n253#1:359,2\n253#1:368\n*E\n"})
/* loaded from: classes.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNode(Modifier.Node node, int i4) {
        if (!node.getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (((NodeKind.m10773constructorimpl(2) & node.getKindSet()) != 0) && (node instanceof LayoutModifierNode)) {
            LayoutModifierNodeKt.invalidateMeasurements((LayoutModifierNode) node);
            if (i4 == 2) {
                DelegatableNodeKt.m10677requireCoordinator64DMado(node, NodeKind.m10773constructorimpl(2)).onRelease();
            }
        }
        if (((NodeKind.m10773constructorimpl(256) & node.getKindSet()) != 0) && (node instanceof GlobalPositionAwareModifierNode)) {
            DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
        }
        if (((NodeKind.m10773constructorimpl(4) & node.getKindSet()) != 0) && (node instanceof DrawModifierNode)) {
            DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
        }
        if (((NodeKind.m10773constructorimpl(8) & node.getKindSet()) != 0) && (node instanceof SemanticsModifierNode)) {
            SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
        }
        if (((NodeKind.m10773constructorimpl(64) & node.getKindSet()) != 0) && (node instanceof ParentDataModifierNode)) {
            ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
        }
        if (((NodeKind.m10773constructorimpl(1024) & node.getKindSet()) != 0) && (node instanceof FocusTargetModifierNode)) {
            if (i4 == 2) {
                node.onReset();
            } else {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
            }
        }
        if (((NodeKind.m10773constructorimpl(2048) & node.getKindSet()) != 0) && (node instanceof FocusPropertiesModifierNode)) {
            FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
            if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                if (i4 == 2) {
                    scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
                }
            }
        }
        if (((NodeKind.m10773constructorimpl(4096) & node.getKindSet()) != 0) && (node instanceof FocusEventModifierNode) && i4 != 2) {
            DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        autoInvalidateNode(node, 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(2);
        }
        if (element instanceof IntermediateLayoutModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(512);
        }
        if (element instanceof DrawModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier) || (element instanceof LookaheadOnPlacedModifier)) ? iM10773constructorimpl | NodeKind.m10773constructorimpl(128) : iM10773constructorimpl;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m10781getIncludeSelfInTraversalH91voCI(int i4) {
        return (i4 & NodeKind.m10773constructorimpl(128)) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI$annotations, reason: not valid java name */
    public static /* synthetic */ void m10782getIncludeSelfInTraversalH91voCI$annotations(int i4) {
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m10783or64DMado(int i4, int i5) {
        return i4 | i5;
    }

    @ExperimentalComposeUiApi
    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & iM10773constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & iM10773constructorimpl) == 0) {
                        child2 = child2.getChild();
                    } else if (child2 instanceof FocusTargetModifierNode) {
                        DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) child2);
                    }
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.modifyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int iM10773constructorimpl = NodeKind.m10773constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(16);
        }
        if (node instanceof ModifierLocalNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(512);
        }
        if (node instanceof FocusTargetModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM10773constructorimpl |= NodeKind.m10773constructorimpl(8192);
        }
        return node instanceof RotaryInputModifierNode ? iM10773constructorimpl | NodeKind.m10773constructorimpl(16384) : iM10773constructorimpl;
    }
}
