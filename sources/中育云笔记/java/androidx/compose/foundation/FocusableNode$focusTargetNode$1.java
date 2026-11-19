package androidx.compose.foundation;

import androidx.compose.p014ui.focus.FocusState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes.dex */
public /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements InterfaceC9544p {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // p181hd.InterfaceC9544p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((FocusState) obj, (FocusState) obj2);
        return C10786q.f26013a;
    }

    public final void invoke(FocusState focusState, FocusState focusState2) {
        ((FocusableNode) this.receiver).onFocusStateChange(focusState, focusState2);
    }
}
