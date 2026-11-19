package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RememberObserverHolder {
    public static final int $stable = 8;
    private Anchor after;
    private RememberObserver wrapped;

    public RememberObserverHolder(RememberObserver rememberObserver, Anchor anchor) {
        this.wrapped = rememberObserver;
        this.after = anchor;
    }

    public final Anchor getAfter() {
        return this.after;
    }

    public final RememberObserver getWrapped() {
        return this.wrapped;
    }

    public final void setAfter(Anchor anchor) {
        this.after = anchor;
    }

    public final void setWrapped(RememberObserver rememberObserver) {
        this.wrapped = rememberObserver;
    }
}
