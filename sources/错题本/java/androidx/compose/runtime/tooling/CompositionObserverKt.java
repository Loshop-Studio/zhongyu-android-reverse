package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0006H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0007¨\u0006\t"}, m5110d2 = {"observe", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "Landroidx/compose/runtime/Composition;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CompositionObserverKt {
    @ExperimentalComposeRuntimeApi
    @NotNull
    public static final CompositionObserverHandle observe(@NotNull Recomposer recomposer, @NotNull CompositionRegistrationObserver compositionRegistrationObserver) {
        return recomposer.addCompositionRegistrationObserver$runtime_release(compositionRegistrationObserver);
    }

    @ExperimentalComposeRuntimeApi
    @Nullable
    public static final CompositionObserverHandle observe(@NotNull Composition composition, @NotNull CompositionObserver compositionObserver) {
        CompositionImpl compositionImpl = (CompositionImpl) CompositionKt.getCompositionService(composition, CompositionKt.getCompositionImplServiceKey());
        if (compositionImpl != null) {
            return compositionImpl.observe$runtime_release(compositionObserver);
        }
        return null;
    }

    @ExperimentalComposeRuntimeApi
    @NotNull
    public static final CompositionObserverHandle observe(@NotNull RecomposeScope recomposeScope, @NotNull RecomposeScopeObserver recomposeScopeObserver) {
        AbstractC5830k.m5328e(recomposeScope, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
        return ((RecomposeScopeImpl) recomposeScope).observe$runtime_release(recomposeScopeObserver);
    }
}
