package p294x6;

import androidx.compose.foundation.ImageKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.student.dialogue.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: x6.s */
/* loaded from: classes5.dex */
public final class C9904s {

    /* renamed from: a */
    public static final C9904s f17726a = new C9904s();

    /* renamed from: b */
    public static Function2 f17727b = ComposableLambdaKt.composableLambdaInstance(-745806208, false, new Function2() { // from class: x6.r
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C9904s.m16975c((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m16975c(Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-745806208, i9, -1, "com.zykj.student.dialogue.ui.widget.ComposableSingletons$SearchContentKt.lambda$-745806208.<anonymous> (SearchContent.kt:94)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_search_clear, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function2 m16976b() {
        return f17727b;
    }
}
