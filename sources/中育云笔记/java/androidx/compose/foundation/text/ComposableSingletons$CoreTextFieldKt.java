package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;

/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static InterfaceC9545q f28447lambda1 = ComposableLambdaKt.composableLambdaInstance(-813639903, false, new InterfaceC9545q() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // p181hd.InterfaceC9545q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC9544p) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C10786q.f26013a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(InterfaceC9544p interfaceC9544p, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.changedInstance(interfaceC9544p) ? 4 : 2;
            }
            if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-813639903, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:202)");
            }
            interfaceC9544p.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final InterfaceC9545q m27790getLambda1$foundation_release() {
        return f28447lambda1;
    }
}
