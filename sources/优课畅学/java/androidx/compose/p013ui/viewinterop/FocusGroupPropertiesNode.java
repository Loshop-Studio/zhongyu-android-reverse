package androidx.compose.p013ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusEnterExitScope;
import androidx.compose.p013ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.p013ui.focus.FocusOwner;
import androidx.compose.p013ui.focus.FocusProperties;
import androidx.compose.p013ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p013ui.focus.FocusTargetNode;
import androidx.compose.p013ui.focus.FocusTransactionManager;
import androidx.compose.p013ui.focus.FocusTransactionsKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import androidx.compose.p013ui.node.DelegatingNode;
import androidx.compose.p013ui.node.NodeKind;
import androidx.compose.p013ui.node.Owner;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class FocusGroupPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode, ViewTreeObserver.OnGlobalFocusChangeListener {
    private ViewTreeObserver attachedViewTreeObserver;
    private View focusedChild;
    private final InterfaceC10570l onEnter = new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return C8736p.f16368a;
        }

        public final void invoke(FocusEnterExitScope focusEnterExitScope) {
            View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this.this$0);
            if (embeddedView.isFocused() || embeddedView.hasFocus()) {
                return;
            }
            if (FocusInteropUtils_androidKt.requestInteropFocus(embeddedView, FocusInteropUtils_androidKt.m23924toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo23908getRequestedFocusDirectiondhqQ8s()), FocusGroupNode_androidKt.getCurrentlyFocusedRect(DelegatableNodeKt.requireOwner(this.this$0).getFocusOwner(), DelegatableNode_androidKt.requireView(this.this$0), embeddedView))) {
                return;
            }
            focusEnterExitScope.cancelFocusChange();
        }
    };
    private final InterfaceC10570l onExit = new InterfaceC10570l() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusEnterExitScope) obj);
            return C8736p.f16368a;
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
                Integer numM23924toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m23924toAndroidFocusDirection3ESFkO8(focusEnterExitScope.mo23908getRequestedFocusDirectiondhqQ8s());
                int iIntValue = numM23924toAndroidFocusDirection3ESFkO8 != null ? numM23924toAndroidFocusDirection3ESFkO8.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                FocusGroupPropertiesNode focusGroupPropertiesNode = this.this$0;
                if (focusGroupPropertiesNode.getFocusedChild() != null) {
                    AbstractC9133u.m16131e(viewRequireView, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewFindNextFocusFromRect = focusFinder.findNextFocus((ViewGroup) viewRequireView, focusGroupPropertiesNode.getFocusedChild(), iIntValue);
                } else {
                    AbstractC9133u.m16131e(viewRequireView, "null cannot be cast to non-null type android.view.ViewGroup");
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
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(1024);
        if (!getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = getNode();
        if ((node.getAggregateChildKindSet$ui_release() & iM25908constructorimpl) != 0) {
            boolean z10 = false;
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                    Modifier.Node nodePop = child$ui_release;
                    MutableVector mutableVector = null;
                    while (nodePop != null) {
                        if (nodePop instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) nodePop;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((nodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i10 = 0;
                            for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        nodePop = delegate$ui_release;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                        }
                                        if (nodePop != null) {
                                            mutableVector.add(nodePop);
                                            nodePop = null;
                                        }
                                        mutableVector.add(delegate$ui_release);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(mutableVector);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // androidx.compose.p013ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    public final ViewTreeObserver getAttachedViewTreeObserver() {
        return this.attachedViewTreeObserver;
    }

    public final View getFocusedChild() {
        return this.focusedChild;
    }

    public final InterfaceC10570l getOnEnter() {
        return this.onEnter;
    }

    public final InterfaceC10570l getOnExit() {
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
    public void onGlobalFocusChanged(View view, View view2) {
        if (DelegatableNodeKt.requireLayoutNode(this).getOwner$ui_release() == null) {
            return;
        }
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(this).getFocusOwner();
        Owner ownerRequireOwner = DelegatableNodeKt.requireOwner(this);
        boolean z10 = (view == null || AbstractC9133u.m16128b(view, ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(embeddedView, view)) ? false : true;
        boolean z11 = (view2 == null || AbstractC9133u.m16128b(view2, ownerRequireOwner) || !FocusGroupNode_androidKt.containsDescendant(embeddedView, view2)) ? false : true;
        if (z10 && z11) {
            this.focusedChild = view2;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.focusedChild = null;
                return;
            }
            this.focusedChild = null;
            if (getFocusTargetOfEmbeddedViewWrapper().getFocusState().isFocused()) {
                focusOwner.mo23929clearFocusI7lrPNg(false, true, false, FocusDirection.Companion.m23918getExitdhqQ8s());
                return;
            }
            return;
        }
        this.focusedChild = view2;
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

    public final void setAttachedViewTreeObserver(ViewTreeObserver viewTreeObserver) {
        this.attachedViewTreeObserver = viewTreeObserver;
    }

    public final void setFocusedChild(View view) {
        this.focusedChild = view;
    }
}
