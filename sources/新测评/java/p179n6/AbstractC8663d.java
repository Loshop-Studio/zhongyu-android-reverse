package p179n6;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Unit;

/* renamed from: n6.d */
/* loaded from: classes4.dex */
public abstract class AbstractC8663d {
    /* JADX WARN: Removed duplicated region for block: B:125:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14258d(final androidx.navigation.NavController r45, final boolean r46, final boolean r47, boolean r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p179n6.AbstractC8663d.m14258d(androidx.navigation.NavController, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: e */
    public static final Unit m14259e(NavController navController) {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) != null) {
            savedStateHandle.set("SUBMIT_RESULT", "");
        }
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Unit m14260f(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final Unit m14261g(NavController navController, boolean z9, boolean z10, boolean z11, int i10, int i11, Composer composer, int i12) {
        m14258d(navController, z9, z10, z11, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
