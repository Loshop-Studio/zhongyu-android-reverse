package p224q6;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.res.PainterResources_androidKt;
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

/* renamed from: q6.c */
/* loaded from: classes5.dex */
public final class C9364c {

    /* renamed from: a */
    public static final C9364c f16278a = new C9364c();

    /* renamed from: b */
    public static Function3 f16279b = ComposableLambdaKt.composableLambdaInstance(-1623738734, false, new Function3() { // from class: q6.a
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C9364c.m15340f((String) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: c */
    public static Function3 f16280c = ComposableLambdaKt.composableLambdaInstance(493567130, false, new Function3() { // from class: q6.b
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return C9364c.m15339e((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: e */
    public static final Unit m15339e(RowScope Button, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(493567130, i9, -1, "com.zykj.student.dialogue.ui.dialog.ComposableSingletons$UnderstandDialogContentKt.lambda$493567130.<anonymous> (UnderstandDialogContent.kt:133)");
            }
            TextKt.m19863Text4IGK_g("我知道了", (Modifier) null, 0L, AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3078, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m15340f(String it, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1623738734, i9, -1, "com.zykj.student.dialogue.ui.dialog.ComposableSingletons$UnderstandDialogContentKt.lambda$-1623738734.<anonymous> (UnderstandDialogContent.kt:98)");
            }
            IconKt.m19319Iconww6aTOc(PainterResources_androidKt.painterResource(R.mipmap.ic_dialogue_new, composer, 0), (String) null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m21445getUnspecified0d7_KjU(), composer, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final Function3 m15341c() {
        return f16279b;
    }

    /* renamed from: d */
    public final Function3 m15342d() {
        return f16280c;
    }
}
