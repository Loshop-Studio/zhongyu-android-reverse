package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9977s;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class CompositionKt {
    private static final Object PendingApplyNoModifications = new Object();
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ReusableComposition ReusableComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    public static final <T> T getCompositionService(Composition composition, CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @ExperimentalComposeApi
    public static final InterfaceC9945d getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        InterfaceC9945d recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.f23351c : recomposeContext;
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    public static final <R> R pausable(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, InterfaceC9529a interfaceC9529a) {
        ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
        try {
            return (R) interfaceC9529a.invoke();
        } finally {
            AbstractC9977s.m20286b(1);
            controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            AbstractC9977s.m20285a(1);
        }
    }

    @ExperimentalComposeApi
    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext, InterfaceC9945d interfaceC9945d) {
        return new CompositionImpl(compositionContext, applier, interfaceC9945d);
    }

    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext, InterfaceC9945d interfaceC9945d) {
        return new CompositionImpl(compositionContext, applier, interfaceC9945d);
    }
}
