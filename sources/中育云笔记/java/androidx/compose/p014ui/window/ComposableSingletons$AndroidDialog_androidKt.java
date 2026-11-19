package androidx.compose.p014ui.window;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class ComposableSingletons$AndroidDialog_androidKt {
    public static final ComposableSingletons$AndroidDialog_androidKt INSTANCE = new ComposableSingletons$AndroidDialog_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static InterfaceC9544p f28505lambda1 = ComposableLambdaKt.composableLambdaInstance(210148896, false, new InterfaceC9544p() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda-1$1
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
                ComposerKt.traceEventStart(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:228)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final InterfaceC9544p m33765getLambda1$ui_release() {
        return f28505lambda1;
    }
}
