package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static InterfaceC9544p f28466lambda1 = ComposableLambdaKt.composableLambdaInstance(-927355320, false, new InterfaceC9544p() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda-1$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C10786q.f26013a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-927355320, i10, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:120)");
            }
            BottomSheetDefaults.INSTANCE.m28371DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer, ProfileVerifier.CompilationStatus.f1974xf2722a21, 31);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static InterfaceC9545q f28467lambda2 = ComposableLambdaKt.composableLambdaInstance(923568898, false, new InterfaceC9545q() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda-2$1
        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((SnackbarHostState) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C10786q.f26013a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(SnackbarHostState snackbarHostState, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.changed(snackbarHostState) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(923568898, i10, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:123)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i10 & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static InterfaceC9544p f28468lambda3 = ComposableLambdaKt.composableLambdaInstance(1800698411, false, new InterfaceC9544p() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda-3$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800698411, i10, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda-3.<anonymous> (BottomSheetScaffold.kt:358)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC9544p m28540getLambda1$material3_release() {
        return f28466lambda1;
    }

    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final InterfaceC9545q m28541getLambda2$material3_release() {
        return f28467lambda2;
    }

    /* renamed from: getLambda-3$material3_release, reason: not valid java name */
    public final InterfaceC9544p m28542getLambda3$material3_release() {
        return f28468lambda3;
    }
}
