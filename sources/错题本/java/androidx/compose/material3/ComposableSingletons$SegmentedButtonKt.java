package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComposableSingletons$SegmentedButtonKt {

    @NotNull
    public static final ComposableSingletons$SegmentedButtonKt INSTANCE = new ComposableSingletons$SegmentedButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static InterfaceC6473e f11640lambda1 = ComposableLambdaKt.composableLambdaInstance(-860995255, false, new InterfaceC6473e() { // from class: androidx.compose.material3.ComposableSingletons$SegmentedButtonKt$lambda-1$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C5443s.f8405a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-860995255, i, -1, "androidx.compose.material3.ComposableSingletons$SegmentedButtonKt.lambda-1.<anonymous> (SegmentedButton.kt:564)");
            }
            SegmentedButtonDefaults.INSTANCE.ActiveIcon(composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC6473e m8366getLambda1$material3_release() {
        return f11640lambda1;
    }
}
