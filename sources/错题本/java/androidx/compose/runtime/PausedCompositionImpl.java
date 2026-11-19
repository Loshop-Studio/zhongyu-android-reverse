package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011\u0012\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\"\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u001b\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00100\u001a\u0004\b1\u00102R\u001b\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\"\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010/¨\u0006H"}, m5110d2 = {"Landroidx/compose/runtime/PausedCompositionImpl;", "Landroidx/compose/runtime/PausedComposition;", "Landroidx/compose/runtime/CompositionImpl;", "composition", "Landroidx/compose/runtime/CompositionContext;", "context", "Landroidx/compose/runtime/ComposerImpl;", "composer", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "", "reusable", "Landroidx/compose/runtime/Applier;", "applier", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "lock", "<init>", "(Landroidx/compose/runtime/CompositionImpl;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/ComposerImpl;Ljava/util/Set;Lr6/e;ZLandroidx/compose/runtime/Applier;Ljava/lang/Object;)V", "markComplete", "()V", "applyChanges", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "resume", "(Landroidx/compose/runtime/ShouldPauseCallback;)Z", "apply", "cancel", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/CompositionContext;", "getContext", "()Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/ComposerImpl;", "getComposer", "()Landroidx/compose/runtime/ComposerImpl;", "Lr6/e;", "getContent", "()Lr6/e;", "Z", "getReusable", "()Z", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Ljava/lang/Object;", "getLock", "()Ljava/lang/Object;", "Landroidx/compose/runtime/PausedCompositionState;", "state", "Landroidx/compose/runtime/PausedCompositionState;", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidScopes", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "rememberManager", "Landroidx/compose/runtime/internal/RememberEventDispatcher;", "getRememberManager$runtime_release", "()Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RecordingApplier;", "pausableApplier", "Landroidx/compose/runtime/RecordingApplier;", "getPausableApplier$runtime_release", "()Landroidx/compose/runtime/RecordingApplier;", "isComplete", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/PausedCompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,392:1\n33#2,2:393\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/PausedCompositionImpl\n*L\n247#1:393,2\n*E\n"})
/* loaded from: classes.dex */
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 8;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private final ComposerImpl composer;

    @NotNull
    private final CompositionImpl composition;

    @NotNull
    private final InterfaceC6473e content;

    @NotNull
    private final CompositionContext context;

    @NotNull
    private final Object lock;

    @NotNull
    private final RecordingApplier<Object> pausableApplier;

    @NotNull
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;

    @NotNull
    private PausedCompositionState state = PausedCompositionState.InitialPending;

    @NotNull
    private ScatterSet<RecomposeScopeImpl> invalidScopes = ScatterSetKt.emptyScatterSet();

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public PausedCompositionImpl(@NotNull CompositionImpl compositionImpl, @NotNull CompositionContext compositionContext, @NotNull ComposerImpl composerImpl, @NotNull Set<RememberObserver> set, @NotNull InterfaceC6473e interfaceC6473e, boolean z8, @NotNull Applier<?> applier, @NotNull Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = composerImpl;
        this.content = interfaceC6473e;
        this.reusable = z8;
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
                AbstractC5830k.m5328e(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                recordingApplier.playTo(applier);
                this.rememberManager.dispatchRememberObservers();
                this.rememberManager.dispatchSideEffects();
            } finally {
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime_release();
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
        } catch (Exception e) {
            this.state = PausedCompositionState.Invalid;
            throw e;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void cancel() {
        this.state = PausedCompositionState.Cancelled;
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime_release();
    }

    @NotNull
    public final Applier<?> getApplier() {
        return this.applier;
    }

    @NotNull
    public final ComposerImpl getComposer() {
        return this.composer;
    }

    @NotNull
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    @NotNull
    public final InterfaceC6473e getContent() {
        return this.content;
    }

    @NotNull
    public final CompositionContext getContext() {
        return this.context;
    }

    @NotNull
    public final Object getLock() {
        return this.lock;
    }

    @NotNull
    public final RecordingApplier<Object> getPausableApplier$runtime_release() {
        return this.pausableApplier;
    }

    @NotNull
    /* renamed from: getRememberManager$runtime_release, reason: from getter */
    public final RememberEventDispatcher getRememberManager() {
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
    public boolean resume(@NotNull ShouldPauseCallback shouldPause) throws Exception {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot();
                    }
                    try {
                        this.invalidScopes = this.context.composeInitialPaused$runtime_release(this.composition, shouldPause, this.content);
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
                    ScatterSet<RecomposeScopeImpl> scatterSetRecomposePaused$runtime_release = this.context.recomposePaused$runtime_release(this.composition, shouldPause, this.invalidScopes);
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
        } catch (Exception e) {
            this.state = PausedCompositionState.Invalid;
            throw e;
        }
    }
}
