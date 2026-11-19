package androidx.compose.p009ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.p009ui.ComposeUiFlags;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.internal.InlineClassHelperKt;
import androidx.compose.p009ui.node.DelegatableNodeKt;
import androidx.compose.p009ui.node.DelegatingNode;
import androidx.compose.p009ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0002J%\u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\r2\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010!J%\u0010\"\u001a\u00020\u0005\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u0002H 0\u00102\u0006\u0010\u001d\u001a\u0002H H\u0002¢\u0006\u0002\u0010#R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m7880d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "onRequestApplyChangesListener", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "invalidateOwnerFocusState", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusState;", "activeFocusTargetNodeFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "focusEventNodes", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "focusEventNodesLegacy", "", "focusPropertiesNodesLegacy", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "focusTargetNodes", "focusTargetNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "isInvalidationScheduled", "", "hasPendingInvalidation", "invalidateNodes", "invalidateNodesLegacy", "invalidateNodesOptimized", "scheduleInvalidation", "node", "scheduleInvalidationForOwner", "setUpOnRequestApplyChangesListener", ExifInterface.GPS_DIRECTION_TRUE, "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "scheduleInvalidationLegacy", "(Ljava/util/List;Ljava/lang/Object;)V", "ui_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 12 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n231#2,3:276\n200#2,7:279\n211#2,3:287\n214#2,9:291\n234#2:300\n231#2,3:334\n200#2,7:337\n211#2,3:345\n214#2,9:349\n234#2:358\n1399#3:286\n1270#3:290\n1399#3:344\n1270#3:348\n119#4,9:301\n119#4:325\n119#4:375\n119#4:497\n55#5:310\n90#6:311\n91#6,8:317\n100#6,7:327\n289#6,6:376\n437#6,6:382\n447#6,2:389\n449#6,8:394\n457#6,9:405\n466#6,8:417\n295#6:425\n148#6:426\n149#6,4:432\n153#6:437\n154#6,9:439\n437#6,37:448\n163#6,6:485\n296#6:491\n289#6,6:498\n437#6,6:504\n447#6,2:511\n449#6,8:516\n457#6,9:527\n466#6,8:539\n295#6:547\n148#6:548\n149#6,4:554\n153#6:559\n154#6,9:561\n437#6,37:570\n163#6,6:607\n296#6:613\n56#7,5:312\n56#7,5:427\n56#7,5:549\n56#7,5:621\n56#7,5:626\n56#7,5:631\n246#8:326\n246#8:388\n246#8:510\n34#9,6:359\n34#9,6:365\n34#9,4:371\n39#9:492\n34#9,4:493\n39#9:614\n34#9,6:615\n240#10,3:391\n243#10,3:414\n240#10,3:513\n243#10,3:536\n1101#11:402\n1083#11,2:403\n1101#11:524\n1083#11,2:525\n519#12:436\n44#12:438\n519#12:558\n44#12:560\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n124#1:276,3\n124#1:279,7\n124#1:287,3\n124#1:291,9\n124#1:300\n161#1:334,3\n161#1:337,7\n161#1:345,3\n161#1:349,9\n161#1:358\n124#1:286\n124#1:290\n161#1:344\n161#1:348\n133#1:301,9\n139#1:325\n193#1:375\n214#1:497\n133#1:310\n132#1:311\n132#1:317,8\n132#1:327,7\n193#1:376,6\n193#1:382,6\n193#1:389,2\n193#1:394,8\n193#1:405,9\n193#1:417,8\n193#1:425\n193#1:426\n193#1:432,4\n193#1:437\n193#1:439,9\n193#1:448,37\n193#1:485,6\n193#1:491\n214#1:498,6\n214#1:504,6\n214#1:511,2\n214#1:516,8\n214#1:527,9\n214#1:539,8\n214#1:547\n214#1:548\n214#1:554,4\n214#1:559\n214#1:561,9\n214#1:570,37\n214#1:607,6\n214#1:613\n132#1:312,5\n193#1:427,5\n214#1:549,5\n268#1:621,5\n271#1:626,5\n272#1:631,5\n139#1:326\n193#1:388\n214#1:510\n173#1:359,6\n174#1:365,6\n188#1:371,4\n188#1:492\n200#1:493,4\n200#1:614\n248#1:615,6\n193#1:391,3\n193#1:414,3\n214#1:513,3\n214#1:536,3\n193#1:402\n193#1:403,2\n214#1:524\n214#1:525,2\n193#1:436\n193#1:438\n214#1:558\n214#1:560\n*E\n"})
/* loaded from: classes2.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final Function0<FocusTargetNode> activeFocusTargetNodeFetcher;
    private final Function0<Unit> invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;
    private final Function0<FocusState> rootFocusStateFetcher;
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();
    private final List<FocusEventModifierNode> focusEventNodesLegacy = new ArrayList();
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy = new ArrayList();
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidationLegacy$1 */
    public /* synthetic */ class C19611 extends FunctionReferenceImpl implements Function0<Unit> {
        public C19611(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$setUpOnRequestApplyChangesListener$1 */
    public /* synthetic */ class C19621 extends FunctionReferenceImpl implements Function0<Unit> {
        public C19621(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0, Function0<? extends FocusState> function02, Function0<FocusTargetNode> function03) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
        this.rootFocusStateFetcher = function02;
        this.activeFocusTargetNodeFetcher = function03;
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
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    private final void invalidateNodesLegacy() {
        int i6;
        int i7;
        int i8;
        boolean z6;
        int i9;
        FocusState focusState;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = 0;
        if (!this.rootFocusStateFetcher.invoke().getHasFocus()) {
            List<FocusEventModifierNode> list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).onFocusEvent(FocusStateImpl.Inactive);
            }
            List<FocusTargetNode> list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                FocusTargetNode focusTargetNode = list2.get(i11);
                if (focusTargetNode.getIsAttached() && !focusTargetNode.isInitialized$ui_release()) {
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
        int i12 = 0;
        while (true) {
            i6 = 1024;
            i7 = 16;
            i8 = 1;
            if (i12 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = list3.get(i12);
            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                int iM15509constructorimpl = NodeKind.m15509constructorimpl(1024);
                Modifier.Node node = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet() & iM15509constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        int i13 = 0;
                        for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & iM15509constructorimpl) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    node = delegate;
                                } else {
                                    if (mutableVector == null) {
                                        mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node != null) {
                                        mutableVector.add(node);
                                        node = null;
                                    }
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        if (i13 == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
                if (!focusPropertiesModifierNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child = focusPropertiesModifierNode.getNode().getChild();
                if (child == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusPropertiesModifierNode.getNode(), false);
                } else {
                    mutableVector2.add(child);
                }
                while (mutableVector2.getSize() != 0) {
                    Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((nodePop.getAggregateChildKindSet() & iM15509constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
                    } else {
                        while (true) {
                            if (nodePop == null) {
                                break;
                            }
                            if ((nodePop.getKindSet() & iM15509constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) nodePop);
                                    } else if ((nodePop.getKindSet() & iM15509constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i14 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iM15509constructorimpl) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    nodePop = delegate2;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop != null) {
                                                        mutableVector3.add(nodePop);
                                                        nodePop = null;
                                                    }
                                                    mutableVector3.add(delegate2);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    nodePop = DelegatableNodeKt.pop(mutableVector3);
                                }
                            } else {
                                nodePop = nodePop.getChild();
                            }
                        }
                    }
                }
            }
            i12++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i15 = 0;
        while (i15 < size4) {
            FocusEventModifierNode focusEventModifierNode = list4.get(i15);
            if (focusEventModifierNode.getNode().getIsAttached()) {
                int iM15509constructorimpl2 = NodeKind.m15509constructorimpl(i6);
                Modifier.Node node2 = focusEventModifierNode.getNode();
                int i16 = z10;
                int i17 = i8;
                FocusTargetNode focusTargetNode2 = null;
                MutableVector mutableVector4 = null;
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                        if (focusTargetNode2 != null) {
                            i16 = i8;
                        }
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            i17 = z10;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node2.getKindSet() & iM15509constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate();
                        int i18 = z10;
                        while (delegate3 != null) {
                            if ((delegate3.getKindSet() & iM15509constructorimpl2) != 0) {
                                i18++;
                                if (i18 == i8) {
                                    node2 = delegate3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[i7], z10);
                                    }
                                    if (node2 != null) {
                                        mutableVector4.add(node2);
                                        node2 = null;
                                    }
                                    mutableVector4.add(delegate3);
                                }
                            }
                            delegate3 = delegate3.getChild();
                            i8 = 1;
                        }
                        int i19 = i8;
                        if (i18 == i19) {
                            i8 = i19;
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector4);
                    i8 = 1;
                }
                if (!focusEventModifierNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i7], z10);
                Modifier.Node child2 = focusEventModifierNode.getNode().getChild();
                if (child2 == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusEventModifierNode.getNode(), z10);
                } else {
                    mutableVector5.add(child2);
                }
                while (mutableVector5.getSize() != 0) {
                    Modifier.Node nodePop2 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                    z10 = z10;
                    if ((nodePop2.getAggregateChildKindSet() & iM15509constructorimpl2) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, nodePop2, z10);
                    } else {
                        while (nodePop2 != null) {
                            if ((nodePop2.getKindSet() & iM15509constructorimpl2) != 0) {
                                MutableVector mutableVector6 = null;
                                z10 = z10;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) nodePop2;
                                        if (focusTargetNode2 != null) {
                                            i16 = 1;
                                        }
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            i17 = z10 == true ? 1 : 0;
                                        }
                                        z7 = z10 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                    } else if ((nodePop2.getKindSet() & iM15509constructorimpl2) == 0 || !(nodePop2 instanceof DelegatingNode)) {
                                        z7 = z10 == true ? 1 : 0;
                                    } else {
                                        Modifier.Node delegate4 = ((DelegatingNode) nodePop2).getDelegate();
                                        int i20 = z10 == true ? 1 : 0;
                                        boolean z11 = z10;
                                        while (delegate4 != null) {
                                            if ((delegate4.getKindSet() & iM15509constructorimpl2) != 0) {
                                                i20++;
                                                if (i20 == 1) {
                                                    nodePop2 = delegate4;
                                                    z9 = false;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        Modifier.Node[] nodeArr = new Modifier.Node[i7];
                                                        z9 = false;
                                                        mutableVector6 = new MutableVector(nodeArr, 0);
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector6.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector6.add(delegate4);
                                                }
                                            } else {
                                                z9 = z11;
                                            }
                                            delegate4 = delegate4.getChild();
                                            z11 = z9;
                                            i7 = 16;
                                        }
                                        z8 = z11;
                                        z8 = z8;
                                        if (i20 != 1) {
                                            nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                        }
                                        z10 = z8;
                                        i7 = 16;
                                    }
                                    z8 = z7;
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                    z10 = z8;
                                    i7 = 16;
                                }
                                boolean z12 = z10 == true ? 1 : 0;
                                i7 = 16;
                            } else {
                                boolean z13 = z10 == true ? 1 : 0;
                                nodePop2 = nodePop2.getChild();
                                z10 = z13 ? 1 : 0;
                                i7 = 16;
                            }
                        }
                    }
                    z10 = z10 ? 1 : 0;
                    i7 = 16;
                }
                z6 = z10 == true ? 1 : 0;
                i9 = 1;
                if (i17 != 0) {
                    if (i16 != 0) {
                        focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                    } else if (focusTargetNode2 == null || (focusState = focusTargetNode2.getFocusState()) == null) {
                        focusState = FocusStateImpl.Inactive;
                    }
                    focusEventModifierNode.onFocusEvent(focusState);
                }
            } else {
                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                z6 = z10;
                i9 = i8;
            }
            i15++;
            i8 = i9;
            z10 = z6;
            i6 = 1024;
            i7 = 16;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
        int size5 = list5.size();
        for (int i21 = z10; i21 < size5; i21++) {
            FocusTargetNode focusTargetNode5 = list5.get(i21);
            if (focusTargetNode5.getIsAttached()) {
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

    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void invalidateNodesOptimized() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p009ui.focus.FocusInvalidationManager.invalidateNodesOptimized():void");
    }

    private final <T> void scheduleInvalidationLegacy(List<T> list, T t6) {
        if (list.add(t6) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new C19611(this));
        }
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new C19621(this));
        this.isInvalidationScheduled = true;
    }

    public final boolean hasPendingInvalidation() {
        return ComposeUiFlags.isTrackFocusEnabled ? this.isInvalidationScheduled : (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusTargetNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusTargetNodesLegacy, node);
        }
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusEventNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusEventNodesLegacy, node);
        }
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, node);
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t6) {
        if (mutableScatterSet.add(t6)) {
            setUpOnRequestApplyChangesListener();
        }
    }
}
