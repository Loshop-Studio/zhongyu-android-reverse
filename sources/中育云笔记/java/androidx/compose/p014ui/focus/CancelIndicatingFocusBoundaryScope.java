package androidx.compose.p014ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {
    public static final int $stable = 8;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i10, AbstractC9972n abstractC9972n) {
        this(i10);
    }

    @Override // androidx.compose.p014ui.focus.FocusEnterExitScope
    public void cancelFocusChange() {
        this.isCanceled = true;
    }

    @Override // androidx.compose.p014ui.focus.FocusEnterExitScope
    /* renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name */
    public int mo30510getRequestedFocusDirectiondhqQ8s() {
        return this.requestedFocusDirection;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    private CancelIndicatingFocusBoundaryScope(int i10) {
        this.requestedFocusDirection = i10;
    }
}
