package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6474f;

@Metadata(m5111k = 3, m5112mv = {2, 0, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ComposableSingletons$DialogNavigatorKt {

    @NotNull
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();

    /* renamed from: lambda$-1092249270, reason: not valid java name */
    @NotNull
    private static InterfaceC6474f f11659lambda$1092249270 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, new InterfaceC6474f() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda$-1092249270$1
        @Override // p152r6.InterfaceC6474f
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((NavBackStackEntry) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C5443s.f8405a;
        }

        @Composable
        public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092249270, i, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda$-1092249270.<anonymous> (DialogNavigator.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda$-1092249270$navigation_compose_release, reason: not valid java name */
    public final InterfaceC6474f m13592getLambda$1092249270$navigation_compose_release() {
        return f11659lambda$1092249270;
    }
}
