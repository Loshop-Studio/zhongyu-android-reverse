package androidx.compose.runtime;

import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public interface RememberManager {
    void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12);

    void endResumingScope(RecomposeScopeImpl recomposeScopeImpl);

    void forgetting(RememberObserverHolder rememberObserverHolder, int i10, int i11, int i12);

    void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12);

    void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl);

    void remembering(RememberObserverHolder rememberObserverHolder);

    void sideEffect(InterfaceC10559a interfaceC10559a);

    void startResumingScope(RecomposeScopeImpl recomposeScopeImpl);
}
