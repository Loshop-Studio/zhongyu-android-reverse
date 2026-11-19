package p234s6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.evaluation.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: s6.c */
/* loaded from: classes4.dex */
public final class C9267c {

    /* renamed from: a */
    public static final C9267c f16009a = new C9267c();

    /* renamed from: b */
    public static Function2 f16010b = ComposableLambdaKt.composableLambdaInstance(109992277, false, new Function2() { // from class: s6.a
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C9267c.m15525e((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: c */
    public static Function2 f16011c = ComposableLambdaKt.composableLambdaInstance(867041100, false, new Function2() { // from class: s6.b
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C9267c.m15526f((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: e */
    public static final Unit m15525e(Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(109992277, i10, -1, "com.zykj.evaluation.ui.home.ComposableSingletons$HomeMainKt.lambda$109992277.<anonymous> (HomeMain.kt:192)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            IconKt.m18886Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.icon_search, composer, 6), (String) null, SizeKt.m17728size3ABfNKs(Modifier.INSTANCE, C3127Dp.m23561constructorimpl((11 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0L, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m15526f(Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(867041100, i10, -1, "com.zykj.evaluation.ui.home.ComposableSingletons$HomeMainKt.lambda$867041100.<anonymous> (HomeMain.kt:312)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public final Function2 m15527c() {
        return f16010b;
    }

    /* renamed from: d */
    public final Function2 m15528d() {
        return f16011c;
    }
}
