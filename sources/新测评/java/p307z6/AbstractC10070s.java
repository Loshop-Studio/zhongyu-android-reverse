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

/* renamed from: z6.s */
/* loaded from: classes4.dex */
public abstract class AbstractC10070s {
    /* renamed from: e */
    public static final void m16938e(final NavController navController, final AnswerSheetViewModel viewModel, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-613568840);
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
                ComposerKt.traceEventStart(-613568840, i11, -1, "com.zykj.evaluation.ui.sheet.preview.dialog.PageErrorPage (PageErrorPage.kt:15)");
            }
            String str = "请查看拍摄试卷页码是否为第" + (viewModel.m10203v() + 1) + "页，确认无误请选择\"继续拍摄\"，页码错误请选择\"重拍\"";
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel) | composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: z6.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10070s.m16939f(viewModel, navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: z6.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC10070s.m16941h(navController);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AbstractC10055d.m16910d("提示", str, "继续拍摄", "重拍", function0, (Function0) objRememberedValue2, composerStartRestartGroup, 3462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z6.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10070s.m16942i(navController, viewModel, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final Unit m16939f(AnswerSheetViewModel answerSheetViewModel, final NavController navController) {
        if (answerSheetViewModel instanceof NormalViewModel) {
            ((NormalViewModel) answerSheetViewModel).m10274Q0(new Function0() { // from class: z6.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC10070s.m16940g(navController);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m16940g(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m16941h(NavController navController) {
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        SavedStateHandle savedStateHandle = previousBackStackEntry != null ? previousBackStackEntry.getSavedStateHandle() : null;
        navController.popBackStack();
        if (savedStateHandle != null) {
            savedStateHandle.set("ANSWER_SHEET_KEY_BACK", "ANSWER_SHEET_KEY_BACK_RE_TAKE_PHOTO");
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m16942i(NavController navController, AnswerSheetViewModel answerSheetViewModel, int i10, Composer composer, int i11) {
        m16938e(navController, answerSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
