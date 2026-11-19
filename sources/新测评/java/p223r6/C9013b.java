package p223r6;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.evaluation.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p189o5.AbstractC8709e;

/* renamed from: r6.b */
/* loaded from: classes4.dex */
public final class C9013b {

    /* renamed from: a */
    public static final C9013b f15436a = new C9013b();

    /* renamed from: b */
    public static Function3 f15437b = ComposableLambdaKt.composableLambdaInstance(1177026393, false, new Function3() { // from class: r6.a
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C9013b.m15166c((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m15166c(RowScope Button, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1177026393, i10, -1, "com.zykj.evaluation.ui.guide.widget.ComposableSingletons$LeftTaskInfoViewKt.lambda$1177026393.<anonymous> (LeftTaskInfoView.kt:111)");
            }
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.no_stem_submit, composer, 6), (Modifier) null, Color.INSTANCE.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function3 m15167b() {
        return f15437b;
    }
}
