package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserver;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
@ExperimentalComposeRuntimeApi
/* loaded from: classes2.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;
    private CompositionObserver observer;
    private boolean root;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositionObserverHolder() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final CompositionObserver getObserver() {
        return this.observer;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setObserver(CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final void setRoot(boolean z10) {
        this.root = z10;
    }

    public CompositionObserverHolder(CompositionObserver compositionObserver, boolean z10) {
        this.observer = compositionObserver;
        this.root = z10;
    }

    public /* synthetic */ CompositionObserverHolder(CompositionObserver compositionObserver, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? null : compositionObserver, (i10 & 2) != 0 ? false : z10);
    }
}
