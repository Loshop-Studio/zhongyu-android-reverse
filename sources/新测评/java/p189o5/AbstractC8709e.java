package p189o5;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: o5.e */
/* loaded from: classes4.dex */
public abstract class AbstractC8709e {
    /* renamed from: e */
    public static final void m14338e(final Function2 content, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-533828911);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-533828911, i11, -1, "com.zykj.evaluation.ext.ProvideLtr (ComposeExt.kt:90)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambdaKt.rememberComposableLambda(-1983074799, true, new Function2() { // from class: o5.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8709e.m14339f(content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o5.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8709e.m14340g(content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final Unit m14339f(Function2 function2, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1983074799, i10, -1, "com.zykj.evaluation.ext.ProvideLtr.<anonymous> (ComposeExt.kt:92)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m14340g(Function2 function2, int i10, Composer composer, int i11) {
        m14338e(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final void m14341h(final Function2 content, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1811677521);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1811677521, i11, -1, "com.zykj.evaluation.ext.ProvideRtl (ComposeExt.kt:81)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Rtl), ComposableLambdaKt.rememberComposableLambda(362431633, true, new Function2() { // from class: o5.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8709e.m14342i(content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o5.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8709e.m14343j(content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: i */
    public static final Unit m14342i(Function2 function2, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(362431633, i10, -1, "com.zykj.evaluation.ext.ProvideRtl.<anonymous> (ComposeExt.kt:83)");
            }
            function2.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m14343j(Function2 function2, int i10, Composer composer, int i11) {
        m14341h(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final long m14344k(int i10) {
        float f10 = i10 / 600;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return TextUnitKt.getSp(f10 * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
    }
}
