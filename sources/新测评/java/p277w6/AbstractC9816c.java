package p277w6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.google.gson.Gson;
import com.zykj.evaluation.bean.bundle.AnswerData;
import com.zykj.evaluation.p057ui.sheet.composition.CompositionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: w6.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9816c {
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16401c(final java.lang.String r18, final androidx.navigation.NavController r19, final kotlin.jvm.functions.Function1 r20, final kotlin.jvm.functions.Function1 r21, com.zykj.evaluation.p057ui.sheet.composition.CompositionViewModel r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p277w6.AbstractC9816c.m16401c(java.lang.String, androidx.navigation.NavController, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.zykj.evaluation.ui.sheet.composition.CompositionViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: d */
    public static final Unit m16402d(NavController navController, CompositionViewModel compositionViewModel) {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("ANSWER_SHEET_RESULT_ANSWER_DATA", new Gson().toJson(new AnswerData(compositionViewModel.m10228d0(), compositionViewModel.m10227c0())));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Unit m16403e(String str, NavController navController, Function1 function1, Function1 function12, CompositionViewModel compositionViewModel, int i10, int i11, Composer composer, int i12) {
        m16401c(str, navController, function1, function12, compositionViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
