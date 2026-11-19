package androidx.compose.p011ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u001aJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001b¢\u0006\u0004\b\u0010\u0010\u001cJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001d¢\u0006\u0004\b\u0010\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0013J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u0010-\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ld6/s;", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "Landroidx/compose/ui/focus/FocusState;", "rootFocusStateFetcher", "Landroidx/compose/ui/focus/FocusTargetNode;", "activeFocusTargetNodeFetcher", "<init>", "(Lr6/c;Lr6/a;Lr6/a;Lr6/a;)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/collection/MutableScatterSet;", "node", "scheduleInvalidation", "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V", "setUpOnRequestApplyChangesListener", "()V", "", "scheduleInvalidationLegacy", "(Ljava/util/List;Ljava/lang/Object;)V", "invalidateNodes", "invalidateNodesOptimized", "invalidateNodesLegacy", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "scheduleInvalidationForOwner", "", "hasPendingInvalidation", "()Z", "Lr6/c;", "Lr6/a;", "focusTargetNodes", "Landroidx/collection/MutableScatterSet;", "focusEventNodes", "focusTargetNodesLegacy", "Ljava/util/List;", "focusEventNodesLegacy", "focusPropertiesNodesLegacy", "focusTargetsWithInvalidatedFocusEventsLegacy", "isInvalidationScheduled", "Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 12 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n231#2,3:276\n200#2,7:279\n211#2,3:287\n214#2,9:291\n234#2:300\n231#2,3:334\n200#2,7:337\n211#2,3:345\n214#2,9:349\n234#2:358\n1399#3:286\n1270#3:290\n1399#3:344\n1270#3:348\n119#4,9:301\n119#4:325\n119#4:375\n119#4:497\n55#5:310\n90#6:311\n91#6,8:317\n100#6,7:327\n289#6,6:376\n437#6,6:382\n447#6,2:389\n449#6,8:394\n457#6,9:405\n466#6,8:417\n295#6:425\n148#6:426\n149#6,4:432\n153#6:437\n154#6,9:439\n437#6,37:448\n163#6,6:485\n296#6:491\n289#6,6:498\n437#6,6:504\n447#6,2:511\n449#6,8:516\n457#6,9:527\n466#6,8:539\n295#6:547\n148#6:548\n149#6,4:554\n153#6:559\n154#6,9:561\n437#6,37:570\n163#6,6:607\n296#6:613\n56#7,5:312\n56#7,5:427\n56#7,5:549\n56#7,5:621\n56#7,5:626\n56#7,5:631\n246#8:326\n246#8:388\n246#8:510\n34#9,6:359\n34#9,6:365\n34#9,4:371\n39#9:492\n34#9,4:493\n39#9:614\n34#9,6:615\n240#10,3:391\n243#10,3:414\n240#10,3:513\n243#10,3:536\n1101#11:402\n1083#11,2:403\n1101#11:524\n1083#11,2:525\n519#12:436\n44#12:438\n519#12:558\n44#12:560\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n124#1:276,3\n124#1:279,7\n124#1:287,3\n124#1:291,9\n124#1:300\n161#1:334,3\n161#1:337,7\n161#1:345,3\n161#1:349,9\n161#1:358\n124#1:286\n124#1:290\n161#1:344\n161#1:348\n133#1:301,9\n139#1:325\n193#1:375\n214#1:497\n133#1:310\n132#1:311\n132#1:317,8\n132#1:327,7\n193#1:376,6\n193#1:382,6\n193#1:389,2\n193#1:394,8\n193#1:405,9\n193#1:417,8\n193#1:425\n193#1:426\n193#1:432,4\n193#1:437\n193#1:439,9\n193#1:448,37\n193#1:485,6\n193#1:491\n214#1:498,6\n214#1:504,6\n214#1:511,2\n214#1:516,8\n214#1:527,9\n214#1:539,8\n214#1:547\n214#1:548\n214#1:554,4\n214#1:559\n214#1:561,9\n214#1:570,37\n214#1:607,6\n214#1:613\n132#1:312,5\n193#1:427,5\n214#1:549,5\n268#1:621,5\n271#1:626,5\n272#1:631,5\n139#1:326\n193#1:388\n214#1:510\n173#1:359,6\n174#1:365,6\n188#1:371,4\n188#1:492\n200#1:493,4\n200#1:614\n248#1:615,6\n193#1:391,3\n193#1:414,3\n214#1:513,3\n214#1:536,3\n193#1:402\n193#1:403,2\n214#1:524\n214#1:525,2\n193#1:436\n193#1:438\n214#1:558\n214#1:560\n*E\n"})
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;

    @NotNull
    private final InterfaceC6469a activeFocusTargetNodeFetcher;

    @NotNull
    private final InterfaceC6469a invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;

    @NotNull
    private final InterfaceC6471c onRequestApplyChangesListener;

    @NotNull
    private final InterfaceC6469a rootFocusStateFetcher;

    @NotNull
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();

    @NotNull
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();

    @NotNull
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();

    @NotNull
    private final List<FocusEventModifierNode> focusEventNodesLegacy = new ArrayList();

    @NotNull
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy = new ArrayList();

    @NotNull
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidationLegacy$1 */
    public /* synthetic */ class C20921 extends FunctionReferenceImpl implements InterfaceC6469a {
        public C20921(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m10331invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10331invoke() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$setUpOnRequestApplyChangesListener$1 */
    public /* synthetic */ class C20931 extends FunctionReferenceImpl implements InterfaceC6469a {
        public C20931(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // p152r6.InterfaceC6469a
        public /* bridge */ /* synthetic */ Object invoke() {
            m10332invoke();
            return C5443s.f8405a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m10332invoke() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    public FocusInvalidationManager(@NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6469a interfaceC6469a, @NotNull InterfaceC6469a interfaceC6469a2, @NotNull InterfaceC6469a interfaceC6469a3) {
        this.onRequestApplyChangesListener = interfaceC6471c;
        this.invalidateOwnerFocusState = interfaceC6469a;
        this.rootFocusStateFetcher = interfaceC6469a2;
        this.activeFocusTargetNodeFetcher = interfaceC6469a3;
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
        int i;
        int i8;
        int i9;
        boolean z8;
        int i10;
        FocusState focusState;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = 0;
        if (!((FocusState) this.rootFocusStateFetcher.invoke()).getHasFocus()) {
            List<FocusEventModifierNode> list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).onFocusEvent(FocusStateImpl.Inactive);
            }
            List<FocusTargetNode> list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                FocusTargetNode focusTargetNode = list2.get(i12);
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
        int i13 = 0;
        while (true) {
            i = 1024;
            i8 = 16;
            i9 = 1;
            if (i13 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = list3.get(i13);
            if (focusPropertiesModifierNode.getNode().getIsAttached()) {
                int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
                Modifier.Node node = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet() & iM12314constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        int i14 = 0;
                        for (Modifier.Node delegate = ((DelegatingNode) node).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                            if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                i14++;
                                if (i14 == 1) {
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
                        if (i14 == 1) {
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
                    Modifier.Node nodePop = (Modifier.Node) AbstractC1923c.m1046j(mutableVector2, 1);
                    if ((nodePop.getAggregateChildKindSet() & iM12314constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
                    } else {
                        while (true) {
                            if (nodePop == null) {
                                break;
                            }
                            if ((nodePop.getKindSet() & iM12314constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (nodePop != null) {
                                    if (nodePop instanceof FocusTargetNode) {
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) nodePop);
                                    } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        int i15 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodePop).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iM12314constructorimpl) != 0) {
                                                i15++;
                                                if (i15 == 1) {
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
                                        if (i15 == 1) {
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
            i13++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i16 = 0;
        while (i16 < size4) {
            FocusEventModifierNode focusEventModifierNode = list4.get(i16);
            if (focusEventModifierNode.getNode().getIsAttached()) {
                int iM12314constructorimpl2 = NodeKind.m12314constructorimpl(i);
                Modifier.Node node2 = focusEventModifierNode.getNode();
                int i17 = z12;
                int i18 = i9;
                FocusTargetNode focusTargetNode2 = null;
                MutableVector mutableVector4 = null;
                while (node2 != null) {
                    if (node2 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node2;
                        if (focusTargetNode2 != null) {
                            i17 = i9;
                        }
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            i18 = z12;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node2.getKindSet() & iM12314constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate();
                        int i19 = z12;
                        while (delegate3 != null) {
                            if ((delegate3.getKindSet() & iM12314constructorimpl2) != 0) {
                                i19++;
                                if (i19 == i9) {
                                    node2 = delegate3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[i8], z12);
                                    }
                                    if (node2 != null) {
                                        mutableVector4.add(node2);
                                        node2 = null;
                                    }
                                    mutableVector4.add(delegate3);
                                }
                            }
                            delegate3 = delegate3.getChild();
                            i9 = 1;
                        }
                        int i20 = i9;
                        if (i19 == i20) {
                            i9 = i20;
                        }
                    }
                    node2 = DelegatableNodeKt.pop(mutableVector4);
                    i9 = 1;
                }
                if (!focusEventModifierNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i8], z12);
                Modifier.Node child2 = focusEventModifierNode.getNode().getChild();
                if (child2 == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusEventModifierNode.getNode(), z12);
                } else {
                    mutableVector5.add(child2);
                }
                while (mutableVector5.getSize() != 0) {
                    Modifier.Node nodePop2 = (Modifier.Node) AbstractC1923c.m1046j(mutableVector5, 1);
                    z12 = z12;
                    if ((nodePop2.getAggregateChildKindSet() & iM12314constructorimpl2) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, nodePop2, z12);
                    } else {
                        while (nodePop2 != null) {
                            if ((nodePop2.getKindSet() & iM12314constructorimpl2) != 0) {
                                MutableVector mutableVector6 = null;
                                z12 = z12;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) nodePop2;
                                        if (focusTargetNode2 != null) {
                                            i17 = 1;
                                        }
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            i18 = z12 == true ? 1 : 0;
                                        }
                                        z9 = z12 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                    } else if ((nodePop2.getKindSet() & iM12314constructorimpl2) == 0 || !(nodePop2 instanceof DelegatingNode)) {
                                        z9 = z12 == true ? 1 : 0;
                                    } else {
                                        Modifier.Node delegate4 = ((DelegatingNode) nodePop2).getDelegate();
                                        int i21 = z12 == true ? 1 : 0;
                                        boolean z13 = z12;
                                        while (delegate4 != null) {
                                            if ((delegate4.getKindSet() & iM12314constructorimpl2) != 0) {
                                                i21++;
                                                if (i21 == 1) {
                                                    nodePop2 = delegate4;
                                                    z11 = false;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        Modifier.Node[] nodeArr = new Modifier.Node[i8];
                                                        z11 = false;
                                                        mutableVector6 = new MutableVector(nodeArr, 0);
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector6.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector6.add(delegate4);
                                                }
                                            } else {
                                                z11 = z13;
                                            }
                                            delegate4 = delegate4.getChild();
                                            z13 = z11;
                                            i8 = 16;
                                        }
                                        z10 = z13;
                                        z10 = z10;
                                        if (i21 != 1) {
                                            nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                        }
                                        z12 = z10;
                                        i8 = 16;
                                    }
                                    z10 = z9;
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector6);
                                    z12 = z10;
                                    i8 = 16;
                                }
                                boolean z14 = z12 == true ? 1 : 0;
                                i8 = 16;
                            } else {
                                boolean z15 = z12 == true ? 1 : 0;
                                nodePop2 = nodePop2.getChild();
                                z12 = z15 ? 1 : 0;
                                i8 = 16;
                            }
                        }
                    }
                    z12 = z12 ? 1 : 0;
                    i8 = 16;
                }
                z8 = z12 == true ? 1 : 0;
                i10 = 1;
                if (i18 != 0) {
                    if (i17 != 0) {
                        focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                    } else if (focusTargetNode2 == null || (focusState = focusTargetNode2.getFocusState()) == null) {
                        focusState = FocusStateImpl.Inactive;
                    }
                    focusEventModifierNode.onFocusEvent(focusState);
                }
            } else {
                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                z8 = z12;
                i10 = i9;
            }
            i16++;
            i9 = i10;
            z12 = z8;
            i = 1024;
            i8 = 16;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
        int size5 = list5.size();
        for (int i22 = z12; i22 < size5; i22++) {
            FocusTargetNode focusTargetNode5 = list5.get(i22);
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

    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void invalidateNodesOptimized() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.focus.FocusInvalidationManager.invalidateNodesOptimized():void");
    }

    private final <T> void scheduleInvalidationLegacy(List<T> list, T t8) {
        if (list.add(t8)) {
            if (this.focusPropertiesNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusTargetNodesLegacy.size() == 1) {
                this.onRequestApplyChangesListener.invoke(new C20921(this));
            }
        }
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new C20931(this));
        this.isInvalidationScheduled = true;
    }

    public final boolean hasPendingInvalidation() {
        return ComposeUiFlags.isTrackFocusEnabled ? this.isInvalidationScheduled : (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    public final void scheduleInvalidation(@NotNull FocusTargetNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusTargetNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusTargetNodesLegacy, node);
        }
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusEventNodes, node);
        } else {
            scheduleInvalidationLegacy(this.focusEventNodesLegacy, node);
        }
    }

    public final void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, node);
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t8) {
        if (mutableScatterSet.add(t8)) {
            setUpOnRequestApplyChangesListener();
        }
    }
}
