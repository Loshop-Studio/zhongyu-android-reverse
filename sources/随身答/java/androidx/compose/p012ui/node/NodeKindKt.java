package androidx.compose.p012ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.p012ui.Actual_jvmKt;
import androidx.compose.p012ui.ComposeUiFlags;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.draw.DrawModifier;
import androidx.compose.p012ui.focus.FocusEventModifier;
import androidx.compose.p012ui.focus.FocusEventModifierNode;
import androidx.compose.p012ui.focus.FocusEventModifierNodeKt;
import androidx.compose.p012ui.focus.FocusOrderModifier;
import androidx.compose.p012ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p012ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.p012ui.focus.FocusTargetNode;
import androidx.compose.p012ui.focus.FocusTargetNodeKt;
import androidx.compose.p012ui.input.key.KeyInputModifierNode;
import androidx.compose.p012ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.p012ui.input.pointer.PointerInputModifier;
import androidx.compose.p012ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p012ui.internal.InlineClassHelperKt;
import androidx.compose.p012ui.layout.ApproachLayoutModifierNode;
import androidx.compose.p012ui.layout.LayoutModifier;
import androidx.compose.p012ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p012ui.layout.OnPlacedModifier;
import androidx.compose.p012ui.layout.OnRemeasuredModifier;
import androidx.compose.p012ui.layout.ParentDataModifier;
import androidx.compose.p012ui.modifier.ModifierLocalConsumer;
import androidx.compose.p012ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p012ui.modifier.ModifierLocalProvider;
import androidx.compose.p012ui.relocation.BringIntoViewModifierNode;
import androidx.compose.p012ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u001a \u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a#\u0010\u001f\u001a\u00020\f*\u00020\u00012\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\rH\u0080\nø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\u0001*\u00020\u00012\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\rH\u0080\fø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a\f\u0010'\u001a\u00020\u0011*\u00020(H\u0002\u001a\f\u0010)\u001a\u00020\f*\u00020(H\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, m13413d2 = {"Inserted", "", "getInserted$annotations", "()V", "Removed", "getRemoved$annotations", "Updated", "getUpdated$annotations", "classToKindSetMap", "Landroidx/collection/MutableObjectIntMap;", "", "includeSelfInTraversal", "", "Landroidx/compose/ui/node/NodeKind;", "getIncludeSelfInTraversal-H91voCI", "(I)Z", "autoInvalidateInsertedNode", "", "node", "Landroidx/compose/ui/Modifier$Node;", "autoInvalidateNodeIncludingDelegates", "remainingSet", TypedValues.CycleType.S_WAVE_PHASE, "autoInvalidateNodeSelf", "selfKindSet", "autoInvalidateRemovedNode", "autoInvalidateUpdatedNode", "calculateNodeKindSetFrom", "element", "Landroidx/compose/ui/Modifier$Element;", "calculateNodeKindSetFromIncludingDelegates", "contains", "value", "contains-64DMado", "(II)Z", "or", "other", "or-64DMado", "(II)I", "scheduleInvalidationOfAssociatedFocusTargets", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "specifiesCanFocusProperty", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,407:1\n61#1:411\n61#1:413\n61#1:415\n61#1:417\n61#1:419\n61#1:421\n61#1:423\n61#1:425\n61#1:427\n61#1:429\n61#1:431\n61#1:439\n61#1:441\n61#1:443\n61#1:445\n61#1:447\n61#1:449\n61#1:451\n61#1:453\n61#1:455\n61#1:457\n61#1:459\n61#1:461\n61#1:463\n61#1:465\n61#1:467\n61#1:469\n61#1:471\n61#1:473\n61#1:475\n64#1:500\n64#1:503\n64#1:505\n64#1:507\n64#1:509\n64#1:511\n64#1:513\n64#1:515\n107#2:408\n79#2:409\n83#2:410\n87#2:412\n91#2:414\n95#2:416\n99#2:418\n127#2:420\n123#2:422\n111#2:424\n103#2:426\n107#2:428\n151#2:430\n79#2:437\n83#2:438\n87#2:440\n91#2:442\n95#2:444\n99#2:446\n103#2:448\n107#2:450\n111#2:452\n115#2:454\n119#2:456\n123#2:458\n127#2:460\n131#2:462\n135#2:464\n139#2:466\n143#2:468\n147#2:470\n151#2:472\n155#2:474\n83#2:499\n83#2:501\n107#2:502\n111#2:504\n87#2:506\n91#2:508\n103#2:510\n123#2:512\n127#2:514\n119#2:516\n688#3,5:432\n693#3,2:476\n56#4,5:478\n56#4,5:483\n56#4,5:488\n56#4,5:523\n240#5,6:493\n240#5,3:556\n243#5,3:576\n240#5,6:593\n283#6,5:517\n148#6:522\n149#6:528\n150#6,3:532\n153#6:536\n154#6,9:538\n437#6,6:547\n447#6,2:554\n449#6,17:559\n466#6,8:579\n163#6,6:587\n1101#7:529\n1083#7,2:530\n519#8:535\n44#8:537\n246#9:553\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n162#1:411\n165#1:413\n168#1:415\n171#1:417\n174#1:419\n178#1:421\n182#1:423\n185#1:425\n188#1:427\n191#1:429\n194#1:431\n209#1:439\n212#1:441\n215#1:443\n218#1:445\n221#1:447\n224#1:449\n227#1:451\n230#1:453\n233#1:455\n236#1:457\n239#1:459\n242#1:461\n245#1:463\n248#1:465\n251#1:467\n254#1:469\n257#1:471\n260#1:473\n263#1:475\n309#1:500\n316#1:503\n323#1:505\n330#1:507\n333#1:509\n336#1:511\n340#1:513\n353#1:515\n71#1:408\n160#1:409\n162#1:410\n165#1:412\n168#1:414\n171#1:416\n174#1:418\n178#1:420\n182#1:422\n185#1:424\n188#1:426\n191#1:428\n194#1:430\n207#1:437\n209#1:438\n212#1:440\n215#1:442\n218#1:444\n221#1:446\n224#1:448\n227#1:450\n230#1:452\n233#1:454\n236#1:456\n239#1:458\n242#1:460\n245#1:462\n248#1:464\n251#1:466\n254#1:468\n257#1:470\n260#1:472\n263#1:474\n309#1:499\n312#1:501\n316#1:502\n323#1:504\n330#1:506\n333#1:508\n336#1:510\n340#1:512\n353#1:514\n359#1:516\n206#1:432,5\n206#1:476,2\n274#1:478,5\n279#1:483,5\n284#1:488,5\n359#1:523,5\n296#1:493,6\n359#1:556,3\n359#1:576,3\n399#1:593,6\n359#1:517,5\n359#1:522\n359#1:528\n359#1:532,3\n359#1:536\n359#1:538,9\n359#1:547,6\n359#1:554,2\n359#1:559,17\n359#1:579,8\n359#1:587,6\n359#1:529\n359#1:530,2\n359#1:535\n359#1:537\n359#1:553\n*E\n"})
/* loaded from: classes2.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final MutableObjectIntMap<Object> classToKindSetMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i9, int i10) {
        if (!(node instanceof DelegatingNode)) {
            autoInvalidateNodeSelf(node, i9 & node.getKindSet(), i10);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet() & i9, i10);
        int i11 = (~delegatingNode.getSelfKindSet()) & i9;
        for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
            autoInvalidateNodeIncludingDelegates(delegate$ui_release, i11, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i9, int i10) {
        if (i10 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m23019constructorimpl(2) & i9) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i10 == 2) {
                    DelegatableNodeKt.m22879requireCoordinator64DMado(node, NodeKind.m23019constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m23019constructorimpl(128) & i9) != 0 && (node instanceof LayoutAwareModifierNode) && i10 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m23019constructorimpl(256) & i9) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i10 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui_release();
            }
            if ((NodeKind.m23019constructorimpl(4) & i9) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m23019constructorimpl(8) & i9) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui_release(true);
            }
            if ((NodeKind.m23019constructorimpl(64) & i9) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m23019constructorimpl(2048) & i9) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (ComposeUiFlags.isTrackFocusEnabled || i10 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i9 & NodeKind.m23019constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        if (node.getKindSet() != 0) {
            return node.getKindSet();
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = classToKindSetMap;
        Object objClassKeyForObject = Actual_jvmKt.classKeyForObject(node);
        int iFindKeyIndex = mutableObjectIntMap.findKeyIndex(objClassKeyForObject);
        if (iFindKeyIndex >= 0) {
            return mutableObjectIntMap.values[iFindKeyIndex];
        }
        int iM23019constructorimpl = NodeKind.m23019constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(256);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(131072);
        }
        if (node instanceof TraversableNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(262144);
        }
        if (node instanceof BringIntoViewModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(524288);
        }
        if (node instanceof OnUnplacedModifierNode) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(1048576);
        }
        mutableObjectIntMap.set(objClassKeyForObject, iM23019constructorimpl);
        return iM23019constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int selfKindSet$ui_release = delegatingNode.getSelfKindSet();
        for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
            selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
        }
        return selfKindSet$ui_release;
    }

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m23027contains64DMado(int i9, int i10) {
        return (i9 & i10) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m23028getIncludeSelfInTraversalH91voCI(int i9) {
        return (i9 & NodeKind.m23019constructorimpl(128)) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m23029or64DMado(int i9, int i10) {
        return i9 | i10;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int iM23019constructorimpl = NodeKind.m23019constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode(), false);
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet() & iM23019constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet() & iM23019constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet() & iM23019constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i9 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM23019constructorimpl) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector2.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        nodePop = nodePop.getChild();
                    }
                }
            }
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int iM23019constructorimpl = NodeKind.m23019constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            iM23019constructorimpl |= NodeKind.m23019constructorimpl(128);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m23019constructorimpl(524288) | iM23019constructorimpl : iM23019constructorimpl;
    }
}
