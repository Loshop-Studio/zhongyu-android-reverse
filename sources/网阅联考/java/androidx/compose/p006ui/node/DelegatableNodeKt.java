package androidx.compose.p006ui.node;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a8\u0010\u0005\u001a\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0006\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a6\u0010\u000f\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a%\u0010\u0013\u001a\u00020\u0014*\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\bH\u0007\u001a2\u0010\u0018\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0012\u001a\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a2\u0010\u001a\u001a\u0004\u0018\u0001H\u0007\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0012\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a6\u0010\u001c\u001a\u0004\u0018\u0001H\u0007\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0081\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0012\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0003*\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a%\u0010\u001e\u001a\u00020\u001f*\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001a\f\u0010#\u001a\u00020$*\u00020\bH\u0001\u001a\f\u0010%\u001a\u00020&*\u00020\bH\u0001\u001aG\u0010'\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+\u001a,\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u0010,\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010+\u001a,\u0010,\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u0010.\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u0010+\u001a,\u0010.\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u00100\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b1\u0010+\u001a,\u00100\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u00102\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u0010+\u001a,\u00102\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010)H\u0081\bø\u0001\u0002\u001aG\u00104\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00140)H\u0081\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u0010+\u001a,\u00104\u001a\u00020\u0001*\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140)H\u0081\bø\u0001\u0002\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u00066"}, m5175d2 = {"addLayoutNodeChildren", "", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/Modifier$Node;", "node", "ancestors", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/DelegatableNode;", "type", "Landroidx/compose/ui/node/NodeKind;", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "mask", "", "firstChild", "", "firstChild-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "has", "", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "invalidateSubtree", "localChild", "localChild-64DMado", "localParent", "localParent-64DMado", "nearestAncestor", "nearestAncestor-64DMado", "requireCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "kind", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireLayoutNode", "Landroidx/compose/ui/node/LayoutNode;", "requireOwner", "Landroidx/compose/ui/node/Owner;", "visitAncestors", "block", "Lkotlin/Function1;", "visitAncestors-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitChildren", "visitChildren-6rFNWt0", "visitLocalChildren", "visitLocalChildren-6rFNWt0", "visitLocalParents", "visitLocalParents-6rFNWt0", "visitSubtree", "visitSubtree-6rFNWt0", "visitSubtreeIf", "visitSubtreeIf-6rFNWt0", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,381:1\n262#1,11:404\n276#1,9:415\n78#1,17:424\n171#1,25:441\n206#1,2:466\n208#1,7:471\n215#1,15:479\n237#1,2:494\n239#1,20:499\n1182#2:382\n1161#2,2:383\n1182#2:397\n1161#2,2:398\n1182#2:401\n1161#2,2:402\n1182#2:468\n1161#2,2:469\n1182#2:496\n1161#2,2:497\n48#3:385\n492#3,11:386\n48#3:400\n48#3:478\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n290#1:404,11\n298#1:415,9\n314#1:424,17\n334#1:441,25\n340#1:466,2\n340#1:471,7\n340#1:479,15\n346#1:494,2\n346#1:499,20\n143#1:382\n143#1:383,2\n207#1:397\n207#1:398,2\n238#1:401\n238#1:402,2\n340#1:468\n340#1:469,2\n346#1:496\n346#1:497,2\n150#1:385\n199#1:386,11\n214#1:400\n340#1:478\n*E\n"})
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i4 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i4].getNodes().getHead());
                i4--;
            } while (i4 >= 0);
        }
    }

    @ExperimentalComposeUiApi
    public static final List<Modifier.Node> ancestors(DelegatableNode delegatableNode, int i4) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return arrayList;
    }

    @ExperimentalComposeUiApi
    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m10671ancestors64DMado(DelegatableNode ancestors, int i4) {
        Intrinsics.checkNotNullParameter(ancestors, "$this$ancestors");
        List<T> list = (List<T>) ancestors(ancestors, i4);
        if (list instanceof List) {
            return list;
        }
        return null;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node firstChild(DelegatableNode delegatableNode, int i4) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i4) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i4) != 0) {
                        return child2;
                    }
                    child2 = child2.getChild();
                }
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: firstChild-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m10672firstChild64DMado(DelegatableNode firstChild, int i4) {
        Intrinsics.checkNotNullParameter(firstChild, "$this$firstChild");
        T t3 = (T) firstChild(firstChild, i4);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t3;
    }

    @ExperimentalComposeUiApi
    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m10673has64DMado(DelegatableNode has, int i4) {
        Intrinsics.checkNotNullParameter(has, "$this$has");
        return (has.getNode().getAggregateChildKindSet() & i4) != 0;
    }

    @ExperimentalComposeUiApi
    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node localChild(DelegatableNode delegatableNode, int i4) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & i4) == 0) {
            return null;
        }
        while (child != null) {
            if ((child.getKindSet() & i4) != 0) {
                return child;
            }
            child = child.getChild();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: localChild-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m10674localChild64DMado(DelegatableNode localChild, int i4) {
        Intrinsics.checkNotNullParameter(localChild, "$this$localChild");
        T t3 = (T) localChild(localChild, i4);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t3;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node localParent(DelegatableNode delegatableNode, int i4) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i4) != 0) {
                return parent;
            }
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: localParent-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m10675localParent64DMado(DelegatableNode localParent, int i4) {
        Intrinsics.checkNotNullParameter(localParent, "$this$localParent");
        T t3 = (T) localParent(localParent, i4);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t3;
    }

    @ExperimentalComposeUiApi
    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i4) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    @ExperimentalComposeUiApi
    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m10676nearestAncestor64DMado(DelegatableNode nearestAncestor, int i4) {
        Intrinsics.checkNotNullParameter(nearestAncestor, "$this$nearestAncestor");
        T t3 = (T) nearestAncestor(nearestAncestor, i4);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        return t3;
    }

    @ExperimentalComposeUiApi
    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m10677requireCoordinator64DMado(DelegatableNode requireCoordinator, int i4) {
        Intrinsics.checkNotNullParameter(requireCoordinator, "$this$requireCoordinator");
        NodeCoordinator coordinator = requireCoordinator.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != requireCoordinator || !NodeKindKt.m10781getIncludeSelfInTraversalH91voCI(i4)) {
            return coordinator;
        }
        NodeCoordinator wrapped = coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    @ExperimentalComposeUiApi
    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @ExperimentalComposeUiApi
    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @ExperimentalComposeUiApi
    public static final void visitAncestors(DelegatableNode delegatableNode, int i4, Function1<? super Modifier.Node, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        block.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m10678visitAncestors6rFNWt0(DelegatableNode visitAncestors, int i4, Function1<? super T, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(visitAncestors, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node parent = visitAncestors.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitAncestors);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i4) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i4) != 0) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        block.invoke(parent);
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitChildren(DelegatableNode delegatableNode, int i4, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i4) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & i4) != 0) {
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m10679visitChildren6rFNWt0(DelegatableNode visitChildren, int i4, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitChildren, "$this$visitChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitChildren.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, visitChildren.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child2.getAggregateChildKindSet() & i4) == 0) {
                addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (true) {
                    if (child2 == null) {
                        break;
                    }
                    if ((child2.getKindSet() & i4) != 0) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalChildren(DelegatableNode delegatableNode, int i4, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i4) == 0) {
            return;
        }
        for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i4) != 0) {
                block.invoke(child);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitLocalChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m10680visitLocalChildren6rFNWt0(DelegatableNode visitLocalChildren, int i4, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalChildren, "$this$visitLocalChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitLocalChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node node = visitLocalChildren.getNode();
        if ((node.getAggregateChildKindSet() & i4) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i4) != 0) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    block.invoke(child);
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitLocalParents(DelegatableNode delegatableNode, int i4, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i4) != 0) {
                block.invoke(parent);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitLocalParents-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m10681visitLocalParents6rFNWt0(DelegatableNode visitLocalParents, int i4, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalParents, "$this$visitLocalParents");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitLocalParents.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        for (Modifier.Node parent = visitLocalParents.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i4) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                block.invoke(parent);
            }
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtree(DelegatableNode delegatableNode, int i4, Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node child = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i4) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i4) != 0) {
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m10682visitSubtree6rFNWt0(DelegatableNode visitSubtree, int i4, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitSubtree, "$this$visitSubtree");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitSubtree.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Modifier.Node child = visitSubtree.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitSubtree);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i4) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i4) != 0) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
                child = null;
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    @ExperimentalComposeUiApi
    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i4, Function1<? super Modifier.Node, Boolean> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i4) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i4) == 0 || block.invoke(child2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m10683visitSubtreeIf6rFNWt0(DelegatableNode visitSubtreeIf, int i4, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(visitSubtreeIf, "$this$visitSubtreeIf");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitSubtreeIf.getNode().getIsAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitSubtreeIf.getNode().getChild();
        if (child == null) {
            addLayoutNodeChildren(mutableVector, visitSubtreeIf.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet() & i4) != 0) {
                for (Modifier.Node child2 = node; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & i4) != 0) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (block.invoke(child2).booleanValue()) {
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node);
        }
    }
}
