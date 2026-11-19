package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import p309qc.C10786q;
import vc.InterfaceC11588c;

@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public interface TooltipState {
    static /* synthetic */ Object show$default(TooltipState tooltipState, MutatePriority mutatePriority, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return tooltipState.show(mutatePriority, interfaceC11588c);
    }

    void dismiss();

    MutableTransitionState<Boolean> getTransition();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    Object show(MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
