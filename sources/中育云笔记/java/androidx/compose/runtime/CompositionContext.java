package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(ControlledComposition controlledComposition, InterfaceC9544p interfaceC9544p);

    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, InterfaceC9544p interfaceC9544p);

    public abstract void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingCallByInformation$runtime_release();

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    public abstract Composition getComposition$runtime_release();

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.EmptyPersistentCompositionLocalMap;
    }

    public abstract int getCompoundHashKey$runtime_release();

    public abstract InterfaceC9945d getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    public abstract InterfaceC9945d getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState, Applier<?> applier);

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ScatterSet<RecomposeScopeImpl> scatterSet);

    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    public void registerComposer$runtime_release(Composer composer) {
    }

    public abstract void registerComposition$runtime_release(ControlledComposition controlledComposition);

    public abstract void reportPausedScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(ControlledComposition controlledComposition);
}
