package p307z6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.zykj.evaluation.p057ui.sheet.AnswerSheetViewModel;
import com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.b0 */
/* loaded from: classes4.dex */
public abstract class AbstractC10053b0 {
    /* renamed from: e */
    public static final void m16902e(final NavController navController, final AnswerSheetViewModel viewModel, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1902140304);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(navController) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(viewModel) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902140304, i11, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.SerialNumErrorPage (SerialNumErrorPage.kt:15)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: z6.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10053b0.m16903f(viewModel, navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: z6.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10053b0.m16905h(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AbstractC10055d.m16910d("提示", "检测到试卷批次号不匹配，请查看拍摄的试卷是否正确，试卷确认无误请选择「继续拍摄」，试卷不匹配请选择「重拍」", "继续拍摄", "重拍", function0, (Function0) objRememberedValue2, composerStartRestartGroup, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z6.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10053b0.m16906i(navController, viewModel, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final Unit m16903f(AnswerSheetViewModel answerSheetViewModel, final NavController navController) {
        if (answerSheetViewModel instanceof NormalViewModel) {
            ((NormalViewModel) answerSheetViewModel).m10275R0(new Function0() { // from class: z6.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC10053b0.m16904g(navController);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m16904g(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m16905h(NavController navController) {
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m16906i(NavController navController, AnswerSheetViewModel answerSheetViewModel, int i10, Composer composer, int i11) {
        m16902e(navController, answerSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
