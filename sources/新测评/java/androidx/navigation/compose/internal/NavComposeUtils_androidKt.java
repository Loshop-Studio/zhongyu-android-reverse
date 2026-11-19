package androidx.navigation.compose.internal;

import androidx.activity.BackEventCompat;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.navigation.compose.internal.NavComposeUtils_androidKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata(m13557d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001aT\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052;\u0010\u0006\u001a7\b\u0001\u0012\u001d\u0012\u001b\u0012\b\u0012\u00060\u0001j\u0002`\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0007H\u0001¢\u0006\u0002\u0010\u000f\u001a\b\u0010\u0010\u001a\u00020\u0011H\u0000*\f\b\u0000\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0012"}, m13558d2 = {"BackEventCompat", "Landroidx/activity/BackEventCompat;", "PredictiveBackHandler", "", "enabled", "", "onBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/navigation/compose/internal/BackEventCompat;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "progress", "Lkotlin/coroutines/Continuation;", "", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "randomUUID", "", "navigation-compose_release"}, m13559k = 2, m13560mv = {2, 0, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class NavComposeUtils_androidKt {
    @Composable
    public static final void PredictiveBackHandler(final boolean z9, final Function2<? super Flow<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1818896922);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                z9 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818896922, i12, -1, "androidx.navigation.compose.internal.PredictiveBackHandler (NavComposeUtils.android.kt:30)");
            }
            PredictiveBackHandlerKt.PredictiveBackHandler(z9, function2, composerStartRestartGroup, i12 & 126, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: i.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavComposeUtils_androidKt.PredictiveBackHandler$lambda$0(z9, function2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PredictiveBackHandler$lambda$0(boolean z9, Function2 function2, int i10, int i11, Composer composer, int i12) {
        PredictiveBackHandler(z9, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    public static final String randomUUID() {
        return UUID.randomUUID().toString();
    }
}
