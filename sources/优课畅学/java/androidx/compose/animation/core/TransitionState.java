package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 2)
/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    public static final int $stable = 0;
    private final MutableState isRunning$delegate;

    public /* synthetic */ TransitionState(AbstractC9126n abstractC9126n) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public abstract void setCurrentState$animation_core_release(S s10);

    public final void setRunning$animation_core_release(boolean z10) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z10));
    }

    public abstract void setTargetState$animation_core_release(S s10);

    public abstract void transitionConfigured$animation_core_release(Transition<S> transition);

    public abstract void transitionRemoved$animation_core_release();

    private TransitionState() {
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }
}
