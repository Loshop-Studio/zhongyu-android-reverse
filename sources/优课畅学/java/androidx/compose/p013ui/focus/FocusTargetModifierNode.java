package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.node.DelegatableNode;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public interface FocusTargetModifierNode extends DelegatableNode {
    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    static /* synthetic */ boolean m23945requestFocus3ESFkO8$default(FocusTargetModifierNode focusTargetModifierNode, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i11 & 1) != 0) {
            i10 = FocusDirection.Companion.m23917getEnterdhqQ8s();
        }
        return focusTargetModifierNode.mo23947requestFocus3ESFkO8(i10);
    }

    FocusState getFocusState();

    /* renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo23946getFocusabilityLCbbffg();

    @InterfaceC8721a
    /* synthetic */ boolean requestFocus();

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo23947requestFocus3ESFkO8(int i10);

    /* renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo23948setFocusabilityjosRg5g(int i10);
}
