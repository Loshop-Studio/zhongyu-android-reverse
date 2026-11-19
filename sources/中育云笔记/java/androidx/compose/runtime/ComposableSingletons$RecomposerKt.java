package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$RecomposerKt {
    public static final ComposableSingletons$RecomposerKt INSTANCE = new ComposableSingletons$RecomposerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static InterfaceC9544p f28502lambda1 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, new InterfaceC9544p() { // from class: androidx.compose.runtime.ComposableSingletons$RecomposerKt$lambda-1$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return C10786q.f26013a;
        }

        @Composable
        public final void invoke(Composer composer, int i10) {
            if (!composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1091980426, i10, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda-1.<anonymous> (Recomposer.kt:417)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final InterfaceC9544p m30234getLambda1$runtime_release() {
        return f28502lambda1;
    }
}
