package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.Recomposer;

@ExperimentalComposeRuntimeApi
/* loaded from: classes2.dex */
public interface CompositionRegistrationObserver {
    void onCompositionRegistered(Recomposer recomposer, Composition composition);

    void onCompositionUnregistered(Recomposer recomposer, Composition composition);
}
