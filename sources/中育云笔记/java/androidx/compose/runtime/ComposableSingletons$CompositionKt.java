package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$CompositionKt {
    public static final ComposableSingletons$CompositionKt INSTANCE = new ComposableSingletons$CompositionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static InterfaceC9544p f28500lambda1 = ComposableLambdaKt.composableLambdaInstance(954879418, false, new InterfaceC9544p() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-1$1
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
                ComposerKt.traceEventStart(954879418, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-1.<anonymous> (Composition.kt:600)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    private static InterfaceC9544p f28501lambda2 = ComposableLambdaKt.composableLambdaInstance(1918065384, false, new InterfaceC9544p() { // from class: androidx.compose.runtime.ComposableSingletons$CompositionKt$lambda-2$1
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
                ComposerKt.traceEventStart(1918065384, i10, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:815)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final InterfaceC9544p m30232getLambda1$runtime_release() {
        return f28500lambda1;
    }

    /* renamed from: getLambda-2$runtime_release, reason: not valid java name */
    public final InterfaceC9544p m30233getLambda2$runtime_release() {
        return f28501lambda2;
    }
}
