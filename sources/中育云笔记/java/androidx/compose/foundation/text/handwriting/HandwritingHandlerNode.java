package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.focus.FocusEventModifierNode;
import androidx.compose.p014ui.focus.FocusState;
import androidx.compose.p014ui.node.DelegatableNode_androidKt;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10773d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {
    private final InterfaceC10773d composeImm$delegate = AbstractC9923a.m20069b(LazyThreadSafetyMode.f23258e, new InterfaceC9529a() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$composeImm$2
        {
            super(0);
        }

        @Override // p181hd.InterfaceC9529a
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.this$0));
        }
    });
    private FocusState focusState;

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", m26211f = "HandwritingHandler.android.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1 */
    public static final class C17641 extends SuspendLambda implements InterfaceC9544p {
        int label;

        public C17641(InterfaceC11588c<? super C17641> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return HandwritingHandlerNode.this.new C17641(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            HandwritingHandlerNode.this.getComposeImm().acceptStylusHandwritingDelegation();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C17641) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (AbstractC9979u.m20289b(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        if (focusState.getHasFocus()) {
            AbstractC11117h.m24726d(getCoroutineScope(), null, null, new C17641(null), 3, null);
        }
    }
}
