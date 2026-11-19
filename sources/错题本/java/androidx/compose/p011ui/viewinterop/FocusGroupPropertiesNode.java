package androidx.compose.p011ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusEnterExitScope;
import androidx.compose.p011ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.p011ui.focus.FocusOwner;
import androidx.compose.p011ui.focus.FocusProperties;
import androidx.compose.p011ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p011ui.focus.FocusTargetNode;
import androidx.compose.p011ui.focus.FocusTransactionManager;
import androidx.compose.p011ui.focus.FocusTransactionsKt;
import androidx.compose.p011ui.internal.InlineClassHelperKt;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.node.DelegatableNode_androidKt;
import androidx.compose.p011ui.node.DelegatingNode;
import androidx.compose.p011ui.node.NodeKind;
import androidx.compose.p011ui.node.Owner;
import androidx.compose.runtime.collection.MutableVector;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0005R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010%\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0002\b$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010)\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0002\b$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(¨\u0006+"}, m5110d2 = {"Landroidx/compose/ui/viewinterop/FocusGroupPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTargetOfEmbeddedViewWrapper", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "Ld6/s;", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "onAttach", "onDetach", "focusedChild", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "(Landroid/view/View;)V", "Landroid/view/ViewTreeObserver;", "attachedViewTreeObserver", "Landroid/view/ViewTreeObserver;", "getAttachedViewTreeObserver", "()Landroid/view/ViewTreeObserver;", "setAttachedViewTreeObserver", "(Landroid/view/ViewTreeObserver;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusEnterExitScope;", "Lkotlin/ExtensionFunctionType;", "onEnter", "Lr6/c;", "getOnEnter", "()Lr6/c;", "onExit", "getOnExit", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nFocusGroupNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n119#2:276\n240#3:277\n202#3,8:278\n210#3,6:291\n437#3,6:297\n447#3,2:304\n449#3,8:309\n457#3,9:320\n466#3,8:332\n217#3,3:340\n56#4,5:286\n246#5:303\n240#6,3:306\n243#6,3:329\n1101#7:317\n1083#7,2:318\n48#8,8:343\n56#8,4:354\n1#9:351\n641#10,2:352\n*S KotlinDebug\n*F\n+ 1 FocusGroupNode.android.kt\nandroidx/compose/ui/viewinterop/FocusGroupPropertiesNode\n*L\n142#1:276\n142#1:277\n142#1:278,8\n142#1:291,6\n142#1:297,6\n142#1:304,2\n142#1:309,8\n142#1:320,9\n142#1:332,8\n142#1:340,3\n142#1:286,5\n142#1:303\n142#1:306,3\n142#1:329,3\n142#1:317\n142#1:318,2\n173#1:343,8\n173#1:354,4\n173#1:351\n173#1:352,2\n*E\n"})
/* loaded from: classes2.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {

    @Nullable
    private ViewTreeObserver attachedViewTreeObserver;

    @Nullable
    private View focusedChild;

    @NotNull
    private final InterfaceC6471c onEnter = new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return C5443s.f8405a;
        }

        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
            if (embeddedView.isFocused() || embeddedView.hasFocus()) {
                return;
            }
            if (FocusInteropUtils_androidKt.requestInteropFocus(embeddedView, FocusInteropUtils_androidKt.m10330toAndroidFocusDirection3ESFkO8(focusEnterExitScope.getRequestedFocusDirection()), FocusGroupNode_androidKt.getCurrentlyFocusedRect(DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner(), DelegatableNode_androidKt.requireView(this.this$0), embeddedView))) {
                return;
            }
            focusEnterExitScope.cancelFocusChange();
        }
    };

    @NotNull
    private final InterfaceC6471c onExit = new InterfaceC6471c() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // p152r6.InterfaceC6471c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return C5443s.f8405a;
        }

        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            View viewFindNextFocusFromRect;
            View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
            if (ComposeUiFlags.isViewFocusFixEnabled) {
                if (embeddedView.hasFocus() || embeddedView.isFocused()) {
                    embeddedView.clearFocus();
                    return;
                }
                return;
            }
            if (embeddedView.hasFocus()) {
                FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner();
                View viewRequireView = DelegatableNode_androidKt.requireView(this.this$0);
                if (!(embeddedView instanceof ViewGroup)) {
                    if (!viewRequireView.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                    return;
                }
                Rect currentlyFocusedRect = FocusGroupNode_androidKt.getCurrentlyFocusedRect(focusOwner, viewRequireView, embeddedView);
                Integer numM10330toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m10330toAndroidFocusDirection3ESFkO8(focusEnterExitScope.getRequestedFocusDirection());
                int iIntValue = numM10330toAndroidFocusDirection3ESFkO8 != null ? numM10330toAndroidFocusDirection3ESFkO8.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
                if (focusGroupPropertiesNode.getFocusedChild() != null) {
                    AbstractC5830k.m5328e(viewRequireView, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewRequireView, focusGroupPropertiesNode.getFocusedChild(), iIntValue);
                } else {
                    AbstractC5830k.m5328e(viewRequireView, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect((ViewGroup) viewRequireView, currentlyFocusedRect, iIntValue);
                }
                if (viewFindNextFocusFromRect == null || !FocusGroupNode_androidKt.containsDescendant(embeddedView, viewFindNextFocusFromRect)) {
                    if (!viewRequireView.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                } else {
                    viewFindNextFocusFromRect.requestFocus(iIntValue, currentlyFocusedRect);
                    focusEnterExitScope.cancelFocusChange();
                }
            }
        }
    };

    private final FocusTargetNode getFocusTargetOfEmbeddedViewWrapper() {
        int iM12314constructorimpl = NodeKind.m12314constructorimpl(1024);
        if (!getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet() & iM12314constructorimpl) != 0) {
            boolean z8 = false;
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM12314constructorimpl) != 0) {
                    Modifier.Node nodePop = child;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                            if (z8) {
                                return focusTargetNode;
                            }
                            z8 = true;
                        } else if ((nodePop.getKindSet() & iM12314constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.p011ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@NotNull FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    @Nullable
    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    @Nullable
    public final View getFocusedChild() {
        return this.focusedChild;
    }

    @NotNull
    public final InterfaceC6471c getOnEnter() {
        return this.onEnter;
    }

    @NotNull
    public final InterfaceC6471c getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        ViewTreeObserver viewTreeObserver = DelegatableNode_androidKt.requireView(this).getViewTreeObserver();
        this.attachedViewTreeObserver = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        ViewTreeObserver viewTreeObserver = this.attachedViewTreeObserver;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.attachedViewTreeObserver = null;
        DelegatableNode_androidKt.requireView(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.focusedChild = null;
        super.onDetach();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View oldFocus, @Nullable View newFocus) {
        if (DelegatableNodeKt.requireLayoutNode(this).getOwner() == null) {
            return;
        }
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        Owner ownerRequireOwner = DelegatableNodeKt.requireOwner(this);
        boolean z8 = (oldFocus == null || oldFocus.equals(ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(embeddedView, oldFocus)) ? false : true;
        boolean z9 = (newFocus == null || newFocus.equals(ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(embeddedView, newFocus)) ? false : true;
        if (z8 && z9) {
            this.focusedChild = newFocus;
            return;
        }
        if (!z9) {
            if (!z8) {
                this.focusedChild = null;
                return;
            }
            this.focusedChild = null;
            if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
                focusOwner.mo10335clearFocusI7lrPNg(false, true, false, FocusDirection.INSTANCE.m10324getExitdhqQ8s());
                return;
            }
            return;
        }
        this.focusedChild = newFocus;
        FocusTargetNode focusTargetOfEmbeddedViewWrapper = getFocusTargetOfEmbeddedViewWrapper();
        if (focusTargetOfEmbeddedViewWrapper.getFocusState().getHasFocus()) {
            return;
        }
        if (ComposeUiFlags.isTrackFocusEnabled) {
            FocusTransactionsKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
            return;
        }
        FocusTransactionManager focusTransactionManager = focusOwner.getFocusTransactionManager();
        try {
            if (focusTransactionManager.getOngoingTransaction()) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            FocusTransactionsKt.performRequestFocus(focusTargetOfEmbeddedViewWrapper);
            focusTransactionManager.commitTransaction();
        } catch (Throwable th) {
            focusTransactionManager.commitTransaction();
            throw th;
        }
    }

    public final void setAttachedViewTreeObserver(@Nullable ViewTreeObserver viewTreeObserver) {
        this.attachedViewTreeObserver = viewTreeObserver;
    }

    public final void setFocusedChild(@Nullable View view) {
        this.focusedChild = view;
    }
}
