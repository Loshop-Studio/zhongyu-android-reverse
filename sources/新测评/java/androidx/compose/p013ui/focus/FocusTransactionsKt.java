package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.node.NodeChain;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.p013ui.node.ObserverModifierNodeKt;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001e\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u001e\u0010\u0011\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u001e\u0010\u0013\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u001a\f\u0010\u0015\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002\u001a\f\u0010\u001a\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u001b\u001a\u00020\u0002*\u00020\u0002H\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m13558d2 = {"captureFocus", "", "Landroidx/compose/ui/focus/FocusTargetNode;", "clearChildFocus", "forced", "refreshFocusEvents", "clearFocus", "freeFocus", "grantFocus", "performCustomClearFocus", "Landroidx/compose/ui/focus/CustomDestinationResult;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "performCustomClearFocus-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;", "performCustomEnter", "performCustomEnter-Mxy_nc0", "performCustomExit", "performCustomExit-Mxy_nc0", "performCustomRequestFocus", "performCustomRequestFocus-Mxy_nc0", "performRequestFocus", "performRequestFocusLegacy", "performRequestFocusOptimized", "requestFocusForChild", "childNode", "requestFocusForOwner", "requireActiveChild", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 11 FocusTargetNode.kt\nandroidx/compose/ui/focus/FocusTargetNode\n*L\n1#1,459:1\n1101#2:460\n1083#2,2:461\n1101#2:503\n1083#2,2:504\n1101#2:533\n1083#2,2:534\n1101#2:576\n1083#2,2:577\n1101#2:666\n1083#2,2:667\n1101#2:769\n1083#2,2:770\n1101#2:843\n1083#2,2:844\n1101#2:916\n1083#2,2:917\n119#3:463\n119#3:536\n119#3:624\n119#3:727\n119#3:801\n119#3:874\n247#4,5:464\n90#4:469\n91#4,8:475\n437#4,6:483\n447#4,2:490\n449#4,8:495\n457#4,9:506\n466#4,8:518\n100#4,7:526\n247#4,5:537\n90#4:542\n91#4,8:548\n437#4,6:556\n447#4,2:563\n449#4,8:568\n457#4,9:579\n466#4,8:591\n100#4,7:599\n277#4:625\n247#4,5:626\n90#4:631\n91#4,8:637\n437#4,5:645\n278#4:650\n442#4:651\n447#4,2:653\n449#4,8:658\n457#4,9:669\n466#4,8:681\n100#4,7:689\n280#4:696\n277#4:728\n247#4,5:729\n90#4:734\n91#4,8:740\n437#4,5:748\n278#4:753\n442#4:754\n447#4,2:756\n449#4,8:761\n457#4,9:772\n466#4,8:784\n100#4,7:792\n280#4:799\n277#4:802\n247#4,5:803\n90#4:808\n91#4,8:814\n437#4,5:822\n278#4:827\n442#4:828\n447#4,2:830\n449#4,8:835\n457#4,9:846\n466#4,8:858\n100#4,7:866\n280#4:873\n277#4:875\n247#4,5:876\n90#4:881\n91#4,8:887\n437#4,5:895\n278#4:900\n442#4:901\n447#4,2:903\n449#4,8:908\n457#4,9:919\n466#4,8:931\n100#4,7:939\n280#4:946\n56#5,5:470\n56#5,5:543\n56#5,5:632\n56#5,5:735\n56#5,5:809\n56#5,5:882\n246#6:489\n246#6:562\n246#6:652\n246#6:755\n246#6:829\n246#6:902\n240#7,3:492\n243#7,3:515\n240#7,3:565\n243#7,3:588\n240#7,3:655\n243#7,3:678\n240#7,3:758\n243#7,3:781\n240#7,3:832\n243#7,3:855\n240#7,3:905\n243#7,3:928\n447#8,9:606\n447#8,9:615\n641#8,2:706\n641#8,2:721\n48#9,8:697\n56#9,4:708\n48#9,8:712\n56#9,4:723\n1#10:705\n1#10:720\n1#10:800\n266#11,4:947\n232#11,11:951\n271#11:962\n244#11,7:963\n272#11,3:970\n290#11,4:973\n232#11,11:977\n295#11:988\n244#11,7:989\n296#11,3:996\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n74#1:460\n74#1:461,2\n75#1:503\n75#1:504,2\n82#1:533\n82#1:534,2\n83#1:576\n83#1:577,2\n155#1:666\n155#1:667,2\n346#1:769\n346#1:770,2\n362#1:843\n362#1:844,2\n415#1:916\n415#1:917,2\n75#1:463\n83#1:536\n155#1:624\n346#1:727\n362#1:801\n415#1:874\n75#1:464,5\n75#1:469\n75#1:475,8\n75#1:483,6\n75#1:490,2\n75#1:495,8\n75#1:506,9\n75#1:518,8\n75#1:526,7\n83#1:537,5\n83#1:542\n83#1:548,8\n83#1:556,6\n83#1:563,2\n83#1:568,8\n83#1:579,9\n83#1:591,8\n83#1:599,7\n155#1:625\n155#1:626,5\n155#1:631\n155#1:637,8\n155#1:645,5\n155#1:650\n155#1:651\n155#1:653,2\n155#1:658,8\n155#1:669,9\n155#1:681,8\n155#1:689,7\n155#1:696\n346#1:728\n346#1:729,5\n346#1:734\n346#1:740,8\n346#1:748,5\n346#1:753\n346#1:754\n346#1:756,2\n346#1:761,8\n346#1:772,9\n346#1:784,8\n346#1:792,7\n346#1:799\n362#1:802\n362#1:803,5\n362#1:808\n362#1:814,8\n362#1:822,5\n362#1:827\n362#1:828\n362#1:830,2\n362#1:835,8\n362#1:846,9\n362#1:858,8\n362#1:866,7\n362#1:873\n415#1:875\n415#1:876,5\n415#1:881\n415#1:887,8\n415#1:895,5\n415#1:900\n415#1:901\n415#1:903,2\n415#1:908,8\n415#1:919,9\n415#1:931,8\n415#1:939,7\n415#1:946\n75#1:470,5\n83#1:543,5\n155#1:632,5\n346#1:735,5\n362#1:809,5\n415#1:882,5\n75#1:489\n83#1:562\n155#1:652\n346#1:755\n362#1:829\n415#1:902\n75#1:492,3\n75#1:515,3\n83#1:565,3\n83#1:588,3\n155#1:655,3\n155#1:678,3\n346#1:758,3\n346#1:781,3\n362#1:832,3\n362#1:855,3\n415#1:905,3\n415#1:928,3\n101#1:606,9\n112#1:615,9\n200#1:706,2\n234#1:721,2\n200#1:697,8\n200#1:708,4\n234#1:712,8\n234#1:723,4\n200#1:705\n234#1:720\n443#1:947,4\n443#1:951,11\n443#1:962\n443#1:963,7\n443#1:970,3\n453#1:973,4\n453#1:977,11\n453#1:988\n453#1:989,7\n453#1:996,3\n*E\n"})
/* loaded from: classes2.dex */
public final class FocusTransactionsKt {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
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

