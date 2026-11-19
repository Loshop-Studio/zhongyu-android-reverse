package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p123h7.C8736p;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static InterfaceC10575q f21380lambda1 = ComposableLambdaKt.composableLambdaInstance(-813639903, false, new InterfaceC10575q() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // p300x7.InterfaceC10575q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((InterfaceC10574p) obj, (Composer) obj2, ((Number) obj3).intValue());
            return C8736p.f16368a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(InterfaceC10574p interfaceC10574p, Composer composer, int i10) {
            if ((i10 & 6) == 0) {
                i10 |= composer.changedInstance(interfaceC10574p) ? 4 : 2;
            }
            if (!composer.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-813639903, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:202)");
            }
            interfaceC10574p.invoke(composer, Integer.valueOf(i10 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final InterfaceC10575q m21188getLambda1$foundation_release() {
        return f21380lambda1;
    }
}
