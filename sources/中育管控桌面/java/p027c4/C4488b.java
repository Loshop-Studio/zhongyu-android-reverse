package p027c4;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.text.TextLayoutResult;
import androidx.compose.p009ui.text.TextStyle;
import androidx.compose.p009ui.text.font.FontFamily;
import androidx.compose.p009ui.text.font.FontStyle;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.text.style.TextAlign;
import androidx.compose.p009ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p121o3.AbstractC7518a;

/* renamed from: c4.b */
/* loaded from: classes4.dex */
public final class C4488b {

    /* renamed from: a */
    public static final C4488b f1351a = new C4488b();

    /* renamed from: b */
    public static Function3 f1352b = ComposableLambdaKt.composableLambdaInstance(-27633938, false, new Function3() { // from class: c4.a
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C4488b.m1598c((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m1598c(RowScope Button, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i6 & 17) != 16, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-27633938, i6, -1, "com.zykj.huiwei.launcher.ui.dialog.Login.ComposableSingletons$ResetPasswordDialogContentKt.lambda$-27633938.<anonymous> (ResetPasswordDialogContent.kt:158)");
            }
            TextKt.m12353Text4IGK_g("马上登录", (Modifier) null, 0L, AbstractC7518a.m8673a(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199686, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function3 m1599b() {
        return f1352b;
    }
}
