package com.zykj.evaluation.p057ui.guide.normal.toCorrect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuidePageKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p101g7.AbstractC7586b;

/* loaded from: classes4.dex */
public abstract class ToCorrectGuidePageKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9881f(final androidx.navigation.NavController r20, long r21, com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuidePageKt.m9881f(androidx.navigation.NavController, long, com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuideViewModel, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuidePageKt.smali:60
    }

    /* renamed from: g */
    public static final DisposableEffectResult m9882g(final NavController navController, final ToCorrectGuideViewModel toCorrectGuideViewModel, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: o6.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ToCorrectGuidePageKt.m9883h(toCorrectGuideViewModel, navController, savedStateHandle, (String) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("SUBMIT_RESULT") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.guide.normal.toCorrect.ToCorrectGuidePageKt$ToCorrectGuidePage$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
            }
        };
    }

    /* renamed from: h */
    public static final void m9883h(ToCorrectGuideViewModel toCorrectGuideViewModel, NavController navController, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            toCorrectGuideViewModel.m9867W();
            navController.popBackStack();
            if (savedStateHandle != null) {
                savedStateHandle.set("SUBMIT_RESULT", null);
            }
        }
    }

    /* renamed from: i */
    public static final Unit m9884i(ToCorrectGuideViewModel toCorrectGuideViewModel, NavController navController) {
        NavController.navigate$default(navController, "SUBMIT/" + toCorrectGuideViewModel.m9861Q().m13234d() + "/false?SUBMIT_KEY_COMMIT_FAILED=" + toCorrectGuideViewModel.m9861Q().m13235e(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m9885j(ToCorrectGuideViewModel toCorrectGuideViewModel, NavController navController, long j10, long j11) {
        DetailBundle detailBundleM9858N = toCorrectGuideViewModel.m9858N(j11);
        if (detailBundleM9858N != null) {
            AbstractC7586b.m12450a().putParcelable("KEY_DETAIL_BUNDLE", detailBundleM9858N);
            NavController.navigate$default(navController, "DETAIL_TO_CORRECT/" + j10, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m9886k(NavController navController, long j10, ToCorrectGuideViewModel toCorrectGuideViewModel, int i10, int i11, Composer composer, int i12) {
        m9881f(navController, j10, toCorrectGuideViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
