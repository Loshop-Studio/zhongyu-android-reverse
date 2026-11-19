package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusEventModifierNode;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {
    private final InterfaceC8724d composeImm$delegate = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$composeImm$2
        {
            super(0);
        }

        @Override // p300x7.InterfaceC10559a
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(this.this$0));
        }
    });
    private FocusState focusState;

    @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1", m17801f = "HandwritingHandler.android.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$onFocusEvent$1 */
    public static final class C17341 extends SuspendLambda implements InterfaceC10574p {
        int label;

        public C17341(InterfaceC9324c<? super C17341> interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return HandwritingHandlerNode.this.new C17341(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C17341) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            HandwritingHandlerNode.this.getComposeImm().acceptStylusHandwritingDelegation();
            return C8736p.f16368a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (AbstractC9133u.m16128b(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        if (focusState.getHasFocus()) {
            AbstractC8839h.m14861d(getCoroutineScope(), null, null, new C17341(null), 3, null);
        }
    }
}
