package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class CompositionObserverKt {
    @ExperimentalComposeRuntimeApi
    public static final CompositionObserverHandle observe(Recomposer recomposer, CompositionRegistrationObserver compositionRegistrationObserver) {
        return recomposer.addCompositionRegistrationObserver$runtime_release(compositionRegistrationObserver);
    }

    @ExperimentalComposeRuntimeApi
    public static final CompositionObserverHandle observe(Composition composition, CompositionObserver compositionObserver) {
        CompositionImpl compositionImpl = (CompositionImpl) CompositionKt.getCompositionService(composition, CompositionKt.getCompositionImplServiceKey());
        if (compositionImpl != null) {
            return compositionImpl.observe$runtime_release(compositionObserver);
        }
        return null;
    }

    @ExperimentalComposeRuntimeApi
    public static final CompositionObserverHandle observe(RecomposeScope recomposeScope, RecomposeScopeObserver recomposeScopeObserver) {
        AbstractC9979u.m20292e(recomposeScope, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((RecomposeScopeImpl) recomposeScope).observe$runtime_release(recomposeScopeObserver);
    }
}
