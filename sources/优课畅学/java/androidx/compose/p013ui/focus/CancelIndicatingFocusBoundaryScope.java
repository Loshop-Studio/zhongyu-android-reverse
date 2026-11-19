package androidx.compose.p013ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {
    public static final int $stable = 8;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i10, AbstractC9126n abstractC9126n) {
        this(i10);
    }

    @Override // androidx.compose.p013ui.focus.FocusEnterExitScope
    public void cancelFocusChange() {
        this.isCanceled = true;
    }

    @Override // androidx.compose.p013ui.focus.FocusEnterExitScope
    /* renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name */
    public int mo23908getRequestedFocusDirectiondhqQ8s() {
        return this.requestedFocusDirection;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    private CancelIndicatingFocusBoundaryScope(int i10) {
        this.requestedFocusDirection = i10;
    }
}
