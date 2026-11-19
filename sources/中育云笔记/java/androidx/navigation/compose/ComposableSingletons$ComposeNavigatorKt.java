package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ComposableSingletons$ComposeNavigatorKt {
    public static final ComposableSingletons$ComposeNavigatorKt INSTANCE = new ComposableSingletons$ComposeNavigatorKt();
    private static InterfaceC9546r lambda$127448943 = ComposableLambdaKt.composableLambdaInstance(127448943, false, new InterfaceC9546r() { // from class: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda$127448943$1
        @Override // p181hd.InterfaceC9546r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127448943, i10, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda$127448943.<anonymous> (ComposeNavigator.kt:61)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final InterfaceC9546r getLambda$127448943$navigation_compose_release() {
        return lambda$127448943;
    }
}
