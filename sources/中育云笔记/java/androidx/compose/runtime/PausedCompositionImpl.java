package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 8;
    private final Applier<?> applier;
    private final ComposerImpl composer;
    private final CompositionImpl composition;
    private final InterfaceC9544p content;
    private final CompositionContext context;
    private final Object lock;
    private final RecordingApplier<Object> pausableApplier;
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;
    private PausedCompositionState state = PausedCompositionState.InitialPending;
    private ScatterSet<RecomposeScopeImpl> invalidScopes = ScatterSetKt.emptyScatterSet();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PausedCompositionImpl(CompositionImpl compositionImpl, CompositionContext compositionContext, ComposerImpl composerImpl, Set<RememberObserver> set, InterfaceC9544p interfaceC9544p, boolean z10, Applier<?> applier, Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = composerImpl;
        this.content = interfaceC9544p;
        this.reusable = z10;
        this.applier = applier;
        this.lock = obj;
        this.rememberManager = new RememberEventDispatcher(set);
        this.pausableApplier = new RecordingApplier<>(applier.getCurrent());
    }

    private final void applyChanges() {
        synchronized (this.lock) {
            try {
                RecordingApplier<Object> recordingApplier = this.pausableApplier;
                Applier<?> applier = this.applier;
                AbstractC9979u.m20292e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                recordingApplier.playTo(applier);
                this.rememberManager.dispatchRememberObservers();
                this.rememberManager.dispatchSideEffects();
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime_release();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime_release();
                throw th;
            }
        }
    }

    private final void markComplete() {
        this.state = PausedCompositionState.ApplyPending;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void apply() throws Exception {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                case 2:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 3:
                    applyChanges();
                    this.state = PausedCompositionState.Applied;
                    return;
                case 4:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 6:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    return;
            }
        } catch (Exception e10) {
            this.state = PausedCompositionState.Invalid;
            throw e10;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void cancel() {
        this.state = PausedCompositionState.Cancelled;
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime_release();
    }

    public final Applier<?> getApplier() {
        return this.applier;
    }

    public final ComposerImpl getComposer() {
        return this.composer;
    }

    public final CompositionImpl getComposition() {
        return this.composition;
    }

    public final InterfaceC9544p getContent() {
        return this.content;
    }

    public final CompositionContext getContext() {
        return this.context;
    }

    public final Object getLock() {
        return this.lock;
    }

    public final RecordingApplier<Object> getPausableApplier$runtime_release() {
        return this.pausableApplier;
    }

    public final RememberEventDispatcher getRememberManager$runtime_release() {
        return this.rememberManager;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isComplete() {
        return this.state.compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean resume(ShouldPauseCallback shouldPauseCallback) throws Exception {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot();
                    }
                    try {
                        this.invalidScopes = this.context.composeInitialPaused$runtime_release(this.composition, shouldPauseCallback, this.content);
                        this.state = PausedCompositionState.RecomposePending;
                        if (this.invalidScopes.isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } finally {
                        if (this.reusable) {
                            this.composer.endReuseFromRoot();
                        }
                    }
                case 2:
                    ScatterSet<RecomposeScopeImpl> scatterSetRecomposePaused$runtime_release = this.context.recomposePaused$runtime_release(this.composition, shouldPauseCallback, this.invalidScopes);
                    this.invalidScopes = scatterSetRecomposePaused$runtime_release;
                    if (scatterSetRecomposePaused$runtime_release.isEmpty()) {
                        markComplete();
                    }
                    return isComplete();
                case 3:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 4:
                    throw new IllegalStateException("The paused composition has been applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 6:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    return isComplete();
            }
        } catch (Exception e10) {
            this.state = PausedCompositionState.Invalid;
            throw e10;
        }
    }
}
