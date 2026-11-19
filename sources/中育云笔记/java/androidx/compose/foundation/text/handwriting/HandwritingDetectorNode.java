package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.p014ui.input.pointer.PointerEvent;
import androidx.compose.p014ui.input.pointer.PointerEventPass;
import androidx.compose.p014ui.node.DelegatableNode_androidKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
final class HandwritingDetectorNode extends DelegatingNode implements PointerInputModifierNode {
    private InterfaceC9529a callback;
    private final InterfaceC10773d composeImm$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$composeImm$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.this$0));
        }
    });
    private final StylusHandwritingNode pointerInputNode = (StylusHandwritingNode) delegate(new StylusHandwritingNode(new InterfaceC9529a() { // from class: androidx.compose.foundation.text.handwriting.HandwritingDetectorNode$pointerInputNode$1
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27933invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27933invoke() {
            this.this$0.getCallback().invoke();
            this.this$0.getComposeImm().prepareStylusHandwritingDelegation();
        }
    }));

    public HandwritingDetectorNode(InterfaceC9529a interfaceC9529a) {
        this.callback = interfaceC9529a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    public final InterfaceC9529a getCallback() {
        return this.callback;
    }

    public final StylusHandwritingNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public long mo27932getTouchBoundsExpansionRZrCHBk() {
        return this.pointerInputNode.mo27932getTouchBoundsExpansionRZrCHBk();
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.p014ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo26920onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j10) {
        this.pointerInputNode.mo26920onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j10);
    }

    public final void setCallback(InterfaceC9529a interfaceC9529a) {
        this.callback = interfaceC9529a;
    }
}
