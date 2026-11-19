package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

@Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheetKt {

    @NotNull
    public static final ComposableSingletons$ModalBottomSheetKt INSTANCE = new ComposableSingletons$ModalBottomSheetKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static InterfaceC6473e f11630lambda1 = ComposableLambdaKt.composableLambdaInstance(-1524796689, false, new InterfaceC6473e() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1524796689, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda-1.<anonymous> (ModalBottomSheet.kt:128)");
            }
            BottomSheetDefaults.INSTANCE.m8175DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, ProfileVerifier.CompilationStatus.f1352xf2722a21, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static InterfaceC6473e f11631lambda2 = ComposableLambdaKt.composableLambdaInstance(2066864887, false, new InterfaceC6473e() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt$lambda-2$1
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
                ComposerKt.traceEventStart(2066864887, i, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.lambda-2.<anonymous> (ModalBottomSheet.kt:211)");
            }
            BottomSheetDefaults.INSTANCE.m8175DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, ProfileVerifier.CompilationStatus.f1352xf2722a21, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC6473e m8356getLambda1$material3_release() {
        return f11630lambda1;
    }

    @NotNull
    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final InterfaceC6473e m8357getLambda2$material3_release() {
        return f11631lambda2;
    }
}
