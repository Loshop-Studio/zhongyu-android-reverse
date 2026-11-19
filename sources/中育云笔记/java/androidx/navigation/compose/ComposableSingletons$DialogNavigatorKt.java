package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ComposableSingletons$DialogNavigatorKt {
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();

    /* renamed from: lambda$-1092249270, reason: not valid java name */
    private static InterfaceC9545q f28507lambda$1092249270 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, new InterfaceC9545q() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda$-1092249270$1
        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C10786q.f26013a;
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
    public final InterfaceC9545q m33800getLambda$1092249270$navigation_compose_release() {
        return f28507lambda$1092249270;
    }
}
