package p307z6;

import android.content.res.Resources;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.w */
/* loaded from: classes4.dex */
public abstract class AbstractC10074w {
    /* renamed from: d */
    public static final void m16946d(final NavController navController, final AnswerSheetViewModel viewModel, Composer composer, final int i10) throws Resources.NotFoundException {
        int i11;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1934120872);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1934120872, i11, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.ScanFailedPage (ScanFailedPage.kt:21)");
            }
            String strStringResource = StringResources_androidKt.stringResource(R.string.manual_position_title, composerStartRestartGroup, 6);
            String strStringResource2 = StringResources_androidKt.stringResource(R.string.manual_content_desc, composerStartRestartGroup, 6);
            String strStringResource3 = StringResources_androidKt.stringResource(R.string.go_to_re_take_photo, composerStartRestartGroup, 6);
            String strStringResource4 = StringResources_androidKt.stringResource(R.string.go_to_manual_point, composerStartRestartGroup, 6);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: z6.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10074w.m16947e(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: z6.u
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10074w.m16948f(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AbstractC10055d.m16910d(strStringResource, strStringResource2, strStringResource3, strStringResource4, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z6.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10074w.m16949g(navController, viewModel, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: e */
    public static final Unit m16947e(NavController navController) {
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m16948f(NavController navController) {
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_MANUAL_POINT");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m16949g(NavController navController, AnswerSheetViewModel answerSheetViewModel, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m16946d(navController, answerSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
