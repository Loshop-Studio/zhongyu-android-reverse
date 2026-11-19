package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$SearchBar_androidKt {
    public static final ComposableSingletons$SearchBar_androidKt INSTANCE = new ComposableSingletons$SearchBar_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static InterfaceC9544p f28486lambda1 = ComposableLambdaKt.composableLambdaInstance(159817819, false, new InterfaceC9544p() { // from class: androidx.compose.material3.ComposableSingletons$SearchBar_androidKt$lambda-1$1
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
                ComposerKt.traceEventStart(159817819, i10, -1, "androidx.compose.material3.ComposableSingletons$SearchBar_androidKt.lambda-1.<anonymous> (SearchBar.android.kt:560)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static InterfaceC9544p f28487lambda2 = ComposableLambdaKt.composableLambdaInstance(-480309201, false, new InterfaceC9544p() { // from class: androidx.compose.material3.ComposableSingletons$SearchBar_androidKt$lambda-2$1
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
                ComposerKt.traceEventStart(-480309201, i10, -1, "androidx.compose.material3.ComposableSingletons$SearchBar_androidKt.lambda-2.<anonymous> (SearchBar.android.kt:899)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$material3_release, reason: not valid java name */
    public final InterfaceC9544p m28560getLambda1$material3_release() {
        return f28486lambda1;
    }

    /* renamed from: getLambda-2$material3_release, reason: not valid java name */
    public final InterfaceC9544p m28561getLambda2$material3_release() {
        return f28487lambda2;
    }
}
