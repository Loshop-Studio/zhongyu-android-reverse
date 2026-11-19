package androidx.compose.p011ui.focus;

import androidx.compose.material3.AbstractC1923c;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.layout.BeyondBoundsLayout;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.LayoutNode;
import androidx.compose.p011ui.node.NodeChain;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a2\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a:\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a:\u0010\u0011\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a'\u0010\u0012\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\n\u001a'\u0010\u0013\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\n\u001a\u0013\u0010\u0014\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u001b\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aG\u0010\u001d\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u0003H\u0082\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u001d\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\f\n\u0004\b\u001f\u0010 \u0012\u0004\b!\u0010\"\"\u001a\u0010#\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\f\n\u0004\b#\u0010 \u0012\u0004\b$\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, m5110d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "oneDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILr6/c;)Z", "oneDimensionalFocusSearch", "forwardFocusSearch", "(Landroidx/compose/ui/focus/FocusTargetNode;Lr6/c;)Z", "backwardFocusSearch", "focusedItem", "generateAndSearchChildren-4C6V_qg", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;ILr6/c;)Z", "generateAndSearchChildren", "searchChildren-4C6V_qg", "searchChildren", "pickChildForForwardSearch", "pickChildForBackwardSearch", "isRoot", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/collection/MutableVector;", "item", "Ld6/s;", "action", "forEachItemAfter", "(Landroidx/compose/runtime/collection/MutableVector;Ljava/lang/Object;Lr6/c;)V", "forEachItemBefore", "", "InvalidFocusDirection", "Ljava/lang/String;", "getInvalidFocusDirection$annotations", "()V", "NoActiveChild", "getNoActiveChild$annotations", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,280:1\n201#1,3:359\n204#1,2:363\n207#1,5:366\n216#1,3:371\n219#1,2:375\n222#1,5:378\n1083#2,2:281\n1101#2:297\n1083#2,2:383\n1101#2:398\n1083#2,2:467\n1101#2:482\n1101#2:595\n1083#2,2:596\n1#3:283\n119#4:284\n119#4:385\n119#4:469\n119#4:553\n283#5,5:285\n148#5:290\n149#5:296\n150#5,3:298\n153#5:302\n154#5,9:304\n437#5,6:313\n447#5,2:320\n449#5,17:325\n466#5,8:345\n163#5,6:353\n283#5,5:386\n148#5:391\n149#5:397\n150#5,3:399\n153#5:403\n154#5,9:405\n437#5,6:414\n447#5,2:421\n449#5,17:426\n466#5,8:446\n163#5,6:454\n283#5,5:470\n148#5:475\n149#5:481\n150#5,3:483\n153#5:487\n154#5,9:489\n437#5,6:498\n447#5,2:505\n449#5,17:510\n466#5,8:530\n163#5,6:538\n277#5:554\n247#5,5:555\n90#5:560\n91#5,8:566\n437#5,5:574\n278#5:579\n442#5:580\n447#5,2:582\n449#5,8:587\n457#5,9:598\n466#5,8:610\n100#5,7:618\n280#5:625\n56#6,5:291\n56#6,5:392\n56#6,5:476\n56#6,5:561\n519#7:301\n44#7:303\n48#7:362\n472#7:365\n48#7:374\n472#7:377\n519#7:402\n44#7:404\n194#7,7:460\n519#7:486\n44#7:488\n447#7,9:544\n48#7:626\n472#7:627\n472#7:628\n48#7:629\n472#7:630\n472#7:631\n246#8:319\n246#8:420\n246#8:504\n246#8:581\n240#9,3:322\n243#9,3:342\n240#9,3:423\n243#9,3:443\n240#9,3:507\n243#9,3:527\n240#9,3:584\n243#9,3:607\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n153#1:359,3\n153#1:363,2\n153#1:366,5\n157#1:371,3\n157#1:375,2\n157#1:378,5\n149#1:281,2\n149#1:297\n177#1:383,2\n177#1:398\n186#1:467,2\n186#1:482\n196#1:595\n196#1:596,2\n149#1:284\n177#1:385\n186#1:469\n196#1:553\n149#1:285,5\n149#1:290\n149#1:296\n149#1:298,3\n149#1:302\n149#1:304,9\n149#1:313,6\n149#1:320,2\n149#1:325,17\n149#1:345,8\n149#1:353,6\n177#1:386,5\n177#1:391\n177#1:397\n177#1:399,3\n177#1:403\n177#1:405,9\n177#1:414,6\n177#1:421,2\n177#1:426,17\n177#1:446,8\n177#1:454,6\n186#1:470,5\n186#1:475\n186#1:481\n186#1:483,3\n186#1:487\n186#1:489,9\n186#1:498,6\n186#1:505,2\n186#1:510,17\n186#1:530,8\n186#1:538,6\n196#1:554\n196#1:555,5\n196#1:560\n196#1:566,8\n196#1:574,5\n196#1:579\n196#1:580\n196#1:582,2\n196#1:587,8\n196#1:598,9\n196#1:610,8\n196#1:618,7\n196#1:625\n149#1:291,5\n177#1:392,5\n186#1:476,5\n196#1:561,5\n149#1:301\n149#1:303\n153#1:362\n153#1:365\n157#1:374\n157#1:377\n177#1:402\n177#1:404\n179#1:460,7\n186#1:486\n186#1:488\n188#1:544,9\n203#1:626\n205#1:627\n207#1:628\n218#1:629\n220#1:630\n222#1:631\n149#1:319\n177#1:420\n186#1:504\n196#1:581\n149#1:322,3\n149#1:342,3\n177#1:423,3\n177#1:443,3\n186#1:507,3\n186#1:527,3\n196#1:584,3\n196#1:607,3\n*E\n"})
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {

    @NotNull
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";

    @NotNull
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
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

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, InterfaceC6471c interfaceC6471c) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[focusState.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return pickChildForBackwardSearch(focusTargetNode, interfaceC6471c);
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!pickChildForBackwardSearch(focusTargetNode, interfaceC6471c)) {
                if (!(focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean) interfaceC6471c.invoke(focusTargetNode)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i8 = iArr[activeChild.getFocusState().ordinal()];
        if (i8 == 1) {
            return backwardFocusSearch(activeChild, interfaceC6471c) || m10381generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.INSTANCE.m10327getPreviousdhqQ8s(), interfaceC6471c) || (activeChild.fetchFocusProperties$ui_release().getCanFocus() && ((Boolean) interfaceC6471c.invoke(activeChild)).booleanValue());
        }
        if (i8 == 2 || i8 == 3) {
            return m10381generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.INSTANCE.m10327getPreviousdhqQ8s(), interfaceC6471c);
        }
        if (i8 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(NoActiveChild);
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t8, InterfaceC6471c interfaceC6471c) {
        boolean z8 = false;
        C6756f c6756fM5260N = AbstractC5806u.m5260N(0, mutableVector.getSize());
        int i = c6756fM5260N.f11420a;
        int i8 = c6756fM5260N.f11421b;
        if (i > i8) {
            return;
        }
        while (true) {
            if (z8) {
                interfaceC6471c.invoke(mutableVector.content[i]);
            }
            if (AbstractC5830k.m5325b(mutableVector.content[i], t8)) {
                z8 = true;
            }
            if (i == i8) {
                return;
            } else {
                i++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t8, InterfaceC6471c interfaceC6471c) {
        boolean z8 = false;
        C6756f c6756fM5260N = AbstractC5806u.m5260N(0, mutableVector.getSize());
        int i = c6756fM5260N.f11420a;
        int i8 = c6756fM5260N.f11421b;
        if (i > i8) {
            return;
        }
        while (true) {
            if (z8) {
                interfaceC6471c.invoke(mutableVector.content[i8]);
            }
            if (AbstractC5830k.m5325b(mutableVector.content[i8], t8)) {
                z8 = true;
            }
            if (i8 == i) {
                return;
            } else {
                i8--;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, InterfaceC6471c interfaceC6471c) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, interfaceC6471c) || m10381generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.INSTANCE.m10326getNextdhqQ8s(), interfaceC6471c);
            }
            throw new IllegalStateException(NoActiveChild);
        }
        if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetNode, interfaceC6471c);
        }
        if (i == 4) {
            return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? ((Boolean) interfaceC6471c.invoke(focusTargetNode)).booleanValue() : pickChildForForwardSearch(focusTargetNode, interfaceC6471c);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m10381generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i, final InterfaceC6471c interfaceC6471c) {
        if (m10383searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, interfaceC6471c)) {
            return true;
        }
        final FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        final int generation = focusTransactionManagerRequireTransactionManager.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m10313searchBeyondBoundsOMvw8(focusTargetNode, i, new InterfaceC6471c() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                if (generation != focusTransactionManagerRequireTransactionManager.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                boolean zM10383searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m10383searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i, interfaceC6471c);
                Boolean boolValueOf = Boolean.valueOf(zM10383searchChildren4C6V_qg);
                if (zM10383searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes;
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((AbstractC1923c.m1039c(layoutNodeRequireLayoutNode) & iM12314constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM12314constructorimpl) != 0) {
                        Modifier.Node nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                node = nodePop;
                                break loop0;
                            }
                            if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return node == null;
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m10382oneDimensionalFocusSearchOMvw8(@NotNull FocusTargetNode focusTargetNode, int i, @NotNull InterfaceC6471c interfaceC6471c) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m10318equalsimpl0(i, companion.m10326getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, interfaceC6471c);
        }
        if (FocusDirection.m10318equalsimpl0(i, companion.m10327getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, interfaceC6471c);
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, InterfaceC6471c interfaceC6471c) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
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
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector3.add(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
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
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, interfaceC6471c)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, InterfaceC6471c interfaceC6471c) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
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
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector3.add(delegate);
                                        }
                                    }
                                }
                                if (i == 1) {
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
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i8 = 0; i8 < size; i8++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i8];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, interfaceC6471c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m10383searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, InterfaceC6471c interfaceC6471c) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
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
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i8 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM12314constructorimpl) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector3.add(delegate);
                                        }
                                    }
                                }
                                if (i8 == 1) {
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
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m10318equalsimpl0(i, companion.m10326getNextdhqQ8s())) {
            C6756f c6756fM5260N = AbstractC5806u.m5260N(0, mutableVector.getSize());
            int i9 = c6756fM5260N.f11420a;
            int i10 = c6756fM5260N.f11421b;
            if (i9 <= i10) {
                boolean z8 = false;
                while (true) {
                    if (z8) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.content[i9];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, interfaceC6471c)) {
                            return true;
                        }
                    }
                    if (AbstractC5830k.m5325b(mutableVector.content[i9], focusTargetNode2)) {
                        z8 = true;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9++;
                }
            }
        } else {
            if (!FocusDirection.m10318equalsimpl0(i, companion.m10327getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            C6756f c6756fM5260N2 = AbstractC5806u.m5260N(0, mutableVector.getSize());
            int i11 = c6756fM5260N2.f11420a;
            int i12 = c6756fM5260N2.f11421b;
            if (i11 <= i12) {
                boolean z9 = false;
                while (true) {
                    if (z9) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.content[i12];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, interfaceC6471c)) {
                            return true;
                        }
                    }
                    if (AbstractC5830k.m5325b(mutableVector.content[i12], focusTargetNode2)) {
                        z9 = true;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12--;
                }
            }
        }
        if (FocusDirection.m10318equalsimpl0(i, FocusDirection.INSTANCE.m10326getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return ((Boolean) interfaceC6471c.invoke(focusTargetNode)).booleanValue();
    }
}
