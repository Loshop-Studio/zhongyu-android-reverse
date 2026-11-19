package p180m6;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.res.StringResources_androidKt;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.student.dialogue.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p274v6.AbstractC9768a;

/* renamed from: m6.j0 */
/* loaded from: classes5.dex */
public final class C9003j0 {

    /* renamed from: a */
    public static final C9003j0 f15125a = new C9003j0();

    /* renamed from: b */
    public static Function3 f15126b = ComposableLambdaKt.composableLambdaInstance(1690306627, false, new Function3() { // from class: m6.i0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C9003j0.m14378c((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m14378c(RowScope TextButton, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1690306627, i9, -1, "com.zykj.student.dialogue.ui.ask.ComposableSingletons$AskQuestionScreensKt.lambda$1690306627.<anonymous> (AskQuestionScreens.kt:65)");
            }
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_next_step, composer, 0), (Modifier) null, AbstractC9768a.m16549k(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200064, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function3 m14379b() {
        return f15126b;
    }
}
