package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface BasicTooltipState {
    static /* synthetic */ Object show$default(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return basicTooltipState.show(mutatePriority, interfaceC9324c);
    }

    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    Object show(MutatePriority mutatePriority, InterfaceC9324c<? super C8736p> interfaceC9324c);
}
