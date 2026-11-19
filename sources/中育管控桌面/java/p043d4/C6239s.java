package p043d4;

import androidx.compose.material3.IconKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.manage.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: d4.s */
/* loaded from: classes4.dex */
public final class C6239s {

    /* renamed from: a */
    public static final C6239s f7553a = new C6239s();

    /* renamed from: b */
    public static Function2 f7554b = ComposableLambdaKt.composableLambdaInstance(780481432, false, new Function2() { // from class: d4.r
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C6239s.m6338c((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m6338c(Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780481432, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ComposableSingletons$ChangePasswordDialogContentKt.lambda$780481432.<anonymous> (ChangePasswordDialogContent.kt:91)");
            }
            IconKt.m11809Iconww6aTOc(PainterResources_androidKt.painterResource(R.mipmap.hw_dialog_close, composer, 6), "Close", (Modifier) null, Color.INSTANCE.m13936getWhite0d7_KjU(), composer, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function2 m6339b() {
        return f7554b;
    }
}
