package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static InterfaceC9545q f28489lambda1 = ComposableLambdaKt.composableLambdaInstance(818736383, false, new InterfaceC9545q() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((SnackbarData) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C10786q.f26013a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(SnackbarData snackbarData, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.changed(snackbarData) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(818736383, i11, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
            }
            SnackbarKt.m29135SnackbarsDKtq54(snackbarData, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i11 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC9545q m28563getLambda1$material3_release() {
        return f28489lambda1;
    }
}
