package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH ¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH ¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0010H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0010H ¢\u0006\u0004\b\u001f\u0010\u001aJ\u001d\u0010&\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0010¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020'H\u0010¢\u0006\u0004\b,\u0010*J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b.\u0010\u001dJ\u0017\u00101\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b0\u0010\u001dJ\u000f\u00105\u001a\u000202H\u0010¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u00020\u0007H\u0010¢\u0006\u0004\b6\u0010\u0003J\u000f\u00109\u001a\u00020\u0007H\u0010¢\u0006\u0004\b8\u0010\u0003J\u0017\u0010>\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H ¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:H ¢\u0006\u0004\b?\u0010=J+\u0010G\u001a\u00020\u00072\u0006\u0010;\u001a\u00020:2\u0006\u0010B\u001a\u00020A2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030CH ¢\u0006\u0004\bE\u0010FJ\u0019\u0010J\u001a\u0004\u0018\u00010A2\u0006\u0010;\u001a\u00020:H\u0010¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\bK\u0010\u001dR\u0014\u0010P\u001a\u00020M8 X \u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8 X \u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020Q8 X \u0004¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0014\u0010X\u001a\u00020Q8 X \u0004¢\u0006\u0006\u001a\u0004\bW\u0010SR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020]8 X \u0004¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0016\u0010\u0005\u001a\u0004\u0018\u00010c8 X \u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006f"}, m5110d2 = {"Landroidx/compose/runtime/CompositionContext;", "", "<init>", "()V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lr6/e;)V", "composeInitial", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "composeInitialPaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Lr6/e;)Landroidx/collection/ScatterSet;", "composeInitialPaused", "invalidScopes", "recomposePaused$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ShouldPauseCallback;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "recomposePaused", "scope", "reportPausedScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "invalidate$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "invalidate", "invalidateScope$runtime_release", "invalidateScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime_release", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime_release", "unregisterComposer", "registerComposition$runtime_release", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime_release", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "startComposing$runtime_release", "startComposing", "doneComposing$runtime_release", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", TypedValues.Custom.S_REFERENCE, "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "", "getCollectingParameterInformation$runtime_release", "()Z", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Lh6/h;", "getEffectCoroutineContext", "()Lh6/h;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime_release", "recomposeCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime_release", "()Landroidx/compose/runtime/Composition;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull InterfaceC6473e content);

    @NotNull
    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull InterfaceC6473e content);

    public abstract void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingCallByInformation$runtime_release();

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    @Nullable
    public abstract Composition getComposition$runtime_release();

    @NotNull
    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }

    public abstract int getCompoundHashKey$runtime_release();

    @NotNull
    public abstract InterfaceC5636h getEffectCoroutineContext();

    @Nullable
    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    @NotNull
    public abstract InterfaceC5636h getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference);

    public abstract void invalidate$runtime_release(@NotNull ControlledComposition composition);

    public abstract void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope);

    public abstract void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data, @NotNull Applier<?> applier);

    @Nullable
    public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
        return null;
    }

    @NotNull
    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(@NotNull ControlledComposition composition, @NotNull ShouldPauseCallback shouldPause, @NotNull ScatterSet<RecomposeScopeImpl> invalidScopes);

    public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
    }

    public void registerComposer$runtime_release(@NotNull Composer composer) {
    }

    public abstract void registerComposition$runtime_release(@NotNull ControlledComposition composition);

    public abstract void reportPausedScope$runtime_release(@NotNull RecomposeScopeImpl scope);

    public abstract void reportRemovedComposition$runtime_release(@NotNull ControlledComposition composition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(@NotNull Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(@NotNull ControlledComposition composition);
}
