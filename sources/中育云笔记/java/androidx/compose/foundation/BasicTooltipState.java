package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import p309qc.C10786q;
import vc.InterfaceC11588c;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface BasicTooltipState {
    static /* synthetic */ Object show$default(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return basicTooltipState.show(mutatePriority, interfaceC11588c);
    }

    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    Object show(MutatePriority mutatePriority, InterfaceC11588c<? super C10786q> interfaceC11588c);
}
