package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata(m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$DialogNavigatorKt {
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();

    /* renamed from: lambda$-1092249270, reason: not valid java name */
    private static Function3<NavBackStackEntry, Composer, Integer, Unit> f18207lambda$1092249270 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda$-1092249270$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092249270, i10, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda$-1092249270.<anonymous> (DialogNavigator.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1092249270$navigation_compose_release, reason: not valid java name */
    public final Function3<NavBackStackEntry, Composer, Integer, Unit> m24068getLambda$1092249270$navigation_compose_release() {
        return f18207lambda$1092249270;
    }
}