    public static final boolean captureFocus(FocusTargetNode focusTargetNode) {
        boolean z9 = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i10 == 1) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(true);
                focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Captured);
                return true;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 == 3 || i10 == 4) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return z9;
            }
            focusTargetNode.setFocusState(FocusStateImpl.Captured);
            focusTargetNode.dispatchFocusCallbacks$ui_release();
            z9 = true;
            return z9;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    private static final boolean clearChildFocus(FocusTargetNode focusTargetNode, boolean z9, boolean z10) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z9, z10);
        }
        return true;
    }

    public static /* synthetic */ boolean clearChildFocus$default(FocusTargetNode focusTargetNode, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return clearChildFocus(focusTargetNode, z9, z10);
    }

    public static final boolean clearFocus(FocusTargetNode focusTargetNode, boolean z9, boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i10 == 1) {
            if (ComposeUiFlags.isTrackFocusEnabled) {
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                if (z10) {
                    focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Active, FocusStateImpl.Inactive);
                }
            } else {
                focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                if (z10) {
                    focusTargetNode.dispatchFocusCallbacks$ui_release();
                }
            }
            return true;
        }
        if (i10 == 2) {
            if (z9) {
                if (ComposeUiFlags.isTrackFocusEnabled) {
                    DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(null);
                    if (z10) {
                        focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Inactive);
                        return z9;
                    }
                } else {
                    focusTargetNode.setFocusState(FocusStateImpl.Inactive);
                    if (z10) {
                        focusTargetNode.dispatchFocusCallbacks$ui_release();
                    }
                }
            }
            return z9;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!clearChildFocus(focusTargetNode, z9, z10)) {
            return false;
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            focusTargetNode.setFocusState(FocusStateImpl.Inactive);
            if (z10) {
                focusTargetNode.dispatchFocusCallbacks$ui_release();
            }
        } else if (z10) {
            focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetNode focusTargetNode, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return clearFocus(focusTargetNode, z9, z10);
    }

    public static final boolean freeFocus(FocusTargetNode focusTargetNode) {
        boolean z9 = false;
        if (ComposeUiFlags.isTrackFocusEnabled) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3 || i10 == 4) {
                        return false;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setFocusCaptured(false);
                focusTargetNode.dispatchFocusCallbacks$ui_release(FocusStateImpl.Captured, FocusStateImpl.Active);
            }
            return true;
        }
        FocusTransactionManager focusTransactionManagerRequireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        try {
            if (focusTransactionManagerRequireTransactionManager.getOngoingTransaction()) {
                focusTransactionManagerRequireTransactionManager.cancelTransaction();
            }
            focusTransactionManagerRequireTransactionManager.beginTransaction();
            int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
            if (i11 == 1) {
                z9 = true;
            } else if (i11 == 2) {
                focusTargetNode.setFocusState(FocusStateImpl.Active);
                focusTargetNode.dispatchFocusCallbacks$ui_release();
                z9 = true;
            } else if (i11 != 3 && i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return z9;
        } finally {
            focusTransactionManagerRequireTransactionManager.commitTransaction();
        }
    }

    private static final boolean grantFocus(final FocusTargetNode focusTargetNode) {
        ObserverModifierNodeKt.observeReads(focusTargetNode, new Function0<Unit>() { // from class: androidx.compose.ui.focus.FocusTransactionsKt.grantFocus.1
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
                focusTargetNode.fetchFocusProperties$ui_release();
            }
        });
        int i10 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().setActiveFocusTargetNode(focusTargetNode);
            return true;
        }
        focusTargetNode.setFocusState(FocusStateImpl.Active);
        return true;
    }

    /* renamed from: performCustomClearFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m20657performCustomClearFocusMxy_nc0(FocusTargetNode focusTargetNode, int i10) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return CustomDestinationResult.Cancelled;
            }
            if (i11 == 3) {
                CustomDestinationResult customDestinationResultM20657performCustomClearFocusMxy_nc0 = m20657performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i10);
                if (customDestinationResultM20657performCustomClearFocusMxy_nc0 == CustomDestinationResult.None) {
                    customDestinationResultM20657performCustomClearFocusMxy_nc0 = null;
                }
                return customDestinationResultM20657performCustomClearFocusMxy_nc0 == null ? m20659performCustomExitMxy_nc0(focusTargetNode, i10) : customDestinationResultM20657performCustomClearFocusMxy_nc0;
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomEnter-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m20658performCustomEnterMxy_nc0(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.isProcessingCustomEnter) {
            focusTargetNode.isProcessingCustomEnter = true;
            try {
                FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i10, null);
                FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
                int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                focusPropertiesFetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
                int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        CustomDestinationResult customDestinationResult = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult;
                    }
                    if (cancel == companion.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult2;
                    }
                    CustomDestinationResult customDestinationResult3 = FocusRequester.m20646requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomEnter = false;
                    return customDestinationResult3;
                }
                if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                    FocusRequester.Companion companion2 = FocusRequester.INSTANCE;
                    FocusRequester redirect$ui_release = companion2.getRedirect$ui_release();
                    if (redirect$ui_release == companion2.getCancel()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult4;
                    }
                    if (redirect$ui_release == companion2.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult5 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomEnter = false;
                        return customDestinationResult5;
                    }
                    CustomDestinationResult customDestinationResult6 = FocusRequester.m20646requestFocus3ESFkO8$default(redirect$ui_release, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomEnter = false;
                    return customDestinationResult6;
                }
                focusTargetNode.isProcessingCustomEnter = false;
            } catch (Throwable th) {
                focusTargetNode.isProcessingCustomEnter = false;
                throw th;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomExit-Mxy_nc0, reason: not valid java name */
    private static final CustomDestinationResult m20659performCustomExitMxy_nc0(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.isProcessingCustomExit) {
            focusTargetNode.isProcessingCustomExit = true;
            try {
                FocusProperties focusPropertiesFetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
                CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i10, null);
                FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
                int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
                FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
                focusPropertiesFetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
                int generation2 = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
                FocusTargetNode activeFocusTargetNode2 = focusOwner.getActiveFocusTargetNode();
                if (cancelIndicatingFocusBoundaryScope.getIsCanceled()) {
                    FocusRequester.Companion companion = FocusRequester.INSTANCE;
                    FocusRequester cancel = companion.getCancel();
                    if (cancel == companion.getCancel()) {
                        CustomDestinationResult customDestinationResult = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult;
                    }
                    if (cancel == companion.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult2 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult2;
                    }
                    CustomDestinationResult customDestinationResult3 = FocusRequester.m20646requestFocus3ESFkO8$default(cancel, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomExit = false;
                    return customDestinationResult3;
                }
                if (generation != generation2 || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != activeFocusTargetNode2 && activeFocusTargetNode2 != null)) {
                    FocusRequester.Companion companion2 = FocusRequester.INSTANCE;
                    FocusRequester redirect$ui_release = companion2.getRedirect$ui_release();
                    if (redirect$ui_release == companion2.getCancel()) {
                        CustomDestinationResult customDestinationResult4 = CustomDestinationResult.Cancelled;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult4;
                    }
                    if (redirect$ui_release == companion2.getRedirect$ui_release()) {
                        CustomDestinationResult customDestinationResult5 = CustomDestinationResult.Redirected;
                        focusTargetNode.isProcessingCustomExit = false;
                        return customDestinationResult5;
                    }
                    CustomDestinationResult customDestinationResult6 = FocusRequester.m20646requestFocus3ESFkO8$default(redirect$ui_release, 0, 1, null) ? CustomDestinationResult.Redirected : CustomDestinationResult.RedirectCancelled;
                    focusTargetNode.isProcessingCustomExit = false;
                    return customDestinationResult6;
                }
                focusTargetNode.isProcessingCustomExit = false;
            } catch (Throwable th) {
                focusTargetNode.isProcessingCustomExit = false;
                throw th;
            }
        }
        return CustomDestinationResult.None;
    }

    /* renamed from: performCustomRequestFocus-Mxy_nc0, reason: not valid java name */
    public static final CustomDestinationResult m20660performCustomRequestFocusMxy_nc0(FocusTargetNode focusTargetNode, int i10) {
        Modifier.Node nodePop;
        NodeChain nodes;
        int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return CustomDestinationResult.None;
        }
        if (i11 == 3) {
            return m20657performCustomClearFocusMxy_nc0(requireActiveChild(focusTargetNode), i10);
        }
        if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM22586constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet() & iM22586constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM22586constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
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
                                if (i12 == 1) {
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
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
        if (focusTargetNode2 == null) {
            return CustomDestinationResult.None;
        }
        int i13 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode2.getFocusState().ordinal()];
        if (i13 == 1) {
            return m20658performCustomEnterMxy_nc0(focusTargetNode2, i10);
        }
        if (i13 == 2) {
            return CustomDestinationResult.Cancelled;
        }
        if (i13 == 3) {
            return m20660performCustomRequestFocusMxy_nc0(focusTargetNode2, i10);
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        CustomDestinationResult customDestinationResultM20660performCustomRequestFocusMxy_nc0 = m20660performCustomRequestFocusMxy_nc0(focusTargetNode2, i10);
        CustomDestinationResult customDestinationResult = customDestinationResultM20660performCustomRequestFocusMxy_nc0 != CustomDestinationResult.None ? customDestinationResultM20660performCustomRequestFocusMxy_nc0 : null;
        return customDestinationResult == null ? m20658performCustomEnterMxy_nc0(focusTargetNode2, i10) : customDestinationResult;
    }

    public static final boolean performRequestFocus(FocusTargetNode focusTargetNode) {
        return ComposeUiFlags.isTrackFocusEnabled ? performRequestFocusOptimized(focusTargetNode) : performRequestFocusLegacy(focusTargetNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean performRequestFocusLegacy(androidx.compose.p013ui.focus.FocusTargetNode r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.focus.FocusTransactionsKt.performRequestFocusLegacy(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean performRequestFocusOptimized(FocusTargetNode focusTargetNode) {
        MutableVector mutableVector;
        int i10;
        NodeChain nodes;
        NodeChain nodes2;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int i11 = 1;
        if (activeFocusTargetNode == focusTargetNode) {
            focusTargetNode.dispatchFocusCallbacks$ui_release(focusState, focusState);
            return true;
        }
        int i12 = 0;
        if (activeFocusTargetNode == null && !requestFocusForOwner(focusTargetNode)) {
            return false;
        }
        int i13 = 1024;
        int i14 = 16;
        if (activeFocusTargetNode != null) {
            mutableVector = new MutableVector(new FocusTargetNode[16], 0);
            int iM22586constructorimpl = NodeKind.m22586constructorimpl(1024);
            if (!activeFocusTargetNode.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = activeFocusTargetNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM22586constructorimpl) != 0) {
                            Modifier.Node nodePop = parent;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                int i15 = i13;
                                if (nodePop instanceof FocusTargetNode) {
                                    mutableVector.add((FocusTargetNode) nodePop);
                                } else if ((nodePop.getKindSet() & iM22586constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate();
                                    int i16 = 0;
                                    while (delegate != null) {
                                        if ((delegate.getKindSet() & iM22586constructorimpl) != 0) {
                                            i16++;
                                            if (i16 == i11) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector2.add(nodePop);
                                                    nodePop = null;
                                                }
                                                mutableVector2.add(delegate);
                                            }
                                        }
                                        delegate = delegate.getChild();
                                        i11 = 1;
                                    }
                                    if (i16 == i11) {
                                        i13 = i15;
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                                i13 = i15;
                                i11 = 1;
                            }
                        }
                        parent = parent.getParent();
                        i13 = i13;
                        i11 = 1;
                    }
                }
                int i17 = i13;
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
                i13 = i17;
                i11 = 1;
            }
        } else {
            mutableVector = null;
        }
        int i18 = i13;
        MutableVector mutableVector3 = new MutableVector(new FocusTargetNode[16], 0);
        int iM22586constructorimpl2 = NodeKind.m22586constructorimpl(i18);
        if (!focusTargetNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent2 = focusTargetNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        int i19 = 1;
        while (layoutNodeRequireLayoutNode2 != null) {
            if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM22586constructorimpl2) != 0) {
                while (parent2 != null) {
                    if ((parent2.getKindSet() & iM22586constructorimpl2) != 0) {
                        Modifier.Node nodePop2 = parent2;
                        MutableVector mutableVector4 = null;
                        while (nodePop2 != null) {
                            if (nodePop2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop2;
                                Boolean boolValueOf = mutableVector != null ? Boolean.valueOf(mutableVector.remove(focusTargetNode2)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    mutableVector3.add(focusTargetNode2);
                                }
                                if (focusTargetNode2 == activeFocusTargetNode) {
                                    i19 = i12;
                                }
                            } else {
                                if ((nodePop2.getKindSet() & iM22586constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                    Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate();
                                    int i20 = i12;
                                    while (delegate2 != null) {
                                        if ((delegate2.getKindSet() & iM22586constructorimpl2) != 0) {
                                            i20++;
                                            if (i20 == 1) {
                                                nodePop2 = delegate2;
                                            } else {
                                                if (mutableVector4 == null) {
                                                    mutableVector4 = new MutableVector(new Modifier.Node[i14], 0);
                                                }
                                                if (nodePop2 != null) {
                                                    mutableVector4.add(nodePop2);
                                                    nodePop2 = null;
                                                }
                                                mutableVector4.add(delegate2);
                                            }
                                        }
                                        delegate2 = delegate2.getChild();
                                        i14 = 16;
                                    }
                                    if (i20 == 1) {
                                    }
                                }
                                i12 = 0;
                                i14 = 16;
                            }
                            nodePop2 = DelegatableNodeKt.pop(mutableVector4);
                            i12 = 0;
                            i14 = 16;
                        }
                    }
                    parent2 = parent2.getParent();
                    i12 = 0;
                    i14 = 16;
                }
            }
            layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
            parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
            i12 = 0;
            i14 = 16;
        }
        if (i19 == 0 || activeFocusTargetNode == null) {
            i10 = 1;
        } else {
            i10 = 1;
            if (!clearFocus$default(activeFocusTargetNode, false, true, 1, null)) {
                return false;
            }
        }
        grantFocus(focusTargetNode);
        if (mutableVector != null) {
            int size = mutableVector.getSize() - i10;
            Object[] objArr = mutableVector.content;
            if (size < objArr.length) {
                while (size >= 0) {
                    FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                    if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode3.dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                    size--;
                }
            }
        }
        int size2 = mutableVector3.getSize() - 1;
        Object[] objArr2 = mutableVector3.content;
        if (size2 < objArr2.length) {
            while (size2 >= 0) {
                FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr2[size2];
                if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
                    return false;
                }
                focusTargetNode4.dispatchFocusCallbacks$ui_release(focusTargetNode4 == activeFocusTargetNode ? FocusStateImpl.Active : FocusStateImpl.Inactive, FocusStateImpl.ActiveParent);
                size2--;
            }
        }
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        focusTargetNode.dispatchFocusCallbacks$ui_release(focusState, FocusStateImpl.Active);
        if (focusOwner.getActiveFocusTargetNode() != focusTargetNode) {
            return false;
        }
        if (!ComposeUiFlags.isViewFocusFixEnabled || DelegatableNodeKt.requireLayoutNode(focusTargetNode).getInteropView() != null) {
            return true;
        }
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo20638requestFocusForOwner7o62pno(FocusDirection.m20616boximpl(FocusDirection.INSTANCE.m20627getNextdhqQ8s()), null);
        return true;
    }

    private static final boolean requestFocusForChild(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        Modifier.Node node;
        Modifier.Node nodePop;
        NodeChain nodes;
        NodeChain nodes2;
        int iM22586constructorimpl = NodeKind.m22586constructorimpl(1024);
        if (!focusTargetNode2.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = focusTargetNode2.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM22586constructorimpl) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iM22586constructorimpl) != 0) {
                        nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet() & iM22586constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & iM22586constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes2 = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes2.getTail();
        }
        if (!Intrinsics.areEqual(nodePop, focusTargetNode)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i11 == 1) {
            boolean zGrantFocus = grantFocus(focusTargetNode2);
            if (zGrantFocus) {
                focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
            }
            return zGrantFocus;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int iM22586constructorimpl2 = NodeKind.m22586constructorimpl(1024);
                if (!focusTargetNode.getNode().getIsAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node parent2 = focusTargetNode.getNode().getParent();
                LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
                loop4: while (true) {
                    if (layoutNodeRequireLayoutNode2 == null) {
                        break;
                    }
                    if ((layoutNodeRequireLayoutNode2.getNodes().getHead().getAggregateChildKindSet() & iM22586constructorimpl2) != 0) {
                        while (parent2 != null) {
                            if ((parent2.getKindSet() & iM22586constructorimpl2) != 0) {
                                Modifier.Node nodePop2 = parent2;
                                MutableVector mutableVector2 = null;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof FocusTargetNode) {
                                        node = nodePop2;
                                        break loop4;
                                    }
                                    if ((nodePop2.getKindSet() & iM22586constructorimpl2) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                        int i12 = 0;
                                        for (Modifier.Node delegate2 = ((DelegatingNode) nodePop2).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                                            if ((delegate2.getKindSet() & iM22586constructorimpl2) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    nodePop2 = delegate2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector2.add(nodePop2);
                                                        nodePop2 = null;
                                                    }
                                                    mutableVector2.add(delegate2);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            parent2 = parent2.getParent();
                        }
                    }
                    layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                    parent2 = (layoutNodeRequireLayoutNode2 == null || (nodes = layoutNodeRequireLayoutNode2.getNodes()) == null) ? null : nodes.getTail();
                }
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) node;
                if (focusTargetNode3 == null && requestFocusForOwner(focusTargetNode)) {
                    boolean zGrantFocus2 = grantFocus(focusTargetNode2);
                    if (zGrantFocus2) {
                        focusTargetNode.setFocusState(FocusStateImpl.ActiveParent);
                    }
                    return zGrantFocus2;
                }
                if (focusTargetNode3 == null || !requestFocusForChild(focusTargetNode3, focusTargetNode)) {
                    return false;
                }
                boolean zRequestFocusForChild = requestFocusForChild(focusTargetNode, focusTargetNode2);
                if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (zRequestFocusForChild) {
                    focusTargetNode3.dispatchFocusCallbacks$ui_release();
                }
                return zRequestFocusForChild;
            }
            requireActiveChild(focusTargetNode);
            if (clearChildFocus$default(focusTargetNode, false, false, 3, null) && grantFocus(focusTargetNode2)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean requestFocusForOwner(FocusTargetNode focusTargetNode) {
        return DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().mo20638requestFocusForOwner7o62pno(null, null);
    }

    private static final FocusTargetNode requireActiveChild(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild != null) {
            return activeChild;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
