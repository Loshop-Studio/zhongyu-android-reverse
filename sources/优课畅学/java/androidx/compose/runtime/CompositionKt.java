package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9131s;
import p300x7.InterfaceC10559a;

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
    public static final InterfaceC9100d getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        InterfaceC9100d recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.f17438a : recomposeContext;
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    public static final <R> R pausable(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, InterfaceC10559a interfaceC10559a) {
        ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
        try {
            return (R) interfaceC10559a.invoke();
        } finally {
            AbstractC9131s.m16125b(1);
            controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            AbstractC9131s.m16124a(1);
        }
    }

    @ExperimentalComposeApi
    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext, InterfaceC9100d interfaceC9100d) {
        return new CompositionImpl(compositionContext, applier, interfaceC9100d);
    }

    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext, InterfaceC9100d interfaceC9100d) {
        return new CompositionImpl(compositionContext, applier, interfaceC9100d);
    }
}
