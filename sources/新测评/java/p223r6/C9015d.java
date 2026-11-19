package p223r6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.evaluation.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: r6.d */
/* loaded from: classes4.dex */
public final class C9015d {

    /* renamed from: a */
    public static final C9015d f15438a = new C9015d();

    /* renamed from: b */
    public static Function2 f15439b = ComposableLambdaKt.composableLambdaInstance(917597199, false, new Function2() { // from class: r6.c
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C9015d.m15169c((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static final Unit m15169c(Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917597199, i10, -1, "com.zykj.evaluation.ui.guide.widget.ComposableSingletons$LeftViewsKt.lambda$917597199.<anonymous> (LeftViews.kt:136)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_progress_refresh, composer, 6), (String) null, SizeKt.m17728size3ABfNKs(Modifier.INSTANCE, C3127Dp.m23561constructorimpl((11 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Function2 m15170b() {
        return f15439b;
    }
}
