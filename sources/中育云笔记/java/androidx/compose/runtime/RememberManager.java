package androidx.compose.runtime;

import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public interface RememberManager {
    void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12);

    void endResumingScope(RecomposeScopeImpl recomposeScopeImpl);

    void forgetting(RememberObserverHolder rememberObserverHolder, int i10, int i11, int i12);

    void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12);

    void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl);

    void remembering(RememberObserverHolder rememberObserverHolder);

    void sideEffect(InterfaceC9529a interfaceC9529a);

    void startResumingScope(RecomposeScopeImpl recomposeScopeImpl);
}
