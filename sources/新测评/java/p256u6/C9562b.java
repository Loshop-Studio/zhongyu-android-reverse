package p256u6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: u6.b */
/* loaded from: classes4.dex */
public final class C9562b {

    /* renamed from: a */
    public static final C9562b f16753a = new C9562b();

    /* renamed from: b */
    public static Function2 f16754b = ComposableLambdaKt.composableLambdaInstance(1877801602, false, new Function2() { // from class: u6.a
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C9562b.m15978c((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m15978c(Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1877801602, i10, -1, "com.zykj.evaluation.ui.progress.ComposableSingletons$ProgressPageKt.lambda$1877801602.<anonymous> (ProgressPage.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function2 m15979b() {
        return f16754b;
    }
}
